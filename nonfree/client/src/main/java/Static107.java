import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
	public static int anInt2163 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)Z")
	public static boolean method1886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!o;I)V")
	public static void method1887(@OriginalArg(0) Class80[] arg0) {
		Static266.anInt4710 = arg0.length;
		Static56.anIntArray89 = new int[Static266.anInt4710 + 10];
		Static271.aClass80Array14 = new Class80[Static266.anInt4710 + 10];
		Static468.method4355(arg0, 0, Static271.aClass80Array14, 0, Static266.anInt4710);
		for (@Pc(26) int local26 = 0; local26 < Static266.anInt4710; local26++) {
			Static56.anIntArray89[local26] = Static271.aClass80Array14[local26].Q();
		}
		for (@Pc(50) int local50 = Static266.anInt4710; local50 < Static271.aClass80Array14.length; local50++) {
			Static56.anIntArray89[local50] = 12;
		}
	}
}
