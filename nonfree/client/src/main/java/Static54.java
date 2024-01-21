import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!j", name = "m", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_7;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_555 = Static78.method1313("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt1288 = 0;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public static int anInt1294 = -1;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public static int anInt1295 = 0;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_556 = Static78.method1313("Die Verbindung konnte");

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	public static int anInt1298 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!oc;IZLclient!oc;I)Lclient!id;")
	public static Class1_Sub2_Sub10 method1021(@OriginalArg(0) Class56 arg0, @OriginalArg(3) Class56 arg1, @OriginalArg(4) int arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) int[] local12 = arg0.method1274(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method1270(local12[local14], arg2);
			if (local24 == null) {
				local3 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(52) byte[] local52 = arg1.method1270(0, local44);
				if (local52 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub10(arg0, arg1, arg2, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBIILclient!qe;)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub17 arg3) {
		if (Static122.anInt2922 >= 50 || Static21.anInt601 == 0 || (arg3.anIntArray409 == null || arg0 >= arg3.anIntArray409.length)) {
			return;
		}
		@Pc(32) int local32 = arg3.anIntArray409[arg0];
		if (local32 == 0) {
			return;
		}
		@Pc(39) int local39 = local32 >> 8;
		Static78.anIntArray312[Static122.anInt2922] = local39;
		@Pc(49) int local49 = local32 >> 4 & 0x7;
		Static122.anIntArray496[Static122.anInt2922] = local49;
		Static1.anIntArray7[Static122.anInt2922] = 0;
		Static22.aClass16Array2[Static122.anInt2922] = null;
		@Pc(67) int local67 = (arg1 - 64) / 128;
		@Pc(73) int local73 = (arg2 - 64) / 128;
		@Pc(77) int local77 = local32 & 0xF;
		Static42.anIntArray217[Static122.anInt2922] = (local67 << 16) + (local73 << 8) + local77;
		Static122.anInt2922++;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1023() {
		Static106.method1722();
		Static124.aBoolean129 = true;
		Static6.method104();
		@Pc(31) boolean local31;
		if (Static33.anInt922 != -1) {
			local31 = Static25.method589(Static33.anInt922, 261, 1, 190);
			if (!local31) {
				Static90.aBoolean98 = true;
			}
		} else if (Static22.anIntArray162[Static90.anInt2027] != -1) {
			local31 = Static25.method589(Static22.anIntArray162[Static90.anInt2027], 261, 1, 190);
			if (!local31) {
				Static90.aBoolean98 = true;
			}
		}
		if (Static82.aBoolean77 && Static42.anInt1133 == 1) {
			if (Static34.anInt947 == 1) {
				Static108.method1743();
			} else {
				Static27.method601();
			}
		}
		Static69.method1144();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!dc;Lclient!fc;I)I")
	public static int method1024(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) Class25 arg1) {
		@Pc(2) int local2 = arg0.anInt792;
		arg0.method664(arg1.anInt956);
		arg0.anInt792 += Static129.aClass76_1.method1863(0, arg1.aByteArray15, arg1.anInt956, arg0.anInt792, arg0.aByteArray13);
		return arg0.anInt792 - local2;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method1025() {
		aClass25_556 = null;
		aClass1_Sub2_Sub2_Sub4_7 = null;
		aClass25_555 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	public static void method1026() {
		if (Static87.aClass1_Sub2_Sub14_3 == null) {
			return;
		}
		@Pc(13) Class1_Sub2_Sub14 local13 = Static87.aClass1_Sub2_Sub14_3;
		@Pc(17) Class1_Sub2_Sub14 local17 = Static109.method1752(local13);
		if (local17 == null) {
			Static87.aClass1_Sub2_Sub14_3 = null;
			return;
		}
		Static95.anInt2166++;
		@Pc(28) int local28 = Static10.anInt264;
		@Pc(30) int local30 = Static111.anInt2597;
		if (Static33.anInt921 == 0) {
			local30 -= 4;
			local28 -= 4;
		}
		if (Static33.anInt921 == 1) {
			local30 -= 205;
			local28 -= 553;
		}
		if (Static33.anInt921 == 2) {
			local30 -= 357;
			local28 -= 17;
		}
		local30 -= Static87.anInt1638;
		local28 -= Static64.anInt1446;
		@Pc(63) int[] local63 = Static2.method35(local17);
		if (local63[0] > local28) {
			local28 = local63[0];
		}
		if (local17.anInt1911 + local63[0] < local13.anInt1911 + local28) {
			local28 = local63[0] + local17.anInt1911 - local13.anInt1911;
		}
		if (local63[1] > local30) {
			local30 = local63[1];
		}
		@Pc(120) Class1_Sub2_Sub14 local120 = Static56.aClass1_Sub2_Sub14ArrayArray1[local13.anInt1937 >> 16][local13.anInt1905 & 0xFFFF];
		if (local63[1] + local17.anInt1923 < local13.anInt1923 + local30) {
			local30 = local17.anInt1923 + local63[1] - local13.anInt1923;
		}
		@Pc(154) int local154 = local30 + local17.anInt1957 - local63[1];
		@Pc(164) int local164 = local17.anInt1949 + local28 - local63[0];
		@Pc(168) int[] local168 = Static2.method35(local120);
		@Pc(178) int local178 = local120.anInt1949 + local28 - local168[0];
		@Pc(184) int local184 = local178 - local13.anInt1959;
		@Pc(195) int local195 = local30 + local120.anInt1957 - local168[1];
		@Pc(201) int local201 = local195 - local13.anInt1917;
		if (local13.anInt1927 >= local184 && -local13.anInt1927 <= local184 && local13.anInt1927 >= local201 && -local13.anInt1927 <= local201 && !Static27.aBoolean25) {
			local154 -= local201;
			local164 -= local184;
		} else if (local13.anInt1908 < Static95.anInt2166 || Static27.aBoolean25) {
			Static27.aBoolean25 = true;
		} else {
			local164 -= local184;
			local154 -= local201;
		}
		if (Static87.aClass1_Sub2_Sub14_3.anObjectArray19 != null && Static27.aBoolean25) {
			Static27.method600(local13, local13.anObjectArray19, null, local164, local154, 0);
		}
		if (Static42.anInt1139 != 0) {
			return;
		}
		if (Static27.aBoolean25) {
			@Pc(363) Class1_Sub2_Sub14 local363 = Static18.method424(Static87.anInt1638 + local154 - local17.anInt1957, Static64.anInt1446 + -local17.anInt1949 + local164, local17, local13);
			if (Static87.aClass1_Sub2_Sub14_3.anObjectArray13 != null) {
				Static27.method600(local13, local13.anObjectArray13, local363, local164, local154, 0);
			}
			if (local363 != null && Static35.method788(local13) != null) {
				Static68.aClass1_Sub5_Sub1_2.method688(57);
				Static68.aClass1_Sub5_Sub1_2.method631(local13.anInt1942);
				Static68.aClass1_Sub5_Sub1_2.method635(local363.anInt1937);
				Static68.aClass1_Sub5_Sub1_2.method633(local13.anInt1937);
				Static68.aClass1_Sub5_Sub1_2.method647(local363.anInt1942);
			}
		} else {
			if (Static87.aClass1_Sub2_Sub14_3.anObjectArray12 != null) {
				Static27.method600(local13, local13.anObjectArray12, null, local164, local154, 0);
			}
			if ((Static78.anInt1705 == 1 || Static88.method1445(Static108.anInt2503 - 1)) && Static108.anInt2503 > 2) {
				Static60.method1071();
			} else if (Static108.anInt2503 > 0) {
				Static78.method1316(Static108.anInt2503 - 1);
			}
		}
		Static87.aClass1_Sub2_Sub14_3 = null;
		return;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	public static int method1027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(32) int local32 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local32;
		}
		return arg1;
	}
}
