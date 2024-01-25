import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Lclient!s;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!sn;")
	public static Class211 aClass211_4;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "[S")
	public static short[] aShortArray86;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)Lclient!ms;")
	public static Class155 method3886(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static228.aClass155ArrayArray1[local12] == null || Static228.aClass155ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static138.method2407(local12);
			if (!local30) {
				return null;
			}
		}
		return Static228.aClass155ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!fc;Lclient!ln;Lclient!fc;Lclient!fc;B)Z")
	public static boolean method3888(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class2_Sub2_Sub3 arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class71 arg3) {
		Static172.aClass71_42 = arg0;
		Static222.aClass2_Sub2_Sub3_1 = arg1;
		Static165.aClass71_40 = arg3;
		Static345.aClass71_85 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lclient!of;")
	public static Class12_Sub5 method3889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass12_Sub5_2 == null ? null : local7.aClass12_Sub5_2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!lk;)Lclient!cl;")
	public static Class2_Sub6 method3890(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.method4240();
		@Pc(13) int local13 = arg0.method4240();
		@Pc(17) Class2_Sub6 local17 = Static227.method3778(local13);
		local17.anInt6584 = arg0.method4240();
		@Pc(26) int local26 = arg0.method4240();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method4240();
			local17.method5637(arg0, local34);
		}
		local17.method5639();
		return local17;
	}
}
