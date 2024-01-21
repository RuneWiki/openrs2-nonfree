import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_18;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public static int anInt4022 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method2752() {
		Static99.aClass82_40.method2698();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBII)V")
	public static void method2753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static31.anInt883 == 0 || arg1 == 0 || Static90.anInt2345 >= 50) {
			return;
		}
		Static103.anIntArray402[Static90.anInt2345] = arg2;
		Static59.anIntArray239[Static90.anInt2345] = arg1;
		Static139.anIntArray504[Static90.anInt2345] = arg0;
		Static46.aClass76Array1[Static90.anInt2345] = null;
		Static79.anIntArray351[Static90.anInt2345] = 0;
		Static90.anInt2345++;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qf;I)Z")
	public static boolean method2754(@OriginalArg(0) Class66 arg0) {
		if (Static150.aBoolean150) {
			if (Static63.method1160(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3230 == 0) {
				return false;
			}
		}
		return arg0.aBoolean135;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public static void method2755() {
		aClass43_Sub1_18 = null;
	}
}
