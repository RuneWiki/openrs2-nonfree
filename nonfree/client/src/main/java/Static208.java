import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[Lclient!ne;")
	public static Class78[] aClass78Array7;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1233 = Static186.method3527("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1234 = Static186.method3527("leuchten1:");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
	public static void method2991(@OriginalArg(1) int arg0) {
		Static188.anInt3868 += arg0 * 128;
		@Pc(31) int local31;
		if (Static141.anIntArray428.length < Static188.anInt3868) {
			Static188.anInt3868 -= Static141.anIntArray428.length;
			local31 = (int) (Math.random() * 12.0D);
			Static158.method2636(Static213.aClass78_Sub1Array7[local31]);
		}
		@Pc(42) int local42 = (256 - arg0) * 128;
		local31 = 0;
		@Pc(48) int local48 = arg0 * 128;
		@Pc(74) int local74;
		for (@Pc(50) int local50 = 0; local50 < local42; local50++) {
			local74 = Static144.anIntArray305[local31 + local48] - arg0 * Static141.anIntArray428[Static188.anInt3868 + local31 & Static141.anIntArray428.length + -1] / 6;
			if (local74 < 0) {
				local74 = 0;
			}
			Static144.anIntArray305[local31++] = local74;
		}
		@Pc(98) int local98;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local74 = 256 - arg0; local74 < 256; local74++) {
			local98 = local74 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static144.anIntArray305[local100 + local98] = 255;
				} else {
					Static144.anIntArray305[local98 + local100] = 0;
				}
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static160.anIntArray357[local98] = Static160.anIntArray357[local98 + arg0];
		}
		for (local100 = 256 - arg0; local100 < 256; local100++) {
			Static160.anIntArray357[local100] = (int) (Math.sin((double) Static185.anInt3842 / 14.0D) * 16.0D + Math.sin((double) Static185.anInt3842 / 15.0D) * 14.0D + Math.sin((double) Static185.anInt3842 / 16.0D) * 12.0D);
			Static185.anInt3842++;
		}
		Static148.anInt3090 += arg0;
		local107 = (arg0 + (Static107.anInt2132 & 0x1)) / 2;
		if (local107 <= 0) {
			return;
		}
		@Pc(237) int local237;
		@Pc(244) int local244;
		for (@Pc(228) int local228 = 0; local228 < Static148.anInt3090; local228++) {
			local237 = (int) (Math.random() * 124.0D) + 2;
			local244 = (int) (Math.random() * 128.0D) + 128;
			Static144.anIntArray305[local237 + (local244 << 7)] = 192;
		}
		Static148.anInt3090 = 0;
		@Pc(271) int local271;
		@Pc(276) int local276;
		for (local237 = 0; local237 < 256; local237++) {
			local271 = local237 * 128;
			local244 = 0;
			for (local276 = -local107; local276 < 128; local276++) {
				if (local107 + local276 < 128) {
					local244 += Static144.anIntArray305[local107 + local276 + local271];
				}
				if (local276 - local107 - 1 >= 0) {
					local244 -= Static144.anIntArray305[local276 + local271 - local107 - 1];
				}
				if (local276 >= 0) {
					Static109.anIntArray232[local271 + local276] = local244 / (local107 * 2 + 1);
				}
			}
		}
		for (local244 = 0; local244 < 128; local244++) {
			local271 = 0;
			for (local276 = -local107; local276 < 256; local276++) {
				@Pc(359) int local359 = local276 * 128;
				if (local107 + local276 < 256) {
					local271 += Static109.anIntArray232[local244 + local359 + local107 * 128];
				}
				if (local276 - local107 - 1 >= 0) {
					local271 -= Static109.anIntArray232[local244 + local359 - local107 * 128 - 128];
				}
				if (local276 >= 0) {
					Static144.anIntArray305[local359 + local244] = local271 / (local107 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	public static void method2994() {
		Static40.aClass84_16.method2585();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method2995() {
		if (Static198.aFloat6 < Static64.aFloat1) {
			Static198.aFloat6 = (float) ((double) Static198.aFloat6 + (double) Static198.aFloat6 / 30.0D);
			if (Static64.aFloat1 < Static198.aFloat6) {
				Static198.aFloat6 = Static64.aFloat1;
			}
			Static107.method1639();
		} else if (Static64.aFloat1 < Static198.aFloat6) {
			Static198.aFloat6 = (float) ((double) Static198.aFloat6 - (double) Static198.aFloat6 / 30.0D);
			if (Static198.aFloat6 < Static64.aFloat1) {
				Static198.aFloat6 = Static64.aFloat1;
			}
			Static107.method1639();
		}
		if (Static44.anInt939 == -1 || Static95.anInt1938 == -1) {
			return;
		}
		@Pc(67) int local67 = Static44.anInt939 - Static4.anInt87;
		@Pc(71) int local71 = Static95.anInt1938 - Static177.anInt3717;
		if (local71 < 2 || local71 > 2) {
			local71 >>= 0x4;
		}
		Static177.anInt3717 += local71;
		if (local67 < 2 || local67 > 2) {
			local67 >>= 0x4;
		}
		if (local67 == 0 && local71 == 0) {
			Static44.anInt939 = -1;
			Static95.anInt1938 = -1;
		}
		Static4.anInt87 += local67;
		Static107.method1639();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!pg;)V")
	public static void method2996(@OriginalArg(1) Class1_Sub17 arg0) {
		if (Static93.aClass53_2 != null) {
			try {
				Static93.aClass53_2.method1441(0L);
				Static93.aClass53_2.method1440(arg0.aByteArray40, arg0.anInt2656, 24);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt2656 += 24;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
	public static int method2998(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static232.method3502(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method2999() {
		Static27.aClass84_11.method2576();
		Static125.aClass84_23.method2576();
	}
}
