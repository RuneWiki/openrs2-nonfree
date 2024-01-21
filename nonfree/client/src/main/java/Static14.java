import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "Lclient!qa;")
	public static Class1_Sub1_Sub2_Sub1_Sub2 aClass1_Sub1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!gd;")
	private static Class23 aClass23_203 = Static15.method178(" is already on your friend list");

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!gd;")
	public static Class23 aClass23_204 = aClass23_203;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
	public static volatile int anInt264 = 0;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "Lclient!gd;")
	private static Class23 aClass23_205 = Static15.method178("Continue");

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "Lclient!gd;")
	public static Class23 aClass23_206 = aClass23_205;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array6 = new Class23[5];

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "[I")
	public static int[] anIntArray48 = new int[500];

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Lclient!gd;")
	public static Class23 aClass23_207 = Static15.method178("Wordpack geladen)3");

	@OriginalMember(owner = "client!ca", name = "T", descriptor = "Lclient!ba;")
	public static Class5 aClass5_10 = new Class5(200);

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	public static int anInt273 = 10;

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
	public static int[] anIntArray49 = new int[5];

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "Lclient!gd;")
	private static Class23 aClass23_208 = Static15.method178("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "Lclient!gd;")
	public static Class23 aClass23_209 = aClass23_208;

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_210 = Static15.method178("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public static void method156() {
		anIntArray49 = null;
		aClass1_Sub1_Sub2_Sub1_Sub2_1 = null;
		aClass23_209 = null;
		aClass23_208 = null;
		aClass23_206 = null;
		aClass23_210 = null;
		aClass23Array6 = null;
		aClass5_10 = null;
		anIntArray48 = null;
		aClass23_207 = null;
		aClass23_203 = null;
		aClass23_205 = null;
		aClass23_204 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZJ)V")
	public static void method157(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ra;B)V")
	public static void method158(@OriginalArg(0) Component arg0, @OriginalArg(1) Class54 arg1) {
		try {
			@Pc(13) Class9_Sub2 local13 = (Class9_Sub2) Class.forName("Class9_Sub2_Sub1").getDeclaredConstructor().newInstance();
			local13.method1557(arg1, 2048);
			Static8.aClass9_1 = local13;
		} catch (@Pc(21) Throwable local21) {
			try {
				Static8.aClass9_1 = new Class9_Sub2_Sub2(arg1, arg0);
			} catch (@Pc(29) Throwable local29) {
				if (Static86.aString2.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static8.aClass9_1 = new Class9_Sub1();
						return;
					} catch (@Pc(40) Throwable local40) {
					}
				}
				Static8.aClass9_1 = new Class9(8000);
			}
		}
	}
}
