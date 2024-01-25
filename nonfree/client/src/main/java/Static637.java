import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_258 = new Class215(114, 4);

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static int anInt11024 = 1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZBI)V")
	public static void method9202(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(20) Class2_Sub52 local20 = Static130.method3019(Static531.aClass94_81, Static361.aClass183_1);
			local20.aClass2_Sub11_Sub2_7.method8333(arg1);
			Static96.method2563(local20);
		} else {
			Static284.method5149(Static393.aClass350_7, arg1, -1);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!cea;B)Lclient!nha;")
	public static Class224 method9204(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method8383();
		@Pc(14) Class309 local14 = Static409.method6629()[arg0.method8383()];
		@Pc(21) Class86 local21 = Static277.method5088()[arg0.method8383()];
		@Pc(25) int local25 = arg0.method8368();
		@Pc(29) int local29 = arg0.method8368();
		@Pc(33) int local33 = arg0.method8326();
		@Pc(37) int local37 = arg0.method8326();
		@Pc(41) int local41 = arg0.method8381();
		@Pc(45) int local45 = arg0.method8381();
		@Pc(49) int local49 = arg0.method8381();
		@Pc(66) boolean local66 = arg0.method8383() == 1;
		return new Class224(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local66);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method9205(@OriginalArg(1) Class20 arg0) {
		if (Static292.aBoolean464) {
			Static274.method5049(arg0);
		} else {
			Static519.method7866(arg0);
		}
	}
}
