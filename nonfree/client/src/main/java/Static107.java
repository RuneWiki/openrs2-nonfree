import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	public static int anInt1669;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Lclient!th;")
	public static Class168 aClass168_56;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
	public static int anInt1674;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!mg;")
	public static Class108 aClass108_7 = new Class108();

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	public static int anInt1667 = -1;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public static void method1252() {
		Static42.method864((long) Static133.anInt3061);
		if (Static36.anInt902 != -1) {
			Static114.method1844(Static36.anInt902);
		}
		for (@Pc(18) int local18 = 0; local18 < Static203.anInt5700; local18++) {
			if (Static29.aBooleanArray6[local18]) {
				Static55.aBooleanArray15[local18] = true;
			}
			Static207.aBooleanArray22[local18] = Static29.aBooleanArray6[local18];
			Static29.aBooleanArray6[local18] = false;
		}
		Static9.anInt283 = Static133.anInt3061;
		if (Static294.aBoolean367) {
			Static182.aBoolean252 = true;
		}
		Static236.anInt1714 = -1;
		Static210.aClass191_9 = null;
		Static281.anInt2781 = -1;
		if (Static36.anInt902 != -1) {
			Static203.anInt5700 = 0;
			Static102.method728();
		}
		if (Static294.aBoolean367) {
			Static156.method2538();
		} else {
			Static231.method3632();
		}
		Static286.anInt5740 = 0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I")
	public static int method1256(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
