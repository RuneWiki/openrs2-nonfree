import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public static int anInt3572;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_48;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1230 = Static161.method2971("blinken2:");

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1231 = Static161.method2971("settings=");

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	public static int[] anIntArray350 = new int[2048];

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1232 = Static161.method2971(")3");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1233 = Static161.method2971("rect_debug=");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1234 = Static161.method2971(" has logged in)3");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1235 = Static161.method2971("AUS");

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[S")
	public static short[] aShortArray41 = new short[500];

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray31 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1236 = null;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1237 = aClass13_1234;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method2581() {
		anIntArrayArray31 = null;
		aShortArray41 = null;
		aClass13_1236 = null;
		aClass13_1230 = null;
		aClass4_Sub1_48 = null;
		aClass13_1231 = null;
		aClass13_1237 = null;
		aClass13_1233 = null;
		aClass13_1235 = null;
		anIntArray350 = null;
		aClass13_1232 = null;
		aClass13_1234 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public static void method2582() {
		Static90.anIntArray252 = null;
		Static87.anIntArray240 = null;
		Static62.aByteArrayArrayArray30 = null;
		Static170.aByteArrayArrayArray43 = null;
		Static67.anIntArray207 = null;
		Static176.anIntArray444 = null;
		Static160.anIntArrayArrayArray7 = null;
		Static131.aByteArrayArrayArray36 = null;
		Static19.aByteArrayArrayArray15 = null;
		Static81.aByteArrayArrayArray27 = null;
		Static62.anIntArray249 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIILclient!lc;IJ)Z")
	public static boolean method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static42.method1118(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
