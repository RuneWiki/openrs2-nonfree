import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 aClass1_Sub1_Sub5_Sub2_4;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_920 = Static69.method1153("Nehmen");

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!uc;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!rd;")
	private static Class64 aClass64_923 = Static69.method1153("Connection lost");

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_921 = aClass64_923;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt1482 = -1;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt1483 = 0;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_922 = Static69.method1153("invback");

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public static int anInt1485 = -1;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public static int anInt1487 = 0;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public static int anInt1488 = 0;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[[[Lclient!md;")
	public static Class50[][][] aClass50ArrayArrayArray1 = new Class50[4][104][104];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method1097() {
		aClass64_923 = null;
		aClass64_920 = null;
		aClass64_921 = null;
		aClass50ArrayArrayArray1 = null;
		aClass1_Sub1_Sub5_Sub2_4 = null;
		aClass64_922 = null;
		anIntArray228 = null;
		aClass1_Sub6_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BII)I")
	public static int method1098(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static110.aClass58_8.method1380((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < local12.anIntArray384.length; local34++) {
				if (arg1 == local12.anIntArray385[local34]) {
					local32 += local12.anIntArray384[local34];
				}
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BZI)V")
	public static void method1099(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static79.aClass17_1 == null) {
			return;
		}
		if (Static28.anInt2362 >= 0) {
			arg3 -= 20;
			if (arg3 < 1) {
				arg3 = 1;
			}
			Static90.anInt560 = arg3;
			if (Static28.anInt2362 == 0) {
				Static105.anInt2464 = 0;
			} else {
				@Pc(53) int local53 = Static86.method1415(Static28.anInt2362);
				@Pc(57) int local57 = local53 - Static103.anInt2331;
				Static105.anInt2464 = (arg3 + local57 + 3600 - 1) / arg3;
			}
			Static15.anInt472 = arg0;
			Static53.aByteArray9 = arg1;
			Static17.aBoolean39 = arg2;
		} else if (Static90.anInt560 == 0) {
			Static51.method917(arg0, arg1, arg2);
		} else {
			Static53.aByteArray9 = arg1;
			Static17.aBoolean39 = arg2;
			Static15.anInt472 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
	public static void method1101(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static1.method35(arg0)) {
			return;
		}
		@Pc(18) Class1_Sub1_Sub11[] local18 = Static65.aClass1_Sub1_Sub11ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local18.length; local28++) {
			@Pc(34) Class1_Sub1_Sub11 local34 = local18[local28];
			if (local34.anObjectArray4 != null) {
				Static67.method1134(local34.anObjectArray4, 0, 0, 0, null, local34);
			}
		}
	}
}
