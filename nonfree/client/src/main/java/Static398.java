import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!sj;")
	public static Class3_Sub38 aClass3_Sub38_1;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!dn;")
	public static Class56 aClass56_83;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt6901;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt6893 = 0;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public static int anInt6899 = -1;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "J")
	public static long aLong200 = 0L;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
	public static int method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(7) int local7 = arg1;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			@Pc(20) char local20 = arg2.charAt(local9);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[local9 + arg0] = (byte) local20;
			} else if (local20 == '€') {
				arg3[arg0 + local9] = -128;
			} else if (local20 == '‚') {
				arg3[arg0 + local9] = -126;
			} else if (local20 == 'ƒ') {
				arg3[local9 + arg0] = -125;
			} else if (local20 == '„') {
				arg3[arg0 + local9] = -124;
			} else if (local20 == '…') {
				arg3[arg0 + local9] = -123;
			} else if (local20 == '†') {
				arg3[local9 + arg0] = -122;
			} else if (local20 == '‡') {
				arg3[arg0 + local9] = -121;
			} else if (local20 == 'ˆ') {
				arg3[arg0 + local9] = -120;
			} else if (local20 == '‰') {
				arg3[local9 + arg0] = -119;
			} else if (local20 == 'Š') {
				arg3[local9 + arg0] = -118;
			} else if (local20 == '‹') {
				arg3[arg0 + local9] = -117;
			} else if (local20 == 'Œ') {
				arg3[arg0 + local9] = -116;
			} else if (local20 == 'Ž') {
				arg3[local9 + arg0] = -114;
			} else if (local20 == '‘') {
				arg3[arg0 + local9] = -111;
			} else if (local20 == '’') {
				arg3[local9 + arg0] = -110;
			} else if (local20 == '“') {
				arg3[local9 + arg0] = -109;
			} else if (local20 == '”') {
				arg3[arg0 + local9] = -108;
			} else if (local20 == '•') {
				arg3[arg0 + local9] = -107;
			} else if (local20 == '–') {
				arg3[local9 + arg0] = -106;
			} else if (local20 == '—') {
				arg3[local9 + arg0] = -105;
			} else if (local20 == '˜') {
				arg3[arg0 + local9] = -104;
			} else if (local20 == '™') {
				arg3[local9 + arg0] = -103;
			} else if (local20 == 'š') {
				arg3[local9 + arg0] = -102;
			} else if (local20 == '›') {
				arg3[arg0 + local9] = -101;
			} else if (local20 == 'œ') {
				arg3[local9 + arg0] = -100;
			} else if (local20 == 'ž') {
				arg3[local9 + arg0] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[arg0 + local9] = -97;
			} else {
				arg3[local9 + arg0] = 63;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public static void method5366() {
		@Pc(7) Class203 local7 = null;
		try {
			@Pc(12) Class190 local12 = Static295.aClass103_5.method2841("2");
			while (local12.anInt5799 == 0) {
				Static135.method2458(1L);
			}
			if (local12.anInt5799 == 1) {
				local7 = (Class203) local12.anObject7;
				@Pc(36) byte[] local36 = new byte[(int) local7.method4991()];
				@Pc(51) int local51;
				for (@Pc(38) int local38 = 0; local38 < local36.length; local38 += local51) {
					local51 = local7.method4994(local38, local36.length - local38, local36);
					if (local51 == -1) {
						throw new IOException("EOF");
					}
				}
				Static256.method3881(new Class3_Sub2(local36));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method4993();
			}
		} catch (@Pc(91) Exception local91) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BC)Z")
	public static boolean method5368(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public static void method5370() {
		for (@Pc(1) int local1 = 0; local1 < Static298.anInt5454; local1++) {
			if (!Static35.aBooleanArray19[local1]) {
				@Pc(10) Class54 local10 = Static303.aClass54Array1[local1];
				@Pc(13) Class3_Sub23 local13 = local10.aClass3_Sub23_1;
				@Pc(16) int local16 = local10.anInt1656;
				@Pc(22) int local22 = local13.method3670() - Static340.anInt6290;
				@Pc(30) int local30 = (local22 * 2 >> Static287.anInt5248) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method3679() - local22 >> Static287.anInt5248;
				@Pc(53) int local53 = local13.method3678() - local22 >> Static287.anInt5248;
				@Pc(61) int local61 = local13.method3678() + local22 >> Static287.anInt5248;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static57.anInt1411) {
					local61 = Static57.anInt1411 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray19[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static177.anInt3621) {
						local108 = Static177.anInt3621 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class1_Sub3 local141 = Static372.method1267(local16, local125, local78, oh.class);
						if (local141 != null && local141.aByte78 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte78 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray19[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray19[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray19[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray19[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static35.aBooleanArray19[local1] = true;
				Static120.aClass64Array1[local16].method5442(local13, local37);
			}
		}
	}
}
