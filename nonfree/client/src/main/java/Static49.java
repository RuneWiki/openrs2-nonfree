import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!oi;")
	public static Class185 aClass185_12;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_11 = new Class242(61, 4);

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
	public static final int[] anIntArray105 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
	public static void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(17) int local17 = arg3; local17 <= arg0; local17++) {
			Static298.method3977(arg1, arg2, arg4, Static194.anIntArrayArray28[local17]);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[BII)V")
	public static void method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		arg0 += arg3;
		@Pc(24) int local24 = arg1 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg0 = local39 + 1;
			arg2[local39] = 1;
		}
	}
}
