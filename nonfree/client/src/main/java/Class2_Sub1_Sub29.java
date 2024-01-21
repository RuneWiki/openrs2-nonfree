import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[][] local26 = this.method2991(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static129.anInt3118; local40++) {
				local16[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local16;
	}
}
