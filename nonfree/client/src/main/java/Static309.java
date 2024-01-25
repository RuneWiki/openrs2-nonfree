import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "Lclient!li;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!tq", name = "S", descriptor = "Lclient!pi;")
	public static Class30 aClass30_5;

	@OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
	public static int anInt5826;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_100 = new Class70(2);

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "S")
	public static short aShort85 = 320;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
	public static int anInt5825 = 0;

	@OriginalMember(owner = "client!tq", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString268 = "Hidden";

	@OriginalMember(owner = "client!tq", name = "R", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg0 < 0 || arg1 >= Static153.anInt2883 - 1 || Static246.anInt4606 - 1 <= arg0) {
			return;
		}
		if (Static39.aClass187ArrayArrayArray1 == null) {
			return;
		}
		@Pc(42) Interface7 local42;
		if (arg4 == 0) {
			local42 = (Interface7) Static9.method161(arg3, arg1, arg0);
			@Pc(48) Interface7 local48 = (Interface7) Static62.method1002(arg3, arg1, arg0);
			if (local42 != null && arg2 != 2) {
				if (local42 instanceof Class44_Sub5_Sub2) {
					((Class44_Sub5_Sub2) local42).aClass38_4.method782(arg5);
				} else {
					Static144.method2694(arg0, arg3, arg1, arg6, arg4, arg5, arg2, local42.method5799());
				}
			}
			if (local48 != null) {
				if (!(local48 instanceof Class44_Sub5_Sub2)) {
					Static144.method2694(arg0, arg3, arg1, arg6, arg4, arg5, arg2, local48.method5799());
					return;
				}
				((Class44_Sub5_Sub2) local48).aClass38_4.method782(arg5);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			local42 = (Interface7) Static105.method2135(arg3, arg1, arg0);
			if (local42 != null) {
				if (local42 instanceof Class44_Sub1_Sub1) {
					((Class44_Sub1_Sub1) local42).aClass38_1.method782(arg5);
					return;
				}
				@Pc(130) int local130 = local42.method5799();
				if (arg2 != 4 && arg2 != 5) {
					if (arg2 == 6) {
						Static144.method2694(arg0, arg3, arg1, arg6 + 4, arg4, arg5, 4, local130);
					} else if (arg2 == 7) {
						Static144.method2694(arg0, arg3, arg1, (arg6 + 2 & 0x3) + 4, arg4, arg5, 4, local130);
						return;
					} else if (arg2 == 8) {
						Static144.method2694(arg0, arg3, arg1, arg6 + 4, arg4, arg5, 4, local130);
						Static144.method2694(arg0, arg3, arg1, (arg6 + 2 & 0x3) + 4, arg4, arg5, 4, local130);
						return;
					}
					return;
				}
				Static144.method2694(arg0, arg3, arg1, arg6, arg4, arg5, 4, local130);
				return;
			}
			return;
		}
		if (arg4 == 2) {
			local42 = (Interface7) Static162.method3236(arg3, arg1, arg0, sc.class);
			if (local42 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (!(local42 instanceof Class44_Sub4_Sub1)) {
					Static144.method2694(arg0, arg3, arg1, arg6, arg4, arg5, arg2, local42.method5799());
					return;
				}
				((Class44_Sub4_Sub1) local42).aClass38_2.method782(arg5);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		local42 = (Interface7) Static68.method4012(arg3, arg1, arg0);
		if (local42 == null) {
			return;
		}
		if (!(local42 instanceof Class44_Sub3_Sub2)) {
			Static144.method2694(arg0, arg3, arg1, arg6, arg4, arg5, arg2, local42.method5799());
			return;
		}
		((Class44_Sub3_Sub2) local42).aClass38_3.method782(arg5);
		return;
	}
}
