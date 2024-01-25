import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ep;B)V")
	public static void method4250(@OriginalArg(0) Class93 arg0) {
		if (!Static25.aBoolean80) {
			return;
		}
		if (arg0.anObjectArray31 != null) {
			@Pc(14) Class93 local14 = Static100.method2145(Static150.anInt7378, Static244.anInt4934);
			if (local14 != null) {
				@Pc(20) Class6_Sub38 local20 = new Class6_Sub38();
				local20.anObjectArray36 = arg0.anObjectArray31;
				local20.aClass93_13 = local14;
				local20.aClass93_14 = arg0;
				Static89.method1979(local20);
			}
		}
		Static298.method4854(Static475.aClass181_97);
		Static547.aClass6_Sub26_Sub2_2.method4979(arg0.anInt2790);
		Static547.aClass6_Sub26_Sub2_2.method4936(Static244.anInt4934);
		Static547.aClass6_Sub26_Sub2_2.method4965(arg0.anInt2806);
		Static547.aClass6_Sub26_Sub2_2.method4946(Static353.anInt6817);
		Static547.aClass6_Sub26_Sub2_2.method4991(Static150.anInt7378);
		Static547.aClass6_Sub26_Sub2_2.method4965(arg0.anInt2822);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BIIIII)V")
	public static void method4251(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		arg2 += arg3;
		@Pc(20) int local20 = arg1 - arg3 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg3 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(25) int local25 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg2 = local35 + 1;
			arg0[local35] = 1;
		}
	}
}
