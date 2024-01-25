import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray32;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_119 = new Class186(56, 0);

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	public static int anInt9357 = -1;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public static void method7892() {
		Static99.anInt2448 = -1;
		Static352.aClass12_8 = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([[BII[B[[B[II[I)I")
	public static int method7894(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg4[arg5];
		@Pc(13) int local13 = local7 + arg6[arg5];
		@Pc(17) int local17 = arg4[arg1];
		@Pc(23) int local23 = arg6[arg1] + local17;
		@Pc(25) int local25 = local7;
		if (local7 < local17) {
			local25 = local17;
		}
		@Pc(32) int local32 = local13;
		if (local23 < local13) {
			local32 = local23;
		}
		@Pc(43) int local43 = arg2[arg5] & 0xFF;
		if ((arg2[arg1] & 0xFF) < local43) {
			local43 = arg2[arg1] & 0xFF;
		}
		@Pc(60) byte[] local60 = arg0[arg5];
		@Pc(64) byte[] local64 = arg3[arg1];
		@Pc(69) int local69 = local25 - local7;
		@Pc(74) int local74 = local25 - local17;
		for (@Pc(76) int local76 = local25; local76 < local32; local76++) {
			@Pc(87) int local87 = local64[local74++] + local60[local69++];
			if (local87 < local43) {
				local43 = local87;
			}
		}
		return -local43;
	}
}
