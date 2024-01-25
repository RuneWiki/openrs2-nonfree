import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_75 = new Class337(16, 8);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!raa;I)V")
	public static void method4149(@OriginalArg(1) int arg0, @OriginalArg(2) Class295 arg1, @OriginalArg(3) int arg2) {
		if (Static443.aClass295_14 != null || Static142.aBoolean190 || (arg1 == null || Static42.method756(arg1) == null)) {
			return;
		}
		Static443.aClass295_14 = arg1;
		Static106.aClass295_6 = Static42.method756(arg1);
		Static465.anInt7824 = 0;
		Static246.anInt4495 = arg2;
		Static328.aBoolean404 = false;
		Static380.anInt6270 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ofa;I)Lclient!cj;")
	public static Class56_Sub1 method4151(@OriginalArg(0) Class5_Sub22 arg0) {
		return new Class56_Sub1(arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5956(), arg0.method5931(), arg0.method5931(), arg0.method5966());
	}
}
