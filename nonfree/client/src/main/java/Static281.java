import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[IIIIIII)V")
	public static void method4444(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static422.method6062(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static422.method6062(arg4)) {
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg4 <= arg2 ? arg4 : arg2;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(61) int local61 = arg4 >> 1;
			@Pc(63) int[] local63 = arg0;
			@Pc(68) int[] local68 = new int[local57 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local42, arg3, arg2, arg4, 0, 32993, arg5, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(86) int local86 = 0;
				@Pc(88) int local88 = 0;
				@Pc(92) int local92 = arg2;
				for (@Pc(94) int local94 = 0; local94 < local61; local94++) {
					for (@Pc(98) int local98 = 0; local98 < local57; local98++) {
						@Pc(105) int local105 = local63[local88++];
						@Pc(110) int local110 = local63[local92++];
						@Pc(115) int local115 = local63[local88++];
						@Pc(121) int local121 = local105 >> 24 & 0xFF;
						@Pc(125) int local125 = local105 & 0xFF;
						@Pc(130) int local130 = local63[local92++];
						@Pc(136) int local136 = local105 >> 16 & 0xFF;
						@Pc(142) int local142 = local105 >> 8 & 0xFF;
						@Pc(150) int local150 = local142 + (local115 >> 8 & 0xFF);
						@Pc(156) int local156 = local125 + (local115 & 0xFF);
						@Pc(164) int local164 = local121 + (local115 >> 24 & 0xFF);
						@Pc(172) int local172 = local136 + (local115 >> 16 & 0xFF);
						@Pc(180) int local180 = local172 + (local110 >> 16 & 0xFF);
						@Pc(186) int local186 = local156 + (local110 & 0xFF);
						@Pc(194) int local194 = local150 + (local110 >> 8 & 0xFF);
						@Pc(202) int local202 = local164 + (local110 >> 24 & 0xFF);
						@Pc(210) int local210 = local202 + (local130 >> 24 & 0xFF);
						@Pc(216) int local216 = local186 + (local130 & 0xFF);
						@Pc(224) int local224 = local180 + (local130 >> 16 & 0xFF);
						@Pc(232) int local232 = local194 + (local130 >> 8 & 0xFF);
						local68[local86++] = (local232 & 0x3FC) << 6 | (local210 & 0x3FC) << 22 | (local224 & 0x3FC) << 14 | local216 >> 2 & 0xFF;
					}
					local88 += arg2;
					local92 += arg2;
				}
				@Pc(285) int[] local285 = local68;
				local68 = local63;
				arg2 = local57;
				arg4 = local61;
				local63 = local285;
				local42++;
				local61 >>= 0x1;
				local53 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!oa;Lclient!e;)V")
	public static void method4445(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static392.aClass4_Sub7_Sub13_2 == null) {
			return;
		}
		if (Static355.anInt6196 < 10) {
			if (!Static392.aClass31_107.method652(Static392.aClass4_Sub7_Sub13_2.aString76)) {
				Static355.anInt6196 = Static376.aClass31_82.method676(Static392.aClass4_Sub7_Sub13_2.aString76) / 10;
				return;
			}
			Static27.method497();
			Static355.anInt6196 = 10;
		}
		if (Static355.anInt6196 == 10) {
			Static392.anInt8797 = Static392.aClass4_Sub7_Sub13_2.anInt6626 >> 6 << 6;
			Static392.anInt8804 = Static392.aClass4_Sub7_Sub13_2.anInt6625 >> 6 << 6;
			Static392.anInt8803 = (Static392.aClass4_Sub7_Sub13_2.anInt6619 >> 6 << 6) + 64 - Static392.anInt8804;
			Static392.anInt8795 = (Static392.aClass4_Sub7_Sub13_2.anInt6630 >> 6 << 6) - (Static392.anInt8797 - 64);
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static392.aClass4_Sub7_Sub13_2.method5528(Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101, (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 >> 9) + Static373.anInt6695, local73, Static6.anInt97 + (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 >> 9))) {
				local75 = local73[1] - Static392.anInt8797;
				local77 = local73[2] - Static392.anInt8804;
			}
			if (!Static146.aBoolean259 && local75 >= 0 && Static392.anInt8795 > local75 && local77 >= 0 && local77 < Static392.anInt8803) {
				local75 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static470.anInt7923 = local77;
				Static397.anInt6936 = local75;
			} else if (Static74.anInt1562 == -1 || Static303.anInt5528 == -1) {
				Static392.aClass4_Sub7_Sub13_2.method5526(Static392.aClass4_Sub7_Sub13_2.anInt6623 & 0x3FFF, Static392.aClass4_Sub7_Sub13_2.anInt6623 >> 14 & 0x3FFF, local73);
				Static470.anInt7923 = local73[2] - Static392.anInt8804;
				Static397.anInt6936 = local73[1] - Static392.anInt8797;
			} else {
				Static392.aClass4_Sub7_Sub13_2.method5526(Static303.anInt5528, Static74.anInt1562, local73);
				Static303.anInt5528 = -1;
				Static74.anInt1562 = -1;
				if (local73 != null) {
					Static470.anInt7923 = local73[2] - Static392.anInt8804;
					Static397.anInt6936 = local73[1] - Static392.anInt8797;
				}
				Static146.aBoolean259 = false;
			}
			if (Static392.aClass4_Sub7_Sub13_2.anInt6627 == 37) {
				Static392.aFloat188 = 3.0F;
				Static392.aFloat187 = 3.0F;
			} else if (Static392.aClass4_Sub7_Sub13_2.anInt6627 == 50) {
				Static392.aFloat188 = 4.0F;
				Static392.aFloat187 = 4.0F;
			} else if (Static392.aClass4_Sub7_Sub13_2.anInt6627 == 75) {
				Static392.aFloat188 = 6.0F;
				Static392.aFloat187 = 6.0F;
			} else if (Static392.aClass4_Sub7_Sub13_2.anInt6627 == 100) {
				Static392.aFloat188 = 8.0F;
				Static392.aFloat187 = 8.0F;
			} else if (Static392.aClass4_Sub7_Sub13_2.anInt6627 == 200) {
				Static392.aFloat188 = 16.0F;
				Static392.aFloat187 = 16.0F;
			} else {
				Static392.aFloat188 = 8.0F;
				Static392.aFloat187 = 8.0F;
			}
			Static392.anInt8790 = (int) Static392.aFloat188 >> 1;
			Static392.aByteArrayArrayArray20 = Static475.method6604(Static392.anInt8790);
			Static575.method7836();
			Static392.method7234();
			Static457.aClass124_51 = new Class124();
			Static392.anInt8791 += (int) (Math.random() * 5.0D) - 2;
			if (Static392.anInt8791 < -8) {
				Static392.anInt8791 = -8;
			}
			Static392.anInt8792 += (int) (Math.random() * 5.0D) - 2;
			if (Static392.anInt8791 > 8) {
				Static392.anInt8791 = 8;
			}
			if (Static392.anInt8792 < -16) {
				Static392.anInt8792 = -16;
			}
			if (Static392.anInt8792 > 16) {
				Static392.anInt8792 = 16;
			}
			Static392.method7243(arg1, Static392.anInt8791 >> 2 << 10, Static392.anInt8792 >> 1);
			Static392.aClass337_4.method7445(256, 1024);
			Static392.aClass190_4.method4348(256, 256);
			Static392.aClass288_3.method6420(4096);
			Static538.aClass101_1.method2823(256);
			Static355.anInt6196 = 20;
		} else if (Static355.anInt6196 == 20) {
			Static31.method559(true);
			Static392.method7236(arg0, Static392.anInt8791, Static392.anInt8792);
			Static355.anInt6196 = 60;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 60) {
			if (Static392.aClass31_107.method669(Static392.aClass4_Sub7_Sub13_2.aString76 + "_staticelements")) {
				if (!Static392.aClass31_107.method652(Static392.aClass4_Sub7_Sub13_2.aString76 + "_staticelements")) {
					return;
				}
				Static392.aClass67_3 = Static478.method6641(Static392.aClass4_Sub7_Sub13_2.aString76 + "_staticelements", Static392.aClass31_107, Static148.aBoolean511);
			} else {
				Static392.aClass67_3 = new Class67(0);
			}
			Static392.method7228();
			Static355.anInt6196 = 70;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 70) {
			Static142.aClass189_4 = new Class189(arg0, 11, true, Static379.aCanvas13);
			Static355.anInt6196 = 73;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 73) {
			Static300.aClass189_6 = new Class189(arg0, 12, true, Static379.aCanvas13);
			Static355.anInt6196 = 76;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 76) {
			Static40.aClass189_1 = new Class189(arg0, 14, true, Static379.aCanvas13);
			Static355.anInt6196 = 79;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 79) {
			Static533.aClass189_9 = new Class189(arg0, 17, true, Static379.aCanvas13);
			Static355.anInt6196 = 82;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 82) {
			Static382.aClass189_7 = new Class189(arg0, 19, true, Static379.aCanvas13);
			Static355.anInt6196 = 85;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 85) {
			Static112.aClass189_3 = new Class189(arg0, 22, true, Static379.aCanvas13);
			Static355.anInt6196 = 88;
			Static31.method559(true);
			Static437.method6207();
		} else if (Static355.anInt6196 == 88) {
			Static74.aClass189_2 = new Class189(arg0, 26, true, Static379.aCanvas13);
			Static355.anInt6196 = 91;
			Static31.method559(true);
			Static437.method6207();
		} else {
			Static413.aClass189_8 = new Class189(arg0, 30, true, Static379.aCanvas13);
			Static355.anInt6196 = 100;
			Static31.method559(true);
			Static437.method6207();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!qi;III)J")
	public static long method4446(@OriginalArg(0) Interface17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) long local12 = 4194304L;
		@Pc(14) long local14 = 2147483648L;
		@Pc(16) long local16 = Long.MIN_VALUE;
		@Pc(23) Class25 local23 = Static553.aClass288_4.method6419(arg0.method7743());
		@Pc(44) long local44 = (long) (arg0.method7742() << 14 | arg1 | arg2 << 7 | arg0.method7744() << 20 | 0x40000000);
		if (local23.anInt599 == 0) {
			local44 |= local16;
		}
		if (local23.anInt602 == 1) {
			local44 |= local12;
		}
		if (local23.aBoolean51) {
			local44 |= local14;
		}
		return local44 | (long) arg0.method7743() << 32;
	}
}
