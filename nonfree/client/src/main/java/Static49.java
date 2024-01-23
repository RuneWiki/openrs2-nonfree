import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!lc;")
	public static Class98 aClass98_31;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!wh;")
	public static Class4_Sub2_Sub12 aClass4_Sub2_Sub12_1;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[Lclient!ri;")
	public static Class149[] aClass149Array1;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!dh;")
	public static Class33 aClass33_9 = new Class33(64);

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
	public static int anInt1021 = 0;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public static void method840() {
		aClass33_9 = null;
		aClass98_31 = null;
		aClass149Array1 = null;
		aClass4_Sub2_Sub12_1 = null;
		aStringArray8 = null;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZ)V")
	public static void method846(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static25.anInt448 != -1) {
				Static89.method1424(Static25.anInt448);
			}
			for (@Pc(25) Class4_Sub10 local25 = (Class4_Sub10) Static227.aClass97_16.method2363(); local25 != null; local25 = (Class4_Sub10) Static227.aClass97_16.method2367()) {
				Static284.method4279(local25, true);
			}
			Static25.anInt448 = -1;
			Static227.aClass97_16 = new Class97(8);
			Static225.method3587();
			Static25.anInt448 = Static168.anInt3351;
			Static161.method2519(false);
			Static85.method1340();
			Static170.method2676(Static25.anInt448);
		}
		Static240.anInt5014 = -1;
		Static156.method2477(Static156.anInt3142);
		Static239.aClass12_Sub3_Sub2_2 = new Class12_Sub3_Sub2();
		Static239.aClass12_Sub3_Sub2_2.anInt4141 = 3000;
		Static239.aClass12_Sub3_Sub2_2.anInt4113 = 3000;
		if (!Static178.aBoolean216 && Static132.anInt2784 == 0) {
			Static111.method1921(Static288.aClass98_66);
			Static264.method3976(10);
			return;
		}
		if (Static239.anInt4616 == 2) {
			Static211.anInt4210 = Static27.anInt1300 << 7;
			Static149.anInt3032 = Static246.anInt5549 << 7;
		} else {
			Static32.method478();
		}
		if (Static178.aBoolean216) {
			Static6.method133();
		}
		Static27.method1074();
		Static264.method3976(28);
	}
}
