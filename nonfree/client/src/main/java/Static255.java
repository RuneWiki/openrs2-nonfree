import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)V")
	public static void method3686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg1, 7);
		local13.method2604();
		local13.anInt3083 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public static void method3687() {
		if (Static323.aClass50_Sub1_1.method2861(Static177.anInt2973) || Static317.anInt5523 == Static263.anInt4963) {
			Static71.method5372(Static122.aClass19_16);
			if (Static263.anInt4963 != Static333.anInt5744) {
				Static215.method3238();
			}
		} else {
			Static311.method4167(false, Static453.anInt7373, Static169.anInt3265, false);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V")
	public static void method3689(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static146.aClass4_Sub12_Sub1_3.method1137(Static454.anInt4075) >= 15) {
				@Pc(22) int local22 = Static146.aClass4_Sub12_Sub1_3.method1143(15);
				if (local22 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static143.aClass16_Sub1_Sub5_Sub2Array1[local22] == null) {
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local22] = new Class16_Sub1_Sub5_Sub2();
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local22].anInt6037 = local22;
						local27 = true;
					}
					@Pc(48) Class16_Sub1_Sub5_Sub2 local48 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local22];
					Static342.anIntArray412[Static12.anInt163++] = local22;
					local48.anInt6015 = Static24.anInt5323;
					if (local48.aClass264_1 != null && local48.aClass264_1.method5578()) {
						Static425.method5429(local48);
					}
					@Pc(75) int local75 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
					@Pc(80) int local80 = Static146.aClass4_Sub12_Sub1_3.method1143(2);
					@Pc(85) int local85 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
					if (local85 == 1) {
						Static440.anIntArray543[Static41.anInt759++] = local22;
					}
					@Pc(105) int local105;
					if (arg0) {
						local105 = Static146.aClass4_Sub12_Sub1_3.method1143(8);
						if (local105 > 127) {
							local105 -= 256;
						}
					} else {
						local105 = Static146.aClass4_Sub12_Sub1_3.method1143(5);
						if (local105 > 15) {
							local105 -= 32;
						}
					}
					@Pc(131) int local131;
					if (arg0) {
						local131 = Static146.aClass4_Sub12_Sub1_3.method1143(8);
						if (local131 > 127) {
							local131 -= 256;
						}
					} else {
						local131 = Static146.aClass4_Sub12_Sub1_3.method1143(5);
						if (local131 > 15) {
							local131 -= 32;
						}
					}
					@Pc(161) int local161 = Static146.aClass4_Sub12_Sub1_3.method1143(3) + 4 << 11 & 0x391E;
					local48.method4766(Static329.aClass240_1.method5229(Static146.aClass4_Sub12_Sub1_3.method1143(14)));
					local48.method4754(local48.aClass264_1.anInt7201);
					local48.anInt6080 = local48.aClass264_1.anInt7221 << 3;
					if (local48.anInt6080 == 0) {
						local48.method4745(0);
					} else if (local27) {
						local48.method4745(local161);
					}
					local48.method4760(local80, local131 + Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray426[0], local48.method4751(), local75 == 1, local105 + Static1.aClass16_Sub1_Sub5_Sub1_1.anIntArray427[0]);
					if (local48.aClass264_1.method5578()) {
						Static126.method2264(local48.anIntArray426[0], local48, null, local48.anIntArray427[0], 0, local48.aByte82, null);
					}
					continue;
				}
			}
			Static146.aClass4_Sub12_Sub1_3.method1135();
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;C)I")
	public static int method3690(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method3691(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static365.method4925(arg0);
	}
}
