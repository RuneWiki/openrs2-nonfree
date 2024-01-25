import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt4418;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
	public static void method3422() {
		if (Static282.anInt5394 != 3) {
			Static156.aClass35_9 = Static142.aClass35_7;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	public static void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg2, 9);
		local8.method2957();
		local8.anInt3820 = arg1;
		local8.anInt3819 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ia;)Ljava/lang/String;")
	public static String method3425(@OriginalArg(1) Class1_Sub3 arg0) {
		return Static347.method4918(arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lclient!hc;")
	public static Class30_Sub3 method3426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub3_2;
	}
}
