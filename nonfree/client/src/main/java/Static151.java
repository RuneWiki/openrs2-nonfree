import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "Lclient!sa;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString28 = null;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Z")
	public static boolean method3061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(21) Class25 local21 = Static553.aClass288_4.method6419(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local21.method574(arg1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
