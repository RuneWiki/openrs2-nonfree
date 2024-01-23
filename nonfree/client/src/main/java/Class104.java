import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class104 implements Runnable {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "Lclient!en;")
	private Class47 aClass47_3;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	private int anInt3548 = 0;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
	private int anInt3562 = 0;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!na;")
	private Class112 aClass112_3;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!na;)V")
	public Class104(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class112 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass112_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public void method2571() {
		if (this.aBoolean233) {
			return;
		}
		synchronized (this) {
			this.aBoolean233 = true;
			this.notifyAll();
		}
		if (this.aClass47_3 != null) {
			while (this.aClass47_3.anInt1417 == 0) {
				Static312.method4734(1L);
			}
			if (this.aClass47_3.anInt1417 == 1) {
				try {
					((Thread) this.aClass47_3.anObject2).join();
				} catch (@Pc(63) InterruptedException local63) {
				}
			}
		}
		this.aClass47_3 = null;
	}

	@OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2571();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
	public void method2572() throws IOException {
		if (!this.aBoolean233 && this.aBoolean232) {
			this.aBoolean232 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
	public int method2573() throws IOException {
		return this.aBoolean233 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIZ)V")
	public void method2574(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean233) {
			return;
		}
		while (arg2 > 0) {
			@Pc(27) int local27 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local27 <= 0) {
				throw new EOFException();
			}
			arg2 -= local27;
			arg1 += local27;
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	public void method2575() {
		if (!this.aBoolean233) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ln", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(44) int var1;
				@Pc(29) int var2;
				label87: {
					synchronized (this) {
						label88: {
							if (this.anInt3562 == this.anInt3548) {
								if (this.aBoolean233) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(26) InterruptedException local26) {
								}
							}
							var2 = this.anInt3548;
							if (this.anInt3548 > this.anInt3562) {
								var1 = 5000 - this.anInt3548;
							} else {
								var1 = this.anInt3562 - this.anInt3548;
							}
							break label87;
						}
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
					} catch (@Pc(126) IOException local126) {
					}
					this.aByteArray58 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray58, var2, var1);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean232 = true;
					}
					this.anInt3548 = (var1 + this.anInt3548) % 5000;
					try {
						if (this.anInt3548 == this.anInt3562) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean232 = true;
					}
				}
			}
		} catch (@Pc(131) Exception local131) {
			Static66.method3525(local131, null);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[BII)V")
	public void method2579(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean233) {
			return;
		}
		if (this.aBoolean232) {
			this.aBoolean232 = false;
			throw new IOException();
		}
		if (this.aByteArray58 == null) {
			this.aByteArray58 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
				this.aByteArray58[this.anInt3562] = arg0[local34];
				this.anInt3562 = (this.anInt3562 + 1) % 5000;
				if ((this.anInt3548 + 4900) % 5000 == this.anInt3562) {
					throw new IOException();
				}
			}
			if (this.aClass47_3 == null) {
				this.aClass47_3 = this.aClass112_3.method2879(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)I")
	public int method2581() throws IOException {
		return this.aBoolean233 ? 0 : this.anInputStream1.available();
	}
}
