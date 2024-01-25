import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;IIIBIII)V")
	public static void method1916(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class38_Sub8 local12 = new Class38_Sub8();
		local12.anInt6402 = arg1;
		local12.anInt6395 = arg5;
		local12.aString54 = arg0;
		local12.anInt6394 = arg2;
		local12.anInt6403 = arg3;
		local12.anInt6399 = arg4;
		local12.anInt6397 = arg6 + Static164.anInt3206;
		Static316.aClass184_4.method4207(local12);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	public static void method1917() {
		@Pc(9) int[] local9 = new int[Static350.aClass149_2.anInt4314];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static350.aClass149_2.anInt4314; local18++) {
			@Pc(25) Class30 local25 = Static350.aClass149_2.method3483(local18);
			if (local25.anInt1029 >= 0 || local25.anInt1008 >= 0) {
				local9[local16++] = local18;
			}
		}
		Static15.anIntArray25 = new int[local16];
		for (@Pc(50) int local50 = 0; local50 < local16; local50++) {
			Static15.anIntArray25[local50] = local9[local50];
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method1918() {
		@Pc(5) Class129 local5 = Static88.aClass129_14;
		synchronized (Static88.aClass129_14) {
			Static88.aClass129_14.method3026();
		}
	}
}
