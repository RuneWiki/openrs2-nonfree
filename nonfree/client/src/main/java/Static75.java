import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_527 = Static13.method257("Loading textures )2 ");

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_528 = Static13.method257("@or2@");

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public static int anInt1826 = -1;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_529 = Static13.method257("Login server offline)3");

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Z")
	public static boolean aBoolean147 = true;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "[Lclient!oc;")
	public static Class43[] aClass43Array1 = new Class43[50];

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_530 = Static13.method257("Trade)4compete");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1219() {
		aClass40_527 = null;
		aClass40_528 = null;
		aClass40_529 = null;
		aByteArrayArrayArray9 = null;
		aClass43Array1 = null;
		aClass40_530 = null;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	public static void method1227() {
		for (@Pc(3) int local3 = 0; local3 < Static73.anInt1800; local3++) {
			@Pc(9) int local9 = Static63.anIntArray326[local3];
			@Pc(13) Class2_Sub2_Sub12_Sub1_Sub2 local13 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local9];
			if (local13 != null) {
				Static91.method1468(local13, local13.aClass2_Sub2_Sub7_1.anInt758);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method1228(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method1230() {
		Static2.aClass45_2.method1476();
		Static104.anIntArray548 = Static6.method175(Static104.anIntArray548);
	}
}
