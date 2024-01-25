import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	public static int anInt291 = 13156520;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
	public static boolean method240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!dq;)V")
	public static void method241(@OriginalArg(1) Class60 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(58) int local58;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(91) int local91;
		@Pc(183) Class47_Sub1_Sub1 local183;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(38) boolean local38;
		@Pc(64) int local64;
		@Pc(82) int local82;
		if (Static409.aClass60_18 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0xF) + Static221.anInt7650 * 2;
			local30 = (local12 & 0xF) + Static90.anInt1739 * 2;
			local38 = Static116.aClass1_Sub14_Sub2_1.method4548() != 0;
			local44 = local22 + Static116.aClass1_Sub14_Sub2_1.method4529();
			local50 = Static116.aClass1_Sub14_Sub2_1.method4529() + local30;
			local54 = Static116.aClass1_Sub14_Sub2_1.method4531();
			local58 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local64 = Static116.aClass1_Sub14_Sub2_1.method4548() * 4;
			local70 = Static116.aClass1_Sub14_Sub2_1.method4548() * 4;
			local74 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local78 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local82 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local82 == 255) {
				local82 = -1;
			}
			local91 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local22 >= 0 && local30 >= 0 && local22 < Static80.anInt6558 * 2 && local30 < Static80.anInt6558 * 2 && local44 >= 0 && local50 >= 0 && local44 < Static104.anInt2048 * 2 && Static104.anInt2048 * 2 > local50 && local58 != 65535) {
				local70 <<= 0x0;
				local50 *= 64;
				local44 *= 64;
				local30 *= 64;
				local22 *= 64;
				local64 <<= 0x0;
				local183 = new Class47_Sub1_Sub1(local58, Static316.anInt5491, local22, local30, local64, local74 + Static123.anInt2333, Static123.anInt2333 + local78, local82, local91, local54, local70, local38);
				local183.method827(Static405.method5510(local50, local44, Static316.anInt5491) - local70, Static123.anInt2333 + local74, local44, local50);
				Static152.aClass142_19.method3212(new Class1_Sub1_Sub12(local183));
			}
			return;
		}
		@Pc(238) int local238;
		if (arg0 == Static327.aClass60_14) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4499();
			local22 = Static116.aClass1_Sub14_Sub2_1.method4518();
			local30 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local238 = Static221.anInt7650 + (local30 >> 4 & 0x7);
			local44 = (local30 & 0x7) + Static90.anInt1739;
			if (local238 >= 0 && local44 >= 0 && local238 < Static80.anInt6558 && local44 < Static104.anInt2048) {
				Static377.method5313(new Class1_Sub44(local22, local12), local44, Static316.anInt5491, local238);
				Static111.method1739(local238, Static316.anInt5491, local44);
			}
		} else if (Static73.aClass60_3 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0xF) + Static221.anInt7650 * 2;
			local30 = (local12 & 0xF) + Static90.anInt1739 * 2;
			local38 = Static116.aClass1_Sub14_Sub2_1.method4548() != 0;
			local44 = Static116.aClass1_Sub14_Sub2_1.method4529() + local22;
			local50 = Static116.aClass1_Sub14_Sub2_1.method4529() + local30;
			local54 = Static116.aClass1_Sub14_Sub2_1.method4531();
			local58 = Static116.aClass1_Sub14_Sub2_1.method4531();
			local64 = Static116.aClass1_Sub14_Sub2_1.method4498();
			@Pc(339) byte local339 = Static116.aClass1_Sub14_Sub2_1.method4529();
			local74 = Static116.aClass1_Sub14_Sub2_1.method4548() * 4;
			local78 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local82 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local91 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local91 == 255) {
				local91 = -1;
			}
			@Pc(368) int local368 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local22 >= 0 && local30 >= 0 && Static80.anInt6558 * 2 > local22 && Static80.anInt6558 * 2 > local30 && local44 >= 0 && local50 >= 0 && Static104.anInt2048 * 2 > local44 && Static104.anInt2048 * 2 > local50 && local64 != 65535) {
				local50 *= 64;
				local22 = local22 * 64;
				local70 = local339 << 0;
				local44 *= 64;
				local74 <<= 0x0;
				local30 *= 64;
				if (local54 != 0) {
					@Pc(461) int local461;
					@Pc(465) Class47_Sub1_Sub5 local465;
					@Pc(451) int local451;
					@Pc(455) int local455;
					if (local54 >= 0) {
						local451 = local54 - 1;
						local455 = local451 & 0x7FF;
						local461 = local451 >> 11 & 0xF;
						local465 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local455];
					} else {
						local451 = -local54 - 1;
						local461 = local451 >> 11 & 0xF;
						local455 = local451 & 0x7FF;
						if (Static179.anInt3373 == local455) {
							local465 = Static255.aClass47_Sub1_Sub5_Sub2_2;
						} else {
							local465 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local455];
						}
					}
					if (local465 != null) {
						@Pc(499) Class231 local499 = local465.method4327();
						if (local499.anIntArrayArray51 != null && local499.anIntArrayArray51[local461] != null) {
							local455 = local499.anIntArrayArray51[local461][0];
							@Pc(521) int local521 = local499.anIntArrayArray51[local461][2];
							@Pc(526) int local526 = local465.aClass134_7.method3097();
							@Pc(530) int local530 = Class262.anIntArray575[local526];
							@Pc(534) int local534 = Class262.anIntArray576[local526];
							@Pc(544) int local544 = local534 * local455 + local530 * local521 >> 15;
							@Pc(555) int local555 = local534 * local521 - local530 * local455 >> 15;
							local30 += local555;
							local22 += local544;
							local70 -= local499.anIntArrayArray51[local461][1];
						}
					}
				}
				@Pc(595) Class47_Sub1_Sub1 local595 = new Class47_Sub1_Sub1(local64, Static316.anInt5491, local22, local30, local70, local78 + Static123.anInt2333, local82 + Static123.anInt2333, local91, local368, local58, local74, local38);
				local595.method827(Static405.method5510(local50, local44, Static316.anInt5491) - local74, local78 + Static123.anInt2333, local44, local50);
				Static152.aClass142_19.method3212(new Class1_Sub1_Sub12(local595));
			}
		} else if (arg0 == Static250.aClass60_12) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			@Pc(637) boolean local637 = (local12 & 0x80) != 0;
			local30 = (local12 >> 3 & 0x7) + Static221.anInt7650;
			local238 = Static90.anInt1739 + (local12 & 0x7);
			local44 = Static116.aClass1_Sub14_Sub2_1.method4529() + local30;
			local50 = local238 + Static116.aClass1_Sub14_Sub2_1.method4529();
			local54 = Static116.aClass1_Sub14_Sub2_1.method4531();
			local58 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local64 = Static116.aClass1_Sub14_Sub2_1.method4548() * 4;
			local70 = Static116.aClass1_Sub14_Sub2_1.method4548() * 4;
			local74 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local78 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local82 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local82 == 255) {
				local82 = -1;
			}
			local91 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local30 >= 0 && local238 >= 0 && Static80.anInt6558 > local30 && Static104.anInt2048 > local238 && local44 >= 0 && local50 >= 0 && Static80.anInt6558 > local44 && Static104.anInt2048 > local50 && local58 != 65535) {
				local64 <<= 0x0;
				local44 = local44 * 128 + 64;
				local70 <<= 0x0;
				local30 = local30 * 128 + 64;
				local50 = local50 * 128 + 64;
				local238 = local238 * 128 + 64;
				local183 = new Class47_Sub1_Sub1(local58, Static316.anInt5491, local30, local238, local64, local74 + Static123.anInt2333, local78 - -Static123.anInt2333, local82, local91, local54, local70, local637);
				local183.method827(Static405.method5510(local50, local44, Static316.anInt5491) - local70, Static123.anInt2333 + local74, local44, local50);
				Static152.aClass142_19.method3212(new Class1_Sub1_Sub12(local183));
			}
		} else if (Static223.aClass60_9 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = Static221.anInt7650 + (local12 >> 4 & 0x7);
			local30 = Static90.anInt1739 + (local12 & 0x7);
			local238 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local44 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local50 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local54 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local22 >= 0 && local30 >= 0 && Static80.anInt6558 > local22 && Static104.anInt2048 > local30) {
				local58 = local22 * 128 + 64;
				local64 = local30 * 128 + 64;
				local70 = Static316.anInt5491;
				if (local70 < 3 && Static195.method3034(local22, local30)) {
					local70++;
				}
				@Pc(928) Class47_Sub1_Sub3 local928 = new Class47_Sub1_Sub3(local238, local50, Static123.anInt2333, Static316.anInt5491, local70, local58, Static405.method5510(local64, local58, Static316.anInt5491) - local44, local64, local22, local22, local30, local30, local54);
				Static111.aClass142_14.method3212(new Class1_Sub1_Sub18(local928));
			}
		} else if (Static446.aClass60_20 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = Static90.anInt1739 + (local12 & 0x7);
			local238 = Static116.aClass1_Sub14_Sub2_1.method4498();
			if (local238 == 65535) {
				local238 = -1;
			}
			local44 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local50 = local44 >> 4 & 0xF;
			local54 = local44 & 0x7;
			local58 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local64 = Static116.aClass1_Sub14_Sub2_1.method4548();
			if (local22 >= 0 && local30 >= 0 && Static80.anInt6558 > local22 && Static104.anInt2048 > local30) {
				local70 = local50 + 1;
				if (local22 - local70 <= Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] && local22 + local70 >= Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0] && Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] >= local30 - local70 && Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] <= local70 + local30) {
					Static386.method5371(local50 + (local30 << 8) + (Static316.anInt5491 << 24) + (local22 << 16), local238, local58, local64, local54);
				}
			}
		} else if (arg0 == Static397.aClass60_17) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4533();
			local22 = Static116.aClass1_Sub14_Sub2_1.method4494();
			local30 = local22 >> 2;
			local238 = local22 & 0x3;
			local44 = Static449.anIntArray583[local30];
			local50 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local54 = (local50 >> 4 & 0x7) + Static221.anInt7650;
			local58 = Static90.anInt1739 + (local50 & 0x7);
			if (Static138.method5729(Static188.anInt3479) || local54 >= 0 && local58 >= 0 && local54 < Static80.anInt6558 && Static104.anInt2048 > local58) {
				Static435.method4780(Static316.anInt5491, local12, local44, local30, local54, local238, local58);
			}
		} else if (arg0 == Static355.aClass60_16) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local22 = Static116.aClass1_Sub14_Sub2_1.method4548();
			Static251.aClass207_2.method4977(local12).method473(local22);
		} else if (arg0 == Static238.aClass60_11) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4524();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = Static90.anInt1739 + (local12 & 0x7);
			local238 = Static116.aClass1_Sub14_Sub2_1.method4499();
			local44 = Static116.aClass1_Sub14_Sub2_1.method4518();
			local50 = Static116.aClass1_Sub14_Sub2_1.method4498();
			if (local22 >= 0 && local30 >= 0 && Static80.anInt6558 > local22 && Static104.anInt2048 > local30 && local50 != Static179.anInt3373) {
				Static377.method5313(new Class1_Sub44(local44, local238), local30, Static316.anInt5491, local22);
				Static111.method1739(local22, Static316.anInt5491, local30);
			}
		} else if (Static417.aClass60_19 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4524();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local238 = Static449.anIntArray583[local22];
			local44 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local50 = (local44 >> 4 & 0x7) + Static221.anInt7650;
			local54 = Static90.anInt1739 + (local44 & 0x7);
			if (Static138.method5729(Static188.anInt3479) || local50 >= 0 && local54 >= 0 && Static80.anInt6558 > local50 && local54 < Static104.anInt2048) {
				Static435.method4780(Static316.anInt5491, -1, local238, local22, local50, local30, local54);
			}
		} else if (Static235.aClass60_10 == arg0) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = Static90.anInt1739 + (local12 & 0x7);
			local238 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local44 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local50 = Static116.aClass1_Sub14_Sub2_1.method4498();
			if (Static346.aClass51_22 != null && local22 >= 0 && local30 >= 0 && Static80.anInt6558 > local22 && local30 < Static104.anInt2048) {
				@Pc(1386) Class1_Sub34 local1386 = (Class1_Sub34) Static346.aClass51_22.method930((long) (local30 << 14 | Static316.anInt5491 << 28 | local22));
				if (local1386 != null) {
					for (@Pc(1394) Class1_Sub44 local1394 = (Class1_Sub44) local1386.aClass142_43.method3199(); local1394 != null; local1394 = (Class1_Sub44) local1386.aClass142_43.method3198()) {
						if (local1394.anInt7736 == (local238 & 0x7FFF) && local44 == local1394.anInt7735) {
							local1394.method5965();
							local1394.anInt7735 = local50;
							Static377.method5313(local1394, local30, Static316.anInt5491, local22);
							break;
						}
					}
					Static111.method1739(local22, Static316.anInt5491, local30);
				}
			}
		} else if (arg0 == Static435.aClass60_15) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4533();
			@Pc(1449) byte local1449 = Static116.aClass1_Sub14_Sub2_1.method4529();
			@Pc(1453) byte local1453 = Static116.aClass1_Sub14_Sub2_1.method4552();
			local238 = Static116.aClass1_Sub14_Sub2_1.method4494();
			local44 = (local238 >> 4 & 0x7) + Static221.anInt7650;
			local50 = (local238 & 0x7) + Static90.anInt1739;
			local54 = Static116.aClass1_Sub14_Sub2_1.method4518();
			local58 = Static116.aClass1_Sub14_Sub2_1.method4536();
			@Pc(1483) byte local1483 = Static116.aClass1_Sub14_Sub2_1.method4514();
			local70 = Static116.aClass1_Sub14_Sub2_1.method4491();
			local74 = local70 >> 2;
			local78 = local70 & 0x3;
			@Pc(1499) byte local1499 = Static116.aClass1_Sub14_Sub2_1.method4552();
			local91 = Static116.aClass1_Sub14_Sub2_1.method4518();
			if (!Static447.aClass121_11.method4605()) {
				Static74.method1105(local74, local1449, local12, local50, local1453, local78, local58, local54, local1499, local44, Static316.anInt5491, local1483, local91);
			}
		} else if (arg0 == Static112.aClass60_5) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4524();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = (local12 & 0x7) + Static90.anInt1739;
			local238 = Static116.aClass1_Sub14_Sub2_1.method4533();
			if (local238 == 65535) {
				local238 = -1;
			}
			local44 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local50 = local44 >> 2;
			local54 = local44 & 0x3;
			local58 = Static449.anIntArray583[local50];
			Static312.method4268(local30, local238, local58, local22, Static316.anInt5491, local54, local50);
		} else if (arg0 == Static158.aClass60_6) {
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = Static90.anInt1739 + (local12 & 0x7);
			local238 = Static116.aClass1_Sub14_Sub2_1.method4498();
			if (local22 >= 0 && local30 >= 0 && local22 < Static80.anInt6558 && Static104.anInt2048 > local30) {
				@Pc(1634) Class1_Sub34 local1634 = (Class1_Sub34) Static346.aClass51_22.method930((long) (local22 | local30 << 14 | Static316.anInt5491 << 28));
				if (local1634 != null) {
					for (@Pc(1642) Class1_Sub44 local1642 = (Class1_Sub44) local1634.aClass142_43.method3199(); local1642 != null; local1642 = (Class1_Sub44) local1634.aClass142_43.method3198()) {
						if ((local238 & 0x7FFF) == local1642.anInt7736) {
							local1642.method5965();
							break;
						}
					}
					if (local1634.aClass142_43.method3210()) {
						local1634.method5965();
					}
					Static111.method1739(local22, Static316.anInt5491, local30);
				}
			}
		} else if (arg0 == Static87.aClass60_13) {
			Static116.aClass1_Sub14_Sub2_1.method4548();
			local12 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local22 = (local12 >> 4 & 0x7) + Static221.anInt7650;
			local30 = (local12 & 0x7) + Static90.anInt1739;
			local238 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local44 = Static116.aClass1_Sub14_Sub2_1.method4548();
			local50 = Static116.aClass1_Sub14_Sub2_1.method4496();
			@Pc(1726) String local1726 = Static116.aClass1_Sub14_Sub2_1.method4509();
			Static142.method2279(local1726, local238, local44, local22, local50, Static316.anInt5491, local30);
		} else {
			Static101.method1630("T3 - " + arg0, null);
			Static261.method3691();
		}
	}
}
