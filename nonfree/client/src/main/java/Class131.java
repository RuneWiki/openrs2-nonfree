import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!tc;")
	private Class232 aClass232_4;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
	private int anInt3605 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Z")
	private boolean aBoolean415 = false;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	private int anInt3604 = 0;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ke", name = "u", descriptor = "Lclient!fq;")
	private final Class83 aClass83_4;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!fq;)V")
	public Class131(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class83 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass83_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[BII)V")
	public void method2928(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean415) {
			return;
		}
		if (this.aBoolean414) {
			this.aBoolean414 = false;
			throw new IOException();
		}
		if (this.aByteArray43 == null) {
			this.aByteArray43 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray43[this.anInt3605] = arg0[local32];
				this.anInt3605 = (this.anInt3605 + 1) % 5000;
				if ((this.anInt3604 + 4900) % 5000 == this.anInt3605) {
					throw new IOException();
				}
			}
			if (this.aClass232_4 == null) {
				this.aClass232_4 = this.aClass83_4.method1865(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII[B)V")
	public void method2929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean415) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public void method2930() throws IOException {
		if (!this.aBoolean415 && this.aBoolean414) {
			this.aBoolean414 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2933();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method2931() {
		if (!this.aBoolean415) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ke", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt3605 == this.anInt3604) {
							if (this.aBoolean415) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt3605 >= this.anInt3604) {
							local41 = this.anInt3605 - this.anInt3604;
						} else {
							local41 = 5000 - this.anInt3604;
						}
						local52 = this.anInt3604;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray43, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean414 = true;
					}
					this.anInt3604 = (local41 + this.anInt3604) % 5000;
					try {
						if (this.anInt3604 == this.anInt3605) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean414 = true;
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
				this.aByteArray43 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static55.method972(local126, null);
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
	public int method2932() throws IOException {
		return this.aBoolean415 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public void method2933() {
		if (this.aBoolean415) {
			return;
		}
		synchronized (this) {
			this.aBoolean415 = true;
			this.notifyAll();
		}
		if (this.aClass232_4 != null) {
			while (this.aClass232_4.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (this.aClass232_4.anInt6402 == 1) {
				try {
					((Thread) this.aClass232_4.anObject8).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass232_4 = null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)I")
	public int method2934() throws IOException {
		return this.aBoolean415 ? 0 : this.anInputStream1.read();
	}
}
