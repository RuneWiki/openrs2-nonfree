import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class38 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!sb;")
	private static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI[BII)I")
	public static int method581(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class41 local3 = aClass41_1;
		synchronized (aClass41_1) {
			aClass41_1.aByteArray11 = arg2;
			aClass41_1.anInt928 = arg4;
			aClass41_1.aByteArray12 = arg0;
			aClass41_1.anInt932 = 0;
			aClass41_1.anInt929 = arg3;
			aClass41_1.anInt933 = arg1;
			aClass41_1.anInt938 = 0;
			aClass41_1.anInt937 = 0;
			aClass41_1.anInt930 = 0;
			aClass41_1.anInt931 = 0;
			aClass41_1.anInt934 = 0;
			aClass41_1.anInt935 = 0;
			aClass41_1.anInt940 = 0;
			method583(aClass41_1);
			return arg1 - aClass41_1.anInt933;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!sb;)V")
	private static void method582(@OriginalArg(0) Class41 arg0) {
		@Pc(4) byte local4 = arg0.aByte37;
		@Pc(7) int local7 = arg0.anInt936;
		@Pc(10) int local10 = arg0.anInt944;
		@Pc(13) int local13 = arg0.anInt943;
		@Pc(15) int[] local15 = Class41.anIntArray251;
		@Pc(18) int local18 = arg0.anInt942;
		@Pc(21) byte[] local21 = arg0.aByteArray12;
		@Pc(24) int local24 = arg0.anInt932;
		@Pc(27) int local27 = arg0.anInt933;
		@Pc(29) int local29 = local27;
		@Pc(34) int local34 = arg0.anInt946 + 1;
		label67: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local27 == 0) {
						break label67;
					}
					if (local7 == 1) {
						if (local27 == 0) {
							local7 = 1;
							break label67;
						}
						local21[local24] = local4;
						local24++;
						local27--;
						break;
					}
					local21[local24] = local4;
					local7--;
					local24++;
					local27--;
				}
			}
			@Pc(64) boolean local64 = true;
			@Pc(87) byte local87;
			while (local64) {
				local64 = false;
				if (local10 == local34) {
					local7 = 0;
					break label67;
				}
				local4 = (byte) local13;
				local18 = local15[local18];
				local87 = (byte) (local18 & 0xFF);
				local18 >>= 0x8;
				local10++;
				if (local87 != local13) {
					local13 = local87;
					if (local27 == 0) {
						local7 = 1;
						break label67;
					}
					local21[local24] = local4;
					local24++;
					local27--;
					local64 = true;
				} else if (local10 == local34) {
					if (local27 == 0) {
						local7 = 1;
						break label67;
					}
					local21[local24] = local4;
					local24++;
					local27--;
					local64 = true;
				}
			}
			local7 = 2;
			local18 = local15[local18];
			local87 = (byte) (local18 & 0xFF);
			local18 >>= 0x8;
			local10++;
			if (local10 != local34) {
				if (local87 == local13) {
					local7 = 3;
					local18 = local15[local18];
					local87 = (byte) (local18 & 0xFF);
					local18 >>= 0x8;
					local10++;
					if (local10 != local34) {
						if (local87 == local13) {
							local18 = local15[local18];
							local87 = (byte) (local18 & 0xFF);
							local18 >>= 0x8;
							local10++;
							local7 = (local87 & 0xFF) + 4;
							local18 = local15[local18];
							local13 = (byte) (local18 & 0xFF);
							local18 >>= 0x8;
							local10++;
						} else {
							local13 = local87;
						}
					}
				} else {
					local13 = local87;
				}
			}
		}
		@Pc(224) int local224 = arg0.anInt934;
		arg0.anInt934 += local29 - local27;
		if (arg0.anInt934 < local224) {
			arg0.anInt935++;
		}
		arg0.aByte37 = local4;
		arg0.anInt936 = local7;
		arg0.anInt944 = local10;
		arg0.anInt943 = local13;
		Class41.anIntArray251 = local15;
		arg0.anInt942 = local18;
		arg0.aByteArray12 = local21;
		arg0.anInt932 = local24;
		arg0.anInt933 = local27;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!sb;)V")
	private static void method583(@OriginalArg(0) Class41 arg0) {
		arg0.anInt939 = 1;
		if (Class41.anIntArray251 == null) {
			Class41.anIntArray251 = new int[arg0.anInt939 * 100000];
		}
		@Pc(60) boolean local60 = true;
		while (true) {
			while (local60) {
				@Pc(64) byte local64 = method584(arg0);
				if (local64 == 23) {
					return;
				}
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method584(arg0);
				arg0.anInt940++;
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method584(arg0);
				local64 = method585(arg0);
				if (local64 == 0) {
					arg0.aBoolean229 = false;
				} else {
					arg0.aBoolean229 = true;
				}
				if (arg0.aBoolean229) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.anInt941 = 0;
				local64 = method584(arg0);
				arg0.anInt941 = arg0.anInt941 << 8 | local64 & 0xFF;
				local64 = method584(arg0);
				arg0.anInt941 = arg0.anInt941 << 8 | local64 & 0xFF;
				local64 = method584(arg0);
				arg0.anInt941 = arg0.anInt941 << 8 | local64 & 0xFF;
				@Pc(164) int local164;
				for (local164 = 0; local164 < 16; local164++) {
					local64 = method585(arg0);
					if (local64 == 1) {
						arg0.aBooleanArray11[local164] = true;
					} else {
						arg0.aBooleanArray11[local164] = false;
					}
				}
				for (local164 = 0; local164 < 256; local164++) {
					arg0.aBooleanArray10[local164] = false;
				}
				@Pc(212) int local212;
				for (local164 = 0; local164 < 16; local164++) {
					if (arg0.aBooleanArray11[local164]) {
						for (local212 = 0; local212 < 16; local212++) {
							local64 = method585(arg0);
							if (local64 == 1) {
								arg0.aBooleanArray10[local164 * 16 + local212] = true;
							}
						}
					}
				}
				method587(arg0);
				@Pc(244) int local244 = arg0.anInt945 + 2;
				@Pc(248) int local248 = method586(3, arg0);
				@Pc(252) int local252 = method586(15, arg0);
				for (local164 = 0; local164 < local252; local164++) {
					local212 = 0;
					while (true) {
						local64 = method585(arg0);
						if (local64 == 0) {
							arg0.aByteArray16[local164] = (byte) local212;
							break;
						}
						local212++;
					}
				}
				@Pc(279) byte[] local279 = new byte[6];
				@Pc(281) byte local281 = 0;
				while (local281 < local248) {
					local279[local281] = local281++;
				}
				for (local164 = 0; local164 < local252; local164++) {
					local281 = arg0.aByteArray16[local164];
					@Pc(308) byte local308 = local279[local281];
					while (local281 > 0) {
						local279[local281] = local279[local281 - 1];
						local281--;
					}
					local279[0] = local308;
					arg0.aByteArray15[local164] = local308;
				}
				@Pc(340) int local340;
				for (local340 = 0; local340 < local248; local340++) {
					@Pc(346) int local346 = method586(5, arg0);
					for (local164 = 0; local164 < local244; local164++) {
						while (true) {
							local64 = method585(arg0);
							if (local64 == 0) {
								arg0.aByteArrayArray4[local340][local164] = (byte) local346;
								break;
							}
							local64 = method585(arg0);
							if (local64 == 0) {
								local346++;
							} else {
								local346--;
							}
						}
					}
				}
				for (local340 = 0; local340 < local248; local340++) {
					@Pc(388) byte local388 = 32;
					@Pc(390) byte local390 = 0;
					for (local164 = 0; local164 < local244; local164++) {
						if (arg0.aByteArrayArray4[local340][local164] > local390) {
							local390 = arg0.aByteArrayArray4[local340][local164];
						}
						if (arg0.aByteArrayArray4[local340][local164] < local388) {
							local388 = arg0.aByteArrayArray4[local340][local164];
						}
					}
					method588(arg0.anIntArrayArray21[local340], arg0.anIntArrayArray22[local340], arg0.anIntArrayArray23[local340], arg0.aByteArrayArray4[local340], local388, local390, local244);
					arg0.anIntArray253[local340] = local388;
				}
				@Pc(462) int local462 = arg0.anInt945 + 1;
				@Pc(467) int local467 = arg0.anInt939 * 100000;
				@Pc(469) byte local469 = -1;
				for (local164 = 0; local164 <= 255; local164++) {
					arg0.anIntArray248[local164] = 0;
				}
				@Pc(486) int local486 = 4095;
				for (@Pc(488) int local488 = 15; local488 >= 0; local488--) {
					for (@Pc(492) int local492 = 15; local492 >= 0; local492--) {
						arg0.aByteArray14[local486] = (byte) (local488 * 16 + local492);
						local486--;
					}
					arg0.anIntArray252[local488] = local486 + 1;
				}
				@Pc(520) int local520 = 0;
				@Pc(523) int local523 = local469 + 1;
				@Pc(525) byte local525 = 50;
				@Pc(530) byte local530 = arg0.aByteArray15[0];
				@Pc(535) int local535 = arg0.anIntArray253[local530];
				@Pc(540) int[] local540 = arg0.anIntArrayArray21[local530];
				@Pc(545) int[] local545 = arg0.anIntArrayArray23[local530];
				@Pc(550) int[] local550 = arg0.anIntArrayArray22[local530];
				@Pc(551) int local551 = local525 - 1;
				@Pc(553) int local553 = local535;
				@Pc(557) int local557;
				@Pc(566) byte local566;
				for (local557 = method586(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
					local553++;
					local566 = method585(arg0);
				}
				@Pc(582) int local582 = local545[local557 - local550[local553]];
				while (true) {
					while (local582 != local462) {
						if (local582 == 0 || local582 == 1) {
							@Pc(592) int local592 = -1;
							@Pc(594) int local594 = 1;
							do {
								if (local582 == 0) {
									local592 += local594;
								} else if (local582 == 1) {
									local592 += local594 * 2;
								}
								local594 *= 2;
								if (local551 == 0) {
									local523++;
									local551 = 50;
									local530 = arg0.aByteArray15[local523];
									local535 = arg0.anIntArray253[local530];
									local540 = arg0.anIntArrayArray21[local530];
									local545 = arg0.anIntArrayArray23[local530];
									local550 = arg0.anIntArrayArray22[local530];
								}
								local551--;
								local553 = local535;
								for (local557 = method586(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
									local553++;
									local566 = method585(arg0);
								}
								local582 = local545[local557 - local550[local553]];
							} while (local582 == 0 || local582 == 1);
							local592++;
							local64 = arg0.aByteArray13[arg0.aByteArray14[arg0.anIntArray252[0]] & 0xFF];
							arg0.anIntArray248[local64 & 0xFF] += local592;
							while (local592 > 0) {
								Class41.anIntArray251[local520] = local64 & 0xFF;
								local520++;
								local592--;
							}
						} else {
							@Pc(724) int local724 = local582 - 1;
							@Pc(732) int local732;
							if (local724 < 16) {
								local732 = arg0.anIntArray252[0];
								local64 = arg0.aByteArray14[local732 + local724];
								while (local724 > 3) {
									@Pc(745) int local745 = local732 + local724;
									arg0.aByteArray14[local745] = arg0.aByteArray14[local745 - 1];
									arg0.aByteArray14[local745 - 1] = arg0.aByteArray14[local745 - 2];
									arg0.aByteArray14[local745 - 2] = arg0.aByteArray14[local745 - 3];
									arg0.aByteArray14[local745 - 3] = arg0.aByteArray14[local745 - 4];
									local724 -= 4;
								}
								while (local724 > 0) {
									arg0.aByteArray14[local732 + local724] = arg0.aByteArray14[local732 + local724 - 1];
									local724--;
								}
								arg0.aByteArray14[local732] = local64;
							} else {
								@Pc(825) int local825 = local724 / 16;
								@Pc(829) int local829 = local724 % 16;
								local732 = arg0.anIntArray252[local825] + local829;
								local64 = arg0.aByteArray14[local732];
								while (local732 > arg0.anIntArray252[local825]) {
									arg0.aByteArray14[local732] = arg0.aByteArray14[local732 - 1];
									local732--;
								}
								@Pc(865) int local865 = arg0.anIntArray252[local825]++;
								while (local825 > 0) {
									local865 = arg0.anIntArray252[local825]--;
									arg0.aByteArray14[arg0.anIntArray252[local825]] = arg0.aByteArray14[arg0.anIntArray252[local825 - 1] + 16 - 1];
									local825--;
								}
								local865 = arg0.anIntArray252[0]--;
								arg0.aByteArray14[arg0.anIntArray252[0]] = local64;
								if (arg0.anIntArray252[0] == 0) {
									@Pc(924) int local924 = 4095;
									for (@Pc(926) int local926 = 15; local926 >= 0; local926--) {
										for (@Pc(930) int local930 = 15; local930 >= 0; local930--) {
											arg0.aByteArray14[local924] = arg0.aByteArray14[arg0.anIntArray252[local926] + local930];
											local924--;
										}
										arg0.anIntArray252[local926] = local924 + 1;
									}
								}
							}
							arg0.anIntArray248[arg0.aByteArray13[local64 & 0xFF] & 0xFF]++;
							Class41.anIntArray251[local520] = arg0.aByteArray13[local64 & 0xFF] & 0xFF;
							local520++;
							if (local551 == 0) {
								local523++;
								local551 = 50;
								local530 = arg0.aByteArray15[local523];
								local535 = arg0.anIntArray253[local530];
								local540 = arg0.anIntArrayArray21[local530];
								local545 = arg0.anIntArrayArray23[local530];
								local550 = arg0.anIntArrayArray22[local530];
							}
							local551--;
							local553 = local535;
							for (local557 = method586(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
								local553++;
								local566 = method585(arg0);
							}
							local582 = local545[local557 - local550[local553]];
						}
					}
					arg0.anInt936 = 0;
					arg0.aByte37 = 0;
					arg0.anIntArray249[0] = 0;
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray249[local164] = arg0.anIntArray248[local164 - 1];
					}
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray249[local164] += arg0.anIntArray249[local164 - 1];
					}
					for (local164 = 0; local164 < local520; local164++) {
						local64 = (byte) (Class41.anIntArray251[local164] & 0xFF);
						Class41.anIntArray251[arg0.anIntArray249[local64 & 0xFF]] |= local164 << 8;
						arg0.anIntArray249[local64 & 0xFF]++;
					}
					arg0.anInt942 = Class41.anIntArray251[arg0.anInt941] >> 8;
					arg0.anInt944 = 0;
					arg0.anInt942 = Class41.anIntArray251[arg0.anInt942];
					arg0.anInt943 = (byte) (arg0.anInt942 & 0xFF);
					arg0.anInt942 >>= 0x8;
					arg0.anInt944++;
					arg0.anInt946 = local520;
					method582(arg0);
					if (arg0.anInt944 == arg0.anInt946 + 1 && arg0.anInt936 == 0) {
						local60 = true;
						break;
					}
					local60 = false;
					break;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!sb;)B")
	private static byte method584(@OriginalArg(0) Class41 arg0) {
		return (byte) method586(8, arg0);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Lclient!sb;)B")
	private static byte method585(@OriginalArg(0) Class41 arg0) {
		return (byte) method586(1, arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!sb;)I")
	private static int method586(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1) {
		while (arg1.anInt938 < arg0) {
			arg1.anInt937 = arg1.anInt937 << 8 | arg1.aByteArray11[arg1.anInt928] & 0xFF;
			arg1.anInt938 += 8;
			arg1.anInt928++;
			arg1.anInt929--;
			arg1.anInt930++;
			if (arg1.anInt930 == 0) {
				arg1.anInt931++;
			}
		}
		@Pc(17) int local17 = arg1.anInt937 >> arg1.anInt938 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt938 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(Lclient!sb;)V")
	private static void method587(@OriginalArg(0) Class41 arg0) {
		arg0.anInt945 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray10[local4]) {
				arg0.aByteArray13[arg0.anInt945] = (byte) local4;
				arg0.anInt945++;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method588(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5;
		for (local5 = arg4; local5 <= arg5; local5++) {
			for (@Pc(9) int local9 = 0; local9 < arg6; local9++) {
				if (arg3[local9] == local5) {
					arg2[local3] = local9;
					local3++;
				}
			}
		}
		for (local5 = 0; local5 < 23; local5++) {
			arg1[local5] = 0;
		}
		for (local5 = 0; local5 < arg6; local5++) {
			arg1[arg3[local5] + 1]++;
		}
		for (local5 = 1; local5 < 23; local5++) {
			arg1[local5] += arg1[local5 - 1];
		}
		for (local5 = 0; local5 < 23; local5++) {
			arg0[local5] = 0;
		}
		@Pc(93) int local93 = 0;
		for (local5 = arg4; local5 <= arg5; local5++) {
			local93 += arg1[local5 + 1] - arg1[local5];
			arg0[local5] = local93 - 1;
			local93 <<= 0x1;
		}
		for (local5 = arg4 + 1; local5 <= arg5; local5++) {
			arg1[local5] = (arg0[local5 - 1] + 1 << 1) - arg1[local5];
		}
	}
}
