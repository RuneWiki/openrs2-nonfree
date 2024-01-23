import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1091 = Static231.method3737("Walk here");

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1088 = aClass107_1091;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1089 = Static231.method3737("mapscene");

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
	public static int[] anIntArray344 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1090 = Static231.method3737("logo");

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)[Lclient!pg;")
	public static Class64[] method3046() {
		@Pc(4) Class64[] local4 = new Class64[Static40.anInt855];
		for (@Pc(10) int local10 = 0; local10 < Static40.anInt855; local10++) {
			local4[local10] = new Class64_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[local10], Static223.anIntArray373[local10], Static141.anIntArray266[local10], Static172.anIntArray329[local10], Static158.aByteArrayArray7[local10], Static169.anIntArray324);
		}
		Static158.method2564();
		return local4;
	}
}
