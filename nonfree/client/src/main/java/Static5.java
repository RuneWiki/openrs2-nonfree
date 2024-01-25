import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt133;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lclient!bl;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!am;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public static int anInt152;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public static int anInt138 = -50;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public static int anInt153 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lclient!nk;")
	public static Class2_Sub5 method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass2_Sub5_1 == null ? null : local7.aClass2_Sub5_1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static107.method5706(arg4, arg2, arg1, arg0, arg3, -1, null);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZFIIBIII)[I")
	public static int[] method215(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub4_Sub23 local10 = new Class4_Sub4_Sub23();
		local10.anInt4293 = (int) (arg0 * 4096.0F);
		local10.anInt4297 = 8;
		local10.aBoolean357 = true;
		local10.anInt4292 = 4;
		local10.anInt4294 = 8;
		local10.anInt4290 = 35;
		local10.method5392();
		Static39.method744(2048, 1);
		local10.method3614(local6, 0);
		return local6;
	}
}
