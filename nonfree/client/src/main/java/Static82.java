import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!id", name = "M", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array13;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	public static int anInt1824;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!r;")
	public static Class1_Sub3_Sub1_Sub3_Sub1 aClass1_Sub3_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!id", name = "N", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array14 = new Class92[100];

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "Lclient!ba;")
	public static Class11 aClass11_6 = null;

	@OriginalMember(owner = "client!id", name = "R", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!id", name = "S", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[5][5000];

	@OriginalMember(owner = "client!id", name = "T", descriptor = "I")
	public static final int anInt1826 = 5063219;

	@OriginalMember(owner = "client!id", name = "X", descriptor = "[Lclient!ac;")
	public static final Class4[] aClass4Array1 = new Class4[50];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ab;B)V")
	public static void method1263(@OriginalArg(0) Class3 arg0) {
		Static56.aClass3_8 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!vd;)V")
	public static void method1264(@OriginalArg(1) Class92 arg0) {
		try {
			Static19.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method3221(Static19.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(15) Exception local15) {
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public static void method1265() {
		Static73.method1118(Static161.aClass11_15);
		Static92.anInt1970++;
		if (Static11.aBoolean21 && Static53.aBoolean80) {
			@Pc(32) int local32 = Static126.anInt2633;
			local32 -= Static165.anInt3438;
			@Pc(39) int local39 = Static161.aClass11_15.anInt280;
			@Pc(41) int local41 = Static85.anInt1855;
			local41 -= Static119.anInt2552;
			if (local41 < Static59.anInt1434) {
				local41 = Static59.anInt1434;
			}
			if (local32 < Static36.anInt1018) {
				local32 = Static36.anInt1018;
			}
			if (Static161.aClass11_15.anInt263 + local32 > Static36.anInt1018 + Static50.aClass11_13.anInt263) {
				local32 = Static50.aClass11_13.anInt263 + Static36.anInt1018 - Static161.aClass11_15.anInt263;
			}
			@Pc(80) int local80 = Static50.aClass11_13.anInt297 + local32 - Static36.anInt1018;
			if (Static59.anInt1434 + Static50.aClass11_13.anInt312 < local41 - -Static161.aClass11_15.anInt312) {
				local41 = Static59.anInt1434 + Static50.aClass11_13.anInt312 - Static161.aClass11_15.anInt312;
			}
			@Pc(107) int local107 = local41 + Static50.aClass11_13.anInt299 - Static59.anInt1434;
			@Pc(112) int local112 = local32 - Static98.anInt2076;
			@Pc(117) int local117 = local41 - Static148.anInt3029;
			if (Static92.anInt1970 > Static161.aClass11_15.anInt252 && (local117 > local39 || local117 < -local39 || local112 > local39 || -local39 > local112)) {
				Static75.aBoolean101 = true;
			}
			@Pc(158) Class1_Sub24 local158;
			if (Static161.aClass11_15.anObjectArray2 != null && Static75.aBoolean101) {
				local158 = new Class1_Sub24();
				local158.aClass11_18 = Static161.aClass11_15;
				local158.anInt3517 = local107;
				local158.anInt3510 = local80;
				local158.anObjectArray28 = Static161.aClass11_15.anObjectArray2;
				Static45.method810(local158);
			}
			if (Static85.anInt1857 == 0) {
				if (Static75.aBoolean101) {
					if (Static161.aClass11_15.anObjectArray27 != null) {
						local158 = new Class1_Sub24();
						local158.aClass11_17 = Static161.aClass11_16;
						local158.anObjectArray28 = Static161.aClass11_15.anObjectArray27;
						local158.aClass11_18 = Static161.aClass11_15;
						local158.anInt3517 = local107;
						local158.anInt3510 = local80;
						Static45.method810(local158);
					}
					if (Static161.aClass11_16 != null && Static85.method1282(Static161.aClass11_15) != null) {
						Static38.aClass1_Sub14_Sub1_3.method3067(136);
						Static38.aClass1_Sub14_Sub1_3.method3020(Static161.aClass11_15.anInt272);
						Static38.aClass1_Sub14_Sub1_3.method3026(Static161.aClass11_15.anInt275);
						Static38.aClass1_Sub14_Sub1_3.method3011(Static161.aClass11_16.anInt272);
						Static38.aClass1_Sub14_Sub1_3.method3050(Static161.aClass11_16.anInt275);
					}
				} else if ((Static141.anInt2817 == 1 || Static141.method2092(Static152.anInt3135 - 1)) && Static152.anInt3135 > 2) {
					Static18.method406();
				} else if (Static152.anInt3135 > 0) {
					Static64.method1030(Static152.anInt3135 - 1);
				}
				Static161.aClass11_15 = null;
			}
		} else if (Static92.anInt1970 > 1) {
			Static161.aClass11_15 = null;
		}
	}
}
