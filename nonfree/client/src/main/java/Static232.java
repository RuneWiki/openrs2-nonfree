import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!kk;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "[B")
	public static final byte[] aByteArray54 = new byte[520];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!raa;)V")
	public static void method3827(@OriginalArg(0) Class250 arg0) {
		if (Static511.anInt8700 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub10 local6 = arg0.aClass5_Sub10_3;
		Static24.aClass250Array3[Static511.anInt8700] = arg0;
		Static161.aBooleanArray14[Static511.anInt8700] = false;
		Static511.anInt8700++;
		@Pc(21) int local21 = arg0.anInt7363;
		if (arg0.aBoolean522) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt7363;
		if (arg0.aBoolean521) {
			local29 = Static460.anInt7893 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method5183() + Static261.anInt5167 - local6.method5191() >> Static270.anInt5288;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method5183() + local6.method5191() - Static261.anInt5167 >> Static270.anInt5288;
			if (local73 >= Static430.anInt7565) {
				local73 = Static430.anInt7565 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray116[local41++];
				@Pc(105) int local105 = (local6.method5189() + Static261.anInt5167 - local6.method5191() >> Static270.anInt5288) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static374.anInt6925) {
					local113 = Static374.anInt6925 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static479.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static479.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static511.anInt8700;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static479.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static511.anInt8700 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static479.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static511.anInt8700 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static479.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static511.anInt8700 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	public static void method3828() {
		Static395.method5753();
		Static485.method6727();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V")
	public static void method3830() {
		Static98.anInt2245 = 0;
		@Pc(17) int local17 = Static515.anInt3214 + (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7);
		@Pc(24) int local24 = Static338.anInt6353 + (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static98.anInt2245 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static98.anInt2245 = 1;
		}
		if (Static98.anInt2245 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static98.anInt2245 = 0;
		}
	}
}
