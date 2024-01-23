import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	public static int anInt2165;

	@OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
	public static int anInt2166;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
	public static int anInt2167;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "Lclient!kd;")
	public static Class20_Sub5_Sub1 aClass20_Sub5_Sub1_1 = new Class20_Sub5_Sub1();

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "[B")
	public static byte[] aByteArray31 = new byte[1];

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!kd;")
	public static Class20_Sub5_Sub1 aClass20_Sub5_Sub1_2 = new Class20_Sub5_Sub1();

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "[I")
	public static int[] anIntArray218 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "[I")
	public static int[] anIntArray219 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "[I")
	public static int[] anIntArray220 = new int[10];

	@OriginalMember(owner = "client!kd", name = "ab", descriptor = "[I")
	public static int[] anIntArray221 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "[I")
	public static int[] anIntArray222 = new int[10];

	@OriginalMember(owner = "client!kd", name = "db", descriptor = "[I")
	public static int[] anIntArray223 = new int[1600];

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[4096];

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "[I")
	public static int[] anIntArray224 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "[I")
	public static int[] anIntArray225 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "[I")
	public static int[] anIntArray226 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "[I")
	public static int[] anIntArray227 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "[I")
	public static int[] anIntArray228 = new int[12];

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[1600][512];

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[4096];

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "[I")
	public static int[] anIntArray229 = new int[10];

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[12][4096];

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "[B")
	public static byte[] aByteArray32 = new byte[1];

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "[I")
	public static int[] anIntArray230 = new int[12];

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "[I")
	public static int[] anIntArray231 = new int[4096];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public static int method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I")
	public static int method1722(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
