import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "[Lclient!ak;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!gq;")
	public static final Class139 aClass139_1 = new Class139(0);

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[200];

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)I")
	public static int method2995(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}
}
