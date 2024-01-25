import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!og", name = "s", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array10;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public static int anInt5002 = -1;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "Z")
	public static boolean aBoolean459 = false;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!jj;)V")
	public static void method3983(@OriginalArg(1) Class111_Sub2 arg0) {
		arg0.aClass11_Sub1_Sub3_1 = null;
		if (Static391.anInt6297 < 20) {
			Static328.aClass63_6.method1024(arg0);
			Static391.anInt6297++;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3985(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static41.anInt612 = 7;
		Static383.anInt6136 = 0x1 << Static41.anInt612;
		Static324.anInt5325 = Static383.anInt6136 >> 1;
		Static212.anInt3919 = (int) Math.sqrt((double) (Static324.anInt5325 * Static324.anInt5325 + Static324.anInt5325 * Static324.anInt5325));
		Static404.anInt6474 = Static383.anInt6136 >> 2;
		Static340.anInt5525 = Static383.anInt6136;
		Static174.anInt2873 = arg0;
		Static325.anInt5351 = arg1;
		Static99.anInt1331 = arg2;
		Static71.aClass216ArrayArrayArray1 = new Class216[4][Static174.anInt2873][Static325.anInt5351];
		Static157.aClass139Array1 = new Class139[4];
		if (arg3) {
			Static105.anIntArrayArray18 = new int[Static174.anInt2873][Static325.anInt5351];
			Static240.aByteArrayArray81 = new byte[Static174.anInt2873][Static325.anInt5351];
			Static425.aShortArrayArray9 = new short[Static174.anInt2873][Static325.anInt5351];
			Static165.aClass216ArrayArrayArray2 = new Class216[1][Static174.anInt2873][Static325.anInt5351];
			Static397.aClass139Array2 = new Class139[1];
		} else {
			Static105.anIntArrayArray18 = null;
			Static240.aByteArrayArray81 = null;
			Static425.aShortArrayArray9 = null;
			Static165.aClass216ArrayArrayArray2 = null;
			Static397.aClass139Array2 = null;
		}
		if (arg4) {
			Static404.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static203.aClass93Array1 = new Class93[65535];
			Static192.aBooleanArray75 = new boolean[65535];
			Static395.anInt6364 = 0;
		} else {
			Static404.aLongArrayArrayArray1 = null;
			Static203.aClass93Array1 = null;
			Static192.aBooleanArray75 = null;
			Static395.anInt6364 = 0;
		}
		Static56.method806(false);
		Static350.aClass254Array2 = new Class254[1000];
		Static269.anInt4694 = 0;
		Static331.aClass254Array1 = new Class254[1000];
		Static391.anInt6296 = 0;
		Static148.anIntArrayArrayArray2 = new int[4][Static174.anInt2873 + 1][Static325.anInt5351 + 1];
		Static56.aClass11_Sub1Array1 = new Class11_Sub1[5000];
		Static24.anInt352 = 0;
		Static84.aBooleanArrayArray3 = new boolean[Static99.anInt1331 + Static99.anInt1331 + 1][Static99.anInt1331 + Static99.anInt1331 + 1];
		Static81.aBooleanArrayArray2 = new boolean[Static99.anInt1331 + Static99.anInt1331 + 2][Static99.anInt1331 + Static99.anInt1331 + 2];
		Static352.aClass12_1 = null;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	public static void method3987() {
		for (@Pc(12) int local12 = 0; local12 < Static249.anInt4440; local12++) {
			@Pc(18) Class43 local18 = Static234.aClass43Array1[local12];
			if (local18.aByte20 == 2) {
				if (local18.aClass1_Sub9_Sub4_1 == null) {
					local18.anInt924 = Integer.MIN_VALUE;
				} else {
					Static123.aClass1_Sub9_Sub1_1.method4263(local18.aClass1_Sub9_Sub4_1);
				}
			}
		}
	}
}
