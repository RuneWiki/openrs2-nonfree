import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt3434;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	public static int anInt3435;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_120 = new Class56(50, -1);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg5 < 0 || arg0 >= Static337.anInt5497 - 1 || Static282.anInt4644 - 1 <= arg5) {
			return;
		}
		if (Static432.aClass75ArrayArrayArray6 == null) {
			return;
		}
		@Pc(43) Interface4 local43;
		if (arg4 == 0) {
			local43 = (Interface4) Static14.method170(arg2, arg0, arg5);
			@Pc(49) Interface4 local49 = (Interface4) Static298.method3888(arg2, arg0, arg5);
			if (local43 != null && arg6 != 2) {
				if (local43 instanceof Class8_Sub2_Sub2) {
					((Class8_Sub2_Sub2) local43).aClass213_1.method4404(arg3);
				} else {
					Static382.method5072(arg1, arg0, arg2, arg3, arg4, arg5, local43.method5603(), arg6);
				}
			}
			if (local49 != null) {
				if (!(local49 instanceof Class8_Sub2_Sub2)) {
					Static382.method5072(arg1, arg0, arg2, arg3, arg4, arg5, local49.method5603(), arg6);
					return;
				}
				((Class8_Sub2_Sub2) local49).aClass213_1.method4404(arg3);
				return;
			}
			return;
		}
		if (arg4 != 1) {
			if (arg4 == 2) {
				local43 = (Interface4) Static64.method926(arg2, arg0, arg5, fw.class);
				if (local43 != null) {
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (!(local43 instanceof Class8_Sub3_Sub6)) {
						Static382.method5072(arg1, arg0, arg2, arg3, arg4, arg5, local43.method5603(), arg6);
						return;
					}
					((Class8_Sub3_Sub6) local43).aClass213_4.method4404(arg3);
					return;
				}
			} else if (arg4 == 3) {
				local43 = (Interface4) Static190.method2771(arg2, arg0, arg5);
				if (local43 == null) {
					return;
				}
				if (local43 instanceof Class8_Sub4_Sub3) {
					((Class8_Sub4_Sub3) local43).aClass213_3.method4404(arg3);
					return;
				}
				Static382.method5072(arg1, arg0, arg2, arg3, arg4, arg5, local43.method5603(), arg6);
			} else {
				return;
			}
			return;
		}
		local43 = (Interface4) Static169.method2325(arg2, arg0, arg5);
		if (local43 == null) {
			return;
		}
		if (local43 instanceof Class8_Sub5_Sub3) {
			((Class8_Sub5_Sub3) local43).aClass213_2.method4404(arg3);
			return;
		}
		@Pc(216) int local216 = local43.method5603();
		if (arg6 == 4 || arg6 == 5) {
			Static382.method5072(arg1, arg0, arg2, arg3, arg4, arg5, local216, 4);
			return;
		}
		if (arg6 != 6) {
			if (arg6 == 7) {
				Static382.method5072((arg1 + 2 & 0x3) + 4, arg0, arg2, arg3, arg4, arg5, local216, 4);
			} else if (arg6 == 8) {
				Static382.method5072(arg1 + 4, arg0, arg2, arg3, arg4, arg5, local216, 4);
				Static382.method5072((arg1 + 2 & 0x3) + 4, arg0, arg2, arg3, arg4, arg5, local216, 4);
				return;
			}
			return;
		}
		Static382.method5072(arg1 + 4, arg0, arg2, arg3, arg4, arg5, local216, 4);
		return;
	}
}
