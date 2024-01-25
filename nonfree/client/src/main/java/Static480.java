import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!re;")
	public static final Class320 aClass320_6 = new Class320();

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "S")
	public static short aShort104 = 320;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I")
	public static int method6887(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)I")
	public static int method6888(@OriginalArg(1) int arg0) {
		@Pc(25) byte local25;
		if (arg0 > 12000) {
			Static302.method4224();
			local25 = 4;
		} else if (arg0 > 5000) {
			local25 = 3;
			Static46.method598();
		} else if (arg0 > 2000) {
			Static441.method6385();
			local25 = 2;
		} else {
			local25 = 1;
			Static299.method4190();
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 2) {
			Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
			Static213.method2982(false, 2);
		}
		Static610.method9380();
		return local25;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	public static void method6889() {
		Static33.aClass85_3.method1742(5);
	}
}
