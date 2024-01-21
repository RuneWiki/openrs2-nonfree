import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!ea;")
	private static Class18 aClass18_272 = Static8.method128("Your profile will be transferred in:");

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public static int anInt1112 = -1;

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!ea;")
	public static Class18 aClass18_273 = Static8.method128("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!e", name = "G", descriptor = "Lclient!ea;")
	public static Class18 aClass18_274 = Static8.method128(": ");

	@OriginalMember(owner = "client!e", name = "H", descriptor = "Lclient!ea;")
	public static Class18 aClass18_275 = aClass18_272;

	@OriginalMember(owner = "client!e", name = "I", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public static int anInt1116 = 0;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public static void method713() {
		aClass18_273 = null;
		aClass18_275 = null;
		aClass18_272 = null;
		aClass18_274 = null;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public static void method715() {
		if (Static136.aClass10_1 != null) {
			@Pc(3) Class10 local3 = Static136.aClass10_1;
			synchronized (Static136.aClass10_1) {
				Static136.aClass10_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method716(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static80.aClass23_1);
		arg0.removeFocusListener(Static80.aClass23_1);
		Static25.anInt880 = -1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method717() {
		Static38.anImage3 = null;
		Static180.aFont1 = null;
		Static177.aFontMetrics1 = null;
	}
}
