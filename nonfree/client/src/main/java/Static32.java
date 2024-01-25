import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
	public static boolean aBoolean54 = true;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt719 = 0;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!pl;IIII)V")
	public static void method566(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class267 local9 = arg0.method5573();
		@Pc(18) int local18 = arg0.anInt6415 - arg0.aClass147_7.anInt4314 & 0x3FFF;
		if (arg3 == -1) {
			if (local18 != 0 || arg0.anInt6466 > 25) {
				arg0.aBoolean528 = false;
				if (arg2 < 0 && local9.anInt7040 != -1) {
					arg0.anInt6461 = local9.anInt7040;
				} else if (arg2 <= 0 || local9.anInt7048 == -1) {
					arg0.anInt6461 = local9.anInt7024;
				} else {
					arg0.anInt6461 = local9.anInt7048;
				}
			} else if (!arg0.aBoolean528 || !local9.method6006(arg0.anInt6461)) {
				arg0.anInt6461 = local9.method6001();
				arg0.aBoolean528 = arg0.anInt6461 != -1;
			}
		} else if (arg0.anInt6463 != -1 && (local18 >= 10240 || local18 <= 2048)) {
			@Pc(119) int local119 = Static112.anIntArray183[arg1] - arg0.aClass147_7.anInt4314 & 0x3FFF;
			if (arg3 == 2 && local9.anInt7022 != -1) {
				if (local119 > 2048 && local119 <= 6144 && local9.anInt7028 != -1) {
					arg0.anInt6461 = local9.anInt7028;
				} else if (local119 >= 10240 && local119 < 14336 && local9.anInt7037 != -1) {
					arg0.anInt6461 = local9.anInt7037;
				} else if (local119 <= 6144 || local119 >= 10240 || local9.anInt7026 == -1) {
					arg0.anInt6461 = local9.anInt7022;
				} else {
					arg0.anInt6461 = local9.anInt7026;
				}
			} else if (arg3 == 0 && local9.anInt7013 != -1) {
				if (local119 > 2048 && local119 <= 6144 && local9.anInt7018 != -1) {
					arg0.anInt6461 = local9.anInt7018;
				} else if (local119 >= 10240 && local119 < 14336 && local9.anInt7010 != -1) {
					arg0.anInt6461 = local9.anInt7010;
				} else if (local119 <= 6144 || local119 >= 10240 || local9.anInt7034 == -1) {
					arg0.anInt6461 = local9.anInt7013;
				} else {
					arg0.anInt6461 = local9.anInt7034;
				}
			} else if (local119 > 2048 && local119 <= 6144 && local9.anInt7041 != -1) {
				arg0.anInt6461 = local9.anInt7041;
			} else if (local119 >= 10240 && local119 < 14336 && local9.anInt7021 != -1) {
				arg0.anInt6461 = local9.anInt7021;
			} else if (local119 <= 6144 || local119 >= 10240 || local9.anInt7049 == -1) {
				arg0.anInt6461 = local9.anInt7024;
			} else {
				arg0.anInt6461 = local9.anInt7049;
			}
			arg0.aBoolean528 = false;
		} else if (local18 == 0 && arg0.anInt6466 <= 25) {
			arg0.aBoolean528 = false;
			if (arg3 == 2 && local9.anInt7022 != -1) {
				arg0.anInt6461 = local9.anInt7022;
			} else if (arg3 == 0 && local9.anInt7013 != -1) {
				arg0.anInt6461 = local9.anInt7013;
			} else {
				arg0.anInt6461 = local9.anInt7024;
			}
		} else {
			arg0.aBoolean528 = false;
			if (arg3 == 2 && local9.anInt7022 != -1) {
				if (arg2 < 0 && local9.anInt7036 != -1) {
					arg0.anInt6461 = local9.anInt7036;
				} else if (arg2 <= 0 || local9.anInt7039 == -1) {
					arg0.anInt6461 = local9.anInt7022;
				} else {
					arg0.anInt6461 = local9.anInt7039;
				}
			} else if (arg3 == 0 && local9.anInt7013 != -1) {
				if (arg2 < 0 && local9.anInt7046 != -1) {
					arg0.anInt6461 = local9.anInt7046;
				} else if (arg2 <= 0 || local9.anInt7014 == -1) {
					arg0.anInt6461 = local9.anInt7013;
				} else {
					arg0.anInt6461 = local9.anInt7014;
				}
			} else if (arg2 < 0 && local9.anInt7033 != -1) {
				arg0.anInt6461 = local9.anInt7033;
			} else if (arg2 <= 0 || local9.anInt7011 == -1) {
				arg0.anInt6461 = local9.anInt7024;
			} else {
				arg0.anInt6461 = local9.anInt7011;
			}
		}
	}
}
