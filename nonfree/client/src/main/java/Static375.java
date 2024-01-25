import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!t", name = "G", descriptor = "[I")
	public static int[] anIntArray572;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_109 = new Class96("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Lclient!uq;")
	public static final Class247 aClass247_11 = new Class247();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
	public static void method5899(@OriginalArg(0) int arg0) {
		Static44.method579();
		Static224.method3271();
		Static213.method3203(arg0, true);
		Static83.method3986(Static447.aClass121_11, Static353.aClass109_79, Static381.aClass109_12);
		Static298.method4070(Static447.aClass121_11, Static353.aClass109_79);
		Static357.method5116(Static407.aClass78Array13);
		Static367.method5227();
		Static197.method3044();
		if (Static40.anInt629 == 10) {
			Static309.method4240(false);
		} else if (Static40.anInt629 == 30) {
			Static169.method2637(25);
		} else if (Static40.anInt629 == 5) {
			Static234.method3398(Static447.aClass121_11, Static353.aClass109_79);
			return;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)C")
	public static char method5900(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(45) char local45 = Static393.aCharArray4[local12 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local12 = local45;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIILclient!kg;Lclient!kg;)V")
	public static void method5902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub4 arg3, @OriginalArg(4) Class47_Sub4 arg4) {
		@Pc(4) Class137 local4 = Static266.method5735(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub4_1 = arg3;
			local4.aClass47_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(DB)V")
	public static void method5903(@OriginalArg(0) double arg0) {
		if (arg0 == Static349.aDouble9) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static7.anIntArray10[local15] = local27 <= 255 ? local27 : 255;
		}
		Static349.aDouble9 = arg0;
	}
}
