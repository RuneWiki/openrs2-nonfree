import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	public static int anInt4552;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1592 = Static49.method1293("Checking for updates )2 ");

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1593 = aClass70_1592;

	@OriginalMember(owner = "client!wf", name = "X", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1595 = Static49.method1293(" from your friend list first)3");

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1594 = aClass70_1595;

	@OriginalMember(owner = "client!wf", name = "ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_30 = new Class25(128);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([II[Lclient!cb;[III)V")
	public static void method3506(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class12[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(12) int local12 = arg4 + 1;
		@Pc(16) int local16 = arg3 - 1;
		@Pc(22) int local22 = (arg4 + arg3) / 2;
		@Pc(26) Class12 local26 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local26;
		while (local16 < local12) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(58) int local58;
			@Pc(53) int local53;
			do {
				local12--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg0[local43] == 2) {
						local53 = local26.anInt599;
						local58 = arg1[local12].anInt599;
					} else if (arg0[local43] == 1) {
						local58 = arg1[local12].anInt598;
						if (local58 == -1 && arg2[local43] == 1) {
							local58 = 2001;
						}
						local53 = local26.anInt598;
						if (local53 == -1 && arg2[local43] == 1) {
							local53 = 2001;
						}
					} else if (arg0[local43] == 3) {
						local53 = local26.aBoolean22 ? 1 : 0;
						local58 = arg1[local12].aBoolean22 ? 1 : 0;
					} else {
						local53 = local26.anInt595;
						local58 = arg1[local12].anInt595;
					}
					if (local53 != local58) {
						if ((arg2[local43] != 1 || local53 >= local58) && (arg2[local43] != 0 || local58 >= local53)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local16++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg0[local43] == 2) {
						local53 = local26.anInt599;
						local58 = arg1[local16].anInt599;
					} else if (arg0[local43] == 1) {
						local53 = local26.anInt598;
						local58 = arg1[local16].anInt598;
						if (local58 == -1 && arg2[local43] == 1) {
							local58 = 2001;
						}
						if (local53 == -1 && arg2[local43] == 1) {
							local53 = 2001;
						}
					} else if (arg0[local43] == 3) {
						local58 = arg1[local16].aBoolean22 ? 1 : 0;
						local53 = local26.aBoolean22 ? 1 : 0;
					} else {
						local58 = arg1[local16].anInt595;
						local53 = local26.anInt595;
					}
					if (local53 != local58) {
						if ((arg2[local43] != 1 || local58 >= local53) && (arg2[local43] != 0 || local53 >= local58)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local12 > local16) {
				@Pc(327) Class12 local327 = arg1[local16];
				arg1[local16] = arg1[local12];
				arg1[local12] = local327;
			}
		}
		method3506(arg0, arg1, arg2, arg3, local12);
		method3506(arg0, arg1, arg2, local12 + 1, arg4);
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V")
	public static void method3508() {
		aClass70_1593 = null;
		aClass25_30 = null;
		aClass70_1595 = null;
		aClass70_1594 = null;
		aClass70_1592 = null;
	}
}
