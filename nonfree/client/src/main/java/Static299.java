import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!at;")
	public static Class17 aClass17_2;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
	public static final int[] anIntArray374 = new int[4096];

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	public static int anInt6048 = 0;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	public static int anInt6050 = 1;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5004(@OriginalArg(1) String[] arg0) {
		@Pc(11) String[] local11 = new String[5];
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			local11[local13] = local13 + ": ";
			if (arg0 != null && arg0[local13] != null) {
				local11[local13] = local11[local13] + arg0[local13];
			}
		}
		return local11;
	}
}
