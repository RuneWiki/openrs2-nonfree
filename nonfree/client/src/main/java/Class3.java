import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 implements Runnable {

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!rm;")
	private Class215 aClass215_1;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private int anInt64 = 0;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt69 = 0;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ji;")
	private final Class124 aClass124_1;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ji;)V")
	public Class3(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class124 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass124_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ac", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(36) int local36;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt64 == this.anInt69) {
							if (this.aBoolean8) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt69 <= this.anInt64) {
							local36 = this.anInt64 - this.anInt69;
						} else {
							local36 = 5000 - this.anInt69;
						}
						local47 = this.anInt69;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray2, local47, local36);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean7 = true;
					}
					this.anInt69 = (local36 + this.anInt69) % 5000;
					try {
						if (this.anInt69 == this.anInt64) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean7 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray2 = null;
				return;
			}
		} catch (@Pc(114) Exception local114) {
			Static211.method2815(local114, null);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	public int method57() throws IOException {
		return this.aBoolean8 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
	public void method58() {
		if (!this.aBoolean8) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)V")
	public void method59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean8) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 += local18;
			arg2 -= local18;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public void method60() throws IOException {
		if (!this.aBoolean8 && this.aBoolean7) {
			this.aBoolean7 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
	public int method61() throws IOException {
		return this.aBoolean8 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method63();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BII)V")
	public void method62(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean8) {
			return;
		}
		if (this.aBoolean7) {
			this.aBoolean7 = false;
			throw new IOException();
		}
		if (this.aByteArray2 == null) {
			this.aByteArray2 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray2[this.anInt64] = arg1[local36];
				this.anInt64 = (this.anInt64 + 1) % 5000;
				if (this.anInt64 == (this.anInt69 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass215_1 == null) {
				this.aClass215_1 = this.aClass124_1.method2529(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method63() {
		if (this.aBoolean8) {
			return;
		}
		synchronized (this) {
			this.aBoolean8 = true;
			this.notifyAll();
		}
		if (this.aClass215_1 != null) {
			while (this.aClass215_1.anInt5791 == 0) {
				Static252.method2874(1L);
			}
			if (this.aClass215_1.anInt5791 == 1) {
				try {
					((Thread) this.aClass215_1.anObject10).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass215_1 = null;
	}
}
