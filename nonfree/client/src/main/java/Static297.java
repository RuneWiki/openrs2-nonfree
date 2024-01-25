import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public static int anInt4992;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "[I")
	public static final int[] anIntArray341 = new int[1];

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_63 = new Class154(34, -1);

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public static int anInt4991 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!uca;II[II[I)Lclient!kba;")
	public static Class84_Sub3 method4278(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(15) byte[] local15 = new byte[arg1 * arg3];
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg4[local17] + local17 * arg3;
			for (@Pc(29) int local29 = 0; local29 < arg2[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class84_Sub3(arg0, arg3, arg1, local15);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V")
	public static void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static212.anInt3068 = arg0;
		Static353.anInt6039 = arg2;
		Static181.anInt2686 = arg4;
		Static582.anInt9451 = arg1;
		Static18.anInt4107 = arg3;
		if (Static181.anInt2686 >= 100) {
			@Pc(22) int local22 = Static353.anInt6039 * 512 + 256;
			@Pc(28) int local28 = Static18.anInt4107 * 512 + 256;
			@Pc(37) int local37 = Static24.method347(local28, local22, Static402.anInt6620) - Static212.anInt3068;
			@Pc(42) int local42 = local22 - Static285.anInt2206;
			@Pc(46) int local46 = local37 - Static151.anInt2436;
			@Pc(51) int local51 = local28 - Static469.anInt7519;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local42 * local42));
			Static396.anInt6527 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static584.anInt9487 = (int) (Math.atan2((double) local42, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static396.anInt6527 < 1024) {
				Static396.anInt6527 = 1024;
			}
			Static140.anInt4804 = 0;
			if (Static396.anInt6527 > 3072) {
				Static396.anInt6527 = 3072;
			}
		}
		Static489.anInt7763 = 2;
		Static203.anInt2978 = -1;
		Static148.anInt2359 = -1;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public static void method4281() {
		for (@Pc(6) Class2_Sub27 local6 = (Class2_Sub27) Static411.aClass70_43.method1264(); local6 != null; local6 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			if (Static469.method6042(local6.anInt4323)) {
				Static260.method3662(local6);
			}
		}
		if (Static484.anInt7715 == 1) {
			Static312.method4449();
			return;
		}
		Static359.method2627(Static524.anInt8323, Static214.anInt3100, Static428.anInt6943, Static312.anInt5139);
		@Pc(60) int local60 = Static537.aClass112_11.method2078(Static229.aClass159_26.method2776(Static261.anInt4297));
		for (@Pc(65) Class2_Sub27 local65 = (Class2_Sub27) Static411.aClass70_43.method1264(); local65 != null; local65 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			@Pc(71) int local71 = Static147.method2015(local65);
			if (local71 > local60) {
				local60 = local71;
			}
		}
		Static428.anInt6943 = local60 + 8;
		Static524.anInt8323 = (Static321.aBoolean428 ? 26 : 22) + Static484.anInt7715 * 16;
	}
}
