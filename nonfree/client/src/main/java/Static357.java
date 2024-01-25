import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_145 = new Class81(30, -1);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method5210(@OriginalArg(1) Class1_Sub20_Sub1 arg0) {
		arg0.method4421(Static543.aClass111_116.method2459());
		arg0.method4421(Static351.aClass111_83.method2459());
		arg0.method4421(Static333.aClass111_77.method2459());
		arg0.method4421(Static85.aClass111_18.method2459());
		arg0.method4421(Static546.aClass111_117.method2459());
		arg0.method4421(Static373.aClass111_90.method2459());
		arg0.method4421(Static153.aClass111_34.method2459());
		arg0.method4421(Static454.aClass111_107.method2459());
		arg0.method4421(Static141.aClass111_32.method2459());
		arg0.method4421(Static446.aClass111_106.method2459());
		arg0.method4421(Static551.aClass111_119.method2459());
		arg0.method4421(Static116.aClass111_25.method2459());
		arg0.method4421(Static221.aClass111_49.method2459());
		arg0.method4421(Static530.aClass111_114.method2459());
		arg0.method4421(Static144.aClass111_33.method2459());
		arg0.method4421(Static239.aClass111_50.method2459());
		arg0.method4421(Static331.aClass111_76.method2459());
		arg0.method4421(Static59.aClass111_109.method2459());
		arg0.method4421(Static440.aClass111_102.method2459());
		arg0.method4421(Static356.aClass111_99.method2459());
		arg0.method4421(Static351.aClass111_82.method2459());
		arg0.method4421(Static587.aClass111_127.method2459());
		arg0.method4421(Static60.aClass111_10.method2459());
		arg0.method4421(Static460.aClass111_108.method2459());
		arg0.method4421(Static571.aClass111_123.method2459());
		arg0.method4421(Static363.aClass111_111.method2459());
		arg0.method4421(Static292.aClass111_68.method2459());
		arg0.method4421(Static2.aClass111_1.method2459());
		arg0.method4421(Static32.aClass111_5.method2459());
		arg0.method4421(Static585.aClass111_126.method2459());
		arg0.method4421(Static255.aClass111_53.method2459());
		arg0.method4421(Static446.aClass111_105.method2459());
		arg0.method4421(Static536.method7307());
		arg0.method4421(Static85.method1715());
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[[BI[I[[B[I[BI)I")
	public static int method5213(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(9) int local9 = arg3[arg0];
		@Pc(20) int local20 = arg5[arg0] + local9;
		@Pc(24) int local24 = arg3[arg2];
		@Pc(30) int local30 = arg5[arg2] + local24;
		@Pc(32) int local32 = local9;
		if (local9 < local24) {
			local32 = local24;
		}
		@Pc(39) int local39 = local20;
		if (local20 > local30) {
			local39 = local30;
		}
		@Pc(50) int local50 = arg6[arg0] & 0xFF;
		if ((arg6[arg2] & 0xFF) < local50) {
			local50 = arg6[arg2] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg1[arg0];
		@Pc(71) byte[] local71 = arg4[arg2];
		@Pc(76) int local76 = local32 - local9;
		@Pc(81) int local81 = local32 - local24;
		for (@Pc(83) int local83 = local32; local83 < local39; local83++) {
			@Pc(95) int local95 = local71[local81++] + local67[local76++];
			if (local95 < local50) {
				local50 = local95;
			}
		}
		return -local50;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z")
	public static boolean method5214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static495.method6912(arg1, arg0) | Static487.method6814(arg1, arg0) | Static239.method3936(arg1, arg0)) & Static586.method7836(arg0, arg1);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!br;I)Lclient!bm;")
	public static Class1_Sub3_Sub5 method5220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt1245;
		@Pc(19) Class1_Sub3_Sub5 local19 = (Class1_Sub3_Sub5) Static118.aClass157_2.method3684((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static221.aClass111_49.method2449(Static221.aClass111_49.method2445(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt1245;
			local19 = (Class1_Sub3_Sub5) Static118.aClass157_2.method3684((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static221.aClass111_49.method2449(Static221.aClass111_49.method2445(local10));
			if (local31 == null) {
				local10 = arg2.anInt1245 | 0x3FFFC00;
				local19 = (Class1_Sub3_Sub5) Static118.aClass157_2.method3684((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static221.aClass111_49.method2449(Static221.aClass111_49.method2445(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static216.method3590(local31);
					local19.aClass37_1 = arg2;
					Static118.aClass157_2.method3687((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static216.method3590(local31);
				local19.aClass37_1 = arg2;
				Static118.aClass157_2.method3687((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static216.method3590(local31);
			local19.aClass37_1 = arg2;
			Static118.aClass157_2.method3687((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZ)I")
	public static int method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static406.method5726(arg1 + 45365, 4, arg0 + 91923) + (Static406.method5726(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static406.method5726(arg1, 1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
