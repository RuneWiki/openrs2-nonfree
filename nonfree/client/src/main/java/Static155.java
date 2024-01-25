import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "Lclient!da;")
	public static Class50 aClass50_4;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILclient!sca;)V")
	public static void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class302 arg2) {
		if (arg2.aByte104 == 0) {
			arg2.anInt8866 = arg2.anInt8873;
		} else if (arg2.aByte104 == 1) {
			arg2.anInt8866 = arg2.anInt8873 + (arg1 - arg2.anInt8801) / 2;
		} else if (arg2.aByte104 == 2) {
			arg2.anInt8866 = arg1 - arg2.anInt8801 - arg2.anInt8873;
		} else if (arg2.aByte104 == 3) {
			arg2.anInt8866 = arg1 * arg2.anInt8873 >> 14;
		} else if (arg2.aByte104 == 4) {
			arg2.anInt8866 = (arg1 - arg2.anInt8801) / 2 + (arg1 * arg2.anInt8873 >> 14);
		} else {
			arg2.anInt8866 = arg1 - arg2.anInt8801 - (arg1 * arg2.anInt8873 >> 14);
		}
		if (arg2.aByte105 == 0) {
			arg2.anInt8854 = arg2.anInt8853;
		} else if (arg2.aByte105 == 1) {
			arg2.anInt8854 = (arg0 - arg2.anInt8814) / 2 + arg2.anInt8853;
		} else if (arg2.aByte105 == 2) {
			arg2.anInt8854 = arg0 - arg2.anInt8853 - arg2.anInt8814;
		} else if (arg2.aByte105 == 3) {
			arg2.anInt8854 = arg0 * arg2.anInt8853 >> 14;
		} else if (arg2.aByte105 == 4) {
			arg2.anInt8854 = (arg0 - arg2.anInt8814) / 2 + (arg0 * arg2.anInt8853 >> 14);
		} else {
			arg2.anInt8854 = arg0 - arg2.anInt8814 - (arg2.anInt8853 * arg0 >> 14);
		}
		if (!Static321.aBoolean412) {
			return;
		}
		if (Static78.method1364(arg2).anInt9595 == 0 && arg2.anInt8816 != 0) {
			return;
		}
		if (arg2.anInt8854 < 0) {
			arg2.anInt8854 = 0;
		} else if (arg2.anInt8814 + arg2.anInt8854 > arg0) {
			arg2.anInt8854 = arg0 - arg2.anInt8814;
		}
		if (arg2.anInt8866 < 0) {
			arg2.anInt8866 = 0;
			return;
		}
		if (arg2.anInt8866 + arg2.anInt8801 > arg1) {
			arg2.anInt8866 = arg1 - arg2.anInt8801;
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([J[Ljava/lang/Object;BII)V")
	public static void method2437(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(11) int local11 = (arg2 + arg3) / 2;
		@Pc(13) int local13 = arg2;
		@Pc(17) long local17 = arg0[local11];
		arg0[local11] = arg0[arg3];
		arg0[arg3] = local17;
		@Pc(31) Object local31 = arg1[local11];
		arg1[local11] = arg1[arg3];
		arg1[arg3] = local31;
		@Pc(49) int local49 = local17 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg2; local51 < arg3; local51++) {
			if (arg0[local51] < (long) (local51 & local49) + local17) {
				@Pc(72) long local72 = arg0[local51];
				arg0[local51] = arg0[local13];
				arg0[local13] = local72;
				@Pc(86) Object local86 = arg1[local51];
				arg1[local51] = arg1[local13];
				arg1[local13++] = local86;
			}
		}
		arg0[arg3] = arg0[local13];
		arg0[local13] = local17;
		arg1[arg3] = arg1[local13];
		arg1[local13] = local31;
		method2437(arg0, arg1, arg2, local13 - 1);
		method2437(arg0, arg1, local13 + 1, arg3);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public static void method2438() {
		for (@Pc(7) int local7 = 0; local7 < Static501.anInt8668; local7++) {
			@Pc(13) int local13 = Static73.anIntArray110[local7];
			@Pc(21) Class20_Sub2_Sub2_Sub1_Sub2 local21 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) local13)).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			@Pc(25) int local25 = Static456.aClass6_Sub40_Sub2_2.method8604();
			if ((local25 & 0x40) != 0) {
				local25 += Static456.aClass6_Sub40_Sub2_2.method8604() << 8;
			}
			if ((local25 & 0x8000) != 0) {
				local25 += Static456.aClass6_Sub40_Sub2_2.method8604() << 16;
			}
			if ((local25 & 0x10000) != 0) {
				local21.anInt5598 = Static456.aClass6_Sub40_Sub2_2.method8552();
				if (local21.anInt5598 == 65535) {
					local21.anInt5598 = local21.aClass247_1.anInt7671;
				}
			}
			@Pc(81) int local81;
			if ((local25 & 0x400) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8571();
				local21.anInt5539 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local21.anInt5498 = Static456.aClass6_Sub40_Sub2_2.method8573();
				local21.anInt5488 = local81 & 0x7FFF;
				local21.aBoolean374 = (local81 & 0x8000) != 0;
				local21.anInt5565 = local21.anInt5539 + Static113.anInt2243 + local21.anInt5488;
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt5596 = Static456.aClass6_Sub40_Sub2_2.method8614();
				local21.anInt5582 = Static456.aClass6_Sub40_Sub2_2.method8552();
			}
			@Pc(147) int local147;
			@Pc(159) int local159;
			@Pc(151) int local151;
			@Pc(153) int local153;
			@Pc(155) int local155;
			@Pc(199) int local199;
			@Pc(203) int local203;
			if ((local25 & 0x1) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8573();
				if (local81 > 0) {
					for (local147 = 0; local147 < local81; local147++) {
						local151 = -1;
						local153 = -1;
						local155 = -1;
						local159 = Static456.aClass6_Sub40_Sub2_2.method8587();
						if (local159 == 32767) {
							local159 = Static456.aClass6_Sub40_Sub2_2.method8587();
							local153 = Static456.aClass6_Sub40_Sub2_2.method8587();
							local151 = Static456.aClass6_Sub40_Sub2_2.method8587();
							local155 = Static456.aClass6_Sub40_Sub2_2.method8587();
						} else if (local159 == 32766) {
							local159 = -1;
						} else {
							local153 = Static456.aClass6_Sub40_Sub2_2.method8587();
						}
						local199 = Static456.aClass6_Sub40_Sub2_2.method8587();
						local203 = Static456.aClass6_Sub40_Sub2_2.method8560();
						local21.method4909(local153, local155, local151, local203, local159, local199, Static113.anInt2243);
					}
				}
			}
			if ((local25 & 0x80) != 0) {
				@Pc(224) int[] local224 = new int[4];
				for (local147 = 0; local147 < 4; local147++) {
					local224[local147] = Static456.aClass6_Sub40_Sub2_2.method8614();
					if (local224[local147] == 65535) {
						local224[local147] = -1;
					}
				}
				local159 = Static456.aClass6_Sub40_Sub2_2.method8560();
				Static268.method4784(local21, local224, local159);
			}
			@Pc(274) int[] local274;
			@Pc(277) int[] local277;
			if ((local25 & 0x4000) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local274 = new int[local81];
				local277 = new int[local81];
				@Pc(280) int[] local280 = new int[local81];
				for (local153 = 0; local153 < local81; local153++) {
					local155 = Static456.aClass6_Sub40_Sub2_2.method8585();
					if (local155 == 65535) {
						local155 = -1;
					}
					local274[local153] = local155;
					local277[local153] = Static456.aClass6_Sub40_Sub2_2.method8604();
					local280[local153] = Static456.aClass6_Sub40_Sub2_2.method8614();
				}
				Static417.method6554(local277, local274, local280, local21);
			}
			if ((local25 & 0x20) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8614();
				if (local81 == 65535) {
					local81 = -1;
				}
				local147 = Static456.aClass6_Sub40_Sub2_2.method8581();
				local159 = Static456.aClass6_Sub40_Sub2_2.method8576();
				local151 = local159 & 0x7;
				local153 = local159 >> 3 & 0xF;
				if (local153 == 15) {
					local153 = -1;
				}
				local21.method4918(false, local151, local81, local147, local153);
			}
			if ((local25 & 0x2000) != 0) {
				local21.aByte64 = Static456.aClass6_Sub40_Sub2_2.method8583();
				local21.aByte65 = Static456.aClass6_Sub40_Sub2_2.method8590();
				local21.aByte66 = Static456.aClass6_Sub40_Sub2_2.method8602();
				local21.aByte67 = (byte) Static456.aClass6_Sub40_Sub2_2.method8560();
				local21.anInt5536 = Static113.anInt2243 + Static456.aClass6_Sub40_Sub2_2.method8585();
				local21.anInt5528 = Static113.anInt2243 + Static456.aClass6_Sub40_Sub2_2.method8585();
			}
			@Pc(461) int[] local461;
			@Pc(514) short[] local514;
			@Pc(487) short[] local487;
			@Pc(555) long local555;
			if ((local25 & 0x200) != 0) {
				local81 = local21.aClass247_1.anIntArray466.length;
				local147 = 0;
				if (local21.aClass247_1.aShortArray94 != null) {
					local147 = local21.aClass247_1.aShortArray94.length;
				}
				local159 = 0;
				if (local21.aClass247_1.aShortArray96 != null) {
					local159 = local21.aClass247_1.aShortArray96.length;
				}
				local151 = Static456.aClass6_Sub40_Sub2_2.method8560();
				if ((local151 & 0x1) == 1) {
					local21.aClass30_1 = null;
				} else {
					local461 = null;
					if ((local151 & 0x2) == 2) {
						local461 = new int[local81];
						for (local155 = 0; local155 < local81; local155++) {
							local461[local155] = Static456.aClass6_Sub40_Sub2_2.method8614();
						}
					}
					local487 = null;
					if ((local151 & 0x4) == 4) {
						local487 = new short[local147];
						for (local199 = 0; local199 < local147; local199++) {
							local487[local199] = (short) Static456.aClass6_Sub40_Sub2_2.method8585();
						}
					}
					local514 = null;
					if ((local151 & 0x8) == 8) {
						local514 = new short[local159];
						for (local203 = 0; local203 < local159; local203++) {
							local514[local203] = (short) Static456.aClass6_Sub40_Sub2_2.method8614();
						}
					}
					local555 = (long) local21.anInt5590++ << 32 | (long) local13;
					local21.aClass30_1 = new Class30(local555, local461, local487, local514);
				}
			}
			if ((local25 & 0x40000) != 0) {
				local21.aString62 = Static456.aClass6_Sub40_Sub2_2.method8611();
				if ("".equals(local21.aString62) || local21.aString62.equals(local21.aClass247_1.aString89)) {
					local21.aString62 = local21.aClass247_1.aString89;
				}
			}
			if ((local25 & 0x1000) != 0) {
				local21.anInt5548 = Static456.aClass6_Sub40_Sub2_2.method8570();
				local21.anInt5563 = Static456.aClass6_Sub40_Sub2_2.method8602();
				local21.anInt5542 = Static456.aClass6_Sub40_Sub2_2.method8602();
				local21.anInt5490 = Static456.aClass6_Sub40_Sub2_2.method8570();
				local21.anInt5512 = Static456.aClass6_Sub40_Sub2_2.method8614() + Static113.anInt2243;
				local21.anInt5553 = Static456.aClass6_Sub40_Sub2_2.method8571() + Static113.anInt2243;
				local21.anInt5525 = Static456.aClass6_Sub40_Sub2_2.method8576();
				local21.anInt5490 += local21.anIntArray336[0];
				local21.anInt5574 = 1;
				local21.anInt5576 = 0;
				local21.anInt5563 += local21.anIntArray336[0];
				local21.anInt5542 += local21.anIntArray335[0];
				local21.anInt5548 += local21.anIntArray335[0];
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt5572 = Static456.aClass6_Sub40_Sub2_2.method8585();
				if (local21.anInt5572 == 65535) {
					local21.anInt5572 = -1;
				}
			}
			if ((local25 & 0x8) != 0) {
				local21.aString61 = Static456.aClass6_Sub40_Sub2_2.method8611();
				local21.anInt5552 = 100;
			}
			if ((local25 & 0x800) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8585();
				if (local81 == 65535) {
					local81 = -1;
				}
				local147 = Static456.aClass6_Sub40_Sub2_2.method8579();
				local159 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local151 = local159 & 0x7;
				local153 = local159 >> 3 & 0xF;
				if (local153 == 15) {
					local153 = -1;
				}
				local21.method4918(true, local151, local81, local147, local153);
			}
			if ((local25 & 0x2) != 0) {
				if (local21.aClass247_1.method6611()) {
					Static648.method9036(local21);
				}
				local21.method4928(Static563.aClass346_2.method8199(Static456.aClass6_Sub40_Sub2_2.method8614()));
				local21.method4908(local21.aClass247_1.anInt7681);
				local21.anInt5544 = local21.aClass247_1.anInt7691 << 3;
				if (local21.aClass247_1.method6611()) {
					Static474.method7154((Class20_Sub2_Sub2_Sub1_Sub1) null, local21.anIntArray335[0], local21.anIntArray336[0], 0, local21, local21.aByte131, (Class312) null);
				}
			}
			if ((local25 & 0x20000) != 0) {
				local81 = local21.aClass247_1.anIntArray468.length;
				local147 = 0;
				if (local21.aClass247_1.aShortArray94 != null) {
					local147 = local21.aClass247_1.aShortArray94.length;
				}
				if (local21.aClass247_1.aShortArray96 != null) {
					local147 = local21.aClass247_1.aShortArray96.length;
				}
				local151 = Static456.aClass6_Sub40_Sub2_2.method8573();
				if ((local151 & 0x1) != 1) {
					local461 = null;
					if ((local151 & 0x2) == 2) {
						local461 = new int[local81];
						for (local155 = 0; local155 < local81; local155++) {
							local461[local155] = Static456.aClass6_Sub40_Sub2_2.method8585();
						}
					}
					local487 = null;
					if ((local151 & 0x4) == 4) {
						local487 = new short[local147];
						for (local199 = 0; local199 < local147; local199++) {
							local487[local199] = (short) Static456.aClass6_Sub40_Sub2_2.method8585();
						}
					}
					local514 = null;
					if ((local151 & 0x8) == 8) {
						local514 = new short[0];
						for (local203 = 0; local203 < 0; local203++) {
							local514[local203] = (short) Static456.aClass6_Sub40_Sub2_2.method8552();
						}
					}
					local555 = (long) local21.anInt5594++ << 32 | (long) local13;
					new Class30(local555, local461, local487, local514);
				}
			}
			if ((local25 & 0x100) != 0) {
				local81 = Static456.aClass6_Sub40_Sub2_2.method8560();
				local274 = new int[local81];
				local277 = new int[local81];
				for (local151 = 0; local151 < local81; local151++) {
					local153 = Static456.aClass6_Sub40_Sub2_2.method8614();
					if ((local153 & 0xC000) == 49152) {
						local155 = Static456.aClass6_Sub40_Sub2_2.method8552();
						local274[local151] = local153 << 16 | local155;
					} else {
						local274[local151] = local153;
					}
					local277[local151] = Static456.aClass6_Sub40_Sub2_2.method8571();
				}
				local21.method4907(local274, local277);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIIZILclient!vd;)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) Class353 arg2) {
		Static602.anInt10026 = 1;
		Static95.aBoolean128 = false;
		Static592.anInt9875 = arg0;
		Static498.aClass6_Sub3_Sub4_3 = null;
		Static142.anInt2680 = arg1;
		Static182.anInt3750 = 0;
		Static112.anInt2206 = 2;
		Static479.aClass353_88 = arg2;
	}
}
