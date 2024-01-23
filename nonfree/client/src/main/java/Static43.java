import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public static int anInt925;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!ee;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_326 = Static186.method3527("b12_full");

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public static int anInt929 = 0;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!hh;")
	private static Class50 aClass50_327 = Static186.method3527("FULL");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!hh;")
	public static Class50 aClass50_328 = aClass50_327;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public static int method678(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
	public static int method680(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
	public static void method681(@OriginalArg(1) int arg0) {
		Static95.anInt1938 = -1;
		Static44.anInt939 = -1;
		Static4.anInt87 = arg0;
		Static107.method1639();
	}
}
