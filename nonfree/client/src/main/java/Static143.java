import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_53 = new Class268(67, 2);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
	public static int method2299() {
		@Pc(12) int local12 = Static308.aClass228_2.method6202();
		if (local12 < Static238.aClass228Array1.length - 1) {
			Static308.aClass228_2 = Static238.aClass228Array1[local12 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V")
	public static void method2301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static595.anInt9912; local12++) {
			@Pc(18) Rectangle local18 = Class6.aRectangleArray148[local12];
			if (arg1 < local18.x + local18.width && local18.x < arg2 + arg1 && arg3 < local18.y + local18.height && arg0 + arg3 > local18.y) {
				Static501.aBooleanArray46[local12] = true;
			}
		}
		Static347.method5621(arg0 + arg3, arg1 + arg2, arg3, arg1);
	}
}
