import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static515 {

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Lclient!pda;")
	public static final Class283 aClass283_11 = new Class283();

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(III)Z")
	public static boolean method7372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static414.method6155(arg0, arg1) | (arg1 & 0x70000) != 0 || Static381.method5735(arg1, arg0);
	}
}
