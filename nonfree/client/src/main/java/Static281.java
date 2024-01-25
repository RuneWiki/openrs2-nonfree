import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_86 = new Class67(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_100 = new Class133(81, 12);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	public static void method4818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static489.anInt8712; local7++) {
			@Pc(13) Rectangle local13 = Class102.aRectangleArray1[local7];
			if (local13.x + local13.width > arg2 && arg2 + arg1 > local13.x && local13.y + local13.height > arg0 && arg3 + arg0 > local13.y) {
				Static302.aBooleanArray29[local7] = true;
			}
		}
	}
}
