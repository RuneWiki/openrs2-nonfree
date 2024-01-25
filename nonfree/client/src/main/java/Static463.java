import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!om;")
	public static Class246 aClass246_219;

	@OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
	public static int anInt7588;

	@OriginalMember(owner = "client!rq", name = "v", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_233 = new Class272(100, 6);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method6414(@OriginalArg(1) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 < 128) {
				local16[local18++] = (char) local28;
			} else if (local28 >= 194) {
				@Pc(62) int local62;
				if (local28 < 224) {
					if (local13 <= local20 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local62 = arg0[local20] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) (local62 & 0xFFFFFF7F | (local28 & 0xFFFFFF3F) << 6);
				} else if (local28 < 240) {
					if (local13 <= local20 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local62 = arg0[local20] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(150) int local150 = arg0[local20] & 0xFF;
					if (local150 < 128 || local150 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) ((local28 & 0xFFF1F) << 12 | local62 << 6 & 0xFFFFDFC0 | local150 & 0xFFFFFF7F);
				} else if (local28 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
			}
		}
		return new String(local16, 0, local18);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLclient!qh;)Lclient!ti;")
	public static Class322 method6415(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) String local7 = arg0.method3133();
		@Pc(14) Class300 local14 = Static175.method3039()[arg0.method3118()];
		@Pc(21) Class140 local21 = Static53.method999()[arg0.method3118()];
		@Pc(25) int local25 = arg0.method3107();
		@Pc(29) int local29 = arg0.method3107();
		@Pc(33) int local33 = arg0.method3118();
		@Pc(37) int local37 = arg0.method3118();
		@Pc(41) int local41 = arg0.method3118();
		@Pc(45) int local45 = arg0.method3109();
		@Pc(49) int local49 = arg0.method3109();
		@Pc(53) int local53 = arg0.method3116();
		@Pc(62) int local62 = arg0.method3116();
		@Pc(66) int local66 = arg0.method3116();
		return new Class322(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local62, local66);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6417(@OriginalArg(0) String arg0) {
		return Static192.method3297(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIII)V")
	public static void method6418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(25) int local25 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(42) int local42 = local25 + (1 - local33) * local13;
		@Pc(51) int local51 = local17 - local29 * (local33 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = ((arg0 << 1) - 3) * local29;
		@Pc(81) int local81 = local59;
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (Static385.anInt6630 <= arg1 && arg1 <= Static69.anInt1918) {
			local103 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg3 + arg4);
			local112 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4 - arg3);
			Static337.method5150(local103, arg2, local112, Static176.anIntArrayArray28[arg1]);
		}
		@Pc(126) int local126 = (arg0 - 1) * local55;
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local67;
					local51 += local81;
					local67 += local59;
					local81 += local59;
					local7++;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local7++;
			}
			local51 += -local75;
			local42 += -local126;
			local126 -= local55;
			local9--;
			local75 -= local55;
			local103 = arg1 - local9;
			local112 = local9 + arg1;
			if (local112 >= Static385.anInt6630 && Static69.anInt1918 >= local103) {
				@Pc(216) int local216 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4 + local7);
				@Pc(225) int local225 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4 - local7);
				if (local103 >= Static385.anInt6630) {
					Static337.method5150(local216, arg2, local225, Static176.anIntArrayArray28[local103]);
				}
				if (Static69.anInt1918 >= local112) {
					Static337.method5150(local216, arg2, local225, Static176.anIntArrayArray28[local112]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static269.method4385(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg4;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(27) int local27 = arg5;
		@Pc(30) int local30 = -arg5;
		@Pc(32) int local32 = local14;
		@Pc(35) int local35 = -local14;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static176.anIntArrayArray28[arg3];
		@Pc(48) int local48 = arg0 - local14;
		@Pc(53) int local53 = arg0 + local14;
		Static337.method5150(local48, arg1, arg0 - arg5, local43);
		Static337.method5150(local53, arg2, local48, local43);
		Static337.method5150(arg5 + arg0, arg1, local53, local43);
		while (local10 < local27) {
			local37 += 2;
			local39 += 2;
			local30 += local37;
			local35 += local39;
			if (local35 >= 0 && local32 >= 1) {
				Static478.anIntArray602[local32] = local10;
				local32--;
				local35 -= local32 << 1;
			}
			local10++;
			@Pc(133) int[] local133;
			@Pc(139) int[] local139;
			@Pc(143) int local143;
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local30 >= 0) {
				local27--;
				local30 -= local27 << 1;
				if (local27 < local14) {
					local133 = Static176.anIntArrayArray28[local27 + arg3];
					local139 = Static176.anIntArrayArray28[arg3 - local27];
					local143 = Static478.anIntArray602[local27];
					local147 = arg0 + local10;
					local152 = arg0 - local10;
					local156 = arg0 + local143;
					local161 = arg0 - local143;
					Static337.method5150(local161, arg1, local152, local133);
					Static337.method5150(local156, arg2, local161, local133);
					Static337.method5150(local147, arg1, local156, local133);
					Static337.method5150(local161, arg1, local152, local139);
					Static337.method5150(local156, arg2, local161, local139);
					Static337.method5150(local147, arg1, local156, local139);
				} else {
					local133 = Static176.anIntArrayArray28[local27 + arg3];
					local139 = Static176.anIntArrayArray28[arg3 - local27];
					local143 = local10 + arg0;
					local147 = arg0 - local10;
					Static337.method5150(local143, arg1, local147, local133);
					Static337.method5150(local143, arg1, local147, local139);
				}
			}
			local133 = Static176.anIntArrayArray28[arg3 + local10];
			local139 = Static176.anIntArrayArray28[arg3 - local10];
			local143 = arg0 + local27;
			local147 = arg0 - local27;
			if (local14 <= local10) {
				Static337.method5150(local143, arg1, local147, local133);
				Static337.method5150(local143, arg1, local147, local139);
			} else {
				local152 = local10 <= local32 ? local32 : Static478.anIntArray602[local10];
				local156 = arg0 + local152;
				local161 = arg0 - local152;
				Static337.method5150(local161, arg1, local147, local133);
				Static337.method5150(local156, arg2, local161, local133);
				Static337.method5150(local143, arg1, local156, local133);
				Static337.method5150(local161, arg1, local147, local139);
				Static337.method5150(local156, arg2, local161, local139);
				Static337.method5150(local143, arg1, local156, local139);
			}
		}
	}
}
