import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static73 {

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "Lclient!ug;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "[Lclient!nf;")
	public static Class256[] aClass256Array1;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "[I")
	public static final int[] anIntArray108 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	public static int anInt1302 = 0;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "[I")
	public static int[] anIntArray109 = new int[2];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)J")
	public static long method1140(@OriginalArg(1) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
	public static void method1141() {
		if (Static14.aByteArray1 != null) {
			Static330.method4580(Static690.anInt10620);
		} else if (Static233.anInt3710 == -1) {
			Static187.method2677(Static489.aString91, Static690.anInt10620, Static376.aString64);
		} else {
			Static243.method3433(Static690.anInt10620);
		}
	}
}
