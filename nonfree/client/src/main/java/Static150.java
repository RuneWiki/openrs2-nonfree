import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "Lclient!he;")
	public static Class100 aClass100_24;

	@OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!hi", name = "db", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_157 = new Class123(44, 4);

	@OriginalMember(owner = "client!hi", name = "Z", descriptor = "J")
	public static long aLong89 = -1L;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "(I)Z")
	public static boolean method2597() {
		try {
			if (Static445.anInt7975 == 2) {
				if (Static406.aClass6_Sub21_2 == null) {
					Static406.aClass6_Sub21_2 = Static455.method3231(Static35.aClass100_7, Static399.anInt7157, Static386.anInt6865);
					if (Static406.aClass6_Sub21_2 == null) {
						return false;
					}
				}
				if (Static89.aClass117_1 == null) {
					Static89.aClass117_1 = new Class117(Static232.aClass100_46, Static333.aClass100_64);
				}
				if (Static387.aClass6_Sub4_Sub2_3.method717(Static89.aClass117_1, Static406.aClass6_Sub21_2, Static335.aClass100_67)) {
					Static387.aClass6_Sub4_Sub2_3.method716();
					Static387.aClass6_Sub4_Sub2_3.method746(Static387.anInt6869);
					Static387.aClass6_Sub4_Sub2_3.method740(Static406.aClass6_Sub21_2, Static342.aBoolean369);
					Static445.anInt7975 = 0;
					Static89.aClass117_1 = null;
					Static35.aClass100_7 = null;
					Static406.aClass6_Sub21_2 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static387.aClass6_Sub4_Sub2_3.method726();
			Static89.aClass117_1 = null;
			Static406.aClass6_Sub21_2 = null;
			Static35.aClass100_7 = null;
			Static445.anInt7975 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg1;
		@Pc(20) int local20 = arg4 - arg1;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local16 * local16;
		@Pc(48) int local48 = local20 * local20;
		@Pc(52) int local52 = local28 << 1;
		@Pc(56) int local56 = local24 << 1;
		@Pc(60) int local60 = local48 << 1;
		@Pc(64) int local64 = local32 << 1;
		@Pc(68) int local68 = arg4 << 1;
		@Pc(72) int local72 = local20 << 1;
		@Pc(81) int local81 = local52 + local24 * (1 - local68);
		@Pc(90) int local90 = local28 - local56 * (local68 - 1);
		@Pc(100) int local100 = local32 * (1 - local72) + local60;
		@Pc(109) int local109 = local48 - local64 * (local72 - 1);
		@Pc(113) int local113 = local24 << 2;
		@Pc(117) int local117 = local28 << 2;
		@Pc(121) int local121 = local32 << 2;
		@Pc(125) int local125 = local48 << 2;
		@Pc(129) int local129 = local52 * 3;
		@Pc(135) int local135 = local56 * (local68 - 3);
		@Pc(139) int local139 = local60 * 3;
		@Pc(145) int local145 = local64 * (local72 - 3);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = (arg4 - 1) * local113;
		@Pc(155) int local155 = local125;
		@Pc(161) int local161 = local121 * (local20 - 1);
		@Pc(188) int local188;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(214) int local214;
		if (arg3 >= Static172.anInt3442 && Static324.anInt5590 >= arg3) {
			@Pc(179) int[] local179 = Static62.anIntArrayArray7[arg3];
			local188 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - arg2);
			local197 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 + arg2);
			local206 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - local16);
			local214 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local16 + arg0);
			Static298.method4405(local179, arg5, local206, local188);
			Static298.method4405(local179, arg6, local214, local206);
			Static298.method4405(local179, arg5, local197, local214);
		}
		while (local9 > 0) {
			@Pc(241) boolean local241 = local20 >= local9;
			if (local81 < 0) {
				while (local81 < 0) {
					local90 += local147;
					local81 += local129;
					local147 += local117;
					local7++;
					local129 += local117;
				}
			}
			if (local241) {
				if (local100 < 0) {
					while (local100 < 0) {
						local109 += local155;
						local100 += local139;
						local11++;
						local155 += local125;
						local139 += local125;
					}
				}
				if (local109 < 0) {
					local109 += local155;
					local100 += local139;
					local139 += local125;
					local155 += local125;
					local11++;
				}
				local100 += -local161;
				local109 += -local145;
				local161 -= local121;
				local145 -= local121;
			}
			if (local90 < 0) {
				local90 += local147;
				local81 += local129;
				local7++;
				local129 += local117;
				local147 += local117;
			}
			local81 += -local153;
			local90 += -local135;
			local9--;
			local135 -= local113;
			local153 -= local113;
			local188 = arg3 - local9;
			local197 = arg3 + local9;
			if (Static172.anInt3442 <= local197 && Static324.anInt5590 >= local188) {
				local206 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 + local7);
				local214 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - local7);
				if (local241) {
					@Pc(450) int local450 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local11 + arg0);
					@Pc(459) int local459 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg0 - local11);
					@Pc(470) int[] local470;
					if (local188 >= Static172.anInt3442) {
						local470 = Static62.anIntArrayArray7[local188];
						Static298.method4405(local470, arg5, local459, local214);
						Static298.method4405(local470, arg6, local450, local459);
						Static298.method4405(local470, arg5, local206, local450);
					}
					if (local197 <= Static324.anInt5590) {
						local470 = Static62.anIntArrayArray7[local197];
						Static298.method4405(local470, arg5, local459, local214);
						Static298.method4405(local470, arg6, local450, local459);
						Static298.method4405(local470, arg5, local206, local450);
					}
				} else {
					if (Static172.anInt3442 <= local188) {
						Static298.method4405(Static62.anIntArrayArray7[local188], arg5, local206, local214);
					}
					if (Static324.anInt5590 >= local197) {
						Static298.method4405(Static62.anIntArrayArray7[local197], arg5, local206, local214);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!dd;FIIFIFIIII[BFF)V")
	public static void method2599(@OriginalArg(0) Class45 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(44) int local44;
		@Pc(58) int local58;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg0.method1836(arg2, 0, arg5 / (float) 128, arg7 / (float) 16, local12, arg1 / (float) 128, arg8 * 127.0F);
			local44 = arg4;
			arg1 *= 2.0F;
			arg8 *= arg3;
			arg7 *= 2.0F;
			for (local58 = 0; local58 < 16384; local58++) {
				arg6[local44] = (byte) ((float) arg6[local44] + local12[local58]);
				local44++;
			}
			arg5 *= 2.0F;
		}
		local44 = arg4;
		for (local58 = 0; local58 < 16384; local58++) {
			arg6[local44] -= -127;
			local44++;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
	public static int method2600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static65.method1839(arg1 + 45365, arg0 - -91923, 4) + (Static65.method1839(arg1 - -10294, arg0 + 37821, 2) + -128 >> 1) + (Static65.method1839(arg1, arg0, 1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}
}
