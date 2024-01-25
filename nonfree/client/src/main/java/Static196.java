import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Lclient!ik;")
	public static Class182 aClass182_65;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Z")
	public static final boolean aBoolean239 = false;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
	public static int[] anIntArray284 = new int[2];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!ha;Lclient!nt;)V")
	public static void method3476(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Class270 arg1) {
		@Pc(33) boolean local33 = Static606.aClass62_2.method1889(arg1.aBoolean478 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null, arg1.anInt6968 | 0xFF000000, arg1.anInt6961, arg0, arg1.anInt6990, arg1.anInt7003, arg1.anInt7001) == null;
		if (local33) {
			Static557.aClass342_68.method7654(new Class3_Sub43(arg1.anInt7001, arg1.anInt7003, arg1.anInt6990, arg1.anInt6968 | 0xFF000000, arg1.anInt6961, arg1.aBoolean478));
			Static539.method7146(arg1);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIII)V")
	public static void method3477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class3_Sub7_Sub21 local14 = Static136.method2378((long) arg0 | (long) arg3 << 32, 19);
		local14.method9256();
		local14.anInt10899 = arg1;
		local14.anInt10897 = arg2;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public static void method3480() {
		Static466.anIntArrayArrayArray12 = new int[Static169.anInt2992][Static128.anInt2531 + 1][Static448.anInt6835 + 1];
		Static79.aClass108Array3 = new Class108[500];
		Static328.anInt8407 = 0;
		Static357.aClass108Array6 = new Class108[500];
		Static106.anInt2280 = Static308.anInt4969;
		Static298.aBoolean294 = false;
		Static340.anInt5461 = 0;
		Static86.anInt2031 = 0;
		Static179.aClass108Array5 = new Class108[2000];
		Static233.anInt3758 = Static308.anInt4969;
		Static525.anInt8215 = 0;
		Static131.aClass108Array4 = new Class108[1000];
		if (Static404.aClass22_6 instanceof oa) {
			Static42.aBoolean87 = false;
		} else {
			Static42.aBoolean87 = true;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(FIFIFFIFIILclient!dfa;)[B")
	public static byte[] method3481(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(10) Class75 arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static459.method6219(arg3, local10, arg0, arg4, 0, arg2, arg5, arg1);
		return local10;
	}
}
