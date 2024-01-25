import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
	public static float aFloat206 = 0.0F;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_230 = new Class359(129, 6);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IILclient!ck;II[I)Lclient!gfa;")
	public static Class1_Sub1 method8231(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(18) byte[] local18 = new byte[arg3 * arg1];
		for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
			@Pc(31) int local31 = local20 * arg3 + arg0[local20];
			for (@Pc(33) int local33 = 0; local33 < arg4[local20]; local33++) {
				local18[local31++] = -1;
			}
		}
		return new Class1_Sub1(arg2, arg3, arg1, local18);
	}
}
