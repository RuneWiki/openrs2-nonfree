import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
	public static int anInt2138 = -1;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public static int anInt2142 = -1;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method1778() {
		Static111.aClass169_65.method4020(5);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method1779() {
		if (Static70.aClass146_5 != null || (Static9.aClass146_11 != null || Static119.anInt5879 > 0)) {
			return;
		}
		@Pc(27) int local27 = Static86.anInt1565;
		@Pc(96) int local96;
		@Pc(102) int local102;
		if (!aBoolean161) {
			if (local27 == 1 && Static316.anInt5941 > 0) {
				@Pc(44) short local44 = Static241.aShortArray76[Static316.anInt5941 - 1];
				if (local44 == 21 || local44 == 20 || local44 == 26 || local44 == 45 || local44 == 35 || local44 == 2 || local44 == 34 || local44 == 22 || local44 == 17 || local44 == 58 || local44 == 50 || local44 == 1008) {
					local96 = Static159.anIntArray270[Static316.anInt5941 - 1];
					local102 = Static44.anIntArray74[Static316.anInt5941 - 1];
					@Pc(106) Class146 local106 = Static259.method3908(local102);
					@Pc(109) Class1_Sub22 local109 = Static36.method643(local106);
					if (local109.method3236() || local109.method3232()) {
						Static208.anInt4109 = 0;
						Static107.aBoolean160 = false;
						if (Static70.aClass146_5 != null) {
							Static237.method2927(Static70.aClass146_5);
						}
						Static70.aClass146_5 = Static259.method3908(local102);
						Static61.anInt1206 = local96;
						Static137.anInt2717 = Static46.anInt894;
						Static130.anInt2573 = Static84.anInt1530;
						Static237.method2927(Static70.aClass146_5);
						return;
					}
				}
			}
			if (local27 == 1 && (Static287.anInt5451 == 1 && Static316.anInt5941 > 2 || Static277.method4117(Static316.anInt5941 - 1))) {
				local27 = 2;
			}
			if (local27 == 2 && Static316.anInt5941 > 0 || Static190.anInt3885 == 1) {
				Static35.method598();
			}
			if (local27 == 1 && Static316.anInt5941 > 0 || Static190.anInt3885 == 2) {
				Static300.method4499();
			}
			return;
		}
		@Pc(200) int local200;
		if (local27 != 1) {
			local200 = Static152.anInt3132;
			local96 = Static300.anInt5678;
			if (Static143.anInt2824 - 10 > local200 || Static44.anInt848 + Static143.anInt2824 + 10 < local200 || local96 < Static78.anInt1455 - 10 || local96 > Static66.anInt1303 + Static78.anInt1455 + 10) {
				aBoolean161 = false;
				Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
			}
		}
		if (local27 != 1) {
			return;
		}
		local200 = Static143.anInt2824;
		local96 = Static78.anInt1455;
		local102 = Static44.anInt848;
		@Pc(257) int local257 = Static84.anInt1530;
		@Pc(259) int local259 = Static46.anInt894;
		@Pc(261) int local261 = -1;
		for (@Pc(263) int local263 = 0; local263 < Static316.anInt5941; local263++) {
			@Pc(284) int local284;
			if (Static37.aBoolean62) {
				local284 = (Static316.anInt5941 - local263 - 1) * 15 + local96 + 33;
				if (local200 < local257 && local102 + local200 > local257 && local259 > local284 - 13 && local259 < local284 + 3) {
					local261 = local263;
				}
			} else {
				local284 = (Static316.anInt5941 - local263 - 1) * 15 + local96 + 31;
				if (local257 > local200 && local102 + local200 > local257 && local259 > local284 - 13 && local259 < local284 + 3) {
					local261 = local263;
				}
			}
		}
		if (local261 != -1) {
			Static44.method779(local261);
		}
		aBoolean161 = false;
		Static94.method1387(Static78.anInt1455, Static143.anInt2824, Static44.anInt848, Static66.anInt1303);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
	public static void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(4, arg1);
		local8.method294();
		local8.anInt296 = arg0;
		local8.anInt293 = arg2;
		local8.anInt294 = arg3;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method1781() {
		@Pc(32) String local32;
		if (Static197.anInt3990 == 1 && Static316.anInt5941 < 2) {
			local32 = Static249.aString163 + Static88.aString57 + Static90.aString151 + " ->";
		} else if (Static91.aBoolean136 && Static316.anInt5941 < 2) {
			local32 = Static232.aString115 + Static88.aString57 + Static86.aString53 + " ->";
		} else if (Static49.aBoolean74 && Static88.aBooleanArray16[81] && Static316.anInt5941 > 2) {
			local32 = Static190.method3114(Static316.anInt5941 - 2);
		} else {
			local32 = Static190.method3114(Static316.anInt5941 - 1);
		}
		if (Static316.anInt5941 > 2) {
			local32 = local32 + "<col=ffffff> / " + (Static316.anInt5941 - 2) + Static292.aString187;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method1785(@OriginalArg(1) Class138 arg0) {
		Static233.aClass138_61 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIIIIZIIII)V")
	public static void method1787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = 0; local3 < 104; local3++) {
			for (local10 = 0; local10 < 104; local10++) {
				Static173.anIntArrayArray23[local3][local10] = 0;
				Static254.anIntArrayArray38[local3][local10] = 99999999;
			}
		}
		Static173.anIntArrayArray23[arg6][arg8] = 99;
		local3 = arg6;
		local10 = arg8;
		Static254.anIntArrayArray38[arg6][arg8] = 0;
		@Pc(53) boolean local53 = false;
		@Pc(55) byte local55 = 0;
		@Pc(57) int local57 = 0;
		Static229.anIntArray419[0] = arg6;
		@Pc(70) int local70 = local55 + 1;
		Static81.anIntArray123[0] = arg8;
		@Pc(77) int[][] local77 = Static56.aClass122Array1[Static295.anInt5586].anIntArrayArray28;
		@Pc(205) int local205;
		while (local70 != local57) {
			local3 = Static229.anIntArray419[local57];
			local10 = Static81.anIntArray123[local57];
			local57 = local57 + 1 & 0xFFF;
			if (arg2 == local3 && arg4 == local10) {
				local53 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static56.aClass122Array1[Static295.anInt5586].method3135(arg2, local10, arg3 - 1, local3, arg7, 1, arg4)) {
					local53 = true;
					break;
				}
				if (arg3 < 10 && Static56.aClass122Array1[Static295.anInt5586].method3127(1, arg3 - 1, arg7, local3, arg2, local10, arg4)) {
					local53 = true;
					break;
				}
			}
			if (arg5 != 0 && arg0 != 0 && Static56.aClass122Array1[Static295.anInt5586].method3140(local10, arg5, arg1, arg2, arg0, arg4, 1, local3)) {
				local53 = true;
				break;
			}
			local205 = Static254.anIntArrayArray38[local3][local10] + 1;
			if (local3 > 0 && Static173.anIntArrayArray23[local3 - 1][local10] == 0 && (local77[local3 - 1][local10] & 0x2C0108) == 0) {
				Static229.anIntArray419[local70] = local3 - 1;
				Static81.anIntArray123[local70] = local10;
				Static173.anIntArrayArray23[local3 - 1][local10] = 2;
				local70 = local70 + 1 & 0xFFF;
				Static254.anIntArrayArray38[local3 - 1][local10] = local205;
			}
			if (local3 < 103 && Static173.anIntArrayArray23[local3 + 1][local10] == 0 && (local77[local3 + 1][local10] & 0x2C0180) == 0) {
				Static229.anIntArray419[local70] = local3 + 1;
				Static81.anIntArray123[local70] = local10;
				Static173.anIntArrayArray23[local3 + 1][local10] = 8;
				local70 = local70 + 1 & 0xFFF;
				Static254.anIntArrayArray38[local3 + 1][local10] = local205;
			}
			if (local10 > 0 && Static173.anIntArrayArray23[local3][local10 - 1] == 0 && (local77[local3][local10 - 1] & 0x2C0102) == 0) {
				Static229.anIntArray419[local70] = local3;
				Static81.anIntArray123[local70] = local10 - 1;
				local70 = local70 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local3][local10 - 1] = 1;
				Static254.anIntArrayArray38[local3][local10 - 1] = local205;
			}
			if (local10 < 103 && Static173.anIntArrayArray23[local3][local10 + 1] == 0 && (local77[local3][local10 + 1] & 0x2C0120) == 0) {
				Static229.anIntArray419[local70] = local3;
				Static81.anIntArray123[local70] = local10 + 1;
				local70 = local70 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local3][local10 + 1] = 4;
				Static254.anIntArrayArray38[local3][local10 + 1] = local205;
			}
			if (local3 > 0 && local10 > 0 && Static173.anIntArrayArray23[local3 - 1][local10 - 1] == 0 && (local77[local3 - 1][local10 - 1] & 0x2C010E) == 0 && (local77[local3 - 1][local10] & 0x2C0108) == 0 && (local77[local3][local10 - 1] & 0x2C0102) == 0) {
				Static229.anIntArray419[local70] = local3 - 1;
				Static81.anIntArray123[local70] = local10 - 1;
				local70 = local70 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local3 - 1][local10 - 1] = 3;
				Static254.anIntArrayArray38[local3 - 1][local10 - 1] = local205;
			}
			if (local3 < 103 && local10 > 0 && Static173.anIntArrayArray23[local3 + 1][local10 - 1] == 0 && (local77[local3 + 1][local10 - 1] & 0x2C0183) == 0 && (local77[local3 + 1][local10] & 0x2C0180) == 0 && (local77[local3][local10 - 1] & 0x2C0102) == 0) {
				Static229.anIntArray419[local70] = local3 + 1;
				Static81.anIntArray123[local70] = local10 - 1;
				local70 = local70 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local3 + 1][local10 - 1] = 9;
				Static254.anIntArrayArray38[local3 + 1][local10 - 1] = local205;
			}
			if (local3 > 0 && local10 < 103 && Static173.anIntArrayArray23[local3 - 1][local10 + 1] == 0 && (local77[local3 - 1][local10 + 1] & 0x2C0138) == 0 && (local77[local3 - 1][local10] & 0x2C0108) == 0 && (local77[local3][local10 + 1] & 0x2C0120) == 0) {
				Static229.anIntArray419[local70] = local3 - 1;
				Static81.anIntArray123[local70] = local10 + 1;
				Static173.anIntArrayArray23[local3 - 1][local10 + 1] = 6;
				Static254.anIntArrayArray38[local3 - 1][local10 + 1] = local205;
				local70 = local70 + 1 & 0xFFF;
			}
			if (local3 < 103 && local10 < 103 && Static173.anIntArrayArray23[local3 + 1][local10 + 1] == 0 && (local77[local3 + 1][local10 + 1] & 0x2C01E0) == 0 && (local77[local3 + 1][local10] & 0x2C0180) == 0 && (local77[local3][local10 + 1] & 0x2C0120) == 0) {
				Static229.anIntArray419[local70] = local3 + 1;
				Static81.anIntArray123[local70] = local10 + 1;
				Static173.anIntArrayArray23[local3 + 1][local10 + 1] = 12;
				local70 = local70 + 1 & 0xFFF;
				Static254.anIntArrayArray38[local3 + 1][local10 + 1] = local205;
			}
		}
		if (!local53) {
			local205 = 1000;
			@Pc(840) int local840 = 100;
			for (@Pc(847) int local847 = arg2 - 10; local847 <= arg2 + 10; local847++) {
				for (@Pc(856) int local856 = arg4 - 10; local856 <= arg4 + 10; local856++) {
					if (local847 >= 0 && local856 >= 0 && local847 < 104 && local856 < 104 && Static254.anIntArrayArray38[local847][local856] < 100) {
						@Pc(887) int local887 = 0;
						@Pc(889) int local889 = 0;
						if (arg2 > local847) {
							local887 = arg2 - local847;
						} else if (local847 > arg5 + arg2 - 1) {
							local887 = local847 + 1 - arg5 - arg2;
						}
						if (local856 < arg4) {
							local889 = arg4 - local856;
						} else if (arg0 + arg4 - 1 < local856) {
							local889 = local856 + 1 - arg0 - arg4;
						}
						@Pc(955) int local955 = local887 * local887 + local889 * local889;
						if (local205 > local955 || local205 == local955 && local840 > Static254.anIntArrayArray38[local847][local856]) {
							local10 = local856;
							local205 = local955;
							local3 = local847;
							local840 = Static254.anIntArrayArray38[local847][local856];
						}
					}
				}
			}
			if (local205 == 1000) {
				return;
			}
			if (local3 == arg6 && local10 == arg8) {
				return;
			}
		}
		Static127.anInt2540 = local10;
		Static62.anInt1244 = local3;
		Static263.aBoolean357 = false;
	}
}
