import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static65 {

	@OriginalMember(owner = "client!ha", name = "Kc", descriptor = "I")
	public static int anInt1781;

	@OriginalMember(owner = "client!ha", name = "Lc", descriptor = "I")
	public static int anInt1782;

	@OriginalMember(owner = "client!ha", name = "Oc", descriptor = "I")
	public static int anInt1783;

	@OriginalMember(owner = "client!ha", name = "ic", descriptor = "Lclient!ha;")
	public static Class2_Sub4_Sub1_Sub3_Sub1 aClass2_Sub4_Sub1_Sub3_Sub1_1 = new Class2_Sub4_Sub1_Sub3_Sub1();

	@OriginalMember(owner = "client!ha", name = "lc", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[1];

	@OriginalMember(owner = "client!ha", name = "oc", descriptor = "Lclient!ha;")
	public static Class2_Sub4_Sub1_Sub3_Sub1 aClass2_Sub4_Sub1_Sub3_Sub1_2 = new Class2_Sub4_Sub1_Sub3_Sub1();

	@OriginalMember(owner = "client!ha", name = "tc", descriptor = "[I")
	public static int[] anIntArray161 = new int[1600];

	@OriginalMember(owner = "client!ha", name = "uc", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[12][2000];

	@OriginalMember(owner = "client!ha", name = "vc", descriptor = "[I")
	public static int[] anIntArray162 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "wc", descriptor = "[I")
	public static int[] anIntArray163 = Class2_Sub4_Sub3_Sub1.anIntArray57;

	@OriginalMember(owner = "client!ha", name = "xc", descriptor = "[I")
	public static int[] anIntArray164 = Static25.anIntArray59;

	@OriginalMember(owner = "client!ha", name = "yc", descriptor = "[I")
	public static int[] anIntArray165 = Class2_Sub4_Sub3_Sub1.anIntArray58;

	@OriginalMember(owner = "client!ha", name = "zc", descriptor = "[B")
	public static byte[] aByteArray19 = new byte[1];

	@OriginalMember(owner = "client!ha", name = "Ac", descriptor = "[I")
	public static int[] anIntArray166 = new int[10];

	@OriginalMember(owner = "client!ha", name = "Bc", descriptor = "[I")
	public static int[] anIntArray167 = new int[2000];

	@OriginalMember(owner = "client!ha", name = "Cc", descriptor = "[I")
	public static int[] anIntArray168 = new int[10];

	@OriginalMember(owner = "client!ha", name = "Dc", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[1600][512];

	@OriginalMember(owner = "client!ha", name = "Ec", descriptor = "[I")
	public static int[] anIntArray169 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "Fc", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[4096];

	@OriginalMember(owner = "client!ha", name = "Gc", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[4096];

	@OriginalMember(owner = "client!ha", name = "Hc", descriptor = "[I")
	public static int[] anIntArray170 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "Ic", descriptor = "[I")
	public static int[] anIntArray171 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "Jc", descriptor = "[I")
	public static int[] anIntArray172 = new int[10];

	@OriginalMember(owner = "client!ha", name = "Mc", descriptor = "[I")
	public static int[] anIntArray173 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "Nc", descriptor = "[I")
	public static int[] anIntArray174 = new int[12];

	@OriginalMember(owner = "client!ha", name = "Pc", descriptor = "[I")
	public static int[] anIntArray175 = new int[2000];

	@OriginalMember(owner = "client!ha", name = "Qc", descriptor = "[I")
	public static int[] anIntArray176 = new int[12];

	@OriginalMember(owner = "client!ha", name = "Rc", descriptor = "[I")
	public static int[] anIntArray177 = Class2_Sub4_Sub3_Sub1.anIntArray60;

	@OriginalMember(owner = "client!ha", name = "Sc", descriptor = "[I")
	public static int[] anIntArray178 = new int[4096];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	public static int method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()V")
	public static void method1211() {
		aClass2_Sub4_Sub1_Sub3_Sub1_1 = null;
		aByteArray16 = null;
		aClass2_Sub4_Sub1_Sub3_Sub1_2 = null;
		aByteArray19 = null;
		aBooleanArray14 = null;
		aBooleanArray13 = null;
		anIntArray162 = null;
		anIntArray173 = null;
		anIntArray171 = null;
		anIntArray169 = null;
		anIntArray170 = null;
		anIntArray178 = null;
		anIntArray161 = null;
		anIntArrayArray12 = null;
		anIntArray176 = null;
		anIntArrayArray11 = null;
		anIntArray167 = null;
		anIntArray175 = null;
		anIntArray174 = null;
		anIntArray172 = null;
		anIntArray166 = null;
		anIntArray168 = null;
		anIntArray165 = null;
		anIntArray177 = null;
		anIntArray164 = null;
		anIntArray163 = null;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)I")
	public static int method1212(@OriginalArg(0) int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}
}
