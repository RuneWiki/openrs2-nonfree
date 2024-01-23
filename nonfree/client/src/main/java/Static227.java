import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "Lclient!jd;")
	public static Class84 aClass84_104;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Lclient!u;")
	public static Class168 method3799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass168_1;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I")
	public static int method3801(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static83.method1594(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method3803() {
		Static11.aClass46_4.method1079();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZILclient!jd;Lclient!jd;)V")
	public static void method3806(@OriginalArg(2) Class84 arg0, @OriginalArg(3) Class84 arg1) {
		Static84.aBoolean59 = true;
		Static39.aClass84_17 = arg1;
		Static273.aClass84_117 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIZIIIIZ)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) int local8 = arg5 - arg6;
		@Pc(13) int local13 = arg8 - arg0;
		@Pc(22) int local22 = (arg2 - arg3 << 16) / local8;
		@Pc(31) int local31 = (arg7 - arg1 << 16) / local13;
		Static106.method1987(local31, arg6, arg3, arg8, local22, arg0, arg1, arg4, arg5);
	}
}
