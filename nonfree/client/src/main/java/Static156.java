import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fia", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!fia", name = "y", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!fia", name = "o", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_71 = new Class200(115, 6);

	@OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
	public static int anInt5056 = 0;

	@OriginalMember(owner = "client!fia", name = "x", descriptor = "I")
	public static final int anInt5060 = -1;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIILclient!cs;IIIIILclient!cs;)V")
	public static void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub2_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) Class4_Sub1_Sub2_Sub1 arg6) {
		@Pc(7) int local7 = arg3.method5070();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class24 local21 = (Class24) Static39.aClass102_3.method2677((long) local7);
		if (local21 == null) {
			@Pc(28) Class107[] local28 = Static645.method2767(Static474.aClass196_98, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static323.aClass5_9.method7525(local28[0], true);
			Static39.aClass102_3.method2674((long) local7, local21);
		}
		Static474.method7127(arg6.aByte123, 0, arg6.method5059() * 256, arg1 >> 1, arg6.anInt8911, arg6.anInt8916, arg4 >> 1);
		@Pc(79) int local79 = arg5 + Static312.anIntArray311[0] - 18;
		@Pc(88) int local88 = arg2 + Static312.anIntArray311[1] - 70;
		@Pc(96) int local96 = local79 + arg0 / 4 * 18;
		@Pc(104) int local104 = local88 + arg0 % 4 * 18;
		local21.method8559(local96, local104);
		if (arg3 == arg6) {
			Static323.aClass5_9.method7513(local96 - 1, local104 + -1, 18, 18, -256);
		}
		Static520.method8069(local96 - 1, local104 + -1, local96 + 18, local104 + 18);
		@Pc(140) Class4_Sub6 local140 = Static220.method3689();
		local140.anInt7220 = local96;
		local140.aClass4_Sub1_Sub2_Sub1_1 = arg3;
		local140.anInt7222 = local104 + 16;
		local140.anInt7224 = local96 + 16;
		local140.anInt7221 = local104;
		Static131.aClass120_2.method2960(local140);
	}
}
