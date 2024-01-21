import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	private int anInt637 = 0;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	private int anInt631 = 256;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	private int anInt643 = 1;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "J")
	private long aLong37 = Static35.method634();

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class11_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong37;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I")
	@Override
	public int method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt631;
		this.anInt631 = 300;
		@Pc(14) int local14 = this.anInt643;
		this.anInt643 = 1;
		this.aLong37 = Static35.method634();
		if (this.aLongArray1[this.anInt640] == 0L) {
			this.anInt631 = local8;
			this.anInt643 = local14;
		} else if (this.aLong37 > this.aLongArray1[this.anInt640]) {
			this.anInt631 = (int) ((long) (arg0 * 2560) / (this.aLong37 - this.aLongArray1[this.anInt640]));
		}
		if (this.anInt631 < 25) {
			this.anInt631 = 25;
		}
		if (this.anInt631 > 256) {
			this.anInt631 = 256;
			this.anInt643 = (int) ((long) arg0 - (this.aLong37 - this.aLongArray1[this.anInt640]) / 10L);
		}
		if (this.anInt643 > arg0) {
			this.anInt643 = arg0;
		}
		this.aLongArray1[this.anInt640] = this.aLong37;
		this.anInt640 = (this.anInt640 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt643 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray1[local135] != 0L) {
					this.aLongArray1[local135] += this.anInt643;
				}
			}
		}
		local135 = 0;
		if (arg1 > this.anInt643) {
			this.anInt643 = arg1;
		}
		Static109.method2037((long) this.anInt643);
		while (this.anInt637 < 256) {
			this.anInt637 += this.anInt631;
			local135++;
		}
		this.anInt637 &= 0xFF;
		return local135;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	@Override
	public void method1913() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray1[local7] = 0L;
		}
	}
}
