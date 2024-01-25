import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
	public static int anInt4596;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Lclient!am;")
	public static Class11 aClass11_86;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Z")
	public static boolean aBoolean389 = true;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!tq;)V")
	public static void method3805(@OriginalArg(1) Class4_Sub7 arg0) {
		if (arg0.aByteArray42.length - arg0.anInt2667 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method2380();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray42.length - arg0.anInt2667 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method2404();
		if (arg0.aByteArray42.length - arg0.anInt2667 != local43 * 6) {
			return;
		}
		while (true) {
			@Pc(66) int local66;
			@Pc(70) int local70;
			do {
				do {
					do {
						if (arg0.aByteArray42.length <= arg0.anInt2667) {
							return;
						}
						local66 = arg0.method2404();
						local70 = arg0.method2389();
					} while (Static289.anIntArray486.length <= local66);
				} while (!Static72.aBooleanArray12[local66]);
			} while (Static107.method5713(local66).aChar1 == '1' && (local70 < -1 || local70 > 1));
			Static289.anIntArray486[local66] = local70;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3808(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
}
