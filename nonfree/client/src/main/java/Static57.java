import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt1870;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_13 = new Class71(39, 4);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_5 = new Class316(8, 0, 4, 1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method1618(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local12 += local27 + 27 - 48;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V")
	public static void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg4 >= Static251.anInt9634 && arg2 + arg4 <= Static366.anInt6946 && Static444.anInt8258 <= arg5 - arg4 && arg5 + arg4 <= Static188.anInt4410) {
			Static389.method6229(arg5, arg4, arg3, arg1, arg0, arg2);
		} else {
			Static197.method3687(arg0, arg2, arg4, arg1, arg3, arg5);
		}
	}
}
