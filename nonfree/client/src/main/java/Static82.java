import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
	public static int anInt1484;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
	public static int anInt1485;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "Lclient!om;")
	public static final Class2_Sub32 aClass2_Sub32_1 = new Class2_Sub32(0, 0);

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
	public static void method1233() {
		if (Static155.aBoolean228) {
			return;
		}
		Static241.method3901(Static246.aClass251ArrayArrayArray3);
		if (Static232.aClass251ArrayArrayArray2 != null) {
			Static241.method3901(Static232.aClass251ArrayArrayArray2);
		}
		Static155.aBoolean228 = true;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!ae;I)V")
	public static void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2) {
		if (arg2.aByte3 == 0) {
			arg2.anInt48 = arg2.anInt100;
		} else if (arg2.aByte3 == 1) {
			arg2.anInt48 = arg2.anInt100 + (arg0 - arg2.anInt113) / 2;
		} else if (arg2.aByte3 == 2) {
			arg2.anInt48 = arg0 - arg2.anInt100 - arg2.anInt113;
		} else if (arg2.aByte3 == 3) {
			arg2.anInt48 = arg0 * arg2.anInt100 >> 14;
		} else if (arg2.aByte3 == 4) {
			arg2.anInt48 = (arg2.anInt100 * arg0 >> 14) + (arg0 - arg2.anInt113) / 2;
		} else {
			arg2.anInt48 = arg0 - arg2.anInt113 - (arg2.anInt100 * arg0 >> 14);
		}
		if (arg2.aByte4 == 0) {
			arg2.anInt71 = arg2.anInt91;
		} else if (arg2.aByte4 == 1) {
			arg2.anInt71 = (arg1 - arg2.anInt101) / 2 + arg2.anInt91;
		} else if (arg2.aByte4 == 2) {
			arg2.anInt71 = arg1 - arg2.anInt91 - arg2.anInt101;
		} else if (arg2.aByte4 == 3) {
			arg2.anInt71 = arg2.anInt91 * arg1 >> 14;
		} else if (arg2.aByte4 == 4) {
			arg2.anInt71 = (arg1 - arg2.anInt101) / 2 + (arg2.anInt91 * arg1 >> 14);
		} else {
			arg2.anInt71 = arg1 - arg2.anInt101 - (arg2.anInt91 * arg1 >> 14);
		}
		if (!Static226.aBoolean445 || Static45.method784(arg2).anInt750 == 0 && arg2.anInt125 != 0) {
			return;
		}
		if (arg2.anInt71 < 0) {
			arg2.anInt71 = 0;
		} else if (arg2.anInt71 + arg2.anInt101 > arg1) {
			arg2.anInt71 = arg1 - arg2.anInt101;
		}
		if (arg2.anInt48 < 0) {
			arg2.anInt48 = 0;
		} else if (arg2.anInt48 + arg2.anInt113 > arg0) {
			arg2.anInt48 = arg0 - arg2.anInt113;
			return;
		}
	}
}
