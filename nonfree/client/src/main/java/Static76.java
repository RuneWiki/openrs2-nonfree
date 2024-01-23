import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!ak;")
	public static Class7 aClass7_76;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "[Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "[I")
	public static int[] anIntArray181 = new int[1000];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1295(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
	public static void method1296() {
		Static55.aClass31_10.method855();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
	public static void method1297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static24.anInt556 <= arg2 && arg2 <= Static284.anInt5643) {
			@Pc(21) int local21 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg0);
			@Pc(27) int local27 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1);
			Static155.method2389(local27, arg3, arg2, local21);
		}
	}
}
