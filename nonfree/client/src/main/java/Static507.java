import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt8581 = -1;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!im;")
	public static final Class140 aClass140_140 = new Class140(47, 6);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method7024(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static463.anInt7846++;
		Static530.anInt8918 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static227.anInt4494; local7 < Static388.anInt7032; local7++) {
			@Pc(12) Class255[][] local12 = Static242.aClass255ArrayArrayArray2[local7];
			for (local14 = Static454.anInt7748; local14 < Static299.anInt5552; local14++) {
				for (local17 = Static281.anInt5279; local17 < Static237.anInt4785; local17++) {
					@Pc(24) Class255 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static149.aBooleanArrayArray5[local14 + Static251.anInt4913 - Static393.anInt7097][local17 + Static251.anInt4913 - Static211.anInt4100] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean523 = true;
							local24.aBoolean524 = true;
							if (local24.aClass63_3 == null) {
								local24.aBoolean525 = false;
							} else {
								local24.aBoolean525 = true;
							}
							Static530.anInt8918++;
						} else {
							local24.aBoolean523 = false;
							local24.aBoolean524 = false;
							local24.aByte103 = 0;
							if (local14 >= Static393.anInt7097 - 16 && local14 <= Static393.anInt7097 + 16 && local17 >= Static211.anInt4100 - 16 && local17 <= Static211.anInt4100 + 16 && (local24.aClass49_Sub1_3 != null || local24.aClass49_Sub1_2 != null || local24.aClass49_Sub3_1 != null || local24.aClass49_Sub3_2 != null || local24.aClass49_Sub5_2 != null || local24.aClass63_3 != null)) {
								Static497.aClass75_1.method3835(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static227.anInt4494; local140 < Static388.anInt7032; local140++) {
			if (Static416.aClass122_7.method7267() && local140 >= arg2 && arg1 != null) {
				local14 = Static149.aBooleanArrayArray5.length;
				if (Static454.anInt7748 + Static149.aBooleanArrayArray5.length > Static93.anInt1898) {
					local14 -= Static454.anInt7748 + Static149.aBooleanArrayArray5.length - Static93.anInt1898;
				}
				local17 = Static149.aBooleanArrayArray5[0].length;
				if (Static281.anInt5279 + Static149.aBooleanArrayArray5[0].length > Static382.anInt6965) {
					local17 -= Static281.anInt5279 + Static149.aBooleanArrayArray5[0].length - Static382.anInt6965;
				}
				@Pc(193) int local193 = Static243.anInt4851;
				while (true) {
					if (local193 >= local14) {
						Static497.aClass75_1.method3831(true, local140, Static544.aClass205Array3[local140]);
						break;
					}
					@Pc(200) int local200 = local193 + Static454.anInt7748 - Static243.anInt4851;
					for (@Pc(202) int local202 = Static443.anInt7640; local202 < local17; local202++) {
						Static360.aBooleanArrayArray6[local193][local202] = false;
						if (Static149.aBooleanArrayArray5[local193][local202]) {
							@Pc(221) int local221 = local202 + Static281.anInt5279 - Static443.anInt7640;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static242.aClass255ArrayArrayArray2[local223][local200][local221] != null && Static242.aClass255ArrayArrayArray2[local223][local200][local221].aByte101 == local140) {
									Static360.aBooleanArrayArray6[local193][local202] = Static242.aClass255ArrayArrayArray2[local223][local200][local221].aBoolean523;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static497.aClass75_1.method3831(false, local140, Static544.aClass205Array3[local140]);
			}
			Static497.aClass75_1.method3840();
		}
		if (!Static111.method1896(true)) {
			Static111.method1896(false);
		}
	}
}
