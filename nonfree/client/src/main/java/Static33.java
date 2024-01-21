import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] aClass4_Sub3_Sub6_Sub3Array1;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!od;")
	private static Class60 aClass60_337 = Static41.method597("Please use a different world)3");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_334 = aClass60_337;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!od;")
	private static Class60 aClass60_338 = Static41.method597("Choose Option");

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_335 = aClass60_338;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_336 = aClass60_337;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Z")
	public static boolean aBoolean38 = true;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!c;Lclient!c;Lclient!c;ZLclient!bc;)Z")
	public static boolean method497(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(4) Class4_Sub1_Sub1 arg3) {
		Static3.aClass10_3 = arg2;
		Static51.aClass10_16 = arg1;
		Static30.aClass4_Sub1_Sub1_1 = arg3;
		Static86.aClass10_25 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBLclient!sa;I)V")
	public static void method498(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (Static81.aClass4_Sub14_12 != null || Static12.aBoolean107 || (arg1 == null || Static87.method1400(arg1) == null)) {
			return;
		}
		Static81.aClass4_Sub14_12 = arg1;
		Static69.aClass4_Sub14_10 = Static87.method1400(arg1);
		Static112.anInt2685 = 0;
		Static70.aBoolean63 = false;
		Static113.anInt1295 = arg0;
		Static42.anInt1098 = arg2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method499() {
		aClass4_Sub3_Sub6_Sub3Array1 = null;
		aClass60_336 = null;
		aClass60_334 = null;
		aClass60_338 = null;
		aClass60_337 = null;
		aClass60_335 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI[Lclient!sa;)V")
	public static void method500(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub14[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class4_Sub14 local9 = arg1[local3];
			if (local9 != null && local9.anInt2397 == arg0 && (!local9.aBoolean95 || !Static2.method9(local9))) {
				if (local9.anInt2389 == 0) {
					if (!local9.aBoolean95 && Static2.method9(local9) && local9 != Static18.aClass4_Sub14_4) {
						continue;
					}
					method500(local9.anInt2388, arg1);
					if (local9.aClass4_Sub14Array3 != null) {
						method500(local9.anInt2388, local9.aClass4_Sub14Array3);
					}
					@Pc(57) Class4_Sub18 local57 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local9.anInt2388);
					if (local57 != null) {
						Static96.method1566(local57.anInt2589);
					}
				}
				if (local9.anInt2389 == 6) {
					@Pc(86) int local86;
					if (local9.anInt2385 != -1 || local9.anInt2438 != -1) {
						@Pc(81) boolean local81 = Static50.method850(local9);
						if (local81) {
							local86 = local9.anInt2438;
						} else {
							local86 = local9.anInt2385;
						}
						if (local86 != -1) {
							@Pc(99) Class4_Sub3_Sub10 local99 = Static7.method63(local86);
							local9.anInt2434 += Static116.anInt2713;
							while (local99.anIntArray218[local9.anInt2424] < local9.anInt2434) {
								local9.anInt2434 -= local99.anIntArray218[local9.anInt2424];
								local9.anInt2424++;
								if (local99.anIntArray216.length <= local9.anInt2424) {
									local9.anInt2424 -= local99.anInt1873;
									if (local9.anInt2424 < 0 || local9.anInt2424 >= local99.anIntArray216.length) {
										local9.anInt2424 = 0;
									}
								}
								Static36.method558(local9);
							}
						}
					}
					if (local9.anInt2429 != 0 && !local9.aBoolean95) {
						@Pc(185) int local185 = local9.anInt2429 >> 16;
						@Pc(189) int local189 = local185 * Static116.anInt2713;
						local9.anInt2386 = local189 + local9.anInt2386 & 0x7FF;
						local86 = local9.anInt2429 << 16 >> 16;
						local86 *= Static116.anInt2713;
						local9.anInt2373 = local86 + local9.anInt2373 & 0x7FF;
						Static36.method558(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class4_Sub17 local17 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg2);
		if (local17 == null) {
			local17 = new Class4_Sub17();
			Static75.aClass75_8.method1892((long) arg2, local17);
		}
		if (arg1 >= local17.anIntArray322.length) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			for (@Pc(46) int local46 = 0; local46 < local17.anIntArray322.length; local46++) {
				local39[local46] = local17.anIntArray322[local46];
				local44[local46] = local17.anIntArray321[local46];
			}
			for (@Pc(76) int local76 = local17.anIntArray322.length; local76 < arg1; local76++) {
				local39[local76] = -1;
				local44[local76] = 0;
			}
			local17.anIntArray322 = local39;
			local17.anIntArray321 = local44;
		}
		local17.anIntArray322[arg1] = arg3;
		local17.anIntArray321[arg1] = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!od;BLjava/awt/Color;)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static110.aCanvas1.getGraphics();
			if (Static2.aFont1 == null) {
				Static2.aFont1 = new Font("Helvetica", 1, 13);
				Static124.aFontMetrics1 = Static110.aCanvas1.getFontMetrics(Static2.aFont1);
			}
			if (Static19.aBoolean24) {
				Static19.aBoolean24 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static60.anInt2958, Static112.anInt2680);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static130.anImage4 == null) {
					Static130.anImage4 = Static110.aCanvas1.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static130.anImage4.getGraphics();
				local56.setColor(arg2);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg0 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local56.setFont(Static2.aFont1);
				local56.setColor(Color.white);
				arg1.method1319(22, local56, (304 - arg1.method1329(Static124.aFontMetrics1)) / 2);
				local6.drawImage(Static130.anImage4, Static60.anInt2958 / 2 - 152, Static112.anInt2680 / 2 - 18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static112.anInt2680 / 2 - 18;
				@Pc(146) int local146 = Static60.anInt2958 / 2 - 152;
				local6.setColor(arg2);
				local6.drawRect(local146, local140, 303, 33);
				local6.fillRect(local146 + 2, local140 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local146 + 1, local140 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local146 + 2, local140 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static2.aFont1);
				local6.setColor(Color.white);
				arg1.method1319(local140 + 22, local6, (304 - arg1.method1329(Static124.aFontMetrics1)) / 2 + local146);
			}
		} catch (@Pc(225) Exception local225) {
			Static110.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static void method504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		local8[0] = arg0;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static63.anIntArray179[local23] != arg0) {
				local8[local10] = Static63.anIntArray179[local23];
				local17[local10] = Static3.anIntArray4[local23];
				local10++;
			}
		}
		Static3.anIntArray4 = local17;
		Static63.anIntArray179 = local8;
		Static110.method1822(0, Static77.aClass22Array1, Static63.anIntArray179, Static77.aClass22Array1.length - 1, Static3.anIntArray4);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	public static void method505() {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(47) int local47;
		@Pc(43) int local43;
		if (Static40.anInt1058 == 118) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method798();
			local25 = Static5.anInt66 + (local16 >> 4 & 0x7);
			local31 = (local16 & 0x7) + Static37.anInt1028;
			local35 = Static96.aClass4_Sub9_Sub1_2.method795();
			local39 = local35 >> 2;
			local43 = local35 & 0x3;
			local47 = Static30.anIntArray92[local39];
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
				Static80.method1281(local47, local31, local25, local43, Static77.anInt1866, local39, -1, 0, -1);
			}
		} else if (Static40.anInt1058 == 180) {
			local16 = Static96.aClass4_Sub9_Sub1_2.method795();
			local25 = Static5.anInt66 + (local16 >> 4 & 0x7);
			local31 = (local16 & 0x7) + Static37.anInt1028;
			local35 = Static96.aClass4_Sub9_Sub1_2.method771();
			local39 = Static96.aClass4_Sub9_Sub1_2.method802();
			local43 = Static96.aClass4_Sub9_Sub1_2.method816();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104 && local35 != Static94.anInt2216) {
				@Pc(129) Class4_Sub3_Sub1_Sub1 local129 = new Class4_Sub3_Sub1_Sub1();
				local129.anInt225 = local39;
				local129.anInt221 = local43;
				if (Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local25][local31] == null) {
					Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local25][local31] = new Class45();
				}
				Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local25][local31].method988(local129);
				Static50.method858(local31, local25);
			}
		} else {
			@Pc(225) Class4_Sub3_Sub1_Sub1 local225;
			if (Static40.anInt1058 == 135) {
				local16 = Static96.aClass4_Sub9_Sub1_2.method769();
				local25 = Static96.aClass4_Sub9_Sub1_2.method795();
				local35 = (local25 & 0x7) + Static37.anInt1028;
				local31 = Static5.anInt66 + (local25 >> 4 & 0x7);
				if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
					@Pc(218) Class45 local218 = Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local31][local35];
					if (local218 != null) {
						for (local225 = (Class4_Sub3_Sub1_Sub1) local218.method982(); local225 != null; local225 = (Class4_Sub3_Sub1_Sub1) local218.method986()) {
							if (local225.anInt221 == (local16 & 0x7FFF)) {
								local225.method1989();
								break;
							}
						}
						if (local218.method982() == null) {
							Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local31][local35] = null;
						}
						Static50.method858(local35, local31);
					}
				}
			} else if (Static40.anInt1058 == 246) {
				local16 = Static96.aClass4_Sub9_Sub1_2.method773();
				local25 = (local16 >> 4 & 0x7) + Static5.anInt66;
				local31 = Static37.anInt1028 + (local16 & 0x7);
				local35 = Static96.aClass4_Sub9_Sub1_2.method816();
				local39 = Static96.aClass4_Sub9_Sub1_2.method773();
				local43 = Static96.aClass4_Sub9_Sub1_2.method816();
				if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
					local25 = local25 * 128 + 64;
					local31 = local31 * 128 + 64;
					@Pc(343) Class4_Sub3_Sub1_Sub4 local343 = new Class4_Sub3_Sub1_Sub4(local35, Static77.anInt1866, local25, local31, Static55.method882(local31, local25, Static77.anInt1866) - local39, local43, Static118.anInt2741);
					Static66.aClass45_12.method988(local343);
				}
			} else {
				@Pc(393) int local393;
				@Pc(397) int local397;
				@Pc(413) int local413;
				if (Static40.anInt1058 == 220) {
					local16 = Static96.aClass4_Sub9_Sub1_2.method771();
					local25 = Static96.aClass4_Sub9_Sub1_2.method778();
					local31 = local25 >> 2;
					local35 = local25 & 0x3;
					local39 = Static30.anIntArray92[local31];
					@Pc(377) byte local377 = Static96.aClass4_Sub9_Sub1_2.method804();
					local47 = Static96.aClass4_Sub9_Sub1_2.method816();
					@Pc(389) byte local389 = Static96.aClass4_Sub9_Sub1_2.method797();
					local393 = Static96.aClass4_Sub9_Sub1_2.method771();
					local397 = Static96.aClass4_Sub9_Sub1_2.method769();
					@Pc(405) byte local405 = Static96.aClass4_Sub9_Sub1_2.method793();
					@Pc(409) byte local409 = Static96.aClass4_Sub9_Sub1_2.method804();
					local413 = Static96.aClass4_Sub9_Sub1_2.method778();
					@Pc(420) Class4_Sub3_Sub1_Sub2_Sub1 local420;
					if (local47 == Static94.anInt2216) {
						local420 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1;
					} else {
						local420 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local47];
					}
					@Pc(432) int local432 = (local413 >> 4 & 0x7) + Static5.anInt66;
					@Pc(438) int local438 = Static37.anInt1028 + (local413 & 0x7);
					if (local420 != null) {
						@Pc(444) Class4_Sub3_Sub3 local444 = Static76.method1244(local397);
						@Pc(455) int local455;
						@Pc(458) int local458;
						if (local35 == 1 || local35 == 3) {
							local455 = local444.anInt750;
							local458 = local444.anInt760;
						} else {
							local455 = local444.anInt760;
							local458 = local444.anInt750;
						}
						@Pc(473) int local473 = local432 + (local455 >> 1);
						@Pc(480) int local480 = local438 + (local458 >> 1);
						@Pc(488) int local488 = local438 + (local458 + 1 >> 1);
						@Pc(496) int local496 = (local455 + 1 >> 1) + local432;
						@Pc(500) int[][] local500 = Static16.anIntArrayArrayArray1[Static77.anInt1866];
						@Pc(508) int local508 = (local455 << 6) + (local432 << 7);
						@Pc(534) int local534 = local500[local496][local488] + local500[local473][local488] + local500[local473][local480] + local500[local496][local480] >> 2;
						@Pc(542) int local542 = (local438 << 7) + (local458 << 6);
						@Pc(552) Class4_Sub3_Sub1_Sub7 local552 = local444.method397(local31, local534, local500, local508, local542, local35);
						if (local552 != null) {
							Static80.method1281(local39, local438, local432, 0, Static77.anInt1866, 0, -1, local16 + 1, local393 + 1);
							local420.aClass4_Sub3_Sub1_Sub7_1 = local552;
							local420.anInt408 = local455 * 64 + local432 * 128;
							@Pc(586) byte local586;
							if (local377 > local405) {
								local586 = local377;
								local377 = local405;
								local405 = local586;
							}
							if (local389 < local409) {
								local586 = local409;
								local409 = local389;
								local389 = local586;
							}
							local420.anInt419 = Static118.anInt2741 + local16;
							local420.anInt421 = local393 + Static118.anInt2741;
							local420.anInt407 = local458 * 64 + local438 * 128;
							local420.anInt409 = local377 + local432;
							local420.anInt424 = local534;
							local420.anInt425 = local432 + local405;
							local420.anInt412 = local409 + local438;
							local420.anInt418 = local389 + local438;
						}
					}
				}
				@Pc(691) int local691;
				if (Static40.anInt1058 == 237) {
					local16 = Static96.aClass4_Sub9_Sub1_2.method773();
					local25 = (local16 >> 4 & 0x7) + Static5.anInt66;
					local31 = (local16 & 0x7) + Static37.anInt1028;
					local35 = local25 + Static96.aClass4_Sub9_Sub1_2.method797();
					local39 = Static96.aClass4_Sub9_Sub1_2.method797() + local31;
					local43 = Static96.aClass4_Sub9_Sub1_2.method774();
					local47 = Static96.aClass4_Sub9_Sub1_2.method816();
					local691 = Static96.aClass4_Sub9_Sub1_2.method773() * 4;
					local393 = Static96.aClass4_Sub9_Sub1_2.method773() * 4;
					local397 = Static96.aClass4_Sub9_Sub1_2.method816();
					@Pc(705) int local705 = Static96.aClass4_Sub9_Sub1_2.method816();
					@Pc(709) int local709 = Static96.aClass4_Sub9_Sub1_2.method773();
					local413 = Static96.aClass4_Sub9_Sub1_2.method773();
					if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local47 != 65535) {
						local35 = local35 * 128 + 64;
						local25 = local25 * 128 + 64;
						local31 = local31 * 128 + 64;
						@Pc(798) Class4_Sub3_Sub1_Sub3 local798 = new Class4_Sub3_Sub1_Sub3(local47, Static77.anInt1866, local25, local31, Static55.method882(local31, local25, Static77.anInt1866) - local691, local397 + Static118.anInt2741, Static118.anInt2741 + local705, local709, local413, local43, local393);
						local39 = local39 * 128 + 64;
						local798.method370(local35, local39, Static55.method882(local39, local35, Static77.anInt1866) - local393, local397 - -Static118.anInt2741);
						Static69.aClass45_13.method988(local798);
					}
				} else if (Static40.anInt1058 == 41) {
					local16 = Static96.aClass4_Sub9_Sub1_2.method773();
					local31 = Static37.anInt1028 + (local16 & 0x7);
					local25 = Static5.anInt66 + (local16 >> 4 & 0x7);
					local35 = Static96.aClass4_Sub9_Sub1_2.method816();
					local39 = Static96.aClass4_Sub9_Sub1_2.method816();
					local43 = Static96.aClass4_Sub9_Sub1_2.method816();
					if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
						@Pc(878) Class45 local878 = Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local25][local31];
						if (local878 != null) {
							for (@Pc(885) Class4_Sub3_Sub1_Sub1 local885 = (Class4_Sub3_Sub1_Sub1) local878.method982(); local885 != null; local885 = (Class4_Sub3_Sub1_Sub1) local878.method986()) {
								if ((local35 & 0x7FFF) == local885.anInt221 && local39 == local885.anInt225) {
									local885.anInt225 = local43;
									break;
								}
							}
							Static50.method858(local31, local25);
						}
					}
				} else if (Static40.anInt1058 == 9) {
					local16 = Static96.aClass4_Sub9_Sub1_2.method795();
					local25 = local16 >> 2;
					local35 = Static30.anIntArray92[local25];
					local31 = local16 & 0x3;
					local39 = Static96.aClass4_Sub9_Sub1_2.method798();
					local47 = (local39 & 0x7) + Static37.anInt1028;
					local43 = (local39 >> 4 & 0x7) + Static5.anInt66;
					local691 = Static96.aClass4_Sub9_Sub1_2.method771();
					if (local43 >= 0 && local47 >= 0 && local43 < 103 && local47 < 103) {
						if (local35 == 0) {
							@Pc(992) Class1 local992 = Static30.aClass48_1.method1009(Static77.anInt1866, local43, local47);
							if (local992 != null) {
								local397 = local992.anInt12 >> 14 & 0x7FFF;
								if (local25 == 2) {
									local992.aClass4_Sub3_Sub1_2 = new Class4_Sub3_Sub1_Sub6(local397, 2, local31 + 4, Static77.anInt1866, local43, local47, local691, false, local992.aClass4_Sub3_Sub1_2);
									local992.aClass4_Sub3_Sub1_1 = new Class4_Sub3_Sub1_Sub6(local397, 2, local31 + 1 & 0x3, Static77.anInt1866, local43, local47, local691, false, local992.aClass4_Sub3_Sub1_1);
								} else {
									local992.aClass4_Sub3_Sub1_2 = new Class4_Sub3_Sub1_Sub6(local397, local25, local31, Static77.anInt1866, local43, local47, local691, false, local992.aClass4_Sub3_Sub1_2);
								}
							}
						}
						if (local35 == 1) {
							@Pc(1068) Class17 local1068 = Static30.aClass48_1.method1007(Static77.anInt1866, local43, local47);
							if (local1068 != null) {
								local397 = local1068.anInt846 >> 14 & 0x7FFF;
								if (local25 == 4 || local25 == 5) {
									local1068.aClass4_Sub3_Sub1_4 = new Class4_Sub3_Sub1_Sub6(local397, 4, local31, Static77.anInt1866, local43, local47, local691, false, local1068.aClass4_Sub3_Sub1_4);
								} else if (local25 == 6) {
									local1068.aClass4_Sub3_Sub1_4 = new Class4_Sub3_Sub1_Sub6(local397, 4, local31 + 4, Static77.anInt1866, local43, local47, local691, false, local1068.aClass4_Sub3_Sub1_4);
								} else if (local25 == 7) {
									local1068.aClass4_Sub3_Sub1_4 = new Class4_Sub3_Sub1_Sub6(local397, 4, (local31 + 2 & 0x3) + 4, Static77.anInt1866, local43, local47, local691, false, local1068.aClass4_Sub3_Sub1_4);
								} else if (local25 == 8) {
									local1068.aClass4_Sub3_Sub1_4 = new Class4_Sub3_Sub1_Sub6(local397, 4, local31 + 4, Static77.anInt1866, local43, local47, local691, false, local1068.aClass4_Sub3_Sub1_4);
									local1068.aClass4_Sub3_Sub1_3 = new Class4_Sub3_Sub1_Sub6(local397, 4, (local31 + 2 & 0x3) + 4, Static77.anInt1866, local43, local47, local691, false, local1068.aClass4_Sub3_Sub1_3);
								}
							}
						}
						if (local35 == 2) {
							@Pc(1200) Class66 local1200 = Static30.aClass48_1.method1033(Static77.anInt1866, local43, local47);
							if (local25 == 11) {
								local25 = 10;
							}
							if (local1200 != null) {
								local1200.aClass4_Sub3_Sub1_6 = new Class4_Sub3_Sub1_Sub6(local1200.anInt2142 >> 14 & 0x7FFF, local25, local31, Static77.anInt1866, local43, local47, local691, false, local1200.aClass4_Sub3_Sub1_6);
							}
						}
						if (local35 == 3) {
							@Pc(1238) Class27 local1238 = Static30.aClass48_1.method1018(Static77.anInt1866, local43, local47);
							if (local1238 != null) {
								local1238.aClass4_Sub3_Sub1_5 = new Class4_Sub3_Sub1_Sub6(local1238.anInt1078 >> 14 & 0x7FFF, 22, local31, Static77.anInt1866, local43, local47, local691, false, local1238.aClass4_Sub3_Sub1_5);
							}
						}
					}
				} else if (Static40.anInt1058 == 155) {
					local16 = Static96.aClass4_Sub9_Sub1_2.method773();
					local31 = (local16 & 0x7) + Static37.anInt1028;
					local25 = Static5.anInt66 + (local16 >> 4 & 0x7);
					local35 = Static96.aClass4_Sub9_Sub1_2.method769();
					local39 = Static96.aClass4_Sub9_Sub1_2.method773();
					local47 = local39 & 0x3;
					local43 = local39 >> 2;
					local691 = Static30.anIntArray92[local43];
					if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
						Static80.method1281(local691, local31, local25, local47, Static77.anInt1866, local43, local35, 0, -1);
					}
				} else {
					if (Static40.anInt1058 == 129) {
						local16 = Static96.aClass4_Sub9_Sub1_2.method773();
						local31 = Static37.anInt1028 + (local16 & 0x7);
						local25 = (local16 >> 4 & 0x7) + Static5.anInt66;
						local35 = Static96.aClass4_Sub9_Sub1_2.method816();
						local39 = Static96.aClass4_Sub9_Sub1_2.method773();
						local43 = local39 >> 4 & 0xF;
						local47 = local39 & 0x7;
						local691 = Static96.aClass4_Sub9_Sub1_2.method773();
						if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
							local393 = local43 + 1;
							if (Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0] >= local25 - local393 && local25 + local393 >= Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0] && Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0] >= local31 - local393 && local393 + local31 >= Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0] && Static120.anInt2754 != 0 && local47 > 0 && Static118.anInt2731 < 50) {
								Static98.anIntArray295[Static118.anInt2731] = local35;
								Static11.anIntArray40[Static118.anInt2731] = local47;
								Static123.anIntArray339[Static118.anInt2731] = local691;
								Static40.aClass9Array1[Static118.anInt2731] = null;
								Static67.anIntArray191[Static118.anInt2731] = local43 + (local31 << 8) + (local25 << 16);
								Static118.anInt2731++;
							}
						}
					}
					if (Static40.anInt1058 == 232) {
						local16 = Static96.aClass4_Sub9_Sub1_2.method802();
						local25 = Static96.aClass4_Sub9_Sub1_2.method778();
						local31 = Static5.anInt66 + (local25 >> 4 & 0x7);
						local35 = (local25 & 0x7) + Static37.anInt1028;
						local39 = Static96.aClass4_Sub9_Sub1_2.method771();
						if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
							local225 = new Class4_Sub3_Sub1_Sub1();
							local225.anInt225 = local16;
							local225.anInt221 = local39;
							if (Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local31][local35] == null) {
								Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local31][local35] = new Class45();
							}
							Static48.aClass45ArrayArrayArray1[Static77.anInt1866][local31][local35].method988(local225);
							Static50.method858(local35, local31);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method506() {
		Static16.anInt552 = 0;
		Static26.anInt855 = -1;
		Static40.anInt1058 = -1;
		Static7.anInt79 = 0;
		Static12.aBoolean107 = false;
		Static48.anInt1184 = 0;
		Static98.anInt2287 = 0;
		Static28.anInt2004 = -1;
		Static14.aClass4_Sub9_Sub1_1.anInt1312 = 0;
		Static106.anInt2495 = 0;
		Static79.anInt1904 = -1;
		Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
		Static29.anInt897 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1.length; local35++) {
			if (Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local35] != null) {
				Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local35].anInt1438 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3.length; local53++) {
			if (Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local53] != null) {
				Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local53].anInt1438 = -1;
			}
		}
		Static26.method453();
		Static32.method496(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static105.aBooleanArray15[local84] = true;
		}
	}
}
