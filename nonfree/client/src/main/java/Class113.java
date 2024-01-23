import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class113 implements Runnable {

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Lclient!o;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
	private int anInt3763 = 0;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	private int anInt3761 = 0;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!wa;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!wa;)V")
	public Class113(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class175 arg1) throws IOException {
		this.aClass175_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!nj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(37) int var1;
				@Pc(48) int var2;
				label88: {
					synchronized (this) {
						label89: {
							if (this.anInt3763 == this.anInt3761) {
								if (this.aBoolean283) {
									break label89;
								}
								try {
									this.wait();
								} catch (@Pc(22) InterruptedException local22) {
								}
							}
							if (this.anInt3761 < this.anInt3763) {
								var1 = 5000 - this.anInt3763;
							} else {
								var1 = this.anInt3761 - this.anInt3763;
							}
							var2 = this.anInt3763;
							break label88;
						}
					}
					try {
						if (this.anInputStream1 != null) {
							this.anInputStream1.close();
						}
						if (this.anOutputStream1 != null) {
							this.anOutputStream1.close();
						}
						if (this.aSocket1 != null) {
							this.aSocket1.close();
						}
					} catch (@Pc(119) IOException local119) {
					}
					this.aByteArray50 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray50, var2, var1);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean284 = true;
					}
					this.anInt3763 = (var1 + this.anInt3763) % 5000;
					try {
						if (this.anInt3763 == this.anInt3761) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean284 = true;
					}
				}
			}
		} catch (@Pc(124) Exception local124) {
			Static3.method136(null, local124);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	public int method3012() throws IOException {
		return this.aBoolean283 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)I")
	public int method3014() throws IOException {
		return this.aBoolean283 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)V")
	public void method3015(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean283) {
			return;
		}
		while (arg1 > 0) {
			@Pc(25) int local25 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local25 <= 0) {
				throw new EOFException();
			}
			arg2 += local25;
			arg1 -= local25;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[B)V")
	public void method3017(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean283) {
			return;
		}
		if (this.aBoolean284) {
			this.aBoolean284 = false;
			throw new IOException();
		}
		if (this.aByteArray50 == null) {
			this.aByteArray50 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
				this.aByteArray50[this.anInt3761] = arg1[local35];
				this.anInt3761 = (this.anInt3761 + 1) % 5000;
				if ((this.anInt3763 + 4900) % 5000 == this.anInt3761) {
					throw new IOException();
				}
			}
			if (this.aClass116_1 == null) {
				this.aClass116_1 = this.aClass175_2.method4320(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public void method3018() throws IOException {
		if (!this.aBoolean283 && this.aBoolean284) {
			this.aBoolean284 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
	public void method3019() {
		if (this.aBoolean283) {
			return;
		}
		synchronized (this) {
			this.aBoolean283 = true;
			this.notifyAll();
		}
		if (this.aClass116_1 != null) {
			while (this.aClass116_1.anInt3812 == 0) {
				Static48.method934(1L);
			}
			if (this.aClass116_1.anInt3812 == 1) {
				try {
					((Thread) this.aClass116_1.anObject5).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass116_1 = null;
	}

	@OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3019();
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
	public void method3020() {
		if (!this.aBoolean283) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
