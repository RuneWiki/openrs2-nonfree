import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "Lclient!tg;")
	public static Class81 aClass81_429 = Static120.method2057("m");

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	public static int anInt1175 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public static int anInt1176 = 0;

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
	public static int anInt1178 = 0;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "Lclient!nd;")
	public static Class59 aClass59_10 = new Class59(64);

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "[I")
	public static int[] anIntArray98 = new int[100];

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_430 = Static120.method2057(")1p");

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_431 = Static120.method2057("sl_arrows");

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "J")
	public static volatile long aLong40 = 0L;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!de;)V")
	public static void method890(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub3 arg1) {
		if (arg1.anInt3029 > Static142.anInt3104) {
			Static8.method127(arg1);
		} else if (Static142.anInt3104 <= arg1.anInt3038) {
			Static168.method2984(arg1);
		} else {
			Static141.method607(arg1);
		}
		if (arg1.anInt3040 < 128 || arg1.anInt3026 < 128 || arg1.anInt3040 >= 13184 || arg1.anInt3026 >= 13184) {
			arg1.anInt3029 = 0;
			arg1.anInt3040 = arg1.anIntArray326[0] * 128 + arg1.anInt3051 * 64;
			arg1.anInt3028 = -1;
			arg1.anInt3024 = -1;
			arg1.anInt3038 = 0;
			arg1.anInt3026 = arg1.anInt3051 * 64 + arg1.anIntArray324[0] * 128;
			arg1.method2366();
		}
		if (arg1 == Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1 && (arg1.anInt3040 < 1536 || arg1.anInt3026 < 1536 || arg1.anInt3040 >= 11776 || arg1.anInt3026 >= 11776)) {
			arg1.anInt3040 = arg1.anIntArray326[0] * 128 + arg1.anInt3051 * 64;
			arg1.anInt3029 = 0;
			arg1.anInt3038 = 0;
			arg1.anInt3024 = -1;
			arg1.anInt3028 = -1;
			arg1.anInt3026 = arg1.anInt3051 * 64 + arg1.anIntArray324[0] * 128;
			arg1.method2366();
		}
		Static20.method404(arg1);
		Static139.method2336(arg1);
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
	public static void method892() {
		@Pc(18) int local18;
		if (Static20.anInt510 > 0) {
			for (local18 = 0; local18 < 256; local18++) {
				if (Static20.anInt510 > 768) {
					Static150.anIntArray358[local18] = Static57.method1015(1024 - Static20.anInt510, Static37.anIntArray78[local18], Static116.anIntArray277[local18]);
				} else if (Static20.anInt510 > 256) {
					Static150.anIntArray358[local18] = Static116.anIntArray277[local18];
				} else {
					Static150.anIntArray358[local18] = Static57.method1015(256 - Static20.anInt510, Static116.anIntArray277[local18], Static37.anIntArray78[local18]);
				}
			}
		} else if (Static184.anInt4116 <= 0) {
			for (local18 = 0; local18 < 256; local18++) {
				Static150.anIntArray358[local18] = Static37.anIntArray78[local18];
			}
		} else {
			for (local18 = 0; local18 < 256; local18++) {
				if (Static184.anInt4116 > 768) {
					Static150.anIntArray358[local18] = Static57.method1015(1024 - Static184.anInt4116, Static37.anIntArray78[local18], Static165.anIntArray392[local18]);
				} else if (Static184.anInt4116 <= 256) {
					Static150.anIntArray358[local18] = Static57.method1015(256 - Static184.anInt4116, Static165.anIntArray392[local18], Static37.anIntArray78[local18]);
				} else {
					Static150.anIntArray358[local18] = Static165.anIntArray392[local18];
				}
			}
		}
		local18 = 0;
		@Pc(156) int local156 = Static59.aClass1_Sub2_Sub2_Sub3_3.anInt2737 * 9;
		@Pc(158) int local158 = 0;
		@Pc(174) int local174;
		@Pc(187) int local187;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(217) int local217;
		@Pc(215) int local215;
		for (@Pc(160) int local160 = 1; local160 < 255; local160++) {
			local174 = (256 - local160) * Static47.anIntArray95[local160] / 256 + 22;
			if (local174 < 0) {
				local174 = 0;
			}
			local18 += local174;
			for (local187 = local174; local187 < 128; local187++) {
				local194 = Static140.anIntArray329[local18++];
				local200 = Static59.aClass1_Sub2_Sub2_Sub3_3.anIntArray288[local156++];
				if (local194 == 0) {
					Static15.aClass1_Sub2_Sub2_Sub3_1.anIntArray288[local158++] = local200;
				} else {
					local215 = 256 - local194;
					local217 = local194;
					local194 = Static150.anIntArray358[local194];
					Static15.aClass1_Sub2_Sub2_Sub3_1.anIntArray288[local158++] = ((local200 & 0xFF00FF) * local215 + local217 * (local194 & 0xFF00FF) & 0xFF00FF00) + (local215 * (local200 & 0xFF00) + local217 * (local194 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local194 = 0; local194 < local174; local194++) {
				Static15.aClass1_Sub2_Sub2_Sub3_1.anIntArray288[local158++] = Static59.aClass1_Sub2_Sub2_Sub3_3.anIntArray288[local156++];
			}
			local156 += Static59.aClass1_Sub2_Sub2_Sub3_3.anInt2737 - 128;
		}
		local158 = 0;
		local18 = 0;
		Static15.aClass1_Sub2_Sub2_Sub3_1.method2119(0, 9);
		local156 = Static59.aClass1_Sub2_Sub2_Sub3_3.anInt2737 * 9 + 128;
		for (local174 = 1; local174 < 255; local174++) {
			local187 = (256 - local174) * Static47.anIntArray95[local174] / 256 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			for (local194 = 0; local194 < local187; local194++) {
				@Pc(339) int local339 = local158++;
				local156--;
				Static184.aClass1_Sub2_Sub2_Sub3_11.anIntArray288[local339] = Static59.aClass1_Sub2_Sub2_Sub3_3.anIntArray288[local156];
			}
			for (local200 = local187; local200 < 128; local200++) {
				local156--;
				local215 = Static59.aClass1_Sub2_Sub2_Sub3_3.anIntArray288[local156];
				local217 = Static140.anIntArray329[local18++];
				if (local217 == 0) {
					Static184.aClass1_Sub2_Sub2_Sub3_11.anIntArray288[local158++] = local215;
				} else {
					@Pc(376) int local376 = local217;
					@Pc(380) int local380 = 256 - local217;
					local217 = Static150.anIntArray358[local217];
					Static184.aClass1_Sub2_Sub2_Sub3_11.anIntArray288[local158++] = (local376 * (local217 & 0xFF00) + local380 * (local215 & 0xFF00) & 0xFF0000) + ((local217 & 0xFF00FF) * local376 + ((local215 & 0xFF00FF) * local380) & 0xFF00FF00) >> 8;
				}
			}
			local156 += Static59.aClass1_Sub2_Sub2_Sub3_3.anInt2737 + 128;
			local18 += local187;
		}
		Static184.aClass1_Sub2_Sub2_Sub3_11.method2119(637, 9);
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public static void method893() {
		anIntArray98 = null;
		aClass59_10 = null;
		anIntArray99 = null;
		aClass81_429 = null;
		aClass81_431 = null;
		aClass81_430 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[Lclient!gf;[BII)V")
	public static void method894(@OriginalArg(0) int arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(22) int local22 = local14.method313();
			if (local22 == 0) {
				return;
			}
			local16 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local14.method330();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(48) int local48 = local30 >> 6 & 0x3F;
				@Pc(52) int local52 = local30 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local14.method336();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(73) int local73 = local48 + arg0;
				@Pc(77) int local77 = local52 + arg3;
				if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
					@Pc(94) int local94 = local56;
					@Pc(96) Class28 local96 = null;
					if ((Static43.aByteArrayArrayArray2[1][local73][local77] & 0x2) == 2) {
						local94 = local56 - 1;
					}
					if (local94 >= 0) {
						local96 = arg1[local94];
					}
					Static101.method1673(local68, local96, local73, local64, local77, local56, local16);
				}
			}
		}
	}
}
