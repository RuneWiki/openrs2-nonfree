import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	public static int anInt3748 = -50;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "([[BILclient!n;)V")
	public static void method2949(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class123_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt6514; local18++) {
			Static487.method7088();
			for (@Pc(24) int local24 = 0; local24 < Static338.anInt6508 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static390.anInt7654 >> 3; local28++) {
					@Pc(38) int local38 = Static119.anIntArrayArrayArray4[local18][local24][local28];
					if (local38 != -1) {
						@Pc(48) int local48 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean443 || local48 == 0) {
							@Pc(59) int local59 = local38 >> 1 & 0x3;
							@Pc(65) int local65 = local38 >> 14 & 0x3FF;
							@Pc(71) int local71 = local38 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local65 / 8 << 8) + local71 / 8;
							for (@Pc(83) int local83 = 0; local83 < Static322.anIntArray351.length; local83++) {
								if (local81 == Static322.anIntArray351[local83] && arg0[local83] != null) {
									@Pc(101) Class4_Sub13 local101 = new Class4_Sub13(arg0[local83]);
									arg1.method5161(local101, local28 * 8, local65, local48, local24 * 8, local71, local18, local59, Static526.aClass232Array1);
									arg1.method5172(local28 * 8, local18, local24 * 8, local71, local101, Static39.aClass7_2, local16[0] == -1 ? local16 : null, local59, local48, local65);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static357.aClass260_1 = Static145.aClass56_1.method1554(local16[2], local16[0], local16[3], Static240.aClass175_1, local16[1]);
			Static280.anInt5804 = local16[4];
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public static void method2951(@OriginalArg(1) int arg0) {
		if (Static491.anInt9287 == 0) {
			Static365.aClass4_Sub21_Sub4_6.method6165(arg0);
		} else {
			Static419.anInt7992 = arg0;
		}
	}
}
