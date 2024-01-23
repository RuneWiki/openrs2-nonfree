import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!bi;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
	public static int anInt4169 = 7759444;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
	public static int[] anIntArray363 = new int[25];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int anInt4171 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIII)V")
	public static void method3052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static131.method2259(Static90.anInt2088, arg3, Static206.anInt4449);
		@Pc(17) int local17 = Static131.method2259(Static90.anInt2088, arg0, Static206.anInt4449);
		@Pc(23) int local23 = Static131.method2259(Static310.anInt6206, arg1, Static170.anInt3814);
		@Pc(29) int local29 = Static131.method2259(Static310.anInt6206, arg2, Static170.anInt3814);
		for (@Pc(37) int local37 = local11; local37 <= local17; local37++) {
			Static98.method3942(local29, Static121.anIntArrayArray33[local37], arg4, local23);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub20 local7 = new Class1_Sub20();
		local7.anInt4116 = arg7;
		local7.anInt4128 = arg10;
		local7.anInt4129 = arg3;
		local7.anInt4122 = arg2;
		local7.anInt4114 = arg1;
		local7.anInt4125 = arg9;
		local7.anInt4117 = arg0;
		local7.anInt4115 = arg8;
		local7.anInt4113 = arg5;
		local7.anInt4127 = arg6;
		local7.anInt4123 = arg4;
		local7.anInt4118 = arg11;
		Static286.aClass26_55.method668(local7);
	}
}
