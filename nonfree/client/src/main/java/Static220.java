import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "[Lclient!ff;")
	public static Class36_Sub3_Sub1_Sub1[] aClass36_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public static int anInt2598 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIII)V")
	public static void method2313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static346.anInt6355; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub31.aRectangleArray2[local7];
			if (arg2 < local13.width + local13.x && local13.x < arg0 + arg2 && arg1 < local13.y + local13.height && local13.y < arg1 + arg3) {
				Static41.aBooleanArray2[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!sd;I)V")
	public static void method2315(@OriginalArg(0) Class217 arg0) {
		Static347.aClass217_1 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILclient!qa;I)Z")
	public static boolean method2316(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		@Pc(11) int local11 = (Static80.anInt6558 - 104) / 2;
		@Pc(17) int local17 = (Static104.anInt2048 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static17.method239(local21, arg0, local25, local29)) {
						local40 = local29;
						if (Static195.method3034(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static412.method5592(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(79) int[] local79 = new int[262144];
		for (local29 = 0; local29 < local79.length; local29++) {
			local79[local29] = -16777216;
		}
		Static319.aClass78_18 = arg1.method4575(local79, 512, 512, 512);
		Static26.method377();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(149) int local149 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(168) int local168 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(172) boolean[][] local172 = new boolean[Static57.anInt850][Static57.anInt850];
		@Pc(178) int local178;
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(256) int local256;
		@Pc(262) int local262;
		@Pc(266) int local266;
		@Pc(289) int local289;
		for (@Pc(174) int local174 = local11; local174 < local11 + 104; local174 += Static57.anInt850) {
			for (local178 = local17; local178 < local17 + 104; local178 += Static57.anInt850) {
				arg1.pa(0, 0, Static57.anInt850 * 4, Static57.anInt850 * 4);
				arg1.M(-16777216);
				for (local195 = arg0; local195 <= 3; local195++) {
					for (local199 = 0; local199 < Static57.anInt850; local199++) {
						for (local203 = 0; local203 < Static57.anInt850; local203++) {
							local172[local199][local203] = Static17.method239(local199 + local174, arg0, local203 + local178, local195);
						}
					}
					Static60.aClass70Array1[local195].method4267(local174, local178, local174 + Static57.anInt850, Static57.anInt850 + local178, local172);
					if (!Static84.aBoolean504) {
						for (local203 = -4; local203 < Static57.anInt850; local203++) {
							for (local256 = -4; local256 < Static57.anInt850; local256++) {
								local262 = local203 + local174;
								local266 = local178 + local256;
								if (local11 <= local262 && local266 >= local17 && Static17.method239(local262, arg0, local266, local195)) {
									local289 = local195;
									if (Static195.method3034(local262, local266)) {
										local289 = local195 - 1;
									}
									if (local289 >= 0) {
										Static386.method5372(local40, local262, local203 * 4, (Static57.anInt850 - local256) * 4 - 4, arg1, local266, local289, local149);
									}
								}
							}
						}
					}
				}
				if (Static84.aBoolean504) {
					@Pc(340) Class181 local340 = Static20.aClass181Array2[arg0];
					for (local203 = 0; local203 < Static57.anInt850; local203++) {
						for (local256 = 0; local256 < Static57.anInt850; local256++) {
							local262 = local174 + local203;
							local266 = local178 + local256;
							local289 = local340.anIntArrayArray29[local262 - local340.anInt4723][local266 - local340.anInt4725];
							if ((local289 & 0x40240000) != 0) {
								arg1.method4600(4, local203 * 4, -1713569622, 4, (Static57.anInt850 - local256) * 4 - 4);
							} else if ((local289 & 0x800000) != 0) {
								arg1.method4594(local203 * 4, -1713569622, 4, (Static57.anInt850 - local256) * 4 - 4);
							} else if ((local289 & 0x2000000) != 0) {
								arg1.method4583(-1713569622, 4, local203 * 4 + 3, (-local256 + Static57.anInt850) * 4 + -4);
							} else if ((local289 & 0x8000000) != 0) {
								arg1.method4594(local203 * 4, -1713569622, 4, (Static57.anInt850 - local256) * 4 - 1);
							} else if ((local289 & 0x20000000) != 0) {
								arg1.method4583(-1713569622, 4, local203 * 4, (Static57.anInt850 - local256) * 4 - 4);
							}
						}
					}
				}
				arg1.NA(0, 0, Static57.anInt850 * 4, Static57.anInt850 * 4, local168, 2);
				Static319.aClass78_18.W((local174 - local11) * 4 + 48, -(Static57.anInt850 * 4) + 464 + -((-local17 + local178) * 4), Static57.anInt850 * 4, Static57.anInt850 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.M(-16777215);
		Static197.method3044();
		Static444.anInt7690 = 0;
		Static216.aClass142_21.method3206();
		if (!Static84.aBoolean504) {
			for (local178 = local11; local178 < local11 + 104; local178++) {
				for (local195 = local17; local195 < local17 + 104; local195++) {
					for (local199 = arg0; local199 <= arg0 + 1 && local199 <= 3; local199++) {
						if (Static17.method239(local178, arg0, local195, local199)) {
							@Pc(621) Interface11 local621 = (Interface11) Static112.method1764(local199, local178, local195);
							if (local621 == null) {
								local621 = (Interface11) Static286.method3918(local199, local178, local195, rq.class);
							}
							if (local621 == null) {
								local621 = (Interface11) Static208.method3165(local199, local178, local195);
							}
							if (local621 == null) {
								local621 = (Interface11) Static170.method2638(local199, local178, local195);
							}
							if (local621 != null) {
								@Pc(662) Class29 local662 = Static251.aClass207_2.method4977(local621.method5744());
								if (!local662.aBoolean39 || Static175.aBoolean433) {
									local262 = local662.anInt573;
									if (local662.anIntArray36 != null) {
										for (local266 = 0; local266 < local662.anIntArray36.length; local266++) {
											if (local662.anIntArray36[local266] != -1) {
												@Pc(691) Class29 local691 = Static251.aClass207_2.method4977(local662.anIntArray36[local266]);
												if (local691.anInt573 >= 0) {
													local262 = local691.anInt573;
												}
											}
										}
									}
									if (local262 >= 0) {
										@Pc(717) boolean local717 = false;
										if (local262 >= 0) {
											@Pc(729) Class52 local729 = Static86.aClass103_2.method2055(local262);
											if (local729 != null && local729.aBoolean102) {
												local717 = true;
											}
										}
										local289 = local178;
										@Pc(740) int local740 = local195;
										if (local717) {
											@Pc(747) int[][] local747 = Static20.aClass181Array2[local199].anIntArrayArray29;
											@Pc(752) int local752 = Static20.aClass181Array2[local199].anInt4723;
											@Pc(757) int local757 = Static20.aClass181Array2[local199].anInt4725;
											for (@Pc(759) int local759 = 0; local759 < 10; local759++) {
												@Pc(766) int local766 = (int) (Math.random() * 4.0D);
												if (local766 == 0 && local289 > local11 && local178 - 3 < local289 && (local747[local289 - local752 - 1][local740 - local757] & 0x2C0108) == 0) {
													local289--;
												}
												if (local766 == 1 && local289 < local11 + 104 - 1 && local289 < local178 + 3 && (local747[local289 + 1 - local752][local740 - local757] & 0x2C0180) == 0) {
													local289++;
												}
												if (local766 == 2 && local740 > local17 && local195 - 3 < local740 && (local747[local289 - local752][local740 - local757 - 1] & 0x2C0102) == 0) {
													local740--;
												}
												if (local766 == 3 && local17 + 103 > local740 && local740 < local195 + 3 && (local747[local289 - local752][local740 + 1 - local757] & 0x2C0120) == 0) {
													local740++;
												}
											}
										}
										Static264.anIntArray352[Static444.anInt7690] = local662.anInt545;
										Static310.anIntArray398[Static444.anInt7690] = local289;
										Static58.anIntArray53[Static444.anInt7690] = local740;
										Static444.anInt7690++;
									}
								}
							}
						}
					}
				}
			}
			if (Static212.aClass84_1 != null) {
				Static225.aClass109_57.anInt2631 = 1;
				Static86.aClass103_2.method2054(1024, 64);
				for (local195 = 0; local195 < Static212.aClass84_1.anInt2088; local195++) {
					local199 = Static212.aClass84_1.anIntArray108[local195];
					if (local199 >> 28 == Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) {
						local203 = (local199 >> 14 & 0x3FFF) - Static190.anInt3507;
						local256 = (local199 & 0x3FFF) - Static331.anInt6034;
						if (local203 >= 0 && local203 < Static80.anInt6558 && local256 >= 0 && Static104.anInt2048 > local256) {
							Static216.aClass142_21.method3212(new Class1_Sub37(local195));
						} else {
							@Pc(1032) Class52 local1032 = Static86.aClass103_2.method2055(Static212.aClass84_1.anIntArray109[local195]);
							if (local1032.anIntArray56 != null && local203 + local1032.anInt1200 >= 0 && local1032.anInt1196 + local203 < Static80.anInt6558 && local256 + local1032.anInt1190 >= 0 && Static104.anInt2048 > local1032.anInt1191 + local256) {
								Static216.aClass142_21.method3212(new Class1_Sub37(local195));
							}
						}
					}
				}
				Static86.aClass103_2.method2054(128, 64);
				Static225.aClass109_57.anInt2631 = 2;
				Static225.aClass109_57.method2329();
			}
		}
		return true;
	}
}
