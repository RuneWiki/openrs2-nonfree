import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "J")
	public static long aLong165;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!qfa;B)Lclient!sla;")
	public static Class343 method4075(@OriginalArg(0) Class19_Sub1_Sub3 arg0) {
		@Pc(9) Class343 local9;
		if (Static57.aClass343_3 == null) {
			local9 = new Class343();
		} else {
			local9 = Static57.aClass343_3;
			Static57.aClass343_3 = Static57.aClass343_3.aClass343_4;
			local9.aClass343_4 = null;
			Static283.anInt5144--;
		}
		local9.aClass19_Sub1_Sub3_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4077(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class400 local16 = Static81.method1057();
		@Pc(22) Class3_Sub48 local22 = Static89.method1200(Static695.aClass286_128, local16.aClass399_2);
		local22.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg0));
		local22.aClass3_Sub28_Sub2_1.method5283(arg0);
		local16.method9223(local22);
	}
}
