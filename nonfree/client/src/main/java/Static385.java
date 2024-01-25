import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mba", name = "Wg", descriptor = "[I")
	public static int[] anIntArray420 = new int[8];

	@OriginalMember(owner = "client!mba", name = "Ei", descriptor = "[I")
	public static final int[] anIntArray421 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!mba", name = "C", descriptor = "(B)V")
	public static void method5735() {
		Static672.aClass43_30 = null;
		Static107.aClass43_3 = null;
		Static160.aClass43_16 = null;
		Static705.aClass43_31 = null;
		Static467.aClass43Array17 = null;
		Static539.aClass43_25 = null;
		Static236.aClass43_18 = null;
		Static164.aClass43_17 = null;
		Static625.aClass43_28 = null;
	}

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "(II)V")
	public static void method5740(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(9, (long) arg0);
		local16.method6245();
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZLclient!et;)Lclient!nc;")
	public static Class33 method5741(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(10) Class18 local10 = Static562.method7826()[arg0.method8581(-17416)];
		@Pc(26) Class239 local26 = Static505.method7161()[arg0.method8581(-17416)];
		@Pc(30) int local30 = arg0.method8598();
		@Pc(34) int local34 = arg0.method8598();
		@Pc(38) int local38 = arg0.method8575();
		@Pc(42) int local42 = arg0.method8575();
		@Pc(46) int local46 = arg0.method8598();
		@Pc(50) int local50 = arg0.method8555(-9372);
		@Pc(54) int local54 = arg0.method8555(-9372);
		return new Class33(local10, local26, local30, local34, local38, local42, local46, local50, local54);
	}
}
