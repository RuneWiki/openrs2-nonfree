import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!id;")
	public static Class43 aClass43_18 = new Class43(128);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1012 = Static184.method2923("");

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_1013 = Static184.method2923("::autoshadow off");

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_1014 = Static184.method2923("mapfunction");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!i;")
	private static Class41 aClass41_1016 = Static184.method2923(" is already on your friend list)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_1015 = aClass41_1016;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!i;BLclient!nb;Lclient!i;)[Lclient!lj;")
	public static Class60[] method2633(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(13) int local13 = arg1.method414(arg0);
		@Pc(19) int local19 = arg1.method416(arg2, local13);
		return Static168.method2709(local13, arg1, local19);
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method2636() {
		Static28.aClass2_Sub6_Sub3_1.method2467();
		Static143.aClass15_31 = null;
		Static108.anInt2618 = 1;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
	public static void method2637() {
		Static209.aClass43_24.method1469();
	}
}
