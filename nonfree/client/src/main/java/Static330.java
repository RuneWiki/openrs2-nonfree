import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	public static int anInt5656;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!ro;")
	public static final Class1_Sub38 aClass1_Sub38_1 = new Class1_Sub38(0, 0);

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_129 = new Class7("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)I")
	public static int method4696() {
		return 16;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static258.anInt3113 = arg4;
		Static145.anInt2798 = arg1;
		Static91.anInt1908 = arg3;
		Static21.anInt527 = arg2;
		Static305.anInt5270 = arg0;
		if (arg5 && Static91.anInt1908 >= 100) {
			Static139.anInt2727 = Static258.anInt3113 * 128 + 64;
			Static92.anInt1946 = Static145.anInt2798 * 128 + 64;
			Static142.anInt5535 = Static301.method4312(Static357.anInt5881, Static139.anInt2727, Static92.anInt1946) - Static305.anInt5270;
		}
		Static345.anInt5797 = 2;
	}
}
