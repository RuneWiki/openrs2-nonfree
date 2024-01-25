import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class3_Sub9_Sub34 extends Class3_Sub9 {

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[] local26 = this.method9162(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static62.anInt1251; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(26) int[][] local26 = this.method9167(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static62.anInt1251; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}
}
