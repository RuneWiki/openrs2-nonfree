import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!hd", name = "tc", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1019 = Static14.method2017("Your account is already logged in)3");

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1020 = Static14.method2017("Freunde");

	@OriginalMember(owner = "client!hd", name = "Mb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1021 = Static14.method2017("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "[I")
	public static int[] anIntArray253 = new int[5];

	@OriginalMember(owner = "client!hd", name = "Pb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1022 = Static14.method2017("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!hd", name = "rc", descriptor = "I")
	public static int anInt2190 = 0;

	@OriginalMember(owner = "client!hd", name = "uc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1024 = Static14.method2017("gr-Un:");

	@OriginalMember(owner = "client!hd", name = "Cc", descriptor = "I")
	public static int anInt2199 = 0;

	@OriginalMember(owner = "client!hd", name = "Ec", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1025 = aClass36_1019;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V")
	public static void method1545() {
		Static92.anIntArray293 = null;
		Static43.anIntArray161 = null;
		Static36.anIntArray132 = null;
		Static27.anIntArray60 = null;
		Static64.anIntArray204 = null;
		Static42.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!kc;ZILclient!kc;)V")
	public static void method1546(@OriginalArg(0) Class36 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2) {
		if (Static49.anInt1312 == -1) {
			Static115.aBoolean77 = true;
		}
		if (arg1 == 0 && Static39.anInt980 != -1) {
			Static95.anInt2522 = 0;
			Static90.aClass36_1092 = arg0;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static88.anIntArray270[local26] = Static88.anIntArray270[local26 - 1];
			Static8.aClass36Array5[local26] = Static8.aClass36Array5[local26 - 1];
			Static99.aClass36Array35[local26] = Static99.aClass36Array35[local26 - 1];
		}
		Static88.anIntArray270[0] = arg1;
		Static8.aClass36Array5[0] = arg2;
		Static99.aClass36Array35[0] = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
	public static void method1547() {
		aClass36_1021 = null;
		aClass36_1019 = null;
		anIntArray253 = null;
		aClass36_1024 = null;
		aClass36_1025 = null;
		aClass36_1020 = null;
		anIntArray256 = null;
		aClass36_1022 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!lc;III)V")
	public static void method1548(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static43.anInt1141 >= 400) {
			return;
		}
		if (arg1.anIntArray192 != null) {
			arg1 = arg1.method1071();
		}
		if (arg1 == null || !arg1.aBoolean72) {
			return;
		}
		@Pc(33) Class36 local33 = arg1.aClass36_738;
		if (arg1.anInt1539 != 0) {
			local33 = Static49.method949(new Class36[] { local33, Static15.method274(arg1.anInt1539, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2222), Static115.aClass36_880, Static6.aClass36_90, Static57.method1055(arg1.anInt1539), Static13.aClass36_174 });
		}
		if (Static20.anInt500 == 1) {
			Static34.method717(9, arg0, arg3, Static49.method949(new Class36[] { Static78.aClass36_958, Static33.aClass36_216, local33 }), arg2, Static27.aClass36_397);
		} else if (!Static56.aBoolean70) {
			@Pc(121) Class36[] local121 = arg1.aClass36Array27;
			if (Static20.aBoolean17) {
				local121 = Static39.method753(local121);
			}
			@Pc(131) int local131;
			if (local121 != null) {
				for (local131 = 4; local131 >= 0; local131--) {
					if (local121[local131] != null && !local121[local131].method1024(Static3.aClass36_645)) {
						@Pc(146) byte local146 = 0;
						if (local131 == 0) {
							local146 = 26;
						}
						if (local131 == 1) {
							local146 = 58;
						}
						if (local131 == 2) {
							local146 = 54;
						}
						if (local131 == 3) {
							local146 = 53;
						}
						if (local131 == 4) {
							local146 = 51;
						}
						Static34.method717(local146, arg0, arg3, Static49.method949(new Class36[] { Static50.aClass36_658, local33 }), arg2, local121[local131]);
					}
				}
			}
			if (local121 != null) {
				for (local131 = 4; local131 >= 0; local131--) {
					if (local121[local131] != null && local121[local131].method1024(Static3.aClass36_645)) {
						@Pc(225) short local225 = 0;
						@Pc(227) int local227 = 0;
						if (arg1.anInt1539 > Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anInt2222) {
							local225 = 2000;
						}
						if (local131 == 0) {
							local227 = local225 + 26;
						}
						if (local131 == 1) {
							local227 = local225 + 58;
						}
						if (local131 == 2) {
							local227 = local225 + 54;
						}
						if (local131 == 3) {
							local227 = local225 + 53;
						}
						if (local131 == 4) {
							local227 = local225 + 51;
						}
						Static34.method717(local227, arg0, arg3, Static49.method949(new Class36[] { Static50.aClass36_658, local33 }), arg2, local121[local131]);
					}
				}
			}
			Static34.method717(1002, arg0, arg3, Static49.method949(new Class36[] { Static50.aClass36_658, local33 }), arg2, Static117.aClass36_903);
		} else if ((Static88.anInt2320 & 0x2) == 2) {
			Static34.method717(25, arg0, arg3, Static49.method949(new Class36[] { Static73.aClass36_890, Static33.aClass36_216, local33 }), arg2, Static55.aClass36_1328);
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZB)V")
	public static void method1551(@OriginalArg(0) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static108.anInt2775; local7++) {
			@Pc(15) Class2_Sub1_Sub4_Sub2_Sub1 local15 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[Static51.anIntArray316[local7]];
			@Pc(23) int local23 = (Static51.anIntArray316[local7] << 14) + 536870912;
			if (local15 != null && local15.method1554() && local15.aClass2_Sub1_Sub9_1.aBoolean73 == arg0 && local15.aClass2_Sub1_Sub9_1.method1080()) {
				@Pc(48) int local48 = local15.anInt2204 >> 7;
				@Pc(53) int local53 = local15.anInt2149 >> 7;
				if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
					if (local15.anInt2163 == 1 && (local15.anInt2204 & 0x7F) == 64 && (local15.anInt2149 & 0x7F) == 64) {
						if (Static74.anInt1988 == Static9.anIntArrayArray5[local48][local53]) {
							continue;
						}
						Static9.anIntArrayArray5[local48][local53] = Static74.anInt1988;
					}
					if (!local15.aClass2_Sub1_Sub9_1.aBoolean72) {
						local23 += Integer.MIN_VALUE;
					}
					Static85.aClass61_1.method1688(Static92.anInt2412, local15.anInt2204, local15.anInt2149, Static56.method1044(local15.anInt2149 + (local15.anInt2163 - 1) * 64, (local15.anInt2163 + -1) * 64 + local15.anInt2204, Static92.anInt2412), local15.anInt2163 * 64 + 60 - 64, local15, local15.anInt2156, local23, local15.aBoolean88);
				}
			}
		}
	}
}
