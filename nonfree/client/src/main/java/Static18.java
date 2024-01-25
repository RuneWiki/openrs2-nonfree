import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
	public static int anInt238 = 500;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	public static void method271() {
		@Pc(13) Class5_Sub41 local13 = Static647.method8905(Static629.aClass381_257, Static4.aClass389_17.aClass393_2);
		local13.aClass5_Sub36_Sub2_1.method7324(Static260.method4249());
		local13.aClass5_Sub36_Sub2_1.method7296(Static85.anInt9921);
		local13.aClass5_Sub36_Sub2_1.method7296(Static256.anInt4629);
		local13.aClass5_Sub36_Sub2_1.method7324(Static577.aClass5_Sub19_25.aClass17_Sub29_1.method9175());
		Static4.aClass389_17.method9079(local13);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!ae;II)V")
	public static void method272(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 28 | arg0 << 14 | arg2);
		@Pc(22) Class5_Sub53 local22 = (Class5_Sub53) Static248.aClass306_18.method6943(local16);
		if (local22 == null) {
			local22 = new Class5_Sub53();
			Static248.aClass306_18.method6944(local22, local16, -12002);
			local22.aClass20_72.method370(arg1);
			return;
		}
		@Pc(49) Class246 local49 = Static82.aClass134_1.method3191(arg1.anInt118);
		@Pc(52) int local52 = local49.anInt6486;
		if (local49.anInt6474 == 1) {
			local52 *= arg1.anInt113 + 1;
		}
		for (@Pc(78) Class5_Sub2 local78 = (Class5_Sub2) local22.aClass20_72.method378(); local78 != null; local78 = (Class5_Sub2) local22.aClass20_72.method366()) {
			local49 = Static82.aClass134_1.method3191(local78.anInt118);
			@Pc(89) int local89 = local49.anInt6486;
			if (local49.anInt6474 == 1) {
				local89 *= local78.anInt113 + 1;
			}
			if (local52 > local89) {
				Static558.method7542(local78, arg1);
				return;
			}
		}
		local22.aClass20_72.method370(arg1);
	}
}
