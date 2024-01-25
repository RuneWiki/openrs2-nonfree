import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!vn;")
	public static Class190 aClass190_6;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "Lclient!nv;")
	public static Class230 aClass230_5;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Lclient!mr;")
	public static Applet_Sub1 anApplet_Sub1_5 = null;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_149 = new Class268(88, 6);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIII)V")
	public static void method7044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == arg0) {
			Static272.method5662(arg3, arg4, arg1, arg2);
		} else if (Static347.anInt6542 <= arg2 - arg3 && arg3 + arg2 <= Static553.anInt9425 && Static100.anInt10042 <= arg4 - arg0 && arg4 + arg0 <= Static567.anInt9578) {
			Static630.method8734(arg2, arg4, arg0, arg3, arg1);
		} else {
			Static175.method3220(arg4, arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
	public static void method7046() {
		Static284.aFont3 = null;
		Static194.anImage1 = null;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method7047(@OriginalArg(1) byte[] arg0) {
		return Static510.method7547(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIZIIII)V")
	public static void method7049(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 ? Static348.aClass6_Sub22_19.aClass15_Sub18_4.method5678() : Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678()) != 0 && arg5 != 0 && Static277.anInt5443 < 50 && arg3 != -1) {
			Static280.aClass224Array1[Static277.anInt5443++] = new Class224((byte) (arg1 ? 3 : 2), arg3, arg5, arg2, arg4, 0, arg0, (Class20_Sub2) null);
		}
	}
}
