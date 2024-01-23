import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
	private int anInt2589 = 2048;

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
	private int anInt2595 = 2048;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	private int anInt2586 = 0;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
	private int anInt2593 = 12288;

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
	private int anInt2598 = 0;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	private int anInt2587 = 8192;

	@OriginalMember(owner = "client!hj", name = "jb", descriptor = "I")
	private int anInt2602 = 4096;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(26) int local26 = Static94.anIntArray321[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static110.anInt2934; local28++) {
				@Pc(35) int local35 = this.anInt2598 + local26;
				@Pc(41) int local41 = Static175.anIntArray302[local28] - 2048;
				@Pc(46) int local46 = local26 + this.anInt2589;
				@Pc(51) int local51 = local41 + this.anInt2595;
				@Pc(62) int local62 = local51 >= -2048 ? local51 : local51 + 4096;
				@Pc(73) int local73 = local62 <= 2048 ? local62 : local62 - 4096;
				@Pc(82) int local82 = local46 < -2048 ? local46 + 4096 : local46;
				@Pc(91) int local91 = local35 < -2048 ? local35 + 4096 : local35;
				@Pc(96) int local96 = this.anInt2586 + local41;
				@Pc(107) int local107 = local91 <= 2048 ? local91 : local91 - 4096;
				@Pc(118) int local118 = local82 <= 2048 ? local82 : local82 - 4096;
				@Pc(129) int local129 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(140) int local140 = local129 <= 2048 ? local129 : local129 - 4096;
				local16[local28] = this.method2002(local73, local107) || this.method2001(local118, local140) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)Z")
	private boolean method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2593 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static120.anIntArray224[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2593;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2587;
		@Pc(49) int local49 = this.anInt2602 * local36 >> 12;
		return arg0 - arg1 < local49 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)Z")
	private boolean method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt2593 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static120.anIntArray224[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2593;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2587;
		@Pc(44) int local44 = this.anInt2602 * local37 >> 12;
		return arg0 + arg1 < local44 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2595 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt2598 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt2586 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt2589 = arg0.method1764();
		} else if (arg1 == 4) {
			this.anInt2593 = arg0.method1764();
		} else if (arg1 == 5) {
			this.anInt2602 = arg0.method1764();
		} else if (arg1 == 6) {
			this.anInt2587 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		Static35.method621();
	}
}
