import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!pc", name = "vc", descriptor = "I")
	public static int anInt1948;

	@OriginalMember(owner = "client!pc", name = "yc", descriptor = "I")
	public static int anInt1949;

	@OriginalMember(owner = "client!pc", name = "Cc", descriptor = "I")
	public static int anInt1951;

	@OriginalMember(owner = "client!pc", name = "Gb", descriptor = "Lclient!pc;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_1 = new Class1_Sub1_Sub8_Sub3();

	@OriginalMember(owner = "client!pc", name = "Wb", descriptor = "Lclient!pc;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_2 = new Class1_Sub1_Sub8_Sub3();

	@OriginalMember(owner = "client!pc", name = "Xb", descriptor = "[I")
	public static int[] anIntArray287 = new int[1];

	@OriginalMember(owner = "client!pc", name = "Yb", descriptor = "[I")
	public static int[] anIntArray288 = new int[2000];

	@OriginalMember(owner = "client!pc", name = "Zb", descriptor = "[I")
	public static int[] anIntArray289 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "ac", descriptor = "[I")
	public static int[] anIntArray290 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "bc", descriptor = "[I")
	public static int[] anIntArray291 = new int[10];

	@OriginalMember(owner = "client!pc", name = "cc", descriptor = "[I")
	public static int[] anIntArray292 = new int[1500];

	@OriginalMember(owner = "client!pc", name = "dc", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[1500][512];

	@OriginalMember(owner = "client!pc", name = "ec", descriptor = "[I")
	public static int[] anIntArray293 = new int[2000];

	@OriginalMember(owner = "client!pc", name = "fc", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[4096];

	@OriginalMember(owner = "client!pc", name = "gc", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!pc", name = "hc", descriptor = "[I")
	public static int[] anIntArray294 = new int[12];

	@OriginalMember(owner = "client!pc", name = "ic", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[4096];

	@OriginalMember(owner = "client!pc", name = "jc", descriptor = "[I")
	public static int[] anIntArray295 = new int[10];

	@OriginalMember(owner = "client!pc", name = "kc", descriptor = "[I")
	public static int[] anIntArray296 = new int[12];

	@OriginalMember(owner = "client!pc", name = "lc", descriptor = "[I")
	public static int[] anIntArray297 = new int[1];

	@OriginalMember(owner = "client!pc", name = "mc", descriptor = "[I")
	public static int[] anIntArray298 = new int[1000];

	@OriginalMember(owner = "client!pc", name = "nc", descriptor = "I")
	public static int anInt1946 = 0;

	@OriginalMember(owner = "client!pc", name = "oc", descriptor = "[I")
	public static int[] anIntArray299 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "pc", descriptor = "[I")
	public static int[] anIntArray300 = new int[10];

	@OriginalMember(owner = "client!pc", name = "qc", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!pc", name = "rc", descriptor = "[I")
	public static int[] anIntArray301 = Class1_Sub1_Sub1_Sub2.anIntArray144;

	@OriginalMember(owner = "client!pc", name = "sc", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[12][2000];

	@OriginalMember(owner = "client!pc", name = "tc", descriptor = "[I")
	public static int[] anIntArray302 = Static41.anIntArray140;

	@OriginalMember(owner = "client!pc", name = "uc", descriptor = "[I")
	public static int[] anIntArray303 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "xc", descriptor = "[I")
	public static int[] anIntArray305 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "zc", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!pc", name = "Ac", descriptor = "[I")
	public static int[] anIntArray306 = Class1_Sub1_Sub1_Sub2.anIntArray143;

	@OriginalMember(owner = "client!pc", name = "Bc", descriptor = "[I")
	public static int[] anIntArray307 = Class1_Sub1_Sub1_Sub2.anIntArray142;

	@OriginalMember(owner = "client!pc", name = "Dc", descriptor = "[I")
	public static int[] anIntArray308 = new int[4096];

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)I")
	public static int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class1_Sub1_Sub8_Sub3.anIntArray304[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ja;II)Lclient!pc;")
	public static Class1_Sub1_Sub8_Sub3 method1372(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1305(0, arg1);
		return local5 == null ? null : new Class1_Sub1_Sub8_Sub3(local5);
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "()V")
	public static void method1393() {
		aClass1_Sub1_Sub8_Sub3_1 = null;
		anIntArray287 = null;
		aClass1_Sub1_Sub8_Sub3_2 = null;
		anIntArray297 = null;
		aBooleanArray13 = null;
		aBooleanArray12 = null;
		anIntArray305 = null;
		anIntArray290 = null;
		anIntArray303 = null;
		anIntArray299 = null;
		anIntArray289 = null;
		anIntArray308 = null;
		anIntArray292 = null;
		anIntArrayArray23 = null;
		anIntArray294 = null;
		anIntArrayArray24 = null;
		anIntArray293 = null;
		anIntArray288 = null;
		anIntArray296 = null;
		anIntArray291 = null;
		anIntArray295 = null;
		anIntArray300 = null;
		anIntArray298 = null;
		anIntArray301 = null;
		anIntArray306 = null;
		anIntArray302 = null;
		anIntArray307 = null;
		Class1_Sub1_Sub8_Sub3.anIntArray304 = null;
	}
}
