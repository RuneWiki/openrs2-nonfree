import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1279 = Static38.method736("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "J")
	public static volatile long aLong102 = 0L;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1280 = Static38.method736("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1281 = Static38.method736("gleiten:");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1282 = Static38.method736("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Z")
	public static final boolean aBoolean119 = false;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1284 = Static38.method736("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1283 = aClass71_1284;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1285 = Static38.method736("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1286 = Static38.method736("Versteckt");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1287 = Static38.method736(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1288 = Static38.method736(" )2> @yel@");

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1289 = aClass71_1285;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1742() {
		aClass71_1289 = null;
		aClass71_1280 = null;
		aClass71_1286 = null;
		aClass71_1281 = null;
		aClass71_1283 = null;
		aClass71_1284 = null;
		aClass71_1282 = null;
		aClass71_1288 = null;
		aClass71_1285 = null;
		aClass71_1279 = null;
		aClass71_1287 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1743(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static66.aClass40_1);
		arg0.removeFocusListener(Static66.aClass40_1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!nb;Lclient!vc;Lclient!vc;I)[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] method1744(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		@Pc(13) int local13 = arg0.method650(arg2);
		@Pc(19) int local19 = arg0.method664(arg1, local13);
		return Static27.method568(arg0, local13, local19);
	}
}
