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
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!ha;")
	private Class34 aClass34_3;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private int anInt1125 = 0;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt1132 = 0;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!da;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!da;)V")
	public Class23(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class14 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass14_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method731();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V")
	public void method726(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean48) {
			return;
		}
		if (this.aBoolean47) {
			this.aBoolean47 = false;
			throw new IOException();
		}
		if (this.aByteArray18 == null) {
			this.aByteArray18 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray18[this.anInt1125] = arg1[local36];
				this.anInt1125 = (this.anInt1125 + 1) % 5000;
				if ((this.anInt1132 + 4900) % 5000 == this.anInt1125) {
					throw new IOException();
				}
			}
			if (this.aClass34_3 == null) {
				this.aClass34_3 = this.aClass14_1.method625(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1125 == this.anInt1132) {
							if (this.aBoolean48) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1132;
						if (this.anInt1125 >= this.anInt1132) {
							local44 = this.anInt1125 - this.anInt1132;
						} else {
							local44 = 5000 - this.anInt1132;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray18, local28, local44);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean47 = true;
					}
					this.anInt1132 = (local44 + this.anInt1132) % 5000;
					try {
						if (this.anInt1132 == this.anInt1125) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean47 = true;
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
				this.aByteArray18 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static107.method1977(local122, null);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[BII)V")
	public void method729(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean48) {
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

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method731() {
		if (this.aBoolean48) {
			return;
		}
		synchronized (this) {
			this.aBoolean48 = true;
			this.notifyAll();
		}
		if (this.aClass34_3 != null) {
			while (this.aClass34_3.anInt1727 == 0) {
				Static135.method2569(1L);
			}
			if (this.aClass34_3.anInt1727 == 1) {
				try {
					((Thread) this.aClass34_3.anObject1).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass34_3 = null;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)I")
	public int method732() throws IOException {
		return this.aBoolean48 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public int method734() throws IOException {
		return this.aBoolean48 ? 0 : this.anInputStream1.read();
	}
}
