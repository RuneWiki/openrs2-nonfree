import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "Lclient!jha;")
	public static Class176 aClass176_11;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_8 = new Class266(6, 7);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)Z")
	public static boolean method6447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static191.method5132(arg1, arg0) | (arg0 & 0x70000) != 0 || Static439.method6540(arg1, arg0);
	}
}
