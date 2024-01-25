import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class147 implements Runnable {

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "Lclient!fo;")
	private Class129 aClass129_6;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	private int anInt3729 = 0;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Z")
	private boolean aBoolean292 = false;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	private int anInt3738 = 0;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "Z")
	private boolean aBoolean293 = false;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!lu;")
	private final Class231 aClass231_1;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	private final int anInt3736;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lu;I)V")
	public Class147(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket1 = arg0;
		this.aClass231_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
		this.anInt3736 = arg2;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public void method3210() {
		if (!this.aBoolean293) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public void method3211() throws IOException {
		if (!this.aBoolean293 && this.aBoolean292) {
			this.aBoolean292 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[BIB)V")
	public void method3212(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean293) {
			return;
		}
		if (this.aBoolean292) {
			this.aBoolean292 = false;
			throw new IOException();
		}
		if (this.aByteArray29 == null) {
			this.aByteArray29 = new byte[this.anInt3736];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
				this.aByteArray29[this.anInt3729] = arg0[local39];
				this.anInt3729 = (this.anInt3729 + 1) % this.anInt3736;
				if ((this.anInt3736 + this.anInt3738 - 100) % this.anInt3736 == this.anInt3729) {
					throw new IOException();
				}
			}
			if (this.aClass129_6 == null) {
				this.aClass129_6 = this.aClass231_1.method5297(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)I")
	public int method3213() throws IOException {
		return this.aBoolean293 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!go", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt3738 == this.anInt3729) {
							if (this.aBoolean293) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt3738;
						if (this.anInt3738 <= this.anInt3729) {
							local40 = this.anInt3729 - this.anInt3738;
						} else {
							local40 = this.anInt3736 - this.anInt3738;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray29, local28, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean292 = true;
					}
					this.anInt3738 = (this.anInt3738 + local40) % this.anInt3736;
					try {
						if (this.anInt3729 == this.anInt3738) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean292 = true;
					}
					continue;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray29 = null;
				break;
			}
		} catch (@Pc(120) Exception local120) {
			Static81.method1711((String) null, local120);
		}
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3216();
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)I")
	public int method3214() throws IOException {
		return this.aBoolean293 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[BII)V")
	public void method3215(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean293) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 -= local20;
			arg2 += local20;
		}
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(B)V")
	public void method3216() {
		if (this.aBoolean293) {
			return;
		}
		synchronized (this) {
			this.aBoolean293 = true;
			this.notifyAll();
		}
		if (this.aClass129_6 != null) {
			while (this.aClass129_6.anInt3299 == 0) {
				Static365.method3472(1L);
			}
			if (this.aClass129_6.anInt3299 == 1) {
				try {
					((Thread) this.aClass129_6.anObject7).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass129_6 = null;
	}
}
