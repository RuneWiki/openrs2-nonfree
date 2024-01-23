import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!tk", name = "W", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
	public static int anInt4953;

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
	public static int anInt4944 = -1;

	@OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
	public static int anInt4950 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4256(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(11) String local11 = Static26.method434(Static20.method358(arg1));
		@Pc(13) boolean local13 = false;
		for (@Pc(25) int local25 = 0; local25 < Static304.anInt5394; local25++) {
			@Pc(38) Class15_Sub5_Sub2 local38 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local25]];
			if (local38 != null && local38.aString336 != null && local38.aString336.equalsIgnoreCase(local11)) {
				local13 = true;
				if (arg0 == 1) {
					Static127.aClass1_Sub14_Sub1_3.method1408(154);
					Static127.aClass1_Sub14_Sub1_3.method1337(Static275.anIntArray440[local25]);
					Static127.aClass1_Sub14_Sub1_3.method1345(0);
				} else if (arg0 == 4) {
					Static127.aClass1_Sub14_Sub1_3.method1408(193);
					Static127.aClass1_Sub14_Sub1_3.method1341(Static275.anIntArray440[local25]);
					Static127.aClass1_Sub14_Sub1_3.method1345(0);
				} else if (arg0 == 5) {
					Static127.aClass1_Sub14_Sub1_3.method1408(80);
					Static127.aClass1_Sub14_Sub1_3.method1341(Static275.anIntArray440[local25]);
					Static127.aClass1_Sub14_Sub1_3.method1349(0);
				} else if (arg0 == 6) {
					Static127.aClass1_Sub14_Sub1_3.method1408(78);
					Static127.aClass1_Sub14_Sub1_3.method1345(0);
					Static127.aClass1_Sub14_Sub1_3.method1384(Static275.anIntArray440[local25]);
				} else if (arg0 == 7) {
					Static127.aClass1_Sub14_Sub1_3.method1408(254);
					Static127.aClass1_Sub14_Sub1_3.method1384(Static275.anIntArray440[local25]);
					Static127.aClass1_Sub14_Sub1_3.method1361(0);
				}
				break;
			}
		}
		if (!local13) {
			Static243.method4744(Static108.aString129 + local11, 0, "");
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[IIIB)V")
	public static void method4257(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0--;
		@Pc(4) int local4 = arg3 - 1;
		@Pc(7) int local7 = local4 - 7;
		while (local7 > arg0) {
			@Pc(16) int local16 = arg0 + 1;
			arg1[local16] = arg2;
			@Pc(21) int local21 = local16 + 1;
			arg1[local21] = arg2;
			@Pc(26) int local26 = local21 + 1;
			arg1[local26] = arg2;
			@Pc(31) int local31 = local26 + 1;
			arg1[local31] = arg2;
			@Pc(36) int local36 = local31 + 1;
			arg1[local36] = arg2;
			@Pc(41) int local41 = local36 + 1;
			arg1[local41] = arg2;
			@Pc(46) int local46 = local41 + 1;
			arg1[local46] = arg2;
			arg0 = local46 + 1;
			arg1[arg0] = arg2;
		}
		while (local4 > arg0) {
			arg0++;
			arg1[arg0] = arg2;
		}
	}
}
