import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(22) int[][] local22 = this.method2794(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			for (@Pc(36) int local36 = 0; local36 < Static120.anInt2812; local36++) {
				local7[local36] = (local34[local36] + local30[local36] + local26[local36]) / 3;
			}
		}
		return local7;
	}
}
