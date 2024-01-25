import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class240 implements Runnable {

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "[I")
	public static final int[] anIntArray677 = new int[256];

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!vs;")
	private Class311 aClass311_6;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	private int anInt6936 = 0;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private int anInt6937 = 0;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Lclient!pq;")
	private final Class229 aClass229_13;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray677[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pq;)V")
	public Class240(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class229 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass229_13 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method6259() {
		if (!this.aBoolean513) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public void method6260() {
		if (this.aBoolean513) {
			return;
		}
		synchronized (this) {
			this.aBoolean513 = true;
			this.notifyAll();
		}
		if (this.aClass311_6 != null) {
			while (this.aClass311_6.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (this.aClass311_6.anInt9169 == 1) {
				try {
					((Thread) this.aClass311_6.anObject17).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass311_6 = null;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	public void method6262() throws IOException {
		if (!this.aBoolean513 && this.aBoolean514) {
			this.aBoolean514 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)V")
	public void method6263(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean513) {
			return;
		}
		while (arg1 > 0) {
			@Pc(24) int local24 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg1 -= local24;
			arg2 += local24;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I")
	public int method6264() throws IOException {
		return this.aBoolean513 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([BIII)V")
	public void method6266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean513) {
			return;
		}
		if (this.aBoolean514) {
			this.aBoolean514 = false;
			throw new IOException();
		}
		if (this.aByteArray97 == null) {
			this.aByteArray97 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray97[this.anInt6937] = arg0[local36];
				this.anInt6937 = (this.anInt6937 + 1) % 5000;
				if ((this.anInt6936 + 4900) % 5000 == this.anInt6937) {
					throw new IOException();
				}
			}
			if (this.aClass311_6 == null) {
				this.aClass311_6 = this.aClass229_13.method6060(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt6936 == this.anInt6937) {
							if (this.aBoolean513) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt6936;
						if (this.anInt6937 >= this.anInt6936) {
							local40 = this.anInt6937 - this.anInt6936;
						} else {
							local40 = 5000 - this.anInt6936;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray97, local24, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean514 = true;
					}
					this.anInt6936 = (this.anInt6936 + local40) % 5000;
					try {
						if (this.anInt6937 == this.anInt6936) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean514 = true;
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
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray97 = null;
				break;
			}
		} catch (@Pc(120) Exception local120) {
			Static25.method773(local120, null);
		}
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6260();
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)I")
	public int method6268() throws IOException {
		return this.aBoolean513 ? 0 : this.anInputStream2.read();
	}
}
