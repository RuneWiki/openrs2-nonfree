import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt9214 = -1;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_88 = new Class77(23, 3);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)I")
	public static int method7592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static97.anIntArray201[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([SII)[S")
	public static short[] method7593(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static554.method3501(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIII[BI)V")
	public static void method7594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 >= arg1) {
			return;
		}
		arg3 += arg0;
		@Pc(28) int local28 = arg1 - arg0 >> 2;
		while (true) {
			local28--;
			if (local28 < 0) {
				local28 = arg1 - arg0 & 0x3;
				while (true) {
					local28--;
					if (local28 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(33) int local33 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg2[local38] = 1;
			arg3 = local43 + 1;
			arg2[local43] = 1;
		}
	}
}
