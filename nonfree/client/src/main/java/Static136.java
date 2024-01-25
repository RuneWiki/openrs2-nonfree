import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_39 = new Class67(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_36 = new Class158(36, 4);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([[BI[[B[II[II[B)I")
	public static int method2318(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(17) int local17 = arg4[arg5];
		@Pc(23) int local23 = arg3[arg5] + local17;
		@Pc(27) int local27 = arg4[arg1];
		@Pc(33) int local33 = arg3[arg1] + local27;
		@Pc(35) int local35 = local17;
		if (local17 < local27) {
			local35 = local27;
		}
		@Pc(46) int local46 = local23;
		if (local33 < local23) {
			local46 = local33;
		}
		@Pc(57) int local57 = arg6[arg5] & 0xFF;
		if ((arg6[arg1] & 0xFF) < local57) {
			local57 = arg6[arg1] & 0xFF;
		}
		@Pc(78) byte[] local78 = arg0[arg5];
		@Pc(82) byte[] local82 = arg2[arg1];
		@Pc(86) int local86 = local35 - local17;
		@Pc(91) int local91 = local35 - local27;
		for (@Pc(93) int local93 = local35; local93 < local46; local93++) {
			@Pc(105) int local105 = local82[local91++] + local78[local86++];
			if (local105 < local57) {
				local57 = local105;
			}
		}
		return -local57;
	}
}
