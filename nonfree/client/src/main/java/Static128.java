import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_58 = new Class55(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt2476 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
	public static boolean method2063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static187.method2739(arg1, arg0) | (arg1 & 0x2000) != 0 | Static109.method1889(arg1, arg0)) & Static175.method2538(arg1, arg0);
	}
}
