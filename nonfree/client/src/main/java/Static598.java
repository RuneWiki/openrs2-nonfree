import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "Lclient!gma;")
	public static Class142 aClass142_3;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_30 = new Class118(43);

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "[I")
	public static final int[] anIntArray679 = new int[1];

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "Z")
	public static boolean aBoolean798 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIILclient!sj;Lclient!sj;II)V")
	public static void method8205(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class4_Sub2_Sub1_Sub2 arg4, @OriginalArg(7) Class4_Sub2_Sub1_Sub2 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg5.method2042();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class43 local22 = (Class43) Static408.aClass85_44.method1737((long) local7);
		if (local22 == null) {
			@Pc(29) Class355[] local29 = Static737.method8363(Static117.aClass254_47, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static396.aClass145_6.method9683(local29[0], true);
			Static408.aClass85_44.method1745((long) local7, 16383, local22);
		}
		Static628.method8495(arg4.method2046() * 256, arg4.anInt10229, 0, arg4.anInt10228, arg4.aByte133);
		@Pc(69) int local69 = Static189.anIntArray243[0] + arg1 - 18;
		@Pc(77) int local77 = local69 + arg0 / 4 * 18;
		@Pc(87) int local87 = Static189.anIntArray243[1] + arg2 - 16 - 54;
		@Pc(95) int local95 = local87 + arg0 % 4 * 18;
		local22.method9588(local77, local95);
		if (arg5 == arg4) {
			Static396.aClass145_6.method9635(-256, local95 - 1, 18, local77 - 1, 18);
		}
		Static5.method72(local95 + 18, local95 + -1, local77 + 18, local77 - 1);
		@Pc(133) Class4_Sub5 local133 = Static270.method3795();
		local133.anInt1776 = local95 + 16;
		local133.anInt1778 = local95;
		local133.anInt1784 = local77 + 16;
		local133.anInt1782 = local77;
		local133.aClass4_Sub2_Sub1_Sub2_1 = arg5;
		Static363.aClass320_4.method7600(local133);
	}
}
