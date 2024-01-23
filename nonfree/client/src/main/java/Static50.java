import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!tf;")
	private static Class115 aClass115_1 = new Class115();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!tf;)I")
	private static int method1035(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1) {
		while (arg1.anInt4378 < arg0) {
			arg1.anInt4381 = arg1.anInt4381 << 8 | arg1.aByteArray59[arg1.anInt4380] & 0xFF;
			arg1.anInt4378 += 8;
			arg1.anInt4380++;
			arg1.anInt4386++;
		}
		@Pc(17) int local17 = arg1.anInt4381 >> arg1.anInt4378 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt4378 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!tf;)B")
	private static byte method1036(@OriginalArg(0) Class115 arg0) {
		return (byte) method1035(8, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lclient!tf;)V")
	private static void method1037(@OriginalArg(0) Class115 arg0) {
		arg0.anInt4387 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray26[local4]) {
				arg0.aByteArray58[arg0.anInt4387] = (byte) local4;
				arg0.anInt4387++;
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lclient!tf;)V")
	private static void method1039(@OriginalArg(0) Class115 arg0) {
		arg0.anInt4376 = 1;
		if (Static139.anIntArray261 == null) {
			Static139.anIntArray261 = new int[arg0.anInt4376 * 100000];
		}
		@Pc(56) boolean local56 = true;
		while (true) {
			while (local56) {
				@Pc(60) byte local60 = method1036(arg0);
				if (local60 == 23) {
					return;
				}
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1036(arg0);
				local60 = method1041(arg0);
				arg0.anInt4374 = 0;
				local60 = method1036(arg0);
				arg0.anInt4374 = arg0.anInt4374 << 8 | local60 & 0xFF;
				local60 = method1036(arg0);
				arg0.anInt4374 = arg0.anInt4374 << 8 | local60 & 0xFF;
				local60 = method1036(arg0);
				arg0.anInt4374 = arg0.anInt4374 << 8 | local60 & 0xFF;
				@Pc(138) int local138;
				for (local138 = 0; local138 < 16; local138++) {
					local60 = method1041(arg0);
					if (local60 == 1) {
						arg0.aBooleanArray25[local138] = true;
					} else {
						arg0.aBooleanArray25[local138] = false;
					}
				}
				for (local138 = 0; local138 < 256; local138++) {
					arg0.aBooleanArray26[local138] = false;
				}
				@Pc(182) int local182;
				for (local138 = 0; local138 < 16; local138++) {
					if (arg0.aBooleanArray25[local138]) {
						for (local182 = 0; local182 < 16; local182++) {
							local60 = method1041(arg0);
							if (local60 == 1) {
								arg0.aBooleanArray26[local138 * 16 + local182] = true;
							}
						}
					}
				}
				method1037(arg0);
				@Pc(213) int local213 = arg0.anInt4387 + 2;
				@Pc(217) int local217 = method1035(3, arg0);
				@Pc(221) int local221 = method1035(15, arg0);
				for (local138 = 0; local138 < local221; local138++) {
					local182 = 0;
					while (true) {
						local60 = method1041(arg0);
						if (local60 == 0) {
							arg0.aByteArray61[local138] = (byte) local182;
							break;
						}
						local182++;
					}
				}
				@Pc(246) byte[] local246 = new byte[6];
				@Pc(248) byte local248 = 0;
				while (local248 < local217) {
					local246[local248] = local248++;
				}
				for (local138 = 0; local138 < local221; local138++) {
					local248 = arg0.aByteArray61[local138];
					@Pc(273) byte local273 = local246[local248];
					while (local248 > 0) {
						local246[local248] = local246[local248 - 1];
						local248--;
					}
					local246[0] = local273;
					arg0.aByteArray60[local138] = local273;
				}
				@Pc(304) int local304;
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(309) int local309 = method1035(5, arg0);
					for (local138 = 0; local138 < local213; local138++) {
						while (true) {
							local60 = method1041(arg0);
							if (local60 == 0) {
								arg0.aByteArrayArray10[local304][local138] = (byte) local309;
								break;
							}
							local60 = method1041(arg0);
							if (local60 == 0) {
								local309++;
							} else {
								local309--;
							}
						}
					}
				}
				for (local304 = 0; local304 < local217; local304++) {
					@Pc(347) byte local347 = 32;
					@Pc(349) byte local349 = 0;
					for (local138 = 0; local138 < local213; local138++) {
						if (arg0.aByteArrayArray10[local304][local138] > local349) {
							local349 = arg0.aByteArrayArray10[local304][local138];
						}
						if (arg0.aByteArrayArray10[local304][local138] < local347) {
							local347 = arg0.aByteArrayArray10[local304][local138];
						}
					}
					method1043(arg0.anIntArrayArray40[local304], arg0.anIntArrayArray42[local304], arg0.anIntArrayArray41[local304], arg0.aByteArrayArray10[local304], local347, local349, local213);
					arg0.anIntArray357[local304] = local347;
				}
				@Pc(420) int local420 = arg0.anInt4387 + 1;
				@Pc(422) byte local422 = -1;
				for (local138 = 0; local138 <= 255; local138++) {
					arg0.anIntArray355[local138] = 0;
				}
				@Pc(438) int local438 = 4095;
				for (@Pc(440) int local440 = 15; local440 >= 0; local440--) {
					for (@Pc(443) int local443 = 15; local443 >= 0; local443--) {
						arg0.aByteArray57[local438] = (byte) (local440 * 16 + local443);
						local438--;
					}
					arg0.anIntArray356[local440] = local438 + 1;
				}
				@Pc(470) int local470 = 0;
				@Pc(473) int local473 = local422 + 1;
				@Pc(475) byte local475 = 50;
				@Pc(480) byte local480 = arg0.aByteArray60[0];
				@Pc(485) int local485 = arg0.anIntArray357[local480];
				@Pc(490) int[] local490 = arg0.anIntArrayArray40[local480];
				@Pc(495) int[] local495 = arg0.anIntArrayArray41[local480];
				@Pc(500) int[] local500 = arg0.anIntArrayArray42[local480];
				@Pc(501) int local501 = local475 - 1;
				@Pc(503) int local503 = local485;
				@Pc(507) int local507;
				@Pc(516) byte local516;
				for (local507 = method1035(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
					local503++;
					local516 = method1041(arg0);
				}
				@Pc(531) int local531 = local495[local507 - local500[local503]];
				while (true) {
					while (local531 != local420) {
						if (local531 == 0 || local531 == 1) {
							@Pc(541) int local541 = -1;
							@Pc(543) int local543 = 1;
							do {
								if (local531 == 0) {
									local541 += local543;
								} else if (local531 == 1) {
									local541 += local543 * 2;
								}
								local543 *= 2;
								if (local501 == 0) {
									local473++;
									local501 = 50;
									local480 = arg0.aByteArray60[local473];
									local485 = arg0.anIntArray357[local480];
									local490 = arg0.anIntArrayArray40[local480];
									local495 = arg0.anIntArrayArray41[local480];
									local500 = arg0.anIntArrayArray42[local480];
								}
								local501--;
								local503 = local485;
								for (local507 = method1035(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
									local503++;
									local516 = method1041(arg0);
								}
								local531 = local495[local507 - local500[local503]];
							} while (local531 == 0 || local531 == 1);
							local541++;
							local60 = arg0.aByteArray58[arg0.aByteArray57[arg0.anIntArray356[0]] & 0xFF];
							arg0.anIntArray355[local60 & 0xFF] += local541;
							while (local541 > 0) {
								Static139.anIntArray261[local470] = local60 & 0xFF;
								local470++;
								local541--;
							}
						} else {
							@Pc(669) int local669 = local531 - 1;
							@Pc(677) int local677;
							if (local669 < 16) {
								local677 = arg0.anIntArray356[0];
								local60 = arg0.aByteArray57[local677 + local669];
								while (local669 > 3) {
									@Pc(689) int local689 = local677 + local669;
									arg0.aByteArray57[local689] = arg0.aByteArray57[local689 - 1];
									arg0.aByteArray57[local689 - 1] = arg0.aByteArray57[local689 - 2];
									arg0.aByteArray57[local689 - 2] = arg0.aByteArray57[local689 - 3];
									arg0.aByteArray57[local689 - 3] = arg0.aByteArray57[local689 - 4];
									local669 -= 4;
								}
								while (local669 > 0) {
									arg0.aByteArray57[local677 + local669] = arg0.aByteArray57[local677 + local669 - 1];
									local669--;
								}
								arg0.aByteArray57[local677] = local60;
							} else {
								@Pc(767) int local767 = local669 / 16;
								@Pc(771) int local771 = local669 % 16;
								local677 = arg0.anIntArray356[local767] + local771;
								local60 = arg0.aByteArray57[local677];
								while (local677 > arg0.anIntArray356[local767]) {
									arg0.aByteArray57[local677] = arg0.aByteArray57[local677 - 1];
									local677--;
								}
								@Pc(806) int local806 = arg0.anIntArray356[local767]++;
								while (local767 > 0) {
									local806 = arg0.anIntArray356[local767]--;
									arg0.aByteArray57[arg0.anIntArray356[local767]] = arg0.aByteArray57[arg0.anIntArray356[local767 - 1] + 16 - 1];
									local767--;
								}
								local806 = arg0.anIntArray356[0]--;
								arg0.aByteArray57[arg0.anIntArray356[0]] = local60;
								if (arg0.anIntArray356[0] == 0) {
									@Pc(864) int local864 = 4095;
									for (@Pc(866) int local866 = 15; local866 >= 0; local866--) {
										for (@Pc(869) int local869 = 15; local869 >= 0; local869--) {
											arg0.aByteArray57[local864] = arg0.aByteArray57[arg0.anIntArray356[local866] + local869];
											local864--;
										}
										arg0.anIntArray356[local866] = local864 + 1;
									}
								}
							}
							arg0.anIntArray355[arg0.aByteArray58[local60 & 0xFF] & 0xFF]++;
							Static139.anIntArray261[local470] = arg0.aByteArray58[local60 & 0xFF] & 0xFF;
							local470++;
							if (local501 == 0) {
								local473++;
								local501 = 50;
								local480 = arg0.aByteArray60[local473];
								local485 = arg0.anIntArray357[local480];
								local490 = arg0.anIntArrayArray40[local480];
								local495 = arg0.anIntArrayArray41[local480];
								local500 = arg0.anIntArrayArray42[local480];
							}
							local501--;
							local503 = local485;
							for (local507 = method1035(local485, arg0); local507 > local490[local503]; local507 = local507 << 1 | local516) {
								local503++;
								local516 = method1041(arg0);
							}
							local531 = local495[local507 - local500[local503]];
						}
					}
					arg0.anInt4369 = 0;
					arg0.aByte17 = 0;
					arg0.anIntArray354[0] = 0;
					for (local138 = 1; local138 <= 256; local138++) {
						arg0.anIntArray354[local138] = arg0.anIntArray355[local138 - 1];
					}
					for (local138 = 1; local138 <= 256; local138++) {
						arg0.anIntArray354[local138] += arg0.anIntArray354[local138 - 1];
					}
					for (local138 = 0; local138 < local470; local138++) {
						local60 = (byte) (Static139.anIntArray261[local138] & 0xFF);
						Static139.anIntArray261[arg0.anIntArray354[local60 & 0xFF]] |= local138 << 8;
						arg0.anIntArray354[local60 & 0xFF]++;
					}
					arg0.anInt4373 = Static139.anIntArray261[arg0.anInt4374] >> 8;
					arg0.anInt4370 = 0;
					arg0.anInt4373 = Static139.anIntArray261[arg0.anInt4373];
					arg0.anInt4371 = (byte) (arg0.anInt4373 & 0xFF);
					arg0.anInt4373 >>= 0x8;
					arg0.anInt4370++;
					arg0.anInt4382 = local470;
					method1042(arg0);
					if (arg0.anInt4370 == arg0.anInt4382 + 1 && arg0.anInt4369 == 0) {
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

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([BI[BII)I")
	public static int method1040(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class115 local1 = aClass115_1;
		synchronized (aClass115_1) {
			aClass115_1.aByteArray59 = arg2;
			aClass115_1.anInt4380 = 9;
			aClass115_1.aByteArray56 = arg0;
			aClass115_1.anInt4385 = 0;
			aClass115_1.anInt4383 = arg1;
			aClass115_1.anInt4378 = 0;
			aClass115_1.anInt4381 = 0;
			aClass115_1.anInt4386 = 0;
			aClass115_1.anInt4375 = 0;
			method1039(aClass115_1);
			@Pc(37) int local37 = arg1 - aClass115_1.anInt4383;
			aClass115_1.aByteArray59 = null;
			aClass115_1.aByteArray56 = null;
			return local37;
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(Lclient!tf;)B")
	private static byte method1041(@OriginalArg(0) Class115 arg0) {
		return (byte) method1035(1, arg0);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(Lclient!tf;)V")
	private static void method1042(@OriginalArg(0) Class115 arg0) {
		@Pc(2) byte local2 = arg0.aByte17;
		@Pc(5) int local5 = arg0.anInt4369;
		@Pc(8) int local8 = arg0.anInt4370;
		@Pc(11) int local11 = arg0.anInt4371;
		@Pc(13) int[] local13 = Static139.anIntArray261;
		@Pc(16) int local16 = arg0.anInt4373;
		@Pc(19) byte[] local19 = arg0.aByteArray56;
		@Pc(22) int local22 = arg0.anInt4385;
		@Pc(25) int local25 = arg0.anInt4383;
		@Pc(27) int local27 = local25;
		@Pc(32) int local32 = arg0.anInt4382 + 1;
		label63: while (true) {
			if (local5 > 0) {
				while (true) {
					if (local25 == 0) {
						break label63;
					}
					if (local5 == 1) {
						if (local25 == 0) {
							local5 = 1;
							break label63;
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
			@Pc(60) boolean local60 = true;
			@Pc(81) byte local81;
			while (local60) {
				local60 = false;
				if (local8 == local32) {
					local5 = 0;
					break label63;
				}
				local2 = (byte) local11;
				local16 = local13[local16];
				local81 = (byte) (local16 & 0xFF);
				local16 >>= 0x8;
				local8++;
				if (local81 != local11) {
					local11 = local81;
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				} else if (local8 == local32) {
					if (local25 == 0) {
						local5 = 1;
						break label63;
					}
					local19[local22] = local2;
					local22++;
					local25--;
					local60 = true;
				}
			}
			local5 = 2;
			local16 = local13[local16];
			local81 = (byte) (local16 & 0xFF);
			local16 >>= 0x8;
			local8++;
			if (local8 != local32) {
				if (local81 == local11) {
					local5 = 3;
					local16 = local13[local16];
					local81 = (byte) (local16 & 0xFF);
					local16 >>= 0x8;
					local8++;
					if (local8 != local32) {
						if (local81 == local11) {
							local16 = local13[local16];
							local81 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
							local5 = (local81 & 0xFF) + 4;
							local16 = local13[local16];
							local11 = (byte) (local16 & 0xFF);
							local16 >>= 0x8;
							local8++;
						} else {
							local11 = local81;
						}
					}
				} else {
					local11 = local81;
				}
			}
		}
		@Pc(212) int local212 = arg0.anInt4375;
		arg0.anInt4375 += local27 - local25;
		arg0.aByte17 = local2;
		arg0.anInt4369 = local5;
		arg0.anInt4370 = local8;
		arg0.anInt4371 = local11;
		Static139.anIntArray261 = local13;
		arg0.anInt4373 = local16;
		arg0.aByteArray56 = local19;
		arg0.anInt4385 = local22;
		arg0.anInt4383 = local25;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method1043(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3;
		for (local3 = arg4; local3 <= arg5; local3++) {
			for (@Pc(6) int local6 = 0; local6 < arg6; local6++) {
				if (arg3[local6] == local3) {
					arg2[local1] = local6;
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
}
