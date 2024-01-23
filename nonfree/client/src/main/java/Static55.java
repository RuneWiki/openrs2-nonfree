import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "[Lclient!wb;")
	public static Class4_Sub2_Sub4[] aClass4_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public static int anInt1241 = 0;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public static int anInt1243 = 99;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString42 = "Allocating memory";

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString43 = "Prepared sound engine";

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	public static int anInt1250 = -1;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	public static int anInt1252 = 0;

	@OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
	public static int anInt1253 = 7759444;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	public static void method1058() {
		for (@Pc(10) Class4_Sub20 local10 = (Class4_Sub20) Static46.aClass17_5.method613(); local10 != null; local10 = (Class4_Sub20) Static46.aClass17_5.method607()) {
			if (local10.anInt2621 > 0) {
				local10.anInt2621--;
			}
			if (local10.anInt2621 != 0) {
				if (local10.anInt2632 > 0) {
					local10.anInt2632--;
				}
				if (local10.anInt2632 == 0 && local10.anInt2629 >= 1 && local10.anInt2619 >= 1 && local10.anInt2629 <= 102 && local10.anInt2619 <= 102 && (local10.anInt2630 < 0 || Static303.method4651(local10.anInt2630, local10.anInt2618))) {
					Static139.method2236(local10.anInt2629, local10.anInt2618, local10.anInt2619, local10.anInt2628, local10.anInt2631, local10.anInt2630, local10.anInt2617);
					local10.anInt2632 = -1;
					if (local10.anInt2630 == local10.anInt2623 && local10.anInt2623 == -1) {
						local10.method4690();
					} else if (local10.anInt2630 == local10.anInt2623 && local10.anInt2622 == local10.anInt2617 && local10.anInt2634 == local10.anInt2618) {
						local10.method4690();
					}
				}
			} else if (local10.anInt2623 < 0 || Static303.method4651(local10.anInt2623, local10.anInt2634)) {
				Static139.method2236(local10.anInt2629, local10.anInt2634, local10.anInt2619, local10.anInt2628, local10.anInt2631, local10.anInt2623, local10.anInt2622);
				local10.method4690();
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[[[Lclient!k;IIZ)Z")
	public static boolean method1059(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub21[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static180.anInt3623 & 0xFF);
		if (Static185.aByteArrayArrayArray10[Static222.anInt4467][arg3][arg2] == local14) {
			return false;
		} else if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(53) byte local53 = 0;
			Static178.anIntArray301[0] = arg3;
			@Pc(60) int local60 = local53 + 1;
			Static82.anIntArray146[0] = arg2;
			@Pc(64) int local64 = 0;
			Static185.aByteArrayArrayArray10[Static222.anInt4467][arg3][arg2] = local14;
			while (local64 != local60) {
				@Pc(83) int local83 = Static178.anIntArray301[local64] >> 16 & 0xFF;
				@Pc(91) int local91 = Static178.anIntArray301[local64] >> 24 & 0xFF;
				@Pc(93) boolean local93 = false;
				@Pc(99) int local99 = Static82.anIntArray146[local64] & 0xFFFF;
				@Pc(105) int local105 = Static178.anIntArray301[local64] & 0xFFFF;
				@Pc(113) int local113 = Static82.anIntArray146[local64] >> 16 & 0xFF;
				if ((Static27.aByteArrayArrayArray2[Static222.anInt4467][local105][local99] & 0x4) == 0) {
					local93 = true;
				}
				@Pc(131) boolean local131 = false;
				@Pc(135) int local135;
				@Pc(175) int local175;
				label241: for (local135 = Static222.anInt4467 + 1; local135 <= 3; local135++) {
					if ((Static27.aByteArrayArrayArray2[local135][local105][local99] & 0x8) == 0) {
						@Pc(214) int local214;
						@Pc(341) int local341;
						if (local93 && arg1[local135][local105][local99] != null) {
							if (arg1[local135][local105][local99].aClass181_1 != null) {
								local175 = Static288.method4501(local83);
								if (local175 == arg1[local135][local105][local99].aClass181_1.anInt5713 || arg1[local135][local105][local99].aClass181_1.anInt5718 == local175) {
									continue;
								}
								if (local91 != 0) {
									local214 = Static288.method4501(local91);
									if (local214 == arg1[local135][local105][local99].aClass181_1.anInt5713 || local214 == arg1[local135][local105][local99].aClass181_1.anInt5718) {
										continue;
									}
								}
								if (local113 != 0) {
									local214 = Static288.method4501(local113);
									if (arg1[local135][local105][local99].aClass181_1.anInt5713 == local214 || local214 == arg1[local135][local105][local99].aClass181_1.anInt5718) {
										continue;
									}
								}
							}
							if (arg1[local135][local105][local99].aClass99Array19 != null) {
								for (local175 = 0; local175 < arg1[local135][local105][local99].anInt2694; local175++) {
									local214 = (int) (arg1[local135][local105][local99].aClass99Array19[local175].aLong117 >> 14 & 0x3FL);
									@Pc(327) int local327 = (int) (arg1[local135][local105][local99].aClass99Array19[local175].aLong117 >> 20 & 0x3L);
									if (local214 == 21) {
										local214 = 19;
									}
									local341 = local327 << 6 | local214;
									if (local83 == local341 || local91 != 0 && local91 == local341 || local113 != 0 && local341 == local113) {
										continue label241;
									}
								}
							}
						}
						local131 = true;
						@Pc(374) Class4_Sub21 local374 = arg1[local135][local105][local99];
						if (local374 != null && local374.anInt2694 > 0) {
							for (local214 = 0; local214 < local374.anInt2694; local214++) {
								@Pc(394) Class99 local394 = local374.aClass99Array19[local214];
								if (local394.anInt3225 != local394.anInt3223 || local394.anInt3221 != local394.anInt3222) {
									for (local341 = local394.anInt3225; local341 <= local394.anInt3223; local341++) {
										for (@Pc(422) int local422 = local394.anInt3222; local422 <= local394.anInt3221; local422++) {
											Static185.aByteArrayArrayArray10[local135][local341][local422] = local14;
										}
									}
								}
							}
						}
						Static185.aByteArrayArrayArray10[local135][local105][local99] = local14;
					}
				}
				if (local131) {
					local135 = local105 << 7;
					if (Static154.anIntArrayArrayArray5[Static222.anInt4467 + 1][local105][local99] > Static241.anIntArray379[arg0]) {
						Static241.anIntArray379[arg0] = Static154.anIntArrayArrayArray5[Static222.anInt4467 + 1][local105][local99];
					}
					local175 = local99 << 7;
					if (Static1.anIntArray1[arg0] > local135) {
						Static1.anIntArray1[arg0] = local135;
					} else if (local135 > Static307.anIntArray488[arg0]) {
						Static307.anIntArray488[arg0] = local135;
					}
					if (Static237.anIntArray377[arg0] > local175) {
						Static237.anIntArray377[arg0] = local175;
					} else if (Static148.anIntArray236[arg0] < local175) {
						Static148.anIntArray236[arg0] = local175;
					}
				}
				local64 = local64 + 1 & 0xFFF;
				if (!local93) {
					if (local105 >= 1 && Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] != local14) {
						Static178.anIntArray301[local60] = local105 - 1 | 0x120000 | 0xD3000000;
						Static82.anIntArray146[local60] = local99 | 0x130000;
						Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local99++;
					if (local99 < 104) {
						if (local105 - 1 >= 0 && local14 != Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105][local99] & 0x4) == 0 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105 - 1][local99 - 1] & 0x4) == 0) {
							Static178.anIntArray301[local60] = local105 - 1 | 0x120000 | 0x52000000;
							Static82.anIntArray146[local60] = local99 | 0x130000;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local14 != Static185.aByteArrayArrayArray10[Static222.anInt4467][local105][local99]) {
							Static178.anIntArray301[local60] = local105 | 0x13000000 | 0x520000;
							Static82.anIntArray146[local60] = local99 | 0x530000;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105][local99] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local105 + 1 < 104 && local14 != Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99] && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105][local99] & 0x4) == 0 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105 + 1][local99 - 1] & 0x4) == 0) {
							Static178.anIntArray301[local60] = local105 + 1 | 0x520000 | 0x92000000;
							Static82.anIntArray146[local60] = local99 | 0x530000;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local99--;
					if (local105 + 1 < 104 && local14 != Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99]) {
						Static178.anIntArray301[local60] = local105 + 1 | 0x920000 | 0x53000000;
						Static82.anIntArray146[local60] = local99 | 0x930000;
						Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local99--;
					if (local99 >= 0) {
						if (local105 - 1 >= 0 && Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] != local14 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105][local99] & 0x4) == 0 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105 - 1][local99 + 1] & 0x4) == 0) {
							Static178.anIntArray301[local60] = local105 - 1 | 0x12000000 | 0xD20000;
							Static82.anIntArray146[local60] = local99 | 0xD30000;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 - 1][local99] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static185.aByteArrayArrayArray10[Static222.anInt4467][local105][local99] != local14) {
							Static178.anIntArray301[local60] = 0x93000000 | 0xD20000 | local105;
							Static82.anIntArray146[local60] = local99 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105][local99] = local14;
						}
						if (local105 + 1 < 104 && local14 != Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99] && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105][local99] & 0x4) == 0 && (Static27.aByteArrayArrayArray2[Static222.anInt4467][local105 + 1][local99 + 1] & 0x4) == 0) {
							Static178.anIntArray301[local60] = local105 + 1 | 0xD2000000 | 0x920000;
							Static82.anIntArray146[local60] = local99 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static185.aByteArrayArrayArray10[Static222.anInt4467][local105 + 1][local99] = local14;
						}
					}
				}
			}
			if (Static241.anIntArray379[arg0] != -1000000) {
				Static241.anIntArray379[arg0] += 10;
				Static1.anIntArray1[arg0] -= 50;
				Static307.anIntArray488[arg0] += 50;
				Static148.anIntArray236[arg0] += 50;
				Static237.anIntArray377[arg0] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!pi;Ljava/lang/String;I)I")
	public static int method1061(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) String arg1) {
		@Pc(2) int local2 = arg0.anInt3822;
		@Pc(6) byte[] local6 = Static152.method2440(arg1);
		arg0.method3092(local6.length);
		arg0.anInt3822 += Static120.aClass69_5.method1825(local6, arg0.aByteArray47, 0, arg0.anInt3822, local6.length);
		return arg0.anInt3822 - local2;
	}
}
