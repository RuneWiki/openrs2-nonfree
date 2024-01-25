import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class277 implements Runnable {

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!kp;")
	private Class192 aClass192_8;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	private int anInt7288 = 0;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
	private int anInt7292 = 0;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!n;")
	private final Class221 aClass221_8;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!n;)V")
	public Class277(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class221 arg1) throws IOException {
		this.aClass221_8 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!qt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6187();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)I")
	public int method6181() throws IOException {
		return this.aBoolean574 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "([BIII)V")
	public void method6182(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean574) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
	public int method6183() throws IOException {
		return this.aBoolean574 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt7288 == this.anInt7292) {
							if (this.aBoolean574) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt7292 > this.anInt7288) {
							local44 = 5000 - this.anInt7292;
						} else {
							local44 = this.anInt7288 - this.anInt7292;
						}
						local56 = this.anInt7292;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray87, local56, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean573 = true;
					}
					this.anInt7292 = (this.anInt7292 + local44) % 5000;
					try {
						if (this.anInt7288 == this.anInt7292) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean573 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray87 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static379.method5607(null, local123);
		}
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
	public void method6184() throws IOException {
		if (!this.aBoolean574 && this.aBoolean573) {
			this.aBoolean573 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[BIB)V")
	public void method6185(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean574) {
			return;
		}
		if (this.aBoolean573) {
			this.aBoolean573 = false;
			throw new IOException();
		}
		if (this.aByteArray87 == null) {
			this.aByteArray87 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray87[this.anInt7288] = arg1[local32];
				this.anInt7288 = (this.anInt7288 + 1) % 5000;
				if (this.anInt7288 == (this.anInt7292 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass192_8 == null) {
				this.aClass192_8 = this.aClass221_8.method5198(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
	public void method6186() {
		if (!this.aBoolean574) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)V")
	public void method6187() {
		if (this.aBoolean574) {
			return;
		}
		synchronized (this) {
			this.aBoolean574 = true;
			this.notifyAll();
		}
		if (this.aClass192_8 != null) {
			while (this.aClass192_8.anInt5186 == 0) {
				Static374.method5521(1L);
			}
			if (this.aClass192_8.anInt5186 == 1) {
				try {
					((Thread) this.aClass192_8.anObject30).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass192_8 = null;
	}
}
