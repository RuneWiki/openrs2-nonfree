import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!hq;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_13 = new Class187(9, 4);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static110.anInt2597 && arg8 <= Static459.anInt7524 && Static110.anInt2597 <= arg0 && arg0 <= Static459.anInt7524 && Static110.anInt2597 <= arg1 && arg1 <= Static459.anInt7524 && Static110.anInt2597 <= arg5 && Static459.anInt7524 >= arg5 && arg2 >= Static385.anInt6630 && arg2 <= Static69.anInt1918 && arg6 >= Static385.anInt6630 && arg6 <= Static69.anInt1918 && arg4 >= Static385.anInt6630 && arg4 <= Static69.anInt1918 && Static385.anInt6630 <= arg3 && arg3 <= Static69.anInt1918) {
			Static184.method3179(arg5, arg7, arg6, arg8, arg0, arg4, arg1, arg3, arg2);
		} else {
			Static514.method6875(arg4, arg1, arg8, arg2, arg3, arg6, arg5, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Lclient!bu;")
	public static Class3_Sub3_Sub7 method5457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = (Class3_Sub3_Sub7) Static142.aClass310_10.method6601((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class3_Sub3_Sub7(arg1, arg0);
			Static142.aClass310_10.method6603(local15, local15.aLong273);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public static void method5458(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static138.anInt2946 == 2) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[0]);
				Static488.aClass313Array1[1].method6673(Static366.aClass66Array1[1]);
			} else if (Static138.anInt2946 == 3) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[0]);
				Static488.aClass313Array1[1].method6673(Static366.aClass66Array1[1]);
				Static488.aClass313Array1[2].method6673(Static366.aClass66Array1[2]);
			} else {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[0]);
				Static488.aClass313Array1[1].method6673(Static366.aClass66Array1[1]);
				Static488.aClass313Array1[2].method6673(Static366.aClass66Array1[2]);
				Static488.aClass313Array1[3].method6673(Static366.aClass66Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static138.anInt2946 == 2) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[2]);
			} else if (Static138.anInt2946 == 3) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[3]);
				Static488.aClass313Array1[1].method6673(Static366.aClass66Array1[4]);
			} else {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[4]);
				Static488.aClass313Array1[1].method6673(Static366.aClass66Array1[5]);
				Static488.aClass313Array1[2].method6673(Static366.aClass66Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static138.anInt2946 == 2) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[3]);
				return;
			}
			if (Static138.anInt2946 == 3) {
				Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[5]);
				return;
			}
			Static488.aClass313Array1[0].method6673(Static366.aClass66Array1[7]);
		}
	}
}
