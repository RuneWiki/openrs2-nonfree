import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!u;")
	private static Class74 aClass74_1603 = Static72.method1077(" has logged out)3");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1602 = aClass74_1603;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt2555 = 0;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!u;")
	private static Class74 aClass74_1605 = Static72.method1077("Unable to find ");

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1604 = aClass74_1605;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!e;")
	public static Class16 aClass16_85 = new Class16(50);

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!u;")
	private static Class74 aClass74_1608 = Static72.method1077("Drop");

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_1606 = aClass74_1608;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!u;")
	private static Class74 aClass74_1610 = Static72.method1077("Loading friend list");

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1607 = aClass74_1610;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1609 = Static72.method1077("backhmid2");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1611 = Static72.method1077("Weiter");

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public static int anInt2564 = 0;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	public static int anInt2565 = 0;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
	public static int[] anIntArray369 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)V")
	public static void method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) ((arg1 << 16) + arg0);
		@Pc(23) Class2_Sub2_Sub15 local23 = (Class2_Sub2_Sub15) Static109.aClass58_60.method1307(local6);
		if (local23 != null) {
			Static84.aClass56_2.method1288(local23);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1764() {
		aClass74_1604 = null;
		aClass74_1610 = null;
		aClass74_1608 = null;
		aClass74_1606 = null;
		anIntArray369 = null;
		aClass74_1609 = null;
		aClass74_1603 = null;
		aClass74_1607 = null;
		anIntArray370 = null;
		aClass74_1611 = null;
		aClass74_1605 = null;
		aClass16_85 = null;
		aClass74_1602 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lclient!cb;")
	public static Class2_Sub2_Sub3 method1766(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub3 local10 = (Class2_Sub2_Sub3) Static93.aClass16_69.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static106.aClass26_28.method1358(arg0, 14);
		local10 = new Class2_Sub2_Sub3();
		if (local20 != null) {
			local10.method272(new Class2_Sub10(local20));
		}
		Static93.aClass16_69.method492(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1767(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static39.aClass42_1);
		arg0.removeFocusListener(Static39.aClass42_1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Z")
	public static boolean method1768(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
