import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_4 = new Class256("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static328.method4699(arg0, arg1)) {
			return Static13.method218(arg1, arg0) | (arg1 & 0xB000) != 0 | Static418.method5663(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static336.method4750(arg1, arg0) | Static314.method4489(arg1, arg0));
		} else {
			return false;
		}
	}
}
