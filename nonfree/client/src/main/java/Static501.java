import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!la;")
	public static Class196 aClass196_103;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt8621 = 0;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt8624 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7399(@OriginalArg(0) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local12 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local12 += local27 + 1 - 97;
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

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 == arg2) {
			Static251.method4084(arg0, arg2, arg5, arg1, arg4, arg3);
		} else if (Static630.anInt10099 <= arg4 - arg2 && arg4 + arg2 <= Static16.anInt4339 && arg1 - arg6 >= Static11.anInt9803 && arg1 + arg6 <= Static149.anInt2949) {
			Static25.method6690(arg4, arg1, arg3, arg2, arg0, arg6, arg5);
		} else {
			Static603.method8429(arg1, arg6, arg5, arg2, arg4, arg0, arg3);
		}
	}
}
