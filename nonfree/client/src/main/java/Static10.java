import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!ca;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt323 = 0;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static volatile int anInt326 = 0;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
	public static int[] anIntArray48 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_135 = Static59.method1195("chatback");

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
	public static int[] anIntArray49 = new int[32];

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_136 = Static59.method1195("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_137 = Static59.method1195("sl_flags");

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_138 = Static59.method1195("(Z");

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt331 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public static void method308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub13 local12 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg1);
		if (local12 == null) {
			local12 = new Class3_Sub13();
			Static16.aClass82_1.method2303(local12, (long) arg1);
		}
		if (local12.anIntArray214.length <= arg0) {
			@Pc(41) int[] local41 = new int[arg0 + 1];
			@Pc(46) int[] local46 = new int[arg0 + 1];
			for (@Pc(48) int local48 = 0; local48 < local12.anIntArray214.length; local48++) {
				local41[local48] = local12.anIntArray214[local48];
				local46[local48] = local12.anIntArray213[local48];
			}
			for (@Pc(74) int local74 = local12.anIntArray214.length; local74 < arg0; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local12.anIntArray213 = local46;
			local12.anIntArray214 = local41;
		}
		local12.anIntArray214[arg0] = arg2;
		local12.anIntArray213[arg0] = arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method309() {
		if (Static100.anInt2955 == -1) {
			return;
		}
		@Pc(17) Class3_Sub15 local17 = Static68.method1390(Static100.anInt2955, Static24.anInt931);
		if (local17 == null) {
			Static100.anInt2955 = -1;
			Static24.anInt931 = -1;
			return;
		}
		@Pc(30) Class3_Sub15 local30 = Static86.method1065(local17);
		if (local30 == null) {
			Static100.anInt2955 = -1;
			Static24.anInt931 = -1;
			return;
		}
		Static83.anInt2569++;
		@Pc(43) int local43 = Static12.anInt374;
		@Pc(45) int local45 = Static122.anInt720;
		if (Static29.anInt1009 == 0) {
			local45 -= 4;
			local43 -= 4;
		}
		if (Static29.anInt1009 == 1) {
			local45 -= 553;
			local43 -= 205;
		}
		if (Static29.anInt1009 == 2) {
			local45 -= 17;
			local43 -= 357;
		}
		local43 -= Static53.anInt1742;
		local45 -= Static54.anInt1751;
		@Pc(73) int[] local73 = Static66.method1356(local30);
		@Pc(85) Class3_Sub15 local85 = Static120.aClass3_Sub15ArrayArray1[local17.anInt2286 >> 16][local17.anInt2306 & 0xFFFF];
		if (local73[1] > local43) {
			local43 = local73[1];
		}
		if (local45 < local73[0]) {
			local45 = local73[0];
		}
		if (local73[1] + local30.anInt2270 < local17.anInt2270 + local43) {
			local43 = local30.anInt2270 + local73[1] - local17.anInt2270;
		}
		if (local45 + local17.anInt2304 > local73[0] + local30.anInt2304) {
			local45 = local73[0] + local30.anInt2304 - local17.anInt2304;
		}
		@Pc(164) int local164 = local30.anInt2273 + local45 - local73[0];
		@Pc(174) int local174 = local43 + local30.anInt2241 - local73[1];
		@Pc(178) int[] local178 = Static66.method1356(local85);
		@Pc(188) int local188 = local45 + local85.anInt2273 - local178[0];
		@Pc(198) int local198 = local43 + local85.anInt2241 - local178[1];
		@Pc(204) int local204 = local198 - local17.anInt2243;
		@Pc(210) int local210 = local188 - local17.anInt2291;
		if (local17.anInt2262 >= local210 && -local17.anInt2262 <= local210 && local204 <= local17.anInt2262 && local204 >= -local17.anInt2262 && !Static22.aBoolean28) {
			local174 -= local204;
			local164 -= local210;
		} else if (local17.anInt2294 < Static83.anInt2569 || Static22.aBoolean28) {
			Static22.aBoolean28 = true;
		} else {
			local164 -= local210;
			local174 -= local204;
		}
		if (local17.anObjectArray6 != null && Static22.aBoolean28) {
			Static12.method335(local17.anObjectArray6, local17, local174, local164, null, 0);
		}
		if (Static129.anInt3467 != 0) {
			return;
		}
		if (Static22.aBoolean28) {
			@Pc(369) Class3_Sub15 local369 = Static114.method2098(local164 + Static54.anInt1751 - local30.anInt2273, local17, local174 + Static53.anInt1742 - local30.anInt2241, local30);
			if (local17.anObjectArray10 != null) {
				Static12.method335(local17.anObjectArray10, local17, local174, local164, local369, 0);
			}
			if (local369 != null && Static4.method88(local17) != null) {
				Static81.aClass3_Sub12_Sub1_2.method1980(160);
				Static81.aClass3_Sub12_Sub1_2.method1970(local369.anInt2283);
				Static81.aClass3_Sub12_Sub1_2.method1922(local17.anInt2283);
				Static81.aClass3_Sub12_Sub1_2.method1951(local17.anInt2286);
				Static81.aClass3_Sub12_Sub1_2.method1951(local369.anInt2286);
			}
		} else if ((Static36.anInt1213 == 1 || Static89.method1693(Static22.anInt872 - 1)) && Static22.anInt872 > 2) {
			Static73.method1527();
		} else if (Static22.anInt872 > 0) {
			Static73.method1528(Static22.anInt872 - 1);
		}
		Static24.anInt931 = -1;
		Static100.anInt2955 = -1;
		return;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method310() {
		aClass60_136 = null;
		aClass60_137 = null;
		anIntArray49 = null;
		aClass60_135 = null;
		aClass60_138 = null;
		anIntArray48 = null;
		aClass13_1 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method311(@OriginalArg(0) Class3_Sub1_Sub2_Sub4 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static58.anIntArray201.length; local9++) {
			Static58.anIntArray201[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) (Math.random() * 128.0D * (double) 256);
			Static58.anIntArray201[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = local60 + (local56 << 7);
					Static113.anIntArray333[local68] = (Static58.anIntArray201[local68 - 128] + Static58.anIntArray201[local68 + 1] + Static58.anIntArray201[local68 - 1] + Static58.anIntArray201[local68 + 128]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static58.anIntArray201;
			Static58.anIntArray201 = Static113.anIntArray333;
			Static113.anIntArray333 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt2858; local60++) {
			for (local68 = 0; local68 < arg0.anInt2860; local68++) {
				if (arg0.aByteArray75[local56++] != 0) {
					@Pc(150) int local150 = local68 + arg0.anInt2859 + 16;
					@Pc(158) int local158 = local60 + arg0.anInt2862 + 16;
					@Pc(165) int local165 = local150 + (local158 << 7);
					Static58.anIntArray201[local165] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method312() {
		if (Static104.aClass47_3 != null) {
			Static104.aClass47_3.method1564();
			Static104.aClass47_3 = null;
		}
		Static74.method1544();
		Static13.aClass58_1.method1762();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static89.aClass72Array1[local18].method2107();
		}
		System.gc();
		Static53.method1136();
		Static52.anInt1727 = -1;
		Static31.aBoolean34 = false;
		Static57.method2260();
		Static50.method1075(10);
	}
}
