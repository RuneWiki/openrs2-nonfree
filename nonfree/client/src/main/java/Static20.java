import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
	public static boolean method375(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILclient!dh;I)V")
	public static void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3_Sub5_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 || Static46.anInt1322 >= 400) {
			return;
		}
		@Pc(52) Class6 local52;
		if (arg2.anInt958 == 0) {
			local52 = Static58.method956(new Class6[] { arg2.aClass6_244, Static176.method2758(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt941, arg2.anInt941), Static39.aClass6_302, Static140.aClass6_951, Static106.method2806(arg2.anInt941), Static104.aClass6_719 });
		} else {
			local52 = Static58.method956(new Class6[] { arg2.aClass6_244, Static39.aClass6_302, Static146.aClass6_1195, Static106.method2806(arg2.anInt958), Static104.aClass6_719 });
		}
		@Pc(133) int local133;
		if (Static122.anInt2841 == 1) {
			Static95.method1546(Static58.method956(new Class6[] { Static128.aClass6_856, Static148.aClass6_1013, local52 }), 1, arg3, arg0, arg1, Static28.aClass6_201);
		} else if (!Static26.aBoolean28) {
			for (local133 = 7; local133 >= 0; local133--) {
				if (Static48.aClass6Array8[local133] != null) {
					@Pc(145) short local145 = 0;
					if (Static48.aClass6Array8[local133].method137(Static160.aClass6_166)) {
						if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt941 < arg2.anInt941) {
							local145 = 2000;
						}
						if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt946 != 0 && arg2.anInt946 != 0) {
							if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt946 == arg2.anInt946) {
								local145 = 2000;
							} else {
								local145 = 0;
							}
						}
					} else if (Static127.aBooleanArray11[local133]) {
						local145 = 2000;
					}
					@Pc(196) int local196 = Static154.anIntArray352[local133] + local145;
					Static95.method1546(Static58.method956(new Class6[] { Static64.aClass6_459, local52 }), local196, arg3, arg0, arg1, Static48.aClass6Array8[local133]);
				}
			}
		} else if ((Static42.anInt1291 & 0x8) == 8) {
			Static95.method1546(Static58.method956(new Class6[] { Static27.aClass6_194, Static148.aClass6_1013, local52 }), 39, arg3, arg0, arg1, Static3.aClass6_29);
		}
		for (local133 = 0; local133 < Static46.anInt1322; local133++) {
			if (Static65.anIntArray104[local133] == 35) {
				Static134.aClass6Array17[local133] = Static58.method956(new Class6[] { Static64.aClass6_459, local52 });
				return;
			}
		}
	}
}
