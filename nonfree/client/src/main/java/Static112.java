import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!kp;IZ)I")
	public static int method1676(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		if (!Static67.method1102(arg0).method5423(arg1) && arg0.anObjectArray30 == null) {
			return -1;
		} else if (arg0.anIntArray352 == null || arg0.anIntArray352.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray352[arg1];
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!lo;Z)V")
	public static void method1678(@OriginalArg(0) Class6_Sub1 arg0) {
		if (Static293.aBoolean419) {
			Static140.aClass72Array1[Static140.aClass72Array1.length - 1].method1351(arg0);
		} else {
			Static372.method5513(arg0, Static507.aClass2_Sub14Array5);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!r;)V")
	public static void method1679(@OriginalArg(1) Class100 arg0) {
		if (Static221.aClass8_23.method214() == 0) {
			return;
		}
		@Pc(57) Class2_Sub51 local57;
		if (Static391.anInt6846 == 0) {
			for (local57 = (Class2_Sub51) Static221.aClass8_23.method210(); local57 != null; local57 = (Class2_Sub51) Static221.aClass8_23.method218()) {
				Static296.aClass218_1.method5055(local57.anInt9586, false, arg0, local57.anInt9582, local57.aBoolean731 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null, false, local57.anInt9583, arg0, local57.anInt9587, Static45.aClass29_3, local57.anInt9585);
				local57.method7966();
			}
			Static139.method2348();
			return;
		}
		if (Static273.aClass100_5 == null) {
			@Pc(25) Canvas local25 = new Canvas();
			local25.setSize(36, 32);
			Static273.aClass100_5 = Static448.method6213(0, 0, Static391.anInterface5_8, local25, Static355.aClass259_114);
			Static264.aClass29_7 = Static273.aClass100_5.method6225(Static437.method6281(Static72.aClass259_33, Static377.anInt6694), Static596.method254(Static490.aClass259_153, Static377.anInt6694));
		}
		for (local57 = (Class2_Sub51) Static221.aClass8_23.method210(); local57 != null; local57 = (Class2_Sub51) Static221.aClass8_23.method218()) {
			Static296.aClass218_1.method5055(local57.anInt9586, false, Static273.aClass100_5, local57.anInt9582, local57.aBoolean731 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null, false, local57.anInt9583, arg0, local57.anInt9587, Static264.aClass29_7, local57.anInt9585);
			local57.method7966();
		}
	}
}
