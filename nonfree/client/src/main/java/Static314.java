import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt5988 = -1;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!jc;")
	public static final Class145 aClass145_5 = new Class145();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIIZ)V")
	public static void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static526.anInt8926 == 0) {
			Static165.method3262(false);
		} else {
			Static249.anInt4838 = Static526.anInt8926;
			Static508.method7307(0);
		}
		Static101.anInt2454 = arg1;
		Static64.anInt1865 = arg0;
		Static74.aBoolean152 = arg3;
		Static451.method3233(arg2);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5172(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			local5 *= 37L;
			@Pc(26) char local26 = arg0.charAt(local10);
			if (local26 >= 'A' && local26 <= 'Z') {
				local5 += local26 - 64;
			} else if (local26 >= 'a' && local26 <= 'z') {
				local5 += local26 + 1 - 97;
			} else if (local26 >= '0' && local26 <= '9') {
				local5 += local26 - 21;
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
