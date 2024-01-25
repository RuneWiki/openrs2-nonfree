import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!hk;")
	public static Class155 aClass155_3;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	public static int anInt374;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[I[ILclient!vf;BI)Lclient!hr;")
	public static Class1_Sub1 method429(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class100_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg0];
		for (@Pc(19) int local19 = 0; local19 < arg4; local19++) {
			@Pc(29) int local29 = arg1[local19] + local19 * arg0;
			for (@Pc(31) int local31 = 0; local31 < arg2[local19]; local31++) {
				local10[local29++] = -1;
			}
		}
		return new Class1_Sub1(arg3, arg0, arg4, local10);
	}
}
