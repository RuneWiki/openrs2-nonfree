import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!rl", name = "W", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!rl", name = "X", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "Lclient!o;")
	public static final Class169 aClass169_289 = new Class169("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "[I")
	public static final int[] anIntArray618 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_187 = new Class48(45, -1);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method4553(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class117 local8 = Static84.method1246(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray16 != null) {
			@Pc(18) Class1_Sub39 local18 = new Class1_Sub39();
			local18.anInt5362 = arg0;
			local18.aClass117_16 = local8;
			local18.anObjectArray34 = local8.anObjectArray16;
			local18.aString61 = arg1;
			Static387.method5496(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt3064 != 0) {
			local35 = Static79.method1203(local8);
		}
		if (!local35 || !Static50.method810(local8).method2808(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static177.method1119(Static226.aClass48_131);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 2) {
			Static177.method1119(Static240.aClass48_139);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 3) {
			Static177.method1119(Static265.aClass48_163);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 4) {
			Static177.method1119(Static104.aClass48_62);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 5) {
			Static177.method1119(Static347.aClass48_216);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 6) {
			Static177.method1119(Static301.aClass48_183);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 7) {
			Static177.method1119(Static96.aClass48_57);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 8) {
			Static177.method1119(Static48.aClass48_31);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 9) {
			Static177.method1119(Static83.aClass48_47);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
		if (arg0 == 10) {
			Static177.method1119(Static94.aClass48_55);
			Static299.method5141(arg3, local8.anInt3080, arg2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBIII)V")
	public static void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 >= Static372.anInt1561 && Static98.anInt1774 >= arg6 && Static194.anInt3448 <= arg5 && Static264.anInt4589 >= arg4) {
			Static301.method4497(arg2, arg3, arg6, arg1, arg0, arg5, arg4);
		} else {
			Static83.method1226(arg3, arg5, arg6, arg2, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI)Lclient!bu;")
	public static Class1_Sub6_Sub1 method4557(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub6_Sub1 local9 = new Class1_Sub6_Sub1();
		@Pc(14) Class1_Sub33 local14 = new Class1_Sub33(arg0);
		local14.lb = local14.aByteArray86.length - 2;
		@Pc(25) int local25 = local14.method5177();
		@Pc(36) int local36 = local14.aByteArray86.length - local25 - 12 - 2;
		local14.lb = local36;
		@Pc(43) int local43 = local14.method5150();
		local9.anInt733 = local14.method5177();
		local9.anInt732 = local14.method5177();
		local9.anInt736 = local14.method5177();
		local9.anInt735 = local14.method5177();
		@Pc(69) int local69 = local14.method5174();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local69 > 0) {
			local9.aClass77Array1 = new Class77[local69];
			for (local80 = 0; local80 < local69; local80++) {
				local86 = local14.method5177();
				@Pc(93) Class77 local93 = new Class77(Static183.method1325(local86));
				local9.aClass77Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(106) int local106 = local14.method5150();
					@Pc(110) int local110 = local14.method5150();
					local93.method1370((long) local106, new Class1_Sub30(local110));
				}
			}
		}
		local14.lb = 0;
		local9.aString8 = local14.method5151();
		local9.anIntArray112 = new int[local43];
		local9.aStringArray12 = new String[local43];
		local9.anIntArray111 = new int[local43];
		local80 = 0;
		while (local36 > local14.lb) {
			local86 = local14.method5177();
			if (local86 == 3) {
				local9.aStringArray12[local80] = local14.method5128().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray112[local80] = local14.method5174();
			} else {
				local9.anIntArray112[local80] = local14.method5150();
			}
			local9.anIntArray111[local80++] = local86;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)I")
	public static int method4558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static190.anIntArray391[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjava/lang/String;Lclient!tr;Lclient!je;Lclient!is;ILclient!us;IIII)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) Class117 arg4, @OriginalArg(5) Class110 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class34 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(18) int local18;
		if (Static323.anInt5463 == 4) {
			local18 = (int) Static386.aFloat82 & 0x3FFF;
		} else {
			local18 = (int) Static386.aFloat82 + Static246.anInt4136 & 0x3FFF;
		}
		@Pc(39) int local39 = Math.max(arg4.anInt3074 / 2, arg4.anInt3071 / 2) + 10;
		@Pc(47) int local47 = arg1 * arg1 + arg6 * arg6;
		if (local39 * local39 < local47) {
			return;
		}
		@Pc(57) int local57 = Class13.anIntArray20[local18];
		@Pc(61) int local61 = Class13.anIntArray21[local18];
		if (Static323.anInt5463 != 4) {
			local61 = local61 * 256 / (Static205.anInt3600 + 256);
			local57 = local57 * 256 / (Static205.anInt3600 + 256);
		}
		@Pc(90) int local90 = local61 * arg1 + local57 * arg6 >> 15;
		@Pc(100) int local100 = arg6 * local61 - arg1 * local57 >> 15;
		@Pc(107) int local107 = arg5.method2411(arg2, 100, null);
		@Pc(113) int local113 = local90 - local107 / 2;
		@Pc(121) int local121 = arg5.method2417(arg2, null);
		if (local113 >= -arg4.anInt3074 && arg4.anInt3074 >= local113 && -arg4.anInt3071 <= local100 && local100 <= arg4.anInt3071) {
			arg3.method5096(50, local107, arg0, arg2, arg9, 0, arg7, null, arg0 + local113 + arg4.anInt3074 / 2, 1, 0, null, 0, arg8, arg9 + arg4.anInt3071 / 2 - local121 - local100 - arg10);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg5 < 0 || arg6 >= Static92.anInt1675 - 1 || Static262.anInt6340 - 1 <= arg5) {
			return;
		}
		if (Static25.aClass132ArrayArrayArray1 == null) {
			return;
		}
		@Pc(43) Interface6 local43;
		if (arg0 == 0) {
			local43 = (Interface6) Static186.method2676(arg3, arg6, arg5);
			@Pc(49) Interface6 local49 = (Interface6) Static47.method724(arg3, arg6, arg5);
			if (local43 != null && arg1 != 2) {
				if (local43 instanceof Class25_Sub5_Sub1) {
					((Class25_Sub5_Sub1) local43).aClass44_1.method858(arg2);
				} else {
					Static17.method190(arg5, local43.method5250(), arg4, arg6, arg3, arg0, arg2, arg1);
				}
			}
			if (local49 != null) {
				if (local49 instanceof Class25_Sub5_Sub1) {
					((Class25_Sub5_Sub1) local49).aClass44_1.method858(arg2);
				} else {
					Static17.method190(arg5, local49.method5250(), arg4, arg6, arg3, arg0, arg2, arg1);
				}
			}
		} else if (arg0 == 1) {
			local43 = (Interface6) Static153.method2323(arg3, arg6, arg5);
			if (local43 != null) {
				if (local43 instanceof Class25_Sub3_Sub2) {
					((Class25_Sub3_Sub2) local43).aClass44_4.method858(arg2);
				} else {
					@Pc(219) int local219 = local43.method5250();
					if (arg1 == 4 || arg1 == 5) {
						Static17.method190(arg5, local219, arg4, arg6, arg3, arg0, arg2, 4);
					} else if (arg1 == 6) {
						Static17.method190(arg5, local219, arg4 + 4, arg6, arg3, arg0, arg2, 4);
					} else if (arg1 == 7) {
						Static17.method190(arg5, local219, (arg4 + 2 & 0x3) + 4, arg6, arg3, arg0, arg2, 4);
					} else if (arg1 == 8) {
						Static17.method190(arg5, local219, arg4 + 4, arg6, arg3, arg0, arg2, 4);
						Static17.method190(arg5, local219, (arg4 + 2 & 0x3) + 4, arg6, arg3, arg0, arg2, 4);
					}
				}
			}
		} else if (arg0 == 2) {
			local43 = (Interface6) Static67.method1123(arg3, arg6, arg5, ki.class);
			if (local43 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local43 instanceof Class25_Sub1_Sub4) {
					((Class25_Sub1_Sub4) local43).aClass44_2.method858(arg2);
				} else {
					Static17.method190(arg5, local43.method5250(), arg4, arg6, arg3, arg0, arg2, arg1);
				}
			}
		} else if (arg0 == 3) {
			local43 = (Interface6) Static91.method1355(arg3, arg6, arg5);
			if (local43 != null) {
				if (local43 instanceof Class25_Sub4_Sub3) {
					((Class25_Sub4_Sub3) local43).aClass44_3.method858(arg2);
				} else {
					Static17.method190(arg5, local43.method5250(), arg4, arg6, arg3, arg0, arg2, arg1);
				}
			}
		}
	}
}
