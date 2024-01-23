import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(III)Lclient!oe;")
	public static Class124 method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass124_1 == null ? null : local7.aClass124_1;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(III)V")
	public static void method660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(12, arg1);
		local8.method4062();
		local8.anInt4863 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIII)V")
	public static void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
		Static116.aClass1_Sub13_Sub1_48.method1822(20);
		Static116.aClass1_Sub13_Sub1_48.method1822(arg3);
		Static116.aClass1_Sub13_Sub1_48.method1822(arg0);
		Static116.aClass1_Sub13_Sub1_48.method1835(arg2);
		Static116.aClass1_Sub13_Sub1_48.method1835(arg1);
		Static145.anInt2812 = 0;
		Static104.anInt2212 = -3;
		Static74.anInt1611 = 1;
		Static56.anInt1210 = 0;
	}
}
