import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int[][] local26 = this.method2785(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			for (@Pc(40) int local40 = 0; local40 < Static86.anInt1942; local40++) {
				local16[local40] = (local34[local40] + local30[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
