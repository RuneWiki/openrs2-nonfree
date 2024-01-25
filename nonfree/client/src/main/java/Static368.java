import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!si", name = "i", descriptor = "I")
	public static int anInt6729;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	public static final int[] anIntArray619 = new int[4096];

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public static int anInt6726 = 0;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)Lclient!ir;")
	public static Class120 method5121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class120 local7 = new Class120();
		local7.anInt3918 = -1;
		local7.anInt3915 = -1;
		local7.anInt3932 = arg1 + 5 + 1;
		local7.anInt3910 = arg0 + 1 + 5;
		local7.anIntArrayArray35 = new int[local7.anInt3910][local7.anInt3932];
		local7.method3044();
		return local7;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z")
	public static boolean method5124(@OriginalArg(0) int arg0) {
		Static363.aBoolean422 = true;
		Static20.anInt524 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
	public static int method5127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(22) int local22 = 255 - local7;
		@Pc(40) int local40 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | (arg0 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00) * local22 & 0xFF0000 | local22 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local40;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
	public static void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static363.anInt6666 = arg1;
		Static195.anInt4072 = arg2;
		Static41.anInt1051 = arg4;
		Static325.anInt6023 = arg3;
		Static64.anInt1733 = arg0;
		if (Static64.anInt1733 >= 100) {
			@Pc(28) int local28 = Static325.anInt6023 * 128 + 64;
			@Pc(34) int local34 = Static41.anInt1051 * 128 + 64;
			@Pc(43) int local43 = Static227.method3475(local28, local34, Static426.anInt1486) - Static195.anInt4072;
			@Pc(48) int local48 = local28 - Static378.anInt6885;
			@Pc(53) int local53 = local43 - Static107.anInt2426;
			@Pc(58) int local58 = local34 - Static78.anInt1973;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static217.anInt4351 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static147.anInt3170 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			if (Static217.anInt4351 < 1024) {
				Static217.anInt4351 = 1024;
			}
			Static403.anInt7268 = 0;
			if (Static217.anInt4351 > 3072) {
				Static217.anInt4351 = 3072;
			}
		}
		Static21.anInt6762 = 2;
	}
}
