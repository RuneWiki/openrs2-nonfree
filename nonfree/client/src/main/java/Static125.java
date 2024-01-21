import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	public static int anInt3217;

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1057 = Static170.method3101(" x ");

	@OriginalMember(owner = "client!q", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1058 = Static170.method3101(" loggt sich aus)3");

	@OriginalMember(owner = "client!q", name = "db", descriptor = "I")
	public static int anInt3216 = 0;

	@OriginalMember(owner = "client!q", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1059 = Static170.method3101("hitmarks");

	@OriginalMember(owner = "client!q", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1060 = Static170.method3101("<br>(X");

	@OriginalMember(owner = "client!q", name = "nb", descriptor = "[I")
	public static int[] anIntArray551 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILclient!gf;Lclient!fb;)V")
	public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) Class3_Sub2_Sub2_Sub4 arg5) {
		@Pc(16) int local16 = arg1 * arg1 + arg0 * arg0;
		@Pc(28) int local28 = Math.min(arg4.anInt1457 / 2, arg4.anInt1515 / 2) - 20;
		if (local16 <= local28 * local28 || local16 >= 90000) {
			Static121.method2434(arg4, arg0, arg3, arg5, arg2, arg1);
			return;
		}
		@Pc(46) int local46 = Static139.anInt3673 + Static170.anInt4092 & 0x7FF;
		@Pc(50) int local50 = Class3_Sub2_Sub2_Sub2.anIntArray129[local46];
		@Pc(54) int local54 = Class3_Sub2_Sub2_Sub2.anIntArray127[local46];
		@Pc(62) int local62 = local50 * 256 / (Static51.anInt1446 + 256);
		@Pc(70) int local70 = local54 * 256 / (Static51.anInt1446 + 256);
		@Pc(80) int local80 = arg0 * local62 - local70 * arg1 >> 16;
		@Pc(90) int local90 = local70 * arg0 + arg1 * local62 >> 16;
		@Pc(96) double local96 = Math.atan2((double) local90, (double) local80);
		@Pc(103) int local103 = (int) (Math.sin(local96) * (double) local28);
		@Pc(110) int local110 = (int) (Math.cos(local96) * (double) local28);
		Static177.aClass3_Sub2_Sub2_Sub4_8.method994(local103 + arg4.anInt1457 / 2 + arg2 + 4 - 10, arg3 + -20 + arg4.anInt1515 / 2 + -local110, local96);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!kb;IJIIII)Z")
	public static boolean method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static92.method3173(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)Lclient!og;")
	public static Class3_Sub2_Sub15 method2489() {
		if (Static140.aClass3_Sub2_Sub15_1 == null) {
			Static140.aClass3_Sub2_Sub15_1 = new Class3_Sub2_Sub15();
		}
		return Static140.aClass3_Sub2_Sub15_1;
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
	public static void method2490() {
		aClass28_1060 = null;
		aClass28_1059 = null;
		aClass28_1057 = null;
		anIntArray551 = null;
		aClass28_1058 = null;
	}
}
