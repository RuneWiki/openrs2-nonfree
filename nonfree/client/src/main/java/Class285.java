import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class285 implements Runnable {

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!vfa;")
	private Class347 aClass347_4;

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
	private int anInt7931 = 0;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "I")
	private int anInt7933 = 0;

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "Lclient!rj;")
	private final Class287 aClass287_7;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rj;)V")
	public Class285(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class287 arg1) throws IOException {
		this.aClass287_7 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)I")
	public int method6496() throws IOException {
		return this.aBoolean625 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!rfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt7933 == this.anInt7931) {
							if (this.aBoolean625) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt7931;
						if (this.anInt7933 >= this.anInt7931) {
							local40 = this.anInt7933 - this.anInt7931;
						} else {
							local40 = 5000 - this.anInt7931;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray75, local28, local40);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean626 = true;
					}
					this.anInt7931 = (this.anInt7931 + local40) % 5000;
					try {
						if (this.anInt7933 == this.anInt7931) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean626 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray75 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static58.method946(null, local114);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	public void method6497() {
		if (!this.aBoolean625) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6502();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[BII)V")
	public void method6499(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean625) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg1, arg0, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg2 -= local14;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIB[B)V")
	public void method6501(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean625) {
			return;
		}
		if (this.aBoolean626) {
			this.aBoolean626 = false;
			throw new IOException();
		}
		if (this.aByteArray75 == null) {
			this.aByteArray75 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray75[this.anInt7933] = arg1[local32];
				this.anInt7933 = (this.anInt7933 + 1) % 5000;
				if (this.anInt7933 == (this.anInt7931 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass347_4 == null) {
				this.aClass347_4 = this.aClass287_7.method6533(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public void method6502() {
		if (this.aBoolean625) {
			return;
		}
		synchronized (this) {
			this.aBoolean625 = true;
			this.notifyAll();
		}
		if (this.aClass347_4 != null) {
			while (this.aClass347_4.anInt9172 == 0) {
				Static459.method6498(1L);
			}
			if (this.aClass347_4.anInt9172 == 1) {
				try {
					((Thread) this.aClass347_4.anObject49).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass347_4 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
	public void method6503() throws IOException {
		if (!this.aBoolean625 && this.aBoolean626) {
			this.aBoolean626 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(I)I")
	public int method6504() throws IOException {
		return this.aBoolean625 ? 0 : this.anInputStream2.available();
	}
}
