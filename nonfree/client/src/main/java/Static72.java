import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[[[[Z")
	public static boolean[][][][] aBooleanArrayArrayArrayArray1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_716 = Static177.method3050("Enter your username (V password)3");

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_719 = Static177.method3050("skill)2");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!jd;")
	public static Class46 aClass46_717 = aClass46_719;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_718 = Static177.method3050("; Max)2Age=");

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public static int anInt1865 = -1;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_720 = aClass46_716;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
	public static int method1495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class4_Sub16 local17 = (Class4_Sub16) Static25.aClass20_1.method505((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local17.anIntArray244.length) {
			return local17.anIntArray244[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
	public static boolean method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static147.anInt730; local1++) {
			@Pc(6) Class8 local6 = Static181.aClass8Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt367 == 1) {
				local15 = local6.anInt376 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt373 + (local6.anInt368 * local15 >> 8);
					local37 = local6.anInt366 + (local6.anInt372 * local15 >> 8);
					local47 = local6.anInt365 + (local6.anInt369 * local15 >> 8);
					local57 = local6.anInt379 + (local6.anInt374 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt367 == 2) {
				local15 = arg0 - local6.anInt376;
				if (local15 > 0) {
					local27 = local6.anInt373 + (local6.anInt368 * local15 >> 8);
					local37 = local6.anInt366 + (local6.anInt372 * local15 >> 8);
					local47 = local6.anInt365 + (local6.anInt369 * local15 >> 8);
					local57 = local6.anInt379 + (local6.anInt374 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt367 == 3) {
				local15 = local6.anInt373 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt376 + (local6.anInt370 * local15 >> 8);
					local37 = local6.anInt360 + (local6.anInt363 * local15 >> 8);
					local47 = local6.anInt365 + (local6.anInt369 * local15 >> 8);
					local57 = local6.anInt379 + (local6.anInt374 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt367 == 4) {
				local15 = arg2 - local6.anInt373;
				if (local15 > 0) {
					local27 = local6.anInt376 + (local6.anInt370 * local15 >> 8);
					local37 = local6.anInt360 + (local6.anInt363 * local15 >> 8);
					local47 = local6.anInt365 + (local6.anInt369 * local15 >> 8);
					local57 = local6.anInt379 + (local6.anInt374 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt367 == 5) {
				local15 = arg1 - local6.anInt365;
				if (local15 > 0) {
					local27 = local6.anInt376 + (local6.anInt370 * local15 >> 8);
					local37 = local6.anInt360 + (local6.anInt363 * local15 >> 8);
					local47 = local6.anInt373 + (local6.anInt368 * local15 >> 8);
					local57 = local6.anInt366 + (local6.anInt372 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Z")
	public static boolean method1497(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method1499(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static106.aBoolean114) {
			Static50.method953();
		} else if (arg0 != -1 && (arg0 != Static104.anInt2619 || !Static86.method1710()) && Static135.anInt3218 != 0 && !Static106.aBoolean114) {
			Static90.method1800(Static73.aClass62_Sub1_47, arg0, Static135.anInt3218);
		}
		Static104.anInt2619 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass65_1 = null;
		}
	}
}
