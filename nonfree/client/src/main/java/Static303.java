import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_42 = new Class126(50);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[F)[F")
	public static float[] method4039(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static464.method3632(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4040(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static193.aStringArray31.length; local7++) {
			if (Static193.aStringArray31[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
