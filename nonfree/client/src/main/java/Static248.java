import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt4999;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!bi;")
	public static Class3_Sub4_Sub2 aClass3_Sub4_Sub2_11;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!l;")
	public static Class98 aClass98_39 = new Class98(30);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method4170(@OriginalArg(0) Class155 arg0) {
		Static51.aClass155_28 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method4171(@OriginalArg(1) int arg0) {
		@Pc(29) byte[] local29;
		if (arg0 == 100 && Static245.anInt6025 > 0) {
			local29 = Static268.aByteArrayArray116[--Static245.anInt6025];
			Static268.aByteArrayArray116[Static245.anInt6025] = null;
			return local29;
		} else if (arg0 == 5000 && Static3.anInt60 > 0) {
			local29 = Static190.aByteArrayArray85[--Static3.anInt60];
			Static190.aByteArrayArray85[Static3.anInt60] = null;
			return local29;
		} else if (arg0 == 30000 && Static113.anInt2097 > 0) {
			local29 = Static26.aByteArrayArray12[--Static113.anInt2097];
			Static26.aByteArrayArray12[Static113.anInt2097] = null;
			return local29;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4172(@OriginalArg(1) String arg0) {
		Static62.aString50 = arg0;
		if (Static274.aClass176_4.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static274.aClass176_4.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static274.aClass176_4.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static87.method3725(Static128.method2196() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static325.method4168(Static274.aClass176_4.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(94) Throwable local94) {
		}
	}
}
