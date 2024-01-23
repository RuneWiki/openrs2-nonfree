import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
	public static volatile int anInt1306 = 0;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public static void method1062() {
		@Pc(14) int local14 = Static292.aByteArrayArray50.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			if (Static292.aByteArrayArray50[local16] != null) {
				@Pc(32) int local32 = -1;
				for (@Pc(34) int local34 = 0; local34 < Static249.anInt4745; local34++) {
					if (Static80.anIntArray127[local34] == Static278.anIntArray597[local16]) {
						local32 = local34;
						break;
					}
				}
				if (local32 == -1) {
					Static80.anIntArray127[Static249.anInt4745] = Static278.anIntArray597[local16];
					local32 = Static249.anInt4745++;
				}
				@Pc(82) Class4_Sub10 local82 = new Class4_Sub10(Static292.aByteArrayArray50[local16]);
				@Pc(84) int local84 = 0;
				while (Static292.aByteArrayArray50[local16].length > local82.anInt5713 && local84 < 511 && Static236.anInt4452 < 1023) {
					@Pc(112) int local112 = local84++ << 6 | local32;
					@Pc(116) int local116 = local82.method4653();
					@Pc(120) int local120 = local116 >> 14;
					@Pc(126) int local126 = local116 >> 7 & 0x3F;
					@Pc(139) int local139 = (Static278.anIntArray597[local16] >> 8) * 64 + local126 - Static220.anInt3983;
					@Pc(143) int local143 = local116 & 0x3F;
					@Pc(155) int local155 = local143 + (Static278.anIntArray597[local16] & 0xFF) * 64 - Static295.anInt5480;
					@Pc(161) Class171 local161 = Static84.method1495(local82.method4653());
					if (Static110.aClass53_Sub1_Sub2Array1[local112] == null && (local161.aByte21 & 0x1) > 0 && Static60.anInt1216 == local120 && local139 >= 0 && local161.anInt5263 + local139 < 104 && local155 >= 0 && local155 + local161.anInt5263 < 104) {
						Static110.aClass53_Sub1_Sub2Array1[local112] = new Class53_Sub1_Sub2();
						@Pc(217) Class53_Sub1_Sub2 local217 = Static110.aClass53_Sub1_Sub2Array1[local112];
						Static278.anIntArray595[Static236.anInt4452++] = local112;
						local217.anInt3990 = Static50.anInt954;
						local217.method3330(local161);
						local217.method3329(local217.aClass171_1.anInt5263);
						local217.anInt4017 = local217.anInt4031 = Static18.anIntArray27[local217.aClass171_1.aByte18];
						local217.anInt4009 = local217.aClass171_1.anInt5244;
						if (local217.anInt4009 == 0) {
							local217.anInt4031 = 0;
						}
						local217.anInt3986 = local217.aClass171_1.anInt5262;
						local217.method3314(local155, local217.method3324(), local139, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Lclient!uj;")
	public static Class4_Sub3_Sub14 method1063() {
		@Pc(9) int local9 = Static301.anIntArray643[0] * Static110.anIntArray185[0];
		@Pc(22) byte[] local22 = Static230.aByteArrayArray36[0];
		@Pc(25) int[] local25 = new int[local9];
		for (@Pc(27) int local27 = 0; local27 < local9; local27++) {
			local25[local27] = Static58.anIntArray85[local22[local27] & 0xFF];
		}
		@Pc(68) Class4_Sub3_Sub14 local68;
		if (Static94.aBoolean138) {
			local68 = new Class4_Sub3_Sub14_Sub2(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], local25);
		} else {
			local68 = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], local25);
		}
		Static304.method4707();
		return local68;
	}
}
