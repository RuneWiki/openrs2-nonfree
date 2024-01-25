import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!lf;")
	public static Class133 aClass133_3;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public static final int anInt4887 = 50;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
	public static final int[] anIntArray441 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "i", descriptor = "[I")
	public static final int[] anIntArray442 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[anInt4887];

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
	public static final int[] anIntArray443 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
	public static final int[] anIntArray444 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
	public static final int[] anIntArray445 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
	public static final int[] anIntArray446 = new int[anInt4887];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method4335(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
