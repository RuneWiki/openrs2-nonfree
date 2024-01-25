import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_1 = new Class21("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!av", name = "d", descriptor = "[I")
	public static final int[] anIntArray23 = new int[25];

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	public static int anInt369 = 0;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V")
	public static void method306() {
		Static395.anInt6979 = Static296.aClass84_10.anInt2634 + Static296.aClass84_10.anInt2628 + 2;
		Static65.aStringArray8 = new String[500];
		Static332.anInt5914 = Static115.aClass84_4.anInt2634 + Static115.aClass84_4.anInt2628 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static65.aStringArray8.length; local26++) {
			Static65.aStringArray8[local26] = "";
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method307(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static10.method162("\n", arg0, "%0a"));
	}
}
