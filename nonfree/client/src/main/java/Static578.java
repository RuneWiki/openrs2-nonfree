import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!wm;")
	public static Class150 aClass150_3;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!em;B)V")
	public static void method8054(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(11) Class6_Sub35 local11 = (Class6_Sub35) Static635.aClass74_71.method1401((long) arg0.anInt4845);
		if (local11 == null) {
			Static268.method4558(arg0, arg0.anIntArray264[0], 0, arg0.anIntArray263[0], (Class60_Sub1_Sub1_Sub3_Sub2) null, (Class125) null, arg0.aByte135);
		} else {
			local11.method5556();
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method8055() {
		if (Static188.method3527(Static37.anInt498)) {
			Static166.method3296(false);
		} else {
			Static491.aClass141_2 = Static525.aClass260_4.aClass141_1;
			Static525.aClass260_4.aClass141_1 = null;
			Static307.method4889(14);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!qu;Lclient!ka;Lclient!qu;)V")
	public static void method8057(@OriginalArg(1) Class104 arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) Class104 arg2) {
		if (arg2.method9023() && arg0.method9023()) {
			@Pc(12) Class212 local12 = arg2.aClass212_4;
			@Pc(15) Class212 local15 = arg0.aClass212_4;
			arg1.method7419(arg0.aClass6_Sub2_Sub5_8, local12.aBooleanArray18, local12.anIntArray325[arg2.anInt10501], arg0.anInt10518, local15.anIntArray325[arg0.anInt10501], arg2.anInt10500, arg2.aClass6_Sub2_Sub5_8, arg0.aClass6_Sub2_Sub5_7, arg2.anInt10518, arg0.anInt10500, arg2.anInt10503, local15.aBoolean414 | local12.aBoolean414, arg2.aClass6_Sub2_Sub5_7, arg0.anInt10503);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
	public static void method8058() {
		for (@Pc(1) int local1 = 0; local1 < Static630.aClass106Array2.length; local1++) {
			Static630.aClass106Array2[local1].method2904();
		}
		Static630.aClass106Array2 = null;
	}
}
