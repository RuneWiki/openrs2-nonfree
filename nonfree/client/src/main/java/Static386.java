import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public static int anInt8111;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static int anInt8112;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static int anInt8113;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_123 = new Class45("Loading shaders", "Lade shaders", "Chargement des nuanceurs", "Carregando sombreamento - ");

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "[I")
	public static final int[] anIntArray741 = new int[8];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;IBLclient!dn;Lclient!n;I)Lclient!qa;")
	public static synchronized Class4 method7191(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2, @OriginalArg(4) Interface13 arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return Static127.method2442(false, arg3, arg0);
		} else if (arg4 == 2) {
			return Static404.method6440(arg3, arg0);
		} else if (arg4 == 4) {
			return Static127.method2442(true, arg3, arg0);
		} else if (arg4 == 1) {
			return Static369.method5966(arg3, arg0, arg1);
		} else if (arg4 == 5) {
			return Static163.method2930(arg1, arg2, arg0, arg3);
		} else if (arg4 == 3) {
			return Static553.method6570(arg2, arg1, arg0, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
