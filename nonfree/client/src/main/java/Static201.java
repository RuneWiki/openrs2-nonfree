import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "[I")
	public static final int[] anIntArray211 = new int[1000];

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	public static int anInt4069 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!wb;Lclient!wb;B)V")
	public static void method3741(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg1.aClass6_340 != null) {
			arg1.method9051();
		}
		arg1.aClass6_340 = arg0.aClass6_340;
		arg1.aClass6_339 = arg0;
		arg1.aClass6_340.aClass6_339 = arg1;
		arg1.aClass6_339.aClass6_340 = arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!hia;IIII)V")
	public static void method3743(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg2 << 28 | arg3 << 14);
		@Pc(22) Class6_Sub36 local22 = (Class6_Sub36) Static650.aClass74_72.method1401(local16);
		if (local22 == null) {
			local22 = new Class6_Sub36();
			Static650.aClass74_72.method1399(local22, local16);
			local22.aClass340_42.method8131(arg0);
			return;
		}
		@Pc(52) Class282 local52 = Static149.aClass244_1.method5958(arg0.anInt4411);
		@Pc(55) int local55 = local52.anInt7933;
		if (local52.anInt7877 == 1) {
			local55 *= arg0.anInt4410 + 1;
		}
		for (@Pc(74) Class6_Sub23 local74 = (Class6_Sub23) local22.aClass340_42.method8124(); local74 != null; local74 = (Class6_Sub23) local22.aClass340_42.method8134()) {
			local52 = Static149.aClass244_1.method5958(local74.anInt4411);
			@Pc(85) int local85 = local52.anInt7933;
			if (local52.anInt7877 == 1) {
				local85 *= local74.anInt4410 + 1;
			}
			if (local85 < local55) {
				method3741(local74, arg0);
				return;
			}
		}
		local22.aClass340_42.method8131(arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IFFF)F")
	public static float method3744(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}
}
