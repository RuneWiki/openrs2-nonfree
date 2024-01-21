import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
	public static int anInt3296 = 0;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
	public static int anInt3298 = 0;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
	public static int anInt3301 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method2367() {
		aBooleanArray14 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method2370(@OriginalArg(0) Class10 arg0) {
		if (Static141.aClass2_Sub17Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(19) long local19 = arg0.method363();
		if (local19 == 0L) {
			return;
		}
		while (local10 < Static141.aClass2_Sub17Array1.length && local19 != Static141.aClass2_Sub17Array1[local10].aLong139) {
			local10++;
		}
		if (Static141.aClass2_Sub17Array1.length > local10 && Static141.aClass2_Sub17Array1[local10] != null) {
			Static141.aClass2_Sub11_Sub1_3.method1495(219);
			Static141.aClass2_Sub11_Sub1_3.method1458(Static141.aClass2_Sub17Array1[local10].aLong139);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lclient!cd;")
	public static Class10 method2371(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static3.method36(new Class10[] { Static175.aClass10_1597, Static164.method2485(arg0), Static57.aClass10_630 });
		} else if (arg0 < 10000000) {
			return Static3.method36(new Class10[] { Static102.aClass10_1547, Static164.method2485(arg0 / 1000), Static65.aClass10_696, Static57.aClass10_630 });
		} else {
			return Static3.method36(new Class10[] { Static131.aClass10_1259, Static164.method2485(arg0 / 1000000), Static63.aClass10_686, Static57.aClass10_630 });
		}
	}
}
