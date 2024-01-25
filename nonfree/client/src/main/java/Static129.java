import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "Lclient!s;")
	public static Class4_Sub13_Sub3 aClass4_Sub13_Sub3_1;

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
	public static final int[] anIntArray269 = new int[128];

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V")
	public static void method2602(@OriginalArg(0) int arg0) {
		if (!Static2.aBoolean425) {
			arg0 = -1;
		}
		if (Static13.anInt309 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class216 local24 = Static149.method2883(arg0);
			@Pc(28) Class206 local28 = local24.method5620();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static212.aClass120_3.method3243(local28.method5447(), local28.method5460(), local28.method5455(), Static101.aCanvas8, new Point(local24.anInt6770, local24.anInt6772));
				Static13.anInt309 = arg0;
			}
		}
		if (arg0 == -1 && Static13.anInt309 != -1) {
			Static212.aClass120_3.method3243(-1, null, -1, Static101.aCanvas8, new Point());
			Static13.anInt309 = -1;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method2603(@OriginalArg(0) Class11 arg0) {
		Static232.aClass11_95 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method2604() {
		@Pc(5) Class154 local5 = Static154.aClass154_55;
		synchronized (Static154.aClass154_55) {
			Static154.aClass154_55.method4220(5);
		}
		local5 = Static13.aClass154_5;
		synchronized (Static13.aClass154_5) {
			Static13.aClass154_5.method4220(5);
		}
		@Pc(37) Class85 local37 = Static234.aClass85_1;
		synchronized (Static234.aClass85_1) {
			Static234.aClass85_1.method2017();
		}
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(Z)V")
	public static void method2605() {
		Static37.aClass154_11.method4212();
		Static77.aClass154_24.method4212();
		Static132.aClass154_43.method4212();
		Static257.aClass154_82.method4212();
		Static169.aClass154_60.method4212();
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)Lclient!ae;")
	public static Class6 method2606(@OriginalArg(0) int arg0) {
		@Pc(15) Class6 local15 = (Class6) Static63.aClass154_19.method4222((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static51.aClass11_18.method288(arg0, 1);
		local15 = new Class6();
		local15.anInt145 = arg0;
		if (local25 != null) {
			local15.method212(new Class4_Sub7(local25));
		}
		local15.method213();
		if (local15.anInt140 == 2 && Static249.aClass198_30.method5261((long) arg0) == null) {
			Static249.aClass198_30.method5267((long) arg0, new Class4_Sub36(Static92.anInt2049));
			Static301.aClass6Array1[Static92.anInt2049++] = local15;
		}
		Static63.aClass154_19.method4221((long) arg0, local15);
		return local15;
	}
}
