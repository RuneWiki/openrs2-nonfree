import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static542 {

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
	public static int anInt9140;

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_310 = new Class179(87, 3);

	@OriginalMember(owner = "client!sj", name = "P", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_130 = new Class289(29, -1);

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_131 = new Class289(73, -1);

	@OriginalMember(owner = "client!sj", name = "S", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[5];

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_25 = new Class357("", 19);

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)Z")
	public static boolean method7712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static476.method6973(arg1, arg0) | (arg0 & 0x60000) != 0 || Static205.method3062(arg1, arg0);
	}
}
