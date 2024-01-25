import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class180 implements Runnable {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "Lclient!ow;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Z")
	private boolean aBoolean384 = false;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	private int anInt5293 = 0;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	private int anInt5287 = 0;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Z")
	private boolean aBoolean385 = false;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!dq;")
	private final Class51 aClass51_4;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class174("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dq;)V")
	public Class180(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class51 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass51_4 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
	public int method4355() throws IOException {
		return this.aBoolean385 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public void method4356() throws IOException {
		if (!this.aBoolean385 && this.aBoolean384) {
			this.aBoolean384 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	public void method4357() {
		if (this.aBoolean385) {
			return;
		}
		synchronized (this) {
			this.aBoolean385 = true;
			this.notifyAll();
		}
		if (this.aClass181_6 != null) {
			while (this.aClass181_6.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (this.aClass181_6.anInt5298 == 1) {
				try {
					((Thread) this.aClass181_6.anObject7).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass181_6 = null;
	}

	@OriginalMember(owner = "client!ov", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt5293 == this.anInt5287) {
							if (this.aBoolean385) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt5287;
						if (this.anInt5287 > this.anInt5293) {
							local43 = 5000 - this.anInt5287;
						} else {
							local43 = this.anInt5293 - this.anInt5287;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray92, local28, local43);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean384 = true;
					}
					this.anInt5287 = (local43 + this.anInt5287) % 5000;
					try {
						if (this.anInt5287 == this.anInt5293) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean384 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray92 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static120.method1926(null, local122);
		}
	}

	@OriginalMember(owner = "client!ov", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4357();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III[B)V")
	public void method4358(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean385) {
			return;
		}
		if (this.aBoolean384) {
			this.aBoolean384 = false;
			throw new IOException();
		}
		if (this.aByteArray92 == null) {
			this.aByteArray92 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray92[this.anInt5293] = arg1[local38];
				this.anInt5293 = (this.anInt5293 + 1) % 5000;
				if (this.anInt5293 == (this.anInt5287 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass181_6 == null) {
				this.aClass181_6 = this.aClass51_4.method1385(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public void method4359() {
		if (!this.aBoolean385) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
	public int method4360() throws IOException {
		return this.aBoolean385 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[BB)V")
	public void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean385) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg1 += local14;
		}
	}
}
