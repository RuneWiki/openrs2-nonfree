import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public static int anInt5712;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public static int anInt5705 = 0;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_144 = new Class12(102, 15);

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "S")
	public static short aShort98 = 32767;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)I")
	public static int method4499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static94.aClass157Array1 == null) {
			return 0;
		}
		@Pc(19) int local19 = arg1 >> 7;
		@Pc(23) int local23 = arg2 >> 7;
		if (local19 < 0 || local23 < 0 || Static296.anInt5187 - 1 < local19 || Static206.anInt3607 - 1 < local23) {
			return 0;
		}
		@Pc(41) int local41 = arg0;
		if (arg0 < 3 && (Static147.aByteArrayArrayArray22[1][local19][local23] & 0x2) != 0) {
			local41 = arg0 + 1;
		}
		return Static94.aClass157Array1[local41].ca(arg1, arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method4500(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static278.method3867(arg0);
	}
}
