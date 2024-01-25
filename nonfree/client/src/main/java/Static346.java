import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	public static boolean aBoolean393;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
	public static boolean aBoolean394 = false;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[I")
	public static final int[] anIntArray339 = new int[1];

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lclient!gga;")
	public static final Class6_Sub23[] aClass6_Sub23Array1 = new Class6_Sub23[2048];

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I")
	public static int method5044(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static564.anInt9384 - 1; local3++) {
			if (arg0 < Static258.anIntArray259[local3] + Static506.anIntArray556[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static564.anInt9384 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "([Ljava/lang/Object;III[I)V")
	public static void method5045(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) Object local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg2; local62++) {
			if ((local60 & local62) + local29 > arg3[local62]) {
				@Pc(81) int local81 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25] = local81;
				@Pc(95) Object local95 = arg0[local62];
				arg0[local62] = arg0[local25];
				arg0[local25++] = local95;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method5045(arg0, arg1, local25 - 1, arg3);
		method5045(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	public static void method5046() {
		if (Static70.anIntArray71 != null) {
			return;
		}
		Static70.anIntArray71 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = local57 * (local50 + 1.0D);
				} else {
					local79 = local50 + local57 - local50 * local57;
				}
				@Pc(93) double local93 = local57 * 2.0D - local79;
				@Pc(97) double local97 = local39 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local39 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local59 = (local79 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local97 * 3.0D < 2.0D) {
					local59 = local93 + (local79 - local93) * (0.6666666666666666D - local97) * 6.0D;
				} else {
					local59 = local93;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local93 + (local79 - local93) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * 6.0D * (local79 - local93) + local93;
				} else {
					local61 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local111 * 6.0D < 1.0D) {
					local63 = (local79 - local93) * 6.0D * local111 + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local111 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local111) * 6.0D * (local79 - local93) + local93;
				} else {
					local63 = local93;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(289) int local289 = (int) (local59 * 256.0D);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(309) int local309 = (local294 << 8) + (local289 << 16) + local299;
			Static70.anIntArray71[local26] = local309;
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
	public static void method5047() {
		Static480.anInt8235 = 0;
		Static352.anInt6014++;
		Static105.anInt1939 = 0;
		Static415.method6234();
		Static305.method4390();
		Static336.method4913();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static480.anInt8235; local23++) {
			local29 = Static274.anIntArray268[local23];
			@Pc(36) Class6_Sub44 local36 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local29);
			@Pc(39) Class2_Sub1_Sub1_Sub3_Sub2 local39 = local36.aClass2_Sub1_Sub1_Sub3_Sub2_2;
			if (Static277.aBoolean303 && Static163.method2342(local29)) {
				Static406.method5836();
			}
			if (Static352.anInt6014 != local39.anInt5062) {
				if (local39.aClass91_1.method2032()) {
					Static89.method8412(local39);
				}
				local39.method4341((Class91) null);
				local21 = true;
				local36.method9174();
			}
		}
		if (local21) {
			Static490.anInt8336 = Static349.aClass209_32.method5033();
			Static349.aClass209_32.method5032(Static84.aClass6_Sub44Array1);
		}
		if (Static655.anInt10505 != Static204.aClass6_Sub23_Sub1_1.anInt9901) {
			throw new RuntimeException("gnp1 pos:" + Static204.aClass6_Sub23_Sub1_1.anInt9901 + " psize:" + Static655.anInt10505);
		}
		for (local29 = 0; local29 < Static133.anInt2316; local29++) {
			if (Static349.aClass209_32.method5038((long) Static74.anIntArray80[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static133.anInt2316);
			}
		}
		if (Static490.anInt8336 - Static133.anInt2316 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static490.anInt8336 - Static133.anInt2316));
		}
		for (@Pc(178) int local178 = 0; local178 < Static490.anInt8336; local178++) {
			if (Static352.anInt6014 != Static84.aClass6_Sub44Array1[local178].aClass2_Sub1_Sub1_Sub3_Sub2_2.anInt5062) {
				throw new RuntimeException("gnp4 uk:" + Static84.aClass6_Sub44Array1[local178].aClass2_Sub1_Sub1_Sub3_Sub2_2.anInt5103);
			}
		}
	}
}
