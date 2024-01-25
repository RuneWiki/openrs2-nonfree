import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[S")
	public static short[] aShortArray84;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString38 = "";

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_169 = new Class56(1, 6);

	@OriginalMember(owner = "client!o", name = "o", descriptor = "S")
	public static short aShort68 = 256;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "I")
	public static int anInt4602 = 0;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!up;")
	public static final Class250 aClass250_16 = new Class250(5, 6);

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	public static int anInt4603 = -1;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLclient!up;)V")
	public static void method3663(@OriginalArg(1) Class250 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(39) int local39;
		if (Static357.aClass250_18 == arg0) {
			local12 = Static56.aClass4_Sub9_Sub2_1.method5045();
			local16 = Static56.aClass4_Sub9_Sub2_1.method5042();
			local20 = Static56.aClass4_Sub9_Sub2_1.method5046();
			local29 = Static349.anInt5766 + (local20 >> 4 & 0x7);
			local35 = (local20 & 0x7) + Static244.anInt4058;
			local39 = Static56.aClass4_Sub9_Sub2_1.method5028();
			if (local29 >= 0 && local35 >= 0 && local29 < Static337.anInt5497 && Static282.anInt4644 > local35 && local12 != Static12.anInt187) {
				Static144.method2040(Static237.anInt5934, local35, new Class4_Sub36(local39, local16), local29);
				Static39.method546(local29, Static237.anInt5934, local35);
			}
		} else if (arg0 == Static208.aClass250_21) {
			local12 = Static56.aClass4_Sub9_Sub2_1.method5028();
			local16 = Static56.aClass4_Sub9_Sub2_1.method5007();
			Static51.aClass151_1.method2917(local12).method2180(local16);
		} else {
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(179) int local179;
			if (arg0 == aClass250_16) {
				local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
				local16 = (local12 >> 4 & 0x7) + Static349.anInt5766;
				local20 = (local12 & 0x7) + Static244.anInt4058;
				local29 = Static56.aClass4_Sub9_Sub2_1.method5028();
				if (local29 == 65535) {
					local29 = -1;
				}
				local35 = Static56.aClass4_Sub9_Sub2_1.method5007();
				local39 = local35 >> 4 & 0xF;
				local146 = local35 & 0x7;
				local150 = Static56.aClass4_Sub9_Sub2_1.method5007();
				local154 = Static56.aClass4_Sub9_Sub2_1.method5007();
				if (local16 >= 0 && local20 >= 0 && local16 < Static337.anInt5497 && local20 < Static282.anInt4644) {
					local179 = local39 + 1;
					if (Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] >= local16 - local179 && local179 + local16 >= Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] && Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] >= local20 - local179 && Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] <= local179 + local20) {
						Static331.method4366(local154, local29, local146, local150, local39 + (local20 << 8) + (Static237.anInt5934 << 24) + (local16 << 16));
					}
				}
			} else if (arg0 == Static111.aClass250_7) {
				local12 = Static56.aClass4_Sub9_Sub2_1.method5013();
				local16 = Static349.anInt5766 + (local12 >> 4 & 0x7);
				local20 = Static244.anInt4058 + (local12 & 0x7);
				local29 = Static56.aClass4_Sub9_Sub2_1.method5042();
				if (local16 >= 0 && local20 >= 0 && local16 < Static337.anInt5497 && Static282.anInt4644 > local20) {
					@Pc(298) Class4_Sub6 local298 = (Class4_Sub6) Static41.aClass67_2.method1429((long) (Static237.anInt5934 << 28 | local20 << 14 | local16));
					if (local298 != null) {
						for (@Pc(306) Class4_Sub36 local306 = (Class4_Sub36) local298.aClass244_3.method5263(); local306 != null; local306 = (Class4_Sub36) local298.aClass244_3.method5271()) {
							if (local306.anInt5276 == (local29 & 0x7FFF)) {
								local306.method6059();
								break;
							}
						}
						if (local298.aClass244_3.method5272()) {
							local298.method6059();
						}
						Static39.method546(local16, Static237.anInt5934, local20);
					}
				}
			} else {
				@Pc(408) int local408;
				@Pc(412) int local412;
				@Pc(416) int local416;
				@Pc(427) int local427;
				@Pc(523) Class8_Sub3_Sub5 local523;
				if (arg0 == Static65.aClass250_13) {
					local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
					@Pc(356) boolean local356 = (local12 & 0x80) != 0;
					local20 = Static349.anInt5766 + (local12 >> 3 & 0x7);
					local29 = Static244.anInt4058 + (local12 & 0x7);
					local35 = local20 + Static56.aClass4_Sub9_Sub2_1.method5063();
					local39 = local29 + Static56.aClass4_Sub9_Sub2_1.method5063();
					local146 = Static56.aClass4_Sub9_Sub2_1.method5061();
					local150 = Static56.aClass4_Sub9_Sub2_1.method5028();
					local154 = Static56.aClass4_Sub9_Sub2_1.method5007() * 4;
					local179 = Static56.aClass4_Sub9_Sub2_1.method5007() * 4;
					local408 = Static56.aClass4_Sub9_Sub2_1.method5028();
					local412 = Static56.aClass4_Sub9_Sub2_1.method5028();
					local416 = Static56.aClass4_Sub9_Sub2_1.method5007();
					if (local416 == 255) {
						local416 = -1;
					}
					local427 = Static56.aClass4_Sub9_Sub2_1.method5007();
					if (local20 >= 0 && local29 >= 0 && local20 < Static337.anInt5497 && local29 < Static282.anInt4644 && local35 >= 0 && local39 >= 0 && Static337.anInt5497 > local35 && local39 < Static282.anInt4644 && local150 != 65535) {
						local154 <<= 0x0;
						local20 = local20 * 128 + 64;
						local35 = local35 * 128 + 64;
						local29 = local29 * 128 + 64;
						local179 <<= 0x0;
						local39 = local39 * 128 + 64;
						local523 = new Class8_Sub3_Sub5(local150, Static237.anInt5934, local20, local29, local154, local408 + Static265.anInt4371, Static265.anInt4371 + local412, local416, local427, local146, local179, local356);
						local523.method4633(local35, Static94.method4425(local39, Static237.anInt5934, local35) - local179, local408 - -Static265.anInt4371, local39);
						Static251.aClass244_19.method5273(new Class4_Sub2_Sub1(local523));
					}
				} else {
					@Pc(581) boolean local581;
					if (arg0 == Static265.aClass250_15) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local16 = Static349.anInt5766 * 2 + (local12 >> 4 & 0xF);
						local20 = Static244.anInt4058 * 2 + (local12 & 0xF);
						local581 = Static56.aClass4_Sub9_Sub2_1.method5007() != 0;
						local35 = Static56.aClass4_Sub9_Sub2_1.method5063() + local16;
						local39 = local20 + Static56.aClass4_Sub9_Sub2_1.method5063();
						local146 = Static56.aClass4_Sub9_Sub2_1.method5061();
						local150 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local154 = Static56.aClass4_Sub9_Sub2_1.method5007() * 4;
						local179 = Static56.aClass4_Sub9_Sub2_1.method5007() * 4;
						local408 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local412 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local416 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local427 = Static56.aClass4_Sub9_Sub2_1.method5007();
						if (local416 == 255) {
							local416 = -1;
						}
						if (local16 >= 0 && local20 >= 0 && Static337.anInt5497 * 2 > local16 && Static337.anInt5497 * 2 > local20 && local35 >= 0 && local39 >= 0 && local35 < Static282.anInt4644 * 2 && local39 < Static282.anInt4644 * 2 && local150 != 65535) {
							local35 = local35 * 64;
							local39 *= 64;
							local20 *= 64;
							local154 <<= 0x0;
							local179 <<= 0x0;
							local16 *= 64;
							local523 = new Class8_Sub3_Sub5(local150, Static237.anInt5934, local16, local20, local154, local408 + Static265.anInt4371, Static265.anInt4371 + local412, local416, local427, local146, local179, local581);
							local523.method4633(local35, Static94.method4425(local39, Static237.anInt5934, local35) - local179, Static265.anInt4371 + local408, local39);
							Static251.aClass244_19.method5273(new Class4_Sub2_Sub1(local523));
						}
					} else if (Static78.aClass250_6 == arg0) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local16 = Static349.anInt5766 + (local12 >> 4 & 0x7);
						local20 = (local12 & 0x7) + Static244.anInt4058;
						local29 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local35 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local39 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local146 = Static56.aClass4_Sub9_Sub2_1.method5007();
						if (local16 >= 0 && local20 >= 0 && local16 < Static337.anInt5497 && local20 < Static282.anInt4644) {
							local150 = local16 * 128 + 64;
							local154 = local20 * 128 + 64;
							local179 = Static237.anInt5934;
							if (local179 < 3 && Static215.method4450(local16, local20)) {
								local179++;
							}
							@Pc(849) Class8_Sub3_Sub4 local849 = new Class8_Sub3_Sub4(local29, local39, Static265.anInt4371, Static237.anInt5934, local179, local150, Static94.method4425(local154, Static237.anInt5934, local150) - local35, local154, local16, local16, local20, local20, local146);
							Static295.aClass244_25.method5273(new Class4_Sub2_Sub9(local849));
						}
					} else if (arg0 == Static126.aClass250_9) {
						Static56.aClass4_Sub9_Sub2_1.method5007();
						local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local16 = Static349.anInt5766 + (local12 >> 4 & 0x7);
						local20 = (local12 & 0x7) + Static244.anInt4058;
						local29 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local35 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local39 = Static56.aClass4_Sub9_Sub2_1.method5008();
						@Pc(898) String local898 = Static56.aClass4_Sub9_Sub2_1.method5038();
						Static95.method1451(local35, local16, Static237.anInt5934, local29, local898, local39, local20);
					} else if (Static390.aClass250_23 == arg0) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5056();
						local16 = Static56.aClass4_Sub9_Sub2_1.method5045();
						local20 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local29 = Static349.anInt5766 + (local20 >> 4 & 0x7);
						local35 = (local20 & 0x7) + Static244.anInt4058;
						if (local29 >= 0 && local35 >= 0 && Static337.anInt5497 > local29 && local35 < Static282.anInt4644) {
							Static144.method2040(Static237.anInt5934, local35, new Class4_Sub36(local16, local12), local29);
							Static39.method546(local29, Static237.anInt5934, local35);
						}
					} else if (arg0 == Static120.aClass250_8) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5046();
						local16 = local12 >> 2;
						local20 = local12 & 0x3;
						local29 = Static33.anIntArray43[local16];
						local35 = Static56.aClass4_Sub9_Sub2_1.method5056();
						if (local35 == 65535) {
							local35 = -1;
						}
						local39 = Static56.aClass4_Sub9_Sub2_1.method5012();
						local146 = (local39 >> 4 & 0x7) + Static349.anInt5766;
						local150 = (local39 & 0x7) + Static244.anInt4058;
						Static186.method2730(local146, local20, Static237.anInt5934, local35, local29, local150, local16);
					} else if (arg0 == Static377.aClass250_14) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5046();
						local16 = (local12 >> 4 & 0x7) + Static349.anInt5766;
						local20 = (local12 & 0x7) + Static244.anInt4058;
						local29 = Static56.aClass4_Sub9_Sub2_1.method5046();
						local35 = local29 >> 2;
						local39 = local29 & 0x3;
						local146 = Static33.anIntArray43[local35];
						local150 = Static56.aClass4_Sub9_Sub2_1.method5045();
						if (Static322.method4264(Static267.anInt4402) || local16 >= 0 && local20 >= 0 && local16 < Static337.anInt5497 && local20 < Static282.anInt4644) {
							Static403.method5320(local146, Static237.anInt5934, local35, local150, local16, local39, local20);
						}
					} else if (Static420.aClass250_22 == arg0) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
						local16 = (local12 >> 4 & 0x7) + Static349.anInt5766;
						local20 = Static244.anInt4058 + (local12 & 0x7);
						local29 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local35 = Static56.aClass4_Sub9_Sub2_1.method5028();
						local39 = Static56.aClass4_Sub9_Sub2_1.method5028();
						if (Static41.aClass67_2 != null && local16 >= 0 && local20 >= 0 && local16 < Static337.anInt5497 && Static282.anInt4644 > local20) {
							@Pc(1165) Class4_Sub6 local1165 = (Class4_Sub6) Static41.aClass67_2.method1429((long) (local16 | local20 << 14 | Static237.anInt5934 << 28));
							if (local1165 != null) {
								for (@Pc(1173) Class4_Sub36 local1173 = (Class4_Sub36) local1165.aClass244_3.method5263(); local1173 != null; local1173 = (Class4_Sub36) local1165.aClass244_3.method5271()) {
									if (local1173.anInt5276 == (local29 & 0x7FFF) && local35 == local1173.anInt5280) {
										local1173.method6059();
										local1173.anInt5280 = local39;
										Static144.method2040(Static237.anInt5934, local20, local1173, local16);
										break;
									}
								}
								Static39.method546(local16, Static237.anInt5934, local20);
							}
						}
					} else if (arg0 == Static289.aClass250_17) {
						local12 = Static56.aClass4_Sub9_Sub2_1.method5046();
						local16 = local12 >> 2;
						local20 = local12 & 0x3;
						local29 = Static33.anIntArray43[local16];
						local35 = Static56.aClass4_Sub9_Sub2_1.method5046();
						local39 = Static349.anInt5766 + (local35 >> 4 & 0x7);
						local146 = (local35 & 0x7) + Static244.anInt4058;
						if (Static322.method4264(Static267.anInt4402) || local39 >= 0 && local146 >= 0 && local39 < Static337.anInt5497 && local146 < Static282.anInt4644) {
							Static403.method5320(local29, Static237.anInt5934, local16, -1, local39, local20, local146);
						}
					} else {
						@Pc(1334) byte local1334;
						if (arg0 == Static138.aClass250_10) {
							@Pc(1291) byte local1291 = Static56.aClass4_Sub9_Sub2_1.method5022();
							local16 = Static56.aClass4_Sub9_Sub2_1.method5013();
							local20 = Static349.anInt5766 + (local16 >> 4 & 0x7);
							local29 = Static244.anInt4058 + (local16 & 0x7);
							local35 = Static56.aClass4_Sub9_Sub2_1.method5037();
							local39 = Static56.aClass4_Sub9_Sub2_1.method5042();
							local146 = Static56.aClass4_Sub9_Sub2_1.method5056();
							local150 = Static56.aClass4_Sub9_Sub2_1.method5056();
							@Pc(1330) byte local1330 = Static56.aClass4_Sub9_Sub2_1.method5026();
							local1334 = Static56.aClass4_Sub9_Sub2_1.method5026();
							local408 = Static56.aClass4_Sub9_Sub2_1.method5013();
							local412 = local408 >> 2;
							local416 = local408 & 0x3;
							@Pc(1350) byte local1350 = Static56.aClass4_Sub9_Sub2_1.method5022();
							if (!Static39.aClass135_1.method5367()) {
								Static69.method2477(local20, Static237.anInt5934, local146, local1334, local29, local1291, local1330, local150, local416, local39, local1350, local35, local412);
							}
						} else if (Static159.aClass250_12 == arg0) {
							local12 = Static56.aClass4_Sub9_Sub2_1.method5007();
							local16 = (local12 >> 4 & 0xF) + Static349.anInt5766 * 2;
							local20 = (local12 & 0xF) + Static244.anInt4058 * 2;
							local581 = Static56.aClass4_Sub9_Sub2_1.method5007() != 0;
							local35 = Static56.aClass4_Sub9_Sub2_1.method5063() + local16;
							local39 = local20 + Static56.aClass4_Sub9_Sub2_1.method5063();
							local146 = Static56.aClass4_Sub9_Sub2_1.method5061();
							local150 = Static56.aClass4_Sub9_Sub2_1.method5061();
							local154 = Static56.aClass4_Sub9_Sub2_1.method5028();
							local1334 = Static56.aClass4_Sub9_Sub2_1.method5063();
							local408 = Static56.aClass4_Sub9_Sub2_1.method5007() * 4;
							local412 = Static56.aClass4_Sub9_Sub2_1.method5028();
							local416 = Static56.aClass4_Sub9_Sub2_1.method5028();
							local427 = Static56.aClass4_Sub9_Sub2_1.method5007();
							@Pc(1452) int local1452 = Static56.aClass4_Sub9_Sub2_1.method5007();
							if (local427 == 255) {
								local427 = -1;
							}
							if (local16 >= 0 && local20 >= 0 && Static337.anInt5497 * 2 > local16 && Static337.anInt5497 * 2 > local20 && local35 >= 0 && local39 >= 0 && local35 < Static282.anInt4644 * 2 && Static282.anInt4644 * 2 > local39 && local154 != 65535) {
								local39 = local39 * 64;
								local16 *= 64;
								local20 = local20 * 64;
								local408 <<= 0x0;
								local35 *= 64;
								local179 = local1334 << 0;
								if (local146 != 0) {
									@Pc(1551) int local1551;
									@Pc(1555) Class8_Sub3_Sub1 local1555;
									@Pc(1541) int local1541;
									@Pc(1545) int local1545;
									if (local146 >= 0) {
										local1541 = local146 - 1;
										local1545 = local1541 & 0x7FF;
										local1551 = local1541 >> 11 & 0xF;
										local1555 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local1545];
									} else {
										local1541 = -local146 - 1;
										local1551 = local1541 >> 11 & 0xF;
										local1545 = local1541 & 0x7FF;
										if (Static12.anInt187 == local1545) {
											local1555 = Static401.aClass8_Sub3_Sub1_Sub1_2;
										} else {
											local1555 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local1545];
										}
									}
									if (local1555 != null) {
										@Pc(1589) Class42 local1589 = local1555.method5892();
										if (local1589.anIntArrayArray14 != null && local1589.anIntArrayArray14[local1551] != null) {
											local1545 = local1589.anIntArrayArray14[local1551][0];
											@Pc(1611) int local1611 = local1589.anIntArrayArray14[local1551][2];
											@Pc(1616) int local1616 = local1555.aClass120_7.method2297();
											@Pc(1620) int local1620 = Class100.anIntArray206[local1616];
											@Pc(1624) int local1624 = Class100.anIntArray208[local1616];
											@Pc(1634) int local1634 = local1620 * local1611 + local1624 * local1545 >> 15;
											@Pc(1645) int local1645 = local1624 * local1611 - local1620 * local1545 >> 15;
											local179 -= local1589.anIntArrayArray14[local1551][1];
											local20 += local1645;
											local16 += local1634;
										}
									}
								}
								@Pc(1684) Class8_Sub3_Sub5 local1684 = new Class8_Sub3_Sub5(local154, Static237.anInt5934, local16, local20, local179, Static265.anInt4371 + local412, local416 + Static265.anInt4371, local427, local1452, local150, local408, local581);
								local1684.method4633(local35, Static94.method4425(local39, Static237.anInt5934, local35) - local408, local412 + Static265.anInt4371, local39);
								Static251.aClass244_19.method5273(new Class4_Sub2_Sub1(local1684));
							}
						} else {
							Static33.method448(null, "T3 - " + arg0);
							Static33.method450(false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILclient!kn;)V")
	public static void method3664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub4 arg3) {
		@Pc(4) Class75 local4 = Static371.method4772(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass8_Sub4_1 = arg3;
		}
	}
}
