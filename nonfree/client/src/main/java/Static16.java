import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
	public static int anInt667;

	@OriginalMember(owner = "client!db", name = "Pb", descriptor = "Lclient!kb;")
	public static Class9 aClass9_10;

	@OriginalMember(owner = "client!db", name = "Sb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!v;")
	private static Class62 aClass62_261 = Static45.method753("Take");

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!v;")
	private static Class62 aClass62_262 = Static45.method753("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!db", name = "Hb", descriptor = "Lclient!v;")
	private static Class62 aClass62_268 = Static45.method753("You have only just left another world)3");

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_263 = aClass62_268;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "Lclient!v;")
	public static Class62 aClass62_264 = aClass62_262;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "Lclient!v;")
	public static Class62 aClass62_265 = aClass62_261;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_8 = new Class34(64);

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "Lclient!v;")
	public static Class62 aClass62_266 = null;

	@OriginalMember(owner = "client!db", name = "Qb", descriptor = "Lclient!v;")
	private static Class62 aClass62_271 = Static45.method753(" ");

	@OriginalMember(owner = "client!db", name = "Nb", descriptor = "Lclient!v;")
	public static Class62 aClass62_269 = aClass62_271;

	@OriginalMember(owner = "client!db", name = "Ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_270 = Static45.method753("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!db", name = "Rb", descriptor = "[I")
	public static int[] anIntArray52 = new int[16384];

	@OriginalMember(owner = "client!db", name = "Tb", descriptor = "Lclient!v;")
	public static Class62 aClass62_272 = Static45.method753(" )2> @yel@");

	@OriginalMember(owner = "client!db", name = "Ub", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method432() {
		Static74.method1200();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static27.anInt813 == 2) {
			@Pc(12) int[] local12 = Static97.anIntArray305;
			@Pc(15) byte[] local15 = Static46.aClass3_Sub1_Sub1_Sub1_13.aByteArray3;
			local18 = local15.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local15[local20] == 0) {
					local12[local20] = 0;
				}
			}
			Static56.aClass3_Sub1_Sub1_Sub4_1.method1742(0, 0, 33, 33, 25, 25, Static53.anInt1432, 256, Static92.anIntArray270, Static100.anIntArray272);
			Static45.method749();
			return;
		}
		@Pc(55) int local55 = Static53.anInt1432 + Static99.anInt2602 & 0x7FF;
		@Pc(62) int local62 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32 + 48;
		local18 = 464 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
		Static99.aClass3_Sub1_Sub1_Sub4_5.method1742(25, 5, 146, 151, local62, local18, local55, Static42.anInt1215 + 256, Static9.anIntArray198, Static98.anIntArray282);
		for (local20 = 0; local20 < Static37.anInt1124; local20++) {
			local18 = Static49.anIntArray111[local20] * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
			local62 = Static92.anIntArray269[local20] * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
			Static74.method1196(local62, Static76.aClass3_Sub1_Sub1_Sub4Array42[local20], local18);
		}
		@Pc(133) int local133;
		for (@Pc(129) int local129 = 0; local129 < 104; local129++) {
			for (local133 = 0; local133 < 104; local133++) {
				@Pc(143) Class24 local143 = Static40.aClass24ArrayArrayArray1[Static27.anInt818][local129][local133];
				if (local143 != null) {
					local62 = local129 * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
					local18 = local133 * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
					Static74.method1196(local62, Static27.aClass3_Sub1_Sub1_Sub4Array16[0], local18);
				}
			}
		}
		for (local133 = 0; local133 < Static39.anInt1159; local133++) {
			@Pc(201) Class3_Sub1_Sub3_Sub1_Sub2 local201 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[anIntArray52[local133]];
			if (local201 != null && local201.method1153()) {
				@Pc(210) Class3_Sub1_Sub4 local210 = local201.aClass3_Sub1_Sub4_1;
				if (local210.anIntArray49 != null) {
					local210 = local210.method443();
				}
				if (local210 != null && local210.aBoolean32 && local210.aBoolean33) {
					local18 = local201.anInt1887 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
					local62 = local201.anInt1882 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
					Static74.method1196(local62, Static27.aClass3_Sub1_Sub1_Sub4Array16[1], local18);
				}
			}
		}
		@Pc(272) Class3_Sub1_Sub3_Sub1_Sub1 local272;
		for (@Pc(264) int local264 = 0; local264 < Static91.anInt2431; local264++) {
			local272 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static6.anIntArray21[local264]];
			if (local272 != null && local272.method1153()) {
				local62 = local272.anInt1882 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
				local18 = local272.anInt1887 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
				@Pc(301) boolean local301 = false;
				@Pc(306) long local306 = local272.aClass62_570.method1701();
				for (@Pc(308) int local308 = 0; local308 < Static24.anInt762; local308++) {
					if (Static49.aLongArray15[local308] == local306 && Static58.anIntArray167[local308] != 0) {
						local301 = true;
						break;
					}
				}
				@Pc(330) boolean local330 = false;
				if (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1352 != 0 && local272.anInt1352 != 0 && local272.anInt1352 == Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1352) {
					local330 = true;
				}
				if (local301) {
					Static74.method1196(local62, Static27.aClass3_Sub1_Sub1_Sub4Array16[3], local18);
				} else if (local330) {
					Static74.method1196(local62, Static27.aClass3_Sub1_Sub1_Sub4Array16[4], local18);
				} else {
					Static74.method1196(local62, Static27.aClass3_Sub1_Sub1_Sub4Array16[2], local18);
				}
			}
		}
		if (Static31.anInt983 != 0 && Static12.anInt451 % 20 < 10) {
			if (Static31.anInt983 == 1 && Static99.anInt2598 >= 0 && Static99.anInt2598 < Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1.length) {
				@Pc(410) Class3_Sub1_Sub3_Sub1_Sub2 local410 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static99.anInt2598];
				if (local410 != null) {
					local62 = local410.anInt1882 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
					local18 = local410.anInt1887 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
					Static86.method1412(Static52.aClass3_Sub1_Sub1_Sub4Array24[1], local62, local18);
				}
			}
			if (Static31.anInt983 == 2) {
				local18 = (Static79.anInt2106 - Static41.anInt1196) * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
				local62 = (Static42.anInt1218 - Static2.anInt56) * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
				Static86.method1412(Static52.aClass3_Sub1_Sub1_Sub4Array24[1], local62, local18);
			}
			if (Static31.anInt983 == 10 && Static56.anInt1569 >= 0 && Static56.anInt1569 < Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1.length) {
				local272 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static56.anInt1569];
				if (local272 != null) {
					local62 = local272.anInt1882 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
					local18 = local272.anInt1887 / 32 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
					Static86.method1412(Static52.aClass3_Sub1_Sub1_Sub4Array24[1], local62, local18);
				}
			}
		}
		if (Static89.anInt2413 != 0) {
			local62 = Static89.anInt2413 * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 / 32;
			local18 = Static55.anInt1539 * 4 + 2 - Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 / 32;
			Static74.method1196(local62, Static52.aClass3_Sub1_Sub1_Sub4Array24[0], local18);
		}
		Static97.method1733(97, 78, 3, 3, 16777215);
		Static56.aClass3_Sub1_Sub1_Sub4_1.method1742(0, 0, 33, 33, 25, 25, Static53.anInt1432, 256, Static92.anIntArray270, Static100.anIntArray272);
		Static45.method749();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lclient!pc;")
	public static Class3_Sub1_Sub13 method433(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub13 local6 = (Class3_Sub1_Sub13) Static33.aClass34_12.method764((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static58.aClass42_44.method1504(4, arg0);
		local6 = new Class3_Sub1_Sub13();
		if (local20 != null) {
			local6.method1280(arg0, new Class3_Sub8(local20));
		}
		local6.method1284();
		Static33.aClass34_12.method765((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
	public static void method434() {
		anIntArray52 = null;
		aClass62_270 = null;
		aClass62_263 = null;
		aByteArrayArrayArray3 = null;
		aClass62_264 = null;
		aClass62_261 = null;
		aClass62_272 = null;
		aClass9_10 = null;
		aClass34_8 = null;
		aClass62_271 = null;
		aClass62_268 = null;
		aBooleanArray2 = null;
		aClass62_266 = null;
		aClass62_262 = null;
		aClass62_265 = null;
		aClass62_269 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZBZ)I")
	public static int method435() {
		return Static98.anInt2584 + Static102.anInt2650;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!mb;III)Z")
	public static boolean method442(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = arg0.method1504(arg2, arg1);
		if (local7 == null) {
			return false;
		} else {
			Static29.method581(local7);
			return true;
		}
	}
}
