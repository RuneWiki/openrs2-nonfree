import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class27 implements Runnable {

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!fa;")
	private Class19 aClass19_5;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	private int anInt1036 = 0;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	private int anInt1038 = 0;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "Lclient!s;")
	private final Class55 aClass55_2;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!s;)V")
	public Class27(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class55 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass55_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)I")
	public int method608() throws IOException {
		return this.aBoolean48 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method610();
	}

	@OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1036 == this.anInt1038) {
							if (this.aBoolean48) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1036;
						if (this.anInt1038 >= this.anInt1036) {
							local44 = this.anInt1038 - this.anInt1036;
						} else {
							local44 = 5000 - this.anInt1036;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray3, local28, local44);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean49 = true;
					}
					this.anInt1036 = (local44 + this.anInt1036) % 5000;
					try {
						if (this.anInt1036 == this.anInt1038) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean49 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray3 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static99.method1580(null, local123);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI[BI)V")
	public void method609(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean48) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method610() {
		if (this.aBoolean48) {
			return;
		}
		synchronized (this) {
			this.aBoolean48 = true;
			this.notifyAll();
		}
		if (this.aClass19_5 != null) {
			while (this.aClass19_5.anInt879 == 0) {
				Static93.method1123(1L);
			}
			if (this.aClass19_5.anInt879 == 1) {
				try {
					((Thread) this.aClass19_5.anObject2).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass19_5 = null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)I")
	public int method612() throws IOException {
		return this.aBoolean48 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIIZ)V")
	public void method613(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean48) {
			return;
		}
		if (this.aBoolean49) {
			this.aBoolean49 = false;
			throw new IOException();
		}
		if (this.aByteArray3 == null) {
			this.aByteArray3 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray3[this.anInt1038] = arg0[local36];
				this.anInt1038 = (this.anInt1038 + 1) % 5000;
				if (this.anInt1038 == (this.anInt1036 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass19_5 == null) {
				this.aClass19_5 = this.aClass55_2.method1404(this, 3);
			}
			this.notifyAll();
		}
	}
}
