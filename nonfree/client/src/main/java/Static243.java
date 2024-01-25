import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "Lclient!uaa;")
	public static Class343 aClass343_3;

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!vb;")
	public static final Class359 aClass359_3 = new Class359();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method7722(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "(I)V")
	public static void method7723() {
		if (Static155.anInterface19Array1 == null) {
			return;
		}
		@Pc(9) Interface19[] local9 = Static155.anInterface19Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface19 local17 = local9[local11];
			local17.method2900();
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)I")
	public static int method7724() {
		@Pc(12) int local12 = Static615.aClass45_23.method1209();
		if (Static594.aClass45Array1.length - 1 > local12) {
			Static615.aClass45_23 = Static594.aClass45Array1[local12 + 1];
		}
		return 100;
	}
}
