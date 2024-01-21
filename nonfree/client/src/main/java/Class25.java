import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!cd;")
	private Class15 aClass15_5;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt1031 = 0;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt1026 = 0;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Lclient!a;")
	private final Class1 aClass1_2;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!a;)V")
	public Class25(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class1 arg1) throws IOException {
		this.aClass1_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method796() {
		if (this.aBoolean56) {
			return;
		}
		synchronized (this) {
			this.aBoolean56 = true;
			this.notifyAll();
		}
		if (this.aClass15_5 != null) {
			while (this.aClass15_5.anInt624 == 0) {
				Static119.method2069(1L);
			}
			if (this.aClass15_5.anInt624 == 1) {
				try {
					((Thread) this.aClass15_5.anObject1).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass15_5 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public int method798() throws IOException {
		return this.aBoolean56 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V")
	public void method800(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean56) {
			return;
		}
		if (this.aBoolean57) {
			this.aBoolean57 = false;
			throw new IOException();
		}
		if (this.aByteArray15 == null) {
			this.aByteArray15 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray15[this.anInt1031] = arg0[local32];
				this.anInt1031 = (this.anInt1031 + 1) % 5000;
				if ((this.anInt1026 + 4900) % 5000 == this.anInt1031) {
					throw new IOException();
				}
			}
			if (this.aClass15_5 == null) {
				this.aClass15_5 = this.aClass1_2.method8(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method796();
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public int method802() throws IOException {
		return this.aBoolean56 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1026 == this.anInt1031) {
							if (this.aBoolean56) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1026 <= this.anInt1031) {
							local41 = this.anInt1031 - this.anInt1026;
						} else {
							local41 = 5000 - this.anInt1026;
						}
						local52 = this.anInt1026;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray15, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean57 = true;
					}
					this.anInt1026 = (this.anInt1026 + local41) % 5000;
					try {
						if (this.anInt1026 == this.anInt1031) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean57 = true;
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
				this.aByteArray15 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static188.method2856(null, local122);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BII)V")
	public void method804(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean56) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg1 += local14;
		}
	}
}
