import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_62 = new Class81(15, 3);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BIIIIZI)V")
	public static void method1971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static484.anInt8139 = arg3;
		Static490.anInt8280 = arg0;
		Static267.anInt5015 = arg5;
		Static69.anInt1590 = arg2;
		Static211.anInt4153 = arg1;
		if (arg4 && Static484.anInt8139 >= 100) {
			Static333.anInt5940 = Static69.anInt1590 * 512 + 256;
			Static216.anInt4203 = Static267.anInt5015 * 512 + 256;
			Static350.anInt6168 = Static122.method2103(Static240.anInt4595, Static333.anInt5940, Static216.anInt4203) - Static211.anInt4153;
		}
		Static585.anInt9461 = 2;
		Static282.anInt5182 = -1;
		Static394.anInt6810 = -1;
	}
}
