import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
	private int anInt2562;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
	private int anInt2558;

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2560 = arg0.method2353();
		} else if (arg1 == 1) {
			this.anInt2558 = arg0.method2353();
		} else if (arg1 == 2) {
			this.anInt2557 = arg0.method2353();
		} else if (arg1 == 3) {
			this.anInt2562 = arg0.method2353();
		} else if (arg1 == 4) {
			this.anInt2556 = arg0.method2353();
		} else if (arg1 == 5) {
			this.anInt2565 = arg0.method2353();
		} else if (arg1 == 6) {
			this.anInt2554 = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int local26 = Static166.anIntArray619[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static129.anInt3118; local28++) {
				@Pc(36) int local36 = Static163.anIntArray577[local28] - 2048;
				@Pc(41) int local41 = this.anInt2560 + local36;
				@Pc(46) int local46 = this.anInt2558 + local26;
				@Pc(55) int local55 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(64) int local64 = local46 < -2048 ? local46 + 4096 : local46;
				@Pc(69) int local69 = local36 + this.anInt2557;
				@Pc(80) int local80 = local69 < -2048 ? local69 + 4096 : local69;
				@Pc(86) int local86 = local26 + this.anInt2562;
				@Pc(97) int local97 = local55 > 2048 ? local55 - 4096 : local55;
				@Pc(108) int local108 = local64 <= 2048 ? local64 : local64 - 4096;
				@Pc(117) int local117 = local80 <= 2048 ? local80 : local80 - 4096;
				@Pc(126) int local126 = local86 >= -2048 ? local86 : local86 + 4096;
				@Pc(135) int local135 = local126 > 2048 ? local126 - 4096 : local126;
				local16[local28] = this.method1827(local97, local108) || this.method1828(local135, local117) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(III)Z")
	private boolean method1827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = (arg1 - arg0) * this.anInt2556 >> 12;
		@Pc(18) int local18 = Static108.anIntArray424[local8 * 255 >> 12 & 0xFF];
		@Pc(25) int local25 = (local18 << 12) / this.anInt2556;
		@Pc(42) int local42 = (local25 << 12) / this.anInt2554;
		@Pc(49) int local49 = this.anInt2565 * local42 >> 12;
		return local49 > arg1 + arg0 && arg1 + arg0 > -local49;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		Static128.method2196();
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(III)Z")
	private boolean method1828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (arg0 + arg1) * this.anInt2556 >> 12;
		@Pc(23) int local23 = Static108.anIntArray424[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2556;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2554;
		@Pc(44) int local44 = this.anInt2565 * local37 >> 12;
		return arg0 - arg1 < local44 && arg0 - arg1 > -local44;
	}
}
