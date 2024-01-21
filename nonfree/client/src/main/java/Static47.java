import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!bd;")
	public static Class8 aClass8_17;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	public static int anInt1563;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt1557 = 0;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_1513 = Static94.method1596("skill)2");

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_1510 = aClass1_1513;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_1511 = Static94.method1596("@whi@");

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!a;")
	private static Class1 aClass1_1512 = Static94.method1596("World");

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_1514 = Static94.method1596("Weiter");

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_1515 = Static94.method1596("Untersuchen");

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!a;")
	public static Class1 aClass1_1516 = Static94.method1596("gelb:");

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Lclient!a;")
	public static Class1 aClass1_1517 = Static94.method1596("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_1518 = aClass1_1512;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method1051(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method1052() {
		aClass1_1516 = null;
		aClass1_1515 = null;
		aClass1_1514 = null;
		anImage3 = null;
		aClass1_1518 = null;
		aClass1_1512 = null;
		aClass1_1511 = null;
		aClass1_1517 = null;
		aClass8_17 = null;
		aClass1_1510 = null;
		aClass1_1513 = null;
	}
}
