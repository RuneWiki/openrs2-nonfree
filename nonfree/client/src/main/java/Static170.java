import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "Lclient!rf;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "[S")
	public static short[] aShortArray38;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
	public static int anInt3552;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
	public static volatile boolean aBoolean197 = true;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
	public static int anInt3546 = 0;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	public static int anInt3548 = -1;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1713 = Static187.method3089("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
	public static int anInt3550 = 0;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1714 = Static187.method3089("::errortest");

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
	public static void method2664() {
		if (Static156.aClass9_1 != null) {
			@Pc(3) Class9 local3 = Static156.aClass9_1;
			synchronized (Static156.aClass9_1) {
				Static156.aClass9_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
	public static void method2665() {
		for (@Pc(11) int local11 = 0; local11 < Static153.anInt3186; local11++) {
			@Pc(17) int local17 = Static103.anIntArray167[local11];
			@Pc(21) Class8_Sub3_Sub2 local21 = Static177.aClass8_Sub3_Sub2Array1[local17];
			if (local21 != null) {
				Static4.method93(local21, local21.aClass1_Sub3_Sub13_1.anInt2256);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method2666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static19.method429(Static118.anInt2521, arg3, Static204.anInt2389);
		@Pc(15) int local15 = Static19.method429(Static118.anInt2521, arg2, Static204.anInt2389);
		@Pc(21) int local21 = Static19.method429(Static102.anInt2207, arg4, Static116.anInt2488);
		@Pc(27) int local27 = Static19.method429(Static102.anInt2207, arg1, Static116.anInt2488);
		for (@Pc(29) int local29 = local9; local29 <= local15; local29++) {
			Static74.method1123(local21, arg0, Static142.anIntArrayArray25[local29], local27);
		}
	}
}
