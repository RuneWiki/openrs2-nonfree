import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "[[Lclient!ps;")
	public static Class163[][] aClass163ArrayArray1;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "[S")
	public static final short[] aShortArray103 = new short[] { 29, 7, 38, 9, 8, 37, 41, 35 };

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
	public static int anInt6232 = 0;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "[I")
	public static final int[] anIntArray626 = new int[5];

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "[Lclient!ba;")
	public static final Class17[] aClass17Array1 = new Class17[4];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBZIII)V")
	public static void method5366(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(47) int local47 = (Static30.aShort11 - Static291.aShort88) * local19 / 100 + Static291.aShort88;
		if (local47 < Static44.aShort26) {
			local47 = Static44.aShort26;
		} else if (local47 > Static75.aShort29) {
			local47 = Static75.aShort29;
		}
		@Pc(69) int local69 = arg3 * 512 * local47 / (arg0 * 334);
		@Pc(102) int local102;
		@Pc(109) int local109;
		@Pc(77) short local77;
		if (Static239.aShort58 > local69) {
			local77 = Static239.aShort58;
			local47 = arg0 * local77 * 334 / (arg3 * 512);
			if (local47 > Static75.aShort29) {
				local47 = Static75.aShort29;
				local102 = local47 * arg3 * 512 / (local77 * 334);
				local109 = (arg0 - local102) / 2;
				if (arg1) {
					Static217.aClass105_5.method4233();
					Static217.aClass105_5.method4225(arg3, -16777216, local109, arg4, arg2);
					Static217.aClass105_5.method4225(arg3, -16777216, local109, arg4 + arg0 - local109, arg2);
				}
				arg4 += local109;
				arg0 -= local109 * 2;
			}
		} else if (local69 > Static91.aShort35) {
			local77 = Static91.aShort35;
			local47 = arg0 * 334 * local77 / (arg3 * 512);
			if (local47 < Static44.aShort26) {
				local47 = Static44.aShort26;
				local102 = local77 * 334 * arg0 / (local47 * 512);
				local109 = (arg3 - local102) / 2;
				if (arg1) {
					Static217.aClass105_5.method4233();
					Static217.aClass105_5.method4225(local109, -16777216, arg0, arg4, arg2);
					Static217.aClass105_5.method4225(local109, -16777216, arg0, arg4, arg3 + arg2 - local109);
				}
				arg3 -= local109 * 2;
				arg2 += local109;
			}
		}
		Static19.anInt384 = local47 * arg3 / 334;
		Static6.anInt4144 = arg4;
		Static56.anInt1345 = arg2;
		Static1.anInt12 = (short) arg0;
		Static310.anInt6187 = (short) arg3;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method5367(@OriginalArg(1) int arg0) {
		Static145.anInt3035 = arg0;
		Static57.aClass37_27.method919();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public static void method5368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static347.aClass83ArrayArrayArray3[0][arg1][arg2] != null && Static347.aClass83ArrayArrayArray3[0][arg1][arg2].aClass83_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static347.aClass83ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class83 local46 = Static347.aClass83ArrayArrayArray3[local22][arg1][arg2] = new Class83(local22, arg1, arg2);
				if (local20) {
					local46.aByte27++;
				}
			}
		}
	}
}
