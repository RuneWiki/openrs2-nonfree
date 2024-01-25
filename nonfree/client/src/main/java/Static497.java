import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!pe;")
	public static Class254 aClass254_125;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_37 = new Class110(12, 6);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method7513() {
		for (@Pc(8) Class3_Sub45 local8 = (Class3_Sub45) Static364.aClass183_46.method4795(); local8 != null; local8 = (Class3_Sub45) Static364.aClass183_46.method4793()) {
			if (local8.anInt9263 > 0) {
				local8.anInt9263--;
			}
			if (local8.anInt9263 != 0) {
				if (local8.anInt9256 > 0) {
					local8.anInt9256--;
				}
				if (local8.anInt9256 == 0 && local8.anInt9258 >= 1 && local8.anInt9267 >= 1 && local8.anInt9258 <= Static460.anInt8640 - 2 && local8.anInt9267 <= Static292.anInt7682 - 2 && (local8.anInt9259 < 0 || Static523.method7752(local8.anInt9259, local8.anInt9262))) {
					Static105.method2237(local8.anInt9268, local8.anInt9266, local8.anInt9259, -1, local8.anInt9267, local8.anInt9262, local8.anInt9258, local8.anInt9265);
					local8.anInt9256 = -1;
					if (local8.anInt9257 == local8.anInt9259 && local8.anInt9257 == -1) {
						local8.method8412();
					} else if (local8.anInt9259 == local8.anInt9257 && local8.anInt9261 == local8.anInt9266 && local8.anInt9264 == local8.anInt9262) {
						local8.method8412();
					}
				}
			} else if (local8.anInt9257 < 0 || Static523.method7752(local8.anInt9257, local8.anInt9264)) {
				Static105.method2237(local8.anInt9268, local8.anInt9261, local8.anInt9257, -1, local8.anInt9267, local8.anInt9264, local8.anInt9258, local8.anInt9265);
				local8.method8412();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)Z")
	public static boolean method7515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static535.anInt9696 <= arg2 && arg2 <= Static35.anInt993 && Static535.anInt9696 <= arg0 && arg0 <= Static35.anInt993 && arg3 >= Static535.anInt9696 && arg3 <= Static35.anInt993 && Static535.anInt9696 <= arg1 && arg1 <= Static35.anInt993 && arg5 >= Static55.anInt1303 && arg5 <= Static208.anInt4309 && arg7 >= Static55.anInt1303 && arg7 <= Static208.anInt4309 && Static55.anInt1303 <= arg4 && Static208.anInt4309 >= arg4 && Static55.anInt1303 <= arg6 && arg6 <= Static208.anInt4309) {
			Static553.method8064(arg3, arg8, arg1, arg0, arg7, arg6, arg5, arg4, arg2);
		} else {
			Static448.method7003(arg2, arg6, arg0, arg8, arg4, arg5, arg3, arg7, arg1);
		}
	}
}
