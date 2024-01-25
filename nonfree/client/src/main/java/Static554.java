import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "Lclient!uq;")
	public static Class362 aClass362_126;

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "Lclient!hja;")
	public static final Class147 aClass147_6 = new Class147();

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIIII)V")
	public static void method7315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static166.method2620(arg3 + arg1, Static629.anInt10412, Static300.anInt5091);
		@Pc(31) int local31 = Static166.method2620(arg3 - arg1, Static629.anInt10412, Static300.anInt5091);
		Static578.method7640(arg2, local31, local22, Static276.anIntArrayArray32[arg0]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(82) int local82;
			@Pc(93) int local93;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local59 = arg0 - local9;
				local63 = local9 + arg0;
				if (Static617.anInt6260 <= local63 && local59 <= Static229.anInt4089) {
					local82 = Static166.method2620(arg3 + local7, Static629.anInt10412, Static300.anInt5091);
					local93 = Static166.method2620(arg3 - local7, Static629.anInt10412, Static300.anInt5091);
					if (Static229.anInt4089 >= local63) {
						Static578.method7640(arg2, local93, local82, Static276.anIntArrayArray32[local63]);
					}
					if (Static617.anInt6260 <= local59) {
						Static578.method7640(arg2, local93, local82, Static276.anIntArrayArray32[local59]);
					}
				}
			}
			local7++;
			local59 = arg0 - local7;
			local63 = arg0 + local7;
			if (Static617.anInt6260 <= local63 && Static229.anInt4089 >= local59) {
				local82 = Static166.method2620(arg3 + local9, Static629.anInt10412, Static300.anInt5091);
				local93 = Static166.method2620(arg3 - local9, Static629.anInt10412, Static300.anInt5091);
				if (Static229.anInt4089 >= local63) {
					Static578.method7640(arg2, local93, local82, Static276.anIntArrayArray32[local63]);
				}
				if (local59 >= Static617.anInt6260) {
					Static578.method7640(arg2, local93, local82, Static276.anIntArrayArray32[local59]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ILclient!jea;)V")
	public static void method7316(@OriginalArg(1) Class177 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(16) int local16;
		if (arg0 == Static479.aClass177_29) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7899();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Class14_Sub26.anIntArray517[local16];
			local28 = Static459.aClass3_Sub4_Sub1_1.method7914();
			local36 = (local28 >> 4 & 0x7) + Static92.anInt1868;
			local42 = (local28 & 0x7) + Static667.anInt10816;
			if (Static321.method8424(Static447.anInt7216) || local36 >= 0 && local42 >= 0 && Static98.anInt361 > local36 && local42 < Static438.anInt7120) {
				Static260.method3888(local36, local16, Static451.anInt7257, local24, -1, local20, local42);
			}
			return;
		}
		@Pc(142) int local142;
		@Pc(148) int local148;
		@Pc(150) int local150;
		if (Static511.aClass177_26 == arg0) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local16 = (local12 >> 4 & 0x7) + Static92.anInt1868;
			local20 = Static667.anInt10816 + (local12 & 0x7);
			local24 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local28 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local36 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local42 = Static459.aClass3_Sub4_Sub1_1.method7954();
			if (local16 >= 0 && local20 >= 0 && local16 < Static98.anInt361 && local20 < Static438.anInt7120) {
				local142 = local16 * 512 + 256;
				local148 = local20 * 512 + 256;
				local150 = Static451.anInt7257;
				if (local150 < 3 && Static209.method3118(local16, local20)) {
					local150++;
				}
				@Pc(182) Class34_Sub1_Sub1_Sub5 local182 = new Class34_Sub1_Sub1_Sub5(local24, local36, Static122.anInt2190, Static451.anInt7257, local150, local142, Static662.method8831(local148, local142, Static451.anInt7257) - local28, local148, local16, local16, local20, local20, local42);
				Static204.aClass302_20.method6613(new Class3_Sub5_Sub21(local182));
			}
			return;
		}
		@Pc(267) int local267;
		if (arg0 == Static447.aClass177_22) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local16 = Static92.anInt1868 + (local12 >> 4 & 0x7);
			local20 = Static667.anInt10816 + (local12 & 0x7);
			local24 = Static459.aClass3_Sub4_Sub1_1.method7951();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local142 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local148 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local150 = Static459.aClass3_Sub4_Sub1_1.method7951();
			if (local16 >= 0 && local20 >= 0 && Static98.anInt361 > local16 && Static438.anInt7120 > local20) {
				local267 = local36 + 1;
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] >= local16 - local267 && local16 + local267 >= Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] >= local20 - local267 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] <= local20 + local267) {
					Static618.method8348(local142, local148, local150, local24, local42, local36 + (local20 << 8) + (Static451.anInt7257 << 24) + (local16 << 16));
				}
			}
		} else if (Static102.aClass177_30 == arg0) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local16 = Static667.anInt10816 + (local12 & 0x7);
			local20 = local16 + Static402.anInt6661;
			local24 = (local12 >> 4 & 0x7) + Static92.anInt1868;
			local28 = local24 + Static534.anInt8358;
			local36 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local42 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local142 = Static459.aClass3_Sub4_Sub1_1.method7951();
			if (Static462.aClass333_29 != null) {
				@Pc(392) Class3_Sub20 local392 = (Class3_Sub20) Static462.aClass333_29.method7489((long) (local28 | local20 << 14 | Static451.anInt7257 << 28));
				if (local392 != null) {
					for (@Pc(400) Class3_Sub48 local400 = (Class3_Sub48) local392.aClass302_17.method6603(); local400 != null; local400 = (Class3_Sub48) local392.aClass302_17.method6605()) {
						if (local400.anInt9328 == (local36 & 0x7FFF) && local42 == local400.anInt9332) {
							local400.method9034();
							local400.anInt9332 = local142;
							Static387.method5433(local20, local28, Static451.anInt7257, local400);
							break;
						}
					}
					if (local24 >= 0 && local16 >= 0 && local24 < Static98.anInt361 && local16 < Static438.anInt7120) {
						Static593.method7810(Static451.anInt7257, local16, local24);
					}
				}
			}
		} else if (arg0 == Static122.aClass177_11) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7926();
			local16 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local20 = (local16 >> 4 & 0x7) + Static92.anInt1868;
			local24 = (local16 & 0x7) + Static667.anInt10816;
			local28 = Static459.aClass3_Sub4_Sub1_1.method7934();
			local36 = local28 >> 2;
			local42 = local28 & 0x3;
			local142 = Class14_Sub26.anIntArray517[local36];
			if (Static321.method8424(Static447.anInt7216) || local20 >= 0 && local24 >= 0 && local20 < Static98.anInt361 && Static438.anInt7120 > local24) {
				Static260.method3888(local20, local36, Static451.anInt7257, local142, local12, local42, local24);
			}
		} else if (Static524.aClass177_27 == arg0) {
			Static459.aClass3_Sub4_Sub1_1.method7954();
			local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local16 = Static92.anInt1868 + (local12 >> 4 & 0x7);
			local20 = Static667.anInt10816 + (local12 & 0x7);
			local24 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local28 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local36 = Static459.aClass3_Sub4_Sub1_1.method7945();
			@Pc(582) String local582 = Static459.aClass3_Sub4_Sub1_1.method7922();
			Static440.method6012(local24, local36, Static451.anInt7257, local28, local20, local582, local16);
		} else if (arg0 == Static462.aClass177_24) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7934();
			local16 = (local12 & 0x7) + Static667.anInt10816;
			local20 = local16 + Static402.anInt6661;
			local24 = Static92.anInt1868 + (local12 >> 4 & 0x7);
			local28 = Static534.anInt8358 + local24;
			local36 = Static459.aClass3_Sub4_Sub1_1.method7951();
			@Pc(640) Class3_Sub20 local640 = (Class3_Sub20) Static462.aClass333_29.method7489((long) (Static451.anInt7257 << 28 | local20 << 14 | local28));
			if (local640 != null) {
				for (@Pc(648) Class3_Sub48 local648 = (Class3_Sub48) local640.aClass302_17.method6603(); local648 != null; local648 = (Class3_Sub48) local640.aClass302_17.method6605()) {
					if (local648.anInt9328 == (local36 & 0x7FFF)) {
						local648.method9034();
						break;
					}
				}
				if (local640.aClass302_17.method6612()) {
					local640.method9034();
				}
				if (local24 >= 0 && local16 >= 0 && Static98.anInt361 > local24 && Static438.anInt7120 > local16) {
					Static593.method7810(Static451.anInt7257, local16, local24);
				}
			}
		} else if (Static149.aClass177_12 == arg0) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local16 = Static92.anInt1868 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static667.anInt10816;
			local24 = Static459.aClass3_Sub4_Sub1_1.method7951();
			if (local24 == 65535) {
				local24 = -1;
			}
			local28 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local36 = local28 >> 4 & 0xF;
			local42 = local28 & 0x7;
			local142 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local148 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local150 = Static459.aClass3_Sub4_Sub1_1.method7951();
			if (local16 >= 0 && local20 >= 0 && local16 < Static98.anInt361 && local20 < Static438.anInt7120) {
				local267 = local36 + 1;
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] >= local16 - local267 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] <= local16 + local267 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] >= local20 - local267 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] <= local267 + local20) {
					Static363.method8908(local24, local150, local36 + (local20 << 8) + (local16 << 16) + (Static451.anInt7257 << 24), local142, local42, local148);
				}
			}
		} else if (arg0 == Static48.aClass177_7) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7934();
			local16 = Static92.anInt1868 + (local12 >> 4 & 0x7);
			local20 = (local12 & 0x7) + Static667.anInt10816;
			local24 = Static459.aClass3_Sub4_Sub1_1.method7914();
			local28 = local24 >> 2;
			local36 = local24 & 0x3;
			local42 = Class14_Sub26.anIntArray517[local28];
			local142 = Static459.aClass3_Sub4_Sub1_1.method7926();
			if (local142 == 65535) {
				local142 = -1;
			}
			Static25.method586(local28, local36, local16, Static451.anInt7257, local20, local42, local142);
		} else if (arg0 == Static426.aClass177_21) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local16 = Static459.aClass3_Sub4_Sub1_1.method7954();
			Static466.aClass340_6.method7665(local12).method5044(local16);
		} else if (arg0 == Static395.aClass177_18) {
			local12 = Static459.aClass3_Sub4_Sub1_1.method7934();
			local16 = (local12 & 0x7) + Static667.anInt10816;
			local20 = Static402.anInt6661 + local16;
			local24 = (local12 >> 4 & 0x7) + Static92.anInt1868;
			local28 = local24 + Static534.anInt8358;
			local36 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local42 = Static459.aClass3_Sub4_Sub1_1.method7926();
			@Pc(994) boolean local994 = local24 >= 0 && local16 >= 0 && Static98.anInt361 > local24 && Static438.anInt7120 > local16;
			if (local994 || Static321.method8424(Static447.anInt7216)) {
				Static387.method5433(local20, local28, Static451.anInt7257, new Class3_Sub48(local42, local36));
				if (local994) {
					Static593.method7810(Static451.anInt7257, local16, local24);
				}
			}
		} else {
			@Pc(1103) int local1103;
			@Pc(1124) int local1124;
			@Pc(1128) int local1128;
			@Pc(1132) int local1132;
			@Pc(1107) int local1107;
			if (arg0 == Static622.aClass177_31) {
				local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
				local16 = Static92.anInt1868 * 2 + (local12 >> 4 & 0xF);
				local20 = Static667.anInt10816 * 2 + (local12 & 0xF);
				local24 = Static459.aClass3_Sub4_Sub1_1.method7954();
				@Pc(1062) boolean local1062 = (local24 & 0x1) != 0;
				@Pc(1070) boolean local1070 = (local24 & 0x2) != 0;
				local42 = local1070 ? local24 >> 2 : -1;
				local142 = Static459.aClass3_Sub4_Sub1_1.method7960() + local16;
				local148 = local20 + Static459.aClass3_Sub4_Sub1_1.method7960();
				local150 = Static459.aClass3_Sub4_Sub1_1.method7918();
				local267 = Static459.aClass3_Sub4_Sub1_1.method7918();
				local1103 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local1107 = Static459.aClass3_Sub4_Sub1_1.method7954();
				if (local1070) {
					local1107 = (byte) local1107;
				} else {
					local1107 *= 4;
				}
				local1124 = Static459.aClass3_Sub4_Sub1_1.method7954() * 4;
				local1128 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local1132 = Static459.aClass3_Sub4_Sub1_1.method7951();
				@Pc(1136) int local1136 = Static459.aClass3_Sub4_Sub1_1.method7954();
				@Pc(1140) int local1140 = Static459.aClass3_Sub4_Sub1_1.method7951();
				if (local1136 == 255) {
					local1136 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < Static98.anInt361 * 2 && Static98.anInt361 * 2 > local20 && local142 >= 0 && local148 >= 0 && local142 < Static438.anInt7120 * 2 && local148 < Static438.anInt7120 * 2 && local1103 != 65535) {
					local1124 <<= 0x2;
					local142 = local142 * 256;
					local16 *= 256;
					local1107 <<= 0x2;
					local148 *= 256;
					local20 *= 256;
					local1140 <<= 0x2;
					if (local150 != 0 && local42 != -1) {
						@Pc(1226) Class34_Sub1_Sub1_Sub2 local1226 = null;
						@Pc(1236) int local1236;
						if (local150 < 0) {
							local1236 = -local150 - 1;
							if (local1236 == Static291.anInt4955) {
								local1226 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1;
							} else {
								local1226 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local1236];
							}
						} else {
							local1236 = local150 - 1;
							@Pc(1262) Class3_Sub52 local1262 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local1236);
							if (local1262 != null) {
								local1226 = local1262.aClass34_Sub1_Sub1_Sub2_Sub2_2;
							}
						}
						if (local1226 != null) {
							@Pc(1273) Class286 local1273 = local1226.method7878();
							if (local1273.anIntArrayArray43 != null && local1273.anIntArrayArray43[local42] != null) {
								local1107 -= local1273.anIntArrayArray43[local42][1];
							}
							if (local1273.anIntArrayArray42 != null && local1273.anIntArrayArray42[local42] != null) {
								local1107 -= local1273.anIntArrayArray42[local42][1];
							}
						}
					}
					@Pc(1332) Class34_Sub1_Sub1_Sub3 local1332 = new Class34_Sub1_Sub1_Sub3(local1103, Static451.anInt7257, Static451.anInt7257, local16, local20, local1107, local1128 + Static122.anInt2190, local1132 - -Static122.anInt2190, local1136, local1140, local150, local267, local1124, local1062, local42);
					local1332.method2312(local142, Static662.method8831(local148, local142, Static451.anInt7257) - local1124, Static122.anInt2190 + local1128, local148);
					Static29.aClass302_3.method6613(new Class3_Sub5_Sub6(local1332));
				}
			} else if (arg0 == Static527.aClass177_28) {
				local12 = Static459.aClass3_Sub4_Sub1_1.method7935();
				local16 = Static459.aClass3_Sub4_Sub1_1.method7959();
				local20 = Static459.aClass3_Sub4_Sub1_1.method7926();
				local24 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local28 = Static667.anInt10816 + (local24 & 0x7);
				local36 = Static402.anInt6661 + local28;
				local42 = Static92.anInt1868 + (local24 >> 4 & 0x7);
				local142 = Static534.anInt8358 + local42;
				if (Static291.anInt4955 != local16) {
					@Pc(1432) boolean local1432 = local42 >= 0 && local28 >= 0 && Static98.anInt361 > local42 && Static438.anInt7120 > local28;
					if (local1432 || Static321.method8424(Static447.anInt7216)) {
						Static387.method5433(local36, local142, Static451.anInt7257, new Class3_Sub48(local12, local20));
						if (local1432) {
							Static593.method7810(Static451.anInt7257, local28, local42);
						}
					}
				}
			} else if (arg0 == Static403.aClass177_32) {
				local12 = Static459.aClass3_Sub4_Sub1_1.method7954();
				@Pc(1471) boolean local1471 = (local12 & 0x80) != 0;
				local20 = (local12 >> 3 & 0x7) + Static92.anInt1868;
				local24 = (local12 & 0x7) + Static667.anInt10816;
				local28 = local20 + Static459.aClass3_Sub4_Sub1_1.method7960();
				local36 = Static459.aClass3_Sub4_Sub1_1.method7960() + local24;
				local42 = Static459.aClass3_Sub4_Sub1_1.method7918();
				local142 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local148 = Static459.aClass3_Sub4_Sub1_1.method7954() * 4;
				local150 = Static459.aClass3_Sub4_Sub1_1.method7954() * 4;
				local267 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local1103 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local1107 = Static459.aClass3_Sub4_Sub1_1.method7954();
				local1124 = Static459.aClass3_Sub4_Sub1_1.method7951();
				if (local1107 == 255) {
					local1107 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && local20 < Static98.anInt361 && local24 < Static438.anInt7120 && local28 >= 0 && local36 >= 0 && Static98.anInt361 > local28 && Static438.anInt7120 > local36 && local142 != 65535) {
					local1124 <<= 0x2;
					local36 = local36 * 512 + 256;
					local150 <<= 0x2;
					local28 = local28 * 512 + 256;
					local24 = local24 * 512 + 256;
					local148 <<= 0x2;
					local20 = local20 * 512 + 256;
					@Pc(1642) Class34_Sub1_Sub1_Sub3 local1642 = new Class34_Sub1_Sub1_Sub3(local142, Static451.anInt7257, Static451.anInt7257, local20, local24, local148, Static122.anInt2190 + local267, Static122.anInt2190 + local1103, local1107, local1124, 0, local42, local150, local1471, -1);
					local1642.method2312(local28, Static662.method8831(local36, local28, Static451.anInt7257) - local150, local267 + Static122.anInt2190, local36);
					Static29.aClass302_3.method6613(new Class3_Sub5_Sub6(local1642));
				}
			} else if (arg0 == Static34.aClass177_4) {
				local12 = Static459.aClass3_Sub4_Sub1_1.method7959();
				@Pc(1683) Class216 local1683 = Static466.aClass340_6.method7665(local12);
				local20 = Static459.aClass3_Sub4_Sub1_1.method7899();
				local24 = Static92.anInt1868 + (local20 >> 4 & 0x7);
				local28 = (local20 & 0x7) + Static667.anInt10816;
				local36 = Static459.aClass3_Sub4_Sub1_1.method7914();
				local42 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local142 = local42 >> 2;
				local148 = Class14_Sub26.anIntArray517[local142];
				if (local142 == 11) {
					local142 = 10;
				}
				local150 = 0;
				if (local1683.aByteArray49 != null) {
					local267 = -1;
					for (local1103 = 0; local1103 < local1683.aByteArray49.length; local1103++) {
						if (local1683.aByteArray49[local1103] == local142) {
							local267 = local1103;
							break;
						}
					}
					local150 = local1683.anIntArrayArray36[local267].length;
				}
				local267 = 0;
				if (local1683.aShortArray71 != null) {
					local267 = local1683.aShortArray71.length;
				}
				local1103 = 0;
				if (local1683.aShortArray69 != null) {
					local1103 = local1683.aShortArray69.length;
				}
				if ((local36 & 0x1) == 1) {
					Static191.method2950((Class173) null, local24, local148, local28, Static451.anInt7257);
				} else {
					@Pc(1794) int[] local1794 = null;
					if ((local36 & 0x2) == 2) {
						local1794 = new int[local150];
						for (local1124 = 0; local1124 < local150; local1124++) {
							local1794[local1124] = Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					@Pc(1820) short[] local1820 = null;
					if ((local36 & 0x4) == 4) {
						local1820 = new short[local267];
						for (local1128 = 0; local1128 < local267; local1128++) {
							local1820[local1128] = (short) Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					@Pc(1849) short[] local1849 = null;
					if ((local36 & 0x8) == 8) {
						local1849 = new short[local1103];
						for (local1132 = 0; local1132 < local1103; local1132++) {
							local1849[local1132] = (short) Static459.aClass3_Sub4_Sub1_1.method7951();
						}
					}
					Static191.method2950(new Class173((long) Static457.aLong203++, local1794, local1820, local1849), local24, local148, local28, Static451.anInt7257);
				}
			} else {
				Static456.method6140("T3 - " + arg0, (Throwable) null);
				Static316.method4541(false);
			}
		}
	}
}
