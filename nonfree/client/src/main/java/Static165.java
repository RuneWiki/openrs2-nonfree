import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1343 = Static120.method2057("");

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1337 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1338 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1339 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1340 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1341 = Static120.method2057(" <col=ffffff>");

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1342 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1344 = aClass81_1343;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!tg;I)V")
	public static void method2888(@OriginalArg(0) Class81 arg0) {
		if (Static163.aClass1_Sub13Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method2821();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static163.aClass1_Sub13Array1.length && Static163.aClass1_Sub13Array1[local10].aLong148 != local14) {
			local10++;
		}
		if (Static163.aClass1_Sub13Array1.length > local10 && Static163.aClass1_Sub13Array1[local10] != null) {
			Static104.aClass1_Sub8_Sub1_2.method366(9);
			Static104.aClass1_Sub8_Sub1_2.method355(Static163.aClass1_Sub13Array1[local10].aLong148);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
	public static void method2890() {
		aClass81_1343 = null;
		aClass81_1338 = null;
		anIntArray392 = null;
		aClass81_1339 = null;
		aClass81_1344 = null;
		aClass81_1342 = null;
		aClass81_1337 = null;
		aClass81_1341 = null;
		aClass81_1340 = null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method2892() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static118.anInt2616 - 1; local17++) {
				if (Static49.aShortArray11[local17] < 1000 && Static49.aShortArray11[local17 + 1] > 1000) {
					@Pc(39) Class81 local39 = Static152.aClass81Array19[local17];
					Static152.aClass81Array19[local17] = Static152.aClass81Array19[local17 + 1];
					Static152.aClass81Array19[local17 + 1] = local39;
					@Pc(57) Class81 local57 = Static35.aClass81Array2[local17];
					local11 = false;
					Static35.aClass81Array2[local17] = Static35.aClass81Array2[local17 + 1];
					Static35.aClass81Array2[local17 + 1] = local57;
					@Pc(77) int local77 = Static144.anIntArray334[local17];
					Static144.anIntArray334[local17] = Static144.anIntArray334[local17 + 1];
					Static144.anIntArray334[local17 + 1] = local77;
					@Pc(95) int local95 = Static24.anIntArray35[local17];
					Static24.anIntArray35[local17] = Static24.anIntArray35[local17 + 1];
					Static24.anIntArray35[local17 + 1] = local95;
					@Pc(113) short local113 = Static49.aShortArray11[local17];
					Static49.aShortArray11[local17] = Static49.aShortArray11[local17 + 1];
					Static49.aShortArray11[local17 + 1] = local113;
					@Pc(131) long local131 = Static65.aLongArray1[local17];
					Static65.aLongArray1[local17] = Static65.aLongArray1[local17 + 1];
					Static65.aLongArray1[local17 + 1] = local131;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!rh;)I")
	public static int method2894(@OriginalArg(1) Class77 arg0) {
		@Pc(14) Class1_Sub9 local14 = (Class1_Sub9) Static180.aClass5_12.method134(((long) arg0.anInt3231 << 32) + ((long) arg0.anInt3189));
		return local14 == null ? arg0.anInt3207 : local14.anInt508;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIILclient!fb;Lclient!fb;IIIIJ)V")
	public static void method2898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(5) Class1_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class62 local6 = new Class62();
		local6.aLong94 = arg10;
		local6.anInt2634 = arg1 * 128 + 64;
		local6.anInt2631 = arg2 * 128 + 64;
		local6.anInt2629 = arg3;
		local6.aClass1_Sub2_Sub1_5 = arg4;
		local6.aClass1_Sub2_Sub1_6 = arg5;
		local6.anInt2635 = arg6;
		local6.anInt2632 = arg7;
		local6.anInt2637 = arg8;
		local6.anInt2636 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static167.aClass1_Sub17ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static167.aClass1_Sub17ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub17(local46, arg1, arg2);
			}
		}
		Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local6;
	}
}
