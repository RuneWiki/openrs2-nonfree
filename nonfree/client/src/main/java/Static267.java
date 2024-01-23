import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!u", name = "xc", descriptor = "Lclient!fl;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!u", name = "yc", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = new String[] { "en", "de", "fr", "pt" };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I")
	public static int method4228(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static301.method4630(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)V")
	public static void method4229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class97 local8 = Static77.method1320(arg5, arg1);
		if (local8 != null && local8.anObjectArray16 != null) {
			@Pc(18) Class4_Sub23 local18 = new Class4_Sub23();
			local18.anObjectArray32 = local8.anObjectArray16;
			local18.aClass97_15 = local8;
			Static145.method4497(local18);
		}
		Static221.anInt4243 = arg3;
		Static43.anInt871 = arg2;
		Static60.anInt1341 = arg0;
		Static145.aBoolean386 = true;
		Static282.anInt5536 = arg4;
		Static109.anInt2178 = arg5;
		Static144.anInt2858 = arg1;
		Static178.method2927(local8);
	}
}
