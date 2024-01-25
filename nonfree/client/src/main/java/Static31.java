import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "Lclient!sfa;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)V")
	public static void method562(@OriginalArg(0) int arg0) {
		Static296.anInt5364 = -1;
		Static319.anInt5778 = arg0;
		Static341.anInt6022 = -1;
		Static132.method2577();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIII)V")
	public static void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static456.method6797(false, local35, true);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!pl;I)V")
	public static void method564(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static305.anInt5560 == arg0.anInt6421 || arg0.anInt6453 == -1 || arg0.anInt6438 != 0) {
			local5 = true;
		} else {
			@Pc(23) Class17 local23 = Static330.aClass279_2.method6216(arg0.anInt6453);
			if (local23.aBoolean47 || local23.anIntArray54[arg0.anInt6385] < arg0.anInt6441 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(51) int local51 = arg0.anInt6421 - arg0.anInt6430;
			@Pc(56) int local56 = Static305.anInt5560 - arg0.anInt6430;
			@Pc(67) int local67 = arg0.anInt6450 * 512 + arg0.method5569() * 256;
			@Pc(79) int local79 = arg0.anInt6449 * 512 + arg0.method5569() * 256;
			@Pc(90) int local90 = arg0.anInt6389 * 512 + arg0.method5569() * 256;
			@Pc(101) int local101 = arg0.anInt6416 * 512 + arg0.method5569() * 256;
			arg0.anInt8980 = ((local51 - local56) * local79 + local56 * local101) / local51;
			arg0.anInt8975 = ((local51 - local56) * local67 + local56 * local90) / local51;
		}
		arg0.anInt6467 = 0;
		if (arg0.anInt6417 == 0) {
			arg0.method5559(8192, false);
		}
		if (arg0.anInt6417 == 1) {
			arg0.method5559(12288, false);
		}
		if (arg0.anInt6417 == 2) {
			arg0.method5559(0, false);
		}
		if (arg0.anInt6417 == 3) {
			arg0.method5559(4096, false);
		}
	}
}
