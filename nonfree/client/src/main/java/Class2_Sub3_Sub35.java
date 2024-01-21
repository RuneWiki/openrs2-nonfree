import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub3_Sub35 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)I")
	private int method2767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 ^ local17 << 1;
		return 4096 - (Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589) / 262144;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(24) int local24 = Static50.anIntArray106[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static53.anInt1184; local26++) {
				local16[local26] = this.method2767(Static43.anIntArray102[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
