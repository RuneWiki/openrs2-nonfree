import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt1467 = 128;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_796 = Static23.method501("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt1471 = 0;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!mc;")
	public static Class42 aClass42_797 = Static23.method501("rot:");

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[104][104];

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "Lclient!mc;")
	public static Class42 aClass42_798 = Static23.method501("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	public static int anInt1488 = 127;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!mc;")
	public static Class42 aClass42_799 = Static23.method501("redstone2");

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "Lclient!mc;")
	public static Class42 aClass42_800 = Static23.method501("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!vb;ILjava/awt/Component;)V")
	public static void method1033(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Component arg1) {
		try {
			@Pc(8) Class10_Sub1 local8 = (Class10_Sub1) Class.forName("Class10_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local8.method1573(arg0, 2048);
			Static43.aClass10_1 = local8;
		} catch (@Pc(16) Throwable local16) {
			try {
				Static43.aClass10_1 = new Class10_Sub1_Sub2(arg0, arg1);
			} catch (@Pc(24) Throwable local24) {
				if (Static102.aString3.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static43.aClass10_1 = new Class10_Sub2();
						return;
					} catch (@Pc(36) Throwable local36) {
					}
				}
				Static43.aClass10_1 = new Class10(8000);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ja;ILclient!ja;)V")
	public static void method1035(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1) {
		Static24.aClass33_8 = arg1;
		Static69.aClass33_17 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
	public static void method1044() {
		aClass42_799 = null;
		aBooleanArray9 = null;
		aClass42_798 = null;
		aClass42_796 = null;
		aClass42_797 = null;
		anIntArray219 = null;
		aClass42_800 = null;
		anIntArrayArray16 = null;
		aClass1_Sub1_Sub1_Sub4_15 = null;
	}
}
