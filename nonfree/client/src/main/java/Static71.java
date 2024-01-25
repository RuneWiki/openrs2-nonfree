import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_4 = new Class153(4, 1);

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "Z")
	public static boolean aBoolean107 = true;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "[S")
	public static short[] aShortArray11 = new short[256];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!ji;)Lclient!pb;")
	public static Class79_Sub3 method1414(@OriginalArg(1) Class6_Sub21 arg0) {
		return new Class79_Sub3(arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6031(), arg0.method6031(), arg0.method6069());
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)[I")
	public static int[] method1416() {
		return new int[] { Static84.anInt1707, Static67.anInt1401, Static573.anInt9405 };
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[B)V")
	public static void method1417(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class6_Sub21 local18 = new Class6_Sub21(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(47) int local47;
			@Pc(42) int local42;
			label45: do {
				while (true) {
					while (true) {
						local22 = local18.method6069();
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(115) int[] local115 = Static60.anIntArray111 = new int[6];
							local115[0] = local18.method6003();
							local115[1] = local18.method6003();
							local115[2] = local18.method6003();
							local115[3] = local18.method6003();
							local115[4] = local18.method6003();
							local115[5] = local18.method6003();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local42 = local18.method6069();
							Static246.anIntArray367 = new int[local42];
							for (local47 = 0; local47 < local42; local47++) {
								Static246.anIntArray367[local47] = local18.method6003();
								if (Static246.anIntArray367[local47] == 65535) {
									Static246.anIntArray367[local47] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local42 = local18.method6069();
			Static490.anIntArray603 = new int[local42];
			for (local47 = 0; local47 < local42; local47++) {
				Static490.anIntArray603[local47] = local18.method6003();
				if (Static490.anIntArray603[local47] == 65535) {
					Static490.anIntArray603[local47] = -1;
				}
			}
		}
	}
}
