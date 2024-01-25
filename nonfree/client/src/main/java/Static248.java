import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "[Lclient!pi;")
	public static Class262[] aClass262Array2;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "[Lclient!rea;")
	public static Class21_Sub3_Sub1_Sub1[] aClass21_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_36 = new Class344(16, -1);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!i;)V")
	public static void method3963(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1) {
		Static255.aClass115Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	public static void method3971() {
		@Pc(9) Class167 local9 = Static461.aClass167_48;
		synchronized (Static461.aClass167_48) {
			Static461.aClass167_48.method3964(5);
		}
		local9 = Static526.aClass167_59;
		synchronized (Static526.aClass167_59) {
			Static526.aClass167_59.method3964(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLclient!ek;)Lclient!gaa;")
	public static Class117 method3972(@OriginalArg(1) Class4_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method7004();
		@Pc(14) Class347 local14 = Static302.method4802()[arg0.method7004()];
		@Pc(21) Class214 local21 = Static106.method1999()[arg0.method7004()];
		@Pc(25) int local25 = arg0.method7043();
		@Pc(35) int local35 = arg0.method7043();
		@Pc(39) int local39 = arg0.method7054();
		@Pc(43) int local43 = arg0.method7054();
		@Pc(47) int local47 = arg0.method6990();
		@Pc(51) int local51 = arg0.method6990();
		@Pc(55) int local55 = arg0.method6990();
		@Pc(66) boolean local66 = arg0.method7004() == 1;
		return new Class117(local7, local14, local21, local25, local35, local39, local43, local47, local51, local55, local66);
	}
}
