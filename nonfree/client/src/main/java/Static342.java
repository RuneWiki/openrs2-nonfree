import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public static int anInt6490;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	public static int anInt6494 = 0;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[128][128];

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "Z")
	public static boolean aBoolean471 = true;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
	public static final int[] anIntArray827 = new int[13];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)Z")
	public static boolean method5546(@OriginalArg(1) int arg0) {
		if (arg0 == 46 || arg0 == 8 || arg0 == 45 || arg0 == 44 || arg0 == 24) {
			return true;
		} else if (arg0 == 26 || arg0 == 47 || arg0 == 1004) {
			return true;
		} else if (arg0 == 10 || arg0 == 13 || arg0 == 49 || arg0 == 5 || arg0 == 16) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 58 || arg0 == 1006 || arg0 == 31;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
	public static void method5548() {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(80) int local80;
		@Pc(163) Class22_Sub2_Sub4 local163;
		if (Static127.anInt2797 == 120) {
			local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local22 = Static13.anInt265 * 2 + (local12 >> 4 & 0xF);
			local30 = (local12 & 0xF) + Static305.anInt5838 * 2;
			local36 = Static200.aClass7_Sub3_Sub2_3.method2779() + local22;
			local42 = Static200.aClass7_Sub3_Sub2_3.method2779() + local30;
			local46 = Static200.aClass7_Sub3_Sub2_3.method2744();
			local50 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local56 = Static200.aClass7_Sub3_Sub2_3.method2772() * 4;
			local62 = Static200.aClass7_Sub3_Sub2_3.method2772() * 4;
			local66 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local72 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local76 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local80 = Static200.aClass7_Sub3_Sub2_3.method2772();
			if (local76 == 255) {
				local76 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < 208 && local30 < 208 && local36 >= 0 && local42 >= 0 && local36 < 208 && local42 < 208 && local50 != 65535) {
				local42 = local42 * 64;
				local36 *= 64;
				local22 = local22 * 64;
				local30 *= 64;
				local163 = new Class22_Sub2_Sub4(local50, Static168.anInt3508, local22, local30, Static341.method5540(Static168.anInt3508, local30, local22) - local56, local66 + Static212.anInt4234, local72 + Static212.anInt4234, local76, local80, local46, local62);
				local163.method4720(Static341.method5540(Static168.anInt3508, local42, local36) - local62, local66 + Static212.anInt4234, local42, local36);
				Static192.aClass74_29.method1802(new Class7_Sub1_Sub13(local163));
			}
		} else if (Static127.anInt2797 == 142) {
			local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local22 = (local12 >> 4 & 0xF) + Static13.anInt265 * 2;
			local30 = (local12 & 0xF) + Static305.anInt5838 * 2;
			local36 = Static200.aClass7_Sub3_Sub2_3.method2779() + local22;
			local42 = local30 + Static200.aClass7_Sub3_Sub2_3.method2779();
			local46 = Static200.aClass7_Sub3_Sub2_3.method2744();
			local50 = Static200.aClass7_Sub3_Sub2_3.method2744();
			local56 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local62 = Static200.aClass7_Sub3_Sub2_3.method2779();
			local66 = Static200.aClass7_Sub3_Sub2_3.method2772() * 4;
			local72 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local76 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local80 = Static200.aClass7_Sub3_Sub2_3.method2772();
			@Pc(262) int local262 = Static200.aClass7_Sub3_Sub2_3.method2772();
			if (local80 == 255) {
				local80 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < 208 && local30 < 208 && local36 >= 0 && local42 >= 0 && local36 < 208 && local42 < 208 && local56 != 65535) {
				local36 *= 64;
				local22 = local22 * 64;
				local30 = local30 * 64;
				local42 *= 64;
				if (local46 != 0) {
					@Pc(337) int local337;
					@Pc(341) Class22_Sub2_Sub1 local341;
					@Pc(327) int local327;
					@Pc(331) int local331;
					if (local46 >= 0) {
						local327 = local46 - 1;
						local331 = local327 & 0x7FF;
						local337 = local327 >> 11 & 0xF;
						local341 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local331];
					} else {
						local327 = -local46 - 1;
						local337 = local327 >> 11 & 0xF;
						local331 = local327 & 0x7FF;
						if (Static4.anInt77 == local331) {
							local341 = Static252.aClass22_Sub2_Sub1_Sub1_4;
						} else {
							local341 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local331];
						}
					}
					if (local341 != null) {
						@Pc(377) Class79 local377 = local341.method4417();
						if (local377.anIntArrayArray21 != null && local377.anIntArrayArray21[local337] != null) {
							local331 = local377.anIntArrayArray21[local337][0];
							@Pc(399) int local399 = local377.anIntArrayArray21[local337][2];
							@Pc(406) int local406 = local341.aClass54_7.method1294();
							@Pc(410) int local410 = Class147.anIntArray604[local406];
							@Pc(414) int local414 = Class147.anIntArray603[local406];
							@Pc(424) int local424 = local410 * local399 + local331 * local414 >> 15;
							@Pc(435) int local435 = local399 * local414 - local331 * local410 >> 15;
							local62 -= local377.anIntArrayArray21[local337][1];
							local22 += local424;
							local30 += local435;
						}
					}
				}
				@Pc(480) Class22_Sub2_Sub4 local480 = new Class22_Sub2_Sub4(local56, Static168.anInt3508, local22, local30, Static341.method5540(Static168.anInt3508, local30, local22) - local62, Static212.anInt4234 + local72, local76 + Static212.anInt4234, local80, local262, local50, local66);
				local480.method4720(Static341.method5540(Static168.anInt3508, local42, local36) - local66, local72 + Static212.anInt4234, local42, local36);
				Static192.aClass74_29.method1802(new Class7_Sub1_Sub13(local480));
			}
		} else if (Static127.anInt2797 == 239) {
			local12 = Static200.aClass7_Sub3_Sub2_3.method2740();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local36 = Static191.anIntArray521[local22];
			local42 = Static200.aClass7_Sub3_Sub2_3.method2763();
			local46 = Static13.anInt265 + (local42 >> 4 & 0x7);
			local50 = (local42 & 0x7) + Static305.anInt5838;
			if (local46 >= 0 && local50 >= 0 && local46 < Static15.anInt287 && local50 < Static325.anInt6173) {
				Static334.method5306(0, local36, Static168.anInt3508, local30, -1, local46, local50, -1, local22);
			}
		} else if (Static127.anInt2797 == 145) {
			local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local22 = Static13.anInt265 + (local12 >> 4 & 0x7);
			local30 = (local12 & 0x7) + Static305.anInt5838;
			local36 = Static200.aClass7_Sub3_Sub2_3.method2764();
			if (local36 == 65535) {
				local36 = -1;
			}
			local42 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local46 = local42 >> 4 & 0xF;
			local50 = local42 & 0x7;
			local56 = Static200.aClass7_Sub3_Sub2_3.method2772();
			local62 = Static200.aClass7_Sub3_Sub2_3.method2772();
			if (local22 >= 0 && local30 >= 0 && Static15.anInt287 > local22 && Static325.anInt6173 > local30) {
				local66 = local46 + 1;
				if (Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] >= local22 - local66 && local66 + local22 >= Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] && Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] >= local30 - local66 && Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] <= local30 + local66 && Static165.anInt3445 != 0 && local50 > 0 && Static235.anInt4675 < 50 && local36 != -1) {
					Static51.anIntArray205[Static235.anInt4675] = local36;
					Static23.anIntArray726[Static235.anInt4675] = local50;
					Static32.anIntArray133[Static235.anInt4675] = local56;
					Static105.aClass68Array3[Static235.anInt4675] = null;
					Static138.anIntArray397[Static235.anInt4675] = local46 + (local22 << 16) + (local30 << 8);
					Static105.anIntArray754[Static235.anInt4675] = local62;
					Static235.anInt4675++;
				}
			}
		} else if (Static127.anInt2797 == 212) {
			local12 = Static200.aClass7_Sub3_Sub2_3.method2763();
			local22 = (local12 >> 4 & 0x7) + Static13.anInt265;
			local30 = (local12 & 0x7) + Static305.anInt5838;
			local36 = Static200.aClass7_Sub3_Sub2_3.method2739();
			local42 = Static200.aClass7_Sub3_Sub2_3.method2784();
			local46 = Static200.aClass7_Sub3_Sub2_3.method2739();
			if (local22 >= 0 && local30 >= 0 && Static15.anInt287 > local22 && Static325.anInt6173 > local30 && local46 != Static4.anInt77) {
				Static346.method5571(local30, new Class7_Sub5(local42, local36), local22, Static168.anInt3508);
				Static154.method2995(local30, Static168.anInt3508, local22);
			}
		} else {
			if (Static127.anInt2797 == 121) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local22 = Static200.aClass7_Sub3_Sub2_3.method2740();
				local30 = (local22 >> 4 & 0x7) + Static13.anInt265;
				local36 = (local22 & 0x7) + Static305.anInt5838;
				@Pc(851) byte local851 = Static200.aClass7_Sub3_Sub2_3.method2757();
				local46 = Static200.aClass7_Sub3_Sub2_3.method2755();
				local50 = Static200.aClass7_Sub3_Sub2_3.method2764();
				@Pc(865) byte local865 = Static200.aClass7_Sub3_Sub2_3.method2757();
				local62 = Static200.aClass7_Sub3_Sub2_3.method2736();
				local66 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local72 = local66 >> 2;
				local76 = local66 & 0x3;
				@Pc(887) byte local887 = Static200.aClass7_Sub3_Sub2_3.method2774();
				@Pc(891) byte local891 = Static200.aClass7_Sub3_Sub2_3.method2757();
				if (!Static128.aClass89_3.method5393()) {
					Static346.method5568(local76, local891, local46, local12, local62, local887, local30, local50, local72, local851, local36, local865);
				}
			}
			if (Static127.anInt2797 == 8) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local22 = (local12 >> 4 & 0x7) + Static13.anInt265;
				local30 = (local12 & 0x7) + Static305.anInt5838;
				local36 = Static200.aClass7_Sub3_Sub2_3.method2779() + local22;
				local42 = Static200.aClass7_Sub3_Sub2_3.method2779() + local30;
				local46 = Static200.aClass7_Sub3_Sub2_3.method2744();
				local50 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local56 = Static200.aClass7_Sub3_Sub2_3.method2772() * 4;
				local62 = Static200.aClass7_Sub3_Sub2_3.method2772() * 4;
				local66 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local72 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local76 = Static200.aClass7_Sub3_Sub2_3.method2772();
				if (local76 == 255) {
					local76 = -1;
				}
				local80 = Static200.aClass7_Sub3_Sub2_3.method2772();
				if (local22 >= 0 && local30 >= 0 && local22 < Static15.anInt287 && local30 < Static325.anInt6173 && local36 >= 0 && local42 >= 0 && local36 < Static15.anInt287 && Static325.anInt6173 > local42 && local50 != 65535) {
					local42 = local42 * 128 + 64;
					local36 = local36 * 128 + 64;
					local22 = local22 * 128 + 64;
					local30 = local30 * 128 + 64;
					local163 = new Class22_Sub2_Sub4(local50, Static168.anInt3508, local22, local30, Static341.method5540(Static168.anInt3508, local30, local22) - local56, Static212.anInt4234 + local66, local72 + Static212.anInt4234, local76, local80, local46, local62);
					local163.method4720(Static341.method5540(Static168.anInt3508, local42, local36) - local62, Static212.anInt4234 + local66, local42, local36);
					Static192.aClass74_29.method1802(new Class7_Sub1_Sub13(local163));
				}
			} else if (Static127.anInt2797 == 135) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local22 = (local12 >> 4 & 0x7) + Static13.anInt265;
				local30 = (local12 & 0x7) + Static305.anInt5838;
				local36 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local42 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local46 = Static200.aClass7_Sub3_Sub2_3.method2764();
				if (local22 >= 0 && local30 >= 0 && Static15.anInt287 > local22 && Static325.anInt6173 > local30) {
					local50 = local22 * 128 + 64;
					local56 = local30 * 128 + 64;
					@Pc(1188) Class22_Sub2_Sub2 local1188 = new Class22_Sub2_Sub2(local36, local46, Static212.anInt4234, Static168.anInt3508, local50, Static341.method5540(Static168.anInt3508, local56, local50) - local42, local56, local22, local22, local30, local30);
					Static338.aClass74_36.method1802(new Class7_Sub1_Sub17(local1188));
				}
			} else if (Static127.anInt2797 == 139) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local22 = Static13.anInt265 + (local12 >> 4 & 0x7);
				local30 = (local12 & 0x7) + Static305.anInt5838;
				local36 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local42 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local46 = Static200.aClass7_Sub3_Sub2_3.method2764();
				if (Static185.aClass10_33 != null && local22 >= 0 && local30 >= 0 && local22 < Static15.anInt287 && Static325.anInt6173 > local30) {
					@Pc(1261) Class7_Sub35 local1261 = (Class7_Sub35) Static185.aClass10_33.method163((long) (local22 | Static168.anInt3508 << 28 | local30 << 14));
					if (local1261 != null) {
						for (@Pc(1269) Class7_Sub5 local1269 = (Class7_Sub5) local1261.aClass74_35.method1793(); local1269 != null; local1269 = (Class7_Sub5) local1261.aClass74_35.method1798()) {
							if ((local36 & 0x7FFF) == local1269.anInt1050 && local1269.anInt1054 == local42) {
								local1269.method5648();
								local1269.anInt1054 = local46;
								Static346.method5571(local30, local1269, local22, Static168.anInt3508);
								break;
							}
						}
						Static154.method2995(local30, Static168.anInt3508, local22);
					}
				}
			} else if (Static127.anInt2797 == 84) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2736();
				local22 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local30 = local22 >> 2;
				local36 = local22 & 0x3;
				local42 = Static191.anIntArray521[local30];
				local46 = Static200.aClass7_Sub3_Sub2_3.method2763();
				local50 = Static13.anInt265 + (local46 >> 4 & 0x7);
				local56 = (local46 & 0x7) + Static305.anInt5838;
				if (local50 >= 0 && local56 >= 0 && Static15.anInt287 > local50 && Static325.anInt6173 > local56) {
					Static334.method5306(0, local42, Static168.anInt3508, local36, local12, local50, local56, -1, local30);
				}
			} else if (Static127.anInt2797 == 140) {
				Static200.aClass7_Sub3_Sub2_3.method2772();
				local12 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local22 = Static13.anInt265 + (local12 >> 4 & 0x7);
				local30 = (local12 & 0x7) + Static305.anInt5838;
				local36 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local42 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local46 = Static200.aClass7_Sub3_Sub2_3.method2791();
				@Pc(1431) String local1431 = Static200.aClass7_Sub3_Sub2_3.method2782();
				Static314.method5099(local36, local1431, local42, local22, local30, local46);
			} else if (Static127.anInt2797 == 68) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local22 = Static200.aClass7_Sub3_Sub2_3.method2772();
				Static245.method4227(local12).method3226(local22);
			} else if (Static127.anInt2797 == 98) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local22 = Static13.anInt265 + (local12 >> 4 & 0x7);
				local30 = Static305.anInt5838 + (local12 & 0x7);
				local36 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local42 = local36 >> 2;
				local46 = local36 & 0x3;
				local50 = Static191.anIntArray521[local42];
				local56 = Static200.aClass7_Sub3_Sub2_3.method2764();
				if (local56 == 65535) {
					local56 = -1;
				}
				Static171.method3237(local50, local42, local30, local56, local46, local22, Static168.anInt3508);
			} else if (Static127.anInt2797 == 134) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2736();
				local22 = Static200.aClass7_Sub3_Sub2_3.method2784();
				local30 = Static200.aClass7_Sub3_Sub2_3.method2740();
				local36 = Static13.anInt265 + (local30 >> 4 & 0x7);
				local42 = (local30 & 0x7) + Static305.anInt5838;
				if (local36 >= 0 && local42 >= 0 && Static15.anInt287 > local36 && Static325.anInt6173 > local42) {
					Static346.method5571(local42, new Class7_Sub5(local12, local22), local36, Static168.anInt3508);
					Static154.method2995(local42, Static168.anInt3508, local36);
				}
			} else if (Static127.anInt2797 == 190) {
				local12 = Static200.aClass7_Sub3_Sub2_3.method2784();
				local22 = Static200.aClass7_Sub3_Sub2_3.method2751();
				local30 = Static13.anInt265 + (local22 >> 4 & 0x7);
				local36 = (local22 & 0x7) + Static305.anInt5838;
				if (local30 >= 0 && local36 >= 0 && Static15.anInt287 > local30 && local36 < Static325.anInt6173) {
					@Pc(1635) Class7_Sub35 local1635 = (Class7_Sub35) Static185.aClass10_33.method163((long) (Static168.anInt3508 << 28 | local36 << 14 | local30));
					if (local1635 != null) {
						for (@Pc(1643) Class7_Sub5 local1643 = (Class7_Sub5) local1635.aClass74_35.method1793(); local1643 != null; local1643 = (Class7_Sub5) local1635.aClass74_35.method1798()) {
							if ((local12 & 0x7FFF) == local1643.anInt1050) {
								local1643.method5648();
								break;
							}
						}
						if (local1635.aClass74_35.method1800()) {
							local1635.method5648();
						}
						Static154.method2995(local36, Static168.anInt3508, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5549(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		if (arg1 < 128 || arg0 < 128 || arg1 > Static15.anInt287 * 128 - 256 || Static325.anInt6173 * 128 - 256 < arg0) {
			Static157.anIntArray430[0] = Static157.anIntArray430[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static341.method5540(Static168.anInt3508, arg0, arg1) - arg3;
		Static91.aClass70_12.method3706(arg4, 0, 0);
		Static128.aClass89_3.method5467(Static91.aClass70_12);
		Static128.aClass89_3.method5486(arg1, local45, arg0, Static157.anIntArray430);
		Static91.aClass70_12.method3706(-arg4, 0, 0);
		Static128.aClass89_3.method5467(Static91.aClass70_12);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V")
	public static void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg4; local3 < arg1 + arg4; local3++) {
			for (local7 = arg3; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && local7 < Static15.anInt287 && local3 >= 0 && local3 < Static325.anInt6173) {
					Static23.anIntArrayArrayArray15[arg0][local7][local3] = arg0 <= 0 ? 0 : Static23.anIntArrayArrayArray15[arg0 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg3 > 0 && Static15.anInt287 > arg3) {
			for (local7 = arg4 + 1; local7 < arg1 + arg4; local7++) {
				if (local7 >= 0 && local7 < Static325.anInt6173) {
					Static23.anIntArrayArrayArray15[arg0][arg3][local7] = Static23.anIntArrayArrayArray15[arg0][arg3 - 1][local7];
				}
			}
		}
		if (arg4 > 0 && arg4 < Static325.anInt6173) {
			for (local7 = arg3 + 1; local7 < arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < Static15.anInt287) {
					Static23.anIntArrayArrayArray15[arg0][local7][arg4] = Static23.anIntArrayArrayArray15[arg0][local7][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || Static15.anInt287 <= arg3 || Static325.anInt6173 <= arg4) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4] != 0) {
				Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3][arg4 - 1] != 0) {
				Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3][arg4 - 1];
				return;
			}
			if (arg3 > 0 && arg4 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4 - 1] != 0) {
				Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4] != Static23.anIntArrayArrayArray15[arg0 - 1][arg3 - 1][arg4]) {
			Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3][arg4 - 1] != Static23.anIntArrayArrayArray15[arg0 - 1][arg3][arg4 - 1]) {
			Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3][arg4 - 1];
			return;
		}
		if (arg3 > 0 && arg4 > 0 && Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4 - 1] != Static23.anIntArrayArrayArray15[arg0 - 1][arg3 - 1][arg4 - 1]) {
			Static23.anIntArrayArrayArray15[arg0][arg3][arg4] = Static23.anIntArrayArrayArray15[arg0][arg3 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public static void method5551() {
		Static21.aClass103_1.method2678();
	}
}
