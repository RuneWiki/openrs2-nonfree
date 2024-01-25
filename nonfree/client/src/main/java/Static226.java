import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "Lclient!ra;")
	public static Class170 aClass170_80;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Lclient!wf;")
	public static final Class215 aClass215_8 = new Class215(16);

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public static int anInt4439 = 0;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString260 = "Close";

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3908(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static46.aClass98_1);
		arg0.removeMouseMotionListener(Static46.aClass98_1);
		arg0.removeFocusListener(Static46.aClass98_1);
		Static84.anInt2092 = 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3909(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static168.aStringArray22.length; local12++) {
			if (Static168.aStringArray22[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public static void method3910() {
		@Pc(7) Class93 local7 = Static7.aClass93_1;
		synchronized (Static7.aClass93_1) {
			Static133.anInt6593 = Static154.anInt3109;
			Static72.anInt1799++;
			@Pc(30) int local30;
			if (Static244.anInt4742 >= 0) {
				while (Static244.anInt4742 != Static261.anInt5033) {
					local30 = Static209.anIntArray300[Static261.anInt5033];
					Static261.anInt5033 = Static261.anInt5033 + 1 & 0x7F;
					if (local30 >= 0) {
						Static233.aBooleanArray19[local30] = true;
					} else {
						Static233.aBooleanArray19[~local30] = false;
					}
				}
			} else {
				for (local30 = 0; local30 < 112; local30++) {
					Static233.aBooleanArray19[local30] = false;
				}
				Static244.anInt4742 = Static261.anInt5033;
			}
			Static154.anInt3109 = Static232.anInt4547;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lclient!qr;")
	public static Class168 method3911(@OriginalArg(1) int arg0) {
		@Pc(10) Class168 local10 = (Class168) Static26.aClass66_4.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static42.aClass170_8.method4584(0, arg0);
		local10 = new Class168();
		if (local20 != null) {
			local10.method4540(new Class5_Sub1(local20));
		}
		local10.method4541();
		Static26.aClass66_4.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method3912(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(9) int local9 = arg0.method1866();
		Static54.aClass182Array1 = new Class182[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static54.aClass182Array1[local14] = new Class182();
			Static54.aClass182Array1[local14].anInt5544 = arg0.method1866();
			Static54.aClass182Array1[local14].aString322 = arg0.method1855();
		}
		Static173.anInt4478 = arg0.method1866();
		Static275.anInt5384 = arg0.method1866();
		Static191.anInt5852 = arg0.method1866();
		Static158.aClass47_Sub1Array2 = new Class47_Sub1[Static275.anInt5384 + 1 - Static173.anInt4478];
		for (@Pc(68) int local68 = 0; local68 < Static191.anInt5852; local68++) {
			@Pc(76) int local76 = arg0.method1866();
			@Pc(84) Class47_Sub1 local84 = Static158.aClass47_Sub1Array2[local76] = new Class47_Sub1();
			local84.anInt1355 = arg0.method1832();
			local84.anInt1353 = arg0.method1826();
			local84.anInt1361 = local76 + Static173.anInt4478;
			local84.aString77 = arg0.method1855();
			local84.aString78 = arg0.method1855();
		}
		Static104.anInt2255 = arg0.method1826();
		Static101.aBoolean142 = true;
	}
}
