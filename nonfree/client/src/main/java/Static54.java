import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
	public static int anInt1399 = 0;

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
	public static int anInt1401 = 0;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_30 = new Class319(48, 18);

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "F")
	public static float aFloat31 = 0.25F;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZI)I")
	public static int method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg2;
		}
	}
}
