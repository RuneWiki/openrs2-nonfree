import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	public static int anInt5472;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!mg;")
	public static Class160 aClass160_62;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static final int anInt5465 = 0;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "[Lclient!si;")
	public static final Class2_Sub23[] aClass2_Sub23Array2 = new Class2_Sub23[2048];

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
	public static int anInt5473 = 0;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public static int anInt5474 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ri;I)V")
	public static void method4367(@OriginalArg(0) Class214 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(73) int local73;
		if (arg0 == Static136.aClass214_7) {
			local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local20 = (local12 >> 4 & 0x7) + Static397.anInt6600;
			local26 = Static31.anInt640 + (local12 & 0x7);
			local30 = Static438.aClass2_Sub23_Sub2_2.method5500();
			if (local30 == 65535) {
				local30 = -1;
			}
			local41 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local47 = local41 >> 4 & 0xF;
			local51 = local41 & 0x7;
			local55 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local59 = Static438.aClass2_Sub23_Sub2_2.method5495();
			if (local20 >= 0 && local26 >= 0 && local20 < Static229.anInt4427 && Static379.anInt6422 > local26) {
				local73 = local47 + 1;
				if (local20 - local73 <= Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] && Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray525[0] <= local73 + local20 && Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0] >= local26 - local73 && local73 + local26 >= Static375.aClass3_Sub2_Sub1_Sub2_7.anIntArray524[0]) {
					Static238.method3681(local55, local59, local51, local30, local47 + (local26 << 8) + (Static317.anInt5575 << 24) + (local20 << 16));
				}
			}
		} else if (Static404.aClass214_24 == arg0) {
			local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local20 = Static397.anInt6600 + (local12 >> 4 & 0x7);
			local26 = Static31.anInt640 + (local12 & 0x7);
			local30 = Static438.aClass2_Sub23_Sub2_2.method5500();
			local41 = Static438.aClass2_Sub23_Sub2_2.method5500();
			local47 = Static438.aClass2_Sub23_Sub2_2.method5500();
			if (Static132.aClass163_13 != null && local20 >= 0 && local26 >= 0 && local20 < Static229.anInt4427 && Static379.anInt6422 > local26) {
				@Pc(207) Class2_Sub14 local207 = (Class2_Sub14) Static132.aClass163_13.method3769((long) (local20 | local26 << 14 | Static317.anInt5575 << 28));
				if (local207 != null) {
					for (@Pc(215) Class2_Sub31 local215 = (Class2_Sub31) local207.aClass14_22.method309(); local215 != null; local215 = (Class2_Sub31) local207.aClass14_22.method311()) {
						if ((local30 & 0x7FFF) == local215.anInt5175 && local215.anInt5174 == local41) {
							local215.method5866();
							local215.anInt5174 = local47;
							Static49.method805(local26, local215, local20, Static317.anInt5575);
							break;
						}
					}
					Static181.method2904(Static317.anInt5575, local26, local20);
				}
			}
		} else if (Static216.aClass214_22 == arg0) {
			local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local20 = Static397.anInt6600 + (local12 >> 4 & 0x7);
			local26 = Static31.anInt640 + (local12 & 0x7);
			local30 = Static438.aClass2_Sub23_Sub2_2.method5500();
			local41 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local47 = Static438.aClass2_Sub23_Sub2_2.method5500();
			local51 = Static438.aClass2_Sub23_Sub2_2.method5495();
			if (local20 >= 0 && local26 >= 0 && Static229.anInt4427 > local20 && local26 < Static379.anInt6422) {
				local55 = local20 * 128 + 64;
				local59 = local26 * 128 + 64;
				local73 = Static317.anInt5575;
				if (local73 < 3 && Static40.method645(local26, local20)) {
					local73++;
				}
				@Pc(366) Class3_Sub2_Sub2 local366 = new Class3_Sub2_Sub2(local30, local47, Static131.anInt2821, Static317.anInt5575, local73, local55, Static85.method1695(Static317.anInt5575, local59, local55) - local41, local59, local20, local20, local26, local26, local51);
				Static31.aClass14_1.method300(new Class2_Sub5_Sub11(local366));
			}
		} else if (Static278.aClass214_19 == arg0) {
			local12 = Static438.aClass2_Sub23_Sub2_2.method5492();
			local20 = Static438.aClass2_Sub23_Sub2_2.method5452();
			local26 = Static397.anInt6600 + (local20 >> 4 & 0x7);
			local30 = (local20 & 0x7) + Static31.anInt640;
			local41 = Static438.aClass2_Sub23_Sub2_2.method5495();
			local47 = local41 >> 2;
			local51 = local41 & 0x3;
			local55 = Static284.anIntArray418[local47];
			if (Static238.method3680(Static402.anInt6692) || local26 >= 0 && local30 >= 0 && local26 < Static229.anInt4427 && local30 < Static379.anInt6422) {
				Static342.method4715(local51, local12, local55, local47, local30, local26, Static317.anInt5575);
			}
		} else if (Static53.aClass214_5 == arg0) {
			local12 = Static438.aClass2_Sub23_Sub2_2.method5452();
			local20 = (local12 >> 4 & 0x7) + Static397.anInt6600;
			local26 = Static31.anInt640 + (local12 & 0x7);
			local30 = Static438.aClass2_Sub23_Sub2_2.method5492();
			if (local20 >= 0 && local26 >= 0 && local20 < Static229.anInt4427 && Static379.anInt6422 > local26) {
				@Pc(514) Class2_Sub14 local514 = (Class2_Sub14) Static132.aClass163_13.method3769((long) (Static317.anInt5575 << 28 | local26 << 14 | local20));
				if (local514 != null) {
					for (@Pc(522) Class2_Sub31 local522 = (Class2_Sub31) local514.aClass14_22.method309(); local522 != null; local522 = (Class2_Sub31) local514.aClass14_22.method311()) {
						if ((local30 & 0x7FFF) == local522.anInt5175) {
							local522.method5866();
							break;
						}
					}
					if (local514.aClass14_22.method298()) {
						local514.method5866();
					}
					Static181.method2904(Static317.anInt5575, local26, local20);
				}
			}
		} else {
			@Pc(644) int local644;
			@Pc(648) int local648;
			@Pc(654) int local654;
			@Pc(658) int local658;
			@Pc(606) boolean local606;
			@Pc(761) Class3_Sub2_Sub3 local761;
			if (Static80.aClass214_26 == arg0) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local20 = Static397.anInt6600 * 2 + (local12 >> 4 & 0xF);
				local26 = Static31.anInt640 * 2 + (local12 & 0xF);
				local606 = Static438.aClass2_Sub23_Sub2_2.method5495() != 0;
				local41 = Static438.aClass2_Sub23_Sub2_2.method5484() + local20;
				local47 = local26 + Static438.aClass2_Sub23_Sub2_2.method5484();
				local51 = Static438.aClass2_Sub23_Sub2_2.method5458();
				local55 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local59 = Static438.aClass2_Sub23_Sub2_2.method5495() * 4;
				local73 = Static438.aClass2_Sub23_Sub2_2.method5495() * 4;
				local644 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local648 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local654 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local658 = Static438.aClass2_Sub23_Sub2_2.method5495();
				if (local654 == 255) {
					local654 = -1;
				}
				if (local20 >= 0 && local26 >= 0 && Static229.anInt4427 * 2 > local20 && Static229.anInt4427 * 2 > local26 && local41 >= 0 && local47 >= 0 && local41 < Static379.anInt6422 * 2 && Static379.anInt6422 * 2 > local47 && local55 != 65535) {
					local26 = local26 * 64;
					local41 = local41 * 64;
					local59 <<= 0x0;
					local47 = local47 * 64;
					local73 <<= 0x0;
					local20 = local20 * 64;
					local761 = new Class3_Sub2_Sub3(local55, Static317.anInt5575, local20, local26, local59, local644 + Static131.anInt2821, local648 - -Static131.anInt2821, local654, local658, local51, local73, local606);
					local761.method3456(local41, local47, Static131.anInt2821 + local644, -local73 + Static85.method1695(Static317.anInt5575, local47, local41));
					Static391.aClass14_36.method300(new Class2_Sub5_Sub17(local761));
				}
			} else if (Static148.aClass214_8 == arg0) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				@Pc(802) boolean local802 = (local12 & 0x80) != 0;
				local26 = (local12 >> 3 & 0x7) + Static397.anInt6600;
				local30 = (local12 & 0x7) + Static31.anInt640;
				local41 = Static438.aClass2_Sub23_Sub2_2.method5484() + local26;
				local47 = Static438.aClass2_Sub23_Sub2_2.method5484() + local30;
				local51 = Static438.aClass2_Sub23_Sub2_2.method5458();
				local55 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local59 = Static438.aClass2_Sub23_Sub2_2.method5495() * 4;
				local73 = Static438.aClass2_Sub23_Sub2_2.method5495() * 4;
				local644 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local648 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local654 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local658 = Static438.aClass2_Sub23_Sub2_2.method5495();
				if (local654 == 255) {
					local654 = -1;
				}
				if (local26 >= 0 && local30 >= 0 && Static229.anInt4427 > local26 && Static379.anInt6422 > local30 && local41 >= 0 && local47 >= 0 && local41 < Static229.anInt4427 && local47 < Static379.anInt6422 && local55 != 65535) {
					local26 = local26 * 128 + 64;
					local59 <<= 0x0;
					local30 = local30 * 128 + 64;
					local73 <<= 0x0;
					local41 = local41 * 128 + 64;
					local47 = local47 * 128 + 64;
					local761 = new Class3_Sub2_Sub3(local55, Static317.anInt5575, local26, local30, local59, Static131.anInt2821 + local644, Static131.anInt2821 + local648, local654, local658, local51, local73, local802);
					local761.method3456(local41, local47, Static131.anInt2821 + local644, -local73 + Static85.method1695(Static317.anInt5575, local47, local41));
					Static391.aClass14_36.method300(new Class2_Sub5_Sub17(local761));
				}
			} else if (Static353.aClass214_21 == arg0) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local20 = Static397.anInt6600 + (local12 >> 4 & 0x7);
				local26 = Static31.anInt640 + (local12 & 0x7);
				local30 = Static438.aClass2_Sub23_Sub2_2.method5493();
				@Pc(1018) byte local1018 = Static438.aClass2_Sub23_Sub2_2.method5497();
				@Pc(1022) byte local1022 = Static438.aClass2_Sub23_Sub2_2.method5497();
				@Pc(1028) byte local1028 = Static438.aClass2_Sub23_Sub2_2.method5471();
				@Pc(1032) byte local1032 = Static438.aClass2_Sub23_Sub2_2.method5497();
				local59 = Static438.aClass2_Sub23_Sub2_2.method5458();
				local73 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local644 = local73 >> 2;
				local648 = local73 & 0x3;
				local654 = Static438.aClass2_Sub23_Sub2_2.method5492();
				local658 = Static438.aClass2_Sub23_Sub2_2.method5493();
				if (!Static33.aClass49_1.method4465()) {
					Static64.method1248(local658, local644, local26, local30, local1018, local1022, local59, local648, local1032, local654, local1028, Static317.anInt5575, local20);
				}
			} else if (Static391.aClass214_18 == arg0) {
				Static438.aClass2_Sub23_Sub2_2.method5495();
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local20 = Static397.anInt6600 + (local12 >> 4 & 0x7);
				local26 = Static31.anInt640 + (local12 & 0x7);
				local30 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local41 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local47 = Static438.aClass2_Sub23_Sub2_2.method5485();
				@Pc(1121) String local1121 = Static438.aClass2_Sub23_Sub2_2.method5494();
				Static103.method1892(local20, local41, local30, Static317.anInt5575, local1121, local26, local47);
			} else if (arg0 == Static402.aClass214_23) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local20 = (local12 >> 4 & 0xF) + Static397.anInt6600 * 2;
				local26 = Static31.anInt640 * 2 + (local12 & 0xF);
				local606 = Static438.aClass2_Sub23_Sub2_2.method5495() != 0;
				local41 = Static438.aClass2_Sub23_Sub2_2.method5484() + local20;
				local47 = local26 + Static438.aClass2_Sub23_Sub2_2.method5484();
				local51 = Static438.aClass2_Sub23_Sub2_2.method5458();
				local55 = Static438.aClass2_Sub23_Sub2_2.method5458();
				local59 = Static438.aClass2_Sub23_Sub2_2.method5500();
				@Pc(1199) byte local1199 = Static438.aClass2_Sub23_Sub2_2.method5484();
				local644 = Static438.aClass2_Sub23_Sub2_2.method5495() * 4;
				local648 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local654 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local658 = Static438.aClass2_Sub23_Sub2_2.method5495();
				if (local658 == 255) {
					local658 = -1;
				}
				@Pc(1226) int local1226 = Static438.aClass2_Sub23_Sub2_2.method5495();
				if (local20 >= 0 && local26 >= 0 && Static229.anInt4427 * 2 > local20 && Static229.anInt4427 * 2 > local26 && local41 >= 0 && local47 >= 0 && local41 < Static379.anInt6422 * 2 && Static379.anInt6422 * 2 > local47 && local59 != 65535) {
					local20 = local20 * 64;
					local73 = local1199 << 0;
					local47 *= 64;
					local26 = local26 * 64;
					local644 <<= 0x0;
					local41 = local41 * 64;
					if (local51 != 0) {
						@Pc(1322) int local1322;
						@Pc(1333) Class3_Sub2_Sub1 local1333;
						@Pc(1316) int local1316;
						@Pc(1326) int local1326;
						if (local51 < 0) {
							local1316 = -local51 - 1;
							local1322 = local1316 >> 11 & 0xF;
							local1326 = local1316 & 0x7FF;
							if (local1326 == Static399.anInt6656) {
								local1333 = Static375.aClass3_Sub2_Sub1_Sub2_7;
							} else {
								local1333 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local1326];
							}
						} else {
							local1316 = local51 - 1;
							local1322 = local1316 >> 11 & 0xF;
							local1326 = local1316 & 0x7FF;
							local1333 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local1326];
						}
						if (local1333 != null) {
							@Pc(1363) Class156 local1363 = local1333.method4925();
							if (local1363.anIntArrayArray43 != null && local1363.anIntArrayArray43[local1322] != null) {
								local1326 = local1363.anIntArrayArray43[local1322][0];
								@Pc(1385) int local1385 = local1363.anIntArrayArray43[local1322][2];
								@Pc(1390) int local1390 = local1333.aClass266_7.method5718();
								@Pc(1394) int local1394 = Class162.anIntArray388[local1390];
								@Pc(1398) int local1398 = Class162.anIntArray387[local1390];
								@Pc(1408) int local1408 = local1326 * local1398 + local1385 * local1394 >> 15;
								@Pc(1419) int local1419 = local1385 * local1398 - local1326 * local1394 >> 15;
								local20 += local1408;
								local26 += local1419;
								local73 -= local1363.anIntArrayArray43[local1322][1];
							}
						}
					}
					@Pc(1458) Class3_Sub2_Sub3 local1458 = new Class3_Sub2_Sub3(local59, Static317.anInt5575, local20, local26, local73, Static131.anInt2821 + local648, local654 + Static131.anInt2821, local658, local1226, local55, local644, local606);
					local1458.method3456(local41, local47, Static131.anInt2821 + local648, Static85.method1695(Static317.anInt5575, local47, local41) - local644);
					Static391.aClass14_36.method300(new Class2_Sub5_Sub17(local1458));
				}
			} else if (arg0 == Static249.aClass214_17) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5493();
				if (local12 == 65535) {
					local12 = -1;
				}
				local20 = Static438.aClass2_Sub23_Sub2_2.method5499();
				local26 = local20 >> 2;
				local30 = local20 & 0x3;
				local41 = Static284.anIntArray418[local26];
				local47 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local51 = (local47 >> 4 & 0x7) + Static397.anInt6600;
				local55 = (local47 & 0x7) + Static31.anInt640;
				Static258.method583(local26, local12, local30, local51, local55, local41, Static317.anInt5575);
			} else if (arg0 == Static164.aClass214_13) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local20 = Static438.aClass2_Sub23_Sub2_2.method5495();
				Static118.aClass165_2.method3799(local12).method2977(local20);
			} else if (arg0 == Static416.aClass214_25) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static284.anIntArray418[local20];
				local41 = Static438.aClass2_Sub23_Sub2_2.method5499();
				local47 = Static397.anInt6600 + (local41 >> 4 & 0x7);
				local51 = Static31.anInt640 + (local41 & 0x7);
				if (Static238.method3680(Static402.anInt6692) || local47 >= 0 && local51 >= 0 && Static229.anInt4427 > local47 && local51 < Static379.anInt6422) {
					Static342.method4715(local26, -1, local30, local20, local51, local47, Static317.anInt5575);
				}
			} else if (arg0 == Static1.aClass214_4) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local20 = Static438.aClass2_Sub23_Sub2_2.method5500();
				local26 = Static438.aClass2_Sub23_Sub2_2.method5495();
				local30 = Static397.anInt6600 + (local26 >> 4 & 0x7);
				local41 = Static31.anInt640 + (local26 & 0x7);
				local47 = Static438.aClass2_Sub23_Sub2_2.method5492();
				if (local30 >= 0 && local41 >= 0 && local30 < Static229.anInt4427 && Static379.anInt6422 > local41 && local47 != Static399.anInt6656) {
					Static49.method805(local41, new Class2_Sub31(local20, local12), local30, Static317.anInt5575);
					Static181.method2904(Static317.anInt5575, local41, local30);
				}
			} else if (arg0 == Static57.aClass214_6) {
				local12 = Static438.aClass2_Sub23_Sub2_2.method5452();
				local20 = Static397.anInt6600 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static31.anInt640;
				local30 = Static438.aClass2_Sub23_Sub2_2.method5460();
				local41 = Static438.aClass2_Sub23_Sub2_2.method5493();
				if (local20 >= 0 && local26 >= 0 && Static229.anInt4427 > local20 && local26 < Static379.anInt6422) {
					Static49.method805(local26, new Class2_Sub31(local30, local41), local20, Static317.anInt5575);
					Static181.method2904(Static317.anInt5575, local26, local20);
				}
			} else {
				Static361.method4904(null, "T3 - " + arg0);
				Static220.method3461();
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method4369() {
		for (@Pc(6) Class2_Sub24 local6 = (Class2_Sub24) Static72.aClass14_7.method309(); local6 != null; local6 = (Class2_Sub24) Static72.aClass14_7.method311()) {
			if (local6.aBoolean311) {
				local6.method3466();
			}
		}
		for (@Pc(30) Class2_Sub24 local30 = (Class2_Sub24) Static446.aClass14_49.method309(); local30 != null; local30 = (Class2_Sub24) Static446.aClass14_49.method311()) {
			if (local30.aBoolean311) {
				local30.method3466();
			}
		}
	}
}
