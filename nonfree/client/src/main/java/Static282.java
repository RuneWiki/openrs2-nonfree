import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!ak;")
	public static Class7 aClass7_238;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Lclient!si;")
	public static Class23 aClass23_33;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
	public static int anInt5852 = 5063219;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
	public static int[] anIntArray689 = new int[50];

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
	public static int anInt5854 = 0;

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
	public static int anInt5855 = 0;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
	public static int anInt5856 = 0;

	@OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
	public static int anInt5857 = 0;

	@OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
	public static boolean aBoolean446 = true;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILclient!og;)V")
	public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class127 arg2) {
		if (arg2.aByte19 == 0) {
			arg2.anInt3594 = arg2.anInt3562;
		} else if (arg2.aByte19 == 1) {
			arg2.anInt3594 = (arg1 - arg2.anInt3567) / 2 + arg2.anInt3562;
		} else if (arg2.aByte19 == 2) {
			arg2.anInt3594 = arg1 - arg2.anInt3562 - arg2.anInt3567;
		} else if (arg2.aByte19 == 3) {
			arg2.anInt3594 = arg2.anInt3562 * arg1 >> 14;
		} else if (arg2.aByte19 == 4) {
			arg2.anInt3594 = (arg1 - arg2.anInt3567) / 2 + (arg1 * arg2.anInt3562 >> 14);
		} else {
			arg2.anInt3594 = arg1 - (arg2.anInt3562 * arg1 >> 14) - arg2.anInt3567;
		}
		if (arg2.aByte16 == 0) {
			arg2.anInt3593 = arg2.anInt3568;
		} else if (arg2.aByte16 == 1) {
			arg2.anInt3593 = arg2.anInt3568 + (arg0 - arg2.anInt3595) / 2;
		} else if (arg2.aByte16 == 2) {
			arg2.anInt3593 = arg0 - arg2.anInt3568 - arg2.anInt3595;
		} else if (arg2.aByte16 == 3) {
			arg2.anInt3593 = arg0 * arg2.anInt3568 >> 14;
		} else if (arg2.aByte16 == 4) {
			arg2.anInt3593 = (arg0 - arg2.anInt3595) / 2 + (arg0 * arg2.anInt3568 >> 14);
		} else {
			arg2.anInt3593 = arg0 - (arg0 * arg2.anInt3568 >> 14) - arg2.anInt3595;
		}
		if (!Static26.aBoolean49 || Static43.method794(arg2).anInt5647 == 0 && arg2.anInt3570 != 0) {
			return;
		}
		if (arg2.anInt3593 < 0) {
			arg2.anInt3593 = 0;
		} else if (arg0 < arg2.anInt3595 + arg2.anInt3593) {
			arg2.anInt3593 = arg0 - arg2.anInt3595;
		}
		if (arg2.anInt3594 < 0) {
			arg2.anInt3594 = 0;
		} else if (arg1 < arg2.anInt3567 + arg2.anInt3594) {
			arg2.anInt3594 = arg1 - arg2.anInt3567;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIII)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static221.aLong143 = 0;
		@Pc(9) int local9 = Static136.method2157();
		if (arg0 == 3 || local9 == 3) {
			arg1 = true;
		}
		@Pc(21) boolean local21 = false;
		if (local9 > 0 == arg0 <= 0) {
			local21 = true;
		}
		if (Static127.aString79.startsWith("mac") && arg0 > 0) {
			arg1 = true;
		}
		if (arg1 && arg0 > 0) {
			local21 = true;
		}
		Static107.method1684(arg3, arg2, arg1, local21, local9, arg0);
	}
}
