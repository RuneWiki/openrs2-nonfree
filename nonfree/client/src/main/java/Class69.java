import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class69 implements Runnable {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!cf;")
	private Class16 aClass16_8;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	private int anInt2572 = 0;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private int anInt2575 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Lclient!fe;")
	private final Class29 aClass29_49;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!fe;)V")
	public Class69(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class29 arg1) throws IOException {
		this.aClass29_49 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[B)V")
	public void method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean126) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg1 += local14;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)I")
	public int method1858() throws IOException {
		return this.aBoolean126 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(32) int local32;
					@Pc(44) int local44;
					synchronized (this) {
						if (this.anInt2572 == this.anInt2575) {
							if (this.aBoolean126) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt2572 < this.anInt2575) {
							local32 = 5000 - this.anInt2575;
						} else {
							local32 = this.anInt2572 - this.anInt2575;
						}
						local44 = this.anInt2575;
					}
					if (local32 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray31, local44, local32);
					} catch (@Pc(61) IOException local61) {
						this.aBoolean127 = true;
					}
					this.anInt2575 = (this.anInt2575 + local32) % 5000;
					try {
						if (this.anInt2572 == this.anInt2575) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(82) IOException local82) {
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
				} catch (@Pc(106) IOException local106) {
				}
				this.aByteArray31 = null;
				break;
			}
		} catch (@Pc(111) Exception local111) {
			Static77.method1294(local111, null);
		}
	}

	@OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1859();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method1859() {
		if (this.aBoolean126) {
			return;
		}
		synchronized (this) {
			this.aBoolean126 = true;
			this.notifyAll();
		}
		if (this.aClass16_8 != null) {
			while (this.aClass16_8.anInt441 == 0) {
				Static125.method2177(1L);
			}
			if (this.aClass16_8.anInt441 == 1) {
				try {
					((Thread) this.aClass16_8.anObject2).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass16_8 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[BI)V")
	public void method1860(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean126) {
			return;
		}
		if (this.aBoolean127) {
			this.aBoolean127 = false;
			throw new IOException();
		}
		if (this.aByteArray31 == null) {
			this.aByteArray31 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray31[this.anInt2572] = arg1[local36];
				this.anInt2572 = (this.anInt2572 + 1) % 5000;
				if (this.anInt2572 == (this.anInt2575 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass16_8 == null) {
				this.aClass16_8 = this.aClass29_49.method607(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
	public int method1863() throws IOException {
		return this.aBoolean126 ? 0 : this.anInputStream1.available();
	}
}
