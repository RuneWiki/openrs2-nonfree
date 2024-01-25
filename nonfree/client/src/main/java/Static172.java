import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	public static int anInt3366;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!wia;")
	public static Class386 aClass386_40;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static258.method3697(arg1, Static370.anInt10475, Static468.anInt355);
		@Pc(21) int local21 = Static258.method3697(arg0, Static370.anInt10475, Static468.anInt355);
		@Pc(27) int local27 = Static258.method3697(arg4, Static575.anInt9879, Static313.anInt9045);
		@Pc(33) int local33 = Static258.method3697(arg2, Static575.anInt9879, Static313.anInt9045);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static679.method9323(Static274.anIntArrayArray34[local35], local27, arg3, local33);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!mea;II)I")
	public static int method2779(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1) {
		if (!Static78.method1481(arg0).method5411(arg1) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray478 == null || arg1 >= arg0.anIntArray478.length) {
			return -1;
		} else {
			return arg0.anIntArray478[arg1];
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method2780() {
		for (@Pc(10) Class12_Sub9 local10 = (Class12_Sub9) Static532.aClass376_8.method9010(); local10 != null; local10 = (Class12_Sub9) Static532.aClass376_8.method9010()) {
			Static284.method4066(local10);
		}
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 1) {
			local36 = 0;
			local38 = 3;
		} else {
			local38 = Static673.anInt11161;
			local36 = Static673.anInt11161;
		}
		Static78.method1470();
		for (@Pc(47) int local47 = local36; local47 <= local38; local47++) {
			Static78.method1471();
			Static78.method1477(local47);
			Static78.method1485(local47);
		}
		Static78.method1474();
		Static78.method1486();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZI)V")
	public static void method2781(@OriginalArg(1) int arg0) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg0, 11);
		local14.method2822();
	}
}
