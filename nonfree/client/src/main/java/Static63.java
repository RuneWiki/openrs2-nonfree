import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!rd;")
	public static Class64 aClass64_47;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public static int anInt1604;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_817 = Static75.method1216("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
	public static int[] anIntArray225 = new int[500];

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_818 = Static75.method1216("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_819 = Static75.method1216("blinken2:");

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
	public static int[] anIntArray226 = new int[25];

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_820 = Static75.method1216("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)V")
	public static void method1083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static83.aClass4Array15[local9] != null) {
				@Pc(27) int local27 = Static42.anIntArray157[local9];
				@Pc(38) int local38 = Static24.anInt681 + 70 + 4 - local7 * 14;
				if (local38 < -20) {
					break;
				}
				@Pc(47) Class4 local47 = Static100.aClass4Array18[local9];
				if (local47 != null && local47.method132(Static93.aClass4_1336)) {
					local47 = local47.method137(5);
				}
				if (local47 != null && local47.method132(Static75.aClass4_996)) {
					local47 = local47.method137(5);
				}
				if (local27 == 0) {
					local7++;
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static58.anInt1429 == 0 || Static58.anInt1429 == 1 && Static111.method1898(local47))) {
					local7++;
					if (local38 - 14 < arg1 && local38 >= arg1 && !local47.method151(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302)) {
						if (Static67.anInt1652 >= 1) {
							Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 11, Static92.aClass4_1182, 0, 0, 0);
						}
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 1, Static35.aClass4_322, 0, 0, 0);
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 59, Static83.aClass4_1093, 0, 0, 0);
					}
				}
				if ((local27 == 3 || local27 == 7) && Static112.anInt2829 == 0 && (local27 == 7 || Static55.anInt1391 == 0 || Static55.anInt1391 == 1 && Static111.method1898(local47))) {
					local7++;
					if (arg1 > local38 - 14 && local38 >= arg1) {
						if (Static67.anInt1652 >= 1) {
							Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 11, Static92.aClass4_1182, 0, 0, 0);
						}
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 1, Static35.aClass4_322, 0, 0, 0);
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 59, Static83.aClass4_1093, 0, 0, 0);
					}
				}
				if (local27 == 4 && (Static44.anInt1146 == 0 || Static44.anInt1146 == 1 && Static111.method1898(local47))) {
					if (local38 - 14 < arg1 && arg1 <= local38) {
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 4, Static27.aClass4_389, 0, 0, 0);
					}
					local7++;
				}
				if ((local27 == 5 || local27 == 6) && Static112.anInt2829 == 0 && Static55.anInt1391 < 2) {
					local7++;
				}
				if (local27 == 8 && (Static44.anInt1146 == 0 || Static44.anInt1146 == 1 && Static111.method1898(local47))) {
					if (arg1 > local38 - 14 && arg1 <= local38) {
						Static62.method1082(Static60.method1012(new Class4[] { Static46.aClass4_1539, local47 }), 56, Static101.aClass4_1389, 0, 0, 0);
					}
					local7++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public static void method1084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class3_Sub1_Sub8 local5 = Static20.method291(arg0);
		@Pc(12) int local12 = local5.anInt1714;
		@Pc(15) int local15 = local5.anInt1716;
		@Pc(18) int local18 = local5.anInt1719;
		@Pc(24) int local24 = Class3_Sub1_Sub13.anIntArray263[local18 - local15];
		if (arg1 < 0 || local24 < arg1) {
			arg1 = 0;
		}
		local24 <<= local15;
		Static106.anIntArray329[local12] = local24 & arg1 << local15 | ~local24 & Static106.anIntArray329[local12];
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIILclient!qa;[Lclient!jd;I)V")
	public static void method1085(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) Class40[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = -1;
		@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(arg0);
		while (true) {
			@Pc(24) int local24 = local20.method444();
			if (local24 == 0) {
				return;
			}
			local15 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local20.method444();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(66) int local66 = local57 + arg1;
				@Pc(70) int local70 = local20.method446();
				@Pc(74) int local74 = arg4 + local51;
				@Pc(78) int local78 = local70 >> 2;
				@Pc(82) int local82 = local70 & 0x3;
				if (local66 > 0 && local74 > 0 && local66 < 103 && local74 < 103) {
					@Pc(101) int local101 = local61;
					@Pc(103) Class40 local103 = null;
					if ((Static11.aByteArrayArrayArray55[1][local66][local74] & 0x2) == 2) {
						local101 = local61 - 1;
					}
					if (local101 >= 0) {
						local103 = arg3[local101];
					}
					Static89.method1398(local15, local66, arg2, local61, local103, local82, local78, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZLclient!ad;Lclient!ad;)V")
	public static void method1086(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class4 arg2) {
		if (Static103.aBoolean216) {
			Static103.aBoolean216 = false;
			Static22.method300();
			Static24.method466();
			Static32.method635();
			Static106.method1808();
			Static68.method1115(Static55.anInt1391, Static58.anInt1429, Static44.anInt1146, Static71.aClass3_Sub1_Sub4_Sub4_2);
			Static65.method1097(Static10.anInt336 == -1, Static70.anInt1686, -1, Static13.anIntArray15);
			Static3.aBoolean193 = true;
			Static72.aBoolean134 = true;
			Static42.aBoolean80 = true;
		}
		Static12.method214();
		@Pc(43) short local43 = 151;
		@Pc(44) int local44 = local43 - 3;
		Static71.aClass3_Sub1_Sub4_Sub4_2.method1869(arg1, 257, 148, 0);
		Static71.aClass3_Sub1_Sub4_Sub4_2.method1869(arg1, 256, 147, 16777215);
		if (arg2 != null) {
			local44 += 15;
			if (arg0) {
				@Pc(69) int local69 = Static71.aClass3_Sub1_Sub4_Sub4_2.method1859(arg2) + 4;
				Static50.method1840(257 - local69 / 2, 152, local69, 11, 0);
			}
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1869(arg2, 257, 163, 0);
			Static71.aClass3_Sub1_Sub4_Sub4_2.method1869(arg2, 256, 162, 16777215);
		}
		Static52.method884();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLclient!rd;Lclient!rd;Lclient!rd;)V")
	public static void method1087(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1, @OriginalArg(3) Class64 arg2) {
		Static43.aClass64_34 = arg2;
		Static95.aClass64_64 = arg1;
		Static24.aClass64_19 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1088() {
		aClass4_818 = null;
		anIntArray226 = null;
		aClass64_47 = null;
		aClass4_819 = null;
		aClass4_817 = null;
		aClass4_820 = null;
		anIntArray225 = null;
	}
}
