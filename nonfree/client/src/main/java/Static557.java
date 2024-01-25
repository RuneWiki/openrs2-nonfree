import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static557 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!wu;")
	public static Class384 aClass384_123;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZII)I")
	public static int method7820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static480.aByteArrayArrayArray19[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static480.aByteArrayArrayArray19[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
