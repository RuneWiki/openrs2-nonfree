import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
	public static int anInt5583;

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
	public static int anInt5586;

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
	public static int anInt5587;

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lclient!ph;")
	public static Class138 aClass138_84;

	@OriginalMember(owner = "client!vd", name = "hb", descriptor = "Z")
	public static boolean aBoolean416;

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "[C")
	public static char[] aCharArray9 = new char[128];

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
	public static int anInt5584 = 0;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "J")
	public static long aLong207 = 0L;

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
	public static int anInt5588 = 0;

	@OriginalMember(owner = "client!vd", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString189 = null;

	@OriginalMember(owner = "client!vd", name = "kb", descriptor = "[I")
	public static int[] anIntArray507 = new int[] { 0, 0, -2, 0, 0, 0, 0, 0, 0, 8, 0, 4, 2, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 4, 0, 0, 0, 1, 7, -2, 0, 8, 0, 0, 3, 0, -2, 0, 6, 0, -1, 2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 3, 1, -1, 0, 10, 1, 7, 0, 10, 5, 2, 0, 0, 0, -1, 0, 0, 6, -1, 0, 0, 0, -1, 14, 6, 0, 8, 2, 8, 12, 0, 2, 0, 0, -1, 5, -1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, -2, 0, 0, 12, 0, 0, 0, 0, 4, 3, 0, -2, 0, 0, 6, 6, 0, 0, 0, 0, 0, 10, 11, 0, 0, 0, 0, 7, 0, 20, 0, 0, 3, 0, -1, 0, 0, 0, 3, 0, 15, 0, 3, 0, 0, 0, 0, 0, 14, 2, 0, 0, 0, 12, 0, -1, 0, 0, 10, 0, 0, 0, -2, 0, 6, 0, 6, 0, 0, -2, 0, 0, 0, -1, 0, 0, 17, 9, -2, 5, 8, 0, 6, 0, -2, 8, 3, 6, -2, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 1, 0, -1, 0, 5, 0, 0, 0, 0, 0, 0, 8, 0, 7, 0, 0, 28, 0, 0, -1, 0, -2, -2, 15, 8, -1, 0, 0, 4, 0, 0, 0, 0, 0, 8, -1, 0, 3, 0, 12, 0, 0, 12, 2 };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
	public static void method4389(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub2 local12 = Static46.method824(5, arg0);
		local12.method299();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!ph;)I")
	public static int method4390(@OriginalArg(1) Class138 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method3340(Static220.anInt5831)) {
			local1++;
		}
		if (arg0.method3340(Static24.anInt474)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
	public static void method4393(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(7, arg0);
		local8.method299();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
	public static int method4394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
	public static void method4395() {
		Static255.anIntArray450 = null;
		Static255.aByteArrayArray15 = null;
		Static201.anIntArray327 = null;
		Static134.anIntArray220 = null;
		Static148.anIntArray242 = null;
		Static40.anIntArray59 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIZIIII)V")
	public static void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!arg3 && Static305.anInt5793 == arg2 && Static244.anInt4868 == arg6 && (Static277.anInt5275 == arg5 || Static62.method1046())) {
			return;
		}
		Static244.anInt4868 = arg6;
		Static277.anInt5275 = arg5;
		Static305.anInt5793 = arg2;
		if (Static62.method1046()) {
			Static277.anInt5275 = 0;
		}
		if (arg1) {
			Static176.method4598(28);
		} else {
			Static176.method4598(25);
		}
		Static312.method4593(Static165.aString106, true);
		@Pc(52) int local52 = Static290.anInt5497;
		Static290.anInt5497 = (arg2 - 6) * 8;
		@Pc(60) int local60 = Static118.anInt2409;
		Static118.anInt2409 = arg6 * 8 - 48;
		Static213.aClass1_Sub1_Sub8_3 = Static58.method2038(Static305.anInt5793 * 8, Static244.anInt4868 * 8);
		@Pc(79) int local79 = Static290.anInt5497 - local52;
		@Pc(83) int local83 = Static118.anInt2409 - local60;
		Static27.aClass172_1 = null;
		@Pc(93) int local93;
		@Pc(102) Class22_Sub3_Sub1 local102;
		@Pc(107) int local107;
		if (arg1) {
			Static105.anInt2015 = 0;
			for (local93 = 0; local93 < 32768; local93++) {
				local102 = Static265.aClass22_Sub3_Sub1Array1[local93];
				if (local102 != null) {
					local102.anInt4623 -= local83 * 128;
					local102.anInt4601 -= local79 * 128;
					if (local102.anInt4601 >= 0 && local102.anInt4601 <= 13184 && local102.anInt4623 >= 0 && local102.anInt4623 <= 13184) {
						for (local107 = 0; local107 < 10; local107++) {
							local102.anIntArray427[local107] -= local79;
							local102.anIntArray424[local107] -= local83;
						}
						Static7.anIntArray12[Static105.anInt2015++] = local93;
					} else {
						Static265.aClass22_Sub3_Sub1Array1[local93].method3118(null);
						Static265.aClass22_Sub3_Sub1Array1[local93] = null;
					}
				}
			}
		} else {
			for (local93 = 0; local93 < 32768; local93++) {
				local102 = Static265.aClass22_Sub3_Sub1Array1[local93];
				if (local102 != null) {
					for (local107 = 0; local107 < 10; local107++) {
						local102.anIntArray427[local107] -= local79;
						local102.anIntArray424[local107] -= local83;
					}
					local102.anInt4623 -= local83 * 128;
					local102.anInt4601 -= local79 * 128;
				}
			}
		}
		for (local93 = 0; local93 < 2048; local93++) {
			@Pc(254) Class22_Sub3_Sub2 local254 = Static195.aClass22_Sub3_Sub2Array1[local93];
			if (local254 != null) {
				for (local107 = 0; local107 < 10; local107++) {
					local254.anIntArray427[local107] -= local79;
					local254.anIntArray424[local107] -= local83;
				}
				local254.anInt4623 -= local83 * 128;
				local254.anInt4601 -= local79 * 128;
			}
		}
		anInt5586 = arg5;
		Static229.aClass22_Sub3_Sub2_2.method3661(arg4, arg0, false);
		@Pc(310) byte local310 = 0;
		@Pc(312) byte local312 = 1;
		@Pc(314) byte local314 = 104;
		@Pc(316) byte local316 = 0;
		if (local79 < 0) {
			local312 = -1;
			local314 = -1;
			local310 = 103;
		}
		@Pc(327) byte local327 = 104;
		@Pc(329) byte local329 = 1;
		if (local83 < 0) {
			local329 = -1;
			local316 = 103;
			local327 = -1;
		}
		for (@Pc(343) int local343 = local310; local343 != local314; local343 += local312) {
			for (@Pc(348) int local348 = local316; local348 != local327; local348 += local329) {
				@Pc(359) int local359 = local79 + local343;
				@Pc(363) int local363 = local83 + local348;
				for (@Pc(365) int local365 = 0; local365 < 4; local365++) {
					if (local359 >= 0 && local363 >= 0 && local359 < 104 && local363 < 104) {
						Static68.aClass24ArrayArrayArray1[local365][local343][local348] = Static68.aClass24ArrayArrayArray1[local365][local359][local363];
					} else {
						Static68.aClass24ArrayArrayArray1[local365][local343][local348] = null;
					}
				}
			}
		}
		for (@Pc(435) Class1_Sub19 local435 = (Class1_Sub19) Static114.aClass24_16.method460(); local435 != null; local435 = (Class1_Sub19) Static114.aClass24_16.method464()) {
			local435.anInt3719 -= local79;
			local435.anInt3725 -= local83;
			if (local435.anInt3719 < 0 || local435.anInt3725 < 0 || local435.anInt3719 >= 104 || local435.anInt3725 >= 104) {
				local435.method4616();
			}
		}
		Static258.anInt5018 = 0;
		if (Static62.anInt1244 != 0) {
			Static127.anInt2540 -= local83;
			Static62.anInt1244 -= local79;
		}
		if (arg1) {
			Static105.anInt2016 -= local83 * 128;
			Static123.anInt2494 -= local79;
			Static23.anInt440 -= local83;
			Static243.anInt5653 -= local79 * 128;
			Static106.anInt2119 -= local79;
			Static206.anInt4065 -= local83;
		} else if (Static101.anInt1895 == 4) {
			Static142.anInt2794 -= local83 * 128;
			Static97.anInt1806 -= local79 * 128;
			Static216.anInt4233 -= local79 * 128;
			Static258.anInt5019 -= local83 * 128;
		} else {
			Static101.anInt1895 = 1;
		}
		if (Static291.aBoolean404 && arg1 && (Math.abs(local79) > 104 || Math.abs(local83) > 104)) {
			Static175.method2925();
		}
		Static194.method3151();
		Static185.aClass24_21.method462();
		Static27.aClass24_1.method462();
		Static149.method2404();
	}
}
