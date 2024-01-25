import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ru", name = "V", descriptor = "I")
	public static int anInt8217;

	@OriginalMember(owner = "client!ru", name = "Z", descriptor = "I")
	public static int anInt8218;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_270 = new Class123(58, 0);

	@OriginalMember(owner = "client!ru", name = "Y", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_164 = new Class342(50);

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(III)Z")
	public static boolean method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6448(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 <= '\u07ff') {
				local15 += 2;
			} else {
				local15 += 3;
			}
		}
		return local15;
	}
}
