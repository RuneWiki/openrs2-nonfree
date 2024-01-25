import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[Lclient!ta;")
	public static Class327[] aClass327Array1;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!wu;")
	public static Class380 aClass380_40;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt2622 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)Z")
	public static boolean method2181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
