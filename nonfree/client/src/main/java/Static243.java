import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "Lclient!wo;")
	public static Class406 aClass406_2;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)Z")
	public static boolean method3728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static555.aBoolean678) {
			return false;
		}
		@Pc(24) int local24 = arg0 >> 16;
		@Pc(28) int local28 = arg0 & 0xFFFF;
		if (Static403.aClass20ArrayArray2[local24] == null || Static403.aClass20ArrayArray2[local24][local28] == null) {
			return false;
		}
		@Pc(49) Class20 local49 = Static403.aClass20ArrayArray2[local24][local28];
		@Pc(63) Class3_Sub4_Sub5 local63;
		if (arg1 == -1 && local49.anInt532 == 0) {
			for (local63 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local63 != null; local63 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				if (local63.anInt2775 == 50 || local63.anInt2775 == 1007 || local63.anInt2775 == 10 || local63.anInt2775 == 11 || local63.anInt2775 == 21) {
					for (@Pc(182) Class20 local182 = Static118.method2045(local63.anInt2776); local182 != null; local182 = Static55.method716(local182)) {
						if (local182.anInt600 == local49.anInt600) {
							return true;
						}
					}
				}
			}
		} else {
			for (local63 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local63 != null; local63 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				if (local63.anInt2777 == arg1 && local63.anInt2776 == local49.anInt600 && (local63.anInt2775 == 50 || local63.anInt2775 == 1007 || local63.anInt2775 == 10 || local63.anInt2775 == 11 || local63.anInt2775 == 21)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method3729(@OriginalArg(0) Class67 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static178.aBoolean264) {
			local7 = Static448.method6652();
			local9 = Static143.method2382();
		}
		@Pc(21) int local21 = local7 + Static121.anInt2335;
		@Pc(25) int local25 = local9 + Static65.anInt1025;
		@Pc(27) int local27 = Static655.anInt10491;
		@Pc(31) int local31 = Static188.anInt3322 - 3;
		Static516.method8183(Static655.anInt10491, arg0, local9 + Static65.anInt1025, Static476.aClass279_24.method6992(Static141.anInt2658), Static188.anInt3322, local7 + Static121.anInt2335);
		@Pc(55) int local55 = local7 + Static714.aClass161_1.method8581();
		@Pc(62) int local62 = Static714.aClass161_1.method8573() + local9;
		@Pc(66) int local66;
		@Pc(71) Class3_Sub4_Sub5 local71;
		@Pc(89) int local89;
		@Pc(307) int local307;
		@Pc(167) Class3_Sub4_Sub17 local167;
		@Pc(293) Class3_Sub4_Sub5 local293;
		if (Static367.aBoolean490) {
			local66 = 0;
			for (local167 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local167 != null; local167 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
				local89 = local25 + local66 * 16 + 20 + 13;
				local66++;
				if (Static121.anInt2335 + local7 < local55 && local55 < local7 + Static121.anInt2335 + Static655.anInt10491 && local89 - 13 < local62 && local89 + 4 > local62 && (local167.anInt8611 > 1 || ((Class3_Sub4_Sub5) local167.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66).aBoolean227)) {
					arg0.aa(local7 + Static121.anInt2335, local89 + -12, Static655.anInt10491, 16, Static724.anInt11286 | 255 - Static390.anInt7026 << 24, 1);
				}
			}
			if (Static239.aClass3_Sub4_Sub17_1 != null) {
				Static516.method8183(Static618.anInt6014, arg0, Static725.anInt11302, Static239.aClass3_Sub4_Sub17_1.aString112, Static382.anInt6839, Static614.anInt9938);
				local66 = 0;
				for (local293 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7031(); local293 != null; local293 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7035()) {
					local307 = local66 * 16 + Static725.anInt11302 + 13 + 20;
					local66++;
					if (local55 > Static614.anInt9938 && Static614.anInt9938 + Static618.anInt6014 > local55 && local62 > local307 - 13 && local62 < local307 + 4 && local293.aBoolean227) {
						arg0.aa(Static614.anInt9938, local307 - 12, Static618.anInt6014, 16, Static724.anInt11286 | 255 - Static390.anInt7026 << 24, 1);
					}
				}
				Static41.method600(Static382.anInt6839, Static618.anInt6014, arg0, Static725.anInt11302, Static614.anInt9938);
			}
		} else {
			local66 = 0;
			for (local71 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local71 != null; local71 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				local89 = local25 + (Static285.anInt5168 - (1 - -local66)) * 16 + 13 + 20;
				if (local55 > Static121.anInt2335 + local7 && local55 < Static655.anInt10491 + Static121.anInt2335 + local7 && local89 - 13 < local62 && local89 + 4 > local62 && local71.aBoolean227) {
					arg0.aa(local7 + Static121.anInt2335, local89 - 12, Static655.anInt10491, 16, Static724.anInt11286 | 255 - Static390.anInt7026 << 24, 1);
				}
				local66++;
			}
		}
		Static41.method600(Static188.anInt3322, Static655.anInt10491, arg0, Static65.anInt1025 + local9, local7 + Static121.anInt2335);
		if (Static367.aBoolean490) {
			local66 = 0;
			for (local167 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7031(); local167 != null; local167 = (Class3_Sub4_Sub17) Static555.aClass283_12.method7035()) {
				local89 = local9 + Static65.anInt1025 + local66 * 16 + 13 + 20;
				if (local167.anInt8611 == 1) {
					Static592.method8147(Static662.anInt9819 | 0xFF000000, local89, Static65.anInt1025 + local9, local62, Static655.anInt10491, local55, Static129.anInt2431 | 0xFF000000, arg0, Static188.anInt3322, (Class3_Sub4_Sub5) local167.aClass283_10.aClass3_Sub4_51.aClass3_Sub4_66, Static121.anInt2335 + local7);
				} else {
					Static47.method638(local55, local89, arg0, Static129.anInt2431 | 0xFF000000, local62, Static188.anInt3322, Static121.anInt2335 + local7, Static655.anInt10491, local9 + Static65.anInt1025, local167, Static662.anInt9819 | 0xFF000000);
				}
				local66++;
			}
			if (Static239.aClass3_Sub4_Sub17_1 != null) {
				local66 = 0;
				for (local293 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7031(); local293 != null; local293 = (Class3_Sub4_Sub5) Static239.aClass3_Sub4_Sub17_1.aClass283_10.method7035()) {
					local307 = local66 * 16 + Static725.anInt11302 + 13 + 20;
					local66++;
					Static592.method8147(Static662.anInt9819 | 0xFF000000, local307, Static725.anInt11302, local62, Static618.anInt6014, local55, Static129.anInt2431 | 0xFF000000, arg0, Static382.anInt6839, local293, Static614.anInt9938);
				}
				Static372.method5400(Static614.anInt9938, Static382.anInt6839, Static618.anInt6014, Static725.anInt11302);
			}
		} else {
			local66 = 0;
			for (local71 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local71 != null; local71 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
				local89 = local25 + (-local66 + -1 + Static285.anInt5168) * 16 + 13 + 20;
				local66++;
				Static592.method8147(Static662.anInt9819 | 0xFF000000, local89, local25, local62, local27, local55, Static129.anInt2431 | 0xFF000000, arg0, local31, local71, local21);
			}
		}
		Static372.method5400(Static121.anInt2335 + local7, Static188.anInt3322, Static655.anInt10491, local9 + Static65.anInt1025);
	}
}
