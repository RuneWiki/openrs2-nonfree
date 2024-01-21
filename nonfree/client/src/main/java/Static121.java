import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 aClass1_Sub2_Sub5_Sub1_2;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_115;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1715 = Static118.method2249("::fpson");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static final int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lclient!n;III[B)V")
	public static void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg1 > 0 && arg1 + local11 < 103 && local15 + arg0 > 0 && local15 + arg0 < 103) {
						arg2[local7].anIntArrayArray23[local11 + arg1][local15 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(86) Class1_Sub14 local86 = new Class1_Sub14(arg5);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					Static1.method3300(local86, arg1 + local92, arg4, 0, local15, arg3, arg0 + local96);
				}
			}
		}
	}
}
