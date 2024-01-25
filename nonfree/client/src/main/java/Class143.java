import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
	private int anInt4370 = 0;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	private int anInt4375 = 0;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	private final int anInt4369;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[B")
	private final byte[] aByteArray50;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class143(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt4369 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray50 = new byte[this.anInt4369];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II[BB)V")
	public void method3780(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(62) int local62;
			if (this.anInt4375 >= this.anInt4370) {
				local62 = this.anInt4369 + this.anInt4370 - this.anInt4375 - 1;
			} else {
				local62 = this.anInt4370 - this.anInt4375 - 1;
			}
			if (arg0 > local62) {
				throw new IOException("");
			}
			if (arg0 + this.anInt4375 > this.anInt4369) {
				@Pc(98) int local98 = this.anInt4369 - this.anInt4375;
				Static655.method5836(arg1, 0, this.aByteArray50, this.anInt4375, local98);
				Static655.method5836(arg1, local98, this.aByteArray50, 0, arg0 - local98);
			} else {
				Static655.method5836(arg1, 0, this.aByteArray50, this.anInt4375, arg0);
			}
			this.anInt4375 = (arg0 + this.anInt4375) % this.anInt4369;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public void method3781() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!hw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4370 > this.anInt4375) {
						local35 = this.anInt4369 + this.anInt4375 - this.anInt4370;
					} else {
						local35 = this.anInt4375 - this.anInt4370;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(53) InterruptedException local53) {
					}
				}
			}
			try {
				if (this.anInt4369 >= this.anInt4370 + local35) {
					this.anOutputStream1.write(this.aByteArray50, this.anInt4370, local35);
				} else {
					@Pc(86) int local86 = this.anInt4369 - this.anInt4370;
					this.anOutputStream1.write(this.aByteArray50, this.anInt4370, local86);
					this.anOutputStream1.write(this.aByteArray50, 0, local35 - local86);
				}
			} catch (@Pc(106) IOException local106) {
				@Pc(106) IOException local106x = local106;
				synchronized (this) {
					this.anIOException2 = local106x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4370 = (local35 + this.anInt4370) % this.anInt4369;
			}
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	public void method3786() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
