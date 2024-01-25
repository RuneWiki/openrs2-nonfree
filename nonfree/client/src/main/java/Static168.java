import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Lclient!so;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Loading - please wait.";

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!fb;I)Lclient!wf;")
	public static Class35_Sub4 method2716(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class35_Sub4(arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3659(), arg0.method3659(), arg0.method3643());
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
	public static void method2717() {
		Static161.anInt3147 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static243.anInt4826; local3++) {
			@Pc(8) Class158 local8 = Static32.aClass158Array1[local3];
			@Pc(12) int local12;
			if (Static97.anIntArray119 != null) {
				for (local12 = 0; local12 < Static97.anIntArray119.length; local12++) {
					if (Static97.anIntArray119[local12] != -1000000 && (local8.anInt4729 <= Static97.anIntArray119[local12] || local8.anInt4731 <= Static97.anIntArray119[local12]) && (local8.anInt4730 <= Static154.anIntArray530[local12] || local8.anInt4748 <= Static154.anIntArray530[local12]) && (local8.anInt4730 >= Static84.anIntArray100[local12] || local8.anInt4748 >= Static84.anIntArray100[local12]) && (local8.anInt4741 <= Static176.anIntArray481[local12] || local8.anInt4738 <= Static176.anIntArray481[local12]) && (local8.anInt4741 >= Static1.anIntArray1[local12] || local8.anInt4738 >= Static1.anIntArray1[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt4733 == 1) {
				local12 = local8.anInt4740 + Static14.anInt494 - Static74.anInt1441;
				if (local12 >= 0 && local12 <= Static14.anInt494 + Static14.anInt494) {
					local110 = local8.anInt4745 + Static14.anInt494 - Static89.anInt6705;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4728 + Static14.anInt494 - Static89.anInt6705;
					if (local121 > Static14.anInt494 + Static14.anInt494) {
						local121 = Static14.anInt494 + Static14.anInt494;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static192.aBooleanArrayArray9[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static55.anInt5576 - local8.anInt4730;
						if (local153 > 32) {
							local8.anInt4746 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4746 = 2;
							local153 = -local153;
						}
						local8.anInt4743 = (local8.anInt4741 - Static300.anInt5966 << 8) / local153;
						local8.anInt4749 = (local8.anInt4738 - Static300.anInt5966 << 8) / local153;
						local8.anInt4742 = (local8.anInt4729 - Static221.anInt4559 << 8) / local153;
						local8.anInt4744 = (local8.anInt4731 - Static221.anInt4559 << 8) / local153;
						Static188.aClass158Array2[Static161.anInt3147++] = local8;
					}
				}
			} else if (local8.anInt4733 == 2) {
				local12 = local8.anInt4745 + Static14.anInt494 - Static89.anInt6705;
				if (local12 >= 0 && local12 <= Static14.anInt494 + Static14.anInt494) {
					local110 = local8.anInt4740 + Static14.anInt494 - Static74.anInt1441;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4726 + Static14.anInt494 - Static74.anInt1441;
					if (local121 > Static14.anInt494 + Static14.anInt494) {
						local121 = Static14.anInt494 + Static14.anInt494;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static192.aBooleanArrayArray9[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static300.anInt5966 - local8.anInt4741;
						if (local153 > 32) {
							local8.anInt4746 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt4746 = 4;
							local153 = -local153;
						}
						local8.anInt4727 = (local8.anInt4730 - Static55.anInt5576 << 8) / local153;
						local8.anInt4750 = (local8.anInt4748 - Static55.anInt5576 << 8) / local153;
						local8.anInt4742 = (local8.anInt4729 - Static221.anInt4559 << 8) / local153;
						local8.anInt4744 = (local8.anInt4731 - Static221.anInt4559 << 8) / local153;
						Static188.aClass158Array2[Static161.anInt3147++] = local8;
					}
				}
			} else if (local8.anInt4733 == 4) {
				local12 = local8.anInt4729 - Static221.anInt4559;
				if (local12 > 128) {
					local110 = local8.anInt4745 + Static14.anInt494 - Static89.anInt6705;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt4728 + Static14.anInt494 - Static89.anInt6705;
					if (local121 > Static14.anInt494 + Static14.anInt494) {
						local121 = Static14.anInt494 + Static14.anInt494;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt4740 + Static14.anInt494 - Static74.anInt1441;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt4726 + Static14.anInt494 - Static74.anInt1441;
						if (local153 > Static14.anInt494 + Static14.anInt494) {
							local153 = Static14.anInt494 + Static14.anInt494;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static192.aBooleanArrayArray9[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt4746 = 5;
							local8.anInt4727 = (local8.anInt4730 - Static55.anInt5576 << 8) / local12;
							local8.anInt4750 = (local8.anInt4748 - Static55.anInt5576 << 8) / local12;
							local8.anInt4743 = (local8.anInt4741 - Static300.anInt5966 << 8) / local12;
							local8.anInt4749 = (local8.anInt4738 - Static300.anInt5966 << 8) / local12;
							Static188.aClass158Array2[Static161.anInt3147++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[I[ILclient!qc;[I)V")
	public static void method2719(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class5_Sub4_Sub4_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg0[local7];
			@Pc(21) int local21 = arg1[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg2.aClass46Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass46Array3[local23] = null;
					} else {
						@Pc(47) Class131 local47 = Static343.method5604(local13);
						@Pc(50) int local50 = local47.anInt3986;
						@Pc(55) Class46 local55 = arg2.aClass46Array3[local23];
						if (local55 != null) {
							if (local55.anInt1286 == local13) {
								if (local50 == 0) {
									local55 = arg2.aClass46Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt1289 = 0;
									local55.anInt1287 = 1;
									local55.anInt1291 = local21;
									local55.anInt1285 = 0;
									local55.anInt1290 = 0;
									Static161.method2570(0, false, arg2.anInt5905, local47, arg2.anInt5901);
								} else if (local50 == 2) {
									local55.anInt1289 = 0;
								}
							} else if (local47.anInt3993 >= Static343.method5604(local55.anInt1286).anInt3993) {
								local55 = arg2.aClass46Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg2.aClass46Array3[local23] = new Class46();
							local55.anInt1289 = 0;
							local55.anInt1286 = local13;
							local55.anInt1287 = 1;
							local55.anInt1285 = 0;
							local55.anInt1290 = 0;
							local55.anInt1291 = local21;
							Static161.method2570(0, false, arg2.anInt5905, local47, arg2.anInt5901);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method2720(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(29) byte[] local29 = new byte[local8];
		for (@Pc(31) int local31 = 0; local31 < local8; local31++) {
			@Pc(37) char local37 = arg0.charAt(local31);
			if (local37 > '\u0000' && local37 < '\u0080' || !(local37 < ' ' || local37 > 'ÿ')) {
				local29[local31] = (byte) local37;
			} else if (local37 == '€') {
				local29[local31] = -128;
			} else if (local37 == '‚') {
				local29[local31] = -126;
			} else if (local37 == 'ƒ') {
				local29[local31] = -125;
			} else if (local37 == '„') {
				local29[local31] = -124;
			} else if (local37 == '…') {
				local29[local31] = -123;
			} else if (local37 == '†') {
				local29[local31] = -122;
			} else if (local37 == '‡') {
				local29[local31] = -121;
			} else if (local37 == 'ˆ') {
				local29[local31] = -120;
			} else if (local37 == '‰') {
				local29[local31] = -119;
			} else if (local37 == 'Š') {
				local29[local31] = -118;
			} else if (local37 == '‹') {
				local29[local31] = -117;
			} else if (local37 == 'Œ') {
				local29[local31] = -116;
			} else if (local37 == 'Ž') {
				local29[local31] = -114;
			} else if (local37 == '‘') {
				local29[local31] = -111;
			} else if (local37 == '’') {
				local29[local31] = -110;
			} else if (local37 == '“') {
				local29[local31] = -109;
			} else if (local37 == '”') {
				local29[local31] = -108;
			} else if (local37 == '•') {
				local29[local31] = -107;
			} else if (local37 == '–') {
				local29[local31] = -106;
			} else if (local37 == '—') {
				local29[local31] = -105;
			} else if (local37 == '˜') {
				local29[local31] = -104;
			} else if (local37 == '™') {
				local29[local31] = -103;
			} else if (local37 == 'š') {
				local29[local31] = -102;
			} else if (local37 == '›') {
				local29[local31] = -101;
			} else if (local37 == 'œ') {
				local29[local31] = -100;
			} else if (local37 == 'ž') {
				local29[local31] = -98;
			} else if (local37 == 'Ÿ') {
				local29[local31] = -97;
			} else {
				local29[local31] = 63;
			}
		}
		return local29;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[ZIILclient!tj;[[B[[BLclient!pc;IIILclient!a;I[[B)V")
	public static void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class122 arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) Class155 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class1 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(52) int local52;
		if (arg10 != null && arg7 != null || arg7 != null && arg3 == 12 || arg10 != null && arg3 == 0) {
			@Pc(36) boolean[] local36 = arg10 != null && arg10.aBoolean3 ? Static241.aBooleanArrayArray12[arg3] : Static189.aBooleanArrayArray8[arg3];
			@Pc(60) Class1 local60;
			@Pc(77) byte local77;
			@Pc(93) int local93;
			@Pc(98) int local98;
			if (arg2 > 0) {
				if (arg8 > 0) {
					local52 = arg12[arg8 - 1][arg2 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static216.method3748(local52 - 1);
						if (local60.anInt11 != -1 && local60.aBoolean3) {
							local77 = arg5[arg8 - 1][arg2 - 1];
							local93 = arg6[arg8 - 1][arg2 - 1] * 2 + 4 & 0x7;
							local98 = Static267.method4546(local60, arg4);
							if (Static260.aBooleanArrayArray13[local77][local93]) {
								Static169.anIntArray240[0] = local60.anInt11;
								Static188.anIntArray304[0] = local98;
								Static114.anIntArray144[0] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
								Static331.anIntArray539[0] = local60.anInt3;
								Static118.anIntArray149[0] = local60.anInt5;
								Static69.anIntArray86[0] = 256;
							}
						}
					}
				}
				if (arg11 - 1 > arg8) {
					local52 = arg12[arg8 + 1][arg2 - 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static216.method3748(local52 - 1);
						if (local60.anInt11 != -1 && local60.aBoolean3) {
							local77 = arg5[arg8 + 1][arg2 - 1];
							local93 = arg6[arg8 + 1][arg2 - 1] * 2 + 6 & 0x7;
							local98 = Static267.method4546(local60, arg4);
							if (Static260.aBooleanArrayArray13[local77][local93]) {
								Static169.anIntArray240[2] = local60.anInt11;
								Static188.anIntArray304[2] = local98;
								Static114.anIntArray144[2] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
								Static331.anIntArray539[2] = local60.anInt3;
								Static118.anIntArray149[2] = local60.anInt5;
								Static69.anIntArray86[2] = 512;
							}
						}
					}
				}
			}
			if (arg0 - 1 > arg2) {
				if (arg8 > 0) {
					local52 = arg12[arg8 - 1][arg2 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static216.method3748(local52 - 1);
						if (local60.anInt11 != -1 && local60.aBoolean3) {
							local77 = arg5[arg8 - 1][arg2 + 1];
							local93 = arg6[arg8 - 1][arg2 + 1] * 2 + 2 & 0x7;
							local98 = Static267.method4546(local60, arg4);
							if (Static260.aBooleanArrayArray13[local77][local93]) {
								Static169.anIntArray240[6] = local60.anInt11;
								Static188.anIntArray304[6] = local98;
								Static114.anIntArray144[6] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
								Static331.anIntArray539[6] = local60.anInt3;
								Static118.anIntArray149[6] = local60.anInt5;
								Static69.anIntArray86[6] = 64;
							}
						}
					}
				}
				if (arg8 < arg11 - 1) {
					local52 = arg12[arg8 + 1][arg2 + 1] & 0xFF;
					if (local52 > 0) {
						local60 = Static216.method3748(local52 - 1);
						if (local60.anInt11 != -1 && local60.aBoolean3) {
							local77 = arg5[arg8 + 1][arg2 + 1];
							local93 = arg6[arg8 + 1][arg2 + 1] * 2 & 0x7;
							local98 = Static267.method4546(local60, arg4);
							if (Static260.aBooleanArrayArray13[local77][local93]) {
								Static169.anIntArray240[4] = local60.anInt11;
								Static188.anIntArray304[4] = local98;
								Static114.anIntArray144[4] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
								Static331.anIntArray539[4] = local60.anInt3;
								Static118.anIntArray149[4] = local60.anInt5;
								Static69.anIntArray86[4] = 128;
							}
						}
					}
				}
			}
			@Pc(514) int local514;
			@Pc(519) int local519;
			@Pc(521) int local521;
			@Pc(503) byte local503;
			if (arg2 > 0) {
				local52 = arg12[arg8][arg2 - 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static216.method3748(local52 - 1);
					if (local60.anInt11 != -1) {
						local77 = arg5[arg8][arg2 - 1];
						local503 = arg6[arg8][arg2 - 1];
						if (local60.aBoolean3) {
							local98 = 2;
							local514 = local503 * 2 + 4;
							local519 = Static267.method4546(local60, arg4);
							for (local521 = 0; local521 < 3; local521++) {
								local98 &= 0x7;
								local514 &= 0x7;
								if (Static260.aBooleanArrayArray13[local77][local514] && Static118.anIntArray149[local98] <= local60.anInt5) {
									Static169.anIntArray240[local98] = local60.anInt11;
									Static188.anIntArray304[local98] = local519;
									Static114.anIntArray144[local98] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
									Static331.anIntArray539[local98] = local60.anInt3;
									if (local60.anInt5 == Static118.anIntArray149[local98]) {
										Static69.anIntArray86[local98] |= 0x20;
									} else {
										Static69.anIntArray86[local98] = 32;
									}
									Static118.anIntArray149[local98] = local60.anInt5;
								}
								local514++;
								local98--;
							}
							if (!local36[arg9 & 0x3]) {
								arg1[0] = Static241.aBooleanArrayArray12[local77][local503 + 2 & 0x3];
							}
						} else if (!local36[arg9 & 0x3]) {
							arg1[0] = Static189.aBooleanArrayArray8[local77][local503 + 2 & 0x3];
						}
					}
				}
			}
			if (arg2 < arg0 - 1) {
				local52 = arg12[arg8][arg2 + 1] & 0xFF;
				if (local52 > 0) {
					local60 = Static216.method3748(local52 - 1);
					if (local60.anInt11 != -1) {
						local77 = arg5[arg8][arg2 + 1];
						local503 = arg6[arg8][arg2 + 1];
						if (local60.aBoolean3) {
							local98 = 4;
							local514 = local503 * 2 + 2;
							local519 = Static267.method4546(local60, arg4);
							for (local521 = 0; local521 < 3; local521++) {
								local514 &= 0x7;
								local98 &= 0x7;
								if (Static260.aBooleanArrayArray13[local77][local514] && Static118.anIntArray149[local98] <= local60.anInt5) {
									Static169.anIntArray240[local98] = local60.anInt11;
									Static188.anIntArray304[local98] = local519;
									Static114.anIntArray144[local98] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
									Static331.anIntArray539[local98] = local60.anInt3;
									if (Static118.anIntArray149[local98] == local60.anInt5) {
										Static69.anIntArray86[local98] |= 0x10;
									} else {
										Static69.anIntArray86[local98] = 16;
									}
									Static118.anIntArray149[local98] = local60.anInt5;
								}
								local98++;
								local514--;
							}
							if (!local36[arg9 + 2 & 0x3]) {
								arg1[2] = Static241.aBooleanArrayArray12[local77][local503 & 0x3];
							}
						} else if (!local36[arg9 + 2 & 0x3]) {
							arg1[2] = Static189.aBooleanArrayArray8[local77][local503 & 0x3];
						}
					}
				}
			}
			if (arg8 > 0) {
				local52 = arg12[arg8 - 1][arg2] & 0xFF;
				if (local52 > 0) {
					local60 = Static216.method3748(local52 - 1);
					if (local60.anInt11 != -1) {
						local77 = arg5[arg8 - 1][arg2];
						local503 = arg6[arg8 - 1][arg2];
						if (local60.aBoolean3) {
							local98 = 6;
							local514 = local503 * 2 + 4;
							local519 = Static267.method4546(local60, arg4);
							for (local521 = 0; local521 < 3; local521++) {
								local98 &= 0x7;
								local514 &= 0x7;
								if (Static260.aBooleanArrayArray13[local77][local514] && Static118.anIntArray149[local98] <= local60.anInt5) {
									Static169.anIntArray240[local98] = local60.anInt11;
									Static188.anIntArray304[local98] = local519;
									Static114.anIntArray144[local98] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
									Static331.anIntArray539[local98] = local60.anInt3;
									if (Static118.anIntArray149[local98] == local60.anInt5) {
										Static69.anIntArray86[local98] |= 0x8;
									} else {
										Static69.anIntArray86[local98] = 8;
									}
									Static118.anIntArray149[local98] = local60.anInt5;
								}
								local514--;
								local98++;
							}
							if (!local36[arg9 + 3 & 0x3]) {
								arg1[3] = Static241.aBooleanArrayArray12[local77][local503 + 1 & 0x3];
							}
						} else if (!local36[arg9 + 3 & 0x3]) {
							arg1[3] = Static189.aBooleanArrayArray8[local77][local503 + 1 & 0x3];
						}
					}
				}
			}
			if (arg8 < arg11 - 1) {
				local52 = arg12[arg8 + 1][arg2] & 0xFF;
				if (local52 > 0) {
					local60 = Static216.method3748(local52 - 1);
					if (local60.anInt11 != -1) {
						local77 = arg5[arg8 + 1][arg2];
						local503 = arg6[arg8 + 1][arg2];
						if (local60.aBoolean3) {
							local98 = 4;
							local514 = local503 * 2 + 6;
							local519 = Static267.method4546(local60, arg4);
							for (local521 = 0; local521 < 3; local521++) {
								local98 &= 0x7;
								local514 &= 0x7;
								if (Static260.aBooleanArrayArray13[local77][local514] && Static118.anIntArray149[local98] <= local60.anInt5) {
									Static169.anIntArray240[local98] = local60.anInt11;
									Static188.anIntArray304[local98] = local519;
									Static114.anIntArray144[local98] = arg4.method4747() ? local60.anInt15 : local60.anInt13;
									Static331.anIntArray539[local98] = local60.anInt3;
									if (Static118.anIntArray149[local98] == local60.anInt5) {
										Static69.anIntArray86[local98] |= 0x4;
									} else {
										Static69.anIntArray86[local98] = 4;
									}
									Static118.anIntArray149[local98] = local60.anInt5;
								}
								local98--;
								local514++;
							}
							if (!local36[arg9 + 1 & 0x3]) {
								arg1[1] = Static241.aBooleanArrayArray12[local77][local503 + 3 & 0x3];
							}
						} else if (!local36[arg9 + 1 & 0x3]) {
							arg1[1] = Static189.aBooleanArrayArray8[local77][local503 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg10 == null) {
			return;
		}
		@Pc(1235) int local1235 = Static267.method4546(arg10, arg4);
		if (!arg10.aBoolean3) {
			return;
		}
		for (local52 = 0; local52 < 8; local52++) {
			@Pc(1251) int local1251 = local52 - arg9 * 2 & 0x7;
			if (Static260.aBooleanArrayArray13[arg3][local52] && arg10.anInt5 >= Static118.anIntArray149[local1251]) {
				Static169.anIntArray240[local1251] = arg10.anInt11;
				Static188.anIntArray304[local1251] = local1235;
				Static114.anIntArray144[local1251] = arg4.method4747() ? arg10.anInt15 : arg10.anInt13;
				Static331.anIntArray539[local1251] = arg10.anInt3;
				if (arg10.anInt5 == Static118.anIntArray149[local1251]) {
					Static69.anIntArray86[local1251] |= 0x2;
				} else {
					Static69.anIntArray86[local1251] = 2;
				}
				Static118.anIntArray149[local1251] = arg10.anInt5;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
	public static void method2722() {
		Static296.aClass198_54.method5230();
	}
}
