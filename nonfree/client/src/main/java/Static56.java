import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
	public static int anInt9395 = 0;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!cf;")
	public static Class51 method7844(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class51 local13;
		try {
			local13 = (Class51) Class.forName("Class51_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class51_Sub1();
		}
		local13.aString77 = arg1;
		local13.anInt6831 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)I")
	public static int method7853(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
