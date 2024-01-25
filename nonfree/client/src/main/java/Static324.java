import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_68 = new Class179(42, -1);

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "[I")
	public static final int[] anIntArray513 = new int[8];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!uq;)V")
	public static void method4616(@OriginalArg(1) Class251 arg0) {
		if (Static438.anInt7054 != arg0.anInt6660) {
			return;
		}
		if (Static452.aClass31_Sub2_Sub1_Sub1_2.aString10 == null) {
			arg0.anInt6738 = 0;
			arg0.anInt6743 = 0;
			return;
		}
		arg0.anInt6724 = 150;
		arg0.anInt6707 = (int) (Math.sin((double) Static378.anInt4244 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6710 = 5;
		arg0.anInt6738 = Static102.anInt2165;
		arg0.anInt6743 = Static404.method5427(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10);
		arg0.anInt6699 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7338;
		arg0.anInt6716 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7370;
		arg0.anInt6721 = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7335;
		arg0.anInt6717 = 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!qd;II)Lclient!rg;")
	public static Class1_Sub2_Sub15 method4617(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0 << 8 | arg1.anInt5475;
		@Pc(19) Class1_Sub2_Sub15 local19 = (Class1_Sub2_Sub15) Static60.aClass29_1.method757((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static105.aClass246_64.method5499(Static105.aClass246_64.method5479(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 8 | arg1.anInt5475;
			local19 = (Class1_Sub2_Sub15) Static60.aClass29_1.method757((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static105.aClass246_64.method5499(Static105.aClass246_64.method5479(local10));
			if (local31 == null) {
				local10 = arg1.anInt5475 | 0xFFFF00;
				local19 = (Class1_Sub2_Sub15) Static60.aClass29_1.method757((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static105.aClass246_64.method5499(Static105.aClass246_64.method5479(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static90.method1652(local31);
					local19.aClass200_7 = arg1;
					Static60.aClass29_1.method756(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static90.method1652(local31);
				local19.aClass200_7 = arg1;
				Static60.aClass29_1.method756(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static90.method1652(local31);
			local19.aClass200_7 = arg1;
			Static60.aClass29_1.method756(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
	public static void method4619() {
		if (Static342.anInt5771 == 8) {
			Static193.method2987(4);
		} else if (Static342.anInt5771 == 4 || Static342.anInt5771 == 5) {
			Static193.method2987(2);
		} else if (Static342.anInt5771 == 11) {
			Static193.method2987(2);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg5 - arg4;
		@Pc(20) int local20 = arg3 - arg4;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + local32 * (1 - local60);
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = (local60 - 3) * local52;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg3 - 1) * local99;
		@Pc(146) int local146 = local111;
		@Pc(152) int local152 = local107 * (local20 - 1);
		@Pc(156) int[] local156 = Static163.anIntArrayArray35[arg2];
		Static59.method1261(local156, arg6 - local15, -arg5 + arg6, arg1);
		Static59.method1261(local156, local15 + arg6, arg6 + -local15, arg0);
		Static59.method1261(local156, arg6 + arg5, arg6 + local15, arg1);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local9 <= local20;
			if (local203) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local146;
						local11++;
						local146 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local146;
					local86 += local125;
					local125 += local111;
					local146 += local111;
					local11++;
				}
				local86 += -local152;
				local95 += -local131;
				local131 -= local107;
				local152 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local78 += local133;
					local115 += local103;
					local7++;
					local133 += local103;
				}
			}
			if (local78 < 0) {
				local78 += local133;
				local69 += local115;
				local133 += local103;
				local7++;
				local115 += local103;
			}
			local78 += -local121;
			local69 += -local139;
			local9--;
			local139 -= local99;
			local121 -= local99;
			@Pc(340) int local340 = arg2 - local9;
			@Pc(344) int local344 = local9 + arg2;
			@Pc(348) int local348 = local7 + arg6;
			@Pc(352) int local352 = arg6 - local7;
			if (local203) {
				@Pc(376) int local376 = arg6 + local11;
				@Pc(381) int local381 = arg6 - local11;
				Static59.method1261(Static163.anIntArrayArray35[local340], local381, local352, arg1);
				Static59.method1261(Static163.anIntArrayArray35[local340], local376, local381, arg0);
				Static59.method1261(Static163.anIntArrayArray35[local340], local348, local376, arg1);
				Static59.method1261(Static163.anIntArrayArray35[local344], local381, local352, arg1);
				Static59.method1261(Static163.anIntArrayArray35[local344], local376, local381, arg0);
				Static59.method1261(Static163.anIntArrayArray35[local344], local348, local376, arg1);
			} else {
				Static59.method1261(Static163.anIntArrayArray35[local340], local348, local352, arg1);
				Static59.method1261(Static163.anIntArrayArray35[local344], local348, local352, arg1);
			}
		}
	}
}
