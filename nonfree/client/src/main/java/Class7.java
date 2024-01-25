import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	private int anInt126 = 0;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	private int anInt135 = 0;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	private final int anInt133;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class7(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt133 = arg1 + 1;
		this.aByteArray1 = new byte[this.anInt133];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method117() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public void method119() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([BIBI)V")
	public void method123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || arg0.length < arg1) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(61) int local61;
			if (this.anInt135 > this.anInt126) {
				local61 = this.anInt135 - this.anInt126 - 1;
			} else {
				local61 = this.anInt133 + this.anInt135 - this.anInt126 - 1;
			}
			if (local61 < arg1) {
				throw new IOException("");
			}
			if (this.anInt133 >= arg1 + this.anInt126) {
				Static585.method3080(arg0, 0, this.aByteArray1, this.anInt126, arg1);
			} else {
				@Pc(111) int local111 = this.anInt133 - this.anInt126;
				Static585.method3080(arg0, 0, this.aByteArray1, this.anInt126, local111);
				Static585.method3080(arg0, local111, this.aByteArray1, 0, arg1 - local111);
			}
			this.anInt126 = (arg1 + this.anInt126) % this.anInt133;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt135 <= this.anInt126) {
						local27 = this.anInt126 - this.anInt135;
					} else {
						local27 = this.anInt133 + this.anInt126 - this.anInt135;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt133 >= local27 + this.anInt135) {
					this.anOutputStream1.write(this.aByteArray1, this.anInt135, local27);
				} else {
					@Pc(80) int local80 = this.anInt133 - this.anInt135;
					this.anOutputStream1.write(this.aByteArray1, this.anInt135, local80);
					this.anOutputStream1.write(this.aByteArray1, 0, local27 - local80);
				}
			} catch (@Pc(100) IOException local100) {
				@Pc(100) IOException local100x = local100;
				synchronized (this) {
					this.anIOException1 = local100x;
					return;
				}
			}
			synchronized (this) {
				this.anInt135 = (this.anInt135 + local27) % this.anInt133;
			}
		}
	}
}
