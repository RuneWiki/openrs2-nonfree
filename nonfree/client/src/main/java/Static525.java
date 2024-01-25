import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	public static int anInt9590;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray38 = new boolean[5];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!cp;IIII)V")
	public static void method7767(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static242.method4280(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static223.anInt4520) {
			Static242.method4280(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static242.method4280(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static416.anInt10065) {
			Static242.method4280(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static416.anInt10065) {
			Static242.method4280(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static223.anInt4520 && arg4 <= Static416.anInt10065) {
			Static242.method4280(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static242.method4280(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static223.anInt4520 && arg4 > 0) {
			Static242.method4280(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!oa;)V")
	public static void method7768(@OriginalArg(1) Class15 arg0) {
		if (Static28.aClass183_2.method4799() == 0) {
			return;
		}
		@Pc(21) Class3_Sub49 local21;
		if (Static275.anInt5823 == 0) {
			for (local21 = (Class3_Sub49) Static28.aClass183_2.method4795(); local21 != null; local21 = (Class3_Sub49) Static28.aClass183_2.method4793()) {
				Static517.aClass23_2.method902(false, local21.anInt10002, Static598.aClass111_14, local21.anInt10004, local21.anInt10003, local21.anInt10005, local21.anInt10008, arg0, local21.aBoolean830 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null, false, arg0);
				local21.method8412();
			}
			Static210.method3686();
			return;
		}
		if (Static300.aClass15_13 == null) {
			@Pc(68) Canvas local68 = new Canvas();
			local68.setSize(36, 32);
			Static300.aClass15_13 = Static362.method5283(Static44.aClass254_17, local68, Static122.anInterface4_5, 0, 0);
			Static300.aClass111_11 = Static300.aClass15_13.method5346(Static155.method2986(Static580.anInt10228, Static289.aClass254_92), Static599.method813(Static579.aClass254_137, Static580.anInt10228));
		}
		for (local21 = (Class3_Sub49) Static28.aClass183_2.method4795(); local21 != null; local21 = (Class3_Sub49) Static28.aClass183_2.method4793()) {
			Static517.aClass23_2.method902(false, local21.anInt10002, Static300.aClass111_11, local21.anInt10004, local21.anInt10003, local21.anInt10005, local21.anInt10008, Static300.aClass15_13, local21.aBoolean830 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null, false, arg0);
			local21.method8412();
		}
	}
}
