import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static293 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!hd;IBI)V")
	public static void method3830(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static11.aClass110_1 != null || Static339.aBoolean390 || (arg0 == null || Static318.method4139(arg0) == null)) {
			return;
		}
		Static11.aClass110_1 = arg0;
		Static216.aClass110_9 = Static318.method4139(arg0);
		Static285.anInt4687 = 0;
		Static188.aBoolean268 = false;
		Static337.anInt5501 = arg2;
		Static204.anInt3612 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)Z")
	public static boolean method3831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static127.method1766(arg0, arg1) | Static150.method2110(arg0, arg1) | Static295.method3842(arg1, arg0)) & Static356.method4709(arg0, arg1);
	}
}
