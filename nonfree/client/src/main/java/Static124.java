import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	public static int anInt5504;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "I")
	public static int anInt5509;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Lclient!gj;")
	public static Class59 aClass59_40 = new Class59();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIZI)V")
	public static void method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static29.anInt517 <= arg3 && Static11.anInt170 >= arg3) {
			@Pc(23) int local23 = Static226.method3512(arg0, Static98.anInt2007, Static213.anInt4452);
			@Pc(29) int local29 = Static226.method3512(arg1, Static98.anInt2007, Static213.anInt4452);
			Static309.method4709(arg3, arg2, local29, local23);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method4681(@OriginalArg(1) String arg0) {
		@Pc(13) long local13 = 0L;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			local13 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local18);
			if (local29 >= 'A' && local29 <= 'Z') {
				local13 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local13 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local13 += local29 - 21;
			}
			if (local13 >= 177917621779460413L) {
				break;
			}
		}
		while (local13 % 37L == 0L && local13 != 0L) {
			local13 /= 37L;
		}
		return local13;
	}
}
