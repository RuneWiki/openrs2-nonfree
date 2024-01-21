import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "u", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[Lclient!se;")
	public static Class4_Sub2_Sub1_Sub1_Sub2[] aClass4_Sub2_Sub1_Sub1_Sub2Array1 = new Class4_Sub2_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
	public static int[] anIntArray307 = new int[200];

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1485 = Static28.method504("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!pb;")
	public static Class61 aClass61_13 = new Class61();

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public static int anInt2849 = 0;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1486 = Static28.method504("hel");

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1487 = Static28.method504("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!o;")
	public static Class4_Sub16_Sub1 aClass4_Sub16_Sub1_3 = new Class4_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1488 = Static28.method504("Welt");

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1490 = Static28.method504("Hidden");

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1489 = aClass39_1490;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1491 = Static28.method504("auf der Hautpseite)3");

	@OriginalMember(owner = "client!td", name = "t", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1492 = Static28.method504("null");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1990() {
		aClass4_Sub16_Sub1_3.method1499(33);
		for (@Pc(22) Class4_Sub10 local22 = (Class4_Sub10) Static15.aClass42_4.method1049(); local22 != null; local22 = (Class4_Sub10) Static15.aClass42_4.method1054()) {
			if (local22.anInt1721 == 0 || local22.anInt1721 == 3) {
				method1993(local22, true);
			}
		}
		if (Static101.aClass4_Sub5_55 != null) {
			Static19.method344(Static101.aClass4_Sub5_55);
			Static101.aClass4_Sub5_55 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!s;I)Lclient!ja;")
	public static Class39 method1991(@OriginalArg(0) Class4_Sub16 arg0) {
		return Static50.method819(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1992(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static11.aClass65_1);
		arg0.removeFocusListener(Static11.aClass65_1);
		Static128.anInt3143 = -1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!le;ZI)V")
	public static void method1993(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = arg0.anInt1724;
		@Pc(14) int local14 = (int) arg0.aLong155;
		arg0.method2189();
		if (arg1) {
			Static50.method820(local2);
		}
		Static119.method2170(local2);
		@Pc(33) Class4_Sub5 local33 = Static54.method949(local14);
		if (local33 != null) {
			Static19.method344(local33);
		}
		Static101.aBoolean122 = false;
		Static105.anInt2033 = 0;
		Static1.method6(Static73.anInt1764, Static51.anInt2470, Static65.anInt1666, Static126.anInt3156);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1994() {
		aClass39_1490 = null;
		aClass39_1485 = null;
		anIntArray308 = null;
		aClass39_1487 = null;
		aClass39_1488 = null;
		aClass39_1491 = null;
		aClass61_13 = null;
		aClass39_1492 = null;
		aClass4_Sub16_Sub1_3 = null;
		aClass39_1489 = null;
		anIntArray307 = null;
		aClass39_1486 = null;
		aClass4_Sub2_Sub1_Sub1_Sub2Array1 = null;
	}
}
