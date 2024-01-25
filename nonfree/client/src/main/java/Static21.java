import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	public static int anInt454 = -1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)V")
	public static void method560() {
		@Pc(5) int local5 = Static649.anInt10495;
		@Pc(7) int[] local7 = Static426.anIntArray476;
		for (@Pc(13) int local13 = 0; local13 < local5; local13++) {
			@Pc(20) Class16_Sub1_Sub1_Sub3_Sub2 local20 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local7[local13]];
			if (local20 != null) {
				Static403.method6008(local20, local20.method6999());
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZB)V")
	public static void method563(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static252.anInt4800--;
			if (Static252.anInt4800 == 0) {
				Static347.anIntArray701 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static284.anInt5163--;
		if (Static284.anInt5163 == 0) {
			Static476.anIntArray555 = null;
			return;
		}
	}
}
