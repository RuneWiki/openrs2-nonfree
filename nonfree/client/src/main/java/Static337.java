import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "Lclient!sk;")
	public static Class309 aClass309_10;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
	public static int anInt5983 = 0;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Lclient!sh;")
	public static final Class307 aClass307_3 = new Class307();

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "[I")
	public static final int[] anIntArray466 = new int[1000];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
	public static void method5148(@OriginalArg(0) int arg0) {
		if (Static209.anInt8184 == 1) {
			Static13.anInt6202 = arg0;
		} else if (Static209.anInt8184 == 2 || Static209.anInt8184 == 3) {
			Static254.anInt4588 = arg0;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIII[I)V")
	public static void method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg2--;
		@Pc(13) int local13 = arg0 - 1;
		@Pc(17) int local17 = local13 - 7;
		while (arg2 < local17) {
			@Pc(21) int local21 = arg2 + 1;
			arg3[local21] = arg1;
			@Pc(26) int local26 = local21 + 1;
			arg3[local26] = arg1;
			@Pc(31) int local31 = local26 + 1;
			arg3[local31] = arg1;
			@Pc(36) int local36 = local31 + 1;
			arg3[local36] = arg1;
			@Pc(41) int local41 = local36 + 1;
			arg3[local41] = arg1;
			@Pc(46) int local46 = local41 + 1;
			arg3[local46] = arg1;
			@Pc(51) int local51 = local46 + 1;
			arg3[local51] = arg1;
			arg2 = local51 + 1;
			arg3[arg2] = arg1;
		}
		while (local13 > arg2) {
			arg2++;
			arg3[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B[SI)[S")
	public static short[] method5151(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static604.method5913(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
