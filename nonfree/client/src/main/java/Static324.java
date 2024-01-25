import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_30 = new Class295(260);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "[I")
	public static final int[] anIntArray307 = new int[3];

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I")
	public static int method4617(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
