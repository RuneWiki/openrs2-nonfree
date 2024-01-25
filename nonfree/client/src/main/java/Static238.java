import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_46 = new Class236(42, 3);

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_122 = new Class150(21, 3);

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	public static int anInt4813 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public static void method4072() {
		for (@Pc(15) Class5_Sub47 local15 = (Class5_Sub47) Static521.aClass99_78.method2526(); local15 != null; local15 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			if (Static252.method4282(local15.anInt8474)) {
				Static35.method828(local15);
			}
		}
		if (Static257.anInt5147 == 1) {
			Static454.method6370();
			return;
		}
		Static340.method5293(Static122.anInt2575, Static221.anInt4157, Static159.anInt3261, Static142.anInt2984);
		@Pc(52) int local52 = Static312.aClass256_7.method6113(Static400.aClass40_112.method1063(Static194.anInt3737));
		for (@Pc(57) Class5_Sub47 local57 = (Class5_Sub47) Static521.aClass99_78.method2526(); local57 != null; local57 = (Class5_Sub47) Static521.aClass99_78.method2519()) {
			@Pc(63) int local63 = Static201.method3300(local57);
			if (local52 < local63) {
				local52 = local63;
			}
		}
		Static142.anInt2984 = local52 + 8;
		Static221.anInt4157 = Static257.anInt5147 * 16 + (Static8.aBoolean8 ? 26 : 22);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(JIBI)V")
	public static void method4074(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static534.method7283(arg2, 0, local15, local22, arg1, 0, true, 0);
			return;
		}
		@Pc(47) Class283 local47 = Static453.aClass88_3.method2294(local29);
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (local22 == 0 || local22 == 2) {
			local55 = local47.anInt8184;
			local58 = local47.anInt8153;
		} else {
			local58 = local47.anInt8184;
			local55 = local47.anInt8153;
		}
		@Pc(69) int local69 = local47.anInt8145;
		if (local22 != 0) {
			local69 = (local69 << local22 & 0xF) + (local69 >> 4 - local22);
		}
		Static534.method7283(arg2, local69, 0, 0, arg1, local55, true, local58);
	}
}
