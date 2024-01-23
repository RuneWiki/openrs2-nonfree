import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
	public static int anInt5294;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!ef;")
	public static Class47 aClass47_1 = new Class47();

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static int anInt5290 = 1;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString189 = "purple:";

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[Lclient!tk;)V")
	public static void method4008(@OriginalArg(0) int arg0, @OriginalArg(2) Class159[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) Class159 local11 = arg1[local3];
			if (local11 != null) {
				if (local11.anInt5197 == 0) {
					if (local11.aClass159Array1 != null) {
						method4008(arg0, local11.aClass159Array1);
					}
					@Pc(34) Class8_Sub32 local34 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local11.anInt5199);
					if (local34 != null) {
						Static88.method1440(arg0, local34.anInt5295);
					}
				}
				@Pc(56) Class8_Sub14 local56;
				if (arg0 == 0 && local11.anObjectArray4 != null) {
					local56 = new Class8_Sub14();
					local56.anObjectArray1 = local11.anObjectArray4;
					local56.aClass159_10 = local11;
					Static173.method2688(local56);
				}
				if (arg0 == 1 && local11.anObjectArray19 != null) {
					if (local11.anInt5133 >= 0) {
						@Pc(84) Class159 local84 = Static82.method1361(local11.anInt5199);
						if (local84 == null || local84.aClass159Array1 == null || local11.anInt5133 >= local84.aClass159Array1.length || local11 != local84.aClass159Array1[local11.anInt5133]) {
							continue;
						}
					}
					local56 = new Class8_Sub14();
					local56.aClass159_10 = local11;
					local56.anObjectArray1 = local11.anObjectArray19;
					Static173.method2688(local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V")
	public static void method4009(@OriginalArg(1) boolean arg0) {
		Static207.aBoolean349 = arg0;
		@Pc(65) boolean local65;
		@Pc(13) int local13;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(36) int local36;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(151) int local151;
		@Pc(164) int local164;
		@Pc(177) int local177;
		if (!Static207.aBoolean349) {
			local13 = Static275.aClass8_Sub2_Sub1_6.method2348();
			local21 = (Static68.anInt1687 - Static275.aClass8_Sub2_Sub1_6.anInt2955) / 16;
			Static162.anIntArrayArray16 = new int[local21][4];
			for (local27 = 0; local27 < local21; local27++) {
				for (local36 = 0; local36 < 4; local36++) {
					Static162.anIntArrayArray16[local27][local36] = Static275.aClass8_Sub2_Sub1_6.method2376();
				}
			}
			local27 = Static275.aClass8_Sub2_Sub1_6.method2348();
			local65 = Static135.method2195(Static275.aClass8_Sub2_Sub1_6.method2322());
			local36 = Static275.aClass8_Sub2_Sub1_6.method2377();
			local73 = Static275.aClass8_Sub2_Sub1_6.method2322();
			local77 = Static275.aClass8_Sub2_Sub1_6.method2375();
			Static114.anIntArray190 = new int[local21];
			Static109.aByteArrayArray8 = new byte[local21][];
			Static294.anIntArray496 = new int[local21];
			Static274.aByteArrayArray17 = null;
			Static173.anIntArray262 = new int[local21];
			Static52.anIntArray80 = new int[local21];
			Static218.anIntArray335 = null;
			Static13.anIntArray15 = new int[local21];
			Static282.aByteArrayArray5 = new byte[local21][];
			Static177.aByteArrayArray7 = new byte[local21][];
			Static13.aByteArrayArray1 = new byte[local21][];
			local21 = 0;
			@Pc(113) boolean local113 = false;
			if ((local36 / 8 == 48 || local36 / 8 == 49) && local13 / 8 == 48) {
				local113 = true;
			}
			if (local36 / 8 == 48 && local13 / 8 == 148) {
				local113 = true;
			}
			for (local151 = (local36 - 6) / 8; local151 <= (local36 + 6) / 8; local151++) {
				for (local164 = (local13 - 6) / 8; local164 <= (local13 + 6) / 8; local164++) {
					local177 = local164 + (local151 << 8);
					if (local113 && (local164 == 49 || local164 == 149 || local164 == 147 || local151 == 50 || local151 == 49 && local164 == 47)) {
						Static13.anIntArray15[local21] = local177;
						Static294.anIntArray496[local21] = -1;
						Static114.anIntArray190[local21] = -1;
						Static173.anIntArray262[local21] = -1;
						Static52.anIntArray80[local21] = -1;
					} else {
						Static13.anIntArray15[local21] = local177;
						Static294.anIntArray496[local21] = Static157.aClass132_92.method3185("m" + local151 + "_" + local164);
						Static114.anIntArray190[local21] = Static157.aClass132_92.method3185("l" + local151 + "_" + local164);
						Static173.anIntArray262[local21] = Static157.aClass132_92.method3185("um" + local151 + "_" + local164);
						Static52.anIntArray80[local21] = Static157.aClass132_92.method3185("ul" + local151 + "_" + local164);
					}
					local21++;
				}
			}
			Static273.method4055(local73, local65, false, local36, local13, local27, local77);
			return;
		}
		Static275.aClass8_Sub2_Sub1_6.method2385();
		for (local13 = 0; local13 < 4; local13++) {
			for (local21 = 0; local21 < 13; local21++) {
				for (local27 = 0; local27 < 13; local27++) {
					local36 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
					if (local36 == 1) {
						Static4.anIntArrayArrayArray1[local13][local21][local27] = Static275.aClass8_Sub2_Sub1_6.method2390(26);
					} else {
						Static4.anIntArrayArrayArray1[local13][local21][local27] = -1;
					}
				}
			}
		}
		Static275.aClass8_Sub2_Sub1_6.method2391();
		local13 = (Static68.anInt1687 - Static275.aClass8_Sub2_Sub1_6.anInt2955) / 16;
		Static162.anIntArrayArray16 = new int[local13][4];
		for (local21 = 0; local21 < local13; local21++) {
			for (local27 = 0; local27 < 4; local27++) {
				Static162.anIntArrayArray16[local21][local27] = Static275.aClass8_Sub2_Sub1_6.method2381();
			}
		}
		local65 = Static135.method2195(Static275.aClass8_Sub2_Sub1_6.method2349());
		local21 = Static275.aClass8_Sub2_Sub1_6.method2375();
		local27 = Static275.aClass8_Sub2_Sub1_6.method2322();
		local36 = Static275.aClass8_Sub2_Sub1_6.method2375();
		local73 = Static275.aClass8_Sub2_Sub1_6.method2377();
		local77 = Static275.aClass8_Sub2_Sub1_6.method2377();
		Static218.anIntArray335 = null;
		Static294.anIntArray496 = new int[local13];
		Static173.anIntArray262 = new int[local13];
		Static109.aByteArrayArray8 = new byte[local13][];
		Static13.aByteArrayArray1 = new byte[local13][];
		Static52.anIntArray80 = new int[local13];
		Static282.aByteArrayArray5 = new byte[local13][];
		Static114.anIntArray190 = new int[local13];
		Static274.aByteArrayArray17 = null;
		Static177.aByteArrayArray7 = new byte[local13][];
		Static13.anIntArray15 = new int[local13];
		local13 = 0;
		for (@Pc(486) int local486 = 0; local486 < 4; local486++) {
			for (local151 = 0; local151 < 13; local151++) {
				for (local164 = 0; local164 < 13; local164++) {
					local177 = Static4.anIntArrayArrayArray1[local486][local151][local164];
					if (local177 != -1) {
						@Pc(518) int local518 = local177 >> 14 & 0x3FF;
						@Pc(524) int local524 = local177 >> 3 & 0x7FF;
						@Pc(535) int local535 = (local518 / 8 << 8) + (local524 / 8);
						@Pc(537) int local537;
						for (local537 = 0; local537 < local13; local537++) {
							if (local535 == Static13.anIntArray15[local537]) {
								local535 = -1;
								break;
							}
						}
						if (local535 != -1) {
							Static13.anIntArray15[local13] = local535;
							local537 = local535 >> 8 & 0xFF;
							@Pc(569) int local569 = local535 & 0xFF;
							Static294.anIntArray496[local13] = Static157.aClass132_92.method3185("m" + local537 + "_" + local569);
							Static114.anIntArray190[local13] = Static157.aClass132_92.method3185("l" + local537 + "_" + local569);
							Static173.anIntArray262[local13] = Static157.aClass132_92.method3185("um" + local537 + "_" + local569);
							Static52.anIntArray80[local13] = Static157.aClass132_92.method3185("ul" + local537 + "_" + local569);
							local13++;
						}
					}
				}
			}
		}
		Static273.method4055(local27, local65, false, local36, local77, local73, local21);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method4010() {
		Static244.anIntArray369 = Static48.method770(0.4F);
	}
}
