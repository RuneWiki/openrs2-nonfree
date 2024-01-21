import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 aClass2_Sub1_Sub9_Sub3_18;

	@OriginalMember(owner = "client!cf", name = "Nb", descriptor = "Lclient!kc;")
	public static Class22 aClass22_4;

	@OriginalMember(owner = "client!cf", name = "Ub", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!cf", name = "Zb", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lclient!wd;")
	private static Class80 aClass80_267 = Static2.method59("New User");

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "Lclient!wd;")
	public static Class80 aClass80_268 = Static2.method59("gleiten:");

	@OriginalMember(owner = "client!cf", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_269 = Static2.method59(":: (X");

	@OriginalMember(owner = "client!cf", name = "ic", descriptor = "Lclient!wd;")
	private static Class80 aClass80_277 = Static2.method59("Accept trade");

	@OriginalMember(owner = "client!cf", name = "hb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_270 = aClass80_277;

	@OriginalMember(owner = "client!cf", name = "pb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_272 = Static2.method59("huffman");

	@OriginalMember(owner = "client!cf", name = "Ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_273 = aClass80_267;

	@OriginalMember(owner = "client!cf", name = "Bb", descriptor = "I")
	public static int anInt796 = 0;

	@OriginalMember(owner = "client!cf", name = "Fb", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!cf", name = "Gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_274 = Static2.method59("sl_arrows");

	@OriginalMember(owner = "client!cf", name = "Lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_275 = Static2.method59("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!cf", name = "gc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_276 = Static2.method59("Ignorieren");

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public static void method421() {
		aClass80_275 = null;
		aClass80_269 = null;
		aClass22_4 = null;
		aClass80_267 = null;
		aClass2_Sub1_Sub9_Sub3_18 = null;
		aClass80_268 = null;
		aClass80_274 = null;
		aClass80_270 = null;
		aClass80_273 = null;
		anIntArray99 = null;
		aClass80_276 = null;
		aClass80_277 = null;
		aClass80_272 = null;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public static void method426() {
		try {
			if (Static17.anInt650 == 1) {
				@Pc(18) int local18 = Static44.aClass2_Sub2_Sub3_2.method1390();
				if (local18 > 0 && Static44.aClass2_Sub2_Sub3_2.method1381()) {
					local18 -= Static15.anInt428;
					if (local18 < 0) {
						local18 = 0;
					}
					Static44.aClass2_Sub2_Sub3_2.method1389(local18);
				} else {
					Static44.aClass2_Sub2_Sub3_2.method1379();
					Static44.aClass2_Sub2_Sub3_2.method1388();
					if (Static5.aClass11_4 == null) {
						Static17.anInt650 = 0;
					} else {
						Static17.anInt650 = 2;
					}
					Static126.aClass55_1 = null;
					Static113.aClass2_Sub7_1 = null;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static44.aClass2_Sub2_Sub3_2.method1379();
			Static5.aClass11_4 = null;
			Static17.anInt650 = 0;
			Static113.aClass2_Sub7_1 = null;
			Static126.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
	public static void method427() {
		for (@Pc(15) Class2_Sub1_Sub1_Sub3 local15 = (Class2_Sub1_Sub1_Sub3) Static93.aClass58_12.method1285(); local15 != null; local15 = (Class2_Sub1_Sub1_Sub3) Static93.aClass58_12.method1281()) {
			if (local15.anInt406 != Static16.anInt444 || Static10.anInt300 > local15.anInt403) {
				local15.method1961();
			} else if (local15.anInt411 <= Static10.anInt300) {
				if (local15.anInt414 > 0) {
					@Pc(47) Class2_Sub1_Sub1_Sub4_Sub1 local47 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local15.anInt414 - 1];
					if (local47 != null && local47.anInt2370 >= 0 && local47.anInt2370 < 13312 && local47.anInt2324 >= 0 && local47.anInt2324 < 13312) {
						local15.method245(local47.anInt2370, local47.anInt2324, Static24.method513(local47.anInt2370, local15.anInt406, local47.anInt2324) - local15.anInt410, Static10.anInt300);
					}
				}
				if (local15.anInt414 < 0) {
					@Pc(97) int local97 = -local15.anInt414 - 1;
					@Pc(106) Class2_Sub1_Sub1_Sub4_Sub2 local106;
					if (local97 == Static28.anInt2311) {
						local106 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1;
					} else {
						local106 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local97];
					}
					if (local106 != null && local106.anInt2370 >= 0 && local106.anInt2370 < 13312 && local106.anInt2324 >= 0 && local106.anInt2324 < 13312) {
						local15.method245(local106.anInt2370, local106.anInt2324, Static24.method513(local106.anInt2370, local15.anInt406, local106.anInt2324) - local15.anInt410, Static10.anInt300);
					}
				}
				local15.method246(Static106.anInt2840);
				Static93.aClass64_1.method1633(Static16.anInt444, (int) local15.aDouble2, (int) local15.aDouble4, (int) local15.aDouble5, 60, local15, local15.anInt418, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	public static void method428() {
		Static10.aClass32_8.method878();
		Static94.aClass32_45.method878();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 < 1 || arg1 < 1 || arg4 > 102 || arg1 > 102) {
			return;
		}
		if (Static18.aBoolean51 && arg2 != Static16.anInt444) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg0 == 0) {
			local36 = Static93.aClass64_1.method1656(arg2, arg4, arg1);
		}
		if (arg0 == 1) {
			local36 = Static93.aClass64_1.method1610(arg2, arg4, arg1);
		}
		if (arg0 == 2) {
			local36 = Static93.aClass64_1.method1653(arg2, arg4, arg1);
		}
		if (arg0 == 3) {
			local36 = Static93.aClass64_1.method1620(arg2, arg4, arg1);
		}
		@Pc(94) int local94;
		if (local36 != 0) {
			@Pc(87) int local87 = local36 >> 14 & 0x7FFF;
			local94 = Static93.aClass64_1.method1622(arg2, arg4, arg1, local36);
			@Pc(100) int local100 = local94 >> 6 & 0x3;
			@Pc(104) int local104 = local94 & 0x1F;
			@Pc(115) Class2_Sub1_Sub10 local115;
			if (arg0 == 0) {
				Static93.aClass64_1.method1644(arg2, arg4, arg1);
				local115 = Static18.method404(local87);
				if (local115.anInt1641 != 0) {
					Static17.aClass49Array1[arg2].method1182(local115.aBoolean111, arg4, local104, local100, arg1);
				}
			}
			if (arg0 == 1) {
				Static93.aClass64_1.method1618(arg2, arg4, arg1);
			}
			if (arg0 == 2) {
				Static93.aClass64_1.method1628(arg2, arg4, arg1);
				local115 = Static18.method404(local87);
				if (arg4 + local115.anInt1634 > 103 || arg1 + local115.anInt1634 > 103 || arg4 + local115.anInt1630 > 103 || arg1 + local115.anInt1630 > 103) {
					return;
				}
				if (local115.anInt1641 != 0) {
					Static17.aClass49Array1[arg2].method1171(local115.anInt1630, arg1, arg4, local115.anInt1634, local115.aBoolean111, local100);
				}
			}
			if (arg0 == 3) {
				Static93.aClass64_1.method1615(arg2, arg4, arg1);
				local115 = Static18.method404(local87);
				if (local115.anInt1641 == 1) {
					Static17.aClass49Array1[arg2].method1175(arg4, arg1);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		local94 = arg2;
		if (arg2 < 3 && (Static108.aByteArrayArrayArray7[1][arg4][arg1] & 0x2) == 2) {
			local94 = arg2 + 1;
		}
		Static36.method632(Static17.aClass49Array1[arg2], arg4, Static93.aClass64_1, local94, arg5, arg2, arg1, arg6, arg3);
		return;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)I")
	public static int method433() {
		return Static29.anInt1062++;
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)Z")
	public static boolean method436() {
		@Pc(5) Class57 local5 = Static5.aClass57_1;
		synchronized (Static5.aClass57_1) {
			if (Static29.anInt1065 == Static102.anInt2669) {
				return false;
			} else {
				Static79.anInt2013 = Static38.anIntArray153[Static102.anInt2669];
				Static30.anInt1076 = Static95.anIntArray317[Static102.anInt2669];
				Static102.anInt2669 = Static102.anInt2669 + 1 & 0x7F;
				return true;
			}
		}
	}
}
