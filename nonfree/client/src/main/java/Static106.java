import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "[Lclient!qc;")
	public static Class191[] aClass191Array1;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_95 = new Class22(39, 8);

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_7 = new Class21(3, 7);

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_26 = new Class215(78, -1);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	public static boolean method1982(@OriginalArg(1) int arg0) {
		if (arg0 == 18 || arg0 == 45 || arg0 == 23 || arg0 == 25 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method1983() {
		Static33.anInt606 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static354.aClass4_Sub12Array1[local13] = null;
			Static411.aByteArray95[local13] = 1;
			Static306.aClass253Array1[local13] = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method1986() {
		Static56.aClass4_Sub15_Sub1_1.method1440();
		Static27.anInt461 = 1;
		Static236.aClass76_49 = null;
	}
}
