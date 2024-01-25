import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public static int anInt6013;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public static int anInt6011 = 0;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
	public static void method5029(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static55.aClass3_Sub10_Sub5_2 != null) {
			Static116.anInt2051 = Static55.aClass3_Sub10_Sub5_2.anInt1886;
		} else {
			Static116.anInt2051 = -1;
		}
		Static133.anInt2744 = 0;
		Static55.aClass3_Sub10_Sub5_2 = null;
		Static325.aClass71_47 = null;
		Static303.aClass245_11 = null;
		Static55.method1836();
		Static55.aClass71_19.method2088();
		Static509.aClass106_9 = null;
		Static192.aClass106_6 = null;
		Static456.aClass119_31 = null;
		Static55.aClass82_2 = null;
		Static131.aClass106_2 = null;
		Static131.aClass106_3 = null;
		Static480.aClass106_8 = null;
		Static98.aClass106_1 = null;
		Static152.anInt3124 = -1;
		Static531.anInt9235 = -1;
		Static499.aClass106_5 = null;
		Static446.aClass106_7 = null;
		if (Static55.aClass135_2 != null) {
			Static55.aClass135_2.method3807();
			Static55.aClass135_2.method3800(128, 64);
		}
		if (Static55.aClass198_5 != null) {
			Static55.aClass198_5.method5096(64, 64);
		}
		if (Static55.aClass298_2 != null) {
			Static55.aClass298_2.method7188(64);
		}
		Static231.aClass280_1.method6919(64);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5030(@OriginalArg(1) String arg0) {
		Static536.method7668("", 0, arg0, "", 0, "");
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z")
	public static boolean method5031() {
		if (Static512.anInt8932 < 1) {
			return false;
		} else {
			return Static464.aClass253_15 != Static327.aClass253_10 || Static353.anInt6659 >= 2;
		}
	}
}
