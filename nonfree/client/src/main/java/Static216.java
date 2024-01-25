import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!vb;")
	public static Class298 aClass298_11;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	public static final int anInt8990 = 1403;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!jj;[IZ[III)Lclient!en;")
	public static Class87_Sub1 method7279(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(27) int local27 = arg3 * local12 + arg2[local12];
			for (@Pc(29) int local29 = 0; local29 < arg1[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class87_Sub1(arg0, arg3, arg4, local10);
	}
}
