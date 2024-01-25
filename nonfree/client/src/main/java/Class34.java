import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
	private int anInt580 = 0;

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
	private int anInt582 = 0;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
	private final int anInt587;

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!bea", name = "g", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class34(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt587 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray2 = new byte[this.anInt587];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt580 < this.anInt582) {
						local35 = this.anInt587 + this.anInt580 - this.anInt582;
					} else {
						local35 = this.anInt580 - this.anInt582;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(55) IOException local55) {
						this.anIOException1 = local55;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(65) InterruptedException local65) {
					}
				}
			}
			try {
				if (this.anInt587 < this.anInt582 + local35) {
					@Pc(91) int local91 = this.anInt587 - this.anInt582;
					this.anOutputStream1.write(this.aByteArray2, this.anInt582, local91);
					this.anOutputStream1.write(this.aByteArray2, 0, local35 - local91);
				} else {
					this.anOutputStream1.write(this.aByteArray2, this.anInt582, local35);
				}
			} catch (@Pc(120) IOException local120x) {
				@Pc(120) IOException local120 = local120x;
				synchronized (this) {
					this.anIOException1 = local120;
					return;
				}
			}
			synchronized (this) {
				this.anInt582 = (this.anInt582 + local35) % this.anInt587;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public void method582() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II[BB)V")
	public void method583(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || 0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(56) int local56;
			if (this.anInt582 > this.anInt580) {
				local56 = this.anInt582 - this.anInt580 - 1;
			} else {
				local56 = this.anInt582 + this.anInt587 - this.anInt580 - 1;
			}
			if (local56 < arg0) {
				throw new IOException("");
			}
			if (this.anInt587 < this.anInt580 + arg0) {
				@Pc(100) int local100 = this.anInt587 - this.anInt580;
				Static728.method274(arg1, 0, this.aByteArray2, this.anInt580, local100);
				Static728.method274(arg1, local100, this.aByteArray2, 0, arg0 - local100);
			} else {
				Static728.method274(arg1, 0, this.aByteArray2, this.anInt580, arg0);
			}
			this.anInt580 = (arg0 + this.anInt580) % this.anInt587;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
	public void method585() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}
}
