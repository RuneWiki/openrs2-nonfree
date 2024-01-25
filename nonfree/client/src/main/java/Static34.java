import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "Lclient!aa;")
	public static Class2 aClass2_6;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "Lclient!qj;")
	public static Class165 aClass165_13;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
	public static volatile int anInt831 = -1;

	@OriginalMember(owner = "client!bs", name = "U", descriptor = "[I")
	public static final int[] anIntArray102 = new int[1000];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!aj;IIILclient!to;[[B[[BLclient!aa;IIII[[B[Z)V")
	public static void method901(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class199 arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) Class2 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(50) int local50;
		if (arg3 != null && arg0 != null || arg0 != null && arg2 == 12 || arg3 != null && arg2 == 0) {
			@Pc(31) boolean[] local31 = arg3 != null && arg3.aBoolean513 ? Static251.aBooleanArrayArray24[arg2] : Static262.aBooleanArrayArray20[arg2];
			@Pc(58) Class199 local58;
			@Pc(76) byte local76;
			@Pc(92) int local92;
			@Pc(97) int local97;
			if (arg1 > 0) {
				if (arg9 > 0) {
					local50 = arg11[arg9 - 1][arg1 - 1] & 0xFF;
					if (local50 > 0) {
						local58 = Static340.method3663(local50 - 1);
						if (local58.anInt5865 != -1 && local58.aBoolean513) {
							local76 = arg5[arg9 - 1][arg1 - 1];
							local92 = arg4[arg9 - 1][arg1 - 1] * 2 + 4 & 0x7;
							local97 = Static219.method3992(arg6, local58);
							if (Static100.aBooleanArrayArray11[local76][local92]) {
								Static269.anIntArray657[0] = local58.anInt5865;
								Static253.anIntArray631[0] = local97;
								Static299.anIntArray723[0] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
								Static312.anIntArray808[0] = local58.anInt5856;
								Static221.anIntArray557[0] = local58.anInt5862;
								Static251.anIntArray807[0] = 256;
							}
						}
					}
				}
				if (arg9 < arg7 - 1) {
					local50 = arg11[arg9 + 1][arg1 - 1] & 0xFF;
					if (local50 > 0) {
						local58 = Static340.method3663(local50 - 1);
						if (local58.anInt5865 != -1 && local58.aBoolean513) {
							local76 = arg5[arg9 + 1][arg1 - 1];
							local92 = arg4[arg9 + 1][arg1 - 1] * 2 + 6 & 0x7;
							local97 = Static219.method3992(arg6, local58);
							if (Static100.aBooleanArrayArray11[local76][local92]) {
								Static269.anIntArray657[2] = local58.anInt5865;
								Static253.anIntArray631[2] = local97;
								Static299.anIntArray723[2] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
								Static312.anIntArray808[2] = local58.anInt5856;
								Static221.anIntArray557[2] = local58.anInt5862;
								Static251.anIntArray807[2] = 512;
							}
						}
					}
				}
			}
			if (arg10 - 1 > arg1) {
				if (arg9 > 0) {
					local50 = arg11[arg9 - 1][arg1 + 1] & 0xFF;
					if (local50 > 0) {
						local58 = Static340.method3663(local50 - 1);
						if (local58.anInt5865 != -1 && local58.aBoolean513) {
							local76 = arg5[arg9 - 1][arg1 + 1];
							local92 = arg4[arg9 - 1][arg1 + 1] * 2 + 2 & 0x7;
							local97 = Static219.method3992(arg6, local58);
							if (Static100.aBooleanArrayArray11[local76][local92]) {
								Static269.anIntArray657[6] = local58.anInt5865;
								Static253.anIntArray631[6] = local97;
								Static299.anIntArray723[6] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
								Static312.anIntArray808[6] = local58.anInt5856;
								Static221.anIntArray557[6] = local58.anInt5862;
								Static251.anIntArray807[6] = 64;
							}
						}
					}
				}
				if (arg9 < arg7 - 1) {
					local50 = arg11[arg9 + 1][arg1 + 1] & 0xFF;
					if (local50 > 0) {
						local58 = Static340.method3663(local50 - 1);
						if (local58.anInt5865 != -1 && local58.aBoolean513) {
							local76 = arg5[arg9 + 1][arg1 + 1];
							local92 = arg4[arg9 + 1][arg1 + 1] * 2 & 0x7;
							local97 = Static219.method3992(arg6, local58);
							if (Static100.aBooleanArrayArray11[local76][local92]) {
								Static269.anIntArray657[4] = local58.anInt5865;
								Static253.anIntArray631[4] = local97;
								Static299.anIntArray723[4] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
								Static312.anIntArray808[4] = local58.anInt5856;
								Static221.anIntArray557[4] = local58.anInt5862;
								Static251.anIntArray807[4] = 128;
							}
						}
					}
				}
			}
			@Pc(539) int local539;
			@Pc(544) int local544;
			@Pc(546) int local546;
			@Pc(508) byte local508;
			if (arg1 > 0) {
				local50 = arg11[arg9][arg1 - 1] & 0xFF;
				if (local50 > 0) {
					local58 = Static340.method3663(local50 - 1);
					if (local58.anInt5865 != -1) {
						local76 = arg5[arg9][arg1 - 1];
						local508 = arg4[arg9][arg1 - 1];
						if (local58.aBoolean513) {
							local97 = 2;
							local539 = local508 * 2 + 4;
							local544 = Static219.method3992(arg6, local58);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local97 &= 0x7;
								if (Static100.aBooleanArrayArray11[local76][local539] && Static221.anIntArray557[local97] <= local58.anInt5862) {
									Static269.anIntArray657[local97] = local58.anInt5865;
									Static253.anIntArray631[local97] = local544;
									Static299.anIntArray723[local97] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
									Static312.anIntArray808[local97] = local58.anInt5856;
									if (Static221.anIntArray557[local97] == local58.anInt5862) {
										Static251.anIntArray807[local97] |= 0x20;
									} else {
										Static251.anIntArray807[local97] = 32;
									}
									Static221.anIntArray557[local97] = local58.anInt5862;
								}
								local539++;
								local97--;
							}
							if (!local31[--arg8 & 0x3]) {
								arg12[0] = Static251.aBooleanArrayArray24[local76][local508 + 2 & 0x3];
							}
						} else if (!local31[arg8 & 0x3]) {
							arg12[0] = Static262.aBooleanArrayArray20[local76][local508 + 2 & 0x3];
						}
					}
				}
			}
			if (arg1 < arg10 - 1) {
				local50 = arg11[arg9][arg1 + 1] & 0xFF;
				if (local50 > 0) {
					local58 = Static340.method3663(local50 - 1);
					if (local58.anInt5865 != -1) {
						local76 = arg5[arg9][arg1 + 1];
						local508 = arg4[arg9][arg1 + 1];
						if (local58.aBoolean513) {
							local97 = 4;
							local539 = local508 * 2 + 2;
							local544 = Static219.method3992(arg6, local58);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local97 &= 0x7;
								if (Static100.aBooleanArrayArray11[local76][local539] && Static221.anIntArray557[local97] <= local58.anInt5862) {
									Static269.anIntArray657[local97] = local58.anInt5865;
									Static253.anIntArray631[local97] = local544;
									Static299.anIntArray723[local97] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
									Static312.anIntArray808[local97] = local58.anInt5856;
									if (local58.anInt5862 == Static221.anIntArray557[local97]) {
										Static251.anIntArray807[local97] |= 0x10;
									} else {
										Static251.anIntArray807[local97] = 16;
									}
									Static221.anIntArray557[local97] = local58.anInt5862;
								}
								local97++;
								local539--;
							}
							if (!local31[arg8 + 2 & 0x3]) {
								arg12[2] = Static251.aBooleanArrayArray24[local76][local508 & 0x3];
							}
						} else if (!local31[arg8 + 2 & 0x3]) {
							arg12[2] = Static262.aBooleanArrayArray20[local76][local508 & 0x3];
						}
					}
				}
			}
			if (arg9 > 0) {
				local50 = arg11[arg9 - 1][arg1] & 0xFF;
				if (local50 > 0) {
					local58 = Static340.method3663(local50 - 1);
					if (local58.anInt5865 != -1) {
						local76 = arg5[arg9 - 1][arg1];
						local508 = arg4[arg9 - 1][arg1];
						if (local58.aBoolean513) {
							local97 = 6;
							local539 = local508 * 2 + 4;
							local544 = Static219.method3992(arg6, local58);
							for (local546 = 0; local546 < 3; local546++) {
								local539 &= 0x7;
								local97 &= 0x7;
								if (Static100.aBooleanArrayArray11[local76][local539] && local58.anInt5862 >= Static221.anIntArray557[local97]) {
									Static269.anIntArray657[local97] = local58.anInt5865;
									Static253.anIntArray631[local97] = local544;
									Static299.anIntArray723[local97] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
									Static312.anIntArray808[local97] = local58.anInt5856;
									if (Static221.anIntArray557[local97] == local58.anInt5862) {
										Static251.anIntArray807[local97] |= 0x8;
									} else {
										Static251.anIntArray807[local97] = 8;
									}
									Static221.anIntArray557[local97] = local58.anInt5862;
								}
								local539--;
								local97++;
							}
							if (!local31[arg8 + 3 & 0x3]) {
								arg12[3] = Static251.aBooleanArrayArray24[local76][local508 + 1 & 0x3];
							}
						} else if (!local31[arg8 + 3 & 0x3]) {
							arg12[3] = Static262.aBooleanArrayArray20[local76][local508 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 - 1 > arg9) {
				local50 = arg11[arg9 + 1][arg1] & 0xFF;
				if (local50 > 0) {
					local58 = Static340.method3663(local50 - 1);
					if (local58.anInt5865 != -1) {
						local76 = arg5[arg9 + 1][arg1];
						local508 = arg4[arg9 + 1][arg1];
						if (local58.aBoolean513) {
							local97 = 4;
							local539 = local508 * 2 + 6;
							local544 = Static219.method3992(arg6, local58);
							for (local546 = 0; local546 < 3; local546++) {
								local97 &= 0x7;
								local539 &= 0x7;
								if (Static100.aBooleanArrayArray11[local76][local539] && Static221.anIntArray557[local97] <= local58.anInt5862) {
									Static269.anIntArray657[local97] = local58.anInt5865;
									Static253.anIntArray631[local97] = local544;
									Static299.anIntArray723[local97] = arg6.method3305() ? local58.anInt5861 : local58.anInt5857;
									Static312.anIntArray808[local97] = local58.anInt5856;
									if (local58.anInt5862 == Static221.anIntArray557[local97]) {
										Static251.anIntArray807[local97] |= 0x4;
									} else {
										Static251.anIntArray807[local97] = 4;
									}
									Static221.anIntArray557[local97] = local58.anInt5862;
								}
								local539++;
								local97--;
							}
							if (!local31[arg8 + 1 & 0x3]) {
								arg12[1] = Static251.aBooleanArrayArray24[local76][local508 + 3 & 0x3];
							}
						} else if (!local31[arg8 + 1 & 0x3]) {
							arg12[1] = Static262.aBooleanArrayArray20[local76][local508 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		@Pc(1219) int local1219 = Static219.method3992(arg6, arg3);
		if (!arg3.aBoolean513) {
			return;
		}
		for (local50 = 0; local50 < 8; local50++) {
			@Pc(1235) int local1235 = local50 - arg8 * 2 & 0x7;
			if (Static100.aBooleanArrayArray11[arg2][local50] && arg3.anInt5862 >= Static221.anIntArray557[local1235]) {
				Static269.anIntArray657[local1235] = arg3.anInt5865;
				Static253.anIntArray631[local1235] = local1219;
				Static299.anIntArray723[local1235] = arg6.method3305() ? arg3.anInt5861 : arg3.anInt5857;
				Static312.anIntArray808[local1235] = arg3.anInt5856;
				if (arg3.anInt5862 == Static221.anIntArray557[local1235]) {
					Static251.anIntArray807[local1235] |= 0x2;
				} else {
					Static251.anIntArray807[local1235] = 2;
				}
				Static221.anIntArray557[local1235] = arg3.anInt5862;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method902(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local11 && Static137.method2637(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static137.method2637(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local11;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(69) StringBuffer local69 = new StringBuffer(local54);
		for (@Pc(71) int local71 = local11; local71 < local19; local71++) {
			@Pc(77) char local77 = arg0.charAt(local71);
			if (Static210.method3851(local77)) {
				@Pc(85) char local85 = Static5.method181(local77);
				if (local85 != '\u0000') {
					local69.append(local85);
				}
			}
		}
		if (local69.length() == 0) {
			return null;
		} else {
			return local69.toString();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[BIILjava/lang/String;)I")
	public static int method904(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg3.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg1[arg0 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg1[local12 + arg0] = -128;
			} else if (local20 == '‚') {
				arg1[local12 + arg0] = -126;
			} else if (local20 == 'ƒ') {
				arg1[local12 + arg0] = -125;
			} else if (local20 == '„') {
				arg1[local12 + arg0] = -124;
			} else if (local20 == '…') {
				arg1[local12 + arg0] = -123;
			} else if (local20 == '†') {
				arg1[local12 + arg0] = -122;
			} else if (local20 == '‡') {
				arg1[arg0 + local12] = -121;
			} else if (local20 == 'ˆ') {
				arg1[local12 + arg0] = -120;
			} else if (local20 == '‰') {
				arg1[arg0 + local12] = -119;
			} else if (local20 == 'Š') {
				arg1[local12 + arg0] = -118;
			} else if (local20 == '‹') {
				arg1[arg0 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg1[arg0 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg1[local12 + arg0] = -114;
			} else if (local20 == '‘') {
				arg1[arg0 + local12] = -111;
			} else if (local20 == '’') {
				arg1[local12 + arg0] = -110;
			} else if (local20 == '“') {
				arg1[local12 + arg0] = -109;
			} else if (local20 == '”') {
				arg1[arg0 + local12] = -108;
			} else if (local20 == '•') {
				arg1[arg0 + local12] = -107;
			} else if (local20 == '–') {
				arg1[arg0 + local12] = -106;
			} else if (local20 == '—') {
				arg1[arg0 + local12] = -105;
			} else if (local20 == '˜') {
				arg1[arg0 + local12] = -104;
			} else if (local20 == '™') {
				arg1[arg0 + local12] = -103;
			} else if (local20 == 'š') {
				arg1[local12 + arg0] = -102;
			} else if (local20 == '›') {
				arg1[local12 + arg0] = -101;
			} else if (local20 == 'œ') {
				arg1[local12 + arg0] = -100;
			} else if (local20 == 'ž') {
				arg1[local12 + arg0] = -98;
			} else if (local20 == 'Ÿ') {
				arg1[arg0 + local12] = -97;
			} else {
				arg1[arg0 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
	public static void method906() {
		Static207.aClass140_104.method3813();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(III)I")
	public static int method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub38 local10 = (Class1_Sub38) Static338.aClass26_33.method870((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray763.length) {
			return local10.anIntArray763[arg1];
		} else {
			return -1;
		}
	}
}
