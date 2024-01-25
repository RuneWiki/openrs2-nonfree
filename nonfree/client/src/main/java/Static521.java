import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sha", name = "Q", descriptor = "I")
	public static final int anInt8715 = 4;

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(IIIIIIII)V")
	public static void method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class5_Sub35 local7 = null;
		for (@Pc(12) Class5_Sub35 local12 = (Class5_Sub35) Static404.aClass306_36.method7313(); local12 != null; local12 = (Class5_Sub35) Static404.aClass306_36.method7301()) {
			if (arg4 == local12.anInt6492 && local12.anInt6495 == arg0 && local12.anInt6497 == arg6 && arg1 == local12.anInt6493) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub35();
			local7.anInt6495 = arg0;
			local7.anInt6493 = arg1;
			local7.anInt6497 = arg6;
			local7.anInt6492 = arg4;
			if (arg0 >= 0 && arg6 >= 0 && Static111.anInt1752 > arg0 && arg6 < Static279.anInt4567) {
				Static213.method3231(local7);
			}
			Static404.aClass306_36.method7303(local7);
		}
		local7.aBoolean539 = true;
		local7.anInt6491 = arg2;
		local7.anInt6494 = arg5;
		local7.aBoolean540 = false;
		local7.anInt6487 = arg3;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!bk;BIII)V")
	public static void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1 || arg4 < 1 || arg0 > Static111.anInt1752 - 2 || Static279.anInt4567 - 2 < arg4) {
			return;
		}
		if (Static535.aClass156ArrayArrayArray2 == null) {
			return;
		}
		@Pc(48) Interface20 local48 = Static121.aClass15_Sub1_2.method402(arg0, arg4, arg3, arg2);
		if (local48 == null) {
			return;
		}
		if (local48 instanceof Class14_Sub1_Sub1_Sub5) {
			((Class14_Sub1_Sub1_Sub5) local48).method4236(arg1);
			return;
		}
		if (!(local48 instanceof Class14_Sub1_Sub5_Sub2)) {
			if (local48 instanceof Class14_Sub1_Sub3_Sub2) {
				((Class14_Sub1_Sub3_Sub2) local48).method8020(arg1);
			} else if (local48 instanceof Class14_Sub1_Sub2_Sub2) {
				((Class14_Sub1_Sub2_Sub2) local48).method7891(arg1);
				return;
			}
			return;
		}
		((Class14_Sub1_Sub5_Sub2) local48).method7532(arg1);
		return;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!ft;)Lclient!ft;")
	public static Class5_Sub16_Sub1 method7483(@OriginalArg(1) Class5_Sub16_Sub1 arg0) {
		@Pc(14) Class5_Sub16_Sub1 local14 = arg0 == null ? new Class5_Sub16_Sub1() : new Class5_Sub16_Sub1(arg0);
		local14.method2592();
		return local14;
	}
}
