import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_82 = new Class177(74, 1);

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public static int anInt5962 = -1;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(FI)F")
	public static float method4560(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
