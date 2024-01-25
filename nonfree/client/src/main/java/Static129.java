import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
	public static int anInt2348;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "[I")
	public static final int[] anIntArray118 = new int[14];

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
	public static int anInt2347 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!wj;B)V")
	public static void method2031(@OriginalArg(0) Class1_Sub2_Sub6 arg0) {
		@Pc(14) int local14 = arg0.anInt7568 - Static172.anInt3107;
		@Pc(26) int local26 = arg0.anInt7577 * 128 + arg0.method6204() * 64;
		@Pc(38) int local38 = arg0.anInt7601 * 128 + arg0.method6204() * 64;
		arg0.anInt7557 += (local38 - arg0.anInt7557) / local14;
		arg0.anInt7642 = 0;
		arg0.anInt7560 += (local26 - arg0.anInt7560) / local14;
		if (arg0.anInt7565 == 0) {
			arg0.method6198(8192);
		}
		if (arg0.anInt7565 == 1) {
			arg0.method6198(12288);
		}
		if (arg0.anInt7565 == 2) {
			arg0.method6198(0);
		}
		if (arg0.anInt7565 == 3) {
			arg0.method6198(4096);
		}
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
	public static void method2033() {
		if (Static464.aBoolean522) {
			return;
		}
		Static464.aBoolean522 = true;
		if (Static39.aClass79_Sub1_1.aBoolean160) {
			Static275.aFloat61 = (int) Static275.aFloat61 + 47 & 0xFFFFFFF0;
		} else {
			Static313.aFloat87 += (12.0F - Static313.aFloat87) / 2.0F;
		}
		Static179.aBoolean252 = true;
	}
}
