import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
	private int anInt3841 = 1;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	private int anInt3842 = 0;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class37_Sub3() {
		this.aLong130 = System.nanoTime();
		this.aLong131 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)J")
	private long method3588() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong132;
		this.aLong132 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray10[this.anInt3842] = local6;
			this.anInt3842 = (this.anInt3842 + 1) % 10;
			if (this.anInt3841 < 1) {
				this.anInt3841++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt3841; local49++) {
			local47 += this.aLongArray10[(this.anInt3842 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt3841;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)J")
	@Override
	public long method3585() {
		return this.aLong130;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	@Override
	public void method3580() {
		this.aLong132 = 0L;
		if (this.aLong131 > this.aLong130) {
			this.aLong130 += this.aLong131 - this.aLong130;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)I")
	@Override
	public int method3581(@OriginalArg(1) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong130 += this.method3588();
		if (this.aLong131 > this.aLong130) {
			Static134.method2598((this.aLong131 - this.aLong130) / 1000000L);
			this.aLong132 += this.aLong131 - this.aLong130;
			this.aLong130 += this.aLong131 - this.aLong130;
			this.aLong131 += local10;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong131 += local10;
		} while (local69 < 10 && this.aLong130 > this.aLong131);
		if (this.aLong130 > this.aLong131) {
			this.aLong131 = this.aLong130;
		}
		return local69;
	}
}
