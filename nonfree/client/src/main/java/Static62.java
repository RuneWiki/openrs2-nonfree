import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public static int anInt1503;

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!ik;")
	public static Class182 aClass182_13;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lclient!nt;BZIII)V")
	public static void method1416(@OriginalArg(0) Class270[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class270 local9 = arg0[local3];
			if (local9 != null && arg3 == local9.anInt7050) {
				Static114.method2189(arg2, local9, arg4, arg1);
				Static266.method3805(arg4, local9, arg2);
				if (local9.anInt6982 > local9.anInt7037 - local9.anInt7015) {
					local9.anInt6982 = local9.anInt7037 - local9.anInt7015;
				}
				if (local9.anInt7013 - local9.anInt7045 < local9.lb) {
					local9.lb = local9.anInt7013 - local9.anInt7045;
				}
				if (local9.anInt6982 < 0) {
					local9.anInt6982 = 0;
				}
				if (local9.lb < 0) {
					local9.lb = 0;
				}
				if (local9.anInt7008 == 0) {
					Static145.method2463(local9, arg1);
				}
			}
		}
	}
}
