import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class5_Sub3_Sub29 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(26) int[][] local26 = this.method6023(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static7.anInt129; local40++) {
				local11[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
