import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_48 = new Class86(16);

	@OriginalMember(owner = "client!q", name = "R", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_976 = Static81.method1507("gleiten:");

	@OriginalMember(owner = "client!q", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_977 = Static81.method1507(": ");

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
	public static int anInt3340 = 0;

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_978 = Static81.method1507("Loading interfaces )2 ");

	@OriginalMember(owner = "client!q", name = "cb", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!q", name = "db", descriptor = "Lclient!dj;")
	public static Class24 aClass24_979 = aClass24_978;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_980 = Static81.method1507("headicons_prayer");

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIILclient!ve;)Z")
	public static boolean method2564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(9) byte[] local9 = arg2.method2208(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static150.method2585(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)I")
	public static int method2566(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBII)V")
	public static void method2567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 + 1;
		Static39.method731(Static98.anIntArrayArray16[arg2], arg0, arg4, arg1);
		@Pc(13) int local13 = arg3 - 1;
		Static39.method731(Static98.anIntArrayArray16[arg3], arg0, arg4, arg1);
		for (@Pc(25) int local25 = local4; local25 <= local13; local25++) {
			@Pc(31) int[] local31 = Static98.anIntArrayArray16[local25];
			local31[arg0] = local31[arg4] = arg1;
		}
	}
}
