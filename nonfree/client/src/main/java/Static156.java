import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "Lclient!uu;")
	public static Class250 aClass250_45;

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)I")
	public static int method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}
}
