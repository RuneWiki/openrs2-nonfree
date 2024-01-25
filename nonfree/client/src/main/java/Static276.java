import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static276 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public static int anInt5131;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "Lclient!o;")
	public static final Class169 aClass169_283 = new Class169(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
	public static int anInt5132 = -1;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public static int anInt5133 = -1;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBII)V")
	public static void method4510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1003) {
			Static387.method5498(Static200.aClass213_13, arg1, arg2);
		} else if (arg0 == 1011) {
			Static387.method5498(Static147.aClass213_11, arg1, arg2);
		} else if (arg0 == 1007) {
			Static387.method5498(Static115.aClass213_10, arg1, arg2);
		} else if (arg0 == 1010) {
			Static387.method5498(Static22.aClass213_14, arg1, arg2);
		} else if (arg0 == 1001) {
			Static387.method5498(Static161.aClass213_12, arg1, arg2);
		}
	}
}
