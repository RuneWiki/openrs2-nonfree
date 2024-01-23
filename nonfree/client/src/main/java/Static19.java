import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public static int anInt461 = -1;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Loading - please wait.";

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString13 = "Loaded sprites";

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public static int anInt463 = 0;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
	public static volatile long aLong31 = 0L;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ch;IIIIIZI)V")
	public static void method383(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg4 & 0x3;
		@Pc(25) int local25;
		@Pc(22) int local22;
		if (local9 == 1 || local9 == 3) {
			local22 = arg1.anInt848;
			local25 = arg1.anInt863;
		} else {
			local22 = arg1.anInt863;
			local25 = arg1.anInt848;
		}
		@Pc(47) int local47;
		@Pc(56) int local56;
		if (arg5 + local25 <= 104) {
			local47 = (local25 >> 1) + arg5;
			local56 = arg5 + (local25 + 1 >> 1);
		} else {
			local47 = arg5;
			local56 = arg5 + 1;
		}
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (arg0 + local22 <= 104) {
			local76 = (local22 >> 1) + arg0;
			local84 = (local22 + 1 >> 1) + arg0;
		} else {
			local76 = arg0;
			local84 = arg0 + 1;
		}
		@Pc(100) int local100 = (local25 << 6) + (arg5 << 7);
		@Pc(108) int local108 = (local22 << 6) + (arg0 << 7);
		@Pc(112) int[][] local112 = Static287.anIntArrayArrayArray18[arg2];
		@Pc(138) int local138 = local112[local56][local84] + local112[local47][local84] + local112[local56][local76] + local112[local47][local76] >> 2;
		@Pc(140) int local140 = 0;
		@Pc(147) int[][] local147;
		if (arg2 != 0) {
			local147 = Static287.anIntArrayArrayArray18[0];
			local140 = local138 - (local147[local47][local76] + local147[local56][local76] + local147[local47][local84] + local147[local56][local84] >> 2);
		}
		local147 = null;
		if (arg2 < 3) {
			local147 = Static287.anIntArrayArrayArray18[arg2 + 1];
		}
		@Pc(204) Class98 local204 = arg1.method682(null, local112, local147, arg4, local108, false, local100, local138, true, arg3);
		Static124.method2111(local204.aClass7_Sub1_3, local100 - arg7, local140, local108 - arg6);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!kb;I)Z")
	public static boolean method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		@Pc(9) byte[] local9 = arg2.method2306(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static41.method916(local9);
			return true;
		}
	}
}
