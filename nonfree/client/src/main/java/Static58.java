import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_477 = Static120.method2057("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_478 = Static120.method2057("Die Verbindung konnte");

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!tg;")
	private static Class81 aClass81_479 = Static120.method2057("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
	public static int[] anIntArray117 = new int[2000];

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!tg;")
	public static Class81 aClass81_480 = Static120.method2057("(U0a )2 via: ");

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!tg;")
	public static Class81 aClass81_481 = aClass81_479;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method1032() {
		aClass81_477 = null;
		anIntArray117 = null;
		aShortArrayArray2 = null;
		aClass81_478 = null;
		aClass81_479 = null;
		aClass81_480 = null;
		aClass81_481 = null;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Z")
	public static boolean method1033() {
		@Pc(5) Class14 local5 = Static43.aClass14_1;
		synchronized (Static43.aClass14_1) {
			if (Static56.anInt1352 == Static122.anInt2746) {
				return false;
			} else {
				Static3.anInt104 = Static103.anIntArray244[Static56.anInt1352];
				Static16.anInt311 = Static164.anIntArray390[Static56.anInt1352];
				Static56.anInt1352 = Static56.anInt1352 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[BB)I")
	public static int method1035(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static75.method1325(0, arg0, arg1);
	}
}
