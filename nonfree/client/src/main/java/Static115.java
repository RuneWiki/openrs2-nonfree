import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "Lclient!eh;")
	private static Class28 aClass28_952 = Static170.method3101("May");

	@OriginalMember(owner = "client!og", name = "L", descriptor = "Lclient!eh;")
	private static Class28 aClass28_953 = Static170.method3101("Feb");

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Lclient!eh;")
	private static Class28 aClass28_954 = Static170.method3101("Aug");

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!eh;")
	public static Class28 aClass28_955 = Static170.method3101("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!og", name = "O", descriptor = "Lclient!eh;")
	private static Class28 aClass28_956 = Static170.method3101("Mar");

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Lclient!eh;")
	private static Class28 aClass28_957 = Static170.method3101("Nov");

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!eh;")
	private static Class28 aClass28_958 = Static170.method3101("Sep");

	@OriginalMember(owner = "client!og", name = "V", descriptor = "Lclient!eh;")
	public static Class28 aClass28_959 = Static170.method3101(")1");

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "[Lclient!hh;")
	public static Class3_Sub2_Sub1_Sub2_Sub2[] aClass3_Sub2_Sub1_Sub2_Sub2Array1 = new Class3_Sub2_Sub1_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "[I")
	public static int[] anIntArray513 = new int[5];

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_960 = Static170.method3101("Oct");

	@OriginalMember(owner = "client!og", name = "hb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_961 = Static170.method3101("Jul");

	@OriginalMember(owner = "client!og", name = "jb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_962 = Static170.method3101("Dec");

	@OriginalMember(owner = "client!og", name = "mb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_963 = Static170.method3101("Jun");

	@OriginalMember(owner = "client!og", name = "ob", descriptor = "Lclient!eh;")
	private static Class28 aClass28_964 = Static170.method3101("Jan");

	@OriginalMember(owner = "client!og", name = "sb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_965 = Static170.method3101("Apr");

	@OriginalMember(owner = "client!og", name = "rb", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array18 = new Class28[] { aClass28_964, aClass28_953, aClass28_956, aClass28_965, aClass28_952, aClass28_963, aClass28_961, aClass28_954, aClass28_958, aClass28_960, aClass28_957, aClass28_962 };

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method2297() {
		anIntArray513 = null;
		aClass28_953 = null;
		aClass28_965 = null;
		aClass28_954 = null;
		aClass28_960 = null;
		aClass28_952 = null;
		aClass28_961 = null;
		aClass28_963 = null;
		aClass28_956 = null;
		aClass3_Sub2_Sub1_Sub2_Sub2Array1 = null;
		aClass28_955 = null;
		aClass28_962 = null;
		aClass28_964 = null;
		aClass28_959 = null;
		anIntArray514 = null;
		aClass28_957 = null;
		aClass28_958 = null;
		aClass28Array18 = null;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!eh;Lclient!eh;ZLclient!eh;)V")
	public static void method2299(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(4) Class28 arg3) {
		for (@Pc(10) int local10 = 99; local10 > 0; local10--) {
			Static59.anIntArray292[local10] = Static59.anIntArray292[local10 - 1];
			Static57.aClass28Array8[local10] = Static57.aClass28Array8[local10 - 1];
			Static175.aClass28Array23[local10] = Static175.aClass28Array23[local10 - 1];
			Static106.aClass28Array17[local10] = Static106.aClass28Array17[local10 - 1];
		}
		Static57.aClass28Array8[0] = arg1;
		Static125.anInt3216 = Static90.anInt2570;
		Static59.anIntArray292[0] = arg0;
		Static175.aClass28Array23[0] = arg2;
		Static106.aClass28Array17[0] = arg3;
		Static78.anInt2319++;
	}
}
