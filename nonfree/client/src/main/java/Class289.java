import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class289 implements Runnable {

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[32896];

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Lclient!rb;")
	private Class297 aClass297_7;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
	private boolean aBoolean594 = false;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	private int anInt8309 = 0;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	private int anInt8307 = 0;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
	private boolean aBoolean595 = false;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "Lclient!kj;")
	private final Class202 aClass202_7;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	private final int anInt8311;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray80[local10++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kj;I)V")
	public Class289(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass202_7 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt8311 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	public int method7055() throws IOException {
		return this.aBoolean595 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7061();
	}

	@OriginalMember(owner = "client!qm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt8307 == this.anInt8309) {
							if (this.aBoolean595) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt8309;
						if (this.anInt8307 >= this.anInt8309) {
							local43 = this.anInt8307 - this.anInt8309;
						} else {
							local43 = this.anInt8311 - this.anInt8309;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray79, local32, local43);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean594 = true;
					}
					this.anInt8309 = (local43 + this.anInt8309) % this.anInt8311;
					try {
						if (this.anInt8307 == this.anInt8309) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean594 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray79 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static17.method268((String) null, local122);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	public int method7056() throws IOException {
		return this.aBoolean595 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([BIII)V")
	public void method7057(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean595) {
			return;
		}
		if (this.aBoolean594) {
			this.aBoolean594 = false;
			throw new IOException();
		}
		if (this.aByteArray79 == null) {
			this.aByteArray79 = new byte[this.anInt8311];
		}
		synchronized (this) {
			for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
				this.aByteArray79[this.anInt8307] = arg0[local31];
				this.anInt8307 = (this.anInt8307 + 1) % this.anInt8311;
				if ((this.anInt8309 + this.anInt8311 - 100) % this.anInt8311 == this.anInt8307) {
					throw new IOException();
				}
			}
			if (this.aClass297_7 == null) {
				this.aClass297_7 = this.aClass202_7.method4737(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public void method7058() {
		if (!this.aBoolean595) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	public void method7060() throws IOException {
		if (!this.aBoolean595 && this.aBoolean594) {
			this.aBoolean594 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	public void method7061() {
		if (this.aBoolean595) {
			return;
		}
		synchronized (this) {
			this.aBoolean595 = true;
			this.notifyAll();
		}
		if (this.aClass297_7 != null) {
			while (this.aClass297_7.anInt8459 == 0) {
				Static127.method1985(1L);
			}
			if (this.aClass297_7.anInt8459 == 1) {
				try {
					((Thread) this.aClass297_7.anObject15).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass297_7 = null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[B)V")
	public void method7062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean595) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 += local19;
			arg0 -= local19;
		}
	}
}
