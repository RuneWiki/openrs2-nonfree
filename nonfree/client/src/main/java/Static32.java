import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt964;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_457 = Static75.method1216("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!ad;")
	private static Class4 aClass4_460 = Static75.method1216("This computers address has been blocked");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_458 = aClass4_460;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!e;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!ad;")
	private static Class4 aClass4_461 = Static75.method1216("To create a new account you need to");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_459 = aClass4_461;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!ad;")
	private static Class4 aClass4_462 = Static75.method1216(" is already on your friend list");

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_463 = Static75.method1216("Hierhin gehen");

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_464 = aClass4_462;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_465 = Static75.method1216(" weitere Optionen");

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_466 = Static75.method1216("(Udns");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method630() {
		aClass4_465 = null;
		aClass4_460 = null;
		aClass4_461 = null;
		aClass4_466 = null;
		aClass4_457 = null;
		aByteArrayArray4 = null;
		aClass4_458 = null;
		aClass4_462 = null;
		aClass4_463 = null;
		aClass4_464 = null;
		aClass3_Sub4_Sub1_2 = null;
		aClass4_459 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ab;ZI)V")
	public static void method631(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static77.method1241(arg0.anInt2348, arg1, arg0.anInt2342);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I")
	public static int method632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method635() {
		try {
			@Pc(11) Graphics local11 = Static9.aCanvas1.getGraphics();
			Static29.aClass25_43.method1161(205, local11, 553);
		} catch (@Pc(19) Exception local19) {
			Static9.aCanvas1.repaint();
		}
	}
}
