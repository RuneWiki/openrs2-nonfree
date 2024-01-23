import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_33;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
	public static int anInt623 = 0;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString20 = "Loading sprites - ";

	@OriginalMember(owner = "client!bm", name = "K", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public static void method480(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static39.method717();
		} else if (arg0 == 2) {
			Static230.method3690();
		} else if (arg0 == 3) {
			Static124.method1917();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public static void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
		Static270.aClass1_Sub18_Sub1_3.method3093(20);
		Static270.aClass1_Sub18_Sub1_3.method3093(arg3);
		Static270.aClass1_Sub18_Sub1_3.method3093(arg1);
		Static270.aClass1_Sub18_Sub1_3.method3123(arg2);
		Static270.aClass1_Sub18_Sub1_3.method3123(arg0);
		Static205.anInt4083 = 0;
		Static109.anInt2050 = -3;
		Static176.anInt3258 = 1;
		Static280.anInt5602 = 0;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V")
	public static void method482() {
		Static77.aClass31_13.method855();
	}
}
