import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class258 implements Runnable {

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
	private int anInt8074 = 0;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	private int anInt8079 = 0;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
	private final int anInt8075;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class258(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt8075 = arg1 + 1;
		this.aByteArray87 = new byte[this.anInt8075];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public void method6661() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method6662() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!ps", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt8074 >= this.anInt8079) {
						local26 = this.anInt8074 - this.anInt8079;
					} else {
						local26 = this.anInt8074 + this.anInt8075 - this.anInt8079;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(46) InterruptedException local46) {
					}
				}
			}
			try {
				if (this.anInt8079 + local26 > this.anInt8075) {
					@Pc(73) int local73 = this.anInt8075 - this.anInt8079;
					this.anOutputStream1.write(this.aByteArray87, this.anInt8079, local73);
					this.anOutputStream1.write(this.aByteArray87, 0, local26 - local73);
				} else {
					this.anOutputStream1.write(this.aByteArray87, this.anInt8079, local26);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException1 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8079 = (this.anInt8079 + local26) % this.anInt8075;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIIZ)V")
	public void method6664(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(67) int local67;
			if (this.anInt8079 <= this.anInt8074) {
				local67 = this.anInt8075 + this.anInt8079 - this.anInt8074 - 1;
			} else {
				local67 = this.anInt8079 - this.anInt8074 - 1;
			}
			if (arg1 > local67) {
				throw new IOException("");
			}
			if (arg1 + this.anInt8074 > this.anInt8075) {
				@Pc(103) int local103 = this.anInt8075 - this.anInt8074;
				Static602.method4666(arg0, 0, this.aByteArray87, this.anInt8074, local103);
				Static602.method4666(arg0, local103, this.aByteArray87, 0, arg1 - local103);
			} else {
				Static602.method4666(arg0, 0, this.aByteArray87, this.anInt8074, arg1);
			}
			this.anInt8074 = (arg1 + this.anInt8074) % this.anInt8075;
			this.notifyAll();
		}
	}
}
