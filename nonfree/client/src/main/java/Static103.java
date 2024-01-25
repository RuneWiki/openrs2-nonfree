import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!an;")
	public static Class16 aClass16_21;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_21 = new Class77(27, 8);

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "Lclient!lt;")
	public static final Class196 aClass196_1 = new Class196();

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "[I")
	public static final int[] anIntArray205 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
	public static boolean method2114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
