import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!bl;")
	private Class26 aClass26_5;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	private int anInt3763 = 0;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	private int anInt3776 = 0;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!sc;")
	private final Class179 aClass179_4;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray5[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!sc;)V")
	public Class117(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class179 arg1) throws IOException {
		this.aClass179_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt3776 == this.anInt3763) {
							if (this.aBoolean326) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt3776;
						if (this.anInt3763 >= this.anInt3776) {
							local39 = this.anInt3763 - this.anInt3776;
						} else {
							local39 = 5000 - this.anInt3776;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray42, local24, local39);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean327 = true;
					}
					this.anInt3776 = (this.anInt3776 + local39) % 5000;
					try {
						if (this.anInt3763 == this.anInt3776) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean327 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray42 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static40.method506(null, local119);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
	public int method3271() throws IOException {
		return this.aBoolean326 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3278();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)I")
	public int method3273() throws IOException {
		return this.aBoolean326 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII[B)V")
	public void method3274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean326) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
	public void method3278() {
		if (this.aBoolean326) {
			return;
		}
		synchronized (this) {
			this.aBoolean326 = true;
			this.notifyAll();
		}
		if (this.aClass26_5 != null) {
			while (this.aClass26_5.anInt484 == 0) {
				Static248.method4401(1L);
			}
			if (this.aClass26_5.anInt484 == 1) {
				try {
					((Thread) this.aClass26_5.anObject1).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass26_5 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI[B)V")
	public void method3279(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean326) {
			return;
		}
		if (this.aBoolean327) {
			this.aBoolean327 = false;
			throw new IOException();
		}
		if (this.aByteArray42 == null) {
			this.aByteArray42 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray42[this.anInt3763] = arg1[local38];
				this.anInt3763 = (this.anInt3763 + 1) % 5000;
				if ((this.anInt3776 + 4900) % 5000 == this.anInt3763) {
					throw new IOException();
				}
			}
			if (this.aClass26_5 == null) {
				this.aClass26_5 = this.aClass179_4.method4875(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method3280() {
		if (!this.aBoolean326) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	public void method3282() throws IOException {
		if (!this.aBoolean326 && this.aBoolean327) {
			this.aBoolean327 = false;
			throw new IOException();
		}
	}
}
