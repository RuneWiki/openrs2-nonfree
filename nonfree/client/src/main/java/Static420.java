import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!nea", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZB)V")
	public static void method6142(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static483.method6910(arg1, arg0, true, arg3, -1, arg2);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIII)I")
	public static int method6143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static424.anInt6882 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg2 - Static90.anInt3353;
		@Pc(23) int local23 = arg1 - Static90.anInt3348;
		for (@Pc(28) Class2_Sub51 local28 = (Class2_Sub51) Static90.aClass60_65.method1226(7); local28 != null; local28 = (Class2_Sub51) Static90.aClass60_65.method1228()) {
			if (local28.anInt9158 == arg0) {
				@Pc(43) int local43 = local28.anInt9165;
				@Pc(46) int local46 = local28.anInt9167;
				@Pc(56) int local56 = local46 + Static90.anInt3348 | local43 + Static90.anInt3353 << 14;
				@Pc(75) int local75 = (local19 - local43) * (local19 + -local43) + (local23 - local46) * (local23 - local46);
				if (local13 < 0 || local15 > local75) {
					local13 = local56;
					local15 = local75;
				}
			}
		}
		if (-1 != -1) {
			aStringArray26 = null;
		}
		return local13;
	}
}
