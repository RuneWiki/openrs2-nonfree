import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lclient!vd;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_2;

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "Lclient!sb;")
	public static Class25 aClass25_83;

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "Lclient!sd;")
	public static Class3_Sub1_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_905 = Static75.method1216("Connection timed out)3");

	@OriginalMember(owner = "client!nd", name = "gb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_906 = aClass4_905;

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "I")
	public static int anInt1710 = 0;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	public static int anInt1711 = 0;

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_907 = Static75.method1216("gleiten:");

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "Lclient!ad;")
	public static Class4 aClass4_908 = Static75.method1216("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!nd", name = "rb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_910 = Static75.method1216("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_909 = aClass4_910;

	@OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)I")
	public static int method1152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		return Static86.aClass3_Sub1_Sub16_1 != null && local10 == Static86.aClass3_Sub1_Sub16_1.aLong88 ? Static66.aClass3_Sub4_4.anInt627 * 99 / (Static66.aClass3_Sub4_4.aByteArray4.length - Static86.aClass3_Sub1_Sub16_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!ad;")
	public static Class4 method1153(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static93.method1632(arg0);
		} else if (arg0 < 10000000) {
			return Static60.method1012(new Class4[] { Static93.method1632(arg0 / 1000), Static70.aClass4_874 });
		} else {
			return Static60.method1012(new Class4[] { Static93.method1632(arg0 / 1000000), Static12.aClass4_185 });
		}
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method1155() {
		aClass4_909 = null;
		aClass4_910 = null;
		aClass4_905 = null;
		aClass3_Sub1_Sub4_Sub4_2 = null;
		aClass4_907 = null;
		aClass4_908 = null;
		aClass4_906 = null;
		aClass25_83 = null;
		aClass3_Sub1_Sub1_Sub1_Sub2_1 = null;
	}
}
