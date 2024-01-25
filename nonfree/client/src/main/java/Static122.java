import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt2160;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!daa;")
	public static final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_37 = new Class289(84, 1);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method1891(@OriginalArg(0) int arg0) {
		Class6_Sub22.lb = arg0;
		@Pc(13) Class10 local13 = Static121.aClass10_7;
		synchronized (Static121.aClass10_7) {
			Static121.aClass10_7.method375();
		}
		local13 = Static569.aClass10_54;
		synchronized (Static569.aClass10_54) {
			Static569.aClass10_54.method375();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lclient!ac;")
	public static Class5 method1892(@OriginalArg(0) int arg0) {
		@Pc(15) Class5 local15 = (Class5) Static357.aClass10_38.method373((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static99.aClass8_29.method262(arg0, 0);
		local15 = new Class5();
		if (local25 != null) {
			local15.method110(arg0, new Class6_Sub23(local25));
		}
		Static357.aClass10_38.method366(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!iga;)V")
	public static void method1893(@OriginalArg(1) Class159 arg0) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(80) int local80;
		@Pc(59) int local59;
		if (Static589.aClass159_15 == arg0) {
			@Pc(12) int local12 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local20 = (local12 >> 4 & 0x7) + Static557.anInt9342;
			local26 = Static105.anInt1937 + (local12 & 0x7);
			local30 = Static204.aClass6_Sub23_Sub1_1.method8363();
			if (local30 == 65535) {
				local30 = -1;
			}
			local41 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local47 = local41 >> 4 & 0xF;
			local51 = local41 & 0x7;
			local55 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local59 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local63 = Static204.aClass6_Sub23_Sub1_1.method8363();
			if (local20 >= 0 && local26 >= 0 && Static491.anInt9856 > local20 && Static393.anInt6574 > local26) {
				local80 = local47 + 1;
				if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] >= local20 - local80 && local80 + local20 >= Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] >= local26 - local80 && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] <= local80 + local26) {
					Static618.method8527((local26 << 8) + (local20 << 16) + (Static310.anInt5244 << 24) + local47, local30, local51, local55, local59, local63);
				}
			}
		} else if (Static136.aClass159_6 == arg0) {
			local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local26 = local20 >> 2;
			local30 = local20 & 0x3;
			local41 = Static472.anIntArray533[local26];
			local47 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local51 = Static557.anInt9342 + (local47 >> 4 & 0x7);
			local55 = Static105.anInt1937 + (local47 & 0x7);
			if (Static257.method3734(Static566.anInt9416) || local51 >= 0 && local55 >= 0 && Static491.anInt9856 > local51 && Static393.anInt6574 > local55) {
				Static531.method7390(local55, -1, local41, local26, Static310.anInt5244, local30, local51);
			}
		} else if (Static448.aClass159_13 == arg0) {
			local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local26 = Static557.anInt9342 + (local20 >> 4 & 0x7);
			local30 = Static105.anInt1937 + (local20 & 0x7);
			local41 = Static204.aClass6_Sub23_Sub1_1.method8363();
			local47 = Static204.aClass6_Sub23_Sub1_1.method8374();
			local51 = Static204.aClass6_Sub23_Sub1_1.method8363();
			local55 = Static204.aClass6_Sub23_Sub1_1.method8374();
			if (local26 >= 0 && local30 >= 0 && local26 < Static491.anInt9856 && local30 < Static393.anInt6574) {
				local59 = local26 * 512 + 256;
				local63 = local30 * 512 + 256;
				local80 = Static310.anInt5244;
				if (local80 < 3 && Static250.method3635(local26, local30)) {
					local80++;
				}
				@Pc(325) Class2_Sub1_Sub1_Sub1 local325 = new Class2_Sub1_Sub1_Sub1(local41, local51, Static90.anInt1698, Static310.anInt5244, local80, local59, Static284.method4118(local59, Static310.anInt5244, local63) - local47, local63, local26, local26, local30, local30, local55);
				Static129.aClass362_11.method8536(new Class6_Sub4_Sub21(local325));
			}
		} else {
			@Pc(413) int local413;
			@Pc(417) int local417;
			@Pc(438) int local438;
			@Pc(442) int local442;
			@Pc(446) int local446;
			@Pc(421) int local421;
			if (Static127.aClass159_4 == arg0) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26 = Static557.anInt9342 * 2 + (local20 >> 4 & 0xF);
				local30 = Static105.anInt1937 * 2 + (local20 & 0xF);
				local41 = Static204.aClass6_Sub23_Sub1_1.method8374();
				@Pc(374) boolean local374 = (local41 & 0x1) != 0;
				@Pc(385) boolean local385 = (local41 & 0x2) != 0;
				local55 = local385 ? local41 >> 2 : -1;
				local59 = local26 + Static204.aClass6_Sub23_Sub1_1.method8391();
				local63 = Static204.aClass6_Sub23_Sub1_1.method8391() + local30;
				local80 = Static204.aClass6_Sub23_Sub1_1.method8395();
				local413 = Static204.aClass6_Sub23_Sub1_1.method8395();
				local417 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local421 = Static204.aClass6_Sub23_Sub1_1.method8374();
				if (local385) {
					local421 = (byte) local421;
				} else {
					local421 *= 4;
				}
				local438 = Static204.aClass6_Sub23_Sub1_1.method8374() * 4;
				local442 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local446 = Static204.aClass6_Sub23_Sub1_1.method8363();
				@Pc(450) int local450 = Static204.aClass6_Sub23_Sub1_1.method8374();
				@Pc(454) int local454 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local450 == 255) {
					local450 = -1;
				}
				if (local26 >= 0 && local30 >= 0 && Static491.anInt9856 * 2 > local26 && local30 < Static491.anInt9856 * 2 && local59 >= 0 && local63 >= 0 && Static393.anInt6574 * 2 > local59 && Static393.anInt6574 * 2 > local63 && local417 != 65535) {
					local26 *= 256;
					local421 <<= 0x2;
					local438 <<= 0x2;
					local454 <<= 0x2;
					local59 = local59 * 256;
					local63 = local63 * 256;
					local30 = local30 * 256;
					if (local80 != 0 && local55 != -1) {
						@Pc(540) Class2_Sub1_Sub1_Sub3 local540 = null;
						@Pc(550) int local550;
						if (local80 < 0) {
							local550 = -local80 - 1;
							if (Static659.anInt7559 == local550) {
								local540 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2;
							} else {
								local540 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local550];
							}
						} else {
							local550 = local80 - 1;
							@Pc(572) Class6_Sub44 local572 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local550);
							if (local572 != null) {
								local540 = local572.aClass2_Sub1_Sub1_Sub3_Sub2_2;
							}
						}
						if (local540 != null) {
							@Pc(583) Class389 local583 = local540.method4317();
							if (local583.anIntArrayArray60 != null && local583.anIntArrayArray60[local55] != null) {
								local421 -= local583.anIntArrayArray60[local55][1];
							}
							if (local583.anIntArrayArray61 != null && local583.anIntArrayArray61[local55] != null) {
								local421 -= local583.anIntArrayArray61[local55][1];
							}
						}
					}
					@Pc(640) Class2_Sub1_Sub1_Sub4 local640 = new Class2_Sub1_Sub1_Sub4(local417, Static310.anInt5244, Static310.anInt5244, local26, local30, local421, Static90.anInt1698 + local442, Static90.anInt1698 + local446, local450, local454, local80, local413, local438, local374, local55);
					local640.method4948(local59, Static284.method4118(local59, Static310.anInt5244, local63) - local438, local63, Static90.anInt1698 + local442);
					Static205.aClass362_18.method8536(new Class6_Sub4_Sub14(local640));
				}
			} else if (Static373.aClass159_9 == arg0) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26 = Static557.anInt9342 + (local20 >> 4 & 0x7);
				local30 = Static105.anInt1937 + (local20 & 0x7);
				local41 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local41 == 65535) {
					local41 = -1;
				}
				local47 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local51 = local47 >> 4 & 0xF;
				local55 = local47 & 0x7;
				local59 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local63 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local80 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local26 >= 0 && local30 >= 0 && Static491.anInt9856 > local26 && local30 < Static393.anInt6574) {
					local413 = local51 + 1;
					if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] >= local26 - local413 && local413 + local26 >= Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] && Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] >= local30 - local413 && local413 + local30 >= Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0]) {
						Static470.method6930(local41, local80, local51 + (local30 << 8) + (local26 << 16) + (Static310.anInt5244 << 24), local63, local59, local55);
					}
				}
			} else if (arg0 == Static403.aClass159_11) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26 = Static105.anInt1937 + (local20 & 0x7);
				local30 = Static234.anInt4239 + local26;
				local41 = Static557.anInt9342 + (local20 >> 4 & 0x7);
				local47 = Static534.anInt8753 + local41;
				local51 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local55 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local59 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (Static33.aClass209_3 != null) {
					@Pc(864) Class6_Sub52 local864 = (Class6_Sub52) Static33.aClass209_3.method5038((long) (local47 | Static310.anInt5244 << 28 | local30 << 14));
					if (local864 != null) {
						for (@Pc(872) Class6_Sub3 local872 = (Class6_Sub3) local864.aClass362_61.method8538(); local872 != null; local872 = (Class6_Sub3) local864.aClass362_61.method8530()) {
							if (local872.anInt439 == (local51 & 0x7FFF) && local55 == local872.anInt441) {
								local872.method9174();
								local872.anInt441 = local59;
								Static429.method8198(local30, Static310.anInt5244, local872, local47);
								break;
							}
						}
						if (local41 >= 0 && local26 >= 0 && Static491.anInt9856 > local41 && Static393.anInt6574 > local26) {
							Static529.method8525(Static310.anInt5244, local41, local26);
						}
					}
				}
			} else if (Static435.aClass159_12 == arg0) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8343();
				local26 = local20 >> 2;
				local30 = local20 & 0x3;
				local41 = Static472.anIntArray533[local26];
				local47 = Static204.aClass6_Sub23_Sub1_1.method8365();
				if (local47 == 65535) {
					local47 = -1;
				}
				local51 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local55 = Static557.anInt9342 + (local51 >> 4 & 0x7);
				local59 = (local51 & 0x7) + Static105.anInt1937;
				Static408.method5843(local26, local55, local59, local47, Static310.anInt5244, local30, local41);
			} else if (arg0 == Static223.aClass159_8) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8343();
				local26 = local20 >> 2;
				local30 = local20 & 0x3;
				local41 = Static472.anIntArray533[local26];
				local47 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local51 = Static557.anInt9342 + (local47 >> 4 & 0x7);
				local55 = Static105.anInt1937 + (local47 & 0x7);
				local59 = Static204.aClass6_Sub23_Sub1_1.method8365();
				if (Static257.method3734(Static566.anInt9416) || local51 >= 0 && local55 >= 0 && Static491.anInt9856 > local51 && Static393.anInt6574 > local55) {
					Static531.method7390(local55, local59, local41, local26, Static310.anInt5244, local30, local51);
				}
			} else if (Static488.aClass159_14 == arg0) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local26 = (local20 & 0x7) + Static105.anInt1937;
				local30 = local26 + Static234.anInt4239;
				local41 = Static557.anInt9342 + (local20 >> 4 & 0x7);
				local47 = Static534.anInt8753 + local41;
				local51 = Static204.aClass6_Sub23_Sub1_1.method8403();
				@Pc(1122) Class6_Sub52 local1122 = (Class6_Sub52) Static33.aClass209_3.method5038((long) (local30 << 14 | Static310.anInt5244 << 28 | local47));
				if (local1122 != null) {
					for (@Pc(1130) Class6_Sub3 local1130 = (Class6_Sub3) local1122.aClass362_61.method8538(); local1130 != null; local1130 = (Class6_Sub3) local1122.aClass362_61.method8530()) {
						if (local1130.anInt439 == (local51 & 0x7FFF)) {
							local1130.method9174();
							break;
						}
					}
					if (local1122.aClass362_61.method8541()) {
						local1122.method9174();
					}
					if (local41 >= 0 && local26 >= 0 && local41 < Static491.anInt9856 && local26 < Static393.anInt6574) {
						Static529.method8525(Static310.anInt5244, local41, local26);
					}
				}
			} else if (arg0 == Static602.aClass159_16) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local26 = Static204.aClass6_Sub23_Sub1_1.method8367();
				local30 = Static204.aClass6_Sub23_Sub1_1.method8365();
				local41 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local47 = Static105.anInt1937 + (local41 & 0x7);
				local51 = Static234.anInt4239 + local47;
				local55 = (local41 >> 4 & 0x7) + Static557.anInt9342;
				local59 = Static534.anInt8753 + local55;
				if (Static659.anInt7559 != local20) {
					@Pc(1253) boolean local1253 = local55 >= 0 && local47 >= 0 && Static491.anInt9856 > local55 && Static393.anInt6574 > local47;
					if (local1253 || Static257.method3734(Static566.anInt9416)) {
						Static429.method8198(local51, Static310.anInt5244, new Class6_Sub3(local26, local30), local59);
						if (local1253) {
							Static529.method8525(Static310.anInt5244, local55, local47);
						}
					}
				}
			} else if (arg0 == Static32.aClass159_2) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				@Pc(1292) boolean local1292 = (local20 & 0x80) != 0;
				local30 = Static557.anInt9342 + (local20 >> 3 & 0x7);
				local41 = Static105.anInt1937 + (local20 & 0x7);
				local47 = local30 + Static204.aClass6_Sub23_Sub1_1.method8391();
				local51 = local41 + Static204.aClass6_Sub23_Sub1_1.method8391();
				local55 = Static204.aClass6_Sub23_Sub1_1.method8395();
				local59 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local63 = Static204.aClass6_Sub23_Sub1_1.method8374() * 4;
				local80 = Static204.aClass6_Sub23_Sub1_1.method8374() * 4;
				local413 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local417 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local421 = Static204.aClass6_Sub23_Sub1_1.method8374();
				if (local421 == 255) {
					local421 = -1;
				}
				local438 = Static204.aClass6_Sub23_Sub1_1.method8363();
				if (local30 >= 0 && local41 >= 0 && Static491.anInt9856 > local30 && Static393.anInt6574 > local41 && local47 >= 0 && local51 >= 0 && local47 < Static491.anInt9856 && local51 < Static393.anInt6574 && local59 != 65535) {
					local41 = local41 * 512 + 256;
					local30 = local30 * 512 + 256;
					local80 <<= 0x2;
					local51 = local51 * 512 + 256;
					local47 = local47 * 512 + 256;
					local63 <<= 0x2;
					local438 <<= 0x2;
					@Pc(1458) Class2_Sub1_Sub1_Sub4 local1458 = new Class2_Sub1_Sub1_Sub4(local59, Static310.anInt5244, Static310.anInt5244, local30, local41, local63, Static90.anInt1698 + local413, Static90.anInt1698 + local417, local421, local438, 0, local55, local80, local1292, -1);
					local1458.method4948(local47, Static284.method4118(local47, Static310.anInt5244, local51) - local80, local51, Static90.anInt1698 + local413);
					Static205.aClass362_18.method8536(new Class6_Sub4_Sub14(local1458));
				}
			} else if (arg0 == Static385.aClass159_10) {
				Static204.aClass6_Sub23_Sub1_1.method8374();
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26 = (local20 >> 4 & 0x7) + Static557.anInt9342;
				local30 = (local20 & 0x7) + Static105.anInt1937;
				local41 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local47 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local51 = Static204.aClass6_Sub23_Sub1_1.method8344();
				@Pc(1522) String local1522 = Static204.aClass6_Sub23_Sub1_1.method8354();
				Static263.method3892(Static310.anInt5244, local26, local1522, local41, local30, local51, local47);
			} else if (arg0 == Static82.aClass159_5) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local26 = Static557.anInt9342 + (local20 >> 4 & 0x7);
				local30 = (local20 & 0x7) + Static105.anInt1937;
				local41 = Static204.aClass6_Sub23_Sub1_1.method8403();
				@Pc(1563) Class308 local1563 = Static411.aClass88_3.method2024(local41);
				local51 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local55 = local51 >> 2;
				local59 = Static472.anIntArray533[local55];
				if (local55 == 11) {
					local55 = 10;
				}
				local63 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local80 = 0;
				if (local1563.aByteArray91 != null) {
					local413 = -1;
					for (local417 = 0; local417 < local1563.aByteArray91.length; local417++) {
						if (local55 == local1563.aByteArray91[local417]) {
							local413 = local417;
							break;
						}
					}
					local80 = local1563.anIntArrayArray49[local413].length;
				}
				local413 = 0;
				if (local1563.aShortArray119 != null) {
					local413 = local1563.aShortArray119.length;
				}
				local417 = 0;
				if (local1563.aShortArray116 != null) {
					local417 = local1563.aShortArray116.length;
				}
				if ((local63 & 0x1) == 1) {
					Static52.method1005(local26, Static310.anInt5244, (Class18) null, local59, local30);
				} else {
					@Pc(1642) int[] local1642 = null;
					if ((local63 & 0x2) == 2) {
						local1642 = new int[local80];
						for (local438 = 0; local438 < local80; local438++) {
							local1642[local438] = Static204.aClass6_Sub23_Sub1_1.method8363();
						}
					}
					@Pc(1672) short[] local1672 = null;
					if ((local63 & 0x4) == 4) {
						local1672 = new short[local413];
						for (local442 = 0; local442 < local413; local442++) {
							local1672[local442] = (short) Static204.aClass6_Sub23_Sub1_1.method8363();
						}
					}
					@Pc(1703) short[] local1703 = null;
					if ((local63 & 0x8) == 8) {
						local1703 = new short[local417];
						for (local446 = 0; local446 < local417; local446++) {
							local1703[local446] = (short) Static204.aClass6_Sub23_Sub1_1.method8363();
						}
					}
					Static52.method1005(local26, Static310.anInt5244, new Class18((long) Static578.aLong279++, local1642, local1672, local1703), local59, local30);
				}
			} else if (arg0 == Static221.aClass159_7) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local26 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local30 = Static204.aClass6_Sub23_Sub1_1.method8337();
				local41 = Static105.anInt1937 + (local30 & 0x7);
				local47 = local41 + Static234.anInt4239;
				local51 = (local30 >> 4 & 0x7) + Static557.anInt9342;
				local55 = Static534.anInt8753 + local51;
				@Pc(1808) boolean local1808 = local51 >= 0 && local41 >= 0 && Static491.anInt9856 > local51 && Static393.anInt6574 > local41;
				if (local1808 || Static257.method3734(Static566.anInt9416)) {
					Static429.method8198(local47, Static310.anInt5244, new Class6_Sub3(local26, local20), local55);
					if (local1808) {
						Static529.method8525(Static310.anInt5244, local51, local41);
					}
				}
			} else if (arg0 == Static20.aClass159_1) {
				local20 = Static204.aClass6_Sub23_Sub1_1.method8363();
				local26 = Static204.aClass6_Sub23_Sub1_1.method8374();
				Static411.aClass88_3.method2024(local20).method7300(local26);
			} else {
				Static664.method9007((Throwable) null, "T3 - " + arg0);
				Static483.method7043(false);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method1894() {
		@Pc(1) Class10 local1 = Static569.aClass10_54;
		synchronized (Static569.aClass10_54) {
			Static569.aClass10_54.method380();
		}
		local1 = Static121.aClass10_7;
		synchronized (Static121.aClass10_7) {
			Static121.aClass10_7.method380();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIII)V")
	public static void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg0 == Static15.anInt438 && arg3 == Static310.anInt5242 && (Static253.anInt4353 == Static216.anInt3669 || Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 1)) {
			return;
		}
		Static15.anInt438 = arg0;
		Static216.anInt3669 = Static253.anInt4353;
		Static310.anInt5242 = arg3;
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 1) {
			Static216.anInt3669 = 0;
		}
		Static143.method2106(arg2);
		Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077));
		@Pc(62) int local62 = Static534.anInt8753;
		@Pc(64) int local64 = Static234.anInt4239;
		Static534.anInt8753 = (Static15.anInt438 - (Static491.anInt9856 >> 4)) * 8;
		Static234.anInt4239 = (Static310.anInt5242 - (Static393.anInt6574 >> 4)) * 8;
		Static488.aClass6_Sub4_Sub20_3 = Static528.method4543(Static15.anInt438 * 8, Static310.anInt5242 * 8);
		Static297.aClass17_1 = null;
		@Pc(102) int local102 = Static534.anInt8753 - local62;
		@Pc(107) int local107 = Static234.anInt4239 - local64;
		@Pc(112) int local112;
		@Pc(125) int local125;
		@Pc(245) int local245;
		@Pc(187) int local187;
		if (arg2 == 11) {
			for (local112 = 0; local112 < Static490.anInt8336; local112++) {
				@Pc(118) Class6_Sub44 local118 = Static84.aClass6_Sub44Array1[local112];
				if (local118 != null) {
					@Pc(123) Class2_Sub1_Sub1_Sub3_Sub2 local123 = local118.aClass2_Sub1_Sub1_Sub3_Sub2_2;
					for (local125 = 0; local125 < 10; local125++) {
						local123.anIntArray302[local125] -= local102;
						local123.anIntArray301[local125] -= local107;
					}
					local123.anInt10001 -= local107 * 512;
					local123.anInt10006 -= local102 * 512;
				}
			}
		} else {
			@Pc(173) boolean local173 = false;
			Static133.anInt2316 = 0;
			@Pc(181) int local181 = (Static491.anInt9856 - 1) * 512;
			local187 = (Static393.anInt6574 - 1) * 512;
			for (local125 = 0; local125 < Static490.anInt8336; local125++) {
				@Pc(195) Class6_Sub44 local195 = Static84.aClass6_Sub44Array1[local125];
				if (local195 != null) {
					@Pc(200) Class2_Sub1_Sub1_Sub3_Sub2 local200 = local195.aClass2_Sub1_Sub1_Sub3_Sub2_2;
					local200.anInt10006 -= local102 * 512;
					local200.anInt10001 -= local107 * 512;
					if (local200.anInt10006 >= 0 && local200.anInt10006 <= local181 && local200.anInt10001 >= 0 && local187 >= local200.anInt10001) {
						@Pc(243) boolean local243 = true;
						for (local245 = 0; local245 < 10; local245++) {
							local200.anIntArray302[local245] -= local102;
							local200.anIntArray301[local245] -= local107;
							if (local200.anIntArray302[local245] < 0 || Static491.anInt9856 <= local200.anIntArray302[local245] || local200.anIntArray301[local245] < 0 || Static393.anInt6574 <= local200.anIntArray301[local245]) {
								local243 = false;
							}
						}
						if (local243) {
							Static74.anIntArray80[Static133.anInt2316++] = local200.anInt5103;
						} else {
							local200.method4341((Class91) null);
							local173 = true;
							local195.method9174();
						}
					} else {
						local200.method4341((Class91) null);
						local173 = true;
						local195.method9174();
					}
				}
			}
			if (local173) {
				Static490.anInt8336 = Static349.aClass209_32.method5033();
				Static349.aClass209_32.method5032(Static84.aClass6_Sub44Array1);
			}
		}
		for (local112 = 0; local112 < 2048; local112++) {
			@Pc(356) Class2_Sub1_Sub1_Sub3_Sub1 local356 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local112];
			if (local356 != null) {
				for (local187 = 0; local187 < 10; local187++) {
					local356.anIntArray302[local187] -= local102;
					local356.anIntArray301[local187] -= local107;
				}
				local356.anInt10001 -= local107 * 512;
				local356.anInt10006 -= local102 * 512;
			}
		}
		@Pc(406) Class167[] local406 = Static539.aClass167Array1;
		for (local187 = 0; local187 < local406.length; local187++) {
			@Pc(414) Class167 local414 = local406[local187];
			if (local414 != null) {
				local414.anInt4344 -= local107 * 512;
				local414.anInt4348 -= local102 * 512;
			}
		}
		@Pc(442) Class6_Sub45 local442;
		for (local442 = (Class6_Sub45) Static464.aClass362_52.method8538(); local442 != null; local442 = (Class6_Sub45) Static464.aClass362_52.method8530()) {
			local442.anInt8113 -= local107;
			local442.anInt8112 -= local102;
			if (Static566.anInt9416 != 4 && (local442.anInt8112 < 0 || local442.anInt8113 < 0 || local442.anInt8112 >= Static491.anInt9856 || Static393.anInt6574 <= local442.anInt8113)) {
				local442.method9174();
			}
		}
		for (local442 = (Class6_Sub45) Static467.aClass362_53.method8538(); local442 != null; local442 = (Class6_Sub45) Static467.aClass362_53.method8530()) {
			local442.anInt8113 -= local107;
			local442.anInt8112 -= local102;
			if (Static566.anInt9416 != 4 && (local442.anInt8112 < 0 || local442.anInt8113 < 0 || Static491.anInt9856 <= local442.anInt8112 || local442.anInt8113 >= Static393.anInt6574)) {
				local442.method9174();
			}
		}
		if (Static566.anInt9416 != 4) {
			for (@Pc(551) Class6_Sub52 local551 = (Class6_Sub52) Static33.aClass209_3.method5037(); local551 != null; local551 = (Class6_Sub52) Static33.aClass209_3.method5036()) {
				@Pc(559) int local559 = (int) (local551.aLong314 & 0x3FFFL);
				@Pc(563) int local563 = local559 - Static534.anInt8753;
				local245 = (int) (local551.aLong314 >> 14 & 0x3FFFL);
				@Pc(576) int local576 = local245 - Static234.anInt4239;
				if (local563 < 0 || local576 < 0 || Static491.anInt9856 <= local563 || local576 >= Static393.anInt6574) {
					local551.method9174();
				}
			}
		}
		if (Static566.anInt9418 != 0) {
			Static508.anInt9992 -= local107;
			Static566.anInt9418 -= local102;
		}
		Static159.method2242();
		if (arg2 != 11) {
			Static542.anInt9140 -= local107 * 512;
			Static667.anInt10667 -= local102;
			Static250.anInt4333 -= local102;
			Static23.anInt564 -= local102 * 512;
			Static6.anInt223 -= local107;
			Static400.anInt6733 -= local107;
			if (Math.abs(local102) > Static491.anInt9856 || Math.abs(local107) > Static393.anInt6574) {
				Static139.method2087();
			}
		} else if (Static407.anInt6820 == 4) {
			Static555.anInt9303 -= local102 * 512;
			Static162.anInt2757 -= local102 * 512;
			Static674.anInt9799 -= local107 * 512;
			Static502.anInt8454 -= local107 * 512;
		} else {
			Static258.anInt4491 = -1;
			Static601.anInt9806 = -1;
			Static407.anInt6820 = 1;
		}
		Static615.method8501();
		Static187.method2662();
		Static129.aClass362_11.method8543();
		Static205.aClass362_18.method8543();
		Static214.aClass43_7.method1089();
		Static577.method8016();
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method1896() {
		Static507.method7241(false);
		Static604.anInt4517 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static402.aByteArrayArray18.length; local14++) {
			if (Static381.anIntArray516[local14] != -1 && Static402.aByteArrayArray18[local14] == null) {
				Static402.aByteArrayArray18[local14] = Static187.aClass8_56.method262(0, Static381.anIntArray516[local14]);
				if (Static402.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static604.anInt4517++;
				}
			}
			if (Static280.anIntArray274[local14] != -1 && Static339.aByteArrayArray15[local14] == null) {
				Static339.aByteArrayArray15[local14] = Static187.aClass8_56.method261(Static280.anIntArray274[local14], Static66.anIntArrayArray6[local14], 0);
				if (Static339.aByteArrayArray15[local14] == null) {
					Static604.anInt4517++;
					local12 = false;
				}
			}
			if (Static310.anIntArray310[local14] != -1 && Static588.aByteArrayArray27[local14] == null) {
				Static588.aByteArrayArray27[local14] = Static187.aClass8_56.method262(0, Static310.anIntArray310[local14]);
				if (Static588.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static604.anInt4517++;
				}
			}
			if (Static205.anIntArray198[local14] != -1 && Static43.aByteArrayArray6[local14] == null) {
				Static43.aByteArrayArray6[local14] = Static187.aClass8_56.method262(0, Static205.anIntArray198[local14]);
				if (Static43.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static604.anInt4517++;
				}
			}
			if (Static200.anIntArray192 != null && Static137.aByteArrayArray8[local14] == null && Static200.anIntArray192[local14] != -1) {
				Static137.aByteArrayArray8[local14] = Static187.aClass8_56.method261(Static200.anIntArray192[local14], Static66.anIntArrayArray6[local14], 0);
				if (Static137.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static604.anInt4517++;
				}
			}
		}
		if (Static297.aClass17_1 == null) {
			if (Static488.aClass6_Sub4_Sub20_3 == null || !Static663.aClass8_136.method258(Static488.aClass6_Sub4_Sub20_3.aString152 + "_staticelements")) {
				Static297.aClass17_1 = new Class17(0);
			} else if (Static663.aClass8_136.method250(Static488.aClass6_Sub4_Sub20_3.aString152 + "_staticelements")) {
				Static297.aClass17_1 = Static669.method9074(Static663.aClass8_136, Static618.aBoolean707, Static488.aClass6_Sub4_Sub20_3.aString152 + "_staticelements");
			} else {
				Static604.anInt4517++;
				local12 = false;
			}
		}
		if (!local12) {
			Static180.anInt9944 = 1;
			return;
		}
		Static104.anInt1932 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(280) int local280;
		for (@Pc(251) int local251 = 0; local251 < Static402.aByteArrayArray18.length; local251++) {
			@Pc(257) byte[] local257 = Static339.aByteArrayArray15[local251];
			if (local257 != null) {
				local270 = (Static300.anIntArray289[local251] >> 8) * 64 - Static534.anInt8753;
				local280 = (Static300.anIntArray289[local251] & 0xFF) * 64 - Static234.anInt4239;
				if (Static566.anInt9416 != 0) {
					local270 = 10;
					local280 = 10;
				}
				local12 &= Static310.method4427(local270, Static491.anInt9856, local280, Static393.anInt6574, local257);
			}
			local257 = Static43.aByteArrayArray6[local251];
			if (local257 != null) {
				local270 = (Static300.anIntArray289[local251] >> 8) * 64 - Static534.anInt8753;
				local280 = (Static300.anIntArray289[local251] & 0xFF) * 64 - Static234.anInt4239;
				if (Static566.anInt9416 != 0) {
					local280 = 10;
					local270 = 10;
				}
				local12 &= Static310.method4427(local270, Static491.anInt9856, local280, Static393.anInt6574, local257);
			}
		}
		if (!local12) {
			Static180.anInt9944 = 2;
			return;
		}
		if (Static180.anInt9944 != 0) {
			Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_12.method1007(Static616.anInt10077) + "<br>(100%)");
		}
		Static35.method857();
		Static274.method4045();
		Static165.method2355();
		@Pc(389) boolean local389 = false;
		if (Static546.aClass132_13.method7503() && Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8119() == 2) {
			for (local270 = 0; local270 < Static402.aByteArrayArray18.length; local270++) {
				if (Static43.aByteArrayArray6[local270] != null || Static588.aByteArrayArray27[local270] != null) {
					local389 = true;
					break;
				}
			}
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub15_1.method5422() == 1) {
			local270 = Static2.anIntArray660[Static353.anInt6020];
		} else {
			local270 = Static93.anIntArray461[Static353.anInt6020];
		}
		if (Static546.aClass132_13.method7495()) {
			local270++;
		}
		Static253.method3647(Static546.aClass132_13, Static606.anInt9846, Static491.anInt9856, Static393.anInt6574, local270, local389, Static546.aClass132_13.method7511() > 0);
		Static404.method4331(Static645.anInt10423);
		if (Static645.anInt10423 == 0) {
			Static612.method8435((Class19) null);
		} else {
			Static612.method8435(Static494.aClass19_12);
		}
		for (local280 = 0; local280 < 4; local280++) {
			Static83.aClass324Array1[local280].method7775();
		}
		Static354.method5133();
		Static667.method9048(false);
		Static23.method580();
		Static56.aBoolean59 = false;
		Static312.aClass93_2 = null;
		Static35.method857();
		System.gc();
		Static507.method7241(true);
		Static470.method6931();
		Static306.anInt5215 = Static96.aClass6_Sub22_7.aClass29_Sub13_1.method4428();
		Static308.aBoolean337 = Static549.anInt9246 >= 96;
		Static455.aBoolean507 = Static96.aClass6_Sub22_7.aClass29_Sub25_1.method8119() == 2;
		Static513.aBoolean591 = Static96.aClass6_Sub22_7.aClass29_Sub21_1.method6967() == 1;
		Static220.anInt3743 = Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 1 ? -1 : Static216.anInt3669;
		Static588.aBoolean688 = Static96.aClass6_Sub22_7.aClass29_Sub27_1.method8554() == 1;
		Static243.aBoolean269 = Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4082() == 1;
		Static577.aClass310_Sub1_2 = new Class310_Sub1(4, Static491.anInt9856, Static393.anInt6574, false);
		if (Static566.anInt9416 == 0) {
			Static266.method3972(Static402.aByteArrayArray18, Static577.aClass310_Sub1_2);
		} else {
			Static121.method1889(Static402.aByteArrayArray18, Static577.aClass310_Sub1_2);
		}
		Static249.method3627(Static393.anInt6574 >> 4, Static491.anInt9856 >> 4);
		Static355.method5138();
		if (local389) {
			Static546.method7770(true);
			Static56.aClass310_Sub1_1 = new Class310_Sub1(1, Static491.anInt9856, Static393.anInt6574, true);
			if (Static566.anInt9416 == 0) {
				Static266.method3972(Static588.aByteArrayArray27, Static56.aClass310_Sub1_1);
				Static507.method7241(true);
			} else {
				Static121.method1889(Static588.aByteArrayArray27, Static56.aClass310_Sub1_1);
				Static507.method7241(true);
			}
			Static56.aClass310_Sub1_1.method7911(Static577.aClass310_Sub1_2.anIntArrayArrayArray20[0]);
			Static56.aClass310_Sub1_1.method7916((int[][][]) null, Static546.aClass132_13, (Class324[]) null);
			Static546.method7770(false);
		}
		Static577.aClass310_Sub1_2.method7916(local389 ? Static56.aClass310_Sub1_1.anIntArrayArrayArray20 : null, Static546.aClass132_13, Static83.aClass324Array1);
		if (Static566.anInt9416 == 0) {
			Static507.method7241(true);
			Static440.method6452(Static339.aByteArrayArray15, Static577.aClass310_Sub1_2);
			if (Static137.aByteArrayArray8 != null) {
				Static287.method4140();
			}
		} else {
			Static507.method7241(true);
			Static394.method5590(Static339.aByteArrayArray15, Static577.aClass310_Sub1_2);
		}
		Static274.method4045();
		if (Static549.anInt9246 < 96) {
			Static129.method1975();
		}
		Static507.method7241(true);
		Static577.aClass310_Sub1_2.method7919(local389 ? Static68.aClass12Array2[0] : null, (Class12) null, Static546.aClass132_13);
		Static577.aClass310_Sub1_2.method7934(Static546.aClass132_13, false);
		Static507.method7241(true);
		if (local389) {
			Static546.method7770(true);
			Static507.method7241(true);
			if (Static566.anInt9416 == 0) {
				Static440.method6452(Static43.aByteArrayArray6, Static56.aClass310_Sub1_1);
			} else {
				Static394.method5590(Static43.aByteArrayArray6, Static56.aClass310_Sub1_1);
			}
			Static274.method4045();
			Static507.method7241(true);
			Static56.aClass310_Sub1_1.method7919((Class12) null, Static64.aClass12Array1[0], Static546.aClass132_13);
			Static56.aClass310_Sub1_1.method7934(Static546.aClass132_13, true);
			Static507.method7241(true);
			Static546.method7770(false);
		}
		Static657.method8944();
		@Pc(766) int local766 = Static577.aClass310_Sub1_2.anInt9408;
		if (local766 > Static253.anInt4353) {
			local766 = Static253.anInt4353;
		}
		if (local766 < Static253.anInt4353 - 1) {
			local766 = Static253.anInt4353 - 1;
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0) {
			Static20.method479(local766);
		} else {
			Static20.method479(0);
		}
		@Pc(804) int local804;
		@Pc(808) int local808;
		for (@Pc(800) int local800 = 0; local800 < 4; local800++) {
			for (local804 = 0; local804 < Static491.anInt9856; local804++) {
				for (local808 = 0; local808 < Static393.anInt6574; local808++) {
					Static529.method8525(local800, local804, local808);
				}
			}
		}
		Static369.method5323();
		Static35.method857();
		Static148.method2139();
		Static274.method4045();
		Static154.method2170();
		@Pc(859) Class6_Sub26 local859;
		if (Static293.aFrame3 != null && Static163.aClass170_1 != null && Static556.anInt9319 == 11) {
			local859 = Static268.method3981(Static377.aClass15_2, Static250.aClass289_61);
			local859.aClass6_Sub23_Sub1_2.method8364(1057001181);
			Static670.method9077(local859);
		}
		if (Static566.anInt9416 == 0) {
			local804 = (Static15.anInt438 - (Static491.anInt9856 >> 4)) / 8;
			local808 = ((Static491.anInt9856 >> 4) + Static15.anInt438) / 8;
			@Pc(898) int local898 = (Static310.anInt5242 - (Static393.anInt6574 >> 4)) / 8;
			@Pc(907) int local907 = (Static310.anInt5242 + (Static393.anInt6574 >> 4)) / 8;
			for (@Pc(911) int local911 = local804 - 1; local911 <= local808 + 1; local911++) {
				for (@Pc(917) int local917 = local898 - 1; local917 <= local907 + 1; local917++) {
					if (local804 > local911 || local911 > local808 || local917 < local898 || local907 < local917) {
						Static187.aClass8_56.method271("m" + local911 + "_" + local917);
						Static187.aClass8_56.method271("l" + local911 + "_" + local917);
					}
				}
			}
		}
		if (Static556.anInt9319 == 4) {
			Static143.method2106(3);
		} else if (Static556.anInt9319 == 8) {
			Static143.method2106(7);
		} else {
			Static143.method2106(10);
			if (Static163.aClass170_1 != null) {
				local859 = Static268.method3981(Static377.aClass15_2, Static159.aClass289_48);
				Static670.method9077(local859);
			}
		}
		Static309.method2011();
		Static35.method857();
		Static378.method6991();
		Static119.aBoolean126 = true;
		if (Static588.aBoolean689) {
			Static67.method1187("Took: " + (Static566.method7936() - Static538.aLong66) + "ms");
			Static588.aBoolean689 = false;
		}
	}
}
