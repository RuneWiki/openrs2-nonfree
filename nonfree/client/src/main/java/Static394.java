import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!nfa;")
	public static Class1_Sub36 aClass1_Sub36_2;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt6985 = 0;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5647(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(23) String local23 = arg1[arg0];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(34) int local34 = arg0 + arg2;
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = arg0; local38 < local34; local38++) {
				@Pc(44) String local44 = arg1[local38];
				if (local44 == null) {
					local36 += 4;
				} else {
					local36 += local44.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local36);
			for (@Pc(69) int local69 = arg0; local69 < local34; local69++) {
				@Pc(75) String local75 = arg1[local69];
				if (local75 == null) {
					local67.append("null");
				} else {
					local67.append(local75);
				}
			}
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB[BI)[B")
	public static byte[] method5650(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static598.method774(arg0, arg1, local11, 0, 32768);
		return local11;
	}
}
