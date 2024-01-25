import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
	public static int anInt10605;

	@OriginalMember(owner = "client!wga", name = "r", descriptor = "[I")
	public static int[] anIntArray601;

	@OriginalMember(owner = "client!wga", name = "t", descriptor = "J")
	public static long aLong302 = 20000000L;

	@OriginalMember(owner = "client!wga", name = "v", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_106 = new Class305(36, 7);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBLclient!bha;)Z")
	public static boolean method8813(@OriginalArg(0) int arg0, @OriginalArg(2) Class38 arg1) {
		Static151.aClass254_3.method7355(arg1.anIntArray32[arg0], arg1.anIntArray31[arg0], arg1.anIntArray33[arg0], Static653.anIntArray599);
		@Pc(22) int local22 = Static653.anIntArray599[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray6[arg0] = (short) (Static222.anInt4111 + Static268.anInt4963 * Static653.anIntArray599[0] / local22);
			arg1.aShortArray5[arg0] = (short) (Static655.anInt10580 + Static258.anInt4782 * Static653.anIntArray599[1] / local22);
			arg1.aShortArray4[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
	public static void method8814(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static385.method5705(arg0, true, arg1, arg2, -1, arg3);
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)I")
	public static int method8815() {
		return Static1.anInt9943 == 1 ? Static25.anInt344 : 0;
	}
}
