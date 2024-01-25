import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "[I")
	public static int[] anIntArray490;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "I")
	public static int anInt6410;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[Lclient!lp;")
	public static final Class138[] aClass138Array2 = new Class138[14];

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public static int anInt6409 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!uu;II)V")
	public static void method5013(@OriginalArg(1) Class247 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static341.aBoolean599) {
			@Pc(181) Class133 local181 = Static7.anInt5460 == -1 ? null : Static153.aClass180_1.method4121(Static7.anInt5460);
			if (Static53.method900(arg0).method3903() && (Static434.anInt7378 & 0x20) != 0 && (local181 == null || arg0.method5299(local181.anInt4123, Static7.anInt5460) != local181.anInt4123)) {
				Static380.method5017(47, false, 0L, arg0.anInt6865, Static49.aString28 + " -> " + arg0.aString66, true, Static388.aString62, arg0.anInt6809, arg0.anInt6779, Static273.anInt5120);
			}
			return;
		}
		@Pc(16) String local16;
		for (@Pc(9) int local9 = 9; local9 >= 5; local9--) {
			local16 = Static420.method5386(local9, arg0);
			if (local16 != null) {
				Static380.method5017(1002, false, (long) (local9 + 1), arg0.anInt6865, arg0.aString66, true, local16, arg0.anInt6809, arg0.anInt6779, Static72.method1350(local9, arg0));
			}
		}
		local16 = Static329.method4431(arg0);
		if (local16 != null) {
			Static380.method5017(9, false, 0L, arg0.anInt6865, arg0.aString66, true, local16, arg0.anInt6809, arg0.anInt6779, arg0.anInt6845);
		}
		for (@Pc(79) int local79 = 4; local79 >= 0; local79--) {
			@Pc(86) String local86 = Static420.method5386(local79, arg0);
			if (local86 != null) {
				Static380.method5017(48, false, (long) (local79 + 1), arg0.anInt6865, arg0.aString66, true, local86, arg0.anInt6809, arg0.anInt6779, Static72.method1350(local79, arg0));
			}
		}
		if (!Static53.method900(arg0).method3906()) {
			return;
		}
		if (arg0.aString64 == null) {
			Static380.method5017(60, false, 0L, arg0.anInt6865, "", true, Static412.aClass83_142.method2267(Static178.anInt3423), arg0.anInt6809, arg0.anInt6779, -1);
		} else {
			Static380.method5017(60, false, 0L, arg0.anInt6865, "", true, arg0.aString64, arg0.anInt6809, arg0.anInt6779, -1);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!fs;)I")
	public static int method5014(@OriginalArg(1) Class76 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2125(Static336.anInt6553)) {
			local5++;
		}
		if (arg0.method2125(Static394.anInt6593)) {
			local5++;
		}
		if (arg0.method2125(Static75.anInt1532)) {
			local5++;
		}
		if (arg0.method2125(Static454.anInt4074)) {
			local5++;
		}
		if (arg0.method2125(Static145.anInt2904)) {
			local5++;
		}
		if (arg0.method2125(Static260.anInt4897)) {
			local5++;
		}
		if (arg0.method2125(Static289.anInt5213)) {
			local5++;
		}
		if (arg0.method2125(Static365.anInt6310)) {
			local5++;
		}
		if (arg0.method2125(Static223.anInt4342)) {
			local5++;
		}
		if (arg0.method2125(Static37.anInt649)) {
			local5++;
		}
		if (arg0.method2125(Static376.anInt6286)) {
			local5++;
		}
		if (arg0.method2125(Static205.anInt3910)) {
			local5++;
		}
		if (arg0.method2125(Static77.anInt1566)) {
			local5++;
		}
		if (arg0.method2125(Static339.anInt5870)) {
			local5++;
		}
		if (arg0.method2125(Static410.anInt6733)) {
			local5++;
		}
		if (arg0.method2125(Static175.anInt3393)) {
			local5++;
		}
		return local5;
	}
}
