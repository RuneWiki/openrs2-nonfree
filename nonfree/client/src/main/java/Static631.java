import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static631 {

	@OriginalMember(owner = "client!vga", name = "n", descriptor = "Lclient!pu;")
	public static Class50 aClass50_36;

	@OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
	public static int anInt10279 = 64;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIIII)V")
	public static void method8508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static284.anInt5429 = arg5;
		Static285.anInt5539 = arg3;
		Static137.anInt2688 = arg0;
		Static20.anInt303 = arg4;
		Static386.anInt6900 = arg1;
		Static314.anInt5970 = arg2;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(CB)I")
	public static int method8510(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class252.anIntArray602.length ? Class252.anIntArray602[arg0] : -1;
	}
}
