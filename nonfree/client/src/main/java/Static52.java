import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt5632 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString337 = "Loading fonts - ";

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean380 = true;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
	public static boolean aBoolean381 = true;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public static void method4715() {
		if (Static278.method4290() || Static65.anInt1300 == Static43.anInt905) {
			Static115.method2066();
			if (Static49.anInt965 != Static65.anInt1300) {
				Static132.method3147();
			}
		} else {
			Static204.method3259(false, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], Static11.anInt171, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], Static129.anInt2589, false, Static65.anInt1300);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIZ)V")
	public static void method4717(@OriginalArg(3) int arg0, @OriginalArg(4) boolean arg1) {
		Static153.anInt3006 = 104;
		Static285.anInt5122 = 104;
		Static213.anInt4456 = arg0;
		Static153.aClass1_Sub33ArrayArrayArray3 = new Class1_Sub33[4][Static153.anInt3006][Static285.anInt5122];
		Static95.anIntArrayArrayArray5 = new int[4][Static153.anInt3006 + 1][Static285.anInt5122 + 1];
		if (Static156.aBoolean211) {
			Static297.aClass1_Sub31ArrayArray3 = new Class1_Sub31[4][];
		}
		if (arg1) {
			Static229.aClass1_Sub33ArrayArrayArray4 = new Class1_Sub33[1][Static153.anInt3006][Static285.anInt5122];
			Static41.anIntArrayArray5 = new int[Static153.anInt3006][Static285.anInt5122];
			Static257.anIntArrayArrayArray15 = new int[1][Static153.anInt3006 + 1][Static285.anInt5122 + 1];
			if (Static156.aBoolean211) {
				Static167.aClass1_Sub31ArrayArray2 = new Class1_Sub31[1][];
			}
		} else {
			Static229.aClass1_Sub33ArrayArrayArray4 = null;
			Static41.anIntArrayArray5 = null;
			Static257.anIntArrayArrayArray15 = null;
			Static167.aClass1_Sub31ArrayArray2 = null;
		}
		Static76.method1484(false);
		Static255.aClass91Array2 = new Class91[500];
		Static116.anInt2465 = 0;
		Static145.aClass91Array1 = new Class91[500];
		Static60.anInt1160 = 0;
		Static197.anIntArrayArrayArray11 = new int[4][Static153.anInt3006 + 1][Static285.anInt5122 + 1];
		Static220.aClass161Array1 = new Class161[5000];
		Static95.anInt1928 = 0;
		Static238.aClass161Array2 = new Class161[100];
		Static186.aBooleanArrayArray4 = new boolean[Static213.anInt4456 + Static213.anInt4456 + 1][Static213.anInt4456 + Static213.anInt4456 + 1];
		Static64.aBooleanArrayArray2 = new boolean[Static213.anInt4456 + Static213.anInt4456 + 2][Static213.anInt4456 + Static213.anInt4456 + 2];
		Static43.aByteArrayArrayArray1 = new byte[4][Static153.anInt3006][Static285.anInt5122];
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!nk;ILclient!nk;)V")
	public static void method4722(@OriginalArg(0) Class121 arg0, @OriginalArg(2) Class121 arg1) {
		Static11.aClass121_9 = arg0;
		Static301.aClass121_132 = arg1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIILclient!io;IZJ)Z")
	public static boolean method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class15 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static24.anIntArrayArrayArray2 == Static257.anIntArrayArrayArray15;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static153.anInt3006 || local17 >= Static285.anInt5122) {
					return false;
				}
				@Pc(42) Class1_Sub33 local42 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][local10][local17];
				if (local42 != null && local42.anInt5733 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class161 local58 = new Class161();
		local58.aLong171 = arg11;
		local58.anInt4646 = arg0;
		local58.anInt4640 = arg5;
		local58.anInt4645 = arg6;
		local58.anInt4638 = arg7;
		local58.aClass15_9 = arg8;
		local58.anInt4635 = arg9;
		local58.anInt4641 = arg1;
		local58.anInt4636 = arg2;
		local58.anInt4639 = arg1 + arg3 - 1;
		local58.anInt4637 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static105.aClass1_Sub33ArrayArrayArray2[local141][local17][local108] == null) {
						Static105.aClass1_Sub33ArrayArrayArray2[local141][local17][local108] = new Class1_Sub33(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub33 local174 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][local17][local108];
				local174.aClass161Array3[local174.anInt5733] = local58;
				local174.anIntArray508[local174.anInt5733] = local115;
				local174.anInt5735 |= local115;
				local174.anInt5733++;
				if (local6 && Static41.anIntArrayArray5[local17][local108] != 0) {
					local8 = Static41.anIntArrayArray5[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static41.anIntArrayArray5[local17][local108] == 0) {
						Static41.anIntArrayArray5[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static220.aClass161Array1[Static95.anInt1928++] = local58;
		}
		return true;
	}
}
