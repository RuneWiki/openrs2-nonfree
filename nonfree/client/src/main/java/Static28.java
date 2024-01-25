import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt464 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)I")
	public static int method526(@OriginalArg(1) int arg0) {
		if (Static125.aClass11_5 != null) {
			Static125.aClass11_5.method138();
			Static125.aClass11_5 = null;
		}
		Static274.anInt5132++;
		if (Static274.anInt5132 > 4) {
			Static274.anInt5132 = 0;
			Static50.anInt862 = 0;
			return arg0;
		}
		if (Static133.anInt2755 == Static313.anInt5435) {
			Static313.anInt5435 = Static11.anInt154;
		} else {
			Static313.anInt5435 = Static133.anInt2755;
		}
		Static50.anInt862 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!wt;IIBI)V")
	public static void method528(@OriginalArg(0) Class4_Sub45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) long local20 = (long) (arg1 | arg3 << 28 | arg2 << 14);
		@Pc(26) Class4_Sub18 local26 = (Class4_Sub18) Static440.aClass102_40.method2700(local20);
		if (local26 == null) {
			local26 = new Class4_Sub18();
			Static440.aClass102_40.method2703(local20, local26);
			local26.aClass183_14.method4137(arg0);
			return;
		}
		@Pc(49) Class211 local49 = Static444.aClass206_3.method4703(arg0.anInt7355);
		@Pc(52) int local52 = local49.anInt6165;
		if (local49.anInt6164 == 1) {
			local52 *= arg0.anInt7356 + 1;
		}
		for (@Pc(71) Class4_Sub45 local71 = (Class4_Sub45) local26.aClass183_14.method4140(); local71 != null; local71 = (Class4_Sub45) local26.aClass183_14.method4144()) {
			local49 = Static444.aClass206_3.method4703(local71.anInt7355);
			@Pc(82) int local82 = local49.anInt6165;
			if (local49.anInt6164 == 1) {
				local82 *= local71.anInt7356 + 1;
			}
			if (local52 > local82) {
				Static245.method3597(local71, arg0);
				return;
			}
		}
		local26.aClass183_14.method4137(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method529() {
		Static297.aClass247ArrayArray2 = new Class247[Static356.aClass76_81.method2100()][];
		Static30.aClass247ArrayArray1 = new Class247[Static356.aClass76_81.method2100()][];
		Static453.aBooleanArray25 = new boolean[Static356.aClass76_81.method2100()];
	}
}
