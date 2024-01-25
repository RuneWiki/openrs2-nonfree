import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!rd;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	public static int anInt8870;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!gh;")
	public static Class106 aClass106_9;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Z")
	public static boolean aBoolean661 = false;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	public static int anInt8869 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILclient!mf;Lclient!mf;)V")
	public static void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub4 arg3, @OriginalArg(4) Class6_Sub4 arg4) {
		@Pc(4) Class290 local4 = Static326.method5207(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub4_3 = arg3;
			local4.aClass6_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 != null && local7.aClass6_Sub3_2 != null) {
			local7.aClass6_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IFLclient!qp;FIZIFIFF)[B")
	public static byte[] method7294(@OriginalArg(1) float arg0, @OriginalArg(2) Class248 arg1, @OriginalArg(3) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static17.method3536(arg4, arg2, arg3, arg5, arg0, arg1, 0, local10);
		return local10;
	}
}
