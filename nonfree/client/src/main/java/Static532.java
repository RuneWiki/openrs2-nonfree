import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!qka", name = "m", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!qka", name = "l", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_32 = new Class320(10);

	@OriginalMember(owner = "client!qka", name = "k", descriptor = "I")
	public static int anInt8283 = 0;

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "([BI)[B")
	public static byte[] method7079(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) byte[] local20 = new byte[arg0.length];
			Static732.method6320(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(III)V")
	public static void method7080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static422.aClass309_8 == Static346.aClass309_6) {
			if (Static671.method8997(0, 1, 1, arg1, 0, -2, false, arg0)) {
				return;
			}
			Static671.method8997(0, 1, 1, arg1, 0, -3, false, arg0);
		} else if (Static671.method8997(0, 1, 1, arg1, 0, -3, false, arg0)) {
			return;
		} else {
			Static671.method8997(0, 1, 1, arg1, 0, -2, false, arg0);
		}
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(Z)V")
	public static void method7081() {
		if (Static153.aClass22_4 == null) {
			return;
		}
		if (Static347.aBoolean360) {
			Static510.method6922();
		}
		Static673.aClass386_67.method9000();
		Static61.method1407();
		Static527.method7039();
		Static494.method6740();
		Static520.method6985();
		Static55.method1305();
		Static86.method1878();
		Static473.method6434();
		Static346.method4912();
		Static523.method7009();
		Static588.method7597(false);
		for (@Pc(47) int local47 = 0; local47 < 2048; local47++) {
			@Pc(53) Class9_Sub1_Sub1_Sub2_Sub1 local53 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local47];
			if (local53 != null) {
				for (@Pc(57) int local57 = 0; local57 < local53.aClass170Array3.length; local57++) {
					local53.aClass170Array3[local57] = null;
				}
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static568.anInt8629; local80++) {
			@Pc(87) Class9_Sub1_Sub1_Sub2_Sub2 local87 = Static169.aClass3_Sub52Array1[local80].aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local87 != null) {
				for (@Pc(91) int local91 = 0; local91 < local87.aClass170Array3.length; local91++) {
					local87.aClass170Array3[local91] = null;
				}
			}
		}
		Static158.aClass58_1 = null;
		Static598.aClass58_9 = null;
		Static153.aClass22_4.method9397();
		Static153.aClass22_4 = null;
	}
}
