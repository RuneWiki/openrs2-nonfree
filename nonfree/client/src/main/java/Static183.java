import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt3166;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method2676() {
		if (Static359.aString71.toLowerCase().indexOf("microsoft") != -1) {
			Static89.anIntArray557[190] = 72;
			Static89.anIntArray557[219] = 42;
			Static89.anIntArray557[191] = 73;
			Static89.anIntArray557[222] = 59;
			Static89.anIntArray557[223] = 28;
			Static89.anIntArray557[189] = 26;
			Static89.anIntArray557[192] = 58;
			Static89.anIntArray557[188] = 71;
			Static89.anIntArray557[187] = 27;
			Static89.anIntArray557[221] = 43;
			Static89.anIntArray557[186] = 57;
			Static89.anIntArray557[220] = 74;
			return;
		}
		Static89.anIntArray557[45] = 26;
		Static89.anIntArray557[59] = 57;
		Static89.anIntArray557[93] = 43;
		Static89.anIntArray557[91] = 42;
		Static89.anIntArray557[92] = 74;
		Static89.anIntArray557[44] = 71;
		Static89.anIntArray557[46] = 72;
		Static89.anIntArray557[61] = 27;
		if (Static359.aMethod2 == null) {
			Static89.anIntArray557[222] = 59;
			Static89.anIntArray557[192] = 58;
		} else {
			Static89.anIntArray557[192] = 28;
			Static89.anIntArray557[520] = 59;
			Static89.anIntArray557[222] = 58;
		}
		Static89.anIntArray557[47] = 73;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method2677(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static214.aHashtable2.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static292.aHashtable3.get(arg0);
		}
		if (local29 != null) {
			try {
				local29 = new File(local29.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg1, local29.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static214.aHashtable2.put(arg0, arg1);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static214.aHashtable2.put(arg0, cn.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)V")
	public static void method2678(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static242.aClass118_21.method2595((long) arg0);
		if (local10 != null) {
			local10.aClass209_Sub1_1.method4356();
			Static235.method3206(local10.aBoolean288, local10.anInt4043);
			local10.method8653();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB[I[IIIZLclient!nt;IIIIIII)I")
	public static int method2679(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class240 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static283.anIntArrayArray46[local3][local7] = 0;
				Static283.anIntArrayArray47[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg10 == 1) {
			local51 = Static594.method8046(arg7, arg3, arg0, arg9, arg8, arg13, arg11, arg12, arg4, arg6);
		} else if (arg10 == 2) {
			local51 = Static509.method7174(arg6, arg12, arg7, arg8, arg9, arg3, arg13, arg11, arg4, arg0);
		} else {
			local51 = Static325.method4371(arg11, arg4, arg6, arg9, arg10, arg7, arg12, arg8, arg13, arg3, arg0);
		}
		@Pc(89) int local89 = arg8 - 64;
		@Pc(93) int local93 = arg12 - 64;
		@Pc(95) int local95 = Static395.anInt6217;
		@Pc(97) int local97 = Static350.anInt5488;
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(112) int local112;
		if (!local51) {
			if (!arg5) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			local105 = Integer.MAX_VALUE;
			for (local112 = arg4 - 10; local112 <= arg4 + 10; local112++) {
				for (@Pc(119) int local119 = arg11 - 10; local119 <= arg11 + 10; local119++) {
					@Pc(125) int local125 = local112 - local89;
					@Pc(130) int local130 = local119 - local93;
					if (local125 >= 0 && local130 >= 0 && local125 < 128 && local130 < 128 && Static283.anIntArrayArray47[local125][local130] < 100) {
						@Pc(156) int local156 = 0;
						if (local112 < arg4) {
							local156 = arg4 - local112;
						} else if (local112 > arg3 + arg4 - 1) {
							local156 = local112 + 1 - arg4 - arg3;
						}
						@Pc(184) int local184 = 0;
						if (local119 < arg11) {
							local184 = arg11 - local119;
						} else if (local119 > arg9 + arg11 - 1) {
							local184 = local119 + 1 - arg9 - arg11;
						}
						@Pc(221) int local221 = local184 * local184 + local156 * local156;
						if (local221 < local103 || local103 == local221 && local105 > Static283.anIntArrayArray47[local125][local130]) {
							local97 = local119;
							local103 = local221;
							local95 = local112;
							local105 = Static283.anIntArrayArray47[local125][local130];
						}
					}
				}
			}
			if (local103 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local95 == arg8 && local97 == arg12) {
			return 0;
		}
		@Pc(292) byte local292 = 0;
		Static314.anIntArray343[0] = local95;
		local103 = local292 + 1;
		Static493.anIntArray569[0] = local97;
		@Pc(314) int local314;
		local105 = local314 = Static283.anIntArrayArray46[local95 - local89][local97 - local93];
		while (local95 != arg8 || arg12 != local97) {
			if (local314 != local105) {
				Static314.anIntArray343[local103] = local95;
				local314 = local105;
				Static493.anIntArray569[local103++] = local97;
			}
			if ((local105 & 0x1) != 0) {
				local97++;
			} else if ((local105 & 0x4) != 0) {
				local97--;
			}
			if ((local105 & 0x2) != 0) {
				local95++;
			} else if ((local105 & 0x8) != 0) {
				local95--;
			}
			local105 = Static283.anIntArrayArray46[local95 - local89][local97 - local93];
		}
		local112 = 0;
		while (local103-- > 0) {
			arg2[local112] = Static314.anIntArray343[local103];
			arg1[local112++] = Static493.anIntArray569[local103];
			if (arg2.length <= local112) {
				break;
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ei;ILclient!ei;ZIIZ)I")
	public static int method2680(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(30) int local30 = Static610.method8215(arg2, arg1, arg3, arg0);
		if (local30 != 0) {
			return arg3 ? -local30 : local30;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(55) int local55 = Static610.method8215(arg2, arg4, arg5, arg0);
			return arg5 ? -local55 : local55;
		}
	}
}
