import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class374 implements Runnable {

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[16384];

	@OriginalMember(owner = "client!wha", name = "x", descriptor = "[F")
	public static final float[] aFloatArray81 = new float[16384];

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "Lclient!eha;")
	private Class91 aClass91_9;

	@OriginalMember(owner = "client!wha", name = "u", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "Z")
	private boolean aBoolean751 = false;

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "I")
	private int anInt10475 = 0;

	@OriginalMember(owner = "client!wha", name = "q", descriptor = "Z")
	private boolean aBoolean752 = false;

	@OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
	private int anInt10488 = 0;

	@OriginalMember(owner = "client!wha", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "Lclient!fc;")
	private final Class100 aClass100_16;

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
	private final int anInt10474;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray80[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray81[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!fc;I)V")
	public Class374(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass100_16 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt10474 = arg2;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V")
	public void method8905() {
		if (this.aBoolean751) {
			return;
		}
		synchronized (this) {
			this.aBoolean751 = true;
			this.notifyAll();
		}
		if (this.aClass91_9 != null) {
			while (this.aClass91_9.anInt2271 == 0) {
				Static314.method4821(1L);
			}
			if (this.aClass91_9.anInt2271 == 1) {
				try {
					((Thread) this.aClass91_9.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass91_9 = null;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III[B)V")
	public void method8906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean751) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 += local14;
			arg0 -= local14;
		}
	}

	@OriginalMember(owner = "client!wha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8905();
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
	public void method8909() {
		if (!this.aBoolean751) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I[BII)V")
	public void method8911(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean751) {
			return;
		}
		if (this.aBoolean752) {
			this.aBoolean752 = false;
			throw new IOException();
		}
		if (this.aByteArray108 == null) {
			this.aByteArray108 = new byte[this.anInt10474];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray108[this.anInt10475] = arg0[local33];
				this.anInt10475 = (this.anInt10475 + 1) % this.anInt10474;
				if (this.anInt10475 == (this.anInt10474 + this.anInt10488 - 100) % this.anInt10474) {
					throw new IOException();
				}
			}
			if (this.aClass91_9 == null) {
				this.aClass91_9 = this.aClass100_16.method2095(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)I")
	public int method8913() throws IOException {
		return this.aBoolean751 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!wha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(53) int local53;
					synchronized (this) {
						if (this.anInt10488 == this.anInt10475) {
							if (this.aBoolean751) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt10488 > this.anInt10475) {
							local41 = this.anInt10474 - this.anInt10488;
						} else {
							local41 = this.anInt10475 - this.anInt10488;
						}
						local53 = this.anInt10488;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray108, local53, local41);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean752 = true;
					}
					this.anInt10488 = (local41 + this.anInt10488) % this.anInt10474;
					try {
						if (this.anInt10475 == this.anInt10488) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(99) IOException local99) {
						this.aBoolean752 = true;
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
				} catch (@Pc(123) IOException local123) {
				}
				this.aByteArray108 = null;
				break;
			}
		} catch (@Pc(128) Exception local128) {
			Static524.method7740(local128, null);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	public void method8914() throws IOException {
		if (!this.aBoolean751 && this.aBoolean752) {
			this.aBoolean752 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)I")
	public int method8915() throws IOException {
		return this.aBoolean751 ? 0 : this.anInputStream2.read();
	}
}
