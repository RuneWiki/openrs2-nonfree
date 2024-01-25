import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_68 = new Class216(89, 4);

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	public static void method3126() {
		Static449.aClass33_11.L(Static401.anInt5840, Static124.aClass4_Sub20_4.aClass8_Sub25_1.method7779() == 1 ? Static177.anInt3089 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg2 < 0 || arg0 >= Static224.anInt3557 - 1 || Static267.anInt4309 - 1 <= arg2) {
			return;
		}
		if (Static267.aClass73ArrayArrayArray2 == null) {
			return;
		}
		@Pc(46) Interface20 local46;
		if (arg3 == 0) {
			local46 = (Interface20) Static572.method7588(arg6, arg0, arg2);
			@Pc(52) Interface20 local52 = (Interface20) Static609.method7996(arg6, arg0, arg2);
			if (local46 != null && arg1 != 2) {
				if (local46 instanceof Class3_Sub1_Sub4_Sub1) {
					((Class3_Sub1_Sub4_Sub1) local46).aClass244_1.method5010(arg4);
				} else {
					Static565.method7486(arg5, local46.method7087(), arg0, arg2, arg4, arg3, arg1, arg6);
				}
			}
			if (local52 != null) {
				if (!(local52 instanceof Class3_Sub1_Sub4_Sub1)) {
					Static565.method7486(arg5, local52.method7087(), arg0, arg2, arg4, arg3, arg1, arg6);
					return;
				}
				((Class3_Sub1_Sub4_Sub1) local52).aClass244_1.method5010(arg4);
				return;
			}
			return;
		}
		if (arg3 == 1) {
			local46 = (Interface20) Static273.method3954(arg6, arg0, arg2);
			if (local46 != null) {
				if (local46 instanceof Class3_Sub1_Sub3_Sub2) {
					((Class3_Sub1_Sub3_Sub2) local46).aClass244_3.method5010(arg4);
					return;
				}
				@Pc(129) int local129 = local46.method7087();
				if (arg1 == 4 || arg1 == 5) {
					Static565.method7486(arg5, local129, arg0, arg2, arg4, arg3, 4, arg6);
				} else if (arg1 == 6) {
					Static565.method7486(arg5 + 4, local129, arg0, arg2, arg4, arg3, 4, arg6);
					return;
				} else if (arg1 == 7) {
					Static565.method7486((arg5 + 2 & 0x3) + 4, local129, arg0, arg2, arg4, arg3, 4, arg6);
					return;
				} else if (arg1 == 8) {
					Static565.method7486(arg5 + 4, local129, arg0, arg2, arg4, arg3, 4, arg6);
					Static565.method7486((arg5 + 2 & 0x3) + 4, local129, arg0, arg2, arg4, arg3, 4, arg6);
					return;
				}
				return;
			}
			return;
		}
		if (arg3 != 2) {
			if (arg3 == 3) {
				local46 = (Interface20) Static191.method2972(arg6, arg0, arg2);
				if (local46 != null) {
					if (!(local46 instanceof Class3_Sub1_Sub5_Sub2)) {
						Static565.method7486(arg5, local46.method7087(), arg0, arg2, arg4, arg3, arg1, arg6);
						return;
					}
					((Class3_Sub1_Sub5_Sub2) local46).aClass244_4.method5010(arg4);
					return;
				}
			}
			return;
		}
		local46 = (Interface20) Static130.method2321(arg6, arg0, arg2, qb.class);
		if (local46 == null) {
			return;
		}
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (!(local46 instanceof Class3_Sub1_Sub2_Sub4)) {
			Static565.method7486(arg5, local46.method7087(), arg0, arg2, arg4, arg3, arg1, arg6);
			return;
		}
		((Class3_Sub1_Sub2_Sub4) local46).aClass244_2.method5010(arg4);
		return;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V")
	public static void method3129(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub5_Sub11 local14 = Static652.method8695((long) arg0, 17);
		local14.method3956();
	}
}
