import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public static int anInt2739;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lclient!e;")
	public static Interface7 anInterface7_4;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)[Lclient!lp;")
	public static Class188[] method2274() {
		return new Class188[] { Static557.aClass188_17, Static238.aClass188_7, Static167.aClass188_4, Static191.aClass188_6, Static438.aClass188_14, Static276.aClass188_8, Static560.aClass188_13, Static58.aClass188_1, Static169.aClass188_5, Static441.aClass188_15, Static303.aClass188_9, Static96.aClass188_2, Static546.aClass188_16, Static150.aClass188_3 };
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public static void method2275() {
		Static436.aClass4Array14 = null;
		Static332.aClass4Array11 = null;
		Static384.aClass4Array13 = null;
		Static408.aClass56_4 = null;
		Static174.aClass4Array6 = null;
		Static261.aClass4_14 = null;
		Static277.aClass4Array10 = null;
		Static567.aClass4Array15 = null;
		Static393.aClass4_22 = null;
		Static193.aClass4Array7 = null;
		Static113.aClass4Array2 = null;
		Static247.aClass4Array8 = null;
		Static85.aClass56_2 = null;
		Static248.aClass4Array9 = null;
		Static43.aClass56_1 = null;
		Static153.aClass4Array4 = null;
		Static52.aClass4Array1 = null;
		Static367.aClass4Array12 = null;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([SZ)[S")
	public static short[] method2277(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static585.method3078(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public static void method2279() {
		if (Static95.anInt1576 < 0) {
			Static230.anInt3922 = -1;
			Static95.anInt1576 = 0;
			Static331.anInt6297 = -1;
		}
		if (Static95.anInt1576 > Static349.anInt7466) {
			Static331.anInt6297 = -1;
			Static230.anInt3922 = -1;
			Static95.anInt1576 = Static349.anInt7466;
		}
		if (Static387.anInt6906 < 0) {
			Static387.anInt6906 = 0;
			Static331.anInt6297 = -1;
			Static230.anInt3922 = -1;
		}
		if (Static349.anInt7463 < Static387.anInt6906) {
			Static387.anInt6906 = Static349.anInt7463;
			Static230.anInt3922 = -1;
			Static331.anInt6297 = -1;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)V")
	public static void method2280(@OriginalArg(1) boolean arg0) {
		if (Static225.aClass71_1 != null) {
			Static225.aClass71_1.method5970();
			Static225.aClass71_1 = null;
		}
		Static141.anInt2537 = 0;
		Static244.method3524();
		Static121.method1820();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static296.aClass295Array3[local24].method6550();
		}
		Static544.method7513(false);
		System.gc();
		Static244.method3520();
		Static150.aBoolean182 = false;
		Static524.anInt8993 = -1;
		Static141.method2143(true);
		Static228.anInt3904 = 0;
		Static49.anInt823 = 0;
		Static274.anInt3319 = 0;
		Static167.anInt3048 = 0;
		Static218.anInt3718 = 0;
		Static374.anInt6445 = 0;
		for (@Pc(67) int local67 = 0; local67 < Static34.aClass129Array4.length; local67++) {
			Static34.aClass129Array4[local67] = null;
		}
		Static223.method3238();
		for (@Pc(86) int local86 = 0; local86 < 2048; local86++) {
			Static346.aClass29_Sub2_Sub1_Sub2Array1[local86] = null;
		}
		Static516.anInt8936 = 0;
		Static31.aClass212_1.method5110();
		Static505.anInt8419 = 0;
		Static303.aClass212_22.method5110();
		Static361.method5344();
		Static138.anInt2445 = 0;
		Static505.aClass30_1.method499();
		Static543.method7509();
		Static248.method3540();
		Static404.aLong185 = 0L;
		Static154.aClass6_Sub15_2 = null;
		if (arg0) {
			Static99.method1593(12);
			return;
		}
		Static99.method1593(3);
		try {
			Static587.method3349(Static189.anApplet4, "loggedout");
		} catch (@Pc(139) Throwable local139) {
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZI)I")
	public static int method2281(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}
}
