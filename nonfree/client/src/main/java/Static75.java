import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public static int anInt1919 = 0;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	public static int anInt1921 = 2;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lclient!sb;")
	public static Class3_Sub6_Sub1 aClass3_Sub6_Sub1_2 = new Class3_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
	public static int anInt1934 = 0;

	@OriginalMember(owner = "client!ne", name = "ob", descriptor = "Lclient!ae;")
	public static Class5 aClass5_890 = Static56.method972("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
	public static int anInt1936 = 1;

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_19 = new Class9(64);

	@OriginalMember(owner = "client!ne", name = "tb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_892 = Static56.method972("Create a free account");

	@OriginalMember(owner = "client!ne", name = "sb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_891 = aClass5_892;

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "[I")
	public static int[] anIntArray223 = new int[128];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
	public static int method1252() {
		return Static53.anInt1405++;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method1257() {
		anIntArray223 = null;
		aClass5_890 = null;
		aClass5_891 = null;
		aClass5_892 = null;
		aClass9_19 = null;
		aClass3_Sub6_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lclient!ae;I)Lclient!ae;")
	public static Class5 method1261(@OriginalArg(0) Class5[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static83.method1325(arg0.length, arg0, 0);
	}
}
