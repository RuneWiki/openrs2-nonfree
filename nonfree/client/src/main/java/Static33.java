import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!g;")
	public static Class83 aClass83_5;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	public static int anInt215;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[Lclient!et;")
	public static final Class70[] aClass70Array2 = new Class70[29];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!oj;I)Z")
	public static boolean method117(@OriginalArg(1) Class48 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static89.anInt1891 - 104) / 2;
		@Pc(17) int local17 = (Static85.anInt1839 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static310.method5037(local25, local21, local29, arg1)) {
						local42 = local29;
						if (Static155.method2770(local21, local25)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static215.method3858(local21, local42, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(85) int[] local85 = new int[262144];
		for (local29 = 0; local29 < local85.length; local29++) {
			local85[local29] = -16777216;
		}
		Static93.aClass27_10 = arg0.method2456(local85, 512, 512, 512);
		Static181.method3328();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) - 10) + 238 << 16) + 228 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 228 | 0x817EFF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(178) boolean[][] local178 = new boolean[Static59.anInt1284][Static59.anInt1284];
		@Pc(184) int local184;
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(261) int local261;
		@Pc(267) int local267;
		@Pc(272) int local272;
		@Pc(291) int local291;
		for (@Pc(180) int local180 = local11; local180 < local11 + 104; local180 += Static59.anInt1284) {
			for (local184 = local17; local184 < local17 + 104; local184 += Static59.anInt1284) {
				arg0.method2496(0, 0, Static59.anInt1284 * 4, Static59.anInt1284 * 4);
				arg0.method2512(-16777216);
				for (local201 = arg1; local201 <= 3; local201++) {
					for (local205 = 0; local205 < Static59.anInt1284; local205++) {
						for (local209 = 0; local209 < Static59.anInt1284; local209++) {
							local178[local205][local209] = Static310.method5037(local184 + local209, local180 + local205, local201, arg1);
						}
					}
					Static210.aClass149Array5[local201].method5831(local180, local184, local180 + Static59.anInt1284, Static59.anInt1284 + local184, local178);
					if (!Static231.aBoolean334) {
						for (local209 = -4; local209 < Static59.anInt1284; local209++) {
							for (local261 = -4; local261 < Static59.anInt1284; local261++) {
								local267 = local209 + local180;
								local272 = local184 + local261;
								if (local11 <= local267 && local272 >= local17 && Static310.method5037(local272, local267, local201, arg1)) {
									local291 = local201;
									if (Static155.method2770(local267, local272)) {
										local291 = local201 - 1;
									}
									if (local291 >= 0) {
										Static268.method4565(local272, local267, (Static59.anInt1284 - local261) * 4 - 4, local42, arg0, local155, local209 * 4, local291);
									}
								}
							}
						}
					}
				}
				if (Static231.aBoolean334) {
					@Pc(342) Class178 local342 = Static165.aClass178Array1[arg1];
					for (local209 = 0; local209 < Static59.anInt1284; local209++) {
						for (local261 = 0; local261 < Static59.anInt1284; local261++) {
							local267 = local209 + local180;
							local272 = local184 + local261;
							local291 = local342.anIntArrayArray34[local267 - local342.anInt4991][local272 - local342.anInt4995];
							if ((local291 & 0x40240000) != 0) {
								arg0.method2509(4, 4, (Static59.anInt1284 - local261) * 4 - 4, -1713569622, local209 * 4);
							} else if ((local291 & 0x800000) != 0) {
								arg0.method2493(-1713569622, local209 * 4, (Static59.anInt1284 - local261) * 4 - 4, 4);
							} else if ((local291 & 0x2000000) != 0) {
								arg0.method2514((Static59.anInt1284 - local261) * 4 - 4, local209 * 4 + 3, -1713569622, 4);
							} else if ((local291 & 0x8000000) != 0) {
								arg0.method2493(-1713569622, local209 * 4, (Static59.anInt1284 - local261) * 4 + 3 - 4, 4);
							} else if ((local291 & 0x20000000) != 0) {
								arg0.method2514((Static59.anInt1284 - local261) * 4 - 4, local209 * 4, -1713569622, 4);
							}
						}
					}
				}
				arg0.method2470(0, 0, Static59.anInt1284 * 4, Static59.anInt1284 * 4, local174, 2);
				Static93.aClass27_10.method5323((local180 - local11) * 4 + 48, 464 - (-local17 + local184) * 4 + -(Static59.anInt1284 * 4), Static59.anInt1284 * 4, Static59.anInt1284 * 4);
			}
		}
		arg0.method2505();
		arg0.method2512(-16777215);
		Static59.method899();
		Static269.anInt5104 = 0;
		Static230.aClass238_23.method5806();
		if (!Static231.aBoolean334) {
			for (local184 = local11; local184 < local11 + 104; local184++) {
				for (local201 = local17; local201 < local17 + 104; local201++) {
					for (local205 = arg1; local205 <= arg1 + 1 && local205 <= 3; local205++) {
						if (Static310.method5037(local201, local184, local205, arg1)) {
							@Pc(612) Interface8 local612 = (Interface8) Static266.method4518(local205, local184, local201);
							if (local612 == null) {
								local612 = (Interface8) Static278.method4615(local205, local184, local201, td.class);
							}
							if (local612 == null) {
								local612 = (Interface8) Static94.method1598(local205, local184, local201);
							}
							if (local612 == null) {
								local612 = (Interface8) Static204.method3744(local205, local184, local201);
							}
							if (local612 != null) {
								@Pc(653) Class47 local653 = Static230.aClass96_4.method2303(local612.method6034());
								if (!local653.aBoolean97 || Static180.aBoolean272) {
									local267 = local653.anInt1251;
									if (local653.anIntArray95 != null) {
										for (local272 = 0; local272 < local653.anIntArray95.length; local272++) {
											if (local653.anIntArray95[local272] != -1) {
												@Pc(682) Class47 local682 = Static230.aClass96_4.method2303(local653.anIntArray95[local272]);
												if (local682.anInt1251 >= 0) {
													local267 = local682.anInt1251;
												}
											}
										}
									}
									if (local267 >= 0) {
										@Pc(708) boolean local708 = false;
										if (local267 >= 0) {
											@Pc(715) Class212 local715 = Static78.aClass195_2.method4816(local267);
											if (local715 != null && local715.aBoolean441) {
												local708 = true;
											}
										}
										local291 = local184;
										@Pc(726) int local726 = local201;
										if (local708) {
											@Pc(733) int[][] local733 = Static165.aClass178Array1[local205].anIntArrayArray34;
											@Pc(738) int local738 = Static165.aClass178Array1[local205].anInt4991;
											@Pc(743) int local743 = Static165.aClass178Array1[local205].anInt4995;
											for (@Pc(745) int local745 = 0; local745 < 10; local745++) {
												@Pc(752) int local752 = (int) (Math.random() * 4.0D);
												if (local752 == 0 && local291 > local11 && local291 > local184 - 3 && (local733[local291 - local738 - 1][local726 - local743] & 0x2C0108) == 0) {
													local291--;
												}
												if (local752 == 1 && local291 < local11 + 104 - 1 && local291 < local184 + 3 && (local733[local291 + 1 - local738][local726 - local743] & 0x2C0180) == 0) {
													local291++;
												}
												if (local752 == 2 && local726 > local17 && local201 - 3 < local726 && (local733[local291 - local738][local726 - local743 - 1] & 0x2C0102) == 0) {
													local726--;
												}
												if (local752 == 3 && local726 < local17 + 104 - 1 && local201 + 3 > local726 && (local733[local291 - local738][local726 + 1 - local743] & 0x2C0120) == 0) {
													local726++;
												}
											}
										}
										Static312.anIntArray500[Static269.anInt5104] = local653.anInt1234;
										Static342.anIntArray539[Static269.anInt5104] = local291;
										Static52.anIntArray223[Static269.anInt5104] = local726;
										Static269.anInt5104++;
									}
								}
							}
						}
					}
				}
			}
			if (Static206.aClass215_2 != null) {
				Static48.aClass83_29.anInt2413 = 1;
				Static78.aClass195_2.method4811(64, 1024);
				for (local201 = 0; local201 < Static206.aClass215_2.anInt6173; local201++) {
					local205 = Static206.aClass215_2.anIntArray533[local201];
					if (Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 == local205 >> 28) {
						local209 = (local205 >> 14 & 0x3FFF) - Static279.anInt5198;
						local261 = (local205 & 0x3FFF) - Static350.anInt6470;
						if (local209 >= 0 && Static89.anInt1891 > local209 && local261 >= 0 && local261 < Static85.anInt1839) {
							Static230.aClass238_23.method5796(new Class2_Sub16(local201));
						} else {
							@Pc(1013) Class212 local1013 = Static78.aClass195_2.method4816(Static206.aClass215_2.anIntArray532[local201]);
							if (local1013.anIntArray522 != null && local1013.anInt5999 + local209 >= 0 && Static89.anInt1891 > local209 + local1013.anInt5996 && local1013.anInt5997 + local261 >= 0 && Static85.anInt1839 > local1013.anInt6004 + local261) {
								Static230.aClass238_23.method5796(new Class2_Sub16(local201));
							}
						}
					}
				}
				Static78.aClass195_2.method4811(64, 128);
				Static48.aClass83_29.anInt2413 = 2;
				Static48.aClass83_29.method1969();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V")
	public static void method123() {
		if (Static383.aClass48_9.method2488()) {
			Static297.method4861();
			Static383.aClass48_9.method2472(Static343.aCanvas5);
			Static59.method899();
		} else {
			Static364.method5791(Static36.anInt2910);
		}
	}
}
