import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!qu;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!ya;")
	public static Class51 aClass51_7;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	public static int anInt4289;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_8 = new Class83(7, 0, 1, 1);

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	public static int anInt4288 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBZIIIIII)Z")
	public static boolean method3388(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0];
		@Pc(13) int local13 = Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0];
		if (local8 < 0 || Static333.anInt3375 <= local8 || local13 < 0 || local13 >= Static102.anInt2086) {
			return false;
		} else if (arg6 >= 0 && arg6 < Static333.anInt3375 && arg2 >= 0 && Static102.anInt2086 > arg2) {
			@Pc(85) int local85 = Static46.method607(Static104.aClass26_Sub2_Sub4_Sub2_2.method5512(), local8, Static100.anIntArray134, arg3, arg2, Static230.anIntArray348, arg5, arg1, arg4, arg7, Static179.aClass70Array3[Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102], local13, arg0, arg6);
			if (local85 < 1) {
				return false;
			}
			Static153.anInt5631 = Static230.anIntArray348[local85 - 1];
			Static89.anInt1837 = Static100.anIntArray134[local85 - 1];
			Static404.aBoolean507 = false;
			Static87.method1508();
			return true;
		} else {
			return false;
		}
	}
}
