import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt8132;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!om;")
	public static Class246 aClass246_238;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_246 = new Class272(11, -1);

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public static int anInt8128 = 0;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
	public static boolean aBoolean631 = true;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method6839() {
		if (Static307.anInt5578 == -1) {
			return;
		}
		@Pc(11) int local11 = Static563.aClass156_1.method5689();
		@Pc(20) int local20 = Static563.aClass156_1.method5690();
		@Pc(25) Class3_Sub24 local25 = (Class3_Sub24) Static205.aClass130_20.method3543();
		if (local25 != null) {
			local11 = local25.method7748();
			local20 = local25.method7751();
		}
		Static512.method6854(Static318.anInt5754, Static447.anInt7372, 0, 0, 0, 0, local20, local11, Static307.anInt5578);
		if (Static555.aClass203_139 != null) {
			Static99.method2155(local11, local20);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 >= Static110.anInt2597 && Static459.anInt7524 >= arg4 && arg6 >= Static385.anInt6630 && arg2 <= Static69.anInt1918) {
			Static450.method6272(arg0, arg2, arg6, arg5, arg4, arg3, arg1);
		} else {
			Static468.method6469(arg0, arg2, arg1, arg5, arg4, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIB)V")
	public static void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) Class63 local23 = Static554.aClass63ArrayArrayArray4[arg0][arg2][arg1];
		if (local23 != null) {
			if (arg3 == 1) {
				local23.aShort26 = 0;
			} else if (arg3 == 2) {
				local23.aShort28 = 0;
			}
		}
		Static69.method1638();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Z")
	public static boolean method6850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static90.method2035(arg0, arg1) & Static373.method5516(arg0, arg1);
	}
}
