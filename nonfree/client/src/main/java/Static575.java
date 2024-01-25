import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!waa", name = "q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
	public static int anInt9539 = 0;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[SI)[S")
	public static short[] method7832(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static602.method1588(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIZ)V")
	public static void method7834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static304.anInt5549 && Static403.anInt6995 == arg1 && (Static320.anInt5748 == Static312.anInt9775 || Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994))) {
			return;
		}
		Static312.anInt9775 = Static320.anInt5748;
		Static403.anInt6995 = arg1;
		Static304.anInt5549 = arg2;
		if (Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994)) {
			Static312.anInt9775 = 0;
		}
		Static33.method600(arg0);
		Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953), true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
		@Pc(62) int local62 = Static373.anInt6695;
		Static373.anInt6695 = (Static304.anInt5549 - (Static38.anInt740 >> 4)) * 8;
		@Pc(73) int local73 = Static6.anInt97;
		Static6.anInt97 = (Static403.anInt6995 - (Static38.anInt741 >> 4)) * 8;
		Static591.aClass4_Sub7_Sub13_3 = Static392.method7245(Static304.anInt5549 * 8, Static403.anInt6995 * 8);
		Static378.aClass67_1 = null;
		@Pc(96) int local96 = Static373.anInt6695 - local62;
		@Pc(101) int local101 = Static6.anInt97 - local73;
		@Pc(108) int local108;
		@Pc(121) int local121;
		@Pc(256) int local256;
		@Pc(185) int local185;
		if (arg0 == 11) {
			for (local108 = 0; local108 < Static566.anInt9466; local108++) {
				@Pc(114) Class4_Sub50 local114 = Static161.aClass4_Sub50Array1[local108];
				if (local114 != null) {
					@Pc(119) Class10_Sub1_Sub2_Sub1 local119 = local114.aClass10_Sub1_Sub2_Sub1_1;
					for (local121 = 0; local121 < 10; local121++) {
						local119.anIntArray653[local121] -= local96;
						local119.anIntArray654[local121] -= local101;
					}
					local119.anInt8934 -= local96 * 512;
					local119.anInt8929 -= local101 * 512;
				}
			}
		} else {
			@Pc(171) boolean local171 = false;
			Static428.anInt7363 = 0;
			@Pc(179) int local179 = Static38.anInt740 * 512 - 512;
			local185 = (Static38.anInt741 - 1) * 512;
			for (local121 = 0; local121 < Static566.anInt9466; local121++) {
				@Pc(193) Class4_Sub50 local193 = Static161.aClass4_Sub50Array1[local121];
				if (local193 != null) {
					@Pc(198) Class10_Sub1_Sub2_Sub1 local198 = local193.aClass10_Sub1_Sub2_Sub1_1;
					local198.anInt8929 -= local101 * 512;
					local198.anInt8934 -= local96 * 512;
					if (local198.anInt8934 >= 0 && local198.anInt8934 <= local179 && local198.anInt8929 >= 0 && local198.anInt8929 <= local185) {
						@Pc(254) boolean local254 = true;
						for (local256 = 0; local256 < 10; local256++) {
							local198.anIntArray653[local256] -= local96;
							local198.anIntArray654[local256] -= local101;
							if (local198.anIntArray653[local256] < 0 || local198.anIntArray653[local256] >= Static38.anInt740 || local198.anIntArray654[local256] < 0 || local198.anIntArray654[local256] >= Static38.anInt741) {
								local254 = false;
							}
						}
						if (local254) {
							Static444.anIntArray617[Static428.anInt7363++] = local198.anInt8531;
						} else {
							local198.method3531(null);
							local193.method8013();
							local171 = true;
						}
					} else {
						local198.method3531(null);
						local193.method8013();
						local171 = true;
					}
				}
			}
			if (local171) {
				Static566.anInt9466 = Static106.aClass183_8.method4291();
				Static106.aClass183_8.method4284(Static161.aClass4_Sub50Array1);
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(361) Class10_Sub1_Sub2_Sub2 local361 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local108];
			if (local361 != null) {
				for (local185 = 0; local185 < 10; local185++) {
					local361.anIntArray653[local185] -= local96;
					local361.anIntArray654[local185] -= local101;
				}
				local361.anInt8929 -= local101 * 512;
				local361.anInt8934 -= local96 * 512;
			}
		}
		@Pc(411) Class18[] local411 = Static186.aClass18Array1;
		for (local185 = 0; local185 < local411.length; local185++) {
			@Pc(419) Class18 local419 = local411[local185];
			if (local419 != null) {
				local419.anInt393 -= local101 * 512;
				local419.anInt382 -= local96 * 512;
			}
		}
		for (@Pc(447) Class4_Sub37 local447 = (Class4_Sub37) Static263.aClass124_53.method3267(); local447 != null; local447 = (Class4_Sub37) Static263.aClass124_53.method3273()) {
			local447.anInt7084 -= local96;
			local447.anInt7086 -= local101;
			if (Static236.anInt4754 != 4 && (local447.anInt7084 < 0 || local447.anInt7086 < 0 || Static38.anInt740 <= local447.anInt7084 || local447.anInt7086 >= Static38.anInt741)) {
				local447.method8013();
			}
		}
		if (Static236.anInt4754 != 4) {
			for (@Pc(510) Class4_Sub15 local510 = (Class4_Sub15) Static486.aClass183_34.method4286(); local510 != null; local510 = (Class4_Sub15) Static486.aClass183_34.method4283()) {
				@Pc(518) int local518 = (int) (local510.aLong307 & 0x3FFFL);
				@Pc(523) int local523 = local518 - Static373.anInt6695;
				local256 = (int) (local510.aLong307 >> 14 & 0x3FFFL);
				@Pc(536) int local536 = local256 - Static6.anInt97;
				if (local523 < 0 || local536 < 0 || local523 >= Static38.anInt740 || local536 >= Static38.anInt741) {
					local510.method8013();
				}
			}
		}
		if (Static319.anInt5739 != 0) {
			Static319.anInt5739 -= local96;
			Static435.anInt7462 -= local101;
		}
		Static87.method2050();
		if (arg0 != 11) {
			Static548.anInt9202 -= local96;
			Static353.anInt6160 -= local101;
			Static473.anInt7978 -= local96 * 512;
			Static563.anInt9436 -= local101 * 512;
			Static12.anInt226 -= local101;
			Static209.anInt9659 -= local96;
			if (Math.abs(local96) > Static38.anInt740 || Math.abs(local101) > Static38.anInt741) {
				Static114.method2345();
			}
		} else if (Static555.anInt9335 == 4) {
			Static391.anInt6854 -= local101 * 512;
			Static460.anInt7816 -= local96 * 512;
			Static303.anInt5529 -= local101 * 512;
			Static195.anInt4188 -= local96 * 512;
		} else {
			Static140.anInt3147 = -1;
			Static380.anInt6749 = -1;
			Static555.anInt9335 = 1;
		}
		Static477.method6635();
		Static180.method3365();
		Static328.aClass124_29.method3265();
		Static11.aClass124_1.method3265();
		Static385.aClass8_5.method106();
		Static307.method4759();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public static void method7836() {
		if (Static397.anInt6936 < 0) {
			Static439.anInt9627 = -1;
			Static397.anInt6936 = 0;
			Static70.anInt1454 = -1;
		}
		if (Static392.anInt8795 < Static397.anInt6936) {
			Static439.anInt9627 = -1;
			Static397.anInt6936 = Static392.anInt8795;
			Static70.anInt1454 = -1;
		}
		if (Static470.anInt7923 < 0) {
			Static70.anInt1454 = -1;
			Static439.anInt9627 = -1;
			Static470.anInt7923 = 0;
		}
		if (Static470.anInt7923 > Static392.anInt8803) {
			Static439.anInt9627 = -1;
			Static70.anInt1454 = -1;
			Static470.anInt7923 = Static392.anInt8803;
		}
	}
}
