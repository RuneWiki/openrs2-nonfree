import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ft", name = "eb", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!ft", name = "bb", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_43 = new Class92(23, -1);

	@OriginalMember(owner = "client!ft", name = "db", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_38 = new Class267("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)Lclient!ts;")
	public static Class239 method2092(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static35.aClass239ArrayArray1[local13] == null || Static35.aClass239ArrayArray1[local13][local17] == null) {
			@Pc(31) boolean local31 = Static88.method4151(local13);
			if (!local31) {
				return null;
			}
		}
		return Static35.aClass239ArrayArray1[local13][local17];
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)[Lclient!ag;")
	public static Class8[] method2093() {
		return new Class8[] { Static288.aClass8_5, Static396.aClass8_4, Static252.aClass8_2 };
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V")
	public static void method2094() {
		@Pc(16) boolean local16 = Static232.aClass6_Sub1_Sub1_4.method6431() == 1;
		@Pc(20) int local20 = Static232.aClass6_Sub1_Sub1_4.method6455();
		@Pc(29) int local29 = Static232.aClass6_Sub1_Sub1_4.method6472();
		@Pc(33) int local33 = Static232.aClass6_Sub1_Sub1_4.method6485();
		Static98.anInt6276 = Static232.aClass6_Sub1_Sub1_4.method6431();
		Static233.method3616(local29);
		Static232.aClass6_Sub1_Sub1_4.method3791();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(64) int local64;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static181.anInt3574 >> 3; local51++) {
				for (local55 = 0; local55 < Static117.anInt2450 >> 3; local55++) {
					local64 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
					if (local64 == 1) {
						Static287.anIntArrayArrayArray10[local47][local51][local55] = Static232.aClass6_Sub1_Sub1_4.method3803(26);
					} else {
						Static287.anIntArrayArrayArray10[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static232.aClass6_Sub1_Sub1_4.method3801();
		local51 = (Static334.anInt5833 - Static232.aClass6_Sub1_Sub1_4.anInt7898) / 16;
		Static386.anIntArrayArray46 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local64 = 0; local64 < 4; local64++) {
				Static386.anIntArrayArray46[local55][local64] = Static232.aClass6_Sub1_Sub1_4.method6442();
			}
		}
		Static188.anIntArray230 = new int[local51];
		Static137.aByteArrayArray11 = new byte[local51][];
		Static298.aByteArrayArray20 = null;
		Static372.anIntArray460 = new int[local51];
		Static269.aByteArrayArray17 = new byte[local51][];
		Static39.aByteArrayArray6 = new byte[local51][];
		Static344.anIntArray411 = new int[local51];
		Static411.anIntArray508 = new int[local51];
		Static426.anIntArray519 = new int[local51];
		Static174.anIntArray219 = null;
		Static213.aByteArrayArray23 = new byte[local51][];
		local51 = 0;
		for (local64 = 0; local64 < 4; local64++) {
			for (@Pc(188) int local188 = 0; local188 < Static181.anInt3574 >> 3; local188++) {
				for (@Pc(192) int local192 = 0; local192 < Static117.anInt2450 >> 3; local192++) {
					@Pc(202) int local202 = Static287.anIntArrayArrayArray10[local64][local188][local192];
					if (local202 != -1) {
						@Pc(212) int local212 = local202 >> 14 & 0x3FF;
						@Pc(218) int local218 = local202 >> 3 & 0x7FF;
						@Pc(228) int local228 = local218 / 8 + (local212 / 8 << 8);
						for (@Pc(230) int local230 = 0; local230 < local51; local230++) {
							if (Static411.anIntArray508[local230] == local228) {
								local228 = -1;
								break;
							}
						}
						if (local228 != -1) {
							Static411.anIntArray508[local51] = local228;
							@Pc(258) int local258 = local228 >> 8 & 0xFF;
							@Pc(262) int local262 = local228 & 0xFF;
							Static344.anIntArray411[local51] = Static332.aClass100_63.method2494("m" + local258 + "_" + local262);
							Static426.anIntArray519[local51] = Static332.aClass100_63.method2494("l" + local258 + "_" + local262);
							Static188.anIntArray230[local51] = Static332.aClass100_63.method2494("um" + local258 + "_" + local262);
							Static372.anIntArray460[local51] = Static332.aClass100_63.method2494("ul" + local258 + "_" + local262);
							local51++;
						}
					}
				}
			}
		}
		Static86.method821(local16, false, local20, local33);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(IZ)I")
	public static int method2096(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0xF3333333);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
