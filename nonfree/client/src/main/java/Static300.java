import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!sm;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_190 = new Class103(76, 8);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method4092(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static323.anInt5519 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILclient!za;IIIII)V")
	public static void method4097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface8 local11 = (Interface8) Static337.method4524(arg1, arg0, arg6);
		@Pc(20) Class68 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static341.aClass75_4.method1616(local11.method4623());
			local26 = local11.method4620() & 0x3;
			local30 = local11.method4617();
			if (local20.anInt1800 == -1) {
				local37 = arg5;
				if (local20.anInt1821 > 0) {
					local37 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg2.method5753(4, arg3, local37, arg7);
					} else if (local26 == 1) {
						arg2.method5731(arg3, 4, arg7, local37);
					} else if (local26 == 2) {
						arg2.method5753(4, arg3 + 3, local37, arg7);
					} else if (local26 == 3) {
						arg2.method5731(arg3, 4, arg7 + 3, local37);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg2.method5729(1, arg3, 1, local37, arg7);
					} else if (local26 == 1) {
						arg2.method5729(1, arg3 + 3, 1, local37, arg7);
					} else if (local26 == 2) {
						arg2.method5729(1, arg3 + 3, 1, local37, arg7 + 3);
					} else if (local26 == 3) {
						arg2.method5729(1, arg3, 1, local37, arg7 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg2.method5731(arg3, 4, arg7, local37);
					} else if (local26 == 1) {
						arg2.method5753(4, arg3 + 3, local37, arg7);
					} else if (local26 == 2) {
						arg2.method5731(arg3, 4, arg7 + 3, local37);
					} else if (local26 == 3) {
						arg2.method5753(4, arg3, local37, arg7);
					}
				}
			} else {
				Static308.method4206(local26, arg7, local20, arg2, arg3);
			}
		}
		local11 = (Interface8) Static364.method2862(arg1, arg0, arg6, mh.class);
		if (local11 != null) {
			local20 = Static341.aClass75_4.method1616(local11.method4623());
			local26 = local11.method4620() & 0x3;
			local30 = local11.method4617();
			if (local20.anInt1800 != -1) {
				Static308.method4206(local26, arg7, local20, arg2, arg3);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt1821 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg2.method5773(arg3 + 3, arg7 - -3, local37, arg3, arg7);
				} else {
					arg2.method5773(arg3 + 3, arg7, local37, arg3, arg7 + 3);
				}
			}
		}
		local11 = (Interface8) Static231.method3312(arg1, arg0, arg6);
		if (local11 == null) {
			return;
		}
		local20 = Static341.aClass75_4.method1616(local11.method4623());
		local26 = local11.method4620() & 0x3;
		if (local20.anInt1800 != -1) {
			Static308.method4206(local26, arg7, local20, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)I")
	public static int method4098(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Lclient!kv;")
	public static Class139 method4099(@OriginalArg(1) int arg0) {
		@Pc(10) Class139 local10 = (Class139) Static42.aClass102_8.method2258((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static46.aClass82_8.method1817(1, arg0);
		local10 = new Class139();
		local10.anInt3987 = arg0;
		if (local28 != null) {
			local10.method3243(new Class1_Sub28(local28));
		}
		local10.method3242();
		if (local10.anInt3989 == 2 && Static103.aClass199_59.method4387((long) arg0) == null) {
			Static103.aClass199_59.method4383((long) arg0, new Class1_Sub26(Static54.anInt975));
			Static67.aClass139Array1[Static54.anInt975++] = local10;
		}
		Static42.aClass102_8.method2272((long) arg0, local10);
		return local10;
	}
}
