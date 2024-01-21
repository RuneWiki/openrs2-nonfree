import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!ie;")
	public static Class35 aClass35_33;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_1482 = Static9.method266("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!id;")
	private static Class34 aClass34_1483 = Static9.method266("No reply from loginserver)3");

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1484 = aClass34_1483;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Lclient!ta;")
	public static Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	public static int anInt2890 = 0;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1485 = Static9.method266("<col=ffffff>");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method1922() {
		aClass71_1 = null;
		aClass35_33 = null;
		aClass34_1483 = null;
		aClass34_1484 = null;
		aClass34_1485 = null;
		aClass34_1482 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
	public static void method1923(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub7 local12 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray79.length; local17++) {
				local12.anIntArray79[local17] = -1;
				local12.anIntArray78[local17] = 0;
			}
		}
	}
}
