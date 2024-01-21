import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gh", name = "kb", descriptor = "[I")
	public static int[] anIntArray144 = new int[99];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray144[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			for (@Pc(24) int local24 = 0; local24 < Static54.anInt1423; local24++) {
				local18[local24] = Static36.anIntArray74[local24];
			}
		}
		return local18;
	}
}
