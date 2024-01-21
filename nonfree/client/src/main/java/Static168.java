import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
	public static int anInt3719;

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1339 = Static65.method1172(":duelfriend:");

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	public static final int anInt3716 = 0;

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!uh", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1340 = Static65.method1172(":assist:");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!kb;ILclient!kb;)V")
	public static void method2686(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(3) Class46 arg2) {
		Static177.method2830(arg0, arg1, arg2, null);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public static void method2687() {
		aClass46_1339 = null;
		aBooleanArray19 = null;
		aClass46_1340 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V")
	public static void method2688(@OriginalArg(0) int arg0) {
		if (Static57.method1063(arg0)) {
			Static89.method1479(Static26.aClass33ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIII)I")
	public static int method2689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg0 & 0x7F;
		@Pc(39) int local39 = arg1 & 0x7F;
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && (Static119.aByteArrayArrayArray5[1][local7][local11] & 0x2) == 2) {
			local41 = arg2 + 1;
		}
		@Pc(86) int local86 = (128 - local39) * Static133.anIntArrayArrayArray8[local41][local7][local11] + local39 * Static133.anIntArrayArrayArray8[local41][local7 + 1][local11] >> 7;
		@Pc(117) int local117 = local39 * Static133.anIntArrayArrayArray8[local41][local7 + 1][local11 + 1] + (128 - local39) * Static133.anIntArrayArrayArray8[local41][local7][local11 - -1] >> 7;
		return local35 * local117 + local86 * (128 - local35) >> 7;
	}
}
