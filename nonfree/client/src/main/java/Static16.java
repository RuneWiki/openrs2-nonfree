import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_13;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_95 = Static184.method2923("Neuer Benutzer");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!id;")
	public static Class43 aClass43_3 = new Class43(64);

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_96 = Static184.method2923("<col=00ffff>");

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_97 = Static184.method2923("mapscene");

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "Lclient!i;")
	private static Class41 aClass41_101 = Static184.method2923("scroll:");

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_98 = aClass41_101;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt435 = 0;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!i;")
	public static Class41 aClass41_99 = aClass41_101;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Lclient!i;")
	public static Class41 aClass41_100 = Static184.method2923("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I")
	public static int method305(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!i;I)V")
	public static void method306(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class41 local11 = arg0.method1400().method1403();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static50.anInt2126; local15++) {
			@Pc(25) Class12_Sub3_Sub1 local25 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local15]];
			if (local25 != null && local25.aClass41_362 != null && local25.aClass41_362.method1413(local11)) {
				Static183.method925(1, 0, local25.anIntArray414[0], local25.anIntArray412[0], Static213.aClass12_Sub3_Sub1_1.anIntArray412[0], 1, 0, 2, false, 0, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0]);
				local13 = true;
				if (arg1 == 1) {
					Static131.aClass2_Sub3_Sub1_2.method221(65);
					Static131.aClass2_Sub3_Sub1_2.method176(Static156.anIntArray386[local15]);
				} else if (arg1 == 4) {
					Static131.aClass2_Sub3_Sub1_2.method221(214);
					Static131.aClass2_Sub3_Sub1_2.method193(Static156.anIntArray386[local15]);
				} else if (arg1 == 6) {
					Static131.aClass2_Sub3_Sub1_2.method221(161);
					Static131.aClass2_Sub3_Sub1_2.method193(Static156.anIntArray386[local15]);
				} else if (arg1 == 7) {
					Static131.aClass2_Sub3_Sub1_2.method221(47);
					Static131.aClass2_Sub3_Sub1_2.method206(Static156.anIntArray386[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static198.method3075(Static149.method2324(new Class41[] { Static100.aClass41_722, local11 }), 0, Static156.aClass41_981);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZIII)V")
	public static void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = arg3; local3 <= arg1 + arg3; local3++) {
			for (local12 = arg4; local12 <= arg4 + arg2; local12++) {
				if (local12 >= 0 && local12 < 104 && local3 >= 0 && local3 < 104) {
					Static97.aByteArrayArrayArray6[arg0][local12][local3] = 127;
				}
			}
		}
		@Pc(56) int local56;
		for (local12 = arg3; local12 < arg1 + arg3; local12++) {
			for (local56 = arg4; local56 < arg2 + arg4; local56++) {
				if (local56 >= 0 && local56 < 104 && local12 >= 0 && local12 < 104) {
					Static56.anIntArrayArrayArray7[arg0][local56][local12] = arg0 <= 0 ? 0 : Static56.anIntArrayArrayArray7[arg0 - 1][local56][local12];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local56 = arg3 + 1; local56 < arg1 + arg3; local56++) {
				if (local56 >= 0 && local56 < 104) {
					Static56.anIntArrayArrayArray7[arg0][arg4][local56] = Static56.anIntArrayArrayArray7[arg0][arg4 - 1][local56];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local56 = arg4 + 1; local56 < arg2 + arg4; local56++) {
				if (local56 >= 0 && local56 < 104) {
					Static56.anIntArrayArrayArray7[arg0][local56][arg3] = Static56.anIntArrayArrayArray7[arg0][local56][arg3 - 1];
				}
			}
		}
		if (arg4 < 0 || arg3 < 0 || arg4 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg4 > 0 && Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3] != 0) {
				Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3];
				return;
			}
			if (arg3 > 0 && Static56.anIntArrayArrayArray7[arg0][arg4][arg3 - 1] != 0) {
				Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4][arg3 - 1];
				return;
			}
			if (arg4 > 0 && arg3 > 0 && Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3 - 1] != 0) {
				Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static56.anIntArrayArrayArray7[arg0 - 1][arg4 - 1][arg3] != Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3]) {
			Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3];
			return;
		}
		if (arg3 > 0 && Static56.anIntArrayArrayArray7[arg0][arg4][arg3 - 1] != Static56.anIntArrayArrayArray7[arg0 - 1][arg4][arg3 - 1]) {
			Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4][arg3 - 1];
			return;
		}
		if (arg4 > 0 && arg3 > 0 && Static56.anIntArrayArrayArray7[arg0 - 1][arg4 - 1][arg3 - 1] != Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3 - 1]) {
			Static56.anIntArrayArrayArray7[arg0][arg4][arg3] = Static56.anIntArrayArrayArray7[arg0][arg4 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIZILclient!nf;)V")
	public static void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub14 arg4) {
		@Pc(3) Class2_Sub16 local3 = new Class2_Sub16();
		local3.anInt2981 = arg4.anInt3039 * 128;
		local3.anIntArray317 = arg4.anIntArray327;
		local3.anInt2985 = arg1;
		local3.anInt2977 = arg4.anInt3059;
		@Pc(23) int local23 = arg4.anInt3040;
		local3.anInt2979 = arg3 * 128;
		local3.anInt2991 = arg0 * 128;
		local3.anInt2983 = arg4.anInt3051;
		local3.anInt2984 = arg4.anInt3060;
		@Pc(48) int local48 = arg4.anInt3050;
		if (arg2 == 1 || arg2 == 3) {
			local48 = arg4.anInt3040;
			local23 = arg4.anInt3050;
		}
		local3.anInt2982 = (local23 + arg0) * 128;
		local3.anInt2978 = (arg3 + local48) * 128;
		if (arg4.anIntArray324 != null) {
			local3.aClass2_Sub2_Sub14_1 = arg4;
			local3.method2083();
		}
		Static59.aClass108_5.method3334(local3);
		if (local3.anIntArray317 != null) {
			local3.anInt2976 = local3.anInt2984 + (int) ((double) (local3.anInt2983 - local3.anInt2984) * Math.random());
		}
	}
}
