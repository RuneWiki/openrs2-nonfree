import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static269 {

	@OriginalMember(owner = "client!jk", name = "X", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "Lclient!gha;")
	public static final Class125 aClass125_2 = new Class125();

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method3764(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!kea;)I")
	public static int method3772(@OriginalArg(1) Class188 arg0) {
		if (arg0 == Static566.aClass188_13) {
			return 6407;
		} else if (Static393.aClass188_12 == arg0) {
			return 6408;
		} else if (Static588.aClass188_15 == arg0) {
			return 6406;
		} else if (arg0 == Static154.aClass188_7) {
			return 6409;
		} else if (Static389.aClass188_11 == arg0) {
			return 6410;
		} else if (arg0 == Static254.aClass188_9) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
