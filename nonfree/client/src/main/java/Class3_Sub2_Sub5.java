import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static190.anInt3865; local31++) {
				local7[local31] = 4096 - local29[local31];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(26) int[][] local26 = this.method3332(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static190.anInt3865; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local38[local52];
				local50[local52] = 4096 - local34[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}
}
