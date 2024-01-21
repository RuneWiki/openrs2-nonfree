import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
	public static int anInt2610;

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_66;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "Lclient!wb;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_5 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1268 = Static108.method1915("Players");

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1269 = Static108.method1915(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!rc", name = "zb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1279 = Static108.method1915("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1270 = aClass39_1279;

	@OriginalMember(owner = "client!rc", name = "vb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1276 = Static108.method1915("Enter name of friend to add to list");

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1271 = aClass39_1276;

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1272 = Static108.method1915("Mitglieder)2Welt");

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1273 = null;

	@OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1274 = aClass39_1268;

	@OriginalMember(owner = "client!rc", name = "tb", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1278 = Static108.method1915("Select a world");

	@OriginalMember(owner = "client!rc", name = "ub", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1275 = aClass39_1278;

	@OriginalMember(owner = "client!rc", name = "wb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1277 = Static108.method1915("headicons_hint");

	@OriginalMember(owner = "client!rc", name = "Ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1280 = Static108.method1915("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIB)I")
	public static int method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		return Static72.aClass1_Sub1_Sub15_1 != null && Static72.aClass1_Sub1_Sub15_1.aLong98 == local10 ? Static59.aClass1_Sub18_1.anInt3078 * 99 / (Static59.aClass1_Sub18_1.aByteArray96.length - Static72.aClass1_Sub1_Sub15_1.aByte5) + 1 : 0;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Z")
	public static boolean method1839() {
		return Static25.anInt837 == 0 ? Static76.aClass1_Sub8_Sub4_2.method1758() : true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kd;Lclient!qc;I)I")
	public static int method1842(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		@Pc(6) int local6 = arg1.anInt3078;
		arg1.method2181(arg0.anInt1707);
		arg1.anInt3078 += Static50.aClass68_1.method1942(arg0.anInt1707, arg0.aByteArray50, arg1.aByteArray96, 0, arg1.anInt3078);
		return arg1.anInt3078 - local6;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public static void method1843() {
		aClass39_1280 = null;
		aClass39_1279 = null;
		aClass39_1278 = null;
		aClass39_1273 = null;
		aClass1_Sub18_Sub1_5 = null;
		aClass39_1277 = null;
		aClass39_1272 = null;
		aClass39_1271 = null;
		aClass39_1275 = null;
		aClass39_1269 = null;
		aClass62_Sub1_66 = null;
		aClass39_1274 = null;
		aClass39_1276 = null;
		aClass39_1268 = null;
		aClass39_1270 = null;
	}
}
