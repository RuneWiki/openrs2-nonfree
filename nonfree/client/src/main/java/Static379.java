import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!fc;")
	public static Class96 aClass96_12;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public static int anInt7382 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!qa;B)Z")
	public static boolean method6614(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(11) int local11 = (Static237.anInt4563 - 104) / 2;
		@Pc(17) int local17 = (Static373.anInt6694 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static29.method801(local21, local29, arg0, local25)) {
						local40 = local29;
						if (Static4.method186(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static419.method6567(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static47.aClass104_20 = arg1.method7156(local84, 512, 512, 512);
		Static197.method3753();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(182) boolean[][] local182 = new boolean[Static440.anInt7701 + 1][Static440.anInt7701 + 1];
		@Pc(188) int local188;
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(196) int local196;
		@Pc(202) int local202;
		@Pc(210) int local210;
		@Pc(220) int local220;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(300) int local300;
		@Pc(307) int local307;
		@Pc(311) int local311;
		@Pc(334) int local334;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static440.anInt7701) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static440.anInt7701) {
				local192 = 0;
				local194 = 0;
				local196 = local184;
				if (local184 > 0) {
					local196 = local184 - 1;
					local192 += 4;
				}
				local202 = local188;
				if (local188 > 0) {
					local202 = local188 - 1;
				}
				local210 = local184 + Static440.anInt7701;
				if (local210 < 104) {
					local210++;
				}
				local220 = local188 + Static440.anInt7701;
				if (local220 < 104) {
					local194 += 4;
					local220++;
				}
				arg1.N(0, 0, Static440.anInt7701 * 4 + local192, local194 - -(Static440.anInt7701 * 4));
				arg1.Z(-16777216);
				@Pc(255) int local255;
				for (local247 = arg0; local247 <= 3; local247++) {
					for (local251 = 0; local251 <= Static440.anInt7701; local251++) {
						for (local255 = 0; local255 <= Static440.anInt7701; local255++) {
							local182[local251][local255] = Static29.method801(local251 + local196, local247, arg0, local255 + local202);
						}
					}
					Static411.aClass7Array12[local247].method8245(local196, local202, local210, local220, local182);
					if (!Static532.aBoolean702) {
						for (local255 = -4; local255 < Static440.anInt7701; local255++) {
							for (local300 = -4; local300 < Static440.anInt7701; local300++) {
								local307 = local184 + local255;
								local311 = local300 + local188;
								if (local307 >= local11 && local311 >= local17 && Static29.method801(local307, local247, arg0, local311)) {
									local334 = local247;
									if (Static4.method186(local311, local307)) {
										local334 = local247 - 1;
									}
									if (local334 >= 0) {
										Static63.method1572(local307, local311, (Static440.anInt7701 - local300) * 4 + local194 - 4, local40, arg1, local334, local192 + local255 * 4, local155);
									}
								}
							}
						}
					}
				}
				if (Static532.aBoolean702) {
					@Pc(386) Class243 local386 = Static362.aClass243Array5[arg0];
					for (local255 = 0; local255 < Static440.anInt7701; local255++) {
						for (local300 = 0; local300 < Static440.anInt7701; local300++) {
							local307 = local184 + local255;
							local311 = local300 + local188;
							local334 = local386.anIntArrayArray95[local307 - local386.anInt7190][local311 - local386.anInt7169];
							if ((local334 & 0x40240000) != 0) {
								arg1.method7162(-1713569622, 4, local192 + local255 * 4, (-local300 + Static440.anInt7701) * 4 + -4 + local194, 4);
							} else if ((local334 & 0x800000) != 0) {
								arg1.method7157(4, -1713569622, local194 + (Static440.anInt7701 - local300) * 4 - 4, local192 - -(local255 * 4));
							} else if ((local334 & 0x2000000) != 0) {
								arg1.method7224(local255 * 4 + local192 + 3, 4, -1713569622, local194 + (Static440.anInt7701 - local300) * 4 - 4);
							} else if ((local334 & 0x8000000) != 0) {
								arg1.method7157(4, -1713569622, (Static440.anInt7701 - local300) * 4 + local194 + 3 - 4, local192 - -(local255 * 4));
							} else if ((local334 & 0x20000000) != 0) {
								arg1.method7224(local255 * 4 + local192, 4, -1713569622, (Static440.anInt7701 - local300) * 4 + local194 - 4);
							}
						}
					}
				}
				arg1.f(local192, local194, Static440.anInt7701 * 4, Static440.anInt7701 * 4, local174, 2);
				Static47.aClass104_20.P((local184 - local11) * 4 + 48, -(Static440.anInt7701 * 4) + 464 + -((-local17 + local188) * 4), Static440.anInt7701 * 4, Static440.anInt7701 * 4, local192, local194);
			}
		}
		arg1.n();
		arg1.Z(-16777215);
		Static402.method6385();
		Static287.anInt7763 = 0;
		Static210.aClass295_17.method7541();
		if (!Static532.aBoolean702) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local192 = local17; local192 < local17 + 104; local192++) {
					for (local194 = arg0; local194 <= arg0 + 1 && local194 <= 3; local194++) {
						if (Static29.method801(local188, local194, arg0, local192)) {
							@Pc(680) Interface7 local680 = (Interface7) Static465.method7066(local194, local188, local192);
							if (local680 == null) {
								local680 = (Interface7) Static100.method2041(local194, local188, local192, fp.class);
							}
							if (local680 == null) {
								local680 = (Interface7) Static47.method5108(local194, local188, local192);
							}
							if (local680 == null) {
								local680 = (Interface7) Static544.method6945(local194, local188, local192);
							}
							if (local680 != null) {
								@Pc(723) Class51 local723 = Static398.aClass18_4.method609(local680.method8046());
								if (!local723.aBoolean134 || Static343.aBoolean696) {
									local210 = local723.anInt1653;
									if (local723.anIntArray108 != null) {
										for (local220 = 0; local220 < local723.anIntArray108.length; local220++) {
											if (local723.anIntArray108[local220] != -1) {
												@Pc(752) Class51 local752 = Static398.aClass18_4.method609(local723.anIntArray108[local220]);
												if (local752.anInt1653 >= 0) {
													local210 = local752.anInt1653;
												}
											}
										}
									}
									if (local210 >= 0) {
										@Pc(772) boolean local772 = false;
										if (local210 >= 0) {
											@Pc(782) Class65 local782 = Static193.aClass32_2.method1129(local210);
											if (local782 != null && local782.aBoolean158) {
												local772 = true;
											}
										}
										local247 = local188;
										local251 = local192;
										if (local772) {
											@Pc(800) int[][] local800 = Static362.aClass243Array5[local194].anIntArrayArray95;
											local300 = Static362.aClass243Array5[local194].anInt7190;
											local307 = Static362.aClass243Array5[local194].anInt7169;
											for (local311 = 0; local311 < 10; local311++) {
												local334 = (int) (Math.random() * 4.0D);
												if (local334 == 0 && local247 > local11 && local247 > local188 - 3 && (local800[local247 - local300 - 1][local251 - local307] & 0x2C0108) == 0) {
													local247--;
												}
												if (local334 == 1 && local247 < local11 + 104 - 1 && local247 < local188 + 3 && (local800[local247 + 1 - local300][local251 - local307] & 0x2C0180) == 0) {
													local247++;
												}
												if (local334 == 2 && local251 > local17 && local251 > local192 - 3 && (local800[local247 - local300][local251 - local307 - 1] & 0x2C0102) == 0) {
													local251--;
												}
												if (local334 == 3 && local17 + 104 - 1 > local251 && local192 + 3 > local251 && (local800[local247 - local300][local251 + 1 - local307] & 0x2C0120) == 0) {
													local251++;
												}
											}
										}
										Static435.anIntArray712[Static287.anInt7763] = local723.anInt1646;
										Static257.anIntArray412[Static287.anInt7763] = local247;
										Static314.anIntArray471[Static287.anInt7763] = local251;
										Static287.anInt7763++;
									}
								}
							}
						}
					}
				}
			}
			if (Static260.aClass214_3 != null) {
				Static205.aClass69_73.anInt2003 = 1;
				Static193.aClass32_2.method1130(1024, 64);
				for (local192 = 0; local192 < Static260.aClass214_3.anInt6341; local192++) {
					local194 = Static260.aClass214_3.anIntArray619[local192];
					if (local194 >> 28 == Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) {
						local196 = (local194 >> 14 & 0x3FFF) - Static538.anInt9485;
						local202 = (local194 & 0x3FFF) - Static282.anInt5380;
						if (local196 >= 0 && Static237.anInt4563 > local196 && local202 >= 0 && local202 < Static373.anInt6694) {
							Static210.aClass295_17.method7533(new Class1_Sub14(local192));
						} else {
							@Pc(1073) Class65 local1073 = Static193.aClass32_2.method1129(Static260.aClass214_3.anIntArray620[local192]);
							if (local1073.anIntArray125 != null && local196 + local1073.anInt1899 >= 0 && local196 + local1073.anInt1891 < Static237.anInt4563 && local1073.anInt1900 + local202 >= 0 && local1073.anInt1910 + local202 < Static373.anInt6694) {
								Static210.aClass295_17.method7533(new Class1_Sub14(local192));
							}
						}
					}
				}
				Static193.aClass32_2.method1130(128, 64);
				Static205.aClass69_73.anInt2003 = 2;
				Static205.aClass69_73.method1879();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)Z")
	public static boolean method6621(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
