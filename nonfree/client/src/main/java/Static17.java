import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public static int anInt610;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_19;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public static int anInt619;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static final int anInt613 = 20;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!p;")
	public static Class51 aClass51_3 = new Class51();

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_277 = Static56.method972(" x");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "J")
	public static long aLong16 = 0L;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt616 = 0;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!p;")
	public static Class51 aClass51_4 = new Class51();

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_278 = Static56.method972("Loading friend list");

	@OriginalMember(owner = "client!d", name = "p", descriptor = "[Lclient!qb;")
	public static Class54[] aClass54Array1 = new Class54[50];

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_279 = aClass5_278;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;ZLclient!ed;I)V")
	public static void method401(@OriginalArg(1) Component arg0, @OriginalArg(3) Class23 arg1) {
		anInt610 = 22050;
		Static106.aBoolean147 = false;
		Static101.aLong75 = Static3.method125();
		try {
			@Pc(19) Class15_Sub1 local19 = (Class15_Sub1) Class.forName("Class15_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local19.method1355(arg0);
			local19.method1350(arg1, 2048);
			Static24.aClass15_1 = local19;
		} catch (@Pc(32) Throwable local32) {
			try {
				@Pc(37) Class15_Sub1_Sub1 local37 = new Class15_Sub1_Sub1(arg1);
				local37.method1355(arg0);
				local37.method1350(arg1, 16384);
				Static24.aClass15_1 = local37;
			} catch (@Pc(50) Throwable local50) {
				if (Static26.aString3.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static24.aClass15_1 = new Class15_Sub2();
						Static106.aBoolean147 = false;
						anInt610 = 8000;
						return;
					} catch (@Pc(68) Throwable local68) {
					}
				}
				Static24.aClass15_1 = new Class15();
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method402() {
		aClass54Array1 = null;
		aClass5_278 = null;
		aClass51_4 = null;
		aClass11_Sub1_19 = null;
		aClass5_279 = null;
		aClass5_277 = null;
		aClass51_3 = null;
	}
}
