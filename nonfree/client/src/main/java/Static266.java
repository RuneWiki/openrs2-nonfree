import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
	public static int[] anIntArray386;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!qa;")
	public static Class75 aClass75_7;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wt;I)I")
	public static int method4000(@OriginalArg(0) Class3_Sub2_Sub2 arg0) {
		@Pc(13) int local13 = arg0.method6057(2);
		@Pc(26) int local26;
		if (local13 == 0) {
			local26 = 0;
		} else if (local13 == 1) {
			local26 = arg0.method6057(5);
		} else if (local13 == 2) {
			local26 = arg0.method6057(8);
		} else {
			local26 = arg0.method6057(11);
		}
		return local26;
	}
}
