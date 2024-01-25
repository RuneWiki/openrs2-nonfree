import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class61 implements Runnable {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!id;")
	private Class99 aClass99_3;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	private int anInt1717 = 0;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	private int anInt1720 = 0;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!bd;")
	private final Class21 aClass21_3;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bd;)V")
	public Class61(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class21 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass21_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1376();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public int method1372() throws IOException {
		return this.aBoolean129 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V")
	public void method1373(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean129) {
			return;
		}
		while (arg2 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 += local20;
			arg2 -= local20;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public void method1376() {
		if (this.aBoolean129) {
			return;
		}
		synchronized (this) {
			this.aBoolean129 = true;
			this.notifyAll();
		}
		if (this.aClass99_3 != null) {
			while (this.aClass99_3.anInt2836 == 0) {
				Static129.method2634(1L);
			}
			if (this.aClass99_3.anInt2836 == 1) {
				try {
					((Thread) this.aClass99_3.anObject2).join();
				} catch (@Pc(47) InterruptedException local47) {
				}
			}
		}
		this.aClass99_3 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIII)V")
	public void method1377(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean129) {
			return;
		}
		if (this.aBoolean127) {
			this.aBoolean127 = false;
			throw new IOException();
		}
		if (this.aByteArray22 == null) {
			this.aByteArray22 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
				this.aByteArray22[this.anInt1720] = arg0[local34];
				this.anInt1720 = (this.anInt1720 + 1) % 5000;
				if ((this.anInt1717 + 4900) % 5000 == this.anInt1720) {
					throw new IOException();
				}
			}
			if (this.aClass99_3 == null) {
				this.aClass99_3 = this.aClass21_3.method375(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1717 == this.anInt1720) {
							if (this.aBoolean129) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt1720 < this.anInt1717) {
							local40 = 5000 - this.anInt1717;
						} else {
							local40 = this.anInt1720 - this.anInt1717;
						}
						local52 = this.anInt1717;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray22, local52, local40);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean127 = true;
					}
					this.anInt1717 = (local40 + this.anInt1717) % 5000;
					try {
						if (this.anInt1720 == this.anInt1717) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean127 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray22 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static46.method1056(null, local122);
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public void method1381() {
		if (!this.aBoolean129) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I")
	public int method1382() throws IOException {
		return this.aBoolean129 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public void method1383() throws IOException {
		if (!this.aBoolean129 && this.aBoolean127) {
			this.aBoolean127 = false;
			throw new IOException();
		}
	}
}
