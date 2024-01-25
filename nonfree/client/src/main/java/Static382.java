import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!wj", name = "N", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array14;

	@OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!wj", name = "U", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array15;

	@OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
	public static final int[] anIntArray1343 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLclient!ae;)V")
	public static void method5602(@OriginalArg(1) Class4 arg0) {
		if (arg0.anInt125 == 5 && arg0.anInt58 != -1) {
			Static98.method1941(Static111.aClass63_3, arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
	public static void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub2_2 != null) {
			local7.aClass1_Sub2_2 = null;
		}
		if (local7.aClass1_Sub2_3 != null) {
			local7.aClass1_Sub2_3 = null;
		}
	}
}
