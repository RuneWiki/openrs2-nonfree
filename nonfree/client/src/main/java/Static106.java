import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1329 = Static14.method2017("Loading textures )2 ");

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!bb;")
	public static Class8 aClass8_9 = new Class8();

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1330 = Static14.method2017("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1331 = aClass36_1329;

	@OriginalMember(owner = "client!ud", name = "O", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1332 = Static14.method2017("Please reload this page)3");

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1333 = Static14.method2017("Versteckt");

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
	public static int[] anIntArray330 = new int[200];

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1334 = aClass36_1332;

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1335 = Static14.method2017("shake:");

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1336 = Static14.method2017("m");

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
	public static int anInt2724 = 0;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
	public static int anInt2725 = 500;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
	public static int anInt2726 = 0;

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1337 = Static14.method2017("null");

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1338 = aClass36_1335;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1926(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static12.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static77.aClass9_1);
		arg0.addFocusListener(Static77.aClass9_1);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method1927() {
		aClass36_1338 = null;
		aClass36_1337 = null;
		aClass36_1335 = null;
		aClass36_1331 = null;
		aClass36_1333 = null;
		aClass36_1332 = null;
		anIntArray330 = null;
		aClass36_1336 = null;
		aClass36_1329 = null;
		aClass8_9 = null;
		aClass36_1330 = null;
		aClass36_1334 = null;
	}
}
