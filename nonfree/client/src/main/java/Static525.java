import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
	public static int anInt9013;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public static int anInt9039;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!rg;")
	public static Class310 aClass310_105;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Z")
	public static boolean aBoolean629 = false;

	@OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
	public static final boolean aBoolean630 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLclient!gg;)V")
	public static void method7779(@OriginalArg(1) Class4_Sub3_Sub3_Sub3_Sub2 arg0) {
		@Pc(18) Class14_Sub42 local18 = (Class14_Sub42) Static341.aClass125_19.method2630((long) arg0.anInt3238);
		if (local18 == null) {
			Static399.method6096(arg0.anIntArray200[0], arg0.aByte146, 0, arg0, (Class4_Sub3_Sub3_Sub3_Sub1) null, (Class128) null, arg0.anIntArray201[0]);
		} else {
			local18.method8234();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method7788(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(14) int local14;
		if (local9 == 0) {
			local14 = 0;
		} else {
			local14 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg2 + 7) / 8);
		@Pc(39) int local39 = -((arg4 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(47) int local47 = local39; local47 < 0; local47++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local14;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg0;
		}
		return false;
	}
}
