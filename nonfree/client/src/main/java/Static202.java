import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Lclient!eg;")
	public static final Class97 aClass97_3 = new Class97(16);

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!gja", name = "p", descriptor = "[I")
	public static final int[] anIntArray194 = new int[32];

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3282(@OriginalArg(1) String arg0) {
		@Pc(10) long local10 = 0L;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			local10 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local15);
			if (local24 >= 'A' && local24 <= 'Z') {
				local10 += (long) (local24 + 1 - 65);
			} else if (local24 >= 'a' && local24 <= 'z') {
				local10 += (long) (local24 + 1 - 97);
			} else if (local24 >= '0' && local24 <= '9') {
				local10 += (long) (local24 + 27 - 48);
			}
			if (local10 >= 177917621779460413L) {
				break;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)Z")
	public static boolean method3285() {
		return Static544.aBoolean761;
	}
}
