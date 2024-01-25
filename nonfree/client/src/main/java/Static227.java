import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	public static int anInt9451;

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
	public static int anInt9452;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "Lclient!at;")
	public static Class20 aClass20_61 = new Class20();

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public static int anInt9454 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public static boolean method8064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
