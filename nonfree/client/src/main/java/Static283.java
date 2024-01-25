import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!fia;")
	public static Class45 aClass45_16;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_124 = new Class251(87, 7);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method4752() {
		Static470.aClass378_3.method9083();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)Z")
	public static boolean method4754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static148.method2180(arg0, arg1) | (arg1 & 0x60000) != 0 || Static48.method806(arg1, arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(14) int local14 = arg0; local14 <= arg2; local14++) {
			for (@Pc(20) int local20 = arg1; local20 <= arg3; local20++) {
				if (arg4 == Static47.anIntArrayArray8[local14][local20] && Static544.anIntArrayArray57[local14][local20] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)I")
	public static int method4757(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(23) int local23 = (arg0 & 0x7F) * 96 >> 7;
		if (local23 < 2) {
			local23 = 2;
		} else if (local23 > 126) {
			local23 = 126;
		}
		return local23 + (arg0 & 0xFF80);
	}
}
