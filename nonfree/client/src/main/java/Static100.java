import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!fm;")
	private static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!fm;)V")
	private static void method1501(@OriginalArg(0) Class56 arg0) {
		arg0.anInt1459 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray14[local4]) {
				arg0.aByteArray12[arg0.anInt1459] = (byte) local4;
				arg0.anInt1459++;
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lclient!fm;)B")
	private static byte method1502(@OriginalArg(0) Class56 arg0) {
		return (byte) method1508(8, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(Lclient!fm;)V")
	private static void method1503(@OriginalArg(0) Class56 arg0) {
		arg0.anInt1451 = 1;
		if (Static242.anIntArray439 == null) {
			Static242.anIntArray439 = new int[arg0.anInt1451 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method1502(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1502(arg0);
				local61 = method1504(arg0);
				if (local61 != 0) {
				}
				arg0.anInt1460 = 0;
				local61 = method1502(arg0);
				arg0.anInt1460 = arg0.anInt1460 << 8 | local61 & 0xFF;
				local61 = method1502(arg0);
				arg0.anInt1460 = arg0.anInt1460 << 8 | local61 & 0xFF;
				local61 = method1502(arg0);
				arg0.anInt1460 = arg0.anInt1460 << 8 | local61 & 0xFF;
				@Pc(141) int local141;
				for (local141 = 0; local141 < 16; local141++) {
					local61 = method1504(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray13[local141] = true;
					} else {
						arg0.aBooleanArray13[local141] = false;
					}
				}
				for (local141 = 0; local141 < 256; local141++) {
					arg0.aBooleanArray14[local141] = false;
				}
				@Pc(187) int local187;
				for (local141 = 0; local141 < 16; local141++) {
					if (arg0.aBooleanArray13[local141]) {
						for (local187 = 0; local187 < 16; local187++) {
							local61 = method1504(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray14[local141 * 16 + local187] = true;
							}
						}
					}
				}
				method1501(arg0);
				@Pc(216) int local216 = arg0.anInt1459 + 2;
				@Pc(220) int local220 = method1508(3, arg0);
				@Pc(224) int local224 = method1508(15, arg0);
				for (local141 = 0; local141 < local224; local141++) {
					local187 = 0;
					while (true) {
						local61 = method1504(arg0);
						if (local61 == 0) {
							arg0.aByteArray13[local141] = (byte) local187;
							break;
						}
						local187++;
					}
				}
				@Pc(250) byte[] local250 = new byte[6];
				@Pc(252) byte local252 = 0;
				while (local252 < local220) {
					local250[local252] = local252++;
				}
				for (local141 = 0; local141 < local224; local141++) {
					local252 = arg0.aByteArray13[local141];
					@Pc(279) byte local279 = local250[local252];
					while (local252 > 0) {
						local250[local252] = local250[local252 - 1];
						local252--;
					}
					local250[0] = local279;
					arg0.aByteArray15[local141] = local279;
				}
				@Pc(308) int local308;
				for (local308 = 0; local308 < local220; local308++) {
					@Pc(315) int local315 = method1508(5, arg0);
					for (local141 = 0; local141 < local216; local141++) {
						while (true) {
							local61 = method1504(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray5[local308][local141] = (byte) local315;
								break;
							}
							local61 = method1504(arg0);
							if (local61 == 0) {
								local315++;
							} else {
								local315--;
							}
						}
					}
				}
				for (local308 = 0; local308 < local220; local308++) {
					@Pc(354) byte local354 = 32;
					@Pc(356) byte local356 = 0;
					for (local141 = 0; local141 < local216; local141++) {
						if (arg0.aByteArrayArray5[local308][local141] > local356) {
							local356 = arg0.aByteArrayArray5[local308][local141];
						}
						if (arg0.aByteArrayArray5[local308][local141] < local354) {
							local354 = arg0.aByteArrayArray5[local308][local141];
						}
					}
					method1505(arg0.anIntArrayArray4[local308], arg0.anIntArrayArray6[local308], arg0.anIntArrayArray5[local308], arg0.aByteArrayArray5[local308], local354, local356, local216);
					arg0.anIntArray118[local308] = local354;
				}
				@Pc(425) int local425 = arg0.anInt1459 + 1;
				@Pc(427) byte local427 = -1;
				for (local141 = 0; local141 <= 255; local141++) {
					arg0.anIntArray117[local141] = 0;
				}
				@Pc(443) int local443 = 4095;
				@Pc(445) int local445;
				@Pc(449) int local449;
				for (local445 = 15; local445 >= 0; local445--) {
					for (local449 = 15; local449 >= 0; local449--) {
						arg0.aByteArray11[local443] = (byte) (local445 * 16 + local449);
						local443--;
					}
					arg0.anIntArray121[local445] = local443 + 1;
				}
				@Pc(475) int local475 = 0;
				@Pc(478) int local478 = local427 + 1;
				@Pc(480) byte local480 = 50;
				@Pc(485) byte local485 = arg0.aByteArray15[0];
				@Pc(490) int local490 = arg0.anIntArray118[local485];
				@Pc(495) int[] local495 = arg0.anIntArrayArray4[local485];
				@Pc(500) int[] local500 = arg0.anIntArrayArray5[local485];
				@Pc(505) int[] local505 = arg0.anIntArrayArray6[local485];
				@Pc(506) int local506 = local480 - 1;
				@Pc(508) int local508 = local490;
				@Pc(512) int local512;
				@Pc(522) byte local522;
				for (local512 = method1508(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
					local508++;
					local522 = method1504(arg0);
				}
				@Pc(537) int local537 = local500[local512 - local505[local508]];
				while (true) {
					while (local537 != local425) {
						if (local537 == 0 || local537 == 1) {
							@Pc(548) int local548 = -1;
							@Pc(550) int local550 = 1;
							do {
								if (local537 == 0) {
									local548 += local550;
								} else if (local537 == 1) {
									local548 += local550 * 2;
								}
								local550 *= 2;
								if (local506 == 0) {
									local478++;
									local506 = 50;
									local485 = arg0.aByteArray15[local478];
									local490 = arg0.anIntArray118[local485];
									local495 = arg0.anIntArrayArray4[local485];
									local500 = arg0.anIntArrayArray5[local485];
									local505 = arg0.anIntArrayArray6[local485];
								}
								local506--;
								local508 = local490;
								for (local512 = method1508(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
									local508++;
									local522 = method1504(arg0);
								}
								local537 = local500[local512 - local505[local508]];
							} while (local537 == 0 || local537 == 1);
							local548++;
							local61 = arg0.aByteArray12[arg0.aByteArray11[arg0.anIntArray121[0]] & 0xFF];
							arg0.anIntArray117[local61 & 0xFF] += local548;
							while (local548 > 0) {
								Static242.anIntArray439[local475] = local61 & 0xFF;
								local475++;
								local548--;
							}
						} else {
							@Pc(678) int local678 = local537 - 1;
							@Pc(686) int local686;
							if (local678 < 16) {
								local686 = arg0.anIntArray121[0];
								local61 = arg0.aByteArray11[local686 + local678];
								while (local678 > 3) {
									@Pc(700) int local700 = local686 + local678;
									arg0.aByteArray11[local700] = arg0.aByteArray11[local700 - 1];
									arg0.aByteArray11[local700 - 1] = arg0.aByteArray11[local700 - 2];
									arg0.aByteArray11[local700 - 2] = arg0.aByteArray11[local700 - 3];
									arg0.aByteArray11[local700 - 3] = arg0.aByteArray11[local700 - 4];
									local678 -= 4;
								}
								while (local678 > 0) {
									arg0.aByteArray11[local686 + local678] = arg0.aByteArray11[local686 + local678 - 1];
									local678--;
								}
								arg0.aByteArray11[local686] = local61;
							} else {
								@Pc(776) int local776 = local678 / 16;
								@Pc(780) int local780 = local678 % 16;
								local686 = arg0.anIntArray121[local776] + local780;
								local61 = arg0.aByteArray11[local686];
								while (local686 > arg0.anIntArray121[local776]) {
									arg0.aByteArray11[local686] = arg0.aByteArray11[local686 - 1];
									local686--;
								}
								@Pc(815) int local815 = arg0.anIntArray121[local776]++;
								while (local776 > 0) {
									local815 = arg0.anIntArray121[local776]--;
									arg0.aByteArray11[arg0.anIntArray121[local776]] = arg0.aByteArray11[arg0.anIntArray121[local776 - 1] + 16 - 1];
									local776--;
								}
								local815 = arg0.anIntArray121[0]--;
								arg0.aByteArray11[arg0.anIntArray121[0]] = local61;
								if (arg0.anIntArray121[0] == 0) {
									local443 = 4095;
									for (local445 = 15; local445 >= 0; local445--) {
										for (local449 = 15; local449 >= 0; local449--) {
											arg0.aByteArray11[local443] = arg0.aByteArray11[arg0.anIntArray121[local445] + local449];
											local443--;
										}
										arg0.anIntArray121[local445] = local443 + 1;
									}
								}
							}
							arg0.anIntArray117[arg0.aByteArray12[local61 & 0xFF] & 0xFF]++;
							Static242.anIntArray439[local475] = arg0.aByteArray12[local61 & 0xFF] & 0xFF;
							local475++;
							if (local506 == 0) {
								local478++;
								local506 = 50;
								local485 = arg0.aByteArray15[local478];
								local490 = arg0.anIntArray118[local485];
								local495 = arg0.anIntArrayArray4[local485];
								local500 = arg0.anIntArrayArray5[local485];
								local505 = arg0.anIntArrayArray6[local485];
							}
							local506--;
							local508 = local490;
							for (local512 = method1508(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
								local508++;
								local522 = method1504(arg0);
							}
							local537 = local500[local512 - local505[local508]];
						}
					}
					arg0.anInt1456 = 0;
					arg0.aByte4 = 0;
					arg0.anIntArray120[0] = 0;
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray120[local141] = arg0.anIntArray117[local141 - 1];
					}
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray120[local141] += arg0.anIntArray120[local141 - 1];
					}
					for (local141 = 0; local141 < local475; local141++) {
						local61 = (byte) (Static242.anIntArray439[local141] & 0xFF);
						Static242.anIntArray439[arg0.anIntArray120[local61 & 0xFF]] |= local141 << 8;
						arg0.anIntArray120[local61 & 0xFF]++;
					}
					arg0.anInt1450 = Static242.anIntArray439[arg0.anInt1460] >> 8;
					arg0.anInt1462 = 0;
					arg0.anInt1450 = Static242.anIntArray439[arg0.anInt1450];
					arg0.anInt1452 = (byte) (arg0.anInt1450 & 0xFF);
					arg0.anInt1450 >>= 0x8;
					arg0.anInt1462++;
					arg0.anInt1458 = local475;
					method1506(arg0);
					if (arg0.anInt1462 == arg0.anInt1458 + 1 && arg0.anInt1456 == 0) {
						local56 = true;
						break;
					}
					local56 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(Lclient!fm;)B")
	private static byte method1504(@OriginalArg(0) Class56 arg0) {
		return (byte) method1508(1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method1505(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(8) int local8 = 0; local8 < arg6; local8++) {
				if (arg3[local8] == local3) {
					arg2[local1] = local8;
					local1++;
				}
			}
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg1[local3] = 0;
		}
		for (local3 = 0; local3 < arg6; local3++) {
			arg1[arg3[local3] + 1]++;
		}
		for (local3 = 1; local3 < 23; local3++) {
			arg1[local3] += arg1[local3 - 1];
		}
		for (local3 = 0; local3 < 23; local3++) {
			arg0[local3] = 0;
		}
		@Pc(85) int local85 = 0;
		for (local3 = arg4; local3 <= arg5; local3++) {
			local85 += arg1[local3 + 1] - arg1[local3];
			arg0[local3] = local85 - 1;
			local85 <<= 0x1;
		}
		for (local3 = arg4 + 1; local3 <= arg5; local3++) {
			arg1[local3] = (arg0[local3 - 1] + 1 << 1) - arg1[local3];
		}
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(Lclient!fm;)V")
	private static void method1506(@OriginalArg(0) Class56 arg0) {
		@Pc(2) byte local2 = arg0.aByte4;
		@Pc(5) int local5 = arg0.anInt1456;
		@Pc(8) int local8 = arg0.anInt1462;
		@Pc(11) int local11 = arg0.anInt1452;
		@Pc(13) int[] local13 = Static242.anIntArray439;
		@Pc(16) int local16 = arg0.anInt1450;
		@Pc(19) byte[] local19 = arg0.aByteArray14;
		@Pc(22) int local22 = arg0.anInt1454;
		@Pc(25) int local25 = arg0.anInt1453;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt1458 + 1;
		label67: while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label67;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label67;
						}
						local19[local22] = local2;
						local22++;
						local25--;
						break;
					}
					local19[local22] = local2;
					local5--;
					local22++;
					local25--;
				}
			}
			@Pc(62) boolean local62 = true;
			@Pc(84) byte local84;
			while (local62) {
				local62 = false;
				if (local8 == local32) {
					local5 = 0;
					break label67;
				}
				local2 = (byte) local11;
				local16 = local13[local16];
				local84 = (byte) (local16 & 0xFF);
				local16 >>= 0x8;
				local8++;
				if (local84 != local11) {
					local11 = local84;
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label67;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local62 = true;
				}
			}
			local5 = 2;
			local16 = local13[local16];
			local84 = (byte) (local16 & 0xFF);
			local16 >>= 0x8;
			local8++;
			if (local8 != local32) {
				if (local84 == local11) {
					local5 = 3;
					local16 = local13[local16];
					local84 = (byte) (local16 & 0xFF);
					local16 >>= 0x8;
					local8++;
					if (local8 != local32) {
						if (local84 == local11) {
							local16 = local13[local16];
							local84 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
							local5 = (local84 & 0xFF) + 4;
							local16 = local13[local16];
							local11 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
						} else {
							local11 = local84;
						}
					}
				} else {
					local11 = local84;
				}
			}
		}
		@Pc(215) int local215 = arg0.anInt1447;
		arg0.anInt1447 += local27 - local25;
		if (arg0.anInt1447 < local215) {
		}
		arg0.aByte4 = local2;
		arg0.anInt1456 = local5;
		arg0.anInt1462 = local8;
		arg0.anInt1452 = local11;
		Static242.anIntArray439 = local13;
		arg0.anInt1450 = local16;
		arg0.aByteArray14 = local19;
		arg0.anInt1454 = local22;
		arg0.anInt1453 = local25;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!fm;)I")
	private static int method1508(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1) {
		while (arg1.anInt1457 < arg0) {
			arg1.anInt1464 = arg1.anInt1464 << 8 | arg1.aByteArray10[arg1.anInt1448] & 0xFF;
			arg1.anInt1457 += 8;
			arg1.anInt1448++;
			arg1.anInt1461++;
			if (arg1.anInt1461 == 0) {
			}
		}
		@Pc(17) int local17 = arg1.anInt1464 >> arg1.anInt1457 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt1457 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "([BI[BII)I")
	public static int method1509(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class56 local2 = aClass56_1;
		synchronized (aClass56_1) {
			aClass56_1.aByteArray10 = arg2;
			aClass56_1.anInt1448 = 9;
			aClass56_1.aByteArray14 = arg0;
			aClass56_1.anInt1454 = 0;
			aClass56_1.anInt1453 = arg1;
			aClass56_1.anInt1457 = 0;
			aClass56_1.anInt1464 = 0;
			aClass56_1.anInt1461 = 0;
			aClass56_1.anInt1447 = 0;
			method1503(aClass56_1);
			@Pc(37) int local37 = arg1 - aClass56_1.anInt1453;
			aClass56_1.aByteArray10 = null;
			aClass56_1.aByteArray14 = null;
			return local37;
		}
	}
}
