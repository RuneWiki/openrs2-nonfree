import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class375 implements Runnable {

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Lclient!ke;")
	private Class201 aClass201_8;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "I")
	private int anInt10538 = 0;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	private int anInt10539 = 0;

	@OriginalMember(owner = "client!up", name = "k", descriptor = "Z")
	private boolean aBoolean760 = false;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "Z")
	private boolean aBoolean762 = false;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!cea;")
	private final Class47 aClass47_6;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	private final int anInt10534;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!cea;I)V")
	public Class375(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass47_6 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
		this.anInt10534 = arg2;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	public void method8810() {
		if (!this.aBoolean760) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public void method8811() {
		if (this.aBoolean760) {
			return;
		}
		synchronized (this) {
			this.aBoolean760 = true;
			this.notifyAll();
		}
		if (this.aClass201_8 != null) {
			while (this.aClass201_8.anInt5729 == 0) {
				Static564.method7845(1L);
			}
			if (this.aClass201_8.anInt5729 == 1) {
				try {
					((Thread) this.aClass201_8.anObject16).join();
				} catch (@Pc(69) InterruptedException local69) {
				}
			}
		}
		this.aClass201_8 = null;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	public int method8812() throws IOException {
		return this.aBoolean760 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III[B)V")
	public void method8813(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean760) {
			return;
		}
		if (this.aBoolean762) {
			this.aBoolean762 = false;
			throw new IOException();
		}
		if (this.aByteArray102 == null) {
			this.aByteArray102 = new byte[this.anInt10534];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray102[this.anInt10539] = arg1[local37];
				this.anInt10539 = (this.anInt10539 + 1) % this.anInt10534;
				if (this.anInt10539 == (this.anInt10538 + this.anInt10534 - 100) % this.anInt10534) {
					throw new IOException();
				}
			}
			if (this.aClass201_8 == null) {
				this.aClass201_8 = this.aClass47_6.method941(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)I")
	public int method8814() throws IOException {
		return this.aBoolean760 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(45) int local45;
					synchronized (this) {
						if (this.anInt10538 == this.anInt10539) {
							if (this.aBoolean760) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt10539 >= this.anInt10538) {
							local33 = this.anInt10539 - this.anInt10538;
						} else {
							local33 = this.anInt10534 - this.anInt10538;
						}
						local45 = this.anInt10538;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray102, local45, local33);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean762 = true;
					}
					this.anInt10538 = (local33 + this.anInt10538) % this.anInt10534;
					try {
						if (this.anInt10538 == this.anInt10539) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean762 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray102 = null;
				break;
			}
		} catch (@Pc(126) Exception local126) {
			Static64.method799((String) null, local126);
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(III[B)V")
	public void method8817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean760) {
			return;
		}
		while (arg1 > 0) {
			@Pc(22) int local22 = this.anInputStream2.read(arg2, arg0, arg1);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg1 -= local22;
			arg0 += local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public void method8819() throws IOException {
		if (!this.aBoolean760 && this.aBoolean762) {
			this.aBoolean762 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8811();
	}
}
