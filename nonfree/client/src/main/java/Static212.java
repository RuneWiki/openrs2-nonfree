import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "B")
	public static byte aByte14;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public static int anInt4120 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!lg;)Z")
	public static boolean method3322(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt3123 == 205) {
			Static268.anInt5350 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public static void method3323() {
		if (Static204.anInt4047 == 10 && Static251.aBoolean330) {
			Static123.method2035(28);
		}
		if (Static204.anInt4047 == 30) {
			Static123.method2035(25);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public static void method3324() {
		if (Static291.aClass48_1 != null) {
			@Pc(8) Class48 local8 = Static291.aClass48_1;
			synchronized (Static291.aClass48_1) {
				Static291.aClass48_1 = null;
			}
		}
	}
}
