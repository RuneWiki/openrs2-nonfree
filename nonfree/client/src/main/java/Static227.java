import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
	public static final int anInt4636 = 1337;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZIIB)V")
	public static void method3850(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static527.method7339();
		Static622.aLong281 = 0L;
		@Pc(14) int local14 = Static501.method7132();
		if (arg0 == 3 || local14 == 3) {
			arg1 = true;
		}
		if (!Static600.aClass87_15.method7944()) {
			arg1 = true;
		}
		Static396.method6005(arg1, arg3, arg2, arg0, local14);
	}
}
