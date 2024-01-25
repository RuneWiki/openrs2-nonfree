import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
	public static final int[] anIntArray260 = new int[6];

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_53 = new Class179(46, 5);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method3186() {
		@Pc(9) int local9 = Static53.aClass2_Sub22_Sub2_1.method8546();
		@Pc(20) boolean local20 = Static53.aClass2_Sub22_Sub2_1.method8527() == 1;
		@Pc(24) int local24 = Static53.aClass2_Sub22_Sub2_1.method8547();
		Static592.anInt9602 = Static53.aClass2_Sub22_Sub2_1.method8547();
		@Pc(37) int local37 = Static53.aClass2_Sub22_Sub2_1.method8544();
		Static626.method8384();
		Static222.method3035(local24);
		Static53.aClass2_Sub22_Sub2_1.method8566();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(62) int local62;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static228.anInt3704 >> 3; local51++) {
				for (local55 = 0; local55 < Static162.anInt2911 >> 3; local55++) {
					local62 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
					if (local62 == 1) {
						Static37.anIntArrayArrayArray1[local47][local51][local55] = Static53.aClass2_Sub22_Sub2_1.method8569(26);
					} else {
						Static37.anIntArrayArrayArray1[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static53.aClass2_Sub22_Sub2_1.method8560();
		local51 = (Static84.anInt1498 - Static53.aClass2_Sub22_Sub2_1.anInt10247) / 16;
		Static220.anIntArrayArray16 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static220.anIntArrayArray16[local55][local62] = Static53.aClass2_Sub22_Sub2_1.method8542();
			}
		}
		Static352.anIntArray395 = new int[local51];
		Static403.aByteArrayArray22 = new byte[local51][];
		Static388.aByteArrayArray21 = new byte[local51][];
		Static171.aByteArrayArray9 = null;
		Static399.anIntArray466 = null;
		Static407.anIntArray620 = new int[local51];
		Static508.aByteArrayArray26 = new byte[local51][];
		Static439.anIntArray503 = new int[local51];
		Static4.aByteArrayArray1 = new byte[local51][];
		Static416.anIntArray474 = new int[local51];
		Static60.anIntArray91 = new int[local51];
		local51 = 0;
		for (local62 = 0; local62 < 4; local62++) {
			for (@Pc(200) int local200 = 0; local200 < Static228.anInt3704 >> 3; local200++) {
				for (@Pc(204) int local204 = 0; local204 < Static162.anInt2911 >> 3; local204++) {
					@Pc(214) int local214 = Static37.anIntArrayArrayArray1[local62][local200][local204];
					if (local214 != -1) {
						@Pc(224) int local224 = local214 >> 14 & 0x3FF;
						@Pc(230) int local230 = local214 >> 3 & 0x7FF;
						@Pc(240) int local240 = local230 / 8 + (local224 / 8 << 8);
						for (@Pc(242) int local242 = 0; local242 < local51; local242++) {
							if (Static407.anIntArray620[local242] == local240) {
								local240 = -1;
								break;
							}
						}
						if (local240 != -1) {
							Static407.anIntArray620[local51] = local240;
							@Pc(279) int local279 = local240 >> 8 & 0xFF;
							@Pc(283) int local283 = local240 & 0xFF;
							Static60.anIntArray91[local51] = Static280.aClass380_67.method8609("m" + local279 + "_" + local283);
							Static439.anIntArray503[local51] = Static280.aClass380_67.method8609("l" + local279 + "_" + local283);
							Static352.anIntArray395[local51] = Static280.aClass380_67.method8609("um" + local279 + "_" + local283);
							Static416.anIntArray474[local51] = Static280.aClass380_67.method8609("ul" + local279 + "_" + local283);
							local51++;
						}
					}
				}
			}
		}
		Static599.method8102(11, local9, local37, local20);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z")
	public static boolean method3187(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static158.aCharArray2[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method3188() {
		Static71.anInt1258 = 0;
		@Pc(17) int local17 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9) + Static132.anInt2246;
		@Pc(24) int local24 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9) + Static123.anInt2176;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static71.anInt1258 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static71.anInt1258 = 1;
		}
		if (Static71.anInt1258 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static71.anInt1258 = 0;
		}
	}
}
