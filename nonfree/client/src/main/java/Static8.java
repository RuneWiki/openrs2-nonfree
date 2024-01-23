import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	public static int anInt228;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Choose Option";

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	public static int anInt225 = -1;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	public static int anInt226 = 128;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!cm;)V")
	public static void method259(@OriginalArg(1) Class1_Sub4 arg0) {
		@Pc(9) int local9 = -1;
		@Pc(11) long local11 = 0L;
		@Pc(13) int local13 = 0;
		if (arg0.anInt907 == 0) {
			local11 = Static270.method4100(arg0.anInt908, arg0.anInt903, arg0.anInt917);
		}
		if (arg0.anInt907 == 1) {
			local11 = Static272.method4131(arg0.anInt908, arg0.anInt903, arg0.anInt917);
		}
		if (arg0.anInt907 == 2) {
			local11 = Static228.method3616(arg0.anInt908, arg0.anInt903, arg0.anInt917);
		}
		@Pc(53) int local53 = 0;
		if (arg0.anInt907 == 3) {
			local11 = Static163.method2577(arg0.anInt908, arg0.anInt903, arg0.anInt917);
		}
		if (local11 != 0L) {
			local53 = (int) local11 >> 20 & 0x3;
			local9 = (int) (local11 >>> 32) & Integer.MAX_VALUE;
			local13 = (int) local11 >> 14 & 0x1F;
		}
		arg0.anInt915 = local13;
		arg0.anInt911 = local53;
		arg0.anInt900 = local9;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIZII)V")
	public static void method260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static131.method2259(Static90.anInt2088, arg6, Static206.anInt4449);
		@Pc(17) int local17 = Static131.method2259(Static90.anInt2088, arg1, Static206.anInt4449);
		@Pc(23) int local23 = Static131.method2259(Static310.anInt6206, arg2, Static170.anInt3814);
		@Pc(29) int local29 = Static131.method2259(Static310.anInt6206, arg0, Static170.anInt3814);
		@Pc(37) int local37 = Static131.method2259(Static90.anInt2088, arg6 + arg4, Static206.anInt4449);
		@Pc(45) int local45 = Static131.method2259(Static90.anInt2088, arg1 - arg4, Static206.anInt4449);
		@Pc(47) int local47;
		for (local47 = local11; local47 < local37; local47++) {
			Static98.method3942(local29, Static121.anIntArrayArray33[local47], arg5, local23);
		}
		for (local47 = local17; local47 > local45; local47--) {
			Static98.method3942(local29, Static121.anIntArrayArray33[local47], arg5, local23);
		}
		@Pc(95) int local95 = Static131.method2259(Static310.anInt6206, arg2 + arg4, Static170.anInt3814);
		@Pc(103) int local103 = Static131.method2259(Static310.anInt6206, arg0 - arg4, Static170.anInt3814);
		for (local47 = local37; local47 <= local45; local47++) {
			@Pc(112) int[] local112 = Static121.anIntArrayArray33[local47];
			Static98.method3942(local95, local112, arg5, local23);
			Static98.method3942(local103, local112, arg3, local95);
			Static98.method3942(local29, local112, arg5, local103);
		}
	}
}
