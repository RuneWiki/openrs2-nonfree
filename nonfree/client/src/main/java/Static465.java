import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
	public static int anInt7972;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "[Lclient!iq;")
	public static Class160[] aClass160Array1;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BI)V")
	public static void method6404(@OriginalArg(1) int arg0) {
		Static459.method6336();
		@Pc(11) int local11 = Static409.aClass246_1.method5040(arg0).anInt9662;
		if (local11 == 0) {
			return;
		}
		@Pc(30) int local30 = Static430.aClass321_1.anIntArray654[arg0];
		if (local11 == 6) {
			Static447.anInt7728 = local30;
		}
		if (local11 == 5) {
			Static543.anInt9075 = local30;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!rga;[Lclient!rc;)V")
	public static void method6405(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) Class1_Sub18[] arg1) {
		@Pc(6) int local6;
		if (Static38.aBoolean55) {
			local6 = arg0.method7616(arg1);
			Static402.aClass134_11.method6953(local6, arg1);
		}
		if (Static557.aClass47Array3 == Static199.aClass47Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class8_Sub3_Sub3) {
				local6 = ((Class8_Sub3_Sub3) arg0).aShort132;
				local28 = ((Class8_Sub3_Sub3) arg0).aShort131;
			} else {
				local6 = arg0.anInt9365 >> Static351.anInt5832;
				local28 = arg0.anInt9370 >> Static351.anInt5832;
			}
			Static402.aClass134_11.YA(Static216.aClass47Array2[0].method7550(arg0.anInt9365, arg0.anInt9370), Static189.method2919(local6, local28), Static379.method5065(local6, local28), Static248.method3689(local6, local28));
		}
		@Pc(64) Class8_Sub5 local64 = arg0.method7630(Static402.aClass134_11);
		if (local64 == null) {
			return;
		}
		local64.aClass8_Sub3_1 = arg0;
		if (Static514.aBoolean677) {
			@Pc(73) Class209 local73 = Static544.aClass209_9;
			synchronized (Static544.aClass209_9) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class8_Sub5 local82 = (Class8_Sub5) Static544.aClass209_9.method4194(); local82 != null; local82 = (Class8_Sub5) Static544.aClass209_9.method4191()) {
					if (arg0.anInt9367 >= local82.aClass8_Sub3_1.anInt9367) {
						Static497.method4928(local64, local82);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static544.aClass209_9.method4190(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class8_Sub5 local122 = (Class8_Sub5) Static544.aClass209_9.method4194(); local122 != null; local122 = (Class8_Sub5) Static544.aClass209_9.method4191()) {
			if (arg0.anInt9367 >= local122.aClass8_Sub3_1.anInt9367) {
				Static497.method4928(local64, local122);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static544.aClass209_9.method4190(local64);
		}
	}
}
