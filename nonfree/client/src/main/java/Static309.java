import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public static int anInt5336;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public static final int anInt5334 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!uq;II)Ljava/lang/String;")
	public static String method4390(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1) {
		if (!Static57.method1248(arg0).method1734(arg1) && arg0.anObjectArray24 == null) {
			return null;
		} else if (arg0.aStringArray42 == null || arg0.aStringArray42.length <= arg1 || arg0.aStringArray42[arg1] == null || arg0.aStringArray42[arg1].trim().length() == 0) {
			return Static313.aBoolean387 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray42[arg1];
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Lclient!sr;")
	public static Class31_Sub4 method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass31_Sub4_1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIB)V")
	public static void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) Class1_Sub2_Sub6 local17 = Static371.method5808(4, arg0);
		local17.method1778();
		local17.anInt2056 = arg1;
		local17.anInt2059 = arg3;
		local17.anInt2055 = arg2;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([BB)[B")
	public static byte[] method4393(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static468.method4329(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
