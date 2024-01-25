import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public static int anInt5769;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public static int anInt5767 = -1;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "Z")
	public static boolean aBoolean493 = false;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIB)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg2 * Static374.aClass20_Sub1_1.anInt2341 >> 8;
		if (local10 != 0 && arg1 != -1) {
			Static73.method1426(local10, arg1, Static280.aClass32_65);
			Static24.aBoolean64 = true;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIZI)V")
	public static void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static302.aClass3_Sub7_Sub1_2.method2636(arg2);
		Static302.aClass3_Sub7_Sub1_2.method2599(arg1);
		Static302.aClass3_Sub7_Sub1_2.method2599(arg0);
	}
}
