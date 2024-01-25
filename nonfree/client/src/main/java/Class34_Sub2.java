import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "J")
	private long aLong127 = 0L;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "J")
	private long aLong128 = 0L;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	private int anInt3217 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	private int anInt3218 = 1;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.aLong128 = this.aLong127 = jagmisc.nanoTime();
		if (this.aLong127 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3922(@OriginalArg(0) int arg0) {
		this.aLong127 += this.method2852();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong127 < this.aLong128) {
			Static37.method613((this.aLong128 - this.aLong127) / 1000000L);
			this.aLong129 += this.aLong128 - this.aLong127;
			this.aLong127 += this.aLong128 - this.aLong127;
			this.aLong128 += local17;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong128 += local17;
		} while (local29 < 10 && this.aLong128 < this.aLong127);
		if (this.aLong128 < this.aLong127) {
			this.aLong128 = this.aLong127;
		}
		return local29;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	@Override
	public void method3928() {
		this.aLong129 = 0L;
		if (this.aLong127 < this.aLong128) {
			this.aLong127 += this.aLong128 - this.aLong127;
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(Z)J")
	private long method2852() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong129;
		this.aLong129 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt3217] = local7;
			if (this.anInt3218 < 1) {
				this.anInt3218++;
			}
			this.anInt3217 = (this.anInt3217 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt3218; local54++) {
			local46 += this.aLongArray5[(this.anInt3217 + 10 - local54) % 10];
		}
		return local46 / (long) this.anInt3218;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J")
	@Override
	public long method3925() {
		return this.aLong127;
	}
}
