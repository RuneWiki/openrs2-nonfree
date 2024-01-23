import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	public static int anInt5134;

	@OriginalMember(owner = "client!un", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!un", name = "cb", descriptor = "I")
	public static int anInt5147;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString185 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	public static int anInt5137 = 128;

	@OriginalMember(owner = "client!un", name = "V", descriptor = "[C")
	public static char[] aCharArray41 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!un", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString186 = "Walk here";

	@OriginalMember(owner = "client!un", name = "bb", descriptor = "I")
	public static int anInt5146 = 0;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	public static void method4098() {
		aString186 = null;
		aCharArray41 = null;
		aByteArrayArrayArray18 = null;
		aString185 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!cc;I)V")
	public static void method4099(@OriginalArg(0) Class22 arg0) {
		@Pc(15) Class22 local15 = Static74.method1125(arg0);
		@Pc(21) int local21;
		@Pc(19) int local19;
		if (local15 == null) {
			local19 = Static216.anInt4287;
			local21 = Static111.anInt2450;
		} else {
			local21 = local15.anInt546;
			local19 = local15.anInt602;
		}
		Static57.method923(false, local21, local19, arg0);
		Static140.method2282(arg0, local21, local19);
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
	public static void method4100() {
		if (Static219.aBoolean288) {
			Static22.aClass59_1 = null;
			Static219.aBoolean288 = false;
			Static222.aClass4_Sub2_Sub1_7 = null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!lc;BI)[Lclient!bi;")
	public static Class4_Sub2_Sub1[] method4101(@OriginalArg(1) Class98 arg0, @OriginalArg(3) int arg1) {
		return Static292.method4344(arg1, 0, arg0) ? Static160.method2503() : null;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)I")
	public static int method4102(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4103(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static301.method121(Static87.aClass164_2.anApplet1, "loggedout");
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				Static207.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static207.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(30) Exception local30) {
			}
			return;
		}
		if (Static178.aBoolean216 && Static269.aBoolean334) {
			try {
				Static301.method123(Static87.aClass164_2.anApplet1, new Object[] { (new URL(Static207.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, "openjs");
				return;
			} catch (@Pc(57) Throwable local57) {
			}
		}
		try {
			Static207.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static207.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(69) Exception local69) {
		}
	}
}
