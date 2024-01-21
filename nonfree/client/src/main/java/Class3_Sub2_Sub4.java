import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "[I")
	public static int[] anIntArray48 = new int[99];

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) (Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D + (double) local21);
			local14 += local34;
			anIntArray48[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(24) int local24 = Static123.anIntArray308[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static86.anInt1942; local26++) {
				local11[local26] = this.method400(Static165.anIntArray17[local26], local24) % 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)I")
	private int method400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local10 << 1 ^ local10;
		return 4096 - (Integer.MAX_VALUE & local21 * (local21 * local21 * 15731 + 789221) + 1376312589) / 262144;
	}
}
