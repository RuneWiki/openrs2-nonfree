import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	private int anInt2645;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!of", name = "z", descriptor = "I")
	private int anInt2647 = 1;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	private int anInt2641 = 0;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "I")
	private int anInt2643 = 256;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "J")
	private long aLong87 = Static29.method615();

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class38_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray7[local22] = this.aLong87;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I")
	@Override
	public int method1879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2643;
		this.anInt2643 = 300;
		@Pc(14) int local14 = this.anInt2647;
		this.anInt2647 = 1;
		this.aLong87 = Static29.method615();
		if (this.aLongArray7[this.anInt2645] == 0L) {
			this.anInt2647 = local14;
			this.anInt2643 = local4;
		} else if (this.aLong87 > this.aLongArray7[this.anInt2645]) {
			this.anInt2643 = (int) ((long) (arg0 * 2560) / (this.aLong87 - this.aLongArray7[this.anInt2645]));
		}
		if (this.anInt2643 < 25) {
			this.anInt2643 = 25;
		}
		if (this.anInt2643 > 256) {
			this.anInt2643 = 256;
			this.anInt2647 = (int) ((long) arg0 - (this.aLong87 - this.aLongArray7[this.anInt2645]) / 10L);
		}
		if (this.anInt2647 > arg0) {
			this.anInt2647 = arg0;
		}
		this.aLongArray7[this.anInt2645] = this.aLong87;
		this.anInt2645 = (this.anInt2645 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt2647 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray7[local135] != 0L) {
					this.aLongArray7[local135] += this.anInt2647;
				}
			}
		}
		if (this.anInt2647 < arg1) {
			this.anInt2647 = arg1;
		}
		local135 = 0;
		Static50.method927((long) this.anInt2647);
		while (this.anInt2641 < 256) {
			this.anInt2641 += this.anInt2643;
			local135++;
		}
		this.anInt2641 &= 0xFF;
		return local135;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	@Override
	public void method1878() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray7[local7] = 0L;
		}
	}
}
