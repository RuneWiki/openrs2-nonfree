import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	public static int anInt886;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
	public static int anInt896;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lclient!vb;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!he;")
	public static Class44 aClass44_11 = new Class44();

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	public static int anInt897 = 0;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lclient!qe;")
	private static Class78 aClass78_166 = Static199.method3560("Connection lost)3");

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "Lclient!qe;")
	public static Class78 aClass78_165 = aClass78_166;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
	public static int anInt904 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!og;B)V")
	public static void method644(@OriginalArg(0) Class5_Sub2 arg0) {
		arg0.anInt1833 = 0;
		if (arg0.anInt1839 == 0) {
			arg0.anInt1852 = 1024;
		}
		if (arg0.anInt1839 == 1) {
			arg0.anInt1852 = 1536;
		}
		if (arg0.anInt1839 == 2) {
			arg0.anInt1852 = 0;
		}
		if (arg0.anInt1839 == 3) {
			arg0.anInt1852 = 512;
		}
		@Pc(54) int local54 = arg0.anInt1832 * 64 + arg0.anInt1828 * 128;
		@Pc(59) int local59 = arg0.anInt1871 - Static123.anInt2808;
		@Pc(69) int local69 = arg0.anInt1832 * 64 + arg0.anInt1868 * 128;
		arg0.anInt1849 += (local54 - arg0.anInt1849) / local59;
		arg0.anInt1827 += (local69 - arg0.anInt1827) / local59;
	}
}
