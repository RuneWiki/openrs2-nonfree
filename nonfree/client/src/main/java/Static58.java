import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_9 = new Class154(26, 4);

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static final int[] anIntArray105 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static final int[] anIntArray106 = new int[3];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!hr;I)V")
	public static void method1012(@OriginalArg(0) Class12_Sub3 arg0) {
		arg0.aClass12_Sub2_2 = null;
		@Pc(12) int local12 = arg0.aClass12_Sub6Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			arg0.aClass12_Sub6Array1[local19].aBoolean576 = false;
		}
		@Pc(33) Class220[] local33 = Class352.aClass220Array1;
		synchronized (Class352.aClass220Array1) {
			if (Class352.aClass220Array1.length > local12 && Static563.anIntArray598[local12] < 200) {
				Class352.aClass220Array1[local12].method4659(arg0);
				@Pc(56) int local56 = Static563.anIntArray598[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!rg;IIILclient!rg;IIZII)V")
	public static void method1014(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub2_Sub1_Sub4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method6775();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class38 local21 = (Class38) Static360.aClass21_56.method324((long) local7);
		if (local21 == null) {
			@Pc(34) Class344[] local34 = Static603.method7121(Static241.aClass229_54, local7);
			if (local34 == null) {
				return;
			}
			local21 = Static417.aClass162_17.method6845(local34[0], true);
			Static360.aClass21_56.method317(local21, (long) local7);
		}
		Static448.method1155(arg0.method6777() * 256, arg4 >> 1, arg0.aByte128, 0, arg6 >> 1, arg0.anInt9374, arg0.anInt9375);
		@Pc(81) int local81 = arg5 + Static494.anIntArray527[0] - 18;
		@Pc(91) int local91 = Static494.anIntArray527[1] + arg2 - 16 - 54;
		@Pc(99) int local99 = local81 + arg1 / 4 * 18;
		@Pc(107) int local107 = local91 + arg1 % 4 * 18;
		local21.method7463(local99, local107);
		if (arg0 == arg3) {
			Static417.aClass162_17.method6888(-256, 18, 18, local107 - 1, local99 + -1);
		}
		@Pc(129) Class12_Sub10 local129 = Static134.method1817();
		local129.aClass12_Sub2_Sub1_Sub4_1 = arg3;
		local129.anInt9533 = local99 + 16;
		local129.anInt9534 = local107 + 16;
		local129.anInt9532 = local107;
		local129.anInt9535 = local99;
		Static357.aClass220_9.method4659(local129);
	}
}
