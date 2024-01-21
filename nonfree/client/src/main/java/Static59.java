import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!qb;")
	public static Class3_Sub18 aClass3_Sub18_3 = new Class3_Sub18(0, 0);

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1522 = Static122.method531("flash1:");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1523 = Static122.method531("scrollen:");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1524 = Static122.method531("Hidden");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1525 = aClass73_1524;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1526 = Static122.method531("(U4");

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1527 = aClass73_1522;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1528 = aClass73_1522;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1529 = Static122.method531("Hierhin gehen");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method2025() {
		aClass73_1523 = null;
		aClass73_1526 = null;
		aClass3_Sub18_3 = null;
		aClass73_1527 = null;
		aClass73_1525 = null;
		aClass73_1528 = null;
		aClass73_1522 = null;
		aClass73_1524 = null;
		anIntArrayArray30 = null;
		aClass73_1529 = null;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method2028() {
		while (true) {
			if (Static159.aClass3_Sub12_Sub1_4.method1397(Static17.anInt3783) >= 27) {
				@Pc(12) int local12 = Static159.aClass3_Sub12_Sub1_4.method1403(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local12] == null) {
						local17 = true;
						Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local12] = new Class3_Sub1_Sub4_Sub7_Sub2();
					}
					@Pc(33) Class3_Sub1_Sub4_Sub7_Sub2 local33 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local12];
					Static52.anIntArray132[Static86.anInt1943++] = local12;
					local33.anInt3177 = Static44.anInt1024;
					@Pc(49) int local49 = Static159.aClass3_Sub12_Sub1_4.method1403(5);
					if (local49 > 15) {
						local49 -= 32;
					}
					local33.aClass3_Sub1_Sub10_1 = Static164.method2578(Static159.aClass3_Sub12_Sub1_4.method1403(14));
					@Pc(68) int local68 = Static159.aClass3_Sub12_Sub1_4.method1403(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = Static56.anIntArray137[Static159.aClass3_Sub12_Sub1_4.method1403(3)];
					if (local17) {
						local33.anInt3139 = local33.anInt3138 = local79;
					}
					@Pc(92) int local92 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
					@Pc(97) int local97 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
					if (local97 == 1) {
						Static2.anIntArray1[Static181.anInt3975++] = local12;
					}
					local33.anInt3168 = local33.aClass3_Sub1_Sub10_1.anInt1557;
					local33.anInt3144 = local33.aClass3_Sub1_Sub10_1.anInt1569;
					local33.anInt3180 = local33.aClass3_Sub1_Sub10_1.anInt1555;
					local33.anInt3154 = local33.aClass3_Sub1_Sub10_1.anInt1581;
					local33.anInt3140 = local33.aClass3_Sub1_Sub10_1.anInt1556;
					local33.anInt3155 = local33.aClass3_Sub1_Sub10_1.anInt1565;
					local33.anInt3171 = local33.aClass3_Sub1_Sub10_1.anInt1559;
					local33.anInt3142 = local33.aClass3_Sub1_Sub10_1.anInt1564;
					local33.anInt3161 = local33.aClass3_Sub1_Sub10_1.anInt1562;
					if (local33.anInt3171 == 0) {
						local33.anInt3138 = 0;
					}
					local33.method2267(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0] + local68, local92 == 1, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0] + local49);
					continue;
				}
			}
			Static159.aClass3_Sub12_Sub1_4.method1406();
			return;
		}
	}
}
