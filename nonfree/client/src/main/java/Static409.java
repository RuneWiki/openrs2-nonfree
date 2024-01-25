import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "[[[Lclient!ut;")
	public static Class252[][][] aClass252ArrayArrayArray3;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!za;Lclient!co;Lclient!mo;)V")
	public static void method5564(@OriginalArg(1) Class106 arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) Class1_Sub28 arg2) {
		@Pc(10) Class137 local10 = arg1.method1085(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local16 < local10.ZA()) {
			local16 = local10.ZA();
		}
		@Pc(32) int local32 = arg2.anInt4941;
		@Pc(35) int local35 = arg2.anInt4934;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(77) int local77;
		if (arg1.aString11 != null) {
			local37 = Static67.aClass209_3.method4692(null, arg1.aString11, null, Static162.aStringArray23);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(60) String local60 = Static162.aStringArray23[local55];
				if (local55 < local37 - 1) {
					local60 = local60.substring(0, local60.length() - 4);
				}
				local77 = Static51.aClass122_4.method3058(local60);
				if (local77 > local39) {
					local39 = local77;
				}
			}
			local41 = Static51.aClass122_4.method3064() * local37 + Static51.aClass122_4.method3063() / 2;
		}
		local55 = arg2.anInt4941 + local16 / 2;
		if (local32 < Static377.anInt5033 + local16) {
			local32 = Static377.anInt5033;
			local55 = local16 / 2 + Static377.anInt5033 + local39 / 2 + 10 + 5;
		} else if (Static377.anInt5041 - local16 < local32) {
			local32 = Static377.anInt5041 - local16;
			local55 = Static377.anInt5041 - local39 / 2 - local16 / 2 - 10 - 5;
		}
		@Pc(166) int local166 = arg2.anInt4934;
		if (Static377.anInt5039 + local16 > local35) {
			local35 = Static377.anInt5039;
			local166 = local16 / 2 + Static377.anInt5039 + 10;
		} else if (local35 > Static377.anInt5034 - local16) {
			local35 = Static377.anInt5034 - local16;
			local166 = Static377.anInt5034 - local16 / 2 - local41 - 10;
		}
		local77 = (int) (Math.atan2((double) (local32 - arg2.anInt4941), (double) (local35 - arg2.anInt4934)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5701((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local77);
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		if (arg1.aString11 != null) {
			local254 = local166;
			local252 = local55 - local39 / 2 - 5;
			local258 = local37 * Static51.aClass122_4.method3064() + local166 + 3;
			local256 = local252 + local39 + 10;
			if (arg1.anInt1555 != 0) {
				arg0.method5941(local166, local256 - local252, local252, local258 - local166, arg1.anInt1555);
			}
			if (arg1.anInt1561 != 0) {
				arg0.method5916(local256 - local252, arg1.anInt1561, local258 - local166, local166, local252);
			}
			for (@Pc(327) int local327 = 0; local327 < local37; local327++) {
				@Pc(332) String local332 = Static162.aStringArray23[local327];
				if (local327 < local37 - 1) {
					local332 = local332.substring(0, local332.length() - 4);
				}
				Static51.aClass122_4.method3060(arg0, local332, local55, local166, arg1.anInt1539);
				local166 += Static51.aClass122_4.method3064();
			}
		}
		if (arg1.anInt1560 == -1 && arg1.aString11 == null) {
			return;
		}
		@Pc(380) Class1_Sub43 local380 = new Class1_Sub43(arg2);
		local16 >>= 0x1;
		local380.anInt7320 = local32 + local16;
		local380.anInt7322 = local258;
		local380.anInt7316 = local32 - local16;
		local380.anInt7324 = local35 + local16;
		local380.anInt7315 = local35 - local16;
		local380.anInt7318 = local254;
		local380.anInt7319 = local256;
		local380.anInt7321 = local252;
		Static140.aClass203_19.method4551(local380);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!pt;IIII)V")
	public static void method5567(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static280.method4119(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static216.anInt4346) {
			Static280.method4119(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static280.method4119(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static198.anInt7949) {
			Static280.method4119(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static198.anInt7949) {
			Static280.method4119(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static216.anInt4346 && arg4 <= Static198.anInt7949) {
			Static280.method4119(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static280.method4119(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static216.anInt4346 && arg4 > 0) {
			Static280.method4119(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
