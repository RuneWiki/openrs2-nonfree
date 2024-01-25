import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt8153;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
	public static final int[] anIntArray760 = new int[50];

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!bv;")
	public static Class37 aClass37_89 = new Class37();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method6718(@OriginalArg(1) Class122 arg0) {
		@Pc(12) int local12 = Static13.anInt305;
		@Pc(14) int local14 = Static188.anInt3359;
		@Pc(16) int local16 = Static541.anInt9145;
		@Pc(18) int local18 = Static260.anInt5040;
		arg0.method7265(-10660793, local18, local12, local16, local14);
		arg0.method7265(-16777216, 16, local12 + 1, local16 - 2, local14 + 1);
		arg0.method7223(local12 + 1, local18 + -19, local16 - 2, -16777216, local14 + 18);
		Static296.aClass67_9.method7498(-1, Static179.aClass306_39.method7165(Static179.anInt3168), -10660793, local14 + 14, local12 - -3);
		@Pc(77) int local77 = Static498.aClass5_1.method7052();
		@Pc(81) int local81 = Static498.aClass5_1.method7042();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class1_Sub24 local88 = (Class1_Sub24) Static248.aClass37_30.method977(); local88 != null; local88 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			@Pc(103) int local103 = local14 + (-local83 + Static16.anInt415 + -1) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local12 < local77 && local77 < local12 + local16 && local81 > local103 - 13 && local103 + 3 > local81 && local88.aBoolean218) {
				local105 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static268.method4415(local88.anInt3161)) {
				local135 = Static342.aClass250_2.method5980((int) local88.aLong150).anIntArray335;
			} else if (local88.anInt3166 != -1) {
				local135 = Static342.aClass250_2.method5980(local88.anInt3166).anIntArray335;
			} else if (Static295.method4713(local88.anInt3161)) {
				@Pc(176) Class1_Sub17 local176 = (Class1_Sub17) Static380.aClass17_29.method738((long) local88.aLong150);
				if (local176 != null) {
					@Pc(181) Class49_Sub2_Sub2_Sub2 local181 = local176.aClass49_Sub2_Sub2_Sub2_2;
					@Pc(184) Class196 local184 = local181.aClass196_1;
					if (local184.anIntArray570 != null) {
						local184 = local184.method4855(Static251.aClass119_1);
					}
					if (local184 != null) {
						local135 = local184.anIntArray571;
					}
				}
			} else if (Static174.method2615(local88.anInt3161)) {
				@Pc(218) Class36 local218;
				if (local88.anInt3161 == 1012) {
					local218 = Static308.aClass96_4.method2274((int) local88.aLong150);
				} else {
					local218 = Static308.aClass96_4.method2274((int) (local88.aLong150 >>> 32 & 0x7FFFFFFFL));
				}
				if (local218.anIntArray127 != null) {
					local218 = local218.method954(Static251.aClass119_1);
				}
				if (local218 != null) {
					local135 = local218.anIntArray126;
				}
			}
			@Pc(247) String local247 = Static224.method3889(local88);
			if (local135 != null) {
				local247 = local247 + Static228.method3983(local135);
			}
			Static296.aClass67_9.method7491(local12 + 3, local103, local105, Static204.anIntArray341, local247, Static72.aClass2Array2);
			local83++;
			if (local88.aBoolean217) {
				Static475.aClass2_35.method7364(Static381.aClass232_6.method5432(local247) + local12 + 5, local103 + -12);
			}
		}
		Static40.method897(Static260.anInt5040, Static13.anInt305, Static541.anInt9145, Static188.anInt3359);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method6720() {
		Static158.anIntArray278 = null;
		Static468.anIntArray741 = null;
		Static349.anIntArray635 = null;
		Static321.anIntArray589 = null;
		Static169.anIntArray288 = null;
		Static74.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method6722(@OriginalArg(1) int arg0) {
		if (Static251.anInt4908 == arg0) {
			return;
		}
		Static459.anInt7799 = Static482.anInt7990 = Static312.anIntArray576[arg0];
		Static55.method1089();
		Static73.anIntArrayArray18 = new int[Static459.anInt7799][Static482.anInt7990];
		Static178.anIntArrayArrayArray2 = new int[4][Static459.anInt7799 >> 3][Static482.anInt7990 >> 3];
		Static336.anIntArrayArray79 = new int[Static459.anInt7799][Static482.anInt7990];
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			Static86.aClass91Array1[local44] = Static419.method6152(Static482.anInt7990, Static459.anInt7799);
		}
		Static406.aByteArrayArrayArray15 = new byte[4][Static459.anInt7799][Static482.anInt7990];
		Static349.method5285(Static482.anInt7990, Static459.anInt7799);
		Static135.method2251(Static459.anInt7799 >> 3, Static482.anInt7990 >> 3, Static513.aClass122_10);
		Static251.anInt4908 = arg0;
	}
}
