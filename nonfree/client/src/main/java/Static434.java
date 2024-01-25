import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static434 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "Lclient!pe;")
	public static Class254 aClass254_111;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public static int anInt8346 = 1;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt8349 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
	public static boolean method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
