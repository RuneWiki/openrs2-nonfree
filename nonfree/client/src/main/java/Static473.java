import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!gu;")
	public static Class131 aClass131_2;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt8049;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_87 = new Class46(2, 1);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lclient!it;I)V")
	public static void method7014(@OriginalArg(0) Class28[] arg0) {
		Static471.anInt7942 = arg0.length;
		Static236.aClass28Array10 = new Class28[Static471.anInt7942 + 10];
		Static528.anIntArray500 = new int[Static471.anInt7942 + 10];
		Static652.method4545(arg0, 0, Static236.aClass28Array10, 0, Static471.anInt7942);
		for (@Pc(26) int local26 = 0; local26 < Static471.anInt7942; local26++) {
			Static528.anIntArray500[local26] = Static236.aClass28Array10[local26].method4042();
		}
		for (@Pc(41) int local41 = Static471.anInt7942; local41 < Static236.aClass28Array10.length; local41++) {
			Static528.anIntArray500[local41] = 12;
		}
	}
}
