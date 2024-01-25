import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_195 = new Class131(52, 8);

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
	public static int anInt7834 = -1;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	public static int anInt7839 = -1;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "[I")
	public static final int[] anIntArray689 = new int[1000];

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "I")
	public static int anInt7840 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)Lclient!e;")
	public static Class61 method6078(@OriginalArg(1) int arg0) {
		@Pc(10) Class61 local10 = (Class61) Static71.aClass83_61.method1658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static150.aClass250_28.method5667(arg0, 1);
		local10 = new Class61();
		local10.anInt1632 = arg0;
		if (local20 != null) {
			local10.method1409(new Class1_Sub1(local20));
		}
		local10.method1405();
		if (local10.anInt1619 == 2 && Static261.aClass27_43.method553((long) arg0) == null) {
			Static261.aClass27_43.method564((long) arg0, new Class1_Sub13(Static88.anInt1726));
			Static325.aClass61Array1[Static88.anInt1726++] = local10;
		}
		Static71.aClass83_61.method1675((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)[Lclient!of;")
	public static Class176[] method6082() {
		return new Class176[] { Static234.aClass176_7, Static132.aClass176_4, Static359.aClass176_8, Static212.aClass176_2, Static224.aClass176_6, Static42.aClass176_3 };
	}
}
