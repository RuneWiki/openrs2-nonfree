import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString57 = "cyan:";

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static14.aBoolean23) {
			return false;
		}
		@Pc(20) int local20 = arg1 >> 16;
		@Pc(24) int local24 = arg1 & 0xFFFF;
		if (Static77.aClass71ArrayArray1[local20] == null || Static77.aClass71ArrayArray1[local20][local24] == null) {
			return false;
		}
		@Pc(43) Class71 local43 = Static77.aClass71ArrayArray1[local20][local24];
		@Pc(56) int local56;
		if (arg0 == -1 && local43.anInt2712 == 0) {
			for (local56 = 0; local56 < Static134.anInt2945; local56++) {
				if (Static61.aShortArray23[local56] == 31 || Static61.aShortArray23[local56] == 1002 || Static61.aShortArray23[local56] == 46 || Static61.aShortArray23[local56] == 13 || Static61.aShortArray23[local56] == 50) {
					for (@Pc(167) Class71 local167 = Static56.method1058(Static164.anIntArray311[local56]); local167 != null; local167 = Static261.method4009(local167)) {
						if (local43.anInt2655 == local167.anInt2655) {
							return true;
						}
					}
				}
			}
		} else {
			for (local56 = 0; local56 < Static134.anInt2945; local56++) {
				if (arg0 == Static219.anIntArray387[local56] && local43.anInt2655 == Static164.anIntArray311[local56] && (Static61.aShortArray23[local56] == 31 || Static61.aShortArray23[local56] == 1002 || Static61.aShortArray23[local56] == 46 || Static61.aShortArray23[local56] == 13 || Static61.aShortArray23[local56] == 50)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method825(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static187.aBooleanArray38[arg0]) {
			return;
		}
		Static298.aClass91_206.method2514(arg0);
		if (Static77.aClass71ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static77.aClass71ArrayArray1[arg0].length; local35++) {
			if (Static77.aClass71ArrayArray1[arg0][local35] != null) {
				if (Static77.aClass71ArrayArray1[arg0][local35].anInt2712 == 2) {
					local33 = false;
				} else {
					Static77.aClass71ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static77.aClass71ArrayArray1[arg0] = null;
		}
		Static187.aBooleanArray38[arg0] = false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method826() {
		for (@Pc(18) Class1_Sub2_Sub5 local18 = (Class1_Sub2_Sub5) Static211.aClass61_23.method1835(); local18 != null; local18 = (Class1_Sub2_Sub5) Static211.aClass61_23.method1836()) {
			@Pc(23) Class14_Sub7 local23 = local18.aClass14_Sub7_1;
			if (Static140.anInt3034 != local23.anInt3402 || local23.aBoolean246) {
				local18.method4441();
			} else if (Static237.anInt4710 >= local23.anInt3403) {
				local23.method2754(Static129.anInt2881);
				if (local23.aBoolean246) {
					local18.method4441();
				} else {
					Static22.method423(local23.anInt3402, local23.anInt3410, local23.anInt3411, local23.anInt3413, 60, local23, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIIIIBIII)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg2 - arg0;
		@Pc(12) int local12 = arg4 - arg8;
		@Pc(20) int local20 = (arg7 - arg3 << 16) / local12;
		@Pc(28) int local28 = (arg5 - arg6 << 16) / local7;
		Static183.method3512(arg3, local20, arg4, arg0, arg6, arg8, local28, arg1, arg2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)I")
	public static int method831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg1 & arg0 - 1;
		@Pc(28) int local28 = Static20.method378(local17, local7);
		@Pc(35) int local35 = Static20.method378(local17, local7 + 1);
		@Pc(42) int local42 = Static20.method378(local17 + 1, local7);
		@Pc(56) int local56 = Static20.method378(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static150.method2614(local13, local35, arg0, local28);
		@Pc(70) int local70 = Static150.method2614(local13, local56, arg0, local42);
		return Static150.method2614(local23, local70, arg0, local63);
	}
}
