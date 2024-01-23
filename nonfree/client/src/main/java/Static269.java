import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "[Lclient!qi;")
	public static Class81[] aClass81Array5;

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	public static int anInt5495;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
	public static int anInt5498;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public static int anInt5496 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
	public static void method4453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg1; local13 <= arg2; local13++) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[local13], arg3, arg4);
		}
	}
}
