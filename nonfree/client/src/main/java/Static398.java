import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[Lclient!tq;")
	public static Class239[] aClass239Array2;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt6585 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!us;)V")
	public static void method5442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub42 arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(22) Class6_Sub12 local22 = (Class6_Sub12) Static23.aClass137_4.method3175(local16);
		if (local22 == null) {
			local22 = new Class6_Sub12();
			Static23.aClass137_4.method3179(local16, local22);
			local22.aClass88_21.method1878(arg3);
			return;
		}
		@Pc(45) Class32 local45 = Static354.aClass170_2.method3865(arg3.anInt6905);
		@Pc(57) int local57 = local45.anInt820;
		if (local45.anInt860 == 1) {
			local57 *= arg3.anInt6907 + 1;
		}
		for (@Pc(76) Class6_Sub42 local76 = (Class6_Sub42) local22.aClass88_21.method1882(); local76 != null; local76 = (Class6_Sub42) local22.aClass88_21.method1891()) {
			local45 = Static354.aClass170_2.method3865(local76.anInt6905);
			@Pc(87) int local87 = local45.anInt820;
			if (local45.anInt860 == 1) {
				local87 *= local76.anInt6907 + 1;
			}
			if (local57 > local87) {
				Static396.method5421(arg3, local76);
				return;
			}
		}
		local22.aClass88_21.method1878(arg3);
	}
}
