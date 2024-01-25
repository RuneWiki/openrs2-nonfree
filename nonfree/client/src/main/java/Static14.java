import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!bu;")
	public static Class32 aClass32_5;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!no;")
	public static final Class167 aClass167_1 = new Class167("", 13);

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_10 = new Class119(109, 2);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method317(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static107.aBoolean203) {
			try {
				@Pc(23) Class79 local23 = (Class79) Class.forName("Class79_Sub1").getDeclaredConstructor().newInstance();
				local23.method4227(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static107.aBoolean203 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method321(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			local5 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local15);
			if (local24 >= 'A' && local24 <= 'Z') {
				local5 += local24 - 64;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local5 += local24 + 1 - 97;
			} else if (local24 >= '0' && local24 <= '9') {
				local5 += local24 + 27 - 48;
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

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
	public static boolean method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
