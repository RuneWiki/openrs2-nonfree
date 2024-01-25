import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	public static int anInt6471;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
	public static int anInt6470 = 0;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_89 = new Class134(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)I")
	public static int method5032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local15;
		} else {
			return local15;
		}
	}
}
