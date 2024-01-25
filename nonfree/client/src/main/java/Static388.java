import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!aa;")
	public static Class2 aClass2_25;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	public static int anInt4888 = 0;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_66 = new Class212(31, 3);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([Lclient!aa;B)V")
	public static void method4148(@OriginalArg(0) Class2[] arg0) {
		Static467.anInt8015 = arg0.length;
		Static104.anIntArray195 = new int[Static467.anInt8015 + 10];
		Static171.aClass2Array26 = new Class2[Static467.anInt8015 + 10];
		Static474.method3329(arg0, 0, Static171.aClass2Array26, 0, Static467.anInt8015);
		for (@Pc(32) int local32 = 0; local32 < Static467.anInt8015; local32++) {
			Static104.anIntArray195[local32] = Static171.aClass2Array26[local32].ga();
		}
		for (@Pc(51) int local51 = Static467.anInt8015; local51 < Static171.aClass2Array26.length; local51++) {
			Static104.anIntArray195[local51] = 12;
		}
	}
}
