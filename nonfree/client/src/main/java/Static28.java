import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public static final int anInt660 = 4;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[I")
	public static final int[] anIntArray49 = new int[6];

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static final int anInt664 = 205;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(FFIF)I")
	public static int method562(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		if (local21 > local12 && local30 < local21) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local30 && local30 > local21) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jc;I)V")
	public static void method563(@OriginalArg(0) Class126 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(44) int local44;
		if (arg0 == Static408.aClass126_15) {
			local12 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local16 = Static5.aClass1_Sub3_Sub1_1.method1225();
			local20 = Static5.aClass1_Sub3_Sub1_1.method1210();
			local26 = (local20 & 0x7) + Static182.anInt3941;
			local31 = Static380.anInt6896 + local26;
			local39 = (local20 >> 4 & 0x7) + Static216.anInt4345;
			local44 = Static278.anInt5374 + local39;
			@Pc(69) boolean local69 = local39 >= 0 && local26 >= 0 && local39 < Static209.anInt4283 && Static211.anInt4295 > local26;
			if (local69 || Static206.method3291(Static367.anInt6719)) {
				Static361.method5082(local31, local44, Static180.anInt3909, new Class1_Sub21(local16, local12));
				if (local69) {
					Static54.method1000(local39, local26, Static180.anInt3909);
				}
			}
			return;
		}
		@Pc(146) int local146;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(276) Class30_Sub1_Sub2 local276;
		if (Static393.aClass126_12 == arg0) {
			local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
			@Pc(108) boolean local108 = (local12 & 0x80) != 0;
			local20 = (local12 >> 3 & 0x7) + Static216.anInt4345;
			local26 = (local12 & 0x7) + Static182.anInt3941;
			local31 = local20 + Static5.aClass1_Sub3_Sub1_1.method1212();
			local39 = Static5.aClass1_Sub3_Sub1_1.method1212() + local26;
			local44 = Static5.aClass1_Sub3_Sub1_1.method1215();
			local146 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local152 = Static5.aClass1_Sub3_Sub1_1.method1171() * 4;
			local158 = Static5.aClass1_Sub3_Sub1_1.method1171() * 4;
			local162 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local168 = Static5.aClass1_Sub3_Sub1_1.method1177();
			local172 = Static5.aClass1_Sub3_Sub1_1.method1171();
			local176 = Static5.aClass1_Sub3_Sub1_1.method1177();
			if (local172 == 255) {
				local172 = -1;
			}
			if (local20 >= 0 && local26 >= 0 && local20 < Static209.anInt4283 && local26 < Static211.anInt4295 && local31 >= 0 && local39 >= 0 && local31 < Static209.anInt4283 && Static211.anInt4295 > local39 && local146 != 65535) {
				local152 <<= 0x0;
				local31 = local31 * 128 + 64;
				local26 = local26 * 128 + 64;
				local20 = local20 * 128 + 64;
				local176 <<= 0x0;
				local39 = local39 * 128 + 64;
				local158 <<= 0x0;
				local276 = new Class30_Sub1_Sub2(local146, Static180.anInt3909, local20, local26, local152, Static187.anInt3975 + local162, local168 + Static187.anInt3975, local172, local176, local44, local158, local108);
				local276.method3288(Static227.method3475(local31, local39, Static180.anInt3909) - local158, local162 - -Static187.anInt3975, local39, local31);
				Static398.aClass203_46.method4551(new Class1_Sub1_Sub15(local276));
			}
		} else if (Static292.aClass126_11 == arg0) {
			local12 = Static5.aClass1_Sub3_Sub1_1.method1207();
			local16 = Static5.aClass1_Sub3_Sub1_1.method1207();
			local20 = Static5.aClass1_Sub3_Sub1_1.method1171();
			local26 = (local20 & 0x7) + Static182.anInt3941;
			local31 = local26 + Static380.anInt6896;
			local39 = (local20 >> 4 & 0x7) + Static216.anInt4345;
			local44 = local39 + Static278.anInt5374;
			local146 = Static5.aClass1_Sub3_Sub1_1.method1207();
			if (local12 != Static32.anInt894) {
				@Pc(361) boolean local361 = local39 >= 0 && local26 >= 0 && Static209.anInt4283 > local39 && local26 < Static211.anInt4295;
				if (local361 || Static206.method3291(Static367.anInt6719)) {
					Static361.method5082(local31, local44, Static180.anInt3909, new Class1_Sub21(local16, local146));
					if (local361) {
						Static54.method1000(local39, local26, Static180.anInt3909);
					}
				}
			}
		} else if (Static57.aClass126_3 == arg0) {
			local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
			local16 = Static182.anInt3941 + (local12 & 0x7);
			local20 = Static380.anInt6896 + local16;
			local26 = (local12 >> 4 & 0x7) + Static216.anInt4345;
			local31 = local26 + Static278.anInt5374;
			local39 = Static5.aClass1_Sub3_Sub1_1.method1177();
			@Pc(436) Class1_Sub14 local436 = (Class1_Sub14) Static156.aClass38_16.method765((long) (Static180.anInt3909 << 28 | local20 << 14 | local31));
			if (local436 != null) {
				for (@Pc(446) Class1_Sub21 local446 = (Class1_Sub21) local436.aClass203_9.method4548(); local446 != null; local446 = (Class1_Sub21) local436.aClass203_9.method4545()) {
					if ((local39 & 0x7FFF) == local446.anInt3507) {
						local446.method6178();
						break;
					}
				}
				if (local436.aClass203_9.method4554()) {
					local436.method6178();
				}
				if (local26 >= 0 && local16 >= 0 && local26 < Static209.anInt4283 && Static211.anInt4295 > local16) {
					Static54.method1000(local26, local16, Static180.anInt3909);
				}
			}
		} else {
			@Pc(542) boolean local542;
			if (Static203.aClass126_8 == arg0) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = (local12 >> 4 & 0xF) + Static216.anInt4345 * 2;
				local20 = (local12 & 0xF) + Static182.anInt3941 * 2;
				local542 = Static5.aClass1_Sub3_Sub1_1.method1171() != 0;
				local31 = Static5.aClass1_Sub3_Sub1_1.method1212() + local16;
				local39 = Static5.aClass1_Sub3_Sub1_1.method1212() + local20;
				local44 = Static5.aClass1_Sub3_Sub1_1.method1215();
				local146 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local152 = Static5.aClass1_Sub3_Sub1_1.method1171() * 4;
				local158 = Static5.aClass1_Sub3_Sub1_1.method1171() * 4;
				local162 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local168 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local172 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local176 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (local172 == 255) {
					local172 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && Static209.anInt4283 * 2 > local16 && Static209.anInt4283 * 2 > local20 && local31 >= 0 && local39 >= 0 && local31 < Static211.anInt4295 * 2 && local39 < Static211.anInt4295 * 2 && local146 != 65535) {
					local16 = local16 * 64;
					local176 <<= 0x0;
					local31 = local31 * 64;
					local158 <<= 0x0;
					local39 *= 64;
					local152 <<= 0x0;
					local20 = local20 * 64;
					local276 = new Class30_Sub1_Sub2(local146, Static180.anInt3909, local16, local20, local152, Static187.anInt3975 + local162, local168 - -Static187.anInt3975, local172, local176, local44, local158, local542);
					local276.method3288(Static227.method3475(local31, local39, Static180.anInt3909) - local158, Static187.anInt3975 + local162, local39, local31);
					Static398.aClass203_46.method4551(new Class1_Sub1_Sub15(local276));
				}
			} else if (Static245.aClass126_10 == arg0) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local16 = Static5.aClass1_Sub3_Sub1_1.method1171();
				Static455.aClass161_4.method3628(local12).method4364(local16);
			} else if (Static452.aClass126_17 == arg0) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local16 = (local12 >> 4 & 0x7) + Static216.anInt4345;
				local20 = (local12 & 0x7) + Static182.anInt3941;
				local26 = Static5.aClass1_Sub3_Sub1_1.method1210();
				local31 = local26 >> 2;
				local39 = local26 & 0x3;
				local44 = Static461.anIntArray727[local31];
				if (Static206.method3291(Static367.anInt6719) || local16 >= 0 && local20 >= 0 && local16 < Static209.anInt4283 && local20 < Static211.anInt4295) {
					Static279.method4223(local31, -1, local16, local44, local20, local39, Static180.anInt3909);
				}
			} else if (arg0 == Static89.aClass126_18) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = (local12 >> 4 & 0x7) + Static216.anInt4345;
				local20 = Static182.anInt3941 + (local12 & 0x7);
				local26 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (local26 == 65535) {
					local26 = -1;
				}
				local31 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local39 = local31 >> 4 & 0xF;
				local44 = local31 & 0x7;
				local146 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local152 = Static5.aClass1_Sub3_Sub1_1.method1171();
				if (local16 >= 0 && local20 >= 0 && Static209.anInt4283 > local16 && local20 < Static211.anInt4295) {
					local158 = local39 + 1;
					if (Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0] >= local16 - local158 && Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray130[0] <= local16 + local158 && Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0] >= local20 - local158 && Static429.aClass30_Sub1_Sub1_Sub2_2.anIntArray129[0] <= local20 + local158) {
						Static229.method3508(local146, local152, (local20 << 8) + (Static180.anInt3909 << 24) + (local16 << 16) + local39, local44, local26);
					}
				}
			} else if (arg0 == Static405.aClass126_14) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1225();
				local16 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local20 = Static216.anInt4345 + (local16 >> 4 & 0x7);
				local26 = (local16 & 0x7) + Static182.anInt3941;
				local31 = Static5.aClass1_Sub3_Sub1_1.method1210();
				local39 = local31 >> 2;
				local44 = local31 & 0x3;
				local146 = Static461.anIntArray727[local39];
				if (Static206.method3291(Static367.anInt6719) || local20 >= 0 && local26 >= 0 && Static209.anInt4283 > local20 && local26 < Static211.anInt4295) {
					Static279.method4223(local39, local12, local20, local146, local26, local44, Static180.anInt3909);
				}
			} else if (arg0 == Static199.aClass126_7) {
				Static5.aClass1_Sub3_Sub1_1.method1171();
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = (local12 >> 4 & 0x7) + Static216.anInt4345;
				local20 = (local12 & 0x7) + Static182.anInt3941;
				local26 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local31 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local39 = Static5.aClass1_Sub3_Sub1_1.method1226();
				@Pc(1059) String local1059 = Static5.aClass1_Sub3_Sub1_1.method1201();
				Static240.method3624(local1059, local26, local16, local20, Static180.anInt3909, local39, local31);
			} else if (arg0 == Static223.aClass126_9) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = (local12 & 0x7) + Static182.anInt3941;
				local20 = Static380.anInt6896 + local16;
				local26 = Static216.anInt4345 + (local12 >> 4 & 0x7);
				local31 = Static278.anInt5374 + local26;
				local39 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local44 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local146 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (Static156.aClass38_16 != null) {
					@Pc(1128) Class1_Sub14 local1128 = (Class1_Sub14) Static156.aClass38_16.method765((long) (local31 | Static180.anInt3909 << 28 | local20 << 14));
					if (local1128 != null) {
						for (@Pc(1136) Class1_Sub21 local1136 = (Class1_Sub21) local1128.aClass203_9.method4548(); local1136 != null; local1136 = (Class1_Sub21) local1128.aClass203_9.method4545()) {
							if ((local39 & 0x7FFF) == local1136.anInt3507 && local1136.anInt3508 == local44) {
								local1136.method6178();
								local1136.anInt3508 = local146;
								Static361.method5082(local20, local31, Static180.anInt3909, local1136);
								break;
							}
						}
						if (local26 >= 0 && local16 >= 0 && local26 < Static209.anInt4283 && local16 < Static211.anInt4295) {
							Static54.method1000(local26, local16, Static180.anInt3909);
						}
					}
				}
			} else if (Static190.aClass126_6 == arg0) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = Static216.anInt4345 * 2 + (local12 >> 4 & 0xF);
				local20 = (local12 & 0xF) + Static182.anInt3941 * 2;
				local542 = Static5.aClass1_Sub3_Sub1_1.method1171() != 0;
				local31 = Static5.aClass1_Sub3_Sub1_1.method1212() + local16;
				local39 = local20 + Static5.aClass1_Sub3_Sub1_1.method1212();
				local44 = Static5.aClass1_Sub3_Sub1_1.method1215();
				local146 = Static5.aClass1_Sub3_Sub1_1.method1215();
				local152 = Static5.aClass1_Sub3_Sub1_1.method1177();
				@Pc(1260) byte local1260 = Static5.aClass1_Sub3_Sub1_1.method1212();
				local162 = Static5.aClass1_Sub3_Sub1_1.method1171() * 4;
				local168 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local172 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local176 = Static5.aClass1_Sub3_Sub1_1.method1171();
				@Pc(1282) int local1282 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (local176 == 255) {
					local176 = -1;
				}
				if (local16 >= 0 && local20 >= 0 && local16 < Static209.anInt4283 * 2 && local20 < Static209.anInt4283 * 2 && local31 >= 0 && local39 >= 0 && Static211.anInt4295 * 2 > local31 && local39 < Static211.anInt4295 * 2 && local152 != 65535) {
					local162 <<= 0x0;
					local1282 <<= 0x0;
					local158 = local1260 << 0;
					local31 = local31 * 64;
					local39 = local39 * 64;
					local20 *= 64;
					local16 *= 64;
					if (local44 != 0) {
						@Pc(1371) Class30_Sub1_Sub1 local1371 = null;
						@Pc(1386) int local1386;
						@Pc(1380) int local1380;
						@Pc(1390) int local1390;
						if (local44 >= 0) {
							local1380 = local44 - 1;
							local1386 = local1380 >> 11 & 0xF;
							local1390 = local1380 & 0x7FF;
							@Pc(1397) Class1_Sub27 local1397 = (Class1_Sub27) Static24.aClass38_3.method765((long) local1390);
							if (local1397 != null) {
								local1371 = local1397.aClass30_Sub1_Sub1_Sub1_2;
							}
						} else {
							local1380 = -local44 - 1;
							local1386 = local1380 >> 11 & 0xF;
							local1390 = local1380 & 0x7FF;
							if (Static32.anInt894 == local1390) {
								local1371 = Static429.aClass30_Sub1_Sub1_Sub2_2;
							} else {
								local1371 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local1390];
							}
						}
						if (local1371 != null) {
							@Pc(1440) Class212 local1440 = local1371.method948();
							if (local1440.anIntArrayArray49 != null && local1440.anIntArrayArray49[local1386] != null) {
								local1390 = local1440.anIntArrayArray49[local1386][0];
								@Pc(1462) int local1462 = local1440.anIntArrayArray49[local1386][2];
								@Pc(1467) int local1467 = local1371.aClass15_7.method327();
								@Pc(1471) int local1471 = Class90_Sub1.anIntArray304[local1467];
								@Pc(1475) int local1475 = Class90_Sub1.anIntArray303[local1467];
								@Pc(1485) int local1485 = local1462 * local1471 + local1475 * local1390 >> 15;
								@Pc(1496) int local1496 = local1475 * local1462 - local1471 * local1390 >> 15;
								local16 += local1485;
								local20 += local1496;
								local158 -= local1440.anIntArrayArray49[local1386][1];
							}
						}
					}
					@Pc(1535) Class30_Sub1_Sub2 local1535 = new Class30_Sub1_Sub2(local152, Static180.anInt3909, local16, local20, local158, Static187.anInt3975 + local168, local172 + Static187.anInt3975, local176, local1282, local146, local162, local542);
					local1535.method3288(Static227.method3475(local31, local39, Static180.anInt3909) - local162, Static187.anInt3975 + local168, local39, local31);
					Static398.aClass203_46.method4551(new Class1_Sub1_Sub15(local1535));
				}
			} else if (arg0 == Static398.aClass126_13) {
				@Pc(1568) byte local1568 = Static5.aClass1_Sub3_Sub1_1.method1212();
				@Pc(1572) byte local1572 = Static5.aClass1_Sub3_Sub1_1.method1220();
				local20 = Static5.aClass1_Sub3_Sub1_1.method1207();
				local26 = Static5.aClass1_Sub3_Sub1_1.method1225();
				local31 = Static5.aClass1_Sub3_Sub1_1.method1170();
				local39 = local31 >> 2;
				local44 = local31 & 0x3;
				local146 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local152 = Static216.anInt4345 + (local146 >> 4 & 0x7);
				local158 = Static182.anInt3941 + (local146 & 0x7);
				@Pc(1614) byte local1614 = Static5.aClass1_Sub3_Sub1_1.method1189();
				@Pc(1618) byte local1618 = Static5.aClass1_Sub3_Sub1_1.method1193();
				local172 = Static5.aClass1_Sub3_Sub1_1.method1215();
				local176 = Static5.aClass1_Sub3_Sub1_1.method1177();
				if (!Static30.aClass106_3.method5975()) {
					Static442.method6002(local172, local158, local1614, Static180.anInt3909, local176, local44, local26, local1568, local39, local20, local152, local1572, local1618);
				}
			} else if (arg0 == Static180.aClass126_5) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1218();
				local16 = (local12 >> 4 & 0x7) + Static216.anInt4345;
				local20 = (local12 & 0x7) + Static182.anInt3941;
				local26 = Static5.aClass1_Sub3_Sub1_1.method1210();
				local31 = local26 >> 2;
				local39 = local26 & 0x3;
				local44 = Static461.anIntArray727[local31];
				local146 = Static5.aClass1_Sub3_Sub1_1.method1207();
				if (local146 == 65535) {
					local146 = -1;
				}
				Static145.method2319(local16, local31, Static180.anInt3909, local39, local146, local20, local44);
			} else if (Static412.aClass126_16 == arg0) {
				local12 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local16 = (local12 >> 4 & 0x7) + Static216.anInt4345;
				local20 = (local12 & 0x7) + Static182.anInt3941;
				local26 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local31 = Static5.aClass1_Sub3_Sub1_1.method1171();
				local39 = Static5.aClass1_Sub3_Sub1_1.method1177();
				local44 = Static5.aClass1_Sub3_Sub1_1.method1171();
				if (local16 >= 0 && local20 >= 0 && Static209.anInt4283 > local16 && local20 < Static211.anInt4295) {
					local146 = local16 * 128 + 64;
					local152 = local20 * 128 + 64;
					local158 = Static180.anInt3909;
					if (local158 < 3 && Static457.method6172(local20, local16)) {
						local158++;
					}
					@Pc(1813) Class30_Sub1_Sub3 local1813 = new Class30_Sub1_Sub3(local26, local39, Static187.anInt3975, Static180.anInt3909, local158, local146, Static227.method3475(local146, local152, Static180.anInt3909) - local31, local152, local16, local16, local20, local20, local44);
					Static184.aClass203_32.method4551(new Class1_Sub1_Sub1(local1813));
				}
			} else {
				Static247.method3669("T3 - " + arg0, null);
				Static162.method2668(false);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jp;ILclient!jp;)V")
	public static void method564(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_263 != null) {
			arg1.method6178();
		}
		arg1.aClass1_264 = arg0;
		arg1.aClass1_263 = arg0.aClass1_263;
		arg1.aClass1_263.aClass1_264 = arg1;
		arg1.aClass1_264.aClass1_263 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	public static void method566() {
		for (@Pc(1) int local1 = 0; local1 < Static12.anInt184; local1++) {
			@Pc(6) Class30_Sub1 local6 = Static268.aClass30_Sub1Array3[local1];
			Static457.method6174(local6);
			Static268.aClass30_Sub1Array3[local1] = null;
		}
		Static12.anInt184 = 0;
	}
}
