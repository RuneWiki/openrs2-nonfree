import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static612 {

	@OriginalMember(owner = "client!ufa", name = "H", descriptor = "I")
	public static int anInt10103 = -1;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public static void method8633() {
		Static557.method7596();
		Static581.aClass47_3 = null;
		Static240.aClass366_1 = null;
		Static556.aClass342ArrayArray1 = null;
		Static197.aClass47_1 = null;
		Static290.aClass366_3 = null;
		Static629.aClass47_4 = null;
		Static127.aClass144_17 = null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IB)V")
	public static void method8634(@OriginalArg(0) int arg0) {
		if (Static686.anInt11152 == 1) {
			Static493.anInt8525 = arg0;
		} else if (Static686.anInt11152 == 2) {
			Static203.anInt3512 = arg0;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!rg;ZIIIZI)V")
	public static void method8638(@OriginalArg(0) Class310 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (arg3 <= 0) {
			Static494.method7429(arg1, arg0, arg2);
			return;
		}
		Static210.anInt3677 = arg1;
		Static485.anInt8392 = arg2;
		Static270.aBoolean372 = false;
		Static431.aClass310_93 = arg0;
		Static316.anInt5540 = 0;
		Static556.aClass14_Sub1_Sub3_4 = null;
		Static625.anInt11174 = 1;
		Static338.anInt5769 = Static472.aClass14_Sub1_Sub3_3.method1918() / arg3;
		if (Static338.anInt5769 < 1) {
			Static338.anInt5769 = 1;
		}
	}
}
