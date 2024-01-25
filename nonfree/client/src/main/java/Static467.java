import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
	public static int anInt8015;

	@OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
	public static int anInt8016;

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "I")
	public static final int anInt8017 = 2;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!uc;I)V")
	public static void method6342(@OriginalArg(1) Class11_Sub5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (arg0.anInt6533 > Static277.anInt2834) {
			Static387.method5427(arg0);
		} else if (Static277.anInt2834 > arg0.anInt6538) {
			Static56.method1235(arg0, false);
			local13 = Static360.anInt6286;
			local11 = Static254.anInt4910;
		} else {
			Static411.method5305(arg0);
		}
		if (arg0.anInt7514 < 128 || arg0.anInt7515 < 128 || arg0.anInt7514 >= Static193.anInt3853 * 128 - 128 || arg0.anInt7515 >= (Static301.anInt5585 - 1) * 128) {
			arg0.anInt6538 = 0;
			arg0.anInt6505 = -1;
			arg0.anInt6515 = -1;
			arg0.anInt6486 = -1;
			local11 = -1;
			local13 = 0;
			arg0.anInt6533 = 0;
			arg0.anInt7514 = arg0.anIntArray523[0] * 128 + arg0.method5302() * 64;
			arg0.anInt7515 = arg0.anIntArray524[0] * 128 + arg0.method5302() * 64;
			arg0.method5303();
		}
		if (Static52.aClass11_Sub5_Sub2_Sub1_2 == arg0 && (arg0.anInt7514 < 1536 || arg0.anInt7515 < 1536 || (Static193.anInt3853 - 12) * 128 <= arg0.anInt7514 || Static301.anInt5585 * 128 - 1536 <= arg0.anInt7515)) {
			arg0.anInt6533 = 0;
			arg0.anInt6515 = -1;
			arg0.anInt6505 = -1;
			arg0.anInt6486 = -1;
			local11 = -1;
			arg0.anInt6538 = 0;
			local13 = 0;
			arg0.anInt7514 = arg0.anIntArray523[0] * 128 + arg0.method5302() * 64;
			arg0.anInt7515 = arg0.anIntArray524[0] * 128 + arg0.method5302() * 64;
			arg0.method5303();
		}
		@Pc(212) int local212 = Static214.method3757(arg0);
		Static373.method5314(local212, arg0, local11, local13);
		Static169.method4396(arg0);
	}
}
