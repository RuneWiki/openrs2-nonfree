import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!ir;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!rn;")
	public static Class18 aClass18_4;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!kp;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 128 || arg5 < 128 || (Static246.anInt4374 - 2) * 128 < arg1 || (Static185.anInt3485 - 2) * 128 < arg5) {
			Static355.anIntArray1252[0] = Static355.anIntArray1252[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static170.method3006(arg1, arg5, arg4) - arg0;
		Static18.aClass44_1.method3527(arg2, 0, 0);
		Static111.aClass63_3.method1961(Static18.aClass44_1);
		Static111.aClass63_3.method2035(arg1, local44, arg5, Static355.anIntArray1252);
		Static18.aClass44_1.method3527(-arg2, 0, 0);
		Static111.aClass63_3.method1961(Static18.aClass44_1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	public static void method796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
		Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_6.anInt444);
		Static372.aClass2_Sub16_Sub2_4.method5358(arg2);
		Static372.aClass2_Sub16_Sub2_4.method5358(arg3);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg0);
		Static372.aClass2_Sub16_Sub2_4.method5351(arg1);
		Static100.anInt2067 = 0;
		Static349.anInt4698 = 1;
		Static106.anInt2303 = -3;
		Static93.anInt1906 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!gf;IIIB)V")
	public static void method800(@OriginalArg(0) Class1_Sub5_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(33) int local33 = Static194.method3308(-4, true, Static58.aClass188Array1[arg0.aByte69], arg0.anIntArray1324[0], 0, 0, 0, 0, arg2, Static360.anIntArray1274, Static206.aClass1_Sub5_Sub1_Sub1_1.method5547(), Static48.anIntArray196, arg1, arg0.anIntArray1323[0]);
		if (local33 >= 1) {
			for (@Pc(45) int local45 = 0; local45 < local33 - 1; local45++) {
				arg0.method2246(Static360.anIntArray1274[local45], Static48.anIntArray196[local45], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
	public static void method803(@OriginalArg(1) int arg0) {
		Static165.anInt3177 = arg0;
		Static55.aClass160_9.method3595();
	}
}
