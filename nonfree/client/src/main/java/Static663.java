import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!em;")
	public static Class105 aClass105_12;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public static int anInt10236;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
	public static int[] anIntArray662;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_207 = new Class126(54, -1);

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!kh;")
	public static Class208 aClass208_14 = null;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)I")
	public static int method8649(@OriginalArg(1) boolean arg0) {
		if (Static438.anIntArray459 == null) {
			return 0;
		} else if (arg0 || Static49.aClass122Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static438.anIntArray459.length; local22++) {
				@Pc(28) int local28 = Static438.anIntArray459[local22];
				if (Static647.aClass143_143.method3130(local28)) {
					local20++;
				}
				if (Static114.aClass143_26.method3130(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static438.anIntArray459.length * 2;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I")
	public static int method8650(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static522.method7359(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([[[Lclient!ni;I)V")
	public static void method8651(@OriginalArg(0) Class247[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class247[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class247 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass23_Sub2_Sub3_1 instanceof Interface2) {
							((Interface2) local27.aClass23_Sub2_Sub3_1).method7826();
						}
						if (local27.aClass23_Sub2_Sub2_1 instanceof Interface2) {
							((Interface2) local27.aClass23_Sub2_Sub2_1).method7826();
						}
						if (local27.aClass23_Sub2_Sub2_2 instanceof Interface2) {
							((Interface2) local27.aClass23_Sub2_Sub2_2).method7826();
						}
						if (local27.aClass23_Sub2_Sub5_1 instanceof Interface2) {
							((Interface2) local27.aClass23_Sub2_Sub5_1).method7826();
						}
						if (local27.aClass23_Sub2_Sub5_2 instanceof Interface2) {
							((Interface2) local27.aClass23_Sub2_Sub5_2).method7826();
						}
						for (@Pc(83) Class85 local83 = local27.aClass85_3; local83 != null; local83 = local83.aClass85_1) {
							@Pc(88) Class23_Sub2_Sub1 local88 = local83.aClass23_Sub2_Sub1_1;
							if (local88 instanceof Interface2) {
								((Interface2) local88).method7826();
							}
						}
					}
				}
			}
		}
	}
}
