import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!kf;")
	public static Class172 aClass172_2;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array15;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "[I")
	public static final int[] anIntArray460 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!no", name = "e", descriptor = "S")
	public static short aShort83 = 32767;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "[I")
	public static final int[] anIntArray462 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
	public static int method5323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
