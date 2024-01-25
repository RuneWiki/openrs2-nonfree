import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fha", name = "m", descriptor = "I")
	public static int anInt3728;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!mb;[Lclient!pk;)V")
	public static void method3294(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class3_Sub27[] arg1) {
		@Pc(6) int local6;
		if (Static181.aBoolean367) {
			local6 = arg0.method8577(arg1);
			Static185.aClass33_8.method6203(local6, arg1);
		}
		if (Static524.aClass274Array3 == Static500.aClass274Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class2_Sub3_Sub1) {
				local6 = ((Class2_Sub3_Sub1) arg0).aShort121;
				local28 = ((Class2_Sub3_Sub1) arg0).aShort124;
			} else {
				local6 = arg0.anInt10428 >> Static276.anInt5846;
				local28 = arg0.anInt10424 >> Static276.anInt5846;
			}
			Static185.aClass33_8.EA(Static445.aClass274Array1[0].method8043(arg0.anInt10424, arg0.anInt10428), Static494.method7245(local6, local28), Static629.method8528(local6, local28), Static610.method8293(local6, local28));
		}
		@Pc(64) Class2_Sub6 local64 = arg0.method8566(Static185.aClass33_8);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean872) {
			@Pc(72) Class2_Sub5[] local72 = local64.aClass2_Sub5Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class2_Sub5 local79 = local72[local74];
				if (local79.aBoolean303) {
					Static241.method4616(local79.anInt3614 + local79.anInt3616, local79.anInt3613 - local79.anInt3616, local79.anInt3615 + local79.anInt3616, local79.anInt3617 - local79.anInt3616);
				}
			}
		}
		if (local64.aBoolean455) {
			local64.aClass2_Sub3_9 = arg0;
			if (Static441.aBoolean681) {
				@Pc(119) Class70 local119 = Static625.aClass70_2;
				synchronized (Static625.aClass70_2) {
					Static625.aClass70_2.method2570(local64);
					return;
				}
			}
			Static625.aClass70_2.method2570(local64);
			return;
		}
		Static295.method5066(local64);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(ILclient!rq;)Lclient!of;")
	public static Class243 method3296(@OriginalArg(1) Class2_Sub3_Sub1 arg0) {
		@Pc(14) Class243 local14;
		if (Static258.aClass243_2 == null) {
			local14 = new Class243();
		} else {
			local14 = Static258.aClass243_2;
			Static258.aClass243_2 = Static258.aClass243_2.aClass243_3;
			local14.aClass243_3 = null;
			Static363.anInt6996--;
		}
		local14.aClass2_Sub3_Sub1_1 = arg0;
		return local14;
	}
}
