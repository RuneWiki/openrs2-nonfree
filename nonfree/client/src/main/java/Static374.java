import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([[BII[I[II[[B[B)I")
	public static int method5594(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg2[arg1];
		@Pc(16) int local16 = local9 + arg3[arg1];
		@Pc(20) int local20 = arg2[arg4];
		@Pc(26) int local26 = arg3[arg4] + local20;
		@Pc(28) int local28 = local9;
		if (local20 > local9) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local16 > local26) {
			local35 = local26;
		}
		@Pc(46) int local46 = arg6[arg1] & 0xFF;
		if ((arg6[arg4] & 0xFF) < local46) {
			local46 = arg6[arg4] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg0[arg1];
		@Pc(71) byte[] local71 = arg5[arg4];
		@Pc(76) int local76 = local28 - local9;
		@Pc(81) int local81 = local28 - local20;
		for (@Pc(83) int local83 = local28; local83 < local35; local83++) {
			@Pc(95) int local95 = local71[local81++] + local67[local76++];
			if (local95 < local46) {
				local46 = local95;
			}
		}
		return -local46;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;BI)Lclient!vu;")
	public static Class295 method5595(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class295 local16;
		try {
			local16 = (Class295) Class.forName("Class295_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			local16 = new Class295_Sub1();
		}
		local16.aString96 = arg0;
		local16.anInt9401 = arg1;
		return local16;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
	public static boolean method5596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
