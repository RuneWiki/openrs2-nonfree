import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	public static int anInt5026 = -1;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public static int anInt5033 = 16777215;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z[Lclient!f;)V")
	public static void method4199(@OriginalArg(1) Class39[] arg0) {
		Static16.anInt491 = arg0.length;
		Static126.aClass39Array14 = new Class39[Static16.anInt491 + 10];
		Static402.anIntArray482 = new int[Static16.anInt491 + 10];
		Static598.method1131(arg0, 0, Static126.aClass39Array14, 0, Static16.anInt491);
		for (@Pc(31) int local31 = 0; local31 < Static16.anInt491; local31++) {
			Static402.anIntArray482[local31] = Static126.aClass39Array14[local31].ca();
		}
		for (@Pc(46) int local46 = Static16.anInt491; local46 < Static126.aClass39Array14.length; local46++) {
			Static402.anIntArray482[local46] = 12;
		}
	}
}
