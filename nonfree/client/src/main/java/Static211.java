import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Lclient!kea;")
	public static Class161 aClass161_49;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public static int anInt4643;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "I")
	public static int anInt4645;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
	public static final int[] anIntArray420 = new int[14];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method3877(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		@Pc(39) int local39 = arg0 / 10;
		while (local39 != 0) {
			local39 /= 10;
			local35++;
		}
		@Pc(55) char[] local55 = new char[local35];
		local55[0] = '+';
		for (@Pc(63) int local63 = local35 - 1; local63 > 0; local63--) {
			@Pc(66) int local66 = arg0;
			arg0 /= 10;
			@Pc(77) int local77 = local66 - arg0 * 10;
			if (local77 < 10) {
				local55[local63] = (char) (local77 + 48);
			} else {
				local55[local63] = (char) (local77 + 87);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public static void method3879() {
		if (Static393.anIntArray638 != null) {
			return;
		}
		Static393.anIntArray638 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(42) double local42 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(82) double local82;
				if (local60 < 0.5D) {
					local82 = local60 * (local53 + 1.0D);
				} else {
					local82 = local60 + local53 - local60 * local53;
				}
				@Pc(97) double local97 = local60 * 2.0D - local82;
				@Pc(101) double local101 = local42 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local42 - 0.3333333333333333D;
				if (local42 * 6.0D < 1.0D) {
					local64 = local97 + local42 * (local82 - local97) * 6.0D;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local82;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local97 + (0.6666666666666666D - local42) * 6.0D * (local82 - local97);
				} else {
					local64 = local97;
				}
				if (local101 * 6.0D < 1.0D) {
					local62 = (local82 - local97) * 6.0D * local101 + local97;
				} else if (local101 * 2.0D < 1.0D) {
					local62 = local82;
				} else if (local101 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local101) * 6.0D * (local82 - local97) + local97;
				} else {
					local62 = local97;
				}
				if (local115 < 0.0D) {
					local115++;
				}
				if (local115 * 6.0D < 1.0D) {
					local66 = local115 * (local82 - local97) * 6.0D + local97;
				} else if (local115 * 2.0D < 1.0D) {
					local66 = local82;
				} else if (local115 * 3.0D < 2.0D) {
					local66 = (local82 - local97) * 6.0D * (0.6666666666666666D - local115) + local97;
				} else {
					local66 = local97;
				}
			}
			local62 = Math.pow(local62, local19);
			local64 = Math.pow(local64, local19);
			local66 = Math.pow(local66, local19);
			@Pc(293) int local293 = (int) (local62 * 256.0D);
			@Pc(298) int local298 = (int) (local64 * 256.0D);
			@Pc(303) int local303 = (int) (local66 * 256.0D);
			@Pc(314) int local314 = (local298 << 8) + (local293 << 16) + local303;
			Static393.anIntArray638[local29] = local314;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I")
	public static int method3880(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lclient!lq;")
	public static Class3_Sub31 method3881() {
		if (Static55.aClass71_19 == null || Static468.aClass157_1 == null) {
			return null;
		}
		Static468.aClass157_1.method4207(Static55.aClass71_19);
		@Pc(23) Class3_Sub31 local23 = (Class3_Sub31) Static468.aClass157_1.method4203();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class179 local33 = Static55.aClass135_2.method3801(local23.anInt5809);
			return local33 != null && local33.aBoolean370 && local33.method4796(Static55.anInterface17_2) ? local23 : Static547.method7809();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(II[II[J)V")
	public static void method3882(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg0) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local24;
		@Pc(38) int local38 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg2; local60 < arg0; local60++) {
			if ((long) (local58 & local60) + local24 > arg3[local60]) {
				@Pc(81) long local81 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20] = local81;
				@Pc(95) int local95 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20++] = local95;
			}
		}
		arg3[arg0] = arg3[local20];
		arg3[local20] = local24;
		arg1[arg0] = arg1[local20];
		arg1[local20] = local38;
		method3882(local20 - 1, arg1, arg2, arg3);
		method3882(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!tq;ZZILjava/lang/String;)V")
	public static void method3883(@OriginalArg(0) Class285 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg2) {
			Static533.method5628(arg0, arg3, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static472.aString75.startsWith("win") && arg0.aBoolean625) {
			local14 = null;
			if (Static370.anApplet1 != null) {
				local14 = Static370.anApplet1.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class212 local32 = Static533.method5628(arg0, arg3, 0);
				Static210.aClass212_1 = local32;
				Static241.aClass285_16 = arg0;
				Static397.aString59 = arg3;
				return;
			}
		}
		if (Static472.aString75.startsWith("mac")) {
			local14 = null;
			if (Static370.anApplet1 != null) {
				local14 = Static370.anApplet1.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg1) {
				Static533.method5628(arg0, arg3, 1);
				return;
			}
		}
		Static533.method5628(arg0, arg3, 2);
	}
}
