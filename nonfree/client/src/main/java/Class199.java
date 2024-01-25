import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class199 implements Runnable {

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!jk;")
	private Class128 aClass128_7;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "[B")
	private byte[] aByteArray156;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	private int anInt5510 = 0;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	private int anInt5519 = 0;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "Lclient!js;")
	private final Class131 aClass131_5;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!js;)V")
	public Class199(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class131 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass131_5 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	public int method4483() throws IOException {
		return this.aBoolean476 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIII)V")
	public void method4484(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean476) {
			return;
		}
		if (this.aBoolean477) {
			this.aBoolean477 = false;
			throw new IOException();
		}
		if (this.aByteArray156 == null) {
			this.aByteArray156 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray156[this.anInt5510] = arg0[local32];
				this.anInt5510 = (this.anInt5510 + 1) % 5000;
				if (this.anInt5510 == (this.anInt5519 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass128_7 == null) {
				this.aClass128_7 = this.aClass131_5.method3045(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public void method4486() throws IOException {
		if (!this.aBoolean476 && this.aBoolean477) {
			this.aBoolean477 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public void method4487() {
		if (!this.aBoolean476) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BIB)V")
	public void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean476) {
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

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public void method4490() {
		if (this.aBoolean476) {
			return;
		}
		synchronized (this) {
			this.aBoolean476 = true;
			this.notifyAll();
		}
		if (this.aClass128_7 != null) {
			while (this.aClass128_7.anInt3727 == 0) {
				Static443.method5991(1L);
			}
			if (this.aClass128_7.anInt3727 == 1) {
				try {
					((Thread) this.aClass128_7.anObject4).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass128_7 = null;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
	public int method4491() throws IOException {
		return this.aBoolean476 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(46) int local46;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt5510 == this.anInt5519) {
							if (this.aBoolean476) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt5519;
						if (this.anInt5510 < this.anInt5519) {
							local46 = 5000 - this.anInt5519;
						} else {
							local46 = this.anInt5510 - this.anInt5519;
						}
					}
					if (local46 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray156, local32, local46);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean477 = true;
					}
					this.anInt5519 = (local46 + this.anInt5519) % 5000;
					try {
						if (this.anInt5510 == this.anInt5519) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean477 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray156 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static80.method1410(local126, null);
		}
	}

	@OriginalMember(owner = "client!qe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4490();
	}
}
