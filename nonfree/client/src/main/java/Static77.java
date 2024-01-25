import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_2 = new Class308("LOCAL", 4);

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "J")
	public static long aLong49 = -1L;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!hea;I[II[I)Lclient!pl;")
	public static Class204_Sub3 method1314(@OriginalArg(0) int arg0, @OriginalArg(1) Class134_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg1.method6820(Static215.aClass155_10, Static194.aClass203_8)) {
			@Pc(66) int[] local66 = new int[arg0 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local34 = arg2[local23] + local23 * arg0;
				for (local36 = 0; local36 < arg4[local23]; local36++) {
					local66[local34++] = -16777216;
				}
			}
			return new Class204_Sub3(arg1, arg0, arg3, local66);
		}
		@Pc(21) byte[] local21 = new byte[arg3 * arg0];
		for (local23 = 0; local23 < arg3; local23++) {
			local34 = local23 * arg0 + arg2[local23];
			for (local36 = 0; local36 < arg4[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class204_Sub3(arg1, arg0, arg3, local21);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)I")
	public static int method1316(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
