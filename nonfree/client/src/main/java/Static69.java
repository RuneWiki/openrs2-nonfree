import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt1916;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!gm;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1918 = 100;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lclient!gaa;")
	public static Class110 method1634(@OriginalArg(1) int arg0) {
		@Pc(10) Class110 local10 = (Class110) Static490.aClass10_56.method250((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static23.aClass246_18.method5653(1, arg0);
		local10 = new Class110();
		local10.anInt3236 = arg0;
		if (local28 != null) {
			local10.method2876(new Class3_Sub11(local28));
		}
		local10.method2875();
		if (local10.anInt3240 == 2 && Static55.aClass310_3.method6601((long) arg0) == null) {
			Static55.aClass310_3.method6603(new Class3_Sub4(Static301.anInt5412), (long) arg0);
			Static407.aClass110Array1[Static301.anInt5412++] = local10;
		}
		Static490.aClass10_56.method254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1635(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static476.anInt8277;
		@Pc(3) int[] local3 = Static10.anIntArray19;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static49.anInt1058; local5++) {
			@Pc(15) Class9_Sub1_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local3[local5]];
			} else {
				local15 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local5 - local1])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			}
			if (local15.aByte126 == arg0 && local15.anInt6455 >= 0) {
				@Pc(39) int local39 = local15.method5569();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8975 & 0x1FF) != 0 || (local15.anInt8980 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8975 & 0x1FF) != 256 || (local15.anInt8980 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8975 >> 9;
					local80 = local15.anInt8980 >> 9;
					if (local15.anInt6455 > Static162.anIntArrayArray26[local75][local80]) {
						Static162.anIntArrayArray26[local75][local80] = local15.anInt6455;
						Static316.anIntArrayArray70[local75][local80] = 1;
					} else if (local15.anInt6455 == Static162.anIntArrayArray26[local75][local80]) {
						local116 = Static316.anIntArrayArray70[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8975 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8980 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8975 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8980 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6455 > Static162.anIntArrayArray26[local158][local161]) {
								Static162.anIntArrayArray26[local158][local161] = local15.anInt6455;
								Static316.anIntArrayArray70[local158][local161] = 1;
							} else if (local15.anInt6455 == Static162.anIntArrayArray26[local158][local161]) {
								local116 = Static316.anIntArrayArray70[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1636() {
		for (@Pc(1) int local1 = 0; local1 < Static400.anInt6818; local1++) {
			@Pc(6) int[] local6 = Static162.anIntArrayArray26[local1];
			for (@Pc(8) int local8 = 0; local8 < Static271.anInt5050; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1637() {
		for (@Pc(15) Class3_Sub3_Sub19 local15 = (Class3_Sub3_Sub19) Static131.aClass130_11.method3543(); local15 != null; local15 = (Class3_Sub3_Sub19) Static131.aClass130_11.method3551()) {
			@Pc(20) Class9_Sub1_Sub1_Sub4 local20 = local15.aClass9_Sub1_Sub1_Sub4_1;
			if (local20.aBoolean332) {
				local15.method7812();
				local20.method3864();
			} else if (local20.anInt4367 <= Static305.anInt5560) {
				local20.method3866(Static14.anInt217);
				if (local20.aBoolean332) {
					local15.method7812();
				} else {
					Static216.method3774(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1638() {
		for (@Pc(7) int local7 = 0; local7 < Static236.anInt4467; local7++) {
			Static436.aClass241Array30[local7] = null;
		}
		Static236.anInt4467 = 0;
		@Pc(30) int local30;
		@Pc(34) int local34;
		for (@Pc(26) int local26 = 0; local26 < Static499.anInt7950; local26++) {
			for (local30 = 0; local30 < Static411.anInt6927; local30++) {
				for (local34 = 0; local34 < Static157.anInt3168; local34++) {
					@Pc(44) Class63 local44 = Static554.aClass63ArrayArrayArray4[local26][local34][local30];
					if (local44 != null) {
						if (local44.aShort28 > 0) {
							local44.aShort28 = (short) (local44.aShort28 * -1);
						}
						if (local44.aShort26 > 0) {
							local44.aShort26 = (short) (local44.aShort26 * -1);
						}
					}
				}
			}
		}
		for (local30 = 0; local30 < Static499.anInt7950; local30++) {
			for (local34 = 0; local34 < Static411.anInt6927; local34++) {
				for (@Pc(98) int local98 = 0; local98 < Static157.anInt3168; local98++) {
					@Pc(108) Class63 local108 = Static554.aClass63ArrayArrayArray4[local30][local98][local34];
					if (local108 != null) {
						@Pc(131) boolean local131 = Static554.aClass63ArrayArrayArray4[0][local98][local34] != null && Static554.aClass63ArrayArrayArray4[0][local98][local34].aClass63_1 != null;
						@Pc(136) int local136;
						@Pc(138) int local138;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(152) Class63 local152;
						@Pc(160) int local160;
						@Pc(311) int local311;
						@Pc(448) int local448;
						@Pc(456) int local456;
						@Pc(472) int local472;
						@Pc(480) int local480;
						@Pc(484) int local484;
						@Pc(488) int local488;
						@Pc(495) int local495;
						@Pc(533) int local533;
						@Pc(537) int local537;
						if (local108.aShort26 < 0) {
							local136 = local34;
							local138 = local34;
							local140 = local30;
							local142 = local30;
							local152 = Static554.aClass63ArrayArrayArray4[local30][local98][local34 - 1];
							local160 = Static374.aClass139Array17[local30].method6889(local98, local34);
							while (local136 > 0 && local152 != null && local152.aShort26 < 0 && local152.aShort26 == local108.aShort26 && local108.aShort29 == local152.aShort29 && Static374.aClass139Array17[local30].method6889(local98, local136 - 1) == local160 && (local136 - 1 <= 0 || Static374.aClass139Array17[local30].method6889(local98, local136 - 2) == local160)) {
								local136--;
								local152 = Static554.aClass63ArrayArrayArray4[local30][local98][local136 - 1];
							}
							for (local152 = Static554.aClass63ArrayArrayArray4[local30][local98][local34 + 1]; local138 < Static157.anInt3168 && local152 != null && local152.aShort26 < 0 && local108.aShort26 == local152.aShort26 && local152.aShort29 == local108.aShort29 && local160 == Static374.aClass139Array17[local30].method6889(local98, local138 + 1) && (local138 + 1 >= Static157.anInt3168 || local160 == Static374.aClass139Array17[local30].method6889(local98, local138 + 2)); local152 = Static554.aClass63ArrayArrayArray4[local30][local98][local138 + 1]) {
								local138++;
							}
							label289: while (local140 > 0) {
								for (local311 = local136; local311 <= local138; local311++) {
									if (Static554.aClass63ArrayArrayArray4[local140 - 1][local98][local311] == null || Static554.aClass63ArrayArrayArray4[local140 - 1][local98][local311].aShort26 != local108.aShort26 || local108.aShort29 != Static554.aClass63ArrayArrayArray4[local140 - 1][local98][local311].aShort29) {
										break label289;
									}
								}
								local140--;
							}
							label306: while (local142 < Static499.anInt7950 - 1) {
								for (local311 = local136; local311 <= local138; local311++) {
									if (Static554.aClass63ArrayArrayArray4[local142 + 1][local98][local311] == null || local108.aShort26 != Static554.aClass63ArrayArrayArray4[local142 + 1][local98][local311].aShort26 || Static554.aClass63ArrayArrayArray4[local142 + 1][local98][local311].aShort29 != local108.aShort29) {
										break label306;
									}
								}
								local142++;
							}
							local311 = local142 + 1 - local140;
							local448 = Static374.aClass139Array17[local131 ? local140 + 1 : local140].method6889(local98, local136);
							local456 = local448 + local311 * local108.aShort26;
							local472 = Static374.aClass139Array17[local131 ? local140 + 1 : local140].method6889(local98, local138 + 1);
							local480 = local472 + local108.aShort26 * local311;
							local484 = local98 << Static458.anInt7508;
							local488 = local136 << Static458.anInt7508;
							local495 = (local138 << Static458.anInt7508) + Static511.anInt8116;
							Static436.aClass241Array30[Static236.anInt4467++] = new Class241(1, local142, local108.aShort29 + local484, local484 + local108.aShort29, local108.aShort29 + local484, local108.aShort29 + local484, local448, local472, local480, local456, local488, local495, local495, local488);
							for (local533 = local140; local533 <= local142; local533++) {
								for (local537 = local136; local537 <= local138; local537++) {
									Static554.aClass63ArrayArrayArray4[local533][local98][local537].aShort26 = (short) (Static554.aClass63ArrayArrayArray4[local533][local98][local537].aShort26 * -1);
								}
							}
						}
						if (local108.aShort28 < 0) {
							local136 = local98;
							local138 = local98;
							local140 = local30;
							local142 = local30;
							local152 = Static554.aClass63ArrayArrayArray4[local30][local98 - 1][local34];
							local160 = Static374.aClass139Array17[local30].method6889(local98, local34);
							while (local136 > 0 && local152 != null && local152.aShort28 < 0 && local108.aShort28 == local152.aShort28 && local108.aShort27 == local152.aShort27 && Static374.aClass139Array17[local30].method6889(local136 - 1, local34) == local160 && (local136 - 1 <= 0 || Static374.aClass139Array17[local30].method6889(local136 - 2, local34) == local160)) {
								local136--;
								local152 = Static554.aClass63ArrayArrayArray4[local30][local136 - 1][local34];
							}
							for (local152 = Static554.aClass63ArrayArrayArray4[local30][local98 + 1][local34]; local138 < Static411.anInt6927 && local152 != null && local152.aShort28 < 0 && local152.aShort28 == local108.aShort28 && local152.aShort27 == local108.aShort27 && Static374.aClass139Array17[local30].method6889(local138 + 1, local34) == local160 && (Static411.anInt6927 <= local138 + 1 || Static374.aClass139Array17[local30].method6889(local138 + 2, local34) == local160); local152 = Static554.aClass63ArrayArrayArray4[local30][local138 + 1][local34]) {
								local138++;
							}
							label205: while (local140 > 0) {
								for (local311 = local136; local311 <= local138; local311++) {
									if (Static554.aClass63ArrayArrayArray4[local140 - 1][local311][local34] == null || Static554.aClass63ArrayArrayArray4[local140 - 1][local311][local34].aShort28 != local108.aShort28 || local108.aShort27 != Static554.aClass63ArrayArrayArray4[local140 - 1][local311][local34].aShort27) {
										break label205;
									}
								}
								local140--;
							}
							label190: while (Static499.anInt7950 - 1 > local142) {
								for (local311 = local136; local311 <= local138; local311++) {
									if (Static554.aClass63ArrayArrayArray4[local142 + 1][local311][local34] == null || Static554.aClass63ArrayArrayArray4[local142 + 1][local311][local34].aShort28 != local108.aShort28 || Static554.aClass63ArrayArrayArray4[local142 + 1][local311][local34].aShort27 != local108.aShort27) {
										break label190;
									}
								}
								local142++;
							}
							local311 = local142 + 1 - local140;
							local448 = Static374.aClass139Array17[local131 ? local140 + 1 : local140].method6889(local136, local34);
							local456 = local311 * local108.aShort28 + local448;
							local472 = Static374.aClass139Array17[local131 ? local140 + 1 : local140].method6889(local138 + 1, local34);
							local480 = local472 + local311 * local108.aShort28;
							local484 = local136 << Static458.anInt7508;
							local488 = Static511.anInt8116 + (local138 << Static458.anInt7508);
							local495 = local34 << Static458.anInt7508;
							Static436.aClass241Array30[Static236.anInt4467++] = new Class241(2, local142, local484, local488, local488, local484, local448, local472, local480, local456, local495 + local108.aShort27, local108.aShort27 + local495, local108.aShort27 + local495, local495 + local108.aShort27);
							for (local533 = local140; local533 <= local142; local533++) {
								for (local537 = local136; local537 <= local138; local537++) {
									Static554.aClass63ArrayArrayArray4[local533][local537][local34].aShort28 = (short) (Static554.aClass63ArrayArrayArray4[local533][local537][local34].aShort28 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static164.aBoolean268 = true;
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1641(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static476.anInt8277;
		@Pc(3) int[] local3 = Static10.anIntArray19;
		@Pc(11) int local11 = Static275.aBoolean396 ? local1 : local1 + Static49.anInt1058;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local13 - local1])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			}
			if (local23.aByte126 == arg0) {
				local23.anInt6399 = 0;
				if (local23.anInt6455 < 0) {
					local23.aBoolean527 = false;
				} else {
					@Pc(54) int local54 = local23.method5569();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8975 & 0x1FF) != 0 || (local23.anInt8980 & 0x1FF) != 0) {
							local23.aBoolean527 = false;
							continue;
						}
					} else if ((local23.anInt8975 & 0x1FF) != 256 || (local23.anInt8980 & 0x1FF) != 256) {
						local23.aBoolean527 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8975 >> 9;
						local101 = local23.anInt8980 >> 9;
						if (local23.anInt6455 != Static162.anIntArrayArray26[local96][local101]) {
							local23.aBoolean527 = true;
							continue;
						}
						if (Static316.anIntArrayArray70[local96][local101] > 1) {
							local126 = Static316.anIntArrayArray70[local96][local101]--;
							local23.aBoolean527 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8975 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8980 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8975 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8980 + local96 >> 9;
						if (!Static85.method1849(local162, local23.anInt6455, local155, local169, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6455 == Static162.anIntArrayArray26[local180][local183]) {
										local126 = Static316.anIntArrayArray70[local180][local183]--;
									}
								}
							}
							local23.aBoolean527 = true;
							continue;
						}
					}
					local23.aBoolean527 = false;
					local23.anInt8977 = Static130.method2562(local23.anInt8980, local23.aByte126, local23.anInt8975);
					Static216.method3774(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!lk;IIIIIIIII)V")
	public static void method1642(@OriginalArg(0) Class203[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class203 local6 = arg0[local1];
			if (local6 != null && local6.anInt5518 == arg1) {
				@Pc(17) int local17 = local6.anInt5527 + arg6;
				@Pc(22) int local22 = local6.anInt5440 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5473 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5513;
					@Pc(45) int local45 = local22 + local6.anInt5476;
					if (local6.anInt5473 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt5473 == 0 || local6.aBoolean439 || method1651(local6).anInt730 != 0 || local6 == Static215.aClass203_73 || local6.anInt5510 == Static591.anInt9388 || local6.anInt5510 == Static95.anInt657) {
					if (!method1646(local6)) {
						if (local6 == Static265.aClass203_82 && Static557.method7420(Static265.aClass203_82) != null) {
							Static178.aBoolean637 = true;
							Static271.anInt5048 = local17;
							Static577.anInt3692 = local22;
						}
						if (local6.aBoolean449 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean438 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class3_Sub45 local156 = (Class3_Sub45) Static146.aClass130_12.method3543(); local156 != null; local156 = (Class3_Sub45) Static146.aClass130_12.method3551()) {
									if (local156.aBoolean646) {
										local156.method7812();
										local156.aClass203_136.aBoolean445 = false;
									}
								}
								if (Static182.anInt3561 == 0) {
									Static265.aClass203_82 = null;
									Static215.aClass203_73 = null;
								}
								Static366.anInt6302 = 0;
								Static458.aBoolean594 = false;
								Static469.aBoolean606 = false;
								if (!Static255.aBoolean352) {
									Static380.method5622();
								}
							}
							@Pc(212) boolean local212;
							if (Static563.aClass156_1.method5689() >= local28 && Static563.aClass156_1.method5690() >= local30 && Static563.aClass156_1.method5689() < local32 && Static563.aClass156_1.method5690() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static380.aBoolean537 && local212) {
								if (local6.anInt5502 >= 0) {
									Static212.anInt4226 = local6.anInt5502;
								} else if (local6.aBoolean438) {
									Static212.anInt4226 = -1;
								}
							}
							if (!Static255.aBoolean352 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static262.method4323(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(256) boolean local256 = false;
							if (Static563.aClass156_1.method5685() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class3_Sub24 local271 = (Class3_Sub24) Static205.aClass130_20.method3543();
							if (local271 != null && local271.method7746() == 0 && local271.method7748() >= local28 && local271.method7751() >= local30 && local271.method7748() < local32 && local271.method7751() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray62 != null && !Static47.method787()) {
								for (local307 = 0; local307 < local6.aByteArray62.length; local307++) {
									if (Static478.aClass127_1.method3276(local6.aByteArray62[local307])) {
										if (local6.anIntArray420 == null || Static305.anInt5560 >= local6.anIntArray420[local307]) {
											@Pc(339) byte local339 = local6.aByteArray61[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static478.aClass127_1.method3276(86) && !Static478.aClass127_1.method3276(82) && !Static478.aClass127_1.method3276(81)) && ((local339 & 0x2) == 0 || Static478.aClass127_1.method3276(86)) && ((local339 & 0x1) == 0 || Static478.aClass127_1.method3276(82)) && ((local339 & 0x4) == 0 || Static478.aClass127_1.method3276(81))) {
												if (local307 < 10) {
													Static207.method3701("", -1, local307 + 1, local6.anInt5531);
												} else if (local307 == 10) {
													Static103.method2177();
													@Pc(410) Class3_Sub10 local410 = method1651(local6);
													Static80.method7505(local410.method571(), local410.anInt723, local6);
													Static484.aString107 = Static495.method6684(local6);
													if (Static484.aString107 == null) {
														Static484.aString107 = "Null";
													}
													Static466.aString125 = local6.aString71 + "<col=ffffff>";
												}
												local441 = local6.anIntArray423[local307];
												if (local6.anIntArray420 == null) {
													local6.anIntArray420 = new int[local6.aByteArray62.length];
												}
												if (local441 == 0) {
													local6.anIntArray420[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray420[local307] = Static305.anInt5560 + local441;
												}
											}
										}
									} else if (local6.anIntArray420 != null) {
										local6.anIntArray420[local307] = 0;
									}
								}
							}
							if (local266) {
								Static47.method789(local271.method7751() - local22, local6, local271.method7748() - local17);
							}
							if (Static265.aClass203_82 != null && Static265.aClass203_82 != local6 && local212 && method1651(local6).method575()) {
								Static184.aClass203_63 = local6;
							}
							if (local6 == Static215.aClass203_73) {
								Static297.aBoolean432 = true;
								Static383.anInt6588 = local17;
								Static11.anInt125 = local22;
							}
							if (local6.aBoolean439 || local6.anInt5510 != 0) {
								@Pc(526) Class3_Sub45 local526;
								if (local212 && Static400.anInt6813 != 0 && local6.anObjectArray27 != null) {
									local526 = new Class3_Sub45();
									local526.aBoolean646 = true;
									local526.aClass203_136 = local6;
									local526.anInt8336 = Static400.anInt6813;
									local526.anObjectArray33 = local6.anObjectArray27;
									Static146.aClass130_12.method3548(local526);
								}
								if (Static265.aClass203_82 != null || Static255.aBoolean352 || local6.anInt5510 != Static477.anInt7750 && Static366.anInt6302 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt5510 != 0) {
									if (local6.anInt5510 == Static519.anInt8233 || local6.anInt5510 == Static530.anInt8348) {
										Static222.aClass203_153 = local6;
										if (Static461.aClass242_1 != null) {
											Static461.aClass242_1.method5526(Static4.aClass43_1, local6.anInt5476);
										}
										if (local6.anInt5510 == Static519.anInt8233) {
											if (!Static255.aBoolean352 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static404.method5872(arg8, Static4.aClass43_1, arg9);
												for (@Pc(609) Class9_Sub10 local609 = (Class9_Sub10) Static75.aClass309_3.method6590(); local609 != null; local609 = (Class9_Sub10) Static75.aClass309_3.method6594()) {
													if (arg8 >= local609.anInt7906 && arg8 < local609.anInt7901 && arg9 >= local609.anInt7905 && arg9 < local609.anInt7902) {
														Static380.method5622();
														Static482.method6576(local609.aClass9_Sub1_Sub1_Sub2_1);
													}
												}
											}
											Static576.method7636(local22, local17, local6);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt5510 == Static591.anInt9388) {
										if (local6.method4780(Static4.aClass43_1) == null || Static355.anInt6148 != 0 && Static355.anInt6148 != 3 || Static255.aBoolean352 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray419[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray417[local681]) {
											continue;
										}
										local307 -= local6.anInt5513 / 2;
										local681 -= local6.anInt5476 / 2;
										if (Static446.anInt7363 == 4) {
											local720 = (int) Static439.aFloat151 & 0x3FFF;
										} else {
											local720 = (int) Static439.aFloat151 + Static278.anInt5101 & 0x3FFF;
										}
										@Pc(732) int local732 = Class3_Sub17.anIntArray175[local720];
										@Pc(736) int local736 = Class3_Sub17.anIntArray177[local720];
										if (Static446.anInt7363 != 4) {
											local732 = local732 * (Static435.anInt7196 + 256) >> 8;
											local736 = local736 * (Static435.anInt7196 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static446.anInt7363 == 4) {
											local786 = (Static92.anInt2289 >> 9) + (local765 >> 2);
											local794 = (Static383.anInt6591 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() - 1) * 256;
											local786 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 - local803 >> 9) + (local765 >> 2);
											local794 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 - local803 >> 9) - (local775 >> 2);
										}
										if (Static380.aBoolean537 && (Static301.anInt5410 & 0x40) != 0) {
											@Pc(836) Class203 local836 = Static582.method7699(Static550.anInt7639, Static345.anInt6055);
											if (local836 == null) {
												Static103.method2177();
											} else {
												Static577.method3272(51, local794, local6.anInt5507, 1L, Static484.aString107, local786, true, " ->", Static456.anInt8051, false);
											}
											continue;
										}
										if (Static227.aClass211_1 == Static560.aClass211_4) {
											Static577.method3272(58, local794, -1, 1L, Static48.aClass33_29.method797(Static131.anInt2839), local786, true, "", -1, false);
										}
										Static577.method3272(11, local794, -1, 1L, Static185.aString46, local786, true, "", Static332.anInt5938, false);
										continue;
									}
									if (local6.anInt5510 == Static477.anInt7750) {
										Static555.aClass203_139 = local6;
										if (local212) {
											Static458.aBoolean594 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method7748() - local17 - local6.anInt5513 / 2) * 2.0D / (double) Static284.aFloat160);
											local681 = (int) -((double) (local271.method7751() - local22 - local6.anInt5476 / 2) * 2.0D / (double) Static284.aFloat160);
											local441 = Static319.anInt5778 + local307 + Static284.anInt7863;
											local720 = Static236.anInt4460 + local681 + Static284.anInt7865;
											@Pc(950) Class3_Sub3_Sub3 local950 = Static332.method5132();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method246(local955, local441, local720);
											if (local955 != null) {
												if (Static478.aClass127_1.method3276(82) && Static274.anInt5067 > 0) {
													Static31.method563(local955[0], local955[1], local955[2]);
													continue;
												}
												Static469.aBoolean606 = true;
												Static345.anInt6059 = local955[0];
												Static545.anInt8725 = local955[1];
												Static570.anInt9148 = local955[2];
											}
											Static366.anInt6302 = 1;
											Static151.aBoolean254 = false;
											Static419.anInt8466 = Static563.aClass156_1.method5689();
											Static550.anInt7641 = Static563.aClass156_1.method5690();
											continue;
										}
										if (local256 && Static366.anInt6302 > 0) {
											if (Static366.anInt6302 == 1 && (Static419.anInt8466 != Static563.aClass156_1.method5689() || Static550.anInt7641 != Static563.aClass156_1.method5690())) {
												Static77.anInt1986 = Static319.anInt5778;
												Static10.anInt123 = Static236.anInt4460;
												Static366.anInt6302 = 2;
											}
											if (Static366.anInt6302 == 2) {
												Static151.aBoolean254 = true;
												Static31.method562(Static77.anInt1986 + (int) ((double) (Static419.anInt8466 - Static563.aClass156_1.method5689()) * 2.0D / (double) Static284.aFloat161));
												Static554.method7391(Static10.anInt123 - (int) ((double) (Static550.anInt7641 - Static563.aClass156_1.method5690()) * 2.0D / (double) Static284.aFloat161));
											}
											continue;
										}
										if (Static366.anInt6302 > 0 && !Static151.aBoolean254) {
											if ((Static451.anInt7402 == 1 || Static325.method5045()) && Static151.anInt3123 > 2) {
												Static451.method6277(Static419.anInt8466, Static550.anInt7641);
											} else if (Static15.method248()) {
												Static451.method6277(Static419.anInt8466, Static550.anInt7641);
											}
										}
										Static366.anInt6302 = 0;
										continue;
									}
									if (local6.anInt5510 == Static311.anInt5618) {
										if (local256) {
											Static376.method5532(Static563.aClass156_1.method5690() - local22, local6.anInt5476, Static563.aClass156_1.method5689() - local17, local6.anInt5513);
										}
										continue;
									}
									if (local6.anInt5510 == Static95.anInt657) {
										Static553.method7388(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean451 && local266) {
									local6.aBoolean451 = true;
									if (local6.anObjectArray23 != null) {
										local526 = new Class3_Sub45();
										local526.aBoolean646 = true;
										local526.aClass203_136 = local6;
										local526.anInt8341 = local271.method7748() - local17;
										local526.anInt8336 = local271.method7751() - local22;
										local526.anObjectArray33 = local6.anObjectArray23;
										Static146.aClass130_12.method3548(local526);
									}
								}
								if (local6.aBoolean451 && local256 && local6.anObjectArray24 != null) {
									local526 = new Class3_Sub45();
									local526.aBoolean646 = true;
									local526.aClass203_136 = local6;
									local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
									local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
									local526.anObjectArray33 = local6.anObjectArray24;
									Static146.aClass130_12.method3548(local526);
								}
								if (local6.aBoolean451 && !local256) {
									local6.aBoolean451 = false;
									if (local6.anObjectArray9 != null) {
										local526 = new Class3_Sub45();
										local526.aBoolean646 = true;
										local526.aClass203_136 = local6;
										local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
										local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
										local526.anObjectArray33 = local6.anObjectArray9;
										Static509.aClass130_50.method3548(local526);
									}
								}
								if (local256 && local6.anObjectArray7 != null) {
									local526 = new Class3_Sub45();
									local526.aBoolean646 = true;
									local526.aClass203_136 = local6;
									local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
									local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
									local526.anObjectArray33 = local6.anObjectArray7;
									Static146.aClass130_12.method3548(local526);
								}
								if (!local6.aBoolean445 && local212) {
									local6.aBoolean445 = true;
									if (local6.anObjectArray6 != null) {
										local526 = new Class3_Sub45();
										local526.aBoolean646 = true;
										local526.aClass203_136 = local6;
										local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
										local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
										local526.anObjectArray33 = local6.anObjectArray6;
										Static146.aClass130_12.method3548(local526);
									}
								}
								if (local6.aBoolean445 && local212 && local6.anObjectArray25 != null) {
									local526 = new Class3_Sub45();
									local526.aBoolean646 = true;
									local526.aClass203_136 = local6;
									local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
									local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
									local526.anObjectArray33 = local6.anObjectArray25;
									Static146.aClass130_12.method3548(local526);
								}
								if (local6.aBoolean445 && !local212) {
									local6.aBoolean445 = false;
									if (local6.anObjectArray19 != null) {
										local526 = new Class3_Sub45();
										local526.aBoolean646 = true;
										local526.aClass203_136 = local6;
										local526.anInt8341 = Static563.aClass156_1.method5689() - local17;
										local526.anInt8336 = Static563.aClass156_1.method5690() - local22;
										local526.anObjectArray33 = local6.anObjectArray19;
										Static509.aClass130_50.method3548(local526);
									}
								}
								if (local6.anObjectArray22 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray22;
									Static122.aClass130_9.method3548(local526);
								}
								@Pc(1494) Class3_Sub45 local1494;
								if (local6.anObjectArray31 != null && Static280.anInt5115 > local6.anInt5529) {
									if (local6.anIntArray418 == null || Static280.anInt5115 - local6.anInt5529 > 32) {
										local526 = new Class3_Sub45();
										local526.aClass203_136 = local6;
										local526.anObjectArray33 = local6.anObjectArray31;
										Static146.aClass130_12.method3548(local526);
									} else {
										label683: for (local307 = local6.anInt5529; local307 < Static280.anInt5115; local307++) {
											local681 = Static375.anIntArray510[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray418.length; local441++) {
												if (local6.anIntArray418[local441] == local681) {
													local1494 = new Class3_Sub45();
													local1494.aClass203_136 = local6;
													local1494.anObjectArray33 = local6.anObjectArray31;
													Static146.aClass130_12.method3548(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt5529 = Static280.anInt5115;
								}
								if (local6.anObjectArray3 != null && Static178.anInt8247 > local6.anInt5489) {
									if (local6.anIntArray421 == null || Static178.anInt8247 - local6.anInt5489 > 32) {
										local526 = new Class3_Sub45();
										local526.aClass203_136 = local6;
										local526.anObjectArray33 = local6.anObjectArray3;
										Static146.aClass130_12.method3548(local526);
									} else {
										label659: for (local307 = local6.anInt5489; local307 < Static178.anInt8247; local307++) {
											local681 = Static162.anIntArray274[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray421.length; local441++) {
												if (local6.anIntArray421[local441] == local681) {
													local1494 = new Class3_Sub45();
													local1494.aClass203_136 = local6;
													local1494.anObjectArray33 = local6.anObjectArray3;
													Static146.aClass130_12.method3548(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt5489 = Static178.anInt8247;
								}
								if (local6.anObjectArray13 != null && Static47.anInt1015 > local6.anInt5477) {
									if (local6.anIntArray422 == null || Static47.anInt1015 - local6.anInt5477 > 32) {
										local526 = new Class3_Sub45();
										local526.aClass203_136 = local6;
										local526.anObjectArray33 = local6.anObjectArray13;
										Static146.aClass130_12.method3548(local526);
									} else {
										label635: for (local307 = local6.anInt5477; local307 < Static47.anInt1015; local307++) {
											local681 = Static2.anIntArray2[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray422.length; local441++) {
												if (local6.anIntArray422[local441] == local681) {
													local1494 = new Class3_Sub45();
													local1494.aClass203_136 = local6;
													local1494.anObjectArray33 = local6.anObjectArray13;
													Static146.aClass130_12.method3548(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt5477 = Static47.anInt1015;
								}
								if (local6.anObjectArray5 != null && Static66.anInt1793 > local6.anInt5534) {
									if (local6.anIntArray416 == null || Static66.anInt1793 - local6.anInt5534 > 32) {
										local526 = new Class3_Sub45();
										local526.aClass203_136 = local6;
										local526.anObjectArray33 = local6.anObjectArray5;
										Static146.aClass130_12.method3548(local526);
									} else {
										label611: for (local307 = local6.anInt5534; local307 < Static66.anInt1793; local307++) {
											local681 = Static30.anIntArray73[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray416.length; local441++) {
												if (local6.anIntArray416[local441] == local681) {
													local1494 = new Class3_Sub45();
													local1494.aClass203_136 = local6;
													local1494.anObjectArray33 = local6.anObjectArray5;
													Static146.aClass130_12.method3548(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt5534 = Static66.anInt1793;
								}
								if (local6.anObjectArray16 != null && Static505.anInt2915 > local6.anInt5488) {
									if (local6.lb == null || Static505.anInt2915 - local6.anInt5488 > 32) {
										local526 = new Class3_Sub45();
										local526.aClass203_136 = local6;
										local526.anObjectArray33 = local6.anObjectArray16;
										Static146.aClass130_12.method3548(local526);
									} else {
										label587: for (local307 = local6.anInt5488; local307 < Static505.anInt2915; local307++) {
											local681 = Static317.anIntArray446[local307 & 0x1F];
											for (local441 = 0; local441 < local6.lb.length; local441++) {
												if (local6.lb[local441] == local681) {
													local1494 = new Class3_Sub45();
													local1494.aClass203_136 = local6;
													local1494.anObjectArray33 = local6.anObjectArray16;
													Static146.aClass130_12.method3548(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt5488 = Static505.anInt2915;
								}
								if (Static427.anInt7126 > local6.anInt5493 && local6.anObjectArray18 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray18;
									Static146.aClass130_12.method3548(local526);
								}
								if (Static417.anInt7008 > local6.anInt5493 && local6.anObjectArray30 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray30;
									Static146.aClass130_12.method3548(local526);
								}
								if (Static78.anInt3020 > local6.anInt5493 && local6.anObjectArray28 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray28;
									Static146.aClass130_12.method3548(local526);
								}
								if (Static96.anInt2328 > local6.anInt5493 && local6.anObjectArray21 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray21;
									Static146.aClass130_12.method3548(local526);
								}
								if (Static247.anInt4548 > local6.anInt5493 && local6.anObjectArray2 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray2;
									Static146.aClass130_12.method3548(local526);
								}
								local6.anInt5493 = Static251.anInt4580;
								if (local6.anObjectArray1 != null) {
									for (local307 = 0; local307 < Static187.anInt3653; local307++) {
										@Pc(1962) Class3_Sub45 local1962 = new Class3_Sub45();
										local1962.aClass203_136 = local6;
										local1962.anInt8338 = Static400.anInterface16Array2[local307].method5163();
										local1962.anInt8339 = Static400.anInterface16Array2[local307].method5162();
										local1962.anObjectArray33 = local6.anObjectArray1;
										Static146.aClass130_12.method3548(local1962);
									}
								}
								if (Static100.aBoolean197 && local6.anObjectArray14 != null) {
									local526 = new Class3_Sub45();
									local526.aClass203_136 = local6;
									local526.anObjectArray33 = local6.anObjectArray14;
									Static146.aClass130_12.method3548(local526);
								}
							}
							if (local6.anInt5473 == 5 && local6.anInt5533 != -1) {
								local6.method4782(Static125.aClass349_1, Static257.aClass182_1).method5526(Static4.aClass43_1, local6.anInt5476);
							}
							Static54.method1061(local6);
							if (local6.anInt5473 == 0) {
								method1642(arg0, local6.anInt5531, local28, local30, local32, local34, local17 - local6.anInt5466, local22 - local6.anInt5512, arg8, arg9);
								if (local6.aClass203Array2 != null) {
									method1642(local6.aClass203Array2, local6.anInt5531, local28, local30, local32, local34, local17 - local6.anInt5466, local22 - local6.anInt5512, arg8, arg9);
								}
								@Pc(2084) Class3_Sub28 local2084 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local6.anInt5531);
								if (local2084 != null) {
									if (Static227.aClass211_1 == Static250.aClass211_2 && local2084.anInt5330 == 0 && !Static255.aBoolean352 && local212 && !Static393.aBoolean543) {
										Static380.method5622();
									}
									Static512.method6854(local32, local34, local28, local30, local22, local17, arg9, arg8, local2084.anInt5333);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static54.method1061(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	public static int method1643() {
		if (Static3.anInt53 == 0) {
			Static9.aClass6_2.method114(new Class1("jaclib"));
			if (Static9.aClass6_2.method117().method4825() != 100) {
				return 1;
			}
			if (!((Class1) Static9.aClass6_2.method117()).method7()) {
				Static478.aClient1.method1619();
			}
			Static3.anInt53 = 1;
		}
		@Pc(224) int local224;
		@Pc(247) int local247;
		@Pc(261) int local261;
		@Pc(267) int local267;
		if (Static3.anInt53 == 1) {
			Static167.aClass6Array1 = Static9.method116();
			Static9.aClass6_1.method114(new Class206(Static549.aClass246_251));
			Static9.aClass6_3.method114(new Class1("jaggl"));
			Static9.aClass6_4.method114(new Class1("jagdx"));
			Static9.aClass6_5.method114(new Class1("jagmisc"));
			Static9.aClass6_6.method114(new Class1("sw3d"));
			Static9.aClass6_7.method114(new Class1("hw3d"));
			Static9.aClass6_8.method114(new Class206(Static542.aClass246_250));
			Static9.aClass6_9.method114(new Class206(Static89.aClass246_46));
			Static9.aClass6_10.method114(new Class206(Static531.aClass246_249));
			Static9.aClass6_11.method114(new Class206(Static114.aClass246_67));
			Static9.aClass6_12.method114(new Class206(Static463.aClass246_219));
			Static9.aClass6_13.method114(new Class206(Static79.aClass246_44));
			Static9.aClass6_14.method114(new Class206(Static329.aClass246_162));
			Static9.aClass6_15.method114(new Class206(Static462.aClass246_218));
			Static9.aClass6_16.method114(new Class206(Static530.aClass246_248));
			Static9.aClass6_17.method114(new Class206(Static334.aClass246_165));
			Static9.aClass6_18.method114(new Class206(Static376.aClass246_180));
			Static9.aClass6_19.method114(new Class206(Static285.aClass246_133));
			Static9.aClass6_20.method114(new Class206(Static207.aClass246_105));
			Static9.aClass6_21.method114(new Class206(Static89.aClass246_47));
			Static9.aClass6_22.method114(new Class90(Static325.aClass246_158, "huffman"));
			Static9.aClass6_23.method114(new Class206(Static415.aClass246_259));
			Static9.aClass6_24.method114(new Class206(Static151.aClass246_77));
			Static9.aClass6_25.method114(new Class206(Static467.aClass246_221));
			Static9.aClass6_26.method114(new Class186(Static494.aClass246_232, "details"));
			for (local224 = 0; local224 < Static167.aClass6Array1.length; local224++) {
				if (Static167.aClass6Array1[local224].method117() == null) {
					throw new RuntimeException();
				}
			}
			local247 = 0;
			@Pc(249) Class6[] local249 = Static167.aClass6Array1;
			for (@Pc(251) int local251 = 0; local251 < local249.length; local251++) {
				@Pc(257) Class6 local257 = local249[local251];
				local261 = local257.method113();
				local267 = local257.method117().method4825();
				local247 += local261 * local267 / 100;
			}
			Static467.anInt7657 = local247;
			Static3.anInt53 = 2;
		}
		if (Static167.aClass6Array1 == null) {
			return 100;
		}
		local224 = 0;
		local247 = 0;
		@Pc(294) boolean local294 = true;
		@Pc(296) Class6[] local296 = Static167.aClass6Array1;
		for (@Pc(303) int local303 = 0; local303 < local296.length; local303++) {
			@Pc(309) Class6 local309 = local296[local303];
			local267 = local309.method113();
			@Pc(319) int local319 = local309.method117().method4825();
			local247 += local267 * local319 / 100;
			if (local319 < 100) {
				local294 = false;
			}
			local224 += local267;
		}
		if (local294) {
			if (!((Class1) Static9.aClass6_5.method117()).method7()) {
				Static478.aClient1.method1616();
			}
			Static167.aClass6Array1 = null;
		}
		local247 -= Static467.anInt7657;
		local224 -= Static467.anInt7657;
		local261 = local224 > 0 ? local247 * 100 / local224 : 100;
		if (!local294 && local261 > 99) {
			local261 = 99;
		}
		return local261;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1645() {
		@Pc(1) int local1 = Static476.anInt8277;
		@Pc(3) int[] local3 = Static10.anIntArray19;
		@Pc(20) boolean local20 = Static278.aClass3_Sub13_Sub1_1.anInt5133 == 1 && local1 > 200 || Static278.aClass3_Sub13_Sub1_1.anInt5133 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class9_Sub1_Sub1_Sub2_Sub2 local29 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local3[local22]];
			if (local29.method5582()) {
				local29.method7086();
				if (local29.aShort112 >= 0 && local29.aShort115 >= 0 && local29.aShort114 < Static400.anInt6818 && local29.aShort113 < Static271.anInt5050) {
					local29.aBoolean533 = local29.aBoolean528 ? local20 : false;
					if (local29 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2) {
						local29.anInt6455 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean527) {
							local75++;
						}
						if (local29.anInt6431 > Static305.anInt5560) {
							local75 += 2;
						}
						local75 += 5 - local29.method5569() << 2;
						if (local29.aBoolean535) {
							local75 += 512;
						} else {
							if (Static436.anInt7242 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6455 = local75 + 1;
					}
				} else {
					local29.anInt6455 = -1;
				}
			} else {
				local29.anInt6455 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static49.anInt1058; local116++) {
			@Pc(127) Class9_Sub1_Sub1_Sub2_Sub1 local127 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local116])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (local127.method418() && local127.aClass294_1.method6437(Static427.aClass56_1)) {
				local127.method7086();
				if (local127.aShort112 >= 0 && local127.aShort115 >= 0 && local127.aShort114 < Static400.anInt6818 && local127.aShort113 < Static271.anInt5050) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean527) {
						local164++;
					}
					if (local127.anInt6431 > Static305.anInt5560) {
						local164 += 2;
					}
					local164 += 5 - local127.method5569() << 2;
					if (Static436.anInt7242 == 0) {
						if (local127.aClass294_1.aBoolean603) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static436.anInt7242 == 1) {
						if (local127.aClass294_1.aBoolean603) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass294_1.aBoolean605) {
						local164 += 1024;
					} else if (!local127.aClass294_1.aBoolean597) {
						local164 += 256;
					}
					local127.anInt6455 = local164 + 1;
				} else {
					local127.anInt6455 = -1;
				}
			} else {
				local127.anInt6455 = -1;
			}
		}
		for (local75 = 0; local75 < Static443.aClass122Array1.length; local75++) {
			@Pc(230) Class122 local230 = Static443.aClass122Array1[local75];
			if (local230 != null) {
				if (local230.anInt3557 == 1) {
					@Pc(244) Class3_Sub39 local244 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local230.anInt3554);
					if (local244 != null) {
						@Pc(249) Class9_Sub1_Sub1_Sub2_Sub1 local249 = local244.aClass9_Sub1_Sub1_Sub2_Sub1_2;
						if (local249.anInt6455 >= 0) {
							local249.anInt6455 += 2048;
						}
					}
				} else if (local230.anInt3557 == 10) {
					@Pc(268) Class9_Sub1_Sub1_Sub2_Sub2 local268 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local230.anInt3554];
					if (local268 != null && local268 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 && local268.anInt6455 >= 0) {
						local268.anInt6455 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lk;)Z")
	public static boolean method1646(@OriginalArg(0) Class203 arg0) {
		if (Static393.aBoolean543) {
			if (method1651(arg0).anInt730 != 0) {
				return false;
			}
			if (arg0.anInt5473 == 0) {
				return false;
			}
		}
		return arg0.aBoolean447;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1647() {
		@Pc(1) int local1 = Static476.anInt8277;
		@Pc(3) int[] local3 = Static10.anIntArray19;
		@Pc(11) int local11 = Static275.aBoolean396 ? local1 : local1 + Static49.anInt1058;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local13 - local1])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			}
			if (local23.anInt6455 >= 0) {
				@Pc(43) int local43 = local23.method5569();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8975 & 0x1FF) == 0 && (local23.anInt8980 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8975 & 0x1FF) == 256 && (local23.anInt8980 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8977 = Static130.method2562(local23.anInt8980, local23.aByte126, local23.anInt8975);
				Static216.method3774(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lk;)Lclient!lk;")
	public static Class203 method1649(@OriginalArg(0) Class203 arg0) {
		@Pc(4) int local4 = method1651(arg0).method573();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static414.method5954(arg0.anInt5518);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1650() {
		Static334.anInt5949 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static49.anInt1058; local3++) {
			@Pc(14) Class9_Sub1_Sub1_Sub2_Sub1 local14 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local3])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (local14.aBoolean527 && local14.method5574() != -1) {
				@Pc(32) int local32 = (local14.method5569() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8975 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8980 - local32 >> 9;
				@Pc(53) Class9_Sub1_Sub1_Sub2 local53 = Static233.method3931(local39, local14.aByte126, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6429;
					if (local53 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt6399 == 0 && local53.method5574() != -1) {
						Static239.anIntArray362[Static334.anInt5949] = local58;
						Static20.anIntArray50[Static334.anInt5949] = local58;
						Static334.anInt5949++;
						local53.anInt6399++;
					}
					Static239.anIntArray362[Static334.anInt5949] = local58;
					Static20.anIntArray50[Static334.anInt5949] = local14.anInt6429 + 2048;
					Static334.anInt5949++;
					local53.anInt6399++;
				}
			}
		}
		Static543.method7131(0, Static239.anIntArray362, Static334.anInt5949 - 1, Static20.anIntArray50);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lk;)Lclient!bca;")
	public static Class3_Sub10 method1651(@OriginalArg(0) Class203 arg0) {
		@Pc(13) Class3_Sub10 local13 = (Class3_Sub10) Static263.aClass310_17.method6601(((long) arg0.anInt5531 << 32) + (long) arg0.anInt5504);
		return local13 == null ? arg0.aClass3_Sub10_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	public static void method1652(@OriginalArg(1) int arg0) {
		Static397.anInt6803 = arg0;
		Static294.aClass10_31.method263();
	}
}
