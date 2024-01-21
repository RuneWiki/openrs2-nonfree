import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(29) int[] local29 = this.method3012(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static65.anInt1933; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[][] local26 = this.method3013(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static65.anInt1933; local52++) {
				local42[local52] = 4096 - local34[local52];
				local46[local52] = 4096 - local30[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}
}
