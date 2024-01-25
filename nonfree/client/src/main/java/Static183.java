import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_4 = new Class240("", 17);

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
	public static final int[] anIntArray247 = new int[16];

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)I")
	public static int method2529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(24) int local24 = 65536 - Class155.anIntArray341[arg0 * 8192 / arg1] >> 1;
		return (arg2 * local24 >> 16) + ((65536 - local24) * arg3 >> 16);
	}
}
