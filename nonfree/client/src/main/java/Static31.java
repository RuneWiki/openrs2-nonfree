import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fb", name = "qb", descriptor = "Z")
	public static boolean aBoolean156;

	@OriginalMember(owner = "client!fb", name = "bc", descriptor = "I")
	public static int anInt2721;

	@OriginalMember(owner = "client!fb", name = "gc", descriptor = "Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_8;

	@OriginalMember(owner = "client!fb", name = "Ic", descriptor = "Lclient!ce;")
	public static Class3_Sub1_Sub4_Sub1 aClass3_Sub1_Sub4_Sub1_9;

	@OriginalMember(owner = "client!fb", name = "zb", descriptor = "Lclient!he;")
	private static Class26 aClass26_1475 = Static6.method100("Checking for updates )2 ");

	@OriginalMember(owner = "client!fb", name = "Gb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1476 = aClass26_1475;

	@OriginalMember(owner = "client!fb", name = "Kb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1477 = Static6.method100("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!fb", name = "Pb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1478 = Static6.method100("lila:");

	@OriginalMember(owner = "client!fb", name = "Vb", descriptor = "I")
	public static int anInt2715 = 0;

	@OriginalMember(owner = "client!fb", name = "oc", descriptor = "[I")
	public static int[] anIntArray328 = new int[100];

	@OriginalMember(owner = "client!fb", name = "Ec", descriptor = "Lclient!he;")
	public static Class26 aClass26_1480 = Static6.method100("mapfunction");

	@OriginalMember(owner = "client!fb", name = "Fc", descriptor = "Lclient!he;")
	public static Class26 aClass26_1481 = Static6.method100(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!fb", name = "Hc", descriptor = "I")
	public static int anInt2746 = -1;

	@OriginalMember(owner = "client!fb", name = "Oc", descriptor = "Lclient!he;")
	public static Class26 aClass26_1482 = Static6.method100("m");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public static void method1877() {
		for (@Pc(10) Class3_Sub1_Sub5_Sub5 local10 = (Class3_Sub1_Sub5_Sub5) Static72.aClass65_51.method1958(); local10 != null; local10 = (Class3_Sub1_Sub5_Sub5) Static72.aClass65_51.method1962()) {
			if (local10.anInt1781 != Static132.anInt3270 || Static4.anInt136 > local10.anInt1801) {
				local10.method2201();
			} else if (Static4.anInt136 >= local10.anInt1780) {
				if (local10.anInt1789 > 0) {
					@Pc(55) Class3_Sub1_Sub5_Sub1_Sub2 local55 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local10.anInt1789 - 1];
					if (local55 != null && local55.anInt2733 >= 0 && local55.anInt2733 < 13312 && local55.anInt2731 >= 0 && local55.anInt2731 < 13312) {
						local10.method1181(local55.anInt2733, Static110.method2006(local55.anInt2733, local55.anInt2731, local10.anInt1781) - local10.anInt1779, Static4.anInt136, local55.anInt2731);
					}
				}
				if (local10.anInt1789 < 0) {
					@Pc(106) int local106 = -local10.anInt1789 - 1;
					@Pc(111) Class3_Sub1_Sub5_Sub1_Sub1 local111;
					if (local106 == Static4.anInt133) {
						local111 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1;
					} else {
						local111 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local106];
					}
					if (local111 != null && local111.anInt2733 >= 0 && local111.anInt2733 < 13312 && local111.anInt2731 >= 0 && local111.anInt2731 < 13312) {
						local10.method1181(local111.anInt2733, Static110.method2006(local111.anInt2733, local111.anInt2731, local10.anInt1781) - local10.anInt1779, Static4.anInt136, local111.anInt2731);
					}
				}
				local10.method1187(Static42.anInt1304);
				Static62.aClass69_1.method2048(Static132.anInt3270, (int) local10.aDouble9, (int) local10.aDouble7, (int) local10.aDouble4, 60, local10, local10.anInt1793, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3 method1883() {
		@Pc(9) Class3_Sub1_Sub4_Sub3 local9 = new Class3_Sub1_Sub4_Sub3();
		local9.anInt2581 = Static46.anIntArray148[0];
		local9.anInt2583 = Static57.anIntArray169[0];
		local9.anInt2586 = Static58.anIntArray173[0];
		local9.anInt2582 = Static53.anInt1619;
		local9.anInt2585 = Static51.anIntArray157[0];
		local9.anInt2584 = Static88.anInt2448;
		@Pc(41) int local41 = local9.anInt2585 * local9.anInt2581;
		local9.anIntArray308 = new int[local41];
		@Pc(57) byte[] local57 = Static117.aByteArrayArray19[0];
		for (@Pc(59) int local59 = 0; local59 < local41; local59++) {
			local9.anIntArray308[local59] = Static110.anIntArray351[local57[local59] & 0xFF];
		}
		Static67.method1913();
		return local9;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
	public static void method1884() {
		aClass26_1481 = null;
		aClass3_Sub1_Sub4_Sub1_8 = null;
		aClass26_1480 = null;
		aClass26_1476 = null;
		aClass26_1477 = null;
		aClass26_1475 = null;
		aClass3_Sub1_Sub4_Sub1_9 = null;
		anIntArray328 = null;
		aClass26_1482 = null;
		aClass26_1478 = null;
	}
}
