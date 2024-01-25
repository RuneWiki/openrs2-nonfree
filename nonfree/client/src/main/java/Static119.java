import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Lclient!ok;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[100];

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_66 = new Class263(40, 8);

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public static int anInt2647 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([[B[BII[[BI[I[I)I")
	public static int method1933(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(7) int local7 = arg5[arg3];
		@Pc(14) int local14 = local7 + arg6[arg3];
		@Pc(18) int local18 = arg5[arg2];
		@Pc(25) int local25 = local18 + arg6[arg2];
		@Pc(27) int local27 = local7;
		if (local7 < local18) {
			local27 = local18;
		}
		@Pc(47) int local47 = local14;
		if (local14 > local25) {
			local47 = local25;
		}
		@Pc(58) int local58 = arg1[arg3] & 0xFF;
		if ((arg1[arg2] & 0xFF) < local58) {
			local58 = arg1[arg2] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg4[arg3];
		@Pc(79) byte[] local79 = arg0[arg2];
		@Pc(84) int local84 = local27 - local7;
		@Pc(88) int local88 = local27 - local18;
		for (@Pc(90) int local90 = local27; local90 < local47; local90++) {
			@Pc(101) int local101 = local79[local88++] + local75[local84++];
			if (local101 < local58) {
				local58 = local101;
			}
		}
		return -local58;
	}
}
