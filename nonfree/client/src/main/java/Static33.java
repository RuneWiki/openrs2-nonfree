import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "I")
	public static int anInt800;

	@OriginalMember(owner = "client!br", name = "q", descriptor = "Lclient!qj;")
	public static Class165 aClass165_12;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "[I")
	public static final int[] anIntArray98 = new int[100];

	@OriginalMember(owner = "client!br", name = "f", descriptor = "S")
	public static short aShort3 = 205;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "I")
	public static int anInt806 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lclient!aj;")
	public static Class9 method873(@OriginalArg(0) int arg0) {
		@Pc(15) Class9 local15 = (Class9) Static156.aClass140_81.method3816((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static48.aClass165_20.method4508(arg0, 1);
		local15 = new Class9();
		if (local25 != null) {
			local15.method296(arg0, new Class1_Sub7(local25));
		}
		Static156.aClass140_81.method3817((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg4; local7++) {
			for (@Pc(19) int local19 = arg1; local19 <= arg3; local19++) {
				if (Static172.anIntArrayArray60[local7][local19] == arg2 && Static171.anIntArrayArray35[local7][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(B)I")
	public static int method882() {
		return ((Static8.anInt201 == 0 ? 0 : 1) << 22) + ((Static8.aBoolean28 ? 1 : 0) << 15) + ((Static158.anInt3147 & 0x3) << 11) + ((Static127.aBoolean226 ? 1 : 0) << 9) + ((Static1.aBoolean14 ? 1 : 0) << 8) + ((Static305.aBoolean515 ? 1 : 0) << 6) + ((Static217.aBoolean365 ? 1 : 0) << 5) + (Static210.anInt4175 & 0x7) + ((Static29.aBoolean71 ? 1 : 0) << 3) + ((Static216.aBoolean364 ? 1 : 0) << 4) + ((Static264.aBoolean464 ? 1 : 0) << 10) + ((Static44.aBoolean87 ? 1 : 0) << 13) + ((Static41.aBoolean83 ? 1 : 0) << 16) + (Static75.anInt1518 << 17) + ((Static337.aBoolean564 ? 1 : 0) << 19) + ((Static115.anInt2304 == 0 ? 0 : 1) << 20) + ((Static211.anInt4208 == 0 ? 0 : 1) << 21) + (Static187.method3637() << 23) + (Static331.anInt6338 << 25) + ((Static71.aBoolean129 ? 1 : 0) << 27) + (Static335.anInt6377 << 28);
	}
}
