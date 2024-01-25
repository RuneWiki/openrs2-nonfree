import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
	public static int anInt1223;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
	public static int anInt1211 = 0;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
	public static int anInt1218 = -60;

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLclient!dga;)Lclient!vm;")
	public static Class6_Sub3 method972(@OriginalArg(1) Class6_Sub14 arg0) {
		arg0.method6041();
		@Pc(13) int local13 = arg0.method6041();
		@Pc(17) Class6_Sub3 local17 = Static235.method3423(local13);
		local17.anInt9586 = arg0.method6041();
		@Pc(26) int local26 = arg0.method6041();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method6041();
			local17.method7831(local34, arg0);
		}
		local17.method7832();
		return local17;
	}
}
