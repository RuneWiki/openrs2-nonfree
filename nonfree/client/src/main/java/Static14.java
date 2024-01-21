import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!ke;")
	public static Class52 aClass52_4;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!ke;")
	public static Class52 aClass52_5;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_137 = Static193.method3027("gelb:");

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "J")
	public static volatile long aLong12 = 0L;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_139 = Static193.method3027("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!oc;")
	public static Class70 aClass70_138 = aClass70_139;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_140 = Static193.method3027("Choose Option");

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!oc;")
	public static Class70 aClass70_141 = aClass70_139;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!oc;")
	public static Class70 aClass70_142 = aClass70_140;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_143 = Static193.method3027("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_144 = Static193.method3027("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	public static boolean method274() {
		return Static79.anInt1588 == 0 ? Static175.aClass3_Sub19_Sub2_2.method2854() : true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Lclient!ff;")
	public static Class3_Sub3_Sub11 method275(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub3_Sub11 local6 = (Class3_Sub3_Sub11) Static18.aClass85_1.method2558((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static27.aClass52_7.method1581(Static108.method1572(arg0), Static99.method1414(arg0));
		local6 = new Class3_Sub3_Sub11();
		local6.anInt1234 = arg0;
		if (local24 != null) {
			local6.method914(new Class3_Sub4(local24));
		}
		local6.method910();
		if (local6.anInt1261 != -1) {
			local6.method916(method275(local6.anInt1250), method275(local6.anInt1261));
		}
		if (local6.anInt1262 != -1) {
			local6.method908(method275(local6.anInt1262), method275(local6.anInt1222));
		}
		if (!Static123.aBoolean124 && local6.aBoolean72) {
			local6.aClass70Array25 = null;
			local6.aClass70_579 = Static10.aClass70_126;
			local6.anInt1265 = 0;
			local6.aClass70Array26 = null;
			local6.aBoolean73 = false;
		}
		Static18.aClass85_1.method2560(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	public static int method277(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)I")
	public static int method278(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
