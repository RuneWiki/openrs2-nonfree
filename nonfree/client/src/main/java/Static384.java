import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "J")
	public static long aLong207;

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "Lclient!aq;")
	public static Class5 aClass5_17;

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "Lclient!ll;")
	public static final Class143 aClass143_29 = new Class143("WTQA", 2);

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
	public static int anInt6676 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public static void method5702() {
		if (Static198.anIntArray439 != null) {
			return;
		}
		Static198.anIntArray439 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(40) float local40 = ((float) (local27 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(58) float local58 = (float) local51 / 128.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(68) float local68 = local40 / 60.0F;
				@Pc(71) int local71 = (int) local68;
				@Pc(75) int local75 = local71 % 6;
				@Pc(80) float local80 = local68 - (float) local71;
				@Pc(87) float local87 = local58 * (1.0F - local49);
				@Pc(95) float local95 = local58 * (1.0F - local80 * local49);
				@Pc(105) float local105 = (1.0F - local49 * (1.0F - local80)) * local58;
				if (local75 == 0) {
					local62 = local105;
					local60 = local58;
					local64 = local87;
				} else if (local75 == 1) {
					local62 = local58;
					local60 = local95;
					local64 = local87;
				} else if (local75 == 2) {
					local60 = local87;
					local62 = local58;
					local64 = local105;
				} else if (local75 == 3) {
					local64 = local58;
					local60 = local87;
					local62 = local95;
				} else if (local75 == 4) {
					local62 = local87;
					local60 = local105;
					local64 = local58;
				} else if (local75 == 5) {
					local62 = local87;
					local64 = local95;
					local60 = local58;
				}
				local60 = (float) Math.pow((double) local60, local19);
				local62 = (float) Math.pow((double) local62, local19);
				local64 = (float) Math.pow((double) local64, local19);
				@Pc(195) int local195 = (int) (local60 * 256.0F);
				@Pc(200) int local200 = (int) (local62 * 256.0F);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(218) int local218 = (local195 << 16) + (local200 << 8) + local205 - 16777216;
				Static198.anIntArray439[local25++] = local218;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V")
	public static void method5703() {
		Static295.method4664(Static243.aClass155_26);
		Static137.anInt2566++;
		if (Static330.aBoolean447 && Static291.aBoolean382) {
			@Pc(28) int local28 = Static138.aClass78_1.method1804();
			@Pc(40) int local40 = Static138.aClass78_1.method1808();
			local28 -= Static366.anInt6415;
			local40 -= Static22.anInt540;
			if (Static17.anInt415 > local28) {
				local28 = Static17.anInt415;
			}
			if (Static17.anInt415 + Static380.aClass155_38.anInt4170 < local28 - -Static243.aClass155_26.anInt4170) {
				local28 = Static380.aClass155_38.anInt4170 + Static17.anInt415 - Static243.aClass155_26.anInt4170;
			}
			if (Static33.anInt705 > local40) {
				local40 = Static33.anInt705;
			}
			if (local40 + Static243.aClass155_26.anInt4214 > Static33.anInt705 + Static380.aClass155_38.anInt4214) {
				local40 = Static33.anInt705 + Static380.aClass155_38.anInt4214 - Static243.aClass155_26.anInt4214;
			}
			@Pc(114) int local114 = local28 + Static380.aClass155_38.anInt4174 - Static17.anInt415;
			@Pc(122) int local122 = Static380.aClass155_38.anInt4207 + local40 - Static33.anInt705;
			@Pc(169) Class2_Sub24 local169;
			if (Static138.aClass78_1.method1805()) {
				if (Static243.aClass155_26.anInt4149 < Static137.anInt2566) {
					@Pc(135) int local135 = local28 - Static291.anInt5148;
					@Pc(140) int local140 = local40 - Static112.anInt2244;
					if (Static243.aClass155_26.anInt4159 < local135 || local135 < -Static243.aClass155_26.anInt4159 || Static243.aClass155_26.anInt4159 < local140 || local140 < -Static243.aClass155_26.anInt4159) {
						Static47.aBoolean86 = true;
					}
				}
				if (Static243.aClass155_26.anObjectArray9 != null && Static47.aBoolean86) {
					local169 = new Class2_Sub24();
					local169.anObjectArray5 = Static243.aClass155_26.anObjectArray9;
					local169.anInt3669 = local122;
					local169.anInt3666 = local114;
					local169.aClass155_23 = Static243.aClass155_26;
					Static157.method2604(local169);
					return;
				}
			} else {
				if (Static47.aBoolean86) {
					if (Static243.aClass155_26.anObjectArray22 != null) {
						local169 = new Class2_Sub24();
						local169.aClass155_24 = Static365.aClass155_13;
						local169.anInt3669 = local122;
						local169.anObjectArray5 = Static243.aClass155_26.anObjectArray22;
						local169.aClass155_23 = Static243.aClass155_26;
						local169.anInt3666 = local114;
						Static157.method2604(local169);
					}
					if (Static365.aClass155_13 != null && Static41.method886(Static243.aClass155_26) != null) {
						Static259.method4041(Static365.aClass155_13, Static243.aClass155_26);
					}
				} else if ((Static334.anInt5856 == 1 || Static280.method4312()) && Static379.anInt1192 > 2) {
					Static97.method1768(Static22.anInt540 + Static112.anInt2244, Static366.anInt6415 + Static291.anInt5148);
				} else if (Static23.method633()) {
					Static97.method1768(Static22.anInt540 + Static112.anInt2244, Static366.anInt6415 - -Static291.anInt5148);
				}
				Static243.aClass155_26 = null;
			}
		} else if (Static137.anInt2566 > 1) {
			Static243.aClass155_26 = null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
	public static void method5704() {
		Static240.aClass103_1.method4087();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static172.aLongArray7[local17] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static54.aLongArray2[local29] = 0L;
		}
		Static197.anInt3618 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V")
	public static void method5707() {
		@Pc(8) int local8 = Static67.aByteArrayArray7.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static67.aByteArrayArray7[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static52.anInt3689; local25++) {
					if (Static372.anIntArray785[local10] == Static186.anIntArray762[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static186.anIntArray762[Static52.anInt3689] = Static372.anIntArray785[local10];
					local23 = Static52.anInt3689++;
				}
				@Pc(69) Class2_Sub13 local69 = new Class2_Sub13(Static67.aByteArrayArray7[local10]);
				@Pc(71) int local71 = 0;
				while (local69.anInt4788 < Static67.aByteArrayArray7[local10].length && local71 < 511 && Static199.anInt3672 < 1023) {
					@Pc(90) int local90 = local71++ << 6 | local23;
					@Pc(94) int local94 = local69.method4245();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(120) int local120 = local104 + (Static372.anIntArray785[local10] >> 8) * 64 - Static376.anInt6607;
					@Pc(133) int local133 = local108 + (Static372.anIntArray785[local10] & 0xFF) * 64 - Static133.anInt2474;
					@Pc(140) Class240 local140 = Static274.aClass151_4.method3705(local69.method4245());
					if (Static107.aClass12_Sub1_Sub2_Sub1Array1[local90] == null && (local140.aByte75 & 0x1) > 0 && Static303.anInt5442 == local98 && local120 >= 0 && local140.anInt6483 + local120 < Static392.anInt6751 && local133 >= 0 && local140.anInt6483 + local133 < Static307.anInt5484) {
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local90] = new Class12_Sub1_Sub2_Sub1();
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local90].anInt5365 = local90;
						@Pc(192) Class12_Sub1_Sub2_Sub1 local192 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local90];
						Static346.anIntArray730[Static199.anInt3672++] = local90;
						local192.anInt5340 = Static295.anInt5281;
						local192.method3260(local140);
						local192.method4698(local192.aClass240_1.anInt6483);
						local192.anInt5317 = local192.aClass240_1.anInt6497 << 3;
						if (local192.anInt5317 == 0) {
							local192.method4703(0);
						} else {
							local192.method4703(local192.aClass240_1.aByte78 + 4 << 11 & 0x3AE2);
						}
						local192.method3263(local192.method4706(), local133, local98, true, local120);
					}
				}
			}
		}
	}
}
