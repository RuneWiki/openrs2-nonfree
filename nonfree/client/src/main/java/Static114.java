import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!vn;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public static void method1406(@OriginalArg(1) int arg0) {
		Static232.anInt4196 = -1;
		Static47.anInt678 = 3;
		Static80.anInt1104 = 100;
		Static32.anInt496 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lclient!dj;")
	public static Class11_Sub3 method1407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_2;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1409(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
	public static void method1410() {
		Static282.aClass77_36.method1386(5);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!za;Lclient!ge;IIIII)V")
	public static void method1411(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static112.anInt1710) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static174.anInt2873) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static325.anInt5351 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class216 local62 = Static259.aClass216ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static452.aClass139Array3[local17].ua(local23, local32) + Static452.aClass139Array3[local17].ua(local23 + 1, local32) + Static452.aClass139Array3[local17].ua(local23, local32 + 1) + Static452.aClass139Array3[local17].ua(local23 + 1, local32 + 1)) / 4 - (Static452.aClass139Array3[arg2].ua(arg3, arg4) + Static452.aClass139Array3[arg2].ua(arg3 + 1, arg4) + Static452.aClass139Array3[arg2].ua(arg3, arg4 + 1) + Static452.aClass139Array3[arg2].ua(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub3 local143 = local62.aClass11_Sub3_3;
									@Pc(146) Class11_Sub3 local146 = local62.aClass11_Sub3_2;
									if (local143 != null && local143.method5183()) {
										arg1.method5179(arg0, local140, local143, (local23 - arg3) * Static383.anInt6136 + (1 - arg5) * Static324.anInt5325, local1, (local32 - arg4) * Static383.anInt6136 + (1 - arg6) * Static324.anInt5325);
									}
									if (local146 != null && local146.method5183()) {
										arg1.method5179(arg0, local140, local146, (local23 - arg3) * Static383.anInt6136 + (1 - arg5) * Static324.anInt5325, local1, (local32 - arg4) * Static383.anInt6136 + (1 - arg6) * Static324.anInt5325);
									}
									for (@Pc(219) Class259 local219 = local62.aClass259_1; local219 != null; local219 = local219.aClass259_4) {
										@Pc(223) Class11_Sub1 local223 = local219.aClass11_Sub1_2;
										if (local223 != null && local223.method5183() && (local23 == local223.aShort103 || local23 == local3) && (local32 == local223.aShort101 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort100 + 1 - local223.aShort103;
											@Pc(260) int local260 = local223.aShort102 + 1 - local223.aShort101;
											arg1.method5179(arg0, local140, local223, (local223.aShort103 - arg3) * Static383.anInt6136 + (local252 - arg5) * Static324.anInt5325, local1, (local223.aShort101 - arg4) * Static383.anInt6136 + (local260 - arg6) * Static324.anInt5325);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!za;II)Z")
	public static boolean method1412(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static147.anInt2300 - 104) / 2;
		@Pc(17) int local17 = (Static293.anInt4886 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static140.method1765(arg1, local21, local25, local29)) {
						local40 = local29;
						if (Static141.method4892(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static177.method2571(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static353.aClass85_17 = arg0.method5700(local86, 512, 512, 512);
		Static387.method4979();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238) + (int) (Math.random() * 20.0D) - 10 | 0xFF000000;
		@Pc(157) int local157 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x8528FF00) << 16;
		@Pc(176) int local176 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(185) boolean[][] local185 = new boolean[Static95.anInt6484][Static95.anInt6484];
		@Pc(191) int local191;
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(216) int local216;
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(295) int local295;
		for (@Pc(187) int local187 = local11; local187 < local11 + 104; local187 += Static95.anInt6484) {
			for (local191 = local17; local191 < local17 + 104; local191 += Static95.anInt6484) {
				arg0.ba(0, 0, Static95.anInt6484 * 4, Static95.anInt6484 * 4);
				arg0.t(-16777216);
				for (local208 = arg1; local208 <= 3; local208++) {
					for (local212 = 0; local212 < Static95.anInt6484; local212++) {
						for (local216 = 0; local216 < Static95.anInt6484; local216++) {
							local185[local212][local216] = Static140.method1765(arg1, local212 + local187, local216 + local191, local208);
						}
					}
					Static157.aClass139Array1[local208].method5368(local187, local191, Static95.anInt6484 + local187, Static95.anInt6484 + local191, local185);
					if (!Static34.aBoolean77) {
						for (local216 = -4; local216 < Static95.anInt6484; local216++) {
							for (local265 = -4; local265 < Static95.anInt6484; local265++) {
								local272 = local187 + local216;
								local276 = local265 + local191;
								if (local272 >= local11 && local17 <= local276 && Static140.method1765(arg1, local272, local276, local208)) {
									local295 = local208;
									if (Static141.method4892(local276, local272)) {
										local295 = local208 - 1;
									}
									if (local295 >= 0) {
										Static392.method5091(local157, arg0, local295, local276, local272, (Static95.anInt6484 - local265) * 4 - 4, local216 * 4, local40);
									}
								}
							}
						}
					}
				}
				if (Static34.aBoolean77) {
					@Pc(352) Class158 local352 = Static385.aClass158Array1[arg1];
					for (local216 = 0; local216 < Static95.anInt6484; local216++) {
						for (local265 = 0; local265 < Static95.anInt6484; local265++) {
							local272 = local216 + local187;
							local276 = local191 + local265;
							local295 = local352.anIntArrayArray39[local272 - local352.anInt4542][local276 - local352.anInt4550];
							if ((local295 & 0x40240000) != 0) {
								arg0.method5664(4, (Static95.anInt6484 - local265) * 4 - 4, -1713569622, 4, local216 * 4);
							} else if ((local295 & 0x800000) != 0) {
								arg0.method5658(local216 * 4, -1713569622, 4, (Static95.anInt6484 - local265) * 4 - 4);
							} else if ((local295 & 0x2000000) != 0) {
								arg0.method5656(local216 * 4 + 3, 4, -1713569622, (Static95.anInt6484 - local265) * 4 - 4);
							} else if ((local295 & 0x8000000) != 0) {
								arg0.method5658(local216 * 4, -1713569622, 4, (-local265 + Static95.anInt6484) * 4 + 3 - 4);
							} else if ((local295 & 0x20000000) != 0) {
								arg0.method5656(local216 * 4, 4, -1713569622, (Static95.anInt6484 - local265) * 4 - 4);
							}
						}
					}
				}
				arg0.P(0, 0, Static95.anInt6484 * 4, Static95.anInt6484 * 4, local176, 2);
				Static353.aClass85_17.XA((local187 - local11) * 4 + 48, 464 - ((local191 + -local17) * 4 + Static95.anInt6484 * 4), Static95.anInt6484 * 4, Static95.anInt6484 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.t(-16777215);
		Static186.method2688();
		Static122.anInt1845 = 0;
		Static278.aClass14_39.method204();
		if (!Static34.aBoolean77) {
			for (local191 = local11; local191 < local11 + 104; local191++) {
				for (local208 = local17; local208 < local17 + 104; local208++) {
					for (local212 = arg1; arg1 + 1 >= local212 && local212 <= 3; local212++) {
						if (Static140.method1765(arg1, local191, local208, local212)) {
							@Pc(618) Interface7 local618 = (Interface7) Static168.method2856(local212, local191, local208);
							if (local618 == null) {
								local618 = (Interface7) Static423.method5398(local212, local191, local208, nc.class);
							}
							if (local618 == null) {
								local618 = (Interface7) Static464.method5366(local212, local191, local208);
							}
							if (local618 == null) {
								local618 = (Interface7) Static282.method3773(local212, local191, local208);
							}
							if (local618 != null) {
								@Pc(659) Class87 local659 = Static86.aClass248_7.method5246(local618.method4895());
								if (!local659.aBoolean210 || Static422.aBoolean591) {
									local272 = local659.anInt1929;
									if (local659.anIntArray170 != null) {
										for (local276 = 0; local276 < local659.anIntArray170.length; local276++) {
											if (local659.anIntArray170[local276] != -1) {
												@Pc(689) Class87 local689 = Static86.aClass248_7.method5246(local659.anIntArray170[local276]);
												if (local689.anInt1929 >= 0) {
													local272 = local689.anInt1929;
												}
											}
										}
									}
									if (local272 >= 0) {
										@Pc(712) boolean local712 = false;
										if (local272 >= 0) {
											@Pc(722) Class128 local722 = Static205.aClass36_2.method659(local272);
											if (local722 != null && local722.aBoolean338) {
												local712 = true;
											}
										}
										local295 = local191;
										@Pc(733) int local733 = local208;
										if (local712) {
											@Pc(740) int[][] local740 = Static385.aClass158Array1[local212].anIntArrayArray39;
											@Pc(745) int local745 = Static385.aClass158Array1[local212].anInt4542;
											@Pc(750) int local750 = Static385.aClass158Array1[local212].anInt4550;
											for (@Pc(752) int local752 = 0; local752 < 10; local752++) {
												@Pc(759) int local759 = (int) (Math.random() * 4.0D);
												if (local759 == 0 && local11 < local295 && local295 > local191 - 3 && (local740[local295 - local745 - 1][local733 - local750] & 0x2C0108) == 0) {
													local295--;
												}
												if (local759 == 1 && local11 + 103 > local295 && local295 < local191 + 3 && (local740[local295 + 1 - local745][local733 - local750] & 0x2C0180) == 0) {
													local295++;
												}
												if (local759 == 2 && local733 > local17 && local208 - 3 < local733 && (local740[local295 - local745][local733 - local750 - 1] & 0x2C0102) == 0) {
													local733--;
												}
												if (local759 == 3 && local17 + 104 - 1 > local733 && local208 + 3 > local733 && (local740[local295 - local745][local733 + 1 - local750] & 0x2C0120) == 0) {
													local733++;
												}
											}
										}
										Static365.anIntArray447[Static122.anInt1845] = local659.anInt1925;
										Static270.anIntArray172[Static122.anInt1845] = local295;
										Static361.anIntArray440[Static122.anInt1845] = local733;
										Static122.anInt1845++;
									}
								}
							}
						}
					}
				}
			}
			if (Static376.aClass144_3 != null) {
				Static98.aClass185_30.anInt5029 = 1;
				Static205.aClass36_2.method660(1024, 64);
				for (local208 = 0; local208 < Static376.aClass144_3.anInt4097; local208++) {
					local212 = Static376.aClass144_3.anIntArray289[local208];
					if (local212 >> 28 == Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90) {
						local216 = (local212 >> 14 & 0x3FFF) - Static315.anInt5207;
						local265 = (local212 & 0x3FFF) - Static47.anInt676;
						if (local216 >= 0 && Static147.anInt2300 > local216 && local265 >= 0 && Static293.anInt4886 > local265) {
							Static278.aClass14_39.method205(new Class1_Sub18(local208));
						} else {
							@Pc(1016) Class128 local1016 = Static205.aClass36_2.method659(Static376.aClass144_3.anIntArray290[local208]);
							if (local1016.anIntArray259 != null && local216 + local1016.anInt3481 >= 0 && local216 + local1016.anInt3480 < Static147.anInt2300 && local1016.anInt3482 + local265 >= 0 && Static293.anInt4886 > local265 + local1016.anInt3487) {
								Static278.aClass14_39.method205(new Class1_Sub18(local208));
							}
						}
					}
				}
				Static205.aClass36_2.method660(128, 64);
				Static98.aClass185_30.anInt5029 = 2;
				Static98.aClass185_30.method4023();
			}
		}
		return true;
	}
}
