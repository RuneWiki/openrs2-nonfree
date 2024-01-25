import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static264 {

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "Lclient!oe;")
	public static Class244 aClass244_39;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_109 = new Class362(6, 0);

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
	public static long aLong140 = 0L;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!er;")
	public static final Class92 aClass92_3 = new Class92("stellardawn", 1);

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	public static int anInt5062 = 0;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_110 = new Class362(54, 2);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Z")
	public static boolean method4446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(FB)F")
	public static float method4447(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
