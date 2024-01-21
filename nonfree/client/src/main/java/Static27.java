import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
	public static int anInt829 = -1;

	@OriginalMember(owner = "client!cf", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_198 = Static158.method3034("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "J")
	public static long aLong25 = 0L;

	@OriginalMember(owner = "client!cf", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_199 = Static158.method3034("Weiter");

	@OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
	public static int anInt836 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIIII)V")
	public static void method671(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class34 local13 = local7.aClass34_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2138;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class45 local58 = local7.aClass45_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt2667;
		@Pc(67) int local67 = local58.anInt2666;
		@Pc(70) int local70 = local58.anInt2668;
		@Pc(73) int local73 = local58.anInt2665;
		@Pc(77) int[] local77 = Static178.anIntArrayArray28[local23];
		@Pc(81) int[] local81 = Static91.anIntArrayArray16[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIIIII)V")
	public static void method672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg1 * arg1;
		@Pc(18) int local18 = arg2 * arg2;
		@Pc(26) int local26 = local18 << 1;
		@Pc(30) int local30 = arg2 << 1;
		@Pc(34) int local34 = local14 << 1;
		@Pc(44) int local44 = local14 * (1 - local30) + local26;
		@Pc(53) int local53 = local18 - local34 * (local30 - 1);
		@Pc(57) int local57 = local14 << 2;
		@Pc(61) int local61 = local18 << 2;
		@Pc(69) int local69 = local26 * 3;
		@Pc(75) int local75 = local61;
		@Pc(81) int local81 = local57 * (arg2 - 1);
		@Pc(89) int local89 = ((arg2 << 1) - 3) * local34;
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (Static36.anInt1076 <= arg4 && Static117.anInt951 >= arg4) {
			local108 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg0 + arg1);
			local116 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg0 - arg1);
			Static163.method3070(local108, local116, arg3, Static42.anIntArrayArray8[arg4]);
		}
		while (local10 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local53 += local75;
					local75 += local61;
					local3++;
					local44 += local69;
					local69 += local61;
				}
			}
			local10--;
			local108 = arg4 - local10;
			if (local53 < 0) {
				local44 += local69;
				local69 += local61;
				local53 += local75;
				local75 += local61;
				local3++;
			}
			local44 += -local81;
			local53 += -local89;
			local116 = local10 + arg4;
			local89 -= local57;
			if (local116 >= Static36.anInt1076 && Static117.anInt951 >= local108) {
				@Pc(217) int local217 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, local3 + arg0);
				@Pc(225) int local225 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg0 - local3);
				if (local108 >= Static36.anInt1076) {
					Static163.method3070(local217, local225, arg3, Static42.anIntArrayArray8[local108]);
				}
				if (Static117.anInt951 >= local116) {
					Static163.method3070(local217, local225, arg3, Static42.anIntArrayArray8[local116]);
				}
			}
			local81 -= local57;
		}
	}
}
