import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_56 = new Class44(10, 3);

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIB)I")
	public static int method3530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
