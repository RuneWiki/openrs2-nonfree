import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tga", name = "q", descriptor = "Lclient!gq;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "[I")
	public static final int[] anIntArray509 = new int[32];

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_94 = new Class124();

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "Lclient!be;")
	public static final Class31 aClass31_9 = new Class31();

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "I")
	public static int anInt9293 = 0;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7772(@OriginalArg(0) String arg0) {
		Static423.method6423(4, 0, arg0, "", "", "");
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7774(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			local5 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local15);
			if (local24 >= 'A' && local24 <= 'Z') {
				local5 += (long) (local24 - 64);
			} else if (local24 >= 'a' && local24 <= 'z') {
				local5 += (long) (local24 + 1 - 97);
			} else if (local24 >= '0' && local24 <= '9') {
				local5 += (long) (local24 + 27 - 48);
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}
}
