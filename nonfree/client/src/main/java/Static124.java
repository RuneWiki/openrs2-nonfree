import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public static int anInt2606;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "[I")
	public static final int[] anIntArray159 = new int[13];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!bk;)V")
	public static void method2415(@OriginalArg(1) Class5_Sub1 arg0) {
		if (arg0.aByteArray18.length - arg0.anInt2029 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method1832();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray18.length - arg0.anInt2029 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method1845();
		if (local49 * 6 != arg0.aByteArray18.length - arg0.anInt2029) {
			return;
		}
		while (true) {
			@Pc(66) int local66;
			@Pc(70) int local70;
			do {
				do {
					do {
						if (arg0.anInt2029 >= arg0.aByteArray18.length) {
							return;
						}
						local66 = arg0.method1845();
						local70 = arg0.method1826();
					} while (Static286.anIntArray412.length <= local66);
				} while (!Static161.aBooleanArray15[local66]);
			} while (Static306.method5240(local66).aChar5 == '1' && (local70 < -1 || local70 > 1));
			Static286.anIntArray412[local66] = local70;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBI)V")
	public static void method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static171.anInt3516 == 1) {
			Static98.aClass54Array9[Static247.anInt3876 / 100].method5569(Static172.anInt3527 - 8, Static67.anInt1692 - 8);
		}
		if (Static171.anInt3516 == 2) {
			Static98.aClass54Array9[Static247.anInt3876 / 100 + 4].method5569(Static172.anInt3527 - 8, Static67.anInt1692 - 8);
		}
		Static219.method3849();
	}
}
