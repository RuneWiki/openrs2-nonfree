import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt7107 = 0;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "F")
	public static float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
	public static boolean method5390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(13) Class141 local13 = Static259.aClass95_3.method1821(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method2827(arg0);
	}
}
