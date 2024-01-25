import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class3_Sub9_Sub5 extends Class3_Sub9 {

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[][] local26 = this.method9167(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static62.anInt1251; local40++) {
				local11[local40] = (local38[local40] + local34[local40] + local30[local40]) / 3;
			}
		}
		return local11;
	}
}
