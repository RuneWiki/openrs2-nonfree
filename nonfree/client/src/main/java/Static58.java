import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Lclient!nm;")
	public static Class119 aClass119_18;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
	public static int[] anIntArray96 = new int[200];

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public static int anInt1248 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class1_Sub28 local17;
		for (local17 = (Class1_Sub28) Static236.aClass96_22.method2340(); local17 != null; local17 = (Class1_Sub28) Static236.aClass96_22.method2342()) {
			Static273.method4202(arg2, local17, arg3, arg0, arg1);
		}
		@Pc(51) byte local51;
		@Pc(49) Class28 local49;
		@Pc(146) int local146;
		for (local17 = (Class1_Sub28) Static28.aClass96_2.method2340(); local17 != null; local17 = (Class1_Sub28) Static28.aClass96_2.method2342()) {
			local49 = local17.aClass11_Sub4_Sub2_1.method3348();
			local51 = 1;
			if (local49.anInt869 == local17.aClass11_Sub4_Sub2_1.anInt3828) {
				local51 = 0;
			} else if (local49.anInt868 == local17.aClass11_Sub4_Sub2_1.anInt3828 || local17.aClass11_Sub4_Sub2_1.anInt3828 == local49.anInt879 || local17.aClass11_Sub4_Sub2_1.anInt3828 == local49.anInt847 || local49.anInt849 == local17.aClass11_Sub4_Sub2_1.anInt3828) {
				local51 = 2;
			} else if (local17.aClass11_Sub4_Sub2_1.anInt3828 == local49.anInt871 || local49.anInt881 == local17.aClass11_Sub4_Sub2_1.anInt3828 || local49.anInt858 == local17.aClass11_Sub4_Sub2_1.anInt3828 || local17.aClass11_Sub4_Sub2_1.anInt3828 == local49.anInt882) {
				local51 = 3;
			}
			if (local51 != local17.anInt4429) {
				local146 = Static294.method945(local17.aClass11_Sub4_Sub2_1);
				if (local17.anInt4420 != local146) {
					if (local17.aClass1_Sub7_Sub1_2 != null) {
						Static173.aClass1_Sub7_Sub3_1.method3613(local17.aClass1_Sub7_Sub1_2);
						local17.aClass1_Sub7_Sub1_2 = null;
					}
					local17.anInt4420 = local146;
				}
				local17.anInt4429 = local51;
			}
			local17.anInt4430 = local17.aClass11_Sub4_Sub2_1.anInt3865;
			local17.anInt4418 = local17.aClass11_Sub4_Sub2_1.anInt3865 + local17.aClass11_Sub4_Sub2_1.method3347() * 64;
			local17.anInt4431 = local17.aClass11_Sub4_Sub2_1.anInt3856;
			local17.anInt4424 = local17.aClass11_Sub4_Sub2_1.anInt3856 + local17.aClass11_Sub4_Sub2_1.method3347() * 64;
			Static273.method4202(arg2, local17, arg3, arg0, arg1);
		}
		for (local17 = (Class1_Sub28) Static4.aClass86_3.method2134(); local17 != null; local17 = (Class1_Sub28) Static4.aClass86_3.method2141()) {
			local51 = 1;
			local49 = local17.aClass11_Sub4_Sub1_2.method3348();
			if (local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt869) {
				local51 = 0;
			} else if (local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt868 || local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt879 || local49.anInt847 == local17.aClass11_Sub4_Sub1_2.anInt3828 || local49.anInt849 == local17.aClass11_Sub4_Sub1_2.anInt3828) {
				local51 = 2;
			} else if (local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt871 || local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt881 || local17.aClass11_Sub4_Sub1_2.anInt3828 == local49.anInt858 || local49.anInt882 == local17.aClass11_Sub4_Sub1_2.anInt3828) {
				local51 = 3;
			}
			if (local51 != local17.anInt4429) {
				local146 = Static107.method2017(local17.aClass11_Sub4_Sub1_2);
				if (local146 != local17.anInt4420) {
					if (local17.aClass1_Sub7_Sub1_2 != null) {
						Static173.aClass1_Sub7_Sub3_1.method3613(local17.aClass1_Sub7_Sub1_2);
						local17.aClass1_Sub7_Sub1_2 = null;
					}
					local17.anInt4420 = local146;
				}
				local17.anInt4429 = local51;
			}
			local17.anInt4430 = local17.aClass11_Sub4_Sub1_2.anInt3865;
			local17.anInt4418 = local17.aClass11_Sub4_Sub1_2.anInt3865 + local17.aClass11_Sub4_Sub1_2.method3347() * 64;
			local17.anInt4431 = local17.aClass11_Sub4_Sub1_2.anInt3856;
			local17.anInt4424 = local17.aClass11_Sub4_Sub1_2.anInt3856 + local17.aClass11_Sub4_Sub1_2.method3347() * 64;
			Static273.method4202(arg2, local17, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method1031() {
		Static100.aClass175_44.method4287();
		Static116.aClass175_19.method4287();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!uo;ZLjava/awt/Component;)Lclient!on;")
	public static Class121 method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(4) Component arg3) {
		if (Static69.anInt1498 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(39) Class121 local39 = (Class121) Class.forName("Class121_Sub2").getDeclaredConstructor().newInstance();
			local39.anIntArray462 = new int[(Static292.aBoolean497 ? 2 : 1) * 256];
			local39.anInt4167 = arg1;
			local39.method3577(arg3);
			local39.anInt4172 = (arg1 & 0xFFFFFC00) + 1024;
			if (local39.anInt4172 > 16384) {
				local39.anInt4172 = 16384;
			}
			local39.method3578(local39.anInt4172);
			if (Static102.anInt2195 > 0 && Static17.aClass158_1 == null) {
				Static17.aClass158_1 = new Class158();
				Static17.aClass158_1.aClass176_4 = arg2;
				arg2.method4373(Static102.anInt2195, Static17.aClass158_1);
			}
			if (Static17.aClass158_1 != null) {
				if (Static17.aClass158_1.aClass121Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static17.aClass158_1.aClass121Array1[arg0] = local39;
			}
			return local39;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class121_Sub1 local119 = new Class121_Sub1(arg2, arg0);
				local119.anInt4167 = arg1;
				local119.anIntArray462 = new int[(Static292.aBoolean497 ? 2 : 1) * 256];
				local119.method3577(arg3);
				local119.anInt4172 = 16384;
				local119.method3578(local119.anInt4172);
				if (Static102.anInt2195 > 0 && Static17.aClass158_1 == null) {
					Static17.aClass158_1 = new Class158();
					Static17.aClass158_1.aClass176_4 = arg2;
					arg2.method4373(Static102.anInt2195, Static17.aClass158_1);
				}
				if (Static17.aClass158_1 != null) {
					if (Static17.aClass158_1.aClass121Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static17.aClass158_1.aClass121Array1[arg0] = local119;
				}
				return local119;
			} catch (@Pc(182) Throwable local182) {
				return new Class121();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
	public static void method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static71.aBoolean165) {
			Static93.method1772(arg3, arg0, arg2 + arg3, arg1 + arg0);
			Static93.method1777(arg3, arg0, arg2, arg1, 0);
		} else {
			Static77.method1587(arg3, arg0, arg2 + arg3, arg1 + arg0);
			Static77.method1596(arg3, arg0, arg2, arg1, 0);
		}
		if (Static114.anInt2348 < 100) {
			return;
		}
		@Pc(49) float local49 = (float) Static249.anInt5574 / (float) Static249.anInt5575;
		@Pc(51) int local51 = arg1;
		@Pc(53) int local53 = arg2;
		if (local49 < 1.0F) {
			local51 = (int) (local49 * (float) arg2);
		} else {
			local53 = (int) ((float) arg1 / local49);
		}
		@Pc(80) int local80 = arg0 + (arg1 - local51) / 2;
		@Pc(89) int local89 = arg3 + (arg2 - local53) / 2;
		if (Static130.aClass1_Sub5_Sub6_4 == null || Static130.aClass1_Sub5_Sub6_4.anInt3617 != arg2 || Static130.aClass1_Sub5_Sub6_4.anInt3625 != arg1) {
			@Pc(111) Class1_Sub5_Sub6_Sub1 local111 = new Class1_Sub5_Sub6_Sub1(arg2, arg1);
			Static77.method1594(local111.anIntArray117, arg2, arg1);
			if (Static249.aClass1_Sub5_Sub14_3.anInt3529 != -1) {
				Static77.method1596(0, 0, arg2, arg1, Static249.aClass1_Sub5_Sub14_3.anInt3529);
			}
			Static249.method4637(0, 0, Static249.anInt5575, Static249.anInt5574, 0, 0, local53, local51);
			Static249.method4639();
			if (Static71.aBoolean165) {
				Static130.aClass1_Sub5_Sub6_4 = new Class1_Sub5_Sub6_Sub2(local111);
			} else {
				Static130.aClass1_Sub5_Sub6_4 = local111;
			}
			if (Static71.aBoolean165) {
				Static77.anIntArray131 = null;
			} else {
				Static82.aClass130_1.method4485();
			}
		}
		Static130.aClass1_Sub5_Sub6_4.method3202(local89, local80);
		@Pc(169) int local169 = local80 + Static311.anInt5591 * local51 / Static249.anInt5574;
		@Pc(175) int local175 = local53 * Static2.anInt54 / Static249.anInt5575;
		@Pc(181) int local181 = local51 * Static95.anInt1985 / Static249.anInt5574;
		@Pc(194) int local194 = local89 + local53 * Static160.anInt3187 / Static249.anInt5575;
		@Pc(196) int local196 = 16711680;
		if (Static272.anInt5005 == 1) {
			local196 = 16777215;
		}
		if (Static71.aBoolean165) {
			Static93.method1762(local194, local169, local175, local181, local196, 128);
			Static93.method1773(local194, local169, local175, local181, local196);
		} else {
			Static77.method1584(local194, local169, local175, local181, local196, 128);
			Static77.method1580(local194, local169, local175, local181, local196);
		}
		if (Static145.anInt2809 <= 0) {
			return;
		}
		@Pc(245) int local245;
		if (Static73.anInt1575 <= 50) {
			local245 = Static73.anInt1575 * 5;
		} else {
			local245 = 500 - Static73.anInt1575 * 5;
		}
		for (@Pc(259) Class1_Sub5_Sub1 local259 = (Class1_Sub5_Sub1) Static249.aClass189_13.method4600(); local259 != null; local259 = (Class1_Sub5_Sub1) Static249.aClass189_13.method4601()) {
			@Pc(266) Class136 local266 = Static160.method2739(local259.anInt359);
			if (Static171.method2957(local266)) {
				@Pc(295) int local295;
				@Pc(304) int local304;
				if (Static225.anInt4217 == local259.anInt359) {
					local295 = local53 * local259.anInt369 / Static249.anInt5575 + local89;
					local304 = local51 * local259.anInt361 / Static249.anInt5574 + local80;
					if (Static71.aBoolean165) {
						Static93.method1762(local295 - 2, local304 - 2, 4, 4, 16776960, local245);
					} else {
						Static77.method1584(local295 - 2, local304 + -2, 4, 4, 16776960, local245);
					}
				} else if (Static48.anInt1079 != -1 && local266.anInt4073 == Static48.anInt1079) {
					local295 = local259.anInt369 * local53 / Static249.anInt5575 + local89;
					local304 = local80 + local51 * local259.anInt361 / Static249.anInt5574;
					if (Static71.aBoolean165) {
						Static93.method1762(local295 - 2, local304 + -2, 4, 4, 16776960, local245);
					} else {
						Static77.method1584(local295 - 2, local304 + -2, 4, 4, 16776960, local245);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method1034(@OriginalArg(0) Class176 arg0) {
		Static153.anInt2340 = 3;
		@Pc(9) Class48 local9 = null;
		Static280.method4271(true);
		Static167.anInt638 = 127;
		Static41.aBoolean79 = true;
		Static142.aBoolean243 = true;
		Static172.anInt3363 = 255;
		Static253.anInt4650 = 127;
		Static271.aBoolean476 = true;
		Static230.aBoolean388 = true;
		Static147.anInt5168 = 2;
		Static80.anInt1772 = 0;
		Static69.aBoolean146 = true;
		Static296.anInt842 = 0;
		Static294.aBoolean109 = true;
		Static43.aBoolean88 = true;
		Static174.aBoolean528 = true;
		Static222.aBoolean379 = true;
		Static286.aBoolean488 = true;
		Static299.anInt5384 = 0;
		Static128.aBoolean223 = true;
		Static40.anInt844 = 0;
		if (Static73.anInt1579 < 96) {
			Static52.method969(0);
		} else {
			Static52.method969(2);
		}
		Static240.aBoolean404 = false;
		Static205.anInt3963 = 0;
		Static19.anInt422 = 0;
		Static5.aBoolean18 = false;
		Static286.aBoolean489 = false;
		Static271.anInt4996 = 0;
		Static81.aBoolean176 = true;
		try {
			@Pc(85) Class153 local85 = arg0.method4378("runescape");
			while (local85.anInt4614 == 0) {
				Static16.method242(1L);
			}
			if (local85.anInt4614 == 1) {
				local9 = (Class48) local85.anObject6;
				@Pc(111) byte[] local111 = new byte[(int) local9.method1176()];
				@Pc(132) int local132;
				for (@Pc(113) int local113 = 0; local113 < local111.length; local113 += local132) {
					local132 = local9.method1173(local111, local111.length - local113, local113);
					if (local132 == -1) {
						throw new IOException("EOF");
					}
				}
				Static314.method4671(new Class1_Sub13(local111));
			}
		} catch (@Pc(155) Exception local155) {
		}
		try {
			if (local9 != null) {
				local9.method1174();
			}
		} catch (@Pc(163) Exception local163) {
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uj;BZ)V")
	public static void method1042(@OriginalArg(0) Class1_Sub5_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17;
		if (Static71.aBoolean165 || arg1) {
			local17 = Static288.anInt5232;
			@Pc(23) int local23 = local17 * 956 / 503;
			Static13.aClass1_Sub5_Sub6_1.method3200((Static194.anInt3876 - local23) / 2, 0, local23, local17);
			Static277.aClass57_1.method3330(Static194.anInt3876 / 2 - Static277.aClass57_1.anInt3768 / 2, 18);
		}
		arg0.method2866(Static272.anInt5005 == 1 ? Static273.aString193 : Static74.aString60, Static194.anInt3876 / 2, Static288.anInt5232 / 2 - 26, 16777215, -1);
		local17 = Static288.anInt5232 / 2 - 18;
		if (Static71.aBoolean165) {
			Static93.method1773(Static194.anInt3876 / 2 - 152, local17, 304, 34, 9179409);
			Static93.method1773(Static194.anInt3876 / 2 - 151, local17 + 1, 302, 32, 0);
			Static93.method1777(Static194.anInt3876 / 2 - 150, local17 + 2, Static193.anInt3756 * 3, 30, 9179409);
			Static93.method1777(Static194.anInt3876 / 2 + Static193.anInt3756 * 3 - 150, local17 - -2, 300 - Static193.anInt3756 * 3, 30, 0);
		} else {
			Static77.method1580(Static194.anInt3876 / 2 - 152, local17, 304, 34, 9179409);
			Static77.method1580(Static194.anInt3876 / 2 - 151, local17 - -1, 302, 32, 0);
			Static77.method1596(Static194.anInt3876 / 2 - 150, local17 + 2, Static193.anInt3756 * 3, 30, 9179409);
			Static77.method1596(Static193.anInt3756 * 3 + Static194.anInt3876 / 2 - 150, local17 + 2, 300 - Static193.anInt3756 * 3, 30, 0);
		}
		arg0.method2866(Static284.aString200, Static194.anInt3876 / 2, Static288.anInt5232 / 2 + 4, 16777215, -1);
	}
}
