import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!rp;")
	public static Class223 aClass223_8;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!wh;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
	public static int anInt5705 = 0;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!um;")
	public static final Class248 aClass248_7 = new Class248();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method4581(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0];
		@Pc(13) int local13 = Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0];
		if (local8 < 0 || Static337.anInt5497 <= local8 || local13 < 0 || Static282.anInt4644 <= local13) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static337.anInt5497 && arg4 >= 0 && Static282.anInt4644 > arg4) {
			@Pc(90) int local90 = Static79.method1278(Static240.anIntArray339, local13, arg0, arg7, arg6, Static401.aClass8_Sub3_Sub1_Sub1_2.method5894(), Static409.aClass128Array1[Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99], arg3, arg1, arg4, local8, arg2, Static388.anIntArray502, arg5);
			if (local90 < 1) {
				return false;
			}
			Static363.anInt5531 = Static388.anIntArray502[local90 - 1];
			Static25.anInt375 = Static240.anIntArray339[local90 - 1];
			Static435.aBoolean509 = false;
			Static397.method5243();
			return true;
		} else {
			return false;
		}
	}
}
