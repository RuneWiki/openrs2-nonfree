import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[[Lclient!rga;")
	public static Class8_Sub3[][] aClass8_Sub3ArrayArray4;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)I")
	public static int method7179(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local24 >> 12) + 40960;
		return local18 * local33 >> 12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method7180() {
		@Pc(10) int local10 = 0;
		if (Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222)) {
			local10 = 55;
		}
		if (!Static348.aClass1_Sub30_Sub1_1.aBoolean397) {
			local10 |= 0x40;
		}
		Static424.method5869(local10);
		Static518.aClass96_4.method1932(local10);
		Static175.aClass114_4.method2212(local10);
		Static322.aClass326_2.method7239(local10);
		Static107.aClass200_3.method3958(local10);
		Static203.method3258(local10);
		Static446.method6518(local10);
		Static254.method3724(local10);
		Static541.method7395(local10);
		Static334.method4655();
	}
}
