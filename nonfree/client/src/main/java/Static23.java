import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!fc;")
	public static Class21 aClass21_6;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!rc;")
	private static Class55 aClass55_378 = Static34.method846("green:");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_376 = aClass55_378;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!le;")
	public static Class36 aClass36_12 = new Class36(64);

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!rc;")
	private static Class55 aClass55_377 = Static34.method846("This world is full)3");

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_379 = aClass55_377;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_380 = Static34.method846("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
	public static int[] anIntArray65 = new int[50];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method670() {
		anIntArray65 = null;
		aClass55_379 = null;
		aClass55_380 = null;
		aClass55_377 = null;
		aClass55_378 = null;
		aClass55_376 = null;
		aClass21_6 = null;
		aClass36_12 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!fb;ILjava/awt/Component;)V")
	public static void method674(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Component arg1) {
		try {
			@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) Class.forName("Class4_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local15.method887(arg0, 2048);
			Static64.aClass4_1 = local15;
		} catch (@Pc(23) Throwable local23) {
			try {
				Static64.aClass4_1 = new Class4_Sub1_Sub2(arg0, arg1);
			} catch (@Pc(31) Throwable local31) {
				if (Static25.aString4.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static64.aClass4_1 = new Class4_Sub2();
						return;
					} catch (@Pc(42) Throwable local42) {
					}
				}
				Static64.aClass4_1 = new Class4(8000);
			}
		}
	}
}
