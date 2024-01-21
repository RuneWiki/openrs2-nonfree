import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "Z")
	public static boolean aBoolean20;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[250][];

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_155 = Static38.method685("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Lclient!ai;")
	private static Class6 aClass6_156 = Static38.method685("Connection lost)3");

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "Lclient!dd;")
	public static Class17 aClass17_2 = new Class17(200);

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_157 = aClass6_156;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ka;B[Lclient!l;IIII[BIII)V")
	public static void method397(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class48[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg6);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1439();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method1439();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method1402();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (local53 == arg7 && local49 >= arg4 && local49 < arg4 + 8 && arg5 <= local43 && local43 < arg5 + 8) {
					@Pc(100) Class2_Sub3_Sub6 local100 = Static163.method2609(local12);
					@Pc(117) int local117 = arg3 + Static47.method878(local49 & 0x7, local43 & 0x7, arg2, local100.anInt1195, local100.anInt1205, local65);
					@Pc(134) int local134 = arg8 + Static25.method463(local100.anInt1205, local65, local100.anInt1195, local49 & 0x7, arg2, local43 & 0x7);
					if (local117 > 0 && local134 > 0 && local117 < 103 && local134 < 103) {
						@Pc(154) int local154 = arg9;
						if ((Static164.aByteArrayArrayArray7[1][local117][local134] & 0x2) == 2) {
							local154 = arg9 - 1;
						}
						@Pc(168) Class48 local168 = null;
						if (local154 >= 0) {
							local168 = arg1[local154];
						}
						Static41.method741(arg0, arg2 + local65 & 0x3, local168, local134, arg9, local12, local61, local117);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(Z)Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 method398() {
		@Pc(7) Class2_Sub3_Sub2_Sub1 local7 = new Class2_Sub3_Sub2_Sub1();
		local7.anInt384 = Static88.anIntArray153[0];
		local7.anInt382 = Static14.anIntArray16[0];
		local7.anInt383 = Static163.anInt3833;
		local7.anInt387 = Static131.anIntArray278[0];
		local7.anInt386 = Static130.anInt3018;
		@Pc(34) int local34 = local7.anInt384 * local7.anInt387;
		@Pc(38) byte[] local38 = Static167.aByteArrayArray10[0];
		local7.anInt385 = Static76.anIntArray121[0];
		local7.anIntArray14 = new int[local34];
		for (@Pc(49) int local49 = 0; local49 < local34; local49++) {
			local7.anIntArray14[local49] = Static127.anIntArray258[local38[local49] & 0xFF];
		}
		Static49.method886();
		return local7;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public static void method399() {
		aClass6_156 = null;
		aClass17_2 = null;
		aClass6_155 = null;
		aClass6_157 = null;
		aByteArrayArray2 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!th;)V")
	public static void method400(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static19.anInt509 != 1) {
			return;
		}
		if (Static155.anInt3959 >= 280 && Static155.anInt3959 <= 294 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(0, 0);
			return;
		}
		if (Static155.anInt3959 >= 295 && Static155.anInt3959 <= 360 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(1, 0);
			return;
		}
		if (Static155.anInt3959 >= 390 && Static155.anInt3959 <= 404 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(0, 1);
			return;
		}
		if (Static155.anInt3959 >= 405 && Static155.anInt3959 <= 470 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(1, 1);
			return;
		}
		if (Static155.anInt3959 >= 500 && Static155.anInt3959 <= 514 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(0, 2);
			return;
		}
		if (Static155.anInt3959 >= 515 && Static155.anInt3959 <= 580 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(1, 2);
			return;
		}
		if (Static155.anInt3959 >= 610 && Static155.anInt3959 <= 624 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(0, 3);
			return;
		}
		if (Static155.anInt3959 >= 625 && Static155.anInt3959 <= 690 && Static5.anInt84 >= 4 && Static5.anInt84 <= 18) {
			Static181.method1516(1, 3);
			return;
		}
		if (Static155.anInt3959 >= 708 && Static5.anInt84 >= 4 && Static155.anInt3959 <= 758 && Static5.anInt84 <= 20) {
			Static138.aBoolean134 = false;
			Static132.aClass2_Sub3_Sub2_Sub1_6.method272(0, 0);
			Static173.aClass2_Sub3_Sub2_Sub1_7.method272(382, 0);
			Static113.aClass2_Sub3_Sub2_Sub3_3.method2398(382 - Static113.aClass2_Sub3_Sub2_Sub3_3.anInt3620 / 2, 18);
			return;
		}
		if (Static139.anInt3249 == -1) {
			return;
		}
		@Pc(279) Class18 local279 = Static34.aClass18Array1[Static139.anInt3249];
		if (Static19.aBoolean17 == local279.aBoolean30) {
			@Pc(303) byte[] local303 = Static58.method956(new Class6[] { local279.aClass6_203, Static116.aClass6_799 }).method112();
			Static10.aString1 = new String(local303, 0, local303.length);
			if (Static115.anInt2775 != 0) {
				Static165.anInt3869 = 43594;
				Static120.anInt2810 = 43594;
				Static115.anInt2775 = 0;
				Static132.anInt3073 = 443;
			}
			Static169.anInt3981 = local279.anInt738;
			Static138.aBoolean134 = false;
			Static132.aClass2_Sub3_Sub2_Sub1_6.method272(0, 0);
			Static173.aClass2_Sub3_Sub2_Sub1_7.method272(382, 0);
			Static113.aClass2_Sub3_Sub2_Sub3_3.method2398(382 - Static113.aClass2_Sub3_Sub2_Sub3_3.anInt3620 / 2, 18);
			return;
		}
		@Pc(404) Class6 local404 = Static58.method956(new Class6[] { Static116.aClass6_800, local279.aClass6_203, Static116.aClass6_799, Static9.aClass6_74, Static15.aClass6_127, Static106.method2806(Static113.aBoolean112 ? 1 : 0), Static138.aClass6_940, Static106.method2806(Static101.anInt2159), Static107.aClass6_730, Static106.method2806(Static65.anInt1624) });
		try {
			arg0.getAppletContext().showDocument(local404.method130(), "_self");
		} catch (@Pc(413) Exception local413) {
		}
	}
}
