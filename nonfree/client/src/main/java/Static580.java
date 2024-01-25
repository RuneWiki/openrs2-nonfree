import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!bha;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt9328 = 0;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!ln;")
	public static final Class203 aClass203_4 = new Class203();

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
	public static int[] anIntArray805 = new int[2];

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)I")
	public static int method8162(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
