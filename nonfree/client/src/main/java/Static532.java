import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!rv", name = "Ub", descriptor = "I")
	public static int anInt8517;

	@OriginalMember(owner = "client!rv", name = "Nb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!rv", name = "Mb", descriptor = "Lclient!po;")
	public static final Class290 aClass290_5 = new Class290("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(II[BIII[BII)V")
	public static void method7341(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(33) int local33 = -arg0; local33 < 0; local33++) {
			@Pc(41) int local41;
			for (@Pc(37) int local37 = local10; local37 < 0; local37++) {
				local41 = arg3++;
				arg1[local41] = (byte) (arg1[local41] - arg5[arg6++]);
				@Pc(54) int local54 = arg3++;
				arg1[local54] = (byte) (arg1[local54] - arg5[arg6++]);
				@Pc(67) int local67 = arg3++;
				arg1[local67] = (byte) (arg1[local67] - arg5[arg6++]);
				@Pc(80) int local80 = arg3++;
				arg1[local80] = (byte) (arg1[local80] - arg5[arg6++]);
			}
			for (@Pc(98) int local98 = local15; local98 < 0; local98++) {
				local41 = arg3++;
				arg1[local41] = (byte) (arg1[local41] - arg5[arg6++]);
			}
			arg3 += arg7;
			arg6 += arg2;
		}
	}
}
