import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public static int anInt6780 = 0;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[I")
	public static final int[] anIntArray351 = new int[32];

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!av;")
	public static final Class27 aClass27_11 = new Class27(3, 7);

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)I")
	public static int method5917() {
		return Static426.anInt7228;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIII)I")
	public static int method5919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static258.aClass159Array1 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg1 >> 9;
		@Pc(16) int local16 = arg0 >> 9;
		if (local12 < 0 || local16 < 0 || local12 > Static380.anInt6689 - 1 || local16 > Static542.anInt9214 - 1) {
			return 0;
		}
		@Pc(52) int local52 = arg2;
		if (arg2 < 3 && (Static446.aByteArrayArrayArray12[1][local12][local16] & 0x2) != 0) {
			local52 = arg2 + 1;
		}
		return Static258.aClass159Array1[local52].method8209(arg1, arg0);
	}
}
