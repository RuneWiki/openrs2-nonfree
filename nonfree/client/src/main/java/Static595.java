import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public static void method7986() {
		for (@Pc(6) Class1_Sub40 local6 = (Class1_Sub40) Static166.aClass111_49.method2547(); local6 != null; local6 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			if (Static28.method560(local6.anInt7819)) {
				Static402.method5786(local6);
			}
		}
		if (Static22.anInt572 == 1) {
			Static577.method7756();
			return;
		}
		Static95.method1439(Static130.anInt2592, Static563.anInt9345, Static405.anInt7239, Static570.anInt9417);
		@Pc(55) int local55 = Static88.aClass352_7.method7572(Static375.aClass253_28.method5453(Static161.anInt3095));
		for (@Pc(60) Class1_Sub40 local60 = (Class1_Sub40) Static166.aClass111_49.method2547(); local60 != null; local60 = (Class1_Sub40) Static166.aClass111_49.method2554()) {
			@Pc(66) int local66 = Static315.method4680(local60);
			if (local55 < local66) {
				local55 = local66;
			}
		}
		Static570.anInt9417 = local55 + 8;
		Static563.anInt9345 = (Static527.aBoolean672 ? 26 : 22) + Static22.anInt572 * 16;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)I")
	public static int method7987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		@Pc(35) int local35 = 255 - arg1;
		return ((local35 * (arg0 & 0xFF00) & 0xFF0000 | local35 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local21;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public static void method7988(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static59.anInt1129 == 2) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[0]);
				Static511.aClass80Array1[1].method2143(Static198.aClass187Array1[1]);
			} else if (Static59.anInt1129 == 3) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[0]);
				Static511.aClass80Array1[1].method2143(Static198.aClass187Array1[1]);
				Static511.aClass80Array1[2].method2143(Static198.aClass187Array1[2]);
			} else {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[0]);
				Static511.aClass80Array1[1].method2143(Static198.aClass187Array1[1]);
				Static511.aClass80Array1[2].method2143(Static198.aClass187Array1[2]);
				Static511.aClass80Array1[3].method2143(Static198.aClass187Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static59.anInt1129 == 2) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[2]);
			} else if (Static59.anInt1129 == 3) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[3]);
				Static511.aClass80Array1[1].method2143(Static198.aClass187Array1[4]);
			} else {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[4]);
				Static511.aClass80Array1[1].method2143(Static198.aClass187Array1[5]);
				Static511.aClass80Array1[2].method2143(Static198.aClass187Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static59.anInt1129 == 2) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[3]);
				return;
			}
			if (Static59.anInt1129 == 3) {
				Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[5]);
				return;
			}
			Static511.aClass80Array1[0].method2143(Static198.aClass187Array1[7]);
		}
	}
}
