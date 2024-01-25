import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!lq;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	public static int[] anIntArray517 = new int[2];

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!os;")
	public static final Class182 aClass182_193 = new Class182("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
	public static final int[] anIntArray518 = new int[13];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Z")
	public static boolean method4326(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIBI)I")
	public static int method4328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}
}
