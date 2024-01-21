import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt3592;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private int anInt3585 = 256;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt3593 = 0;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt3591 = 1;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "J")
	private long aLong127 = Static150.method2481();

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class28_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray5[local22] = this.aLong127;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method2585() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray5[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)I")
	@Override
	public int method2587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt3585;
		this.anInt3585 = 300;
		@Pc(16) int local16 = this.anInt3591;
		this.anInt3591 = 1;
		this.aLong127 = Static150.method2481();
		if (this.aLongArray5[this.anInt3592] == 0L) {
			this.anInt3591 = local16;
			this.anInt3585 = local4;
		} else if (this.aLongArray5[this.anInt3592] < this.aLong127) {
			this.anInt3585 = (int) ((long) (arg1 * 2560) / (this.aLong127 - this.aLongArray5[this.anInt3592]));
		}
		if (this.anInt3585 < 25) {
			this.anInt3585 = 25;
		}
		if (this.anInt3585 > 256) {
			this.anInt3585 = 256;
			this.anInt3591 = (int) ((long) arg1 - (this.aLong127 - this.aLongArray5[this.anInt3592]) / 10L);
		}
		if (arg1 < this.anInt3591) {
			this.anInt3591 = arg1;
		}
		this.aLongArray5[this.anInt3592] = this.aLong127;
		this.anInt3592 = (this.anInt3592 + 1) % 10;
		@Pc(137) int local137;
		if (this.anInt3591 > 1) {
			for (local137 = 0; local137 < 10; local137++) {
				if (this.aLongArray5[local137] != 0L) {
					this.aLongArray5[local137] += this.anInt3591;
				}
			}
		}
		local137 = 0;
		if (arg0 > this.anInt3591) {
			this.anInt3591 = arg0;
		}
		Static35.method627((long) this.anInt3591);
		while (this.anInt3593 < 256) {
			this.anInt3593 += this.anInt3585;
			local137++;
		}
		this.anInt3593 &= 0xFF;
		return local137;
	}
}
