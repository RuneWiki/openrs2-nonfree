import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!wu;")
	public static Class380 aClass380_47;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	public static int anInt3263;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!wj;")
	public static Class375 aClass375_5 = null;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt3261 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method2750(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
