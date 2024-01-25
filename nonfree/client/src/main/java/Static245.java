import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "[I")
	public static final int[] anIntArray516 = new int[25];

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_103 = new Class46(80, 8);

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
	public static int anInt9420 = -1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method8118(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLclient!kn;)Z")
	public static boolean method8120(@OriginalArg(1) Class200 arg0) {
		return arg0 == null ? false : Static475.method7024(arg0.anInt5104 - arg0.anInt5101, arg0.anInt5106, arg0.anInt5111, arg0.anInt5112 - arg0.anInt5106, arg0.anInt5101, arg0.anInt5115 - arg0.anInt5111);
	}
}
