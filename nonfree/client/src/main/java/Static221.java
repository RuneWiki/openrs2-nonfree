import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_73 = new Class268(44, 6);

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
	public static int anInt4349 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZZLclient!mba;Z)V")
	public static void method3774(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub29 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt6361;
		@Pc(12) int local12 = (int) arg1.aLong278;
		arg1.method9043();
		if (arg2) {
			Static388.method6215(local8);
		}
		Static333.method8038(local8);
		@Pc(27) Class302 local27 = Static386.method4914(local12);
		if (local27 != null) {
			Static603.method8464(local27);
		}
		Static208.method3599();
		if (!arg0 && Static554.anInt1822 != -1) {
			Static104.method1720(Static554.anInt1822, 1);
		}
		@Pc(49) Class295 local49 = new Class295(Static507.aClass128_42);
		for (@Pc(54) Class6_Sub29 local54 = (Class6_Sub29) local49.method7421(); local54 != null; local54 = (Class6_Sub29) local49.method7423()) {
			if (!local54.method9042()) {
				local54 = (Class6_Sub29) local49.method7421();
				if (local54 == null) {
					break;
				}
			}
			if (local54.anInt6363 == 3) {
				@Pc(79) int local79 = (int) local54.aLong278;
				if (local79 >>> 16 == local8) {
					method3774(arg0, local54, true);
				}
			}
		}
	}
}
