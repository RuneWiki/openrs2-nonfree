import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Lclient!he;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
	public static int anInt980;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!sa;")
	public static Class72 aClass72_10 = new Class72(100);

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public static int anInt977 = 0;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_482 = Static51.method932("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_483 = Static51.method932("::rect_debug");

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_484 = Static51.method932("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub1_Sub10 local7 = Static62.method1106(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local7.method1581(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method788() {
		aClass10_483 = null;
		aClass10_482 = null;
		aClass34_1 = null;
		aClass72_10 = null;
		aClass10_484 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIZI)V")
	public static void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static55.anInt1413 == arg3 && arg0 == Static77.anInt1800 && (Static27.anInt760 == arg2 || !Static170.aBoolean163)) {
			return;
		}
		Static55.anInt1413 = arg3;
		Static27.anInt760 = arg2;
		Static77.anInt1800 = arg0;
		if (!Static170.aBoolean163) {
			Static27.anInt760 = 0;
		}
		Static45.method870(25);
		Static170.method2617(true, Static20.aClass10_244);
		@Pc(44) int local44 = Static137.anInt3049;
		Static137.anInt3049 = (arg3 - 6) * 8;
		@Pc(52) int local52 = Static85.anInt1937;
		@Pc(56) int local56 = Static137.anInt3049 - local44;
		Static85.anInt1937 = arg0 * 8 - 48;
		@Pc(68) int local68 = Static85.anInt1937 - local52;
		for (@Pc(72) int local72 = 0; local72 < 32768; local72++) {
			@Pc(78) Class2_Sub1_Sub3_Sub2_Sub2 local78 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local72];
			if (local78 != null) {
				for (@Pc(82) int local82 = 0; local82 < 10; local82++) {
					local78.anIntArray365[local82] -= local56;
					local78.anIntArray366[local82] -= local68;
				}
				local78.anInt3499 -= local68 * 128;
				local78.anInt3454 -= local56 * 128;
			}
		}
		for (@Pc(128) int local128 = 0; local128 < 2048; local128++) {
			@Pc(134) Class2_Sub1_Sub3_Sub2_Sub1 local134 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local128];
			if (local134 != null) {
				for (@Pc(138) int local138 = 0; local138 < 10; local138++) {
					local134.anIntArray365[local138] -= local56;
					local134.anIntArray366[local138] -= local68;
				}
				local134.anInt3454 -= local56 * 128;
				local134.anInt3499 -= local68 * 128;
			}
		}
		Static56.anInt1432 = arg2;
		@Pc(186) byte local186 = 0;
		Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2468(arg4, false, arg1);
		@Pc(194) byte local194 = 1;
		@Pc(196) byte local196 = 104;
		@Pc(198) byte local198 = 104;
		@Pc(200) byte local200 = 1;
		if (local56 < 0) {
			local186 = 103;
			local194 = -1;
			local196 = -1;
		}
		@Pc(213) byte local213 = 0;
		if (local68 < 0) {
			local200 = -1;
			local213 = 103;
			local198 = -1;
		}
		for (@Pc(223) int local223 = local186; local223 != local196; local223 += local194) {
			for (@Pc(227) int local227 = local213; local227 != local198; local227 += local200) {
				@Pc(233) int local233 = local227 + local68;
				@Pc(237) int local237 = local56 + local223;
				for (@Pc(239) int local239 = 0; local239 < 4; local239++) {
					if (local237 >= 0 && local233 >= 0 && local237 < 104 && local233 < 104) {
						Static132.aClass12ArrayArrayArray1[local239][local223][local227] = Static132.aClass12ArrayArrayArray1[local239][local237][local233];
					} else {
						Static132.aClass12ArrayArrayArray1[local239][local223][local227] = null;
					}
				}
			}
		}
		for (@Pc(306) Class2_Sub19 local306 = (Class2_Sub19) Static158.aClass12_13.method384(); local306 != null; local306 = (Class2_Sub19) Static158.aClass12_13.method381()) {
			local306.anInt2993 -= local56;
			local306.anInt2998 -= local68;
			if (local306.anInt2993 < 0 || local306.anInt2998 < 0 || local306.anInt2993 >= 104 || local306.anInt2998 >= 104) {
				local306.method2705();
			}
		}
		Static107.anInt2445 = -1;
		if (Static109.anInt2502 != 0) {
			Static109.anInt2502 -= local56;
			anInt979 -= local68;
		}
		Static161.aBoolean153 = false;
		Static48.anInt1160 = 0;
		Static177.aClass12_16.method386();
		Static81.aClass12_6.method386();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!kh;Lclient!kh;Lclient!wb;Lclient!kh;)Z")
	public static boolean method791(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class2_Sub5_Sub4 arg2, @OriginalArg(4) Class29 arg3) {
		Static178.aClass2_Sub5_Sub4_2 = arg2;
		Static176.aClass29_72 = arg3;
		Static130.aClass29_56 = arg0;
		Static2.aClass29_1 = arg1;
		return true;
	}
}
