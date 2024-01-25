import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!bj;I)V")
	public static void method4677(@OriginalArg(0) Class28_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4339 - Static76.anInt1617;
		@Pc(21) int local21 = arg0.anInt4359 * 128 + arg0.method4009() * 64;
		@Pc(33) int local33 = arg0.anInt4319 * 128 + arg0.method4009() * 64;
		arg0.anInt4376 = 0;
		arg0.anInt5766 += (local33 - arg0.anInt5766) / local9;
		arg0.anInt5774 += (local21 - arg0.anInt5774) / local9;
		if (arg0.anInt4354 == 0) {
			arg0.method4010(8192);
		}
		if (arg0.anInt4354 == 1) {
			arg0.method4010(12288);
		}
		if (arg0.anInt4354 == 2) {
			arg0.method4010(0);
		}
		if (arg0.anInt4354 == 3) {
			arg0.method4010(4096);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
	public static void method4678(@OriginalArg(0) int arg0) {
		Static253.anInt4565 = -1;
		Static125.anInt2380 = -1;
		Static325.anInt5538 = arg0;
		Static43.method691();
	}
}
