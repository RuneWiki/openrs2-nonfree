import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vj", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString108;

	@OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
	public static int anInt9836 = 0;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
	public static int anInt9844 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!sh;")
	public static Class191 method8427(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class191_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class191) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class191_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qk;BII)V")
	public static void method8428(@OriginalArg(0) Class279 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static608.aClass279_18 != null || Static447.aBoolean555 || (arg0 == null || Static49.method1446(arg0) == null)) {
			return;
		}
		Static608.aClass279_18 = arg0;
		Static220.aClass279_6 = Static49.method1446(arg0);
		Static448.anInt7978 = arg1;
		Static219.anInt4151 = arg2;
		Static343.anInt6700 = 0;
		Static557.aBoolean671 = false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg5;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - local44 * (local56 - 1);
		@Pc(86) int local86 = local32 * (1 - local60) + local48;
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
		@Pc(143) int local143 = (arg1 - 1) * local99;
		@Pc(145) int local145 = local111;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(196) int local196;
		if (Static11.anInt9803 <= arg0 && arg0 <= Static149.anInt2949) {
			@Pc(159) int[] local159 = Static460.anIntArrayArray53[arg0];
			local168 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 - arg3);
			local176 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg3 + arg4);
			local185 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 - local16);
			local196 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 + local16);
			Static611.method8472(local185, local168, local159, arg2);
			Static611.method8472(local196, local185, local159, arg6);
			Static611.method8472(local176, local196, local159, arg2);
		}
		@Pc(224) int local224 = (local20 - 1) * local107;
		while (local9 > 0) {
			@Pc(237) boolean local237 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local78 += local133;
					local133 += local103;
					local7++;
					local115 += local103;
				}
			}
			if (local237) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local145;
						local145 += local111;
						local125 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local145;
					local86 += local125;
					local11++;
					local145 += local111;
					local125 += local111;
				}
				local95 += -local131;
				local86 += -local224;
				local131 -= local107;
				local224 -= local107;
			}
			if (local78 < 0) {
				local69 += local115;
				local78 += local133;
				local7++;
				local133 += local103;
				local115 += local103;
			}
			local78 += -local121;
			local69 += -local143;
			local143 -= local99;
			local121 -= local99;
			local9--;
			local168 = arg0 - local9;
			local176 = arg0 + local9;
			if (local176 >= Static11.anInt9803 && Static149.anInt2949 >= local168) {
				local185 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 + local7);
				local196 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 - local7);
				if (local237) {
					@Pc(438) int local438 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, local11 + arg4);
					@Pc(447) int local447 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg4 - local11);
					@Pc(454) int[] local454;
					if (Static11.anInt9803 <= local168) {
						local454 = Static460.anIntArrayArray53[local168];
						Static611.method8472(local447, local196, local454, arg2);
						Static611.method8472(local438, local447, local454, arg6);
						Static611.method8472(local185, local438, local454, arg2);
					}
					if (local176 <= Static149.anInt2949) {
						local454 = Static460.anIntArrayArray53[local176];
						Static611.method8472(local447, local196, local454, arg2);
						Static611.method8472(local438, local447, local454, arg6);
						Static611.method8472(local185, local438, local454, arg2);
					}
				} else {
					if (Static11.anInt9803 <= local168) {
						Static611.method8472(local185, local196, Static460.anIntArrayArray53[local168], arg2);
					}
					if (Static149.anInt2949 >= local176) {
						Static611.method8472(local185, local196, Static460.anIntArrayArray53[local176], arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method8430(@OriginalArg(0) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(25) byte[] local25 = (byte[]) arg1;
			return Static584.method8241(local25, arg0);
		} else if (arg1 instanceof Class57) {
			@Pc(37) Class57 local37 = (Class57) arg1;
			return local37.method1857(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)Z")
	public static boolean method8432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static312.method5143(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | Static306.method4861(arg0, arg1) | Static481.method7184(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static395.method6381(arg1, arg0) | (arg0 & 0x2000) != 0 | Static548.method7971(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8433(@OriginalArg(0) String arg0) {
		@Pc(6) Class3_Sub14 local6 = Static91.method2068();
		local6.aClass3_Sub3_Sub2_2.method4220(Static624.aClass136_14.anInt4034);
		local6.aClass3_Sub3_Sub2_2.method4201(0);
		@Pc(21) int local21 = local6.aClass3_Sub3_Sub2_2.anInt4736;
		local6.aClass3_Sub3_Sub2_2.method4201(630);
		@Pc(30) int[] local30 = Static584.method8243(local6);
		@Pc(34) int local34 = local6.aClass3_Sub3_Sub2_2.anInt4736;
		local6.aClass3_Sub3_Sub2_2.method4241(arg0);
		local6.aClass3_Sub3_Sub2_2.method4220(Static325.anInt6083);
		local6.aClass3_Sub3_Sub2_2.anInt4736 += 7;
		local6.aClass3_Sub3_Sub2_2.method4200(local30, local6.aClass3_Sub3_Sub2_2.anInt4736, local34);
		local6.aClass3_Sub3_Sub2_2.method4208(local6.aClass3_Sub3_Sub2_2.anInt4736 - local21);
		Static562.method8096(local6);
		Static562.anInt9393 = 0;
		Static583.anInt9562 = 0;
		Static78.anInt1910 = -3;
		Static40.anInt1258 = 1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
	public static int method8434(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
