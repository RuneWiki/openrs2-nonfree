import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "Lclient!nh;")
	public static Class62 aClass62_41;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1298 = Static177.method3050("Loading fonts )2 ");

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1299 = Static177.method3050("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1300 = Static177.method3050("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1301 = aClass46_1298;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array23 = new Class46[100];

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	public static int anInt3513 = 0;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1302 = Static177.method3050(" )2>");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIBI)I")
	public static int method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg2 & arg1 - 1;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg0 & arg1 - 1;
		@Pc(28) int local28 = Static68.method1477(local17, local7);
		@Pc(43) int local43 = Static68.method1477(local17, local7 + 1);
		@Pc(50) int local50 = Static68.method1477(local17 + 1, local7);
		@Pc(59) int local59 = Static68.method1477(local17 + 1, local7 + 1);
		@Pc(66) int local66 = Static114.method2094(local13, arg1, local43, local28);
		@Pc(73) int local73 = Static114.method2094(local13, arg1, local59, local50);
		return Static114.method2094(local23, arg1, local73, local66);
	}
}
