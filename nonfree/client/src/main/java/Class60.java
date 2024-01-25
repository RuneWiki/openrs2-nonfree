import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	private int anInt1505 = 0;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	private int anInt1507 = 0;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "I")
	private final int anInt1509;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "[B")
	private final byte[] aByteArray27;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Class40("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class60(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1509 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray27 = new byte[this.anInt1509];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public void method1399() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	public void method1400() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[BI)V")
	public void method1401(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(68) int local68;
			if (this.anInt1505 > this.anInt1507) {
				local68 = this.anInt1505 - this.anInt1507 - 1;
			} else {
				local68 = this.anInt1509 + this.anInt1505 - this.anInt1507 - 1;
			}
			if (local68 < arg0) {
				throw new IOException("");
			}
			if (this.anInt1509 < this.anInt1507 + arg0) {
				@Pc(107) int local107 = this.anInt1509 - this.anInt1507;
				Static553.method2534(arg1, 0, this.aByteArray27, this.anInt1507, local107);
				Static553.method2534(arg1, local107, this.aByteArray27, 0, arg0 - local107);
			} else {
				Static553.method2534(arg1, 0, this.aByteArray27, this.anInt1507, arg0);
			}
			this.anInt1507 = (this.anInt1507 + arg0) % this.anInt1509;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1505 <= this.anInt1507) {
						local27 = this.anInt1507 - this.anInt1505;
					} else {
						local27 = this.anInt1509 + this.anInt1507 - this.anInt1505;
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
				if (this.anInt1505 + local27 <= this.anInt1509) {
					this.anOutputStream1.write(this.aByteArray27, this.anInt1505, local27);
				} else {
					@Pc(84) int local84 = this.anInt1509 - this.anInt1505;
					this.anOutputStream1.write(this.aByteArray27, this.anInt1505, local84);
					this.anOutputStream1.write(this.aByteArray27, 0, local27 - local84);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException1 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt1505 = (this.anInt1505 + local27) % this.anInt1509;
			}
		}
	}
}
