import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!KNTJWLVJ")
public final class Class20 {

	@OriginalMember(owner = "client!KNTJWLVJ", name = "a", descriptor = "Lclient!AQDAMOOL;")
	private static Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!KNTJWLVJ", name = "a", descriptor = "([BI[BII)I")
	public static int method201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class3 local3 = aClass3_1;
		synchronized (aClass3_1) {
			aClass3_1.aByteArray2 = arg2;
			aClass3_1.anInt53 = arg4;
			aClass3_1.aByteArray3 = arg0;
			aClass3_1.anInt57 = 0;
			aClass3_1.anInt54 = arg3;
			aClass3_1.anInt58 = arg1;
			aClass3_1.anInt63 = 0;
			aClass3_1.anInt62 = 0;
			aClass3_1.anInt55 = 0;
			aClass3_1.anInt56 = 0;
			aClass3_1.anInt59 = 0;
			aClass3_1.anInt60 = 0;
			aClass3_1.anInt65 = 0;
			method203(aClass3_1);
			return arg1 - aClass3_1.anInt58;
		}
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "a", descriptor = "(Lclient!AQDAMOOL;)V")
	private static void method202(@OriginalArg(0) Class3 arg0) {
		@Pc(4) byte local4 = arg0.aByte3;
		@Pc(7) int local7 = arg0.anInt61;
		@Pc(10) int local10 = arg0.anInt69;
		@Pc(13) int local13 = arg0.anInt68;
		@Pc(15) int[] local15 = Class3.anIntArray7;
		@Pc(18) int local18 = arg0.anInt67;
		@Pc(21) byte[] local21 = arg0.aByteArray3;
		@Pc(24) int local24 = arg0.anInt57;
		@Pc(27) int local27 = arg0.anInt58;
		@Pc(29) int local29 = local27;
		@Pc(34) int local34 = arg0.anInt71 + 1;
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
		@Pc(224) int local224 = arg0.anInt59;
		arg0.anInt59 += local29 - local27;
		if (arg0.anInt59 < local224) {
			arg0.anInt60++;
		}
		arg0.aByte3 = local4;
		arg0.anInt61 = local7;
		arg0.anInt69 = local10;
		arg0.anInt68 = local13;
		Class3.anIntArray7 = local15;
		arg0.anInt67 = local18;
		arg0.aByteArray3 = local21;
		arg0.anInt57 = local24;
		arg0.anInt58 = local27;
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "b", descriptor = "(Lclient!AQDAMOOL;)V")
	private static void method203(@OriginalArg(0) Class3 arg0) {
		arg0.anInt64 = 1;
		if (Class3.anIntArray7 == null) {
			Class3.anIntArray7 = new int[arg0.anInt64 * 100000];
		}
		@Pc(60) boolean local60 = true;
		while (true) {
			while (local60) {
				@Pc(64) byte local64 = method204(arg0);
				if (local64 == 23) {
					return;
				}
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method204(arg0);
				arg0.anInt65++;
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method204(arg0);
				local64 = method205(arg0);
				if (local64 == 0) {
					arg0.aBoolean16 = false;
				} else {
					arg0.aBoolean16 = true;
				}
				if (arg0.aBoolean16) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.anInt66 = 0;
				local64 = method204(arg0);
				arg0.anInt66 = arg0.anInt66 << 8 | local64 & 0xFF;
				local64 = method204(arg0);
				arg0.anInt66 = arg0.anInt66 << 8 | local64 & 0xFF;
				local64 = method204(arg0);
				arg0.anInt66 = arg0.anInt66 << 8 | local64 & 0xFF;
				@Pc(164) int local164;
				for (local164 = 0; local164 < 16; local164++) {
					local64 = method205(arg0);
					if (local64 == 1) {
						arg0.aBooleanArray2[local164] = true;
					} else {
						arg0.aBooleanArray2[local164] = false;
					}
				}
				for (local164 = 0; local164 < 256; local164++) {
					arg0.aBooleanArray1[local164] = false;
				}
				@Pc(212) int local212;
				for (local164 = 0; local164 < 16; local164++) {
					if (arg0.aBooleanArray2[local164]) {
						for (local212 = 0; local212 < 16; local212++) {
							local64 = method205(arg0);
							if (local64 == 1) {
								arg0.aBooleanArray1[local164 * 16 + local212] = true;
							}
						}
					}
				}
				method207(arg0);
				@Pc(244) int local244 = arg0.anInt70 + 2;
				@Pc(248) int local248 = method206(3, arg0);
				@Pc(252) int local252 = method206(15, arg0);
				for (local164 = 0; local164 < local252; local164++) {
					local212 = 0;
					while (true) {
						local64 = method205(arg0);
						if (local64 == 0) {
							arg0.aByteArray7[local164] = (byte) local212;
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
					local281 = arg0.aByteArray7[local164];
					@Pc(308) byte local308 = local279[local281];
					while (local281 > 0) {
						local279[local281] = local279[local281 - 1];
						local281--;
					}
					local279[0] = local308;
					arg0.aByteArray6[local164] = local308;
				}
				@Pc(340) int local340;
				for (local340 = 0; local340 < local248; local340++) {
					@Pc(346) int local346 = method206(5, arg0);
					for (local164 = 0; local164 < local244; local164++) {
						while (true) {
							local64 = method205(arg0);
							if (local64 == 0) {
								arg0.aByteArrayArray1[local340][local164] = (byte) local346;
								break;
							}
							local64 = method205(arg0);
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
						if (arg0.aByteArrayArray1[local340][local164] > local390) {
							local390 = arg0.aByteArrayArray1[local340][local164];
						}
						if (arg0.aByteArrayArray1[local340][local164] < local388) {
							local388 = arg0.aByteArrayArray1[local340][local164];
						}
					}
					method208(arg0.anIntArrayArray1[local340], arg0.anIntArrayArray2[local340], arg0.anIntArrayArray3[local340], arg0.aByteArrayArray1[local340], local388, local390, local244);
					arg0.anIntArray9[local340] = local388;
				}
				@Pc(462) int local462 = arg0.anInt70 + 1;
				@Pc(467) int local467 = arg0.anInt64 * 100000;
				@Pc(469) byte local469 = -1;
				for (local164 = 0; local164 <= 255; local164++) {
					arg0.anIntArray4[local164] = 0;
				}
				@Pc(486) int local486 = 4095;
				for (@Pc(488) int local488 = 15; local488 >= 0; local488--) {
					for (@Pc(492) int local492 = 15; local492 >= 0; local492--) {
						arg0.aByteArray5[local486] = (byte) (local488 * 16 + local492);
						local486--;
					}
					arg0.anIntArray8[local488] = local486 + 1;
				}
				@Pc(520) int local520 = 0;
				@Pc(523) int local523 = local469 + 1;
				@Pc(525) byte local525 = 50;
				@Pc(530) byte local530 = arg0.aByteArray6[0];
				@Pc(535) int local535 = arg0.anIntArray9[local530];
				@Pc(540) int[] local540 = arg0.anIntArrayArray1[local530];
				@Pc(545) int[] local545 = arg0.anIntArrayArray3[local530];
				@Pc(550) int[] local550 = arg0.anIntArrayArray2[local530];
				@Pc(551) int local551 = local525 - 1;
				@Pc(553) int local553 = local535;
				@Pc(557) int local557;
				@Pc(566) byte local566;
				for (local557 = method206(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
					local553++;
					local566 = method205(arg0);
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
									local530 = arg0.aByteArray6[local523];
									local535 = arg0.anIntArray9[local530];
									local540 = arg0.anIntArrayArray1[local530];
									local545 = arg0.anIntArrayArray3[local530];
									local550 = arg0.anIntArrayArray2[local530];
								}
								local551--;
								local553 = local535;
								for (local557 = method206(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
									local553++;
									local566 = method205(arg0);
								}
								local582 = local545[local557 - local550[local553]];
							} while (local582 == 0 || local582 == 1);
							local592++;
							local64 = arg0.aByteArray4[arg0.aByteArray5[arg0.anIntArray8[0]] & 0xFF];
							arg0.anIntArray4[local64 & 0xFF] += local592;
							while (local592 > 0) {
								Class3.anIntArray7[local520] = local64 & 0xFF;
								local520++;
								local592--;
							}
						} else {
							@Pc(724) int local724 = local582 - 1;
							@Pc(732) int local732;
							if (local724 < 16) {
								local732 = arg0.anIntArray8[0];
								local64 = arg0.aByteArray5[local732 + local724];
								while (local724 > 3) {
									@Pc(745) int local745 = local732 + local724;
									arg0.aByteArray5[local745] = arg0.aByteArray5[local745 - 1];
									arg0.aByteArray5[local745 - 1] = arg0.aByteArray5[local745 - 2];
									arg0.aByteArray5[local745 - 2] = arg0.aByteArray5[local745 - 3];
									arg0.aByteArray5[local745 - 3] = arg0.aByteArray5[local745 - 4];
									local724 -= 4;
								}
								while (local724 > 0) {
									arg0.aByteArray5[local732 + local724] = arg0.aByteArray5[local732 + local724 - 1];
									local724--;
								}
								arg0.aByteArray5[local732] = local64;
							} else {
								@Pc(825) int local825 = local724 / 16;
								@Pc(829) int local829 = local724 % 16;
								local732 = arg0.anIntArray8[local825] + local829;
								local64 = arg0.aByteArray5[local732];
								while (local732 > arg0.anIntArray8[local825]) {
									arg0.aByteArray5[local732] = arg0.aByteArray5[local732 - 1];
									local732--;
								}
								@Pc(865) int local865 = arg0.anIntArray8[local825]++;
								while (local825 > 0) {
									local865 = arg0.anIntArray8[local825]--;
									arg0.aByteArray5[arg0.anIntArray8[local825]] = arg0.aByteArray5[arg0.anIntArray8[local825 - 1] + 16 - 1];
									local825--;
								}
								local865 = arg0.anIntArray8[0]--;
								arg0.aByteArray5[arg0.anIntArray8[0]] = local64;
								if (arg0.anIntArray8[0] == 0) {
									@Pc(924) int local924 = 4095;
									for (@Pc(926) int local926 = 15; local926 >= 0; local926--) {
										for (@Pc(930) int local930 = 15; local930 >= 0; local930--) {
											arg0.aByteArray5[local924] = arg0.aByteArray5[arg0.anIntArray8[local926] + local930];
											local924--;
										}
										arg0.anIntArray8[local926] = local924 + 1;
									}
								}
							}
							arg0.anIntArray4[arg0.aByteArray4[local64 & 0xFF] & 0xFF]++;
							Class3.anIntArray7[local520] = arg0.aByteArray4[local64 & 0xFF] & 0xFF;
							local520++;
							if (local551 == 0) {
								local523++;
								local551 = 50;
								local530 = arg0.aByteArray6[local523];
								local535 = arg0.anIntArray9[local530];
								local540 = arg0.anIntArrayArray1[local530];
								local545 = arg0.anIntArrayArray3[local530];
								local550 = arg0.anIntArrayArray2[local530];
							}
							local551--;
							local553 = local535;
							for (local557 = method206(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
								local553++;
								local566 = method205(arg0);
							}
							local582 = local545[local557 - local550[local553]];
						}
					}
					arg0.anInt61 = 0;
					arg0.aByte3 = 0;
					arg0.anIntArray5[0] = 0;
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray5[local164] = arg0.anIntArray4[local164 - 1];
					}
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray5[local164] += arg0.anIntArray5[local164 - 1];
					}
					for (local164 = 0; local164 < local520; local164++) {
						local64 = (byte) (Class3.anIntArray7[local164] & 0xFF);
						Class3.anIntArray7[arg0.anIntArray5[local64 & 0xFF]] |= local164 << 8;
						arg0.anIntArray5[local64 & 0xFF]++;
					}
					arg0.anInt67 = Class3.anIntArray7[arg0.anInt66] >> 8;
					arg0.anInt69 = 0;
					arg0.anInt67 = Class3.anIntArray7[arg0.anInt67];
					arg0.anInt68 = (byte) (arg0.anInt67 & 0xFF);
					arg0.anInt67 >>= 0x8;
					arg0.anInt69++;
					arg0.anInt71 = local520;
					method202(arg0);
					if (arg0.anInt69 == arg0.anInt71 + 1 && arg0.anInt61 == 0) {
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

	@OriginalMember(owner = "client!KNTJWLVJ", name = "c", descriptor = "(Lclient!AQDAMOOL;)B")
	private static byte method204(@OriginalArg(0) Class3 arg0) {
		return (byte) method206(8, arg0);
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "d", descriptor = "(Lclient!AQDAMOOL;)B")
	private static byte method205(@OriginalArg(0) Class3 arg0) {
		return (byte) method206(1, arg0);
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "a", descriptor = "(ILclient!AQDAMOOL;)I")
	private static int method206(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		while (arg1.anInt63 < arg0) {
			arg1.anInt62 = arg1.anInt62 << 8 | arg1.aByteArray2[arg1.anInt53] & 0xFF;
			arg1.anInt63 += 8;
			arg1.anInt53++;
			arg1.anInt54--;
			arg1.anInt55++;
			if (arg1.anInt55 == 0) {
				arg1.anInt56++;
			}
		}
		@Pc(17) int local17 = arg1.anInt62 >> arg1.anInt63 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt63 -= arg0;
		return local17;
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "e", descriptor = "(Lclient!AQDAMOOL;)V")
	private static void method207(@OriginalArg(0) Class3 arg0) {
		arg0.anInt70 = 0;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray1[local4]) {
				arg0.aByteArray4[arg0.anInt70] = (byte) local4;
				arg0.anInt70++;
			}
		}
	}

	@OriginalMember(owner = "client!KNTJWLVJ", name = "a", descriptor = "([I[I[I[BIII)V")
	private static void method208(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
