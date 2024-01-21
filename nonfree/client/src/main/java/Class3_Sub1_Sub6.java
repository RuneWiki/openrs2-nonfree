import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(26) int[][] local26 = this.method3124(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			for (@Pc(40) int local40 = 0; local40 < Static129.anInt3285; local40++) {
				local16[local40] = (local34[local40] + local38[local40] + local30[local40]) / 3;
			}
		}
		return local16;
	}
}
