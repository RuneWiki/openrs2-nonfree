import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_137 = new Class397(35, -2);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt8131 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ee;[Lclient!jw;)V")
	public static void method6962(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class3_Sub5[] arg1) {
		@Pc(6) int local6;
		if (Static626.aBoolean647) {
			local6 = arg0.method9094(arg1);
			Static404.aClass22_6.method9350(local6, arg1);
		}
		if (Static378.aClass259Array2 == Static477.aClass259Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class9_Sub1_Sub1) {
				local6 = ((Class9_Sub1_Sub1) arg0).aShort123;
				local28 = ((Class9_Sub1_Sub1) arg0).aShort120;
			} else {
				local6 = arg0.anInt10694 >> Static626.anInt9669;
				local28 = arg0.anInt10695 >> Static626.anInt9669;
			}
			Static404.aClass22_6.EA(Static43.aClass259Array1[0].method9294(arg0.anInt10695, arg0.anInt10694), Static202.method3078(local6, local28), Static10.method361(local6, local28), Static549.method4751(local6, local28));
		}
		@Pc(64) Class9_Sub6 local64 = arg0.method9092(Static404.aClass22_6);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean724) {
			@Pc(74) Class9_Sub9[] local74 = local64.aClass9_Sub9Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class9_Sub9 local81 = local74[local76];
				if (local81.aBoolean719) {
					Static218.method3251(local81.anInt10617 + local81.anInt10620, local81.anInt10619 - local81.anInt10620, local81.anInt10616 + local81.anInt10620, local81.anInt10618 - local81.anInt10620);
				}
			}
		}
		if (local64.aBoolean452) {
			local64.aClass9_Sub1_18 = arg0;
			if (Static539.aBoolean563) {
				@Pc(127) Class386 local127 = Static673.aClass386_67;
				synchronized (Static673.aClass386_67) {
					Static673.aClass386_67.method8998(local64);
					return;
				}
			}
			Static673.aClass386_67.method8998(local64);
			return;
		}
		Static170.method2742(local64);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6963(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class292 local10 = Static631.method8307();
		@Pc(16) Class3_Sub29 local16 = Static507.method6901(Static702.aClass144_110, local10.aClass88_2);
		local16.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg1) + 1);
		local16.aClass3_Sub2_Sub1_1.method2073(arg1);
		local16.aClass3_Sub2_Sub1_1.method2065(arg0);
		local10.method6855(local16);
	}
}
