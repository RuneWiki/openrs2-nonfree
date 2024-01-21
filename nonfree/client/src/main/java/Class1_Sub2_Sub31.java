import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(26) int local26 = Static160.anIntArray399[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static22.anInt596; local28++) {
				local18[local28] = this.method2760(local26, Static167.anIntArray417[local28]) % 4096;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)I")
	private int method2760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local9 ^ local9 << 1;
		return 4096 - ((local23 * local23 * 15731 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE) / 262144;
	}
}
