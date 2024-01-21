import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!hc", name = "Ac", descriptor = "I")
	public static int anInt1121;

	@OriginalMember(owner = "client!hc", name = "Dc", descriptor = "I")
	public static int anInt1122;

	@OriginalMember(owner = "client!hc", name = "Jc", descriptor = "I")
	public static int anInt1124;

	@OriginalMember(owner = "client!hc", name = "Rb", descriptor = "Lclient!hc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_1 = new Class3_Sub1_Sub1_Sub4();

	@OriginalMember(owner = "client!hc", name = "ac", descriptor = "Lclient!hc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_2 = new Class3_Sub1_Sub1_Sub4();

	@OriginalMember(owner = "client!hc", name = "dc", descriptor = "[I")
	public static int[] anIntArray134 = new int[1];

	@OriginalMember(owner = "client!hc", name = "fc", descriptor = "[I")
	public static int[] anIntArray136 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "gc", descriptor = "I")
	public static int anInt1119 = 0;

	@OriginalMember(owner = "client!hc", name = "hc", descriptor = "[I")
	public static int[] anIntArray137 = new int[1600];

	@OriginalMember(owner = "client!hc", name = "ic", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[12][2000];

	@OriginalMember(owner = "client!hc", name = "jc", descriptor = "[I")
	public static int[] anIntArray138 = Class3_Sub1_Sub4_Sub1.anIntArray293;

	@OriginalMember(owner = "client!hc", name = "kc", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[1600][512];

	@OriginalMember(owner = "client!hc", name = "lc", descriptor = "[I")
	public static int[] anIntArray139 = new int[1000];

	@OriginalMember(owner = "client!hc", name = "mc", descriptor = "[I")
	public static int[] anIntArray140 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "nc", descriptor = "[I")
	public static int[] anIntArray141 = new int[2000];

	@OriginalMember(owner = "client!hc", name = "oc", descriptor = "[I")
	public static int[] anIntArray142 = Class3_Sub1_Sub4_Sub1.anIntArray298;

	@OriginalMember(owner = "client!hc", name = "pc", descriptor = "[I")
	public static int[] anIntArray143 = new int[10];

	@OriginalMember(owner = "client!hc", name = "qc", descriptor = "[I")
	public static int[] anIntArray144 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "rc", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[4096];

	@OriginalMember(owner = "client!hc", name = "sc", descriptor = "I")
	public static int anInt1120 = 0;

	@OriginalMember(owner = "client!hc", name = "tc", descriptor = "[I")
	public static int[] anIntArray145 = new int[2000];

	@OriginalMember(owner = "client!hc", name = "uc", descriptor = "[I")
	public static int[] anIntArray146 = new int[10];

	@OriginalMember(owner = "client!hc", name = "vc", descriptor = "[I")
	public static int[] anIntArray147 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "wc", descriptor = "[I")
	public static int[] anIntArray148 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "xc", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!hc", name = "yc", descriptor = "[I")
	public static int[] anIntArray149 = Class3_Sub1_Sub4_Sub1.anIntArray295;

	@OriginalMember(owner = "client!hc", name = "zc", descriptor = "[I")
	public static int[] anIntArray150 = new int[4096];

	@OriginalMember(owner = "client!hc", name = "Bc", descriptor = "[I")
	public static int[] anIntArray151 = Static99.anIntArray294;

	@OriginalMember(owner = "client!hc", name = "Cc", descriptor = "[I")
	public static int[] anIntArray152 = new int[1];

	@OriginalMember(owner = "client!hc", name = "Ec", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!hc", name = "Fc", descriptor = "[I")
	public static int[] anIntArray153 = new int[10];

	@OriginalMember(owner = "client!hc", name = "Gc", descriptor = "[I")
	public static int[] anIntArray154 = new int[12];

	@OriginalMember(owner = "client!hc", name = "Hc", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[4096];

	@OriginalMember(owner = "client!hc", name = "Ic", descriptor = "[I")
	public static int[] anIntArray155 = new int[12];

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)I")
	public static int method769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Class3_Sub1_Sub1_Sub4.anIntArray135[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!rd;II)Lclient!hc;")
	public static Class3_Sub1_Sub1_Sub4 method789(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1625(arg1, 0);
		return local5 == null ? null : new Class3_Sub1_Sub1_Sub4(local5);
	}

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "()V")
	public static void method790() {
		aClass3_Sub1_Sub1_Sub4_1 = null;
		anIntArray134 = null;
		aClass3_Sub1_Sub1_Sub4_2 = null;
		anIntArray152 = null;
		aBooleanArray9 = null;
		aBooleanArray10 = null;
		anIntArray136 = null;
		anIntArray140 = null;
		anIntArray150 = null;
		anIntArray147 = null;
		anIntArray144 = null;
		anIntArray148 = null;
		anIntArray137 = null;
		anIntArrayArray12 = null;
		anIntArray154 = null;
		anIntArrayArray11 = null;
		anIntArray145 = null;
		anIntArray141 = null;
		anIntArray155 = null;
		anIntArray146 = null;
		anIntArray153 = null;
		anIntArray143 = null;
		anIntArray139 = null;
		anIntArray149 = null;
		anIntArray142 = null;
		anIntArray151 = null;
		anIntArray138 = null;
		Class3_Sub1_Sub1_Sub4.anIntArray135 = null;
	}
}
