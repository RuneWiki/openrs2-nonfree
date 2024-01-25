import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!fu;")
	public static Class123 aClass123_4;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public static int anInt6104 = 0;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
	public static int anInt6105 = 0;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
	public static final boolean aBoolean450 = false;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public static int anInt6106 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([BB)V")
	public static void method5487(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method3030();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(26) int[] local26 = Static592.anIntArray612 = new int[6];
					local26[0] = local10.method3018();
					local26[1] = local10.method3018();
					local26[2] = local10.method3018();
					local26[3] = local10.method3018();
					local26[4] = local10.method3018();
					local26[5] = local10.method3018();
				} else {
					@Pc(71) int local71;
					@Pc(76) int local76;
					if (local14 == 4) {
						local71 = local10.method3030();
						Static32.anIntArray27 = new int[local71];
						for (local76 = 0; local76 < local71; local76++) {
							Static32.anIntArray27[local76] = local10.method3018();
							if (Static32.anIntArray27[local76] == 65535) {
								Static32.anIntArray27[local76] = -1;
							}
						}
					} else if (local14 == 5) {
						local71 = local10.method3030();
						Static639.anIntArray651 = new int[local71];
						for (local76 = 0; local76 < local71; local76++) {
							Static639.anIntArray651[local76] = local10.method3018();
							if (Static639.anIntArray651[local76] == 65535) {
								Static639.anIntArray651[local76] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static165.method3262(local7.aClass60_Sub1_Sub5_1);
		Static165.method3262(local7.aClass60_Sub1_Sub5_2);
		if (local7.aClass60_Sub1_Sub5_1 != null) {
			local7.aClass60_Sub1_Sub5_1 = null;
		}
		if (local7.aClass60_Sub1_Sub5_2 != null) {
			local7.aClass60_Sub1_Sub5_2 = null;
		}
	}
}
