import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static657 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!qm;")
	public static Class289 aClass289_2;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_331 = new Class196(12, -1);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I")
	public static int method8596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static204.anIntArray182[arg1 & 0x3] : Static194.anIntArray577[arg1 & 0x3];
	}
}
