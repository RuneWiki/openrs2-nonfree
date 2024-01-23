import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!og", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!og", name = "L", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_90;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "I")
	public static int anInt3421;

	@OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
	public static int anInt3427;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public static int anInt3410 = 0;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "I")
	public static int anInt3415 = 0;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public static int anInt3417 = 0;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!sc;")
	public static Class107 aClass107_902 = Static231.method3737("rect_debug=");

	@OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
	public static int[] anIntArray298 = new int[64];

	@OriginalMember(owner = "client!og", name = "S", descriptor = "[I")
	public static int[] anIntArray299 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "Z")
	public static boolean aBoolean301 = true;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
	public static int method2529(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
