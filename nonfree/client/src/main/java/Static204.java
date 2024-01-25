import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!gu;")
	public static Class135 aClass135_8;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!wia;")
	public static Class386 aClass386_118;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_165 = new Class44(55, 3);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "[Lclient!jm;")
	public static Class185[] aClass185Array7 = null;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_17 = new Class310(1, 2);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLjava/awt/Canvas;IILclient!wia;IILclient!d;)Lclient!ha;")
	public static synchronized Class137 method7896(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class386 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface3 arg6) {
		if (arg2 == 0) {
			return Static357.method5409(arg0, arg4, arg6, arg1);
		} else if (arg2 == 2) {
			return Static202.method3075(arg1, arg6, arg4, arg0);
		} else if (arg2 == 1) {
			return Static298.method4398(arg5, arg0, arg6);
		} else if (arg2 == 5) {
			return Static459.method6609(arg3, arg6, arg5, arg0);
		} else if (arg2 == 3) {
			return Static683.method7123(arg3, arg5, arg6, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
	public static boolean method7912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7945(@OriginalArg(0) String arg0) {
		return Static32.aHashtable6.containsKey(arg0);
	}
}
