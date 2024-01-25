import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Lclient!hb;")
	public static Class11_Sub1_Sub1_Sub3_Sub1 aClass11_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_21 = new Class207(8);

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
	public static final int[] anIntArray187 = new int[13];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;")
	public static String method3095(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg1.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local24++;
				local13 += local17;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(50) int local50 = arg1.indexOf(13, local45);
			if (local50 < 0) {
				local43.append(arg1.substring(local45));
				return local43.toString();
			}
			local43.append(arg1.substring(local45, local50));
			local43.append(arg0);
			local45 = local50 + 1;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)I")
	public static int method3096() {
		return Static520.aClass247_5.method5327();
	}
}
