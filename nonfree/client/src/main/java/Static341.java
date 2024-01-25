import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_82 = new Class344(61, -1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!eq;IIIZIB[I)Lclient!mba;")
	public static Class121_Sub2_Sub1 method5636(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg0.aBoolean275 || Static474.method7016(arg1) && Static474.method7016(arg3)) {
			return new Class121_Sub2_Sub1(arg0, 3553, arg1, arg3, false, arg5, arg4, 0);
		} else if (arg0.aBoolean262) {
			return new Class121_Sub2_Sub1(arg0, 34037, arg1, arg3, false, arg5, arg4, 0);
		} else {
			return new Class121_Sub2_Sub1(arg0, arg1, arg3, Static95.method2482(arg1), Static95.method2482(arg3), arg5);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!em;)I")
	public static int method5637(@OriginalArg(1) Class82 arg0) {
		if (arg0 == Static358.aClass82_12) {
			return 6407;
		} else if (arg0 == Static333.aClass82_9) {
			return 6408;
		} else if (Static104.aClass82_3 == arg0) {
			return 6406;
		} else if (Static300.aClass82_10 == arg0) {
			return 6409;
		} else if (Static201.aClass82_6 == arg0) {
			return 6410;
		} else if (Static576.aClass82_16 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[B)[B")
	public static byte[] method5638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) byte[] local13;
		if (arg0 > 0) {
			local13 = new byte[arg1];
			for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
				local13[local15] = arg2[local15 + arg0];
			}
		} else {
			local13 = arg2;
		}
		@Pc(37) Class194 local37 = new Class194();
		local37.method5219();
		local37.method5214((long) (arg1 * 8), local13);
		@Pc(51) byte[] local51 = new byte[64];
		local37.method5215(local51);
		return local51;
	}
}
