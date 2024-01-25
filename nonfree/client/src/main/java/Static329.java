import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Lclient!om;")
	public static Class246 aClass246_161;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!om;")
	public static Class246 aClass246_162;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt5894 = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)I")
	public static int method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static229.anIntArray355[arg0 & 0x3] : Static407.anIntArray549[arg0 & 0x3];
	}
}
