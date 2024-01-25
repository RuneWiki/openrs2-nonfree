import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
	private int anInt649 = 32768;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		Static336.method5504();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int[] local26 = this.method5733(arg0, 1);
			@Pc(32) int[] local32 = this.method5733(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static131.anInt2755; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt649 >> 12;
				@Pc(61) int local61 = Static113.anIntArray534[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static290.anIntArray474[local44] >> 12;
				@Pc(77) int local77 = Static167.anInt3460 & local34 + (local61 >> 12);
				@Pc(85) int local85 = (local69 >> 12) + arg0 & Static351.anInt6821;
				@Pc(91) int[] local91 = this.method5733(local85, 0);
				local11[local34] = local91[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt649 = arg0.method3649() << 4;
		} else if (arg1 == 1) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(26) int[] local26 = this.method5733(arg0, 1);
			@Pc(32) int[] local32 = this.method5733(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static131.anInt2755; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt649 >> 12;
				@Pc(75) int local75 = Static113.anIntArray534[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static290.anIntArray474[local58] >> 12;
				@Pc(91) int local91 = Static167.anInt3460 & (local75 >> 12) + local46;
				@Pc(99) int local99 = Static351.anInt6821 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method5729(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}
}
