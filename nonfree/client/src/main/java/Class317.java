import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class317 implements Runnable {

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "[B")
	private byte[] aByteArray116;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "Lclient!oc;")
	private Class212 aClass212_8;

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
	private boolean aBoolean678 = false;

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
	private int anInt9257 = 0;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "Z")
	private boolean aBoolean679 = false;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
	private int anInt9264 = 0;

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "Lclient!tq;")
	private final Class285 aClass285_17;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!tq;)V")
	public Class317(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class285 arg1) throws IOException {
		this.aClass285_17 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!wda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt9264 == this.anInt9257) {
							if (this.aBoolean679) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt9264;
						if (this.anInt9264 <= this.anInt9257) {
							local40 = this.anInt9257 - this.anInt9264;
						} else {
							local40 = 5000 - this.anInt9264;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray116, local28, local40);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean678 = true;
					}
					this.anInt9264 = (local40 + this.anInt9264) % 5000;
					try {
						if (this.anInt9257 == this.anInt9264) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean678 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray116 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static2.method220(local118, null);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([BIIB)V")
	public void method7650(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean679) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg1 += local14;
		}
	}

	@OriginalMember(owner = "client!wda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7656();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)I")
	public int method7651() throws IOException {
		return this.aBoolean679 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I")
	public int method7652() throws IOException {
		return this.aBoolean679 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II[BI)V")
	public void method7653(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean679) {
			return;
		}
		if (this.aBoolean678) {
			this.aBoolean678 = false;
			throw new IOException();
		}
		if (this.aByteArray116 == null) {
			this.aByteArray116 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray116[this.anInt9257] = arg1[local32];
				this.anInt9257 = (this.anInt9257 + 1) % 5000;
				if ((this.anInt9264 + 4900) % 5000 == this.anInt9257) {
					throw new IOException();
				}
			}
			if (this.aClass212_8 == null) {
				this.aClass212_8 = this.aClass285_17.method7050(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
	public void method7654() throws IOException {
		if (!this.aBoolean679 && this.aBoolean678) {
			this.aBoolean678 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)V")
	public void method7656() {
		if (this.aBoolean679) {
			return;
		}
		synchronized (this) {
			this.aBoolean679 = true;
			this.notifyAll();
		}
		if (this.aClass212_8 != null) {
			while (this.aClass212_8.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (this.aClass212_8.anInt6547 == 1) {
				try {
					((Thread) this.aClass212_8.anObject13).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass212_8 = null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	public void method7657() {
		if (!this.aBoolean679) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}
}
