import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!me", name = "O", descriptor = "Lclient!jo;")
	public static Class168 aClass168_76;

	@OriginalMember(owner = "client!me", name = "ib", descriptor = "I")
	public static int anInt5995;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "Lclient!bca;")
	public static final Class26 aClass26_5 = new Class26("", 12);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)V")
	public static void method5130(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static217.anInt3896 = arg0;
		Static118.aClass5_Sub2Array1 = new Class5_Sub2[Static429.anIntArray566[Static217.anInt3896] + 1];
		Static298.anInt5669 = 0;
		Static249.anInt5084 = 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method5133(@OriginalArg(1) Class9 arg0) {
		Static467.aClass73_3 = Static57.method8157(arg0, Static129.anInt2834);
		Static309.aClass82_6 = Static346.method5643(Static129.anInt2834, arg0);
		Static42.aClass73_1 = Static57.method8157(arg0, Static523.anInt9090);
		Static387.aClass82_9 = Static346.method5643(Static523.anInt9090, arg0);
		Static489.aClass73_5 = Static57.method8157(arg0, Static323.anInt6114);
		Static1.aClass82_1 = Static346.method5643(Static323.anInt6114, arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BB)V")
	public static void method5134(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class6_Sub26 local14 = new Class6_Sub26(arg0);
		while (true) {
			while (true) {
				@Pc(18) int local18 = local14.method4966();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					@Pc(31) int[] local31 = Static319.anIntArray441 = new int[6];
					local31[0] = local14.method4999();
					local31[1] = local14.method4999();
					local31[2] = local14.method4999();
					local31[3] = local14.method4999();
					local31[4] = local14.method4999();
					local31[5] = local14.method4999();
				} else {
					@Pc(83) int local83;
					@Pc(88) int local88;
					if (local18 == 4) {
						local83 = local14.method4966();
						Static29.anIntArray67 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static29.anIntArray67[local88] = local14.method4999();
							if (Static29.anIntArray67[local88] == 65535) {
								Static29.anIntArray67[local88] = -1;
							}
						}
					} else if (local18 == 5) {
						local83 = local14.method4966();
						Static227.anIntArray308 = new int[local83];
						for (local88 = 0; local88 < local83; local88++) {
							Static227.anIntArray308[local88] = local14.method4999();
							if (Static227.anIntArray308[local88] == 65535) {
								Static227.anIntArray308[local88] = -1;
							}
						}
					}
				}
			}
		}
	}
}
