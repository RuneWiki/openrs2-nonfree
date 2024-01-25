import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
	public static int anInt10026 = 0;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!rv;B)V")
	public static void method8343(@OriginalArg(0) Class5_Sub15 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static405.aClass85_3 != null) {
			@Pc(18) int local18;
			try {
				Static405.aClass85_3.method1847(0L);
				Static405.aClass85_3.method1846(local6);
				for (local18 = 0; local18 < 24 && local6[local18] == 0; local18++) {
				}
				if (local18 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(38) Exception local38) {
				for (local18 = 0; local18 < 24; local18++) {
					local6[local18] = -1;
				}
			}
		}
		arg0.method3685(local6, 24, 0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILclient!ada;)I")
	public static int method8344(@OriginalArg(1) Class6 arg0) {
		if (arg0 == Static371.aClass6_2) {
			return 7681;
		} else if (arg0 == Static600.aClass6_4) {
			return 8448;
		} else if (arg0 == Static460.aClass6_3) {
			return 34165;
		} else if (Static346.aClass6_1 == arg0) {
			return 260;
		} else if (arg0 == Static646.aClass6_5) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILclient!wq;ILclient!aa;IJI)V")
	public static void method8346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class394 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if ((long) local11 > arg6) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg2.anInt10536 / 2, arg2.anInt10532 / 2);
		if (local31 * local31 >= local11) {
			Static28.method380(arg4, arg5, arg3, Static558.aClass59Array16[arg1], arg0, arg7, arg2);
			return;
		}
		local31 -= 10;
		@Pc(57) int local57;
		if (Static133.anInt2254 == 4) {
			local57 = (int) Static495.aFloat161 & 0x3FFF;
		} else {
			local57 = (int) Static495.aFloat161 + Static538.anInt8846 & 0x3FFF;
		}
		@Pc(69) int local69 = Class242.anIntArray384[local57];
		@Pc(73) int local73 = Class242.anIntArray383[local57];
		if (Static133.anInt2254 != 4) {
			local73 = local73 * 256 / (Static342.anInt6178 + 256);
			local69 = local69 * 256 / (Static342.anInt6178 + 256);
		}
		@Pc(104) int local104 = arg5 * local69 + local73 * arg0 >> 14;
		@Pc(115) int local115 = local73 * arg5 - arg0 * local69 >> 14;
		@Pc(121) double local121 = Math.atan2((double) local104, (double) local115);
		@Pc(128) int local128 = (int) (Math.sin(local121) * (double) local31);
		@Pc(135) int local135 = (int) ((double) local31 * Math.cos(local121));
		Static24.aClass59Array1[arg1].method8071((float) arg7 + (float) arg2.anInt10536 / 2.0F + (float) local128, (float) -local135 + (float) arg2.anInt10532 / 2.0F + (float) arg3, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "([BBIILjava/lang/String;I)I")
	public static int method8347(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) int local8 = arg2;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(17) char local17 = arg3.charAt(local10);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg0[local10 + arg1] = (byte) local17;
			} else if (local17 == '€') {
				arg0[local10 + arg1] = -128;
			} else if (local17 == '‚') {
				arg0[local10 + arg1] = -126;
			} else if (local17 == 'ƒ') {
				arg0[local10 + arg1] = -125;
			} else if (local17 == '„') {
				arg0[local10 + arg1] = -124;
			} else if (local17 == '…') {
				arg0[arg1 + local10] = -123;
			} else if (local17 == '†') {
				arg0[arg1 + local10] = -122;
			} else if (local17 == '‡') {
				arg0[arg1 + local10] = -121;
			} else if (local17 == 'ˆ') {
				arg0[local10 + arg1] = -120;
			} else if (local17 == '‰') {
				arg0[arg1 + local10] = -119;
			} else if (local17 == 'Š') {
				arg0[arg1 + local10] = -118;
			} else if (local17 == '‹') {
				arg0[arg1 + local10] = -117;
			} else if (local17 == 'Œ') {
				arg0[arg1 + local10] = -116;
			} else if (local17 == 'Ž') {
				arg0[arg1 + local10] = -114;
			} else if (local17 == '‘') {
				arg0[arg1 + local10] = -111;
			} else if (local17 == '’') {
				arg0[arg1 + local10] = -110;
			} else if (local17 == '“') {
				arg0[local10 + arg1] = -109;
			} else if (local17 == '”') {
				arg0[local10 + arg1] = -108;
			} else if (local17 == '•') {
				arg0[local10 + arg1] = -107;
			} else if (local17 == '–') {
				arg0[local10 + arg1] = -106;
			} else if (local17 == '—') {
				arg0[local10 + arg1] = -105;
			} else if (local17 == '˜') {
				arg0[local10 + arg1] = -104;
			} else if (local17 == '™') {
				arg0[arg1 + local10] = -103;
			} else if (local17 == 'š') {
				arg0[local10 + arg1] = -102;
			} else if (local17 == '›') {
				arg0[arg1 + local10] = -101;
			} else if (local17 == 'œ') {
				arg0[arg1 + local10] = -100;
			} else if (local17 == 'ž') {
				arg0[local10 + arg1] = -98;
			} else if (local17 == 'Ÿ') {
				arg0[local10 + arg1] = -97;
			} else {
				arg0[arg1 + local10] = 63;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[ILclient!kia;[I[I)V")
	public static void method8348(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class41_Sub1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(16) int local16 = 0; local16 < arg3.length; local16++) {
			@Pc(21) int local21 = arg3[local16];
			@Pc(25) int local25 = arg2[local16];
			@Pc(29) int local29 = arg0[local16];
			@Pc(31) int local31 = 0;
			while (local25 != 0 && local31 < arg1.aClass127Array3.length) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg1.aClass127Array3[local31] = null;
					} else {
						@Pc(45) Class65 local45 = Static459.aClass128_2.method2686(local21);
						@Pc(48) int local48 = local45.anInt1425;
						@Pc(53) Class127 local53 = arg1.aClass127Array3[local31];
						if (local53 != null) {
							if (local53.anInt2995 == local21) {
								if (local48 == 0) {
									local53 = arg1.aClass127Array3[local31] = null;
								} else if (local48 == 1) {
									local53.anInt2994 = 1;
									local53.anInt2990 = 0;
									local53.anInt2992 = local29;
									local53.anInt2993 = 0;
									local53.anInt2991 = 0;
									if (!arg1.aBoolean692) {
										Static119.method1899(0, arg1, local45);
									}
								} else if (local48 == 2) {
									local53.anInt2990 = 0;
								}
							} else if (local45.anInt1419 >= Static459.aClass128_2.method2686(local53.anInt2995).anInt1419) {
								local53 = arg1.aClass127Array3[local31] = null;
							}
						}
						if (local53 == null) {
							local53 = arg1.aClass127Array3[local31] = new Class127();
							local53.anInt2991 = 0;
							local53.anInt2995 = local21;
							local53.anInt2992 = local29;
							local53.anInt2990 = 0;
							local53.anInt2993 = 0;
							local53.anInt2994 = 1;
							if (!arg1.aBoolean692) {
								Static119.method1899(0, arg1, local45);
							}
						}
					}
				}
				local31++;
				local25 >>>= 0x1;
			}
		}
	}
}
