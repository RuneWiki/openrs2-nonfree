import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFFI)F")
	public static float method1216(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return (arg1 - arg2) * arg0 + arg2;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V")
	public static void method1217(@OriginalArg(0) int arg0) {
		if (Static344.anInt6329 == arg0) {
			return;
		}
		Static237.anInt4563 = Static373.anInt6694 = Static102.anIntArray158[arg0];
		Static229.method4130();
		Static118.anIntArrayArray26 = new int[Static237.anInt4563][Static373.anInt6694];
		Static329.anIntArrayArrayArray18 = new int[4][Static237.anInt4563 >> 3][Static373.anInt6694 >> 3];
		Static499.anIntArrayArray114 = new int[Static237.anInt4563][Static373.anInt6694];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static362.aClass243Array5[local40] = Static142.method2644(Static373.anInt6694, Static237.anInt4563);
		}
		Static314.aByteArrayArrayArray12 = new byte[4][Static237.anInt4563][Static373.anInt6694];
		Static430.method8162(Static373.anInt6694, Static237.anInt4563);
		Static508.method7755(Static373.anInt6694 >> 3, Static455.aClass4_11, Static237.anInt4563 >> 3);
		Static344.anInt6329 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method1219(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static343.method8035(0, arg0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!dn;B)V")
	public static void method1221(@OriginalArg(0) Class69 arg0) {
		Static499.anInt8742 = 0;
		Static218.anInt4312 = 0;
		Static448.aClass184_36 = new Class184();
		Static413.aClass46_Sub3_Sub1_Sub1Array1 = new Class46_Sub3_Sub1_Sub1[1024];
		Static355.aClass46_Sub7Array1 = new Class46_Sub7[Static154.anIntArray263[Static431.anInt7490] + 1];
		Static256.anInt5004 = 0;
		Static153.anInt3001 = 0;
		Static431.method6694(arg0);
		Static140.method2619(arg0);
	}
}
