import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!tq", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!tq", name = "wb", descriptor = "Lclient!f;")
	public static final Class69 aClass69_3 = new Class69();

	@OriginalMember(owner = "client!tq", name = "zb", descriptor = "Ljava/lang/String;")
	public static final String aString87 = "flash2:";

	@OriginalMember(owner = "client!tq", name = "Cb", descriptor = "Ljava/lang/String;")
	public static String aString88 = "flash2:";

	@OriginalMember(owner = "client!tq", name = "Db", descriptor = "I")
	public static int anInt2706 = 20;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IB)V")
	public static void method2397() {
		Static147.aClass154_51.method4220(5);
		Static35.aClass154_7.method4220(5);
	}

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "(B)V")
	public static void method2420() {
		for (@Pc(3) int local3 = 0; local3 < Static282.anInt5712; local3++) {
			@Pc(14) int local14 = Static332.anIntArray523[local3];
			@Pc(18) Class2_Sub2_Sub1_Sub2 local18 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local14];
			if (local18 != null) {
				Static145.method2848(local18, local18.aClass34_1.anInt842);
			}
		}
	}
}
