import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int[][] local26 = this.method2582(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			for (@Pc(40) int local40 = 0; local40 < Static149.anInt3233; local40++) {
				local11[local40] = (local30[local40] + local38[local40] + local34[local40]) / 3;
			}
		}
		return local11;
	}
}
