import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ta;")
	public static Class14 aClass14_26;

	@OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	public static int anInt2023;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!ed;")
	public static Class2_Sub1_Sub6 aClass2_Sub1_Sub6_4;

	@OriginalMember(owner = "client!p", name = "A", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_7;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Lclient!kc;")
	private static Class36 aClass36_942 = Static14.method2017("Cancel");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!kc;")
	public static Class36 aClass36_941 = aClass36_942;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!kc;")
	private static Class36 aClass36_943 = Static14.method2017("You have only just left another world)3");

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_944 = Static14.method2017("null");

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	public static int[] anIntArray240 = new int[128];

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!gd;")
	public static Class22 aClass22_26 = new Class22(50);

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_945 = aClass36_943;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!kc;")
	private static Class36 aClass36_947 = Static14.method2017(" more options");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!kc;")
	public static Class36 aClass36_946 = aClass36_947;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!gd;")
	public static Class22 aClass22_27 = new Class22(128);

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!kc;")
	private static Class36 aClass36_949 = Static14.method2017("Loaded gamescreen");

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_948 = aClass36_949;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!bd;")
	public static Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!kc;")
	public static Class36 aClass36_950 = Static14.method2017("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!p", name = "y", descriptor = "I")
	public static int anInt2024 = 0;

	@OriginalMember(owner = "client!p", name = "B", descriptor = "I")
	public static int anInt2025 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)Z")
	public static boolean method1463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static95.anInt2530) {
			return true;
		} else if (arg1 == 1 && arg0 == Static58.anInt1526) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static117.anInt1947 == arg0;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1465() {
		aClass36_942 = null;
		aClass22_27 = null;
		aClass36_945 = null;
		aClass2_Sub1_Sub6_4 = null;
		anIntArray241 = null;
		aClass3_Sub1_7 = null;
		aClass36_946 = null;
		aClass22_26 = null;
		aClass36_948 = null;
		aClass14_26 = null;
		aClass36_941 = null;
		aClass36_949 = null;
		aClass36_950 = null;
		aClass36_943 = null;
		aClass9_1 = null;
		aClass36_947 = null;
		aClass36_944 = null;
		anIntArray240 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!qc;BI)V")
	public static void method1466(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if ((arg0 & 0x40) != 0) {
			arg1.anInt2194 = Static92.aClass2_Sub12_Sub1_3.method1413();
			arg1.anInt2175 = Static92.aClass2_Sub12_Sub1_3.method1413();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt2152 = Static92.aClass2_Sub12_Sub1_3.method1378();
			@Pc(31) int local31 = Static92.aClass2_Sub12_Sub1_3.method1372();
			arg1.anInt2178 = local31 >> 16;
			arg1.anInt2205 = 0;
			arg1.anInt2151 = 0;
			arg1.anInt2173 = Static113.anInt2952 + (local31 & 0xFFFF);
			if (Static113.anInt2952 < arg1.anInt2173) {
				arg1.anInt2151 = -1;
			}
			if (arg1.anInt2152 == 65535) {
				arg1.anInt2152 = -1;
			}
		}
		if ((arg0 & 0x4) != 0) {
			arg1.anInt2157 = Static92.aClass2_Sub12_Sub1_3.method1401();
			if (arg1.anInt2157 == 65535) {
				arg1.anInt2157 = -1;
			}
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if ((arg0 & 0x100) != 0) {
			local100 = Static92.aClass2_Sub12_Sub1_3.method1388();
			local104 = Static92.aClass2_Sub12_Sub1_3.method1388();
			arg1.method1550(Static113.anInt2952, local100, local104);
			arg1.anInt2159 = Static113.anInt2952 + 300;
			arg1.anInt2184 = Static92.aClass2_Sub12_Sub1_3.method1382();
			arg1.anInt2187 = Static92.aClass2_Sub12_Sub1_3.method1399();
		}
		if ((arg0 & 0x10) != 0) {
			local100 = Static92.aClass2_Sub12_Sub1_3.method1413();
			local104 = Static92.aClass2_Sub12_Sub1_3.method1382();
			@Pc(144) int local144 = Static92.aClass2_Sub12_Sub1_3.method1388();
			@Pc(147) int local147 = Static92.aClass2_Sub12_Sub1_3.anInt1939;
			if (arg1.aClass36_1027 != null && arg1.aClass67_2 != null) {
				@Pc(158) long local158 = arg1.aClass36_1027.method1021();
				@Pc(160) boolean local160 = false;
				if (local104 <= 1) {
					for (@Pc(167) int local167 = 0; local167 < Static106.anInt2724; local167++) {
						if (local158 == Static4.aLongArray1[local167]) {
							local160 = true;
							break;
						}
					}
				}
				if (!local160 && Static25.anInt631 == 0) {
					Static24.aClass2_Sub12_2.anInt1939 = 0;
					Static92.aClass2_Sub12_Sub1_3.method1368(local144, Static24.aClass2_Sub12_2.aByteArray20);
					Static24.aClass2_Sub12_2.anInt1939 = 0;
					@Pc(213) Class36 local213 = Static20.method376(Static24.aClass2_Sub12_2).method1032();
					arg1.aClass36_1023 = local213.method1014();
					arg1.anInt2201 = local100 >> 8;
					arg1.anInt2197 = 150;
					arg1.anInt2153 = local100 & 0xFF;
					if (local104 == 2 || local104 == 3) {
						Static40.method1546(local213, 1, Static49.method949(new Class36[] { Static29.aClass36_421, arg1.aClass36_1027 }));
					} else if (local104 == 1) {
						Static40.method1546(local213, 1, Static49.method949(new Class36[] { Static95.aClass36_1209, arg1.aClass36_1027 }));
					} else {
						Static40.method1546(local213, 2, arg1.aClass36_1027);
					}
				}
			}
			Static92.aClass2_Sub12_Sub1_3.anInt1939 = local144 + local147;
		}
		if ((arg0 & 0x1) != 0) {
			local100 = Static92.aClass2_Sub12_Sub1_3.method1378();
			if (local100 == 65535) {
				local100 = -1;
			}
			local104 = Static92.aClass2_Sub12_Sub1_3.method1382();
			Static11.method222(local104, local100, arg1);
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt2186 = Static92.aClass2_Sub12_Sub1_3.method1399();
			arg1.anInt2191 = Static92.aClass2_Sub12_Sub1_3.method1399();
			arg1.anInt2176 = Static92.aClass2_Sub12_Sub1_3.method1391();
			arg1.anInt2182 = Static92.aClass2_Sub12_Sub1_3.method1382();
			arg1.anInt2165 = Static92.aClass2_Sub12_Sub1_3.method1378() + Static113.anInt2952;
			arg1.anInt2188 = Static92.aClass2_Sub12_Sub1_3.method1401() + Static113.anInt2952;
			arg1.anInt2177 = Static92.aClass2_Sub12_Sub1_3.method1382();
			arg1.method1553();
		}
		if ((arg0 & 0x2) != 0) {
			local100 = Static92.aClass2_Sub12_Sub1_3.method1382();
			@Pc(379) byte[] local379 = new byte[local100];
			@Pc(384) Class2_Sub12 local384 = new Class2_Sub12(local379);
			Static92.aClass2_Sub12_Sub1_3.method1371(local100, local379);
			Static55.aClass2_Sub12Array3[arg2] = local384;
			arg1.method1555(local384);
		}
		if ((arg0 & 0x80) != 0) {
			local100 = Static92.aClass2_Sub12_Sub1_3.method1388();
			local104 = Static92.aClass2_Sub12_Sub1_3.method1399();
			arg1.method1550(Static113.anInt2952, local100, local104);
			arg1.anInt2159 = Static113.anInt2952 + 300;
			arg1.anInt2184 = Static92.aClass2_Sub12_Sub1_3.method1391();
			arg1.anInt2187 = Static92.aClass2_Sub12_Sub1_3.method1382();
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.aClass36_1023 = Static92.aClass2_Sub12_Sub1_3.method1404();
		if (arg1.aClass36_1023.method1004(0) == 126) {
			arg1.aClass36_1023 = arg1.aClass36_1023.method1020(1);
			Static40.method1546(arg1.aClass36_1023, 2, arg1.aClass36_1027);
		} else if (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3 == arg1) {
			Static40.method1546(arg1.aClass36_1023, 2, arg1.aClass36_1027);
		}
		arg1.anInt2197 = 150;
		arg1.anInt2153 = 0;
		arg1.anInt2201 = 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)V")
	public static void method1467(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static7.anInt189 >= 100 && Static108.anInt2780 != 1 || Static7.anInt189 >= 200) {
			Static40.method1546(Static96.aClass36_1231, 0, Static105.aClass36_1352);
			return;
		}
		@Pc(38) Class36 local38 = Static114.method2077(arg0).method1017();
		for (@Pc(40) int local40 = 0; local40 < Static7.anInt189; local40++) {
			if (Static24.aLongArray2[local40] == arg0) {
				Static40.method1546(Static49.method949(new Class36[] { local38, Static74.aClass36_912 }), 0, Static105.aClass36_1352);
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static106.anInt2724; local71++) {
			if (arg0 == Static4.aLongArray1[local71]) {
				Static40.method1546(Static49.method949(new Class36[] { Static86.aClass36_1031, local38, Static57.aClass36_714 }), 0, Static105.aClass36_1352);
				return;
			}
		}
		if (local38.method1022(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass36_1027)) {
			return;
		}
		Static43.aClass36Array21[Static7.anInt189] = local38;
		Static24.aLongArray2[Static7.anInt189] = arg0;
		Static36.anIntArray130[Static7.anInt189] = 0;
		Static106.anIntArray330[Static7.anInt189] = 0;
		Static100.aBoolean118 = true;
		Static7.anInt189++;
		Static42.aClass2_Sub12_Sub1_1.method1422(238);
		Static42.aClass2_Sub12_Sub1_1.method1377(arg0);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1468() {
		Static96.aClass14_31.method1472();
		Static53.aClass2_Sub1_Sub1_Sub1_15.method97(0, 0);
		Static59.anIntArray196 = Static87.method1600(Static59.anIntArray196);
	}
}
