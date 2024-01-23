import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!qn;")
	private static Class141 aClass141_1 = new Class141();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method260(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!qn;)V")
	private static void method261(@OriginalArg(0) Class141 arg0) {
		arg0.anInt4367 = 1;
		if (Static76.anIntArray154 == null) {
			Static76.anIntArray154 = new int[arg0.anInt4367 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(61) byte local61 = method265(arg0);
				if (local61 == 23) {
					return;
				}
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method265(arg0);
				local61 = method263(arg0);
				if (local61 != 0) {
				}
				arg0.anInt4357 = 0;
				local61 = method265(arg0);
				arg0.anInt4357 = arg0.anInt4357 << 8 | local61 & 0xFF;
				local61 = method265(arg0);
				arg0.anInt4357 = arg0.anInt4357 << 8 | local61 & 0xFF;
				local61 = method265(arg0);
				arg0.anInt4357 = arg0.anInt4357 << 8 | local61 & 0xFF;
				@Pc(141) int local141;
				for (local141 = 0; local141 < 16; local141++) {
					local61 = method263(arg0);
					if (local61 == 1) {
						arg0.aBooleanArray42[local141] = true;
					} else {
						arg0.aBooleanArray42[local141] = false;
					}
				}
				for (local141 = 0; local141 < 256; local141++) {
					arg0.aBooleanArray43[local141] = false;
				}
				@Pc(187) int local187;
				for (local141 = 0; local141 < 16; local141++) {
					if (arg0.aBooleanArray42[local141]) {
						for (local187 = 0; local187 < 16; local187++) {
							local61 = method263(arg0);
							if (local61 == 1) {
								arg0.aBooleanArray43[local141 * 16 + local187] = true;
							}
						}
					}
				}
				method262(arg0);
				@Pc(216) int local216 = arg0.anInt4366 + 2;
				@Pc(220) int local220 = method264(3, arg0);
				@Pc(224) int local224 = method264(15, arg0);
				for (local141 = 0; local141 < local224; local141++) {
					local187 = 0;
					while (true) {
						local61 = method263(arg0);
						if (local61 == 0) {
							arg0.aByteArray61[local141] = (byte) local187;
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
					local252 = arg0.aByteArray61[local141];
					@Pc(279) byte local279 = local250[local252];
					while (local252 > 0) {
						local250[local252] = local250[local252 - 1];
						local252--;
					}
					local250[0] = local279;
					arg0.aByteArray60[local141] = local279;
				}
				@Pc(308) int local308;
				for (local308 = 0; local308 < local220; local308++) {
					@Pc(315) int local315 = method264(5, arg0);
					for (local141 = 0; local141 < local216; local141++) {
						while (true) {
							local61 = method263(arg0);
							if (local61 == 0) {
								arg0.aByteArrayArray11[local308][local141] = (byte) local315;
								break;
							}
							local61 = method263(arg0);
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
						if (arg0.aByteArrayArray11[local308][local141] > local356) {
							local356 = arg0.aByteArrayArray11[local308][local141];
						}
						if (arg0.aByteArrayArray11[local308][local141] < local354) {
							local354 = arg0.aByteArrayArray11[local308][local141];
						}
					}
					method260(arg0.anIntArrayArray24[local308], arg0.anIntArrayArray23[local308], arg0.anIntArrayArray25[local308], arg0.aByteArrayArray11[local308], local354, local356, local216);
					arg0.anIntArray390[local308] = local354;
				}
				@Pc(425) int local425 = arg0.anInt4366 + 1;
				@Pc(427) byte local427 = -1;
				for (local141 = 0; local141 <= 255; local141++) {
					arg0.anIntArray388[local141] = 0;
				}
				@Pc(443) int local443 = 4095;
				@Pc(445) int local445;
				@Pc(449) int local449;
				for (local445 = 15; local445 >= 0; local445--) {
					for (local449 = 15; local449 >= 0; local449--) {
						arg0.aByteArray59[local443] = (byte) (local445 * 16 + local449);
						local443--;
					}
					arg0.anIntArray391[local445] = local443 + 1;
				}
				@Pc(475) int local475 = 0;
				@Pc(478) int local478 = local427 + 1;
				@Pc(480) byte local480 = 50;
				@Pc(485) byte local485 = arg0.aByteArray60[0];
				@Pc(490) int local490 = arg0.anIntArray390[local485];
				@Pc(495) int[] local495 = arg0.anIntArrayArray24[local485];
				@Pc(500) int[] local500 = arg0.anIntArrayArray25[local485];
				@Pc(505) int[] local505 = arg0.anIntArrayArray23[local485];
				@Pc(506) int local506 = local480 - 1;
				@Pc(508) int local508 = local490;
				@Pc(512) int local512;
				@Pc(522) byte local522;
				for (local512 = method264(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
					local508++;
					local522 = method263(arg0);
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
									local485 = arg0.aByteArray60[local478];
									local490 = arg0.anIntArray390[local485];
									local495 = arg0.anIntArrayArray24[local485];
									local500 = arg0.anIntArrayArray25[local485];
									local505 = arg0.anIntArrayArray23[local485];
								}
								local506--;
								local508 = local490;
								for (local512 = method264(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
									local508++;
									local522 = method263(arg0);
								}
								local537 = local500[local512 - local505[local508]];
							} while (local537 == 0 || local537 == 1);
							local548++;
							local61 = arg0.aByteArray57[arg0.aByteArray59[arg0.anIntArray391[0]] & 0xFF];
							arg0.anIntArray388[local61 & 0xFF] += local548;
							while (local548 > 0) {
								Static76.anIntArray154[local475] = local61 & 0xFF;
								local475++;
								local548--;
							}
						} else {
							@Pc(678) int local678 = local537 - 1;
							@Pc(686) int local686;
							if (local678 < 16) {
								local686 = arg0.anIntArray391[0];
								local61 = arg0.aByteArray59[local686 + local678];
								while (local678 > 3) {
									@Pc(700) int local700 = local686 + local678;
									arg0.aByteArray59[local700] = arg0.aByteArray59[local700 - 1];
									arg0.aByteArray59[local700 - 1] = arg0.aByteArray59[local700 - 2];
									arg0.aByteArray59[local700 - 2] = arg0.aByteArray59[local700 - 3];
									arg0.aByteArray59[local700 - 3] = arg0.aByteArray59[local700 - 4];
									local678 -= 4;
								}
								while (local678 > 0) {
									arg0.aByteArray59[local686 + local678] = arg0.aByteArray59[local686 + local678 - 1];
									local678--;
								}
								arg0.aByteArray59[local686] = local61;
							} else {
								@Pc(776) int local776 = local678 / 16;
								@Pc(780) int local780 = local678 % 16;
								local686 = arg0.anIntArray391[local776] + local780;
								local61 = arg0.aByteArray59[local686];
								while (local686 > arg0.anIntArray391[local776]) {
									arg0.aByteArray59[local686] = arg0.aByteArray59[local686 - 1];
									local686--;
								}
								@Pc(815) int local815 = arg0.anIntArray391[local776]++;
								while (local776 > 0) {
									local815 = arg0.anIntArray391[local776]--;
									arg0.aByteArray59[arg0.anIntArray391[local776]] = arg0.aByteArray59[arg0.anIntArray391[local776 - 1] + 16 - 1];
									local776--;
								}
								local815 = arg0.anIntArray391[0]--;
								arg0.aByteArray59[arg0.anIntArray391[0]] = local61;
								if (arg0.anIntArray391[0] == 0) {
									local443 = 4095;
									for (local445 = 15; local445 >= 0; local445--) {
										for (local449 = 15; local449 >= 0; local449--) {
											arg0.aByteArray59[local443] = arg0.aByteArray59[arg0.anIntArray391[local445] + local449];
											local443--;
										}
										arg0.anIntArray391[local445] = local443 + 1;
									}
								}
							}
							arg0.anIntArray388[arg0.aByteArray57[local61 & 0xFF] & 0xFF]++;
							Static76.anIntArray154[local475] = arg0.aByteArray57[local61 & 0xFF] & 0xFF;
							local475++;
							if (local506 == 0) {
								local478++;
								local506 = 50;
								local485 = arg0.aByteArray60[local478];
								local490 = arg0.anIntArray390[local485];
								local495 = arg0.anIntArrayArray24[local485];
								local500 = arg0.anIntArrayArray25[local485];
								local505 = arg0.anIntArrayArray23[local485];
							}
							local506--;
							local508 = local490;
							for (local512 = method264(local490, arg0); local512 > local495[local508]; local512 = local512 << 1 | local522) {
								local508++;
								local522 = method263(arg0);
							}
							local537 = local500[local512 - local505[local508]];
						}
					}
					arg0.anInt4368 = 0;
					arg0.aByte20 = 0;
					arg0.anIntArray389[0] = 0;
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray389[local141] = arg0.anIntArray388[local141 - 1];
					}
					for (local141 = 1; local141 <= 256; local141++) {
						arg0.anIntArray389[local141] += arg0.anIntArray389[local141 - 1];
					}
					for (local141 = 0; local141 < local475; local141++) {
						local61 = (byte) (Static76.anIntArray154[local141] & 0xFF);
						Static76.anIntArray154[arg0.anIntArray389[local61 & 0xFF]] |= local141 << 8;
						arg0.anIntArray389[local61 & 0xFF]++;
					}
					arg0.anInt4371 = Static76.anIntArray154[arg0.anInt4357] >> 8;
					arg0.anInt4356 = 0;
					arg0.anInt4371 = Static76.anIntArray154[arg0.anInt4371];
					arg0.anInt4378 = (byte) (arg0.anInt4371 & 0xFF);
					arg0.anInt4371 >>= 0x8;
					arg0.anInt4356++;
					arg0.anInt4363 = local475;
					method268(arg0);
					if (arg0.anInt4356 == arg0.anInt4363 + 1 && arg0.anInt4368 == 0) {
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

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!qn;)V")
	private static void method262(@OriginalArg(0) Class141 arg0) {
		arg0.anInt4366 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray43[local4]) {
				arg0.aByteArray57[arg0.anInt4366] = (byte) local4;
				arg0.anInt4366++;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(Lclient!qn;)B")
	private static byte method263(@OriginalArg(0) Class141 arg0) {
		return (byte) method264(1, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!qn;)I")
	private static int method264(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1) {
		while (arg1.anInt4360 < arg0) {
			arg1.anInt4364 = arg1.anInt4364 << 8 | arg1.aByteArray58[arg1.anInt4359] & 0xFF;
			arg1.anInt4360 += 8;
			arg1.anInt4359++;
			arg1.anInt4372++;
			if (arg1.anInt4372 == 0) {
			}
		}
		@Pc(17) int local17 = arg1.anInt4364 >> arg1.anInt4360 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt4360 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(Lclient!qn;)B")
	private static byte method265(@OriginalArg(0) Class141 arg0) {
		return (byte) method264(8, arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([BI[BII)I")
	public static int method267(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class141 local2 = aClass141_1;
		synchronized (aClass141_1) {
			aClass141_1.aByteArray58 = arg2;
			aClass141_1.anInt4359 = 9;
			aClass141_1.aByteArray62 = arg0;
			aClass141_1.anInt4373 = 0;
			aClass141_1.anInt4375 = arg1;
			aClass141_1.anInt4360 = 0;
			aClass141_1.anInt4364 = 0;
			aClass141_1.anInt4372 = 0;
			aClass141_1.anInt4358 = 0;
			method261(aClass141_1);
			@Pc(37) int local37 = arg1 - aClass141_1.anInt4375;
			aClass141_1.aByteArray58 = null;
			aClass141_1.aByteArray62 = null;
			return local37;
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(Lclient!qn;)V")
	private static void method268(@OriginalArg(0) Class141 arg0) {
		@Pc(2) byte local2 = arg0.aByte20;
		@Pc(5) int local5 = arg0.anInt4368;
		@Pc(8) int local8 = arg0.anInt4356;
		@Pc(11) int local11 = arg0.anInt4378;
		@Pc(13) int[] local13 = Static76.anIntArray154;
		@Pc(16) int local16 = arg0.anInt4371;
		@Pc(19) byte[] local19 = arg0.aByteArray62;
		@Pc(22) int local22 = arg0.anInt4373;
		@Pc(25) int local25 = arg0.anInt4375;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt4363 + 1;
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
		@Pc(215) int local215 = arg0.anInt4358;
		arg0.anInt4358 += local27 - local25;
		if (arg0.anInt4358 < local215) {
		}
		arg0.aByte20 = local2;
		arg0.anInt4368 = local5;
		arg0.anInt4356 = local8;
		arg0.anInt4378 = local11;
		Static76.anIntArray154 = local13;
		arg0.anInt4371 = local16;
		arg0.aByteArray62 = local19;
		arg0.anInt4373 = local22;
		arg0.anInt4375 = local25;
	}
}
