import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class284 implements Runnable {

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[16384];

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[16384];

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "Lclient!ae;")
	private Class5 aClass5_9;

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
	private int anInt6989 = 0;

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "Z")
	private boolean aBoolean572 = false;

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "I")
	private int anInt6990 = 0;

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "Lclient!ew;")
	private final Class99 aClass99_6;

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "I")
	private final int anInt6988;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray62[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray63[local11] = (float) Math.cos(local9 * (double) local11);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ew;I)V")
	public Class284(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass99_6 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt6988 = arg2;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)I")
	public int method5705() throws IOException {
		return this.aBoolean572 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(45) int local45;
					synchronized (this) {
						if (this.anInt6989 == this.anInt6990) {
							if (this.aBoolean572) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt6989 <= this.anInt6990) {
							local33 = this.anInt6990 - this.anInt6989;
						} else {
							local33 = this.anInt6988 - this.anInt6989;
						}
						local45 = this.anInt6989;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray66, local45, local33);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean573 = true;
					}
					this.anInt6989 = (local33 + this.anInt6989) % this.anInt6988;
					try {
						if (this.anInt6990 == this.anInt6989) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(87) IOException local87) {
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
				} catch (@Pc(111) IOException local111) {
				}
				this.aByteArray66 = null;
				break;
			}
		} catch (@Pc(116) Exception local116) {
			Static357.method5094(local116, null);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V")
	public void method5707() {
		if (!this.aBoolean572) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5710();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([BIII)V")
	public void method5709(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean572) {
			return;
		}
		if (this.aBoolean573) {
			this.aBoolean573 = false;
			throw new IOException();
		}
		if (this.aByteArray66 == null) {
			this.aByteArray66 = new byte[this.anInt6988];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray66[this.anInt6990] = arg0[local33];
				this.anInt6990 = (this.anInt6990 + 1) % this.anInt6988;
				if ((this.anInt6989 + this.anInt6988 - 100) % this.anInt6988 == this.anInt6990) {
					throw new IOException();
				}
			}
			if (this.aClass5_9 == null) {
				this.aClass5_9 = this.aClass99_6.method1787(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	public void method5710() {
		if (this.aBoolean572) {
			return;
		}
		synchronized (this) {
			this.aBoolean572 = true;
			this.notifyAll();
		}
		if (this.aClass5_9 != null) {
			while (this.aClass5_9.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (this.aClass5_9.anInt151 == 1) {
				try {
					((Thread) this.aClass5_9.anObject1).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass5_9 = null;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)I")
	public int method5711() throws IOException {
		return this.aBoolean572 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	public void method5713() throws IOException {
		if (!this.aBoolean572 && this.aBoolean573) {
			this.aBoolean573 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B[BII)V")
	public void method5716(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean572) {
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
}
