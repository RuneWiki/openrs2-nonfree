import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "F")
	public static float aFloat319 = 0.0F;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[I")
	public static int[] anIntArray575 = new int[1];

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public static int anInt7581 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!gp;IIZ)V")
	public static void method6150(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		Static289.anInt5853 = arg0;
		Static456.anInt7875 = 10000;
		Static431.aBoolean537 = false;
		Static332.anInt6296 = 1;
		Static296.anInt5926 = arg2;
		Static409.aClass117_173 = arg1;
		Static235.anInt4584 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I")
	public static int method6151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static60.aByteArrayArray48 == null ? 0 : Static60.aByteArrayArray48[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)[Lclient!hf;")
	public static Class127[] method6152() {
		return new Class127[] { Static93.aClass127_1, Static143.aClass127_2, Static444.aClass127_8 };
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6153(@OriginalArg(1) String arg0) {
		Static466.aString72 = arg0;
		if (Static159.aClass9_10.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static159.aClass9_10.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static159.aClass9_10.anApplet1.getParameter("cookiehost");
			@Pc(44) String local44 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local44 = local44 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local44 = local44 + "; Expires=" + Static205.method3346(Static105.method2132() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static555.method5216("document.cookie=\"" + local44 + "\"", Static159.aClass9_10.anApplet1);
		} catch (@Pc(93) Throwable local93) {
		}
	}
}
