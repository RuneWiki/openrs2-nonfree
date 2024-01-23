import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class158 implements Runnable {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!oh;")
	private Class123 aClass123_6;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	private int anInt4732 = 0;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
	private boolean aBoolean308 = false;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	private int anInt4737 = 0;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!tk;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!tk;)V")
	public Class158(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class164 arg1) throws IOException {
		this.aClass164_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)I")
	public int method3774() throws IOException {
		return this.aBoolean308 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!sm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(37) int var1;
				@Pc(49) int var2;
				label87: {
					synchronized (this) {
						label88: {
							if (this.anInt4737 == this.anInt4732) {
								if (this.aBoolean308) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(26) InterruptedException local26) {
								}
							}
							if (this.anInt4737 > this.anInt4732) {
								var1 = 5000 - this.anInt4737;
							} else {
								var1 = this.anInt4732 - this.anInt4737;
							}
							var2 = this.anInt4737;
							break label87;
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
					} catch (@Pc(116) IOException local116) {
					}
					this.aByteArray64 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray64, var2, var1);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean309 = true;
					}
					this.anInt4737 = (var1 + this.anInt4737) % 5000;
					try {
						if (this.anInt4732 == this.anInt4737) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean309 = true;
					}
				}
			}
		} catch (@Pc(121) Exception local121) {
			Static244.method3721(null, local121);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[B)V")
	public void method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean308) {
			return;
		}
		while (arg1 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg1 -= local24;
			arg0 += local24;
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)I")
	public int method3777() throws IOException {
		return this.aBoolean308 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!sm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3779();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	public void method3778() {
		if (!this.aBoolean308) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V")
	public void method3779() {
		if (this.aBoolean308) {
			return;
		}
		synchronized (this) {
			this.aBoolean308 = true;
			this.notifyAll();
		}
		if (this.aClass123_6 != null) {
			while (this.aClass123_6.anInt3791 == 0) {
				Static122.method2061(1L);
			}
			if (this.aClass123_6.anInt3791 == 1) {
				try {
					((Thread) this.aClass123_6.anObject4).join();
				} catch (@Pc(63) InterruptedException local63) {
				}
			}
		}
		this.aClass123_6 = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([BIZI)V")
	public void method3780(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean308) {
			return;
		}
		if (this.aBoolean309) {
			this.aBoolean309 = false;
			throw new IOException();
		}
		if (this.aByteArray64 == null) {
			this.aByteArray64 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				this.aByteArray64[this.anInt4732] = arg0[local41];
				this.anInt4732 = (this.anInt4732 + 1) % 5000;
				if ((this.anInt4737 + 4900) % 5000 == this.anInt4732) {
					throw new IOException();
				}
			}
			if (this.aClass123_6 == null) {
				this.aClass123_6 = this.aClass164_5.method3952(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	public void method3781() throws IOException {
		if (!this.aBoolean308 && this.aBoolean309) {
			this.aBoolean309 = false;
			throw new IOException();
		}
	}
}
