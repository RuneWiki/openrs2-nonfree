import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public static int anInt890 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method757() {
		if (Static385.aClass39_2 == null) {
			return;
		}
		if (Static385.aClass39_2.anInt894 == 1) {
			Static385.aClass39_2 = null;
			return;
		}
		if (Static385.aClass39_2.anInt894 == 2) {
			Static455.method6390(Static91.aClass258_1, 2, Static461.aString72);
			Static385.aClass39_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!ps;)V")
	public static void method759(@OriginalArg(1) Class262 arg0) {
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(62) int local62;
		@Pc(80) int local80;
		@Pc(54) int local54;
		@Pc(58) int local58;
		if (Static188.aClass262_15 == arg0) {
			local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
			local24 = (local16 >> 4 & 0x7) + Static470.anInt7808;
			local31 = Static418.anInt7087 + (local16 & 0x7);
			local35 = Static532.aClass3_Sub11_Sub1_2.method5198();
			if (local35 == 65535) {
				local35 = -1;
			}
			local44 = Static532.aClass3_Sub11_Sub1_2.method5175();
			local50 = local44 >> 4 & 0xF;
			local54 = local44 & 0x7;
			local58 = Static532.aClass3_Sub11_Sub1_2.method5175();
			local62 = Static532.aClass3_Sub11_Sub1_2.method5175();
			if (local24 >= 0 && local31 >= 0 && local24 < Static54.anInt1038 && Static140.anInt3026 > local31) {
				local80 = local50 + 1;
				if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] >= local24 - local80 && local24 + local80 >= Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] >= local31 - local80 && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] <= local31 + local80) {
					Static319.method4665(local62, local35, local54, local58, (local24 << 16) + (Static253.anInt4491 << 24) + (local31 << 8) + local50);
				}
			}
		} else if (Static134.aClass262_4 == arg0) {
			local16 = Static532.aClass3_Sub11_Sub1_2.method5178();
			local24 = Static532.aClass3_Sub11_Sub1_2.method5204();
			local31 = Static418.anInt7087 + (local24 & 0x7);
			local35 = local31 + Static246.anInt4344;
			local44 = (local24 >> 4 & 0x7) + Static470.anInt7808;
			local50 = local44 + Static335.anInt5608;
			local54 = Static532.aClass3_Sub11_Sub1_2.method5174();
			@Pc(196) boolean local196 = local44 >= 0 && local31 >= 0 && Static54.anInt1038 > local44 && local31 < Static140.anInt3026;
			if (local196 || Static494.method6671(Static39.anInt749)) {
				Static533.method7123(Static253.anInt4491, local35, local50, new Class3_Sub25(local16, local54));
				if (local196) {
					Static297.method4420(local31, local44, Static253.anInt4491);
				}
			}
		} else {
			@Pc(292) int local292;
			@Pc(296) int local296;
			@Pc(300) int local300;
			@Pc(309) int local309;
			@Pc(412) Class41_Sub2_Sub1_Sub1 local412;
			if (arg0 == Static39.aClass262_1) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = (local16 >> 4 & 0xF) + Static470.anInt7808 * 2;
				local31 = (local16 & 0xF) + Static418.anInt7087 * 2;
				@Pc(256) boolean local256 = Static532.aClass3_Sub11_Sub1_2.method5175() != 0;
				local44 = Static532.aClass3_Sub11_Sub1_2.method5212() + local24;
				local50 = Static532.aClass3_Sub11_Sub1_2.method5212() + local31;
				local54 = Static532.aClass3_Sub11_Sub1_2.method5231();
				local58 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local62 = Static532.aClass3_Sub11_Sub1_2.method5175() * 4;
				local80 = Static532.aClass3_Sub11_Sub1_2.method5175() * 4;
				local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local296 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local300 = Static532.aClass3_Sub11_Sub1_2.method5175();
				if (local300 == 255) {
					local300 = -1;
				}
				local309 = Static532.aClass3_Sub11_Sub1_2.method5198();
				if (local24 >= 0 && local31 >= 0 && Static54.anInt1038 * 2 > local24 && Static54.anInt1038 * 2 > local31 && local44 >= 0 && local50 >= 0 && Static140.anInt3026 * 2 > local44 && local50 < Static140.anInt3026 * 2 && local58 != 65535) {
					local80 <<= 0x2;
					local24 = local24 * 256;
					local31 *= 256;
					local62 <<= 0x2;
					local50 *= 256;
					local44 *= 256;
					local309 <<= 0x2;
					local412 = new Class41_Sub2_Sub1_Sub1(local58, Static253.anInt4491, Static253.anInt4491, local24, local31, local62, Static506.anInt8251 + local292, Static506.anInt8251 + local296, local300, local309, local54, local80, local256);
					local412.method924(local50, local44, Static475.method6537(local50, Static253.anInt4491, local44) - local80, local292 + Static506.anInt8251);
					Static103.aClass112_16.method3079(new Class3_Sub7_Sub8(local412));
				}
			} else if (arg0 == Static103.aClass262_3) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5206();
				local24 = Static470.anInt7808 + (local16 >> 4 & 0x7);
				local31 = Static418.anInt7087 + (local16 & 0x7);
				local35 = Static532.aClass3_Sub11_Sub1_2.method5185();
				local44 = local35 >> 2;
				local50 = local35 & 0x3;
				local54 = Static333.anIntArray312[local44];
				if (Static494.method6671(Static39.anInt749) || local24 >= 0 && local31 >= 0 && local24 < Static54.anInt1038 && Static140.anInt3026 > local31) {
					Static294.method6197(local50, local31, -1, local54, local44, Static253.anInt4491, local24);
				}
			} else if (Static417.aClass262_13 == arg0) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5206();
				local24 = local16 >> 2;
				local31 = local16 & 0x3;
				local35 = Static333.anIntArray312[local24];
				local44 = Static532.aClass3_Sub11_Sub1_2.method5174();
				local50 = Static532.aClass3_Sub11_Sub1_2.method5204();
				local54 = (local50 >> 4 & 0x7) + Static470.anInt7808;
				local58 = Static418.anInt7087 + (local50 & 0x7);
				if (Static494.method6671(Static39.anInt749) || local54 >= 0 && local58 >= 0 && Static54.anInt1038 > local54 && Static140.anInt3026 > local58) {
					Static294.method6197(local31, local58, local44, local35, local24, Static253.anInt4491, local54);
				}
			} else if (arg0 == Static168.aClass262_5) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local24 = Static532.aClass3_Sub11_Sub1_2.method5175();
				Static478.aClass212_3.method4793(local16).method6165(local24);
			} else if (arg0 == Static439.aClass262_14) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = Static418.anInt7087 + (local16 & 0x7);
				local31 = Static246.anInt4344 + local24;
				local35 = (local16 >> 4 & 0x7) + Static470.anInt7808;
				local44 = Static335.anInt5608 + local35;
				local50 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local54 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local58 = Static532.aClass3_Sub11_Sub1_2.method5198();
				if (Static211.aClass354_17 != null) {
					@Pc(657) Class3_Sub31 local657 = (Class3_Sub31) Static211.aClass354_17.method7689((long) (local44 | local31 << 14 | Static253.anInt4491 << 28));
					if (local657 != null) {
						for (@Pc(665) Class3_Sub25 local665 = (Class3_Sub25) local657.aClass112_28.method3088(); local665 != null; local665 = (Class3_Sub25) local657.aClass112_28.method3084()) {
							if (local665.anInt3630 == (local50 & 0x7FFF) && local54 == local665.anInt3631) {
								local665.method7825();
								local665.anInt3631 = local58;
								Static533.method7123(Static253.anInt4491, local31, local44, local665);
								break;
							}
						}
						if (local35 >= 0 && local24 >= 0 && Static54.anInt1038 > local35 && local24 < Static140.anInt3026) {
							Static297.method4420(local24, local35, Static253.anInt4491);
						}
					}
				}
			} else if (arg0 == Static211.aClass262_9) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = (local16 >> 4 & 0xF) + Static470.anInt7808 * 2;
				local31 = (local16 & 0xF) + Static418.anInt7087 * 2;
				local35 = Static532.aClass3_Sub11_Sub1_2.method5175();
				@Pc(765) boolean local765 = (local35 & 0x1) != 0;
				local50 = local35 >> 1;
				local54 = local24 + Static532.aClass3_Sub11_Sub1_2.method5212();
				local58 = Static532.aClass3_Sub11_Sub1_2.method5212() + local31;
				local62 = Static532.aClass3_Sub11_Sub1_2.method5231();
				local80 = Static532.aClass3_Sub11_Sub1_2.method5231();
				local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
				@Pc(800) byte local800 = Static532.aClass3_Sub11_Sub1_2.method5212();
				local300 = Static532.aClass3_Sub11_Sub1_2.method5175() * 4;
				local309 = Static532.aClass3_Sub11_Sub1_2.method5198();
				@Pc(814) int local814 = Static532.aClass3_Sub11_Sub1_2.method5198();
				@Pc(818) int local818 = Static532.aClass3_Sub11_Sub1_2.method5175();
				@Pc(822) int local822 = Static532.aClass3_Sub11_Sub1_2.method5198();
				if (local818 == 255) {
					local818 = -1;
				}
				if (local24 >= 0 && local31 >= 0 && Static54.anInt1038 * 2 > local24 && Static54.anInt1038 * 2 > local31 && local54 >= 0 && local58 >= 0 && Static140.anInt3026 * 2 > local54 && Static140.anInt3026 * 2 > local58 && local292 != 65535) {
					local58 *= 256;
					local24 *= 256;
					local300 <<= 0x2;
					local296 = local800 << 2;
					local54 *= 256;
					local31 *= 256;
					local822 <<= 0x2;
					if (local62 != 0) {
						@Pc(911) Class41_Sub2_Sub1_Sub4 local911 = null;
						@Pc(920) int local920;
						if (local62 >= 0) {
							local920 = local62 - 1;
							@Pc(927) Class3_Sub34 local927 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local920);
							if (local927 != null) {
								local911 = local927.aClass41_Sub2_Sub1_Sub4_Sub1_2;
							}
						} else {
							local920 = -local62 - 1;
							if (Static166.anInt3327 == local920) {
								local911 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2;
							} else {
								local911 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local920];
							}
						}
						if (local911 != null) {
							@Pc(954) Class365 local954 = local911.method7861();
							if (local954.anIntArrayArray203 != null && local954.anIntArrayArray203[local50] != null) {
								@Pc(969) int local969 = local954.anIntArrayArray203[local50][0];
								@Pc(976) int local976 = local954.anIntArrayArray203[local50][2];
								@Pc(983) int local983 = local911.aClass259_7.method5914();
								@Pc(987) int local987 = Class356.anIntArray597[local983];
								@Pc(991) int local991 = Class356.anIntArray598[local983];
								@Pc(1001) int local1001 = local969 * local991 + local976 * local987 >> 14;
								@Pc(1011) int local1011 = local976 * local991 - local987 * local969 >> 14;
								local24 += local1001;
								local31 += local1011;
								local296 -= local954.anIntArrayArray203[local50][1];
							}
						}
					}
					@Pc(1052) Class41_Sub2_Sub1_Sub1 local1052 = new Class41_Sub2_Sub1_Sub1(local292, Static253.anInt4491, Static253.anInt4491, local24, local31, local296, Static506.anInt8251 + local309, local814 - -Static506.anInt8251, local818, local822, local80, local300, local765);
					local1052.method924(local58, local54, Static475.method6537(local58, Static253.anInt4491, local54) - local300, Static506.anInt8251 + local309);
					Static103.aClass112_16.method3079(new Class3_Sub7_Sub8(local1052));
				}
			} else if (arg0 == Static97.aClass262_2) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = Static418.anInt7087 + (local16 & 0x7);
				local31 = local24 + Static246.anInt4344;
				local35 = Static470.anInt7808 + (local16 >> 4 & 0x7);
				local44 = Static335.anInt5608 + local35;
				local50 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local54 = Static532.aClass3_Sub11_Sub1_2.method5205();
				local58 = Static532.aClass3_Sub11_Sub1_2.method5174();
				if (local50 != Static166.anInt3327) {
					@Pc(1147) boolean local1147 = local35 >= 0 && local24 >= 0 && local35 < Static54.anInt1038 && Static140.anInt3026 > local24;
					if (local1147 || Static494.method6671(Static39.anInt749)) {
						Static533.method7123(Static253.anInt4491, local31, local44, new Class3_Sub25(local54, local58));
						if (local1147) {
							Static297.method4420(local24, local35, Static253.anInt4491);
						}
					}
				}
			} else if (arg0 == Static174.aClass262_6) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = Static470.anInt7808 + (local16 >> 4 & 0x7);
				local31 = (local16 & 0x7) + Static418.anInt7087;
				local35 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local44 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local50 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local54 = Static532.aClass3_Sub11_Sub1_2.method5175();
				if (local24 >= 0 && local31 >= 0 && local24 < Static54.anInt1038 && Static140.anInt3026 > local31) {
					local58 = local24 * 512 + 256;
					local62 = local31 * 512 + 256;
					local80 = Static253.anInt4491;
					if (local80 < 3 && Static511.method6886(local31, local24)) {
						local80++;
					}
					@Pc(1267) Class41_Sub2_Sub1_Sub5 local1267 = new Class41_Sub2_Sub1_Sub5(local35, local50, Static506.anInt8251, Static253.anInt4491, local80, local58, Static475.method6537(local62, Static253.anInt4491, local58) - local44, local62, local24, local24, local31, local31, local54);
					Static432.aClass112_51.method3079(new Class3_Sub7_Sub16(local1267));
				}
			} else if (arg0 == Static564.aClass262_18) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5204();
				local24 = Static470.anInt7808 + (local16 >> 4 & 0x7);
				local31 = (local16 & 0x7) + Static418.anInt7087;
				local35 = Static532.aClass3_Sub11_Sub1_2.method5185();
				local44 = local35 >> 2;
				local50 = local35 & 0x3;
				local54 = Static333.anIntArray312[local44];
				local58 = Static532.aClass3_Sub11_Sub1_2.method5178();
				if (local58 == 65535) {
					local58 = -1;
				}
				Static348.method5133(local44, local54, local50, local58, local31, Static253.anInt4491, local24);
			} else if (arg0 == Static400.aClass262_12) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				@Pc(1347) boolean local1347 = (local16 & 0x80) != 0;
				local31 = Static470.anInt7808 + (local16 >> 3 & 0x7);
				local35 = Static418.anInt7087 + (local16 & 0x7);
				local44 = Static532.aClass3_Sub11_Sub1_2.method5212() + local31;
				local50 = Static532.aClass3_Sub11_Sub1_2.method5212() + local35;
				local54 = Static532.aClass3_Sub11_Sub1_2.method5231();
				local58 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local62 = Static532.aClass3_Sub11_Sub1_2.method5175() * 4;
				local80 = Static532.aClass3_Sub11_Sub1_2.method5175() * 4;
				local292 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local296 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local300 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local309 = Static532.aClass3_Sub11_Sub1_2.method5198();
				if (local300 == 255) {
					local300 = -1;
				}
				if (local31 >= 0 && local35 >= 0 && local31 < Static54.anInt1038 && Static140.anInt3026 > local35 && local44 >= 0 && local50 >= 0 && local44 < Static54.anInt1038 && local50 < Static140.anInt3026 && local58 != 65535) {
					local50 = local50 * 512 + 256;
					local62 <<= 0x2;
					local309 <<= 0x2;
					local35 = local35 * 512 + 256;
					local80 <<= 0x2;
					local31 = local31 * 512 + 256;
					local44 = local44 * 512 + 256;
					local412 = new Class41_Sub2_Sub1_Sub1(local58, Static253.anInt4491, Static253.anInt4491, local31, local35, local62, Static506.anInt8251 + local292, local296 + Static506.anInt8251, local300, local309, local54, local80, local1347);
					local412.method924(local50, local44, Static475.method6537(local50, Static253.anInt4491, local44) - local80, Static506.anInt8251 + local292);
					Static103.aClass112_16.method3079(new Class3_Sub7_Sub8(local412));
				}
			} else if (arg0 == Static478.aClass262_16) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5174();
				local24 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local31 = Static418.anInt7087 + (local24 & 0x7);
				local35 = Static246.anInt4344 + local31;
				local44 = Static470.anInt7808 + (local24 >> 4 & 0x7);
				local50 = Static335.anInt5608 + local44;
				@Pc(1587) Class3_Sub31 local1587 = (Class3_Sub31) Static211.aClass354_17.method7689((long) (Static253.anInt4491 << 28 | local35 << 14 | local50));
				if (local1587 != null) {
					for (@Pc(1595) Class3_Sub25 local1595 = (Class3_Sub25) local1587.aClass112_28.method3088(); local1595 != null; local1595 = (Class3_Sub25) local1587.aClass112_28.method3084()) {
						if (local1595.anInt3630 == (local16 & 0x7FFF)) {
							local1595.method7825();
							break;
						}
					}
					if (local1587.aClass112_28.method3093()) {
						local1587.method7825();
					}
					if (local44 >= 0 && local31 >= 0 && Static54.anInt1038 > local44 && Static140.anInt3026 > local31) {
						Static297.method4420(local31, local44, Static253.anInt4491);
					}
				}
			} else if (arg0 == Static506.aClass262_17) {
				Static532.aClass3_Sub11_Sub1_2.method5175();
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = Static470.anInt7808 + (local16 >> 4 & 0x7);
				local31 = (local16 & 0x7) + Static418.anInt7087;
				local35 = Static532.aClass3_Sub11_Sub1_2.method5198();
				local44 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local50 = Static532.aClass3_Sub11_Sub1_2.method5230();
				@Pc(1698) String local1698 = Static532.aClass3_Sub11_Sub1_2.method5181();
				Static175.method3077(local31, local44, local35, Static253.anInt4491, local1698, local24, local50);
			} else if (Static358.aClass262_10 == arg0) {
				local16 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local24 = (local16 >> 4 & 0x7) + Static470.anInt7808;
				local31 = (local16 & 0x7) + Static418.anInt7087;
				local35 = Static532.aClass3_Sub11_Sub1_2.method5198();
				if (local35 == 65535) {
					local35 = -1;
				}
				local44 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local50 = local44 >> 4 & 0xF;
				local54 = local44 & 0x7;
				local58 = Static532.aClass3_Sub11_Sub1_2.method5175();
				local62 = Static532.aClass3_Sub11_Sub1_2.method5175();
				if (local24 >= 0 && local31 >= 0 && local24 < Static54.anInt1038 && Static140.anInt3026 > local31) {
					local80 = local50 + 1;
					if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] >= local24 - local80 && local80 + local24 >= Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] && Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] >= local31 - local80 && local80 + local31 >= Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0]) {
						Static97.method1806(local54, local58, local35, local50 + (local31 << 8) + (local24 << 16) + (Static253.anInt4491 << 24), local62);
					}
				}
			} else {
				Static172.method7826(null, "T3 - " + arg0);
				Static326.method4711(false);
			}
		}
	}
}
