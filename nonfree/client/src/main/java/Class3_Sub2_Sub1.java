import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(22) int[] local22 = this.method2787(arg0, 0);
			for (@Pc(24) int local24 = 0; local24 < Static86.anInt1942; local24++) {
				local7[local24] = 4096 - local22[local24];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(17) int[][] local17 = this.method2785(arg0, 0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[2];
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[2];
			@Pc(41) int[] local41 = local7[1];
			for (@Pc(43) int local43 = 0; local43 < Static86.anInt1942; local43++) {
				local33[local43] = 4096 - local29[local43];
				local41[local43] = 4096 - local21[local43];
				local37[local43] = 4096 - local25[local43];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}
}
