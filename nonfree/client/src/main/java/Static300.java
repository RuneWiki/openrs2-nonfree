import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
	public static final int[] anIntArray733 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method4855() {
		if (Static128.aClass89_3 == null) {
			return;
		}
		Static320.aClass191_7.method4865();
		Static126.method2605();
		Static168.method3213();
		Static242.method3141();
		Static254.method4309();
		Static48.method4689();
		if (Static62.aClass46_1 != null) {
			Static62.aClass46_1.method1115();
		}
		Static85.method1808();
		Static143.method3641();
		Static21.method363();
		Static319.method5154(false);
		Static336.method3726();
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(42) Class22_Sub2_Sub1_Sub1 local42 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local37];
			if (local42 != null) {
				local42.anInterface1_3 = null;
				for (@Pc(49) int local49 = 0; local49 < local42.aClass31Array3.length; local49++) {
					local42.aClass31Array3[local49] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static69.aClass22_Sub2_Sub1_Sub2Array1.length; local73++) {
			@Pc(78) Class22_Sub2_Sub1_Sub2 local78 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local73];
			if (local78 != null) {
				for (@Pc(82) int local82 = 0; local82 < local78.aClass31Array3.length; local82++) {
					local78.aClass31Array3[local82] = null;
				}
			}
		}
		Static128.aClass89_3.method5387();
		Static128.aClass89_3 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)Lclient!k;")
	public static Class17 method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 76724863L ^ (long) arg0 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg2 * 475427L ^ (long) arg3 * 67481L ^ (long) arg1 * 97549L;
		@Pc(41) Class17 local41 = (Class17) Static77.aClass103_18.method2682(local33);
		if (local41 == null) {
			local41 = Static34.aClass89_1.method5412(arg3, arg1, arg2, arg4, arg0, arg5);
			Static77.aClass103_18.method2687(local41, local33);
			return local41;
		} else {
			return local41;
		}
	}
}
