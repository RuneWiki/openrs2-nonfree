import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!xa;")
	public static Class37 aClass37_30;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public static int anInt6067;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Z")
	public static boolean aBoolean516 = false;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_78 = new Class276(70, -1);

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "[I")
	public static final int[] anIntArray375 = new int[3];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([II[BI[[B[II[[B)I")
	public static int method5018(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(7) int local7 = arg4[arg5];
		@Pc(13) int local13 = arg0[arg5] + local7;
		@Pc(17) int local17 = arg4[arg2];
		@Pc(24) int local24 = local17 + arg0[arg2];
		@Pc(26) int local26 = local7;
		if (local7 < local17) {
			local26 = local17;
		}
		@Pc(33) int local33 = local13;
		if (local24 < local13) {
			local33 = local24;
		}
		@Pc(53) int local53 = arg1[arg5] & 0xFF;
		if (local53 > (arg1[arg2] & 0xFF)) {
			local53 = arg1[arg2] & 0xFF;
		}
		@Pc(74) byte[] local74 = arg6[arg5];
		@Pc(78) byte[] local78 = arg3[arg2];
		@Pc(83) int local83 = local26 - local7;
		@Pc(88) int local88 = local26 - local17;
		for (@Pc(90) int local90 = local26; local90 < local33; local90++) {
			@Pc(101) int local101 = local78[local88++] + local74[local83++];
			if (local101 < local53) {
				local53 = local101;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method5020() {
		Static327.anInt6815 = 0;
		Static567.anInt10049 = -1;
		Static387.anInt7430 = -1;
	}
}
