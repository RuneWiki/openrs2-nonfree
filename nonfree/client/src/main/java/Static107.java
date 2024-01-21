import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt2241;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1049 = Static32.method683("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!n", name = "m", descriptor = "[Lclient!ed;")
	public static Class22[] aClass22Array3 = new Class22[5000];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1819() {
		Static171.anInt3746 = -1;
		Static176.aClass2_Sub13_Sub1_14.anInt3940 = 0;
		Static37.anInt934 = 0;
		Static180.anInt3988 = 0;
		Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
		Static28.anInt626 = 0;
		Static14.anInt254 = -1;
		Static120.anInt2508 = -1;
		Static47.aBoolean40 = false;
		Static36.anInt924 = 0;
		Static102.anInt2167 = 0;
		Static76.anInt1566 = -1;
		Static133.anInt3713 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1.length; local35++) {
			if (Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local35] != null) {
				Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local35].anInt3556 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1.length; local57++) {
			if (Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local57] != null) {
				Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local57].anInt3556 = -1;
			}
		}
		Static64.method1103();
		Static33.method691(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static171.aBooleanArray18[local84] = true;
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public static void method1820() {
		aClass2_Sub2_Sub2_Sub3Array5 = null;
		aClass22Array3 = null;
		aClass49_1049 = null;
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	public static void method1821() {
		if (Static51.aClass57_3 != null) {
			Static51.aClass57_3.method1892();
			Static51.aClass57_3 = null;
		}
		Static110.method1894();
		Static24.method456();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static148.aClass48Array1[local17].method1589();
		}
		System.gc();
		Static45.method832();
		Static116.anInt2424 = -1;
		Static33.aBoolean32 = false;
		Static96.method1647();
		Static33.method691(10);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1822(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static181.aClass39_1);
		arg0.removeFocusListener(Static181.aClass39_1);
		Static71.anInt1459 = -1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method1823(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub19 local15 = (Class2_Sub19) Static70.aClass25_6.method836((long) arg0);
		if (local15 != null) {
			local15.method3007();
		}
	}
}
