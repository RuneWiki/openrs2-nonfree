import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "Lclient!em;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "J")
	public static final long aLong199 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)Lclient!bea;")
	public static Class26 method6466(@OriginalArg(0) int arg0) {
		@Pc(15) Class26 local15 = (Class26) Static463.aClass332_212.method7502((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static34.aClass251_120.method5860(0, arg0);
		local15 = new Class26();
		if (local25 != null) {
			local15.method452(new Class6_Sub14(local25), arg0);
		}
		Static463.aClass332_212.method7498((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIBIILclient!oa;II)V")
	public static void method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class121 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface6 local11 = (Interface6) Static120.method1814(arg0, arg6, arg3);
		@Pc(20) Class313 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static260.aClass100_1.method2008(local11.method7555());
			local26 = local11.method7553() & 0x3;
			local30 = local11.method7551();
			if (local20.anInt8446 == -1) {
				local46 = arg2;
				if (local20.lb > 0) {
					local46 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg5.method7140(arg1, arg4, local46, 4);
					} else if (local26 == 1) {
						arg5.method7138(4, arg4, local46, arg1);
					} else if (local26 == 2) {
						arg5.method7140(arg1 + 3, arg4, local46, 4);
					} else if (local26 == 3) {
						arg5.method7138(4, arg4 + 3, local46, arg1);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg5.method7109(arg4, 1, 1, arg1, local46);
					} else if (local26 == 1) {
						arg5.method7109(arg4, 1, 1, arg1 + 3, local46);
					} else if (local26 == 2) {
						arg5.method7109(arg4 + 3, 1, 1, arg1 + 3, local46);
					} else if (local26 == 3) {
						arg5.method7109(arg4 + 3, 1, 1, arg1, local46);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg5.method7138(4, arg4, local46, arg1);
					} else if (local26 == 1) {
						arg5.method7140(arg1 + 3, arg4, local46, 4);
					} else if (local26 == 2) {
						arg5.method7138(4, arg4 + 3, local46, arg1);
					} else if (local26 == 3) {
						arg5.method7140(arg1, arg4, local46, 4);
					}
				}
			} else {
				Static382.method5563(arg1, local20, arg4, local26, arg5);
			}
		}
		local11 = (Interface6) Static134.method1995(arg0, arg6, arg3, dda.class);
		if (local11 != null) {
			local20 = Static260.aClass100_1.method2008(local11.method7555());
			local26 = local11.method7553() & 0x3;
			local30 = local11.method7551();
			if (local20.anInt8446 != -1) {
				Static382.method5563(arg1, local20, arg4, local26, arg5);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.lb > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg5.method7149(local46, arg1 + 3, arg4, arg4 + 3, arg1);
				} else {
					arg5.method7149(local46, arg1 + 3, arg4 + 3, arg4, arg1);
				}
			}
		}
		local11 = (Interface6) Static315.method4904(arg0, arg6, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static260.aClass100_1.method2008(local11.method7555());
		local26 = local11.method7553() & 0x3;
		if (local20.anInt8446 != -1) {
			Static382.method5563(arg1, local20, arg4, local26, arg5);
			return;
		}
	}
}
