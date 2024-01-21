import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub3_Sub31 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(26) int[][] local26 = this.method3017(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			for (@Pc(40) int local40 = 0; local40 < Static53.anInt1184; local40++) {
				local16[local40] = (local38[local40] + local30[local40] + local34[local40]) / 3;
			}
		}
		return local16;
	}
}
