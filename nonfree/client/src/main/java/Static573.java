import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "Lclient!lf;")
	public static final Class221 aClass221_20 = new Class221(3, 4);

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
	public static int anInt9174 = 1;

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
	public static int anInt9177 = 0;

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[4];

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!lga;ILclient!d;)V")
	public static void method8011(@OriginalArg(0) Class223 arg0, @OriginalArg(2) Interface11 arg1) {
		Static190.aClass223_38 = arg0;
		Static538.anInterface11_11 = arg1;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(DI)V")
	public static void method8012(@OriginalArg(0) double arg0) {
		if (Static141.aDouble50 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(21) int local21 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static639.anIntArray652[local7] = local21 <= 255 ? local21 : 255;
		}
		Static141.aDouble50 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBIIZIII)V")
	public static void method8013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338() != 0 && arg4 != 0 && Static74.anInt1034 < 50 && arg5 != -1) {
			Static534.aClass124Array6[Static74.anInt1034++] = new Class124((byte) 2, arg5, arg4, arg1, arg2, arg0, arg3, (Class60_Sub1) null);
		}
	}
}
