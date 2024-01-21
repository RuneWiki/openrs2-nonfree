import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
	private int anInt3892;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3892 = arg0.method1359() << 4;
		} else if (arg1 == 1) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		Static82.method1413();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int[] local26 = this.method2787(arg0, 1);
			@Pc(32) int[] local32 = this.method2787(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static86.anInt1942; local34++) {
				@Pc(45) int local45 = this.anInt3892 * local32[local34] >> 12;
				@Pc(53) int local53 = local26[local34] >> 4 & 0xFF;
				@Pc(61) int local61 = local45 * Static82.anIntArray188[local53] >> 12;
				@Pc(69) int local69 = Static165.anInt321 & local34 + (local61 >> 12);
				@Pc(77) int local77 = local45 * Static57.anIntArray142[local53] >> 12;
				@Pc(86) int local86 = arg0 + (local77 >> 12) & Static124.anInt2869;
				@Pc(92) int[] local92 = this.method2787(local86, 0);
				local11[local34] = local92[local69];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(24) int[] local24 = this.method2787(arg0, 1);
			@Pc(30) int[] local30 = this.method2787(arg0, 2);
			@Pc(34) int[] local34 = local14[0];
			@Pc(38) int[] local38 = local14[2];
			@Pc(42) int[] local42 = local14[1];
			for (@Pc(44) int local44 = 0; local44 < Static86.anInt1942; local44++) {
				@Pc(56) int local56 = local24[local44] * 255 >> 12 & 0xFF;
				@Pc(65) int local65 = this.anInt3892 * local30[local44] >> 12;
				@Pc(73) int local73 = local65 * Static57.anIntArray142[local56] >> 12;
				@Pc(81) int local81 = Static82.anIntArray188[local56] * local65 >> 12;
				@Pc(89) int local89 = Static165.anInt321 & local44 + (local81 >> 12);
				@Pc(97) int local97 = Static124.anInt2869 & arg0 + (local73 >> 12);
				@Pc(103) int[][] local103 = this.method2785(local97, 0);
				local34[local44] = local103[0][local89];
				local42[local44] = local103[1][local89];
				local38[local44] = local103[2][local89];
			}
		}
		return local14;
	}
}
