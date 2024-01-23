import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "Lclient!pe;")
	public static Class135 aClass135_6;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
	public static int anInt3778;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	public static int anInt3779;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	public static int anInt3774 = -1;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
	public static int anInt3777 = 0;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "[I")
	public static int[] anIntArray302 = new int[32];

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
	public static int anInt3781 = 0;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString187 = "Connected to update server";

	@OriginalMember(owner = "client!sl", name = "T", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII)V")
	public static void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) Class115 local4 = Static266.method4442(arg1, arg0);
		if (local4 != null && local4.anObjectArray25 != null) {
			@Pc(19) Class2_Sub6 local19 = new Class2_Sub6();
			local19.aClass115_4 = local4;
			local19.anObjectArray1 = local4.anObjectArray25;
			Static73.method1363(local19);
		}
		Static212.anInt4455 = arg4;
		Static297.anInt6213 = arg0;
		Static260.anInt5409 = arg5;
		Static133.aBoolean219 = true;
		Static112.anInt2421 = arg3;
		Static25.anInt5783 = arg1;
		Static251.anInt5008 = arg2;
		Static298.method4263(local4);
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)Lclient!u;")
	public static Class168 method3052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class168 local14 = local7.aClass168_1;
			local7.aClass168_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)J")
	public static long method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass168_1 == null ? 0L : local7.aClass168_1.aLong268;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static249.method3997(arg0)) {
			Static35.method704(Static219.aClass115ArrayArray1[arg0], -1, arg2, arg1, arg5, arg3, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIIIIIII)Z")
	public static boolean method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)V")
	public static void method3059() {
		Static11.aClass46_4.method1068(5);
	}
}
