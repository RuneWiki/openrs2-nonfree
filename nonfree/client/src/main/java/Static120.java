import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public static int anInt2709;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!ok;")
	public static Class147 aClass147_2;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public static int anInt2720;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_52 = new Class130();

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean228 = true;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BII)I")
	public static int method2430(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2435(@OriginalArg(1) String arg0) {
		return Static68.method1266(arg0, 10);
	}
}
