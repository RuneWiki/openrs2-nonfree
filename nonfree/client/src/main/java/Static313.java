import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Lclient!r;")
	public static Class197 aClass197_90;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Lclient!vq;")
	public static Class241 aClass241_5;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V", line = 24)
	public static void method5706(@OriginalArg(0) int arg0) {
		if (Class2_Sub3_Sub35.anInt6430 == arg0) {
			return;
		}
		if (Class2_Sub3_Sub35.anInt6430 == 0) {
			Static96.method2179();
		}
		if (arg0 == 40) {
			Static213.method4015();
		}
		if (arg0 != 40 && Static227.aClass111_2 != null) {
			Static227.aClass111_2.method2801();
			Static227.aClass111_2 = null;
		}
		if (Class2_Sub3_Sub35.anInt6430 == 25 || Class2_Sub3_Sub35.anInt6430 == 28) {
			Static266.aClass197_71.anInt5546 = 2;
			Static210.aClass197_61.anInt5546 = 2;
			Static365.aClass197_96.anInt5546 = 2;
			Static201.aClass197_57.anInt5546 = 2;
			Static57.aClass197_12.anInt5546 = 2;
			Static130.aClass197_35.anInt5546 = 2;
			Static162.aClass197_45.anInt5546 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Class206.anInt5730 = 0;
			Class101.anInt2691 = 0;
			Class2_Sub3_Sub8.anInt1586 = 1;
			Class167.anInt4498 = 0;
			Class2_Sub3_Sub20.anInt3537 = 1;
			Static224.method4193(true);
			Static266.aClass197_71.anInt5546 = 1;
			Static210.aClass197_61.anInt5546 = 1;
			Static365.aClass197_96.anInt5546 = 1;
			Static201.aClass197_57.anInt5546 = 1;
			Static57.aClass197_12.anInt5546 = 1;
			Static130.aClass197_35.anInt5546 = 1;
			Static162.aClass197_45.anInt5546 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static299.method5486();
		}
		if (arg0 == 5) {
			Static323.method5831(Static29.aClass197_5, Static177.aClass19_8);
		} else {
			Static63.method1774();
		}
		@Pc(146) boolean local146 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(165) boolean local165 = Class2_Sub3_Sub35.anInt6430 == 5 || Class2_Sub3_Sub35.anInt6430 == 10 || Class2_Sub3_Sub35.anInt6430 == 28;
		if (local146 != local165) {
			if (local146) {
				Class2_Sub3_Sub18.anInt3264 = Static90.anInt2046;
				if (Static203.aClass177_Sub1_2.anInt4879 == 0) {
					Static163.method1509();
				} else {
					Static230.method4151(Static203.aClass177_Sub1_2.anInt4879, Static94.aClass197_23, Static90.anInt2046);
				}
				Static264.aClass183_3.method4648(false);
			} else {
				Static163.method1509();
				Static264.aClass183_3.method4648(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static177.aClass19_8.method2806();
		}
		Class2_Sub3_Sub35.anInt6430 = arg0;
	}
}
