import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pf", name = "Pb", descriptor = "[Lclient!et;")
	public static Class74[] aClass74Array1;

	@OriginalMember(owner = "client!pf", name = "Nb", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_79 = new Class2(3, 7);

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
	public static int anInt5111 = -1;

	@OriginalMember(owner = "client!pf", name = "Rb", descriptor = "I")
	public static int anInt5112 = 0;

	@OriginalMember(owner = "client!pf", name = "Sb", descriptor = "I")
	public static int anInt5113 = 0;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)Z")
	public static boolean method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static29.anInt455; local1++) {
			@Pc(6) Class260 local6 = Static215.aClass260Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt7223 == 1) {
				local15 = local6.anInt7216 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt7222 + (local6.anInt7221 * local15 >> 8);
					local37 = local6.anInt7230 + (local6.anInt7219 * local15 >> 8);
					local47 = local6.anInt7232 + (local6.anInt7218 * local15 >> 8);
					local57 = local6.anInt7214 + (local6.anInt7227 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7223 == 2) {
				local15 = arg0 - local6.anInt7216;
				if (local15 > 0) {
					local27 = local6.anInt7222 + (local6.anInt7221 * local15 >> 8);
					local37 = local6.anInt7230 + (local6.anInt7219 * local15 >> 8);
					local47 = local6.anInt7232 + (local6.anInt7218 * local15 >> 8);
					local57 = local6.anInt7214 + (local6.anInt7227 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7223 == 3) {
				local15 = local6.anInt7222 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt7216 + (local6.anInt7217 * local15 >> 8);
					local37 = local6.anInt7225 + (local6.anInt7224 * local15 >> 8);
					local47 = local6.anInt7232 + (local6.anInt7218 * local15 >> 8);
					local57 = local6.anInt7214 + (local6.anInt7227 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7223 == 4) {
				local15 = arg2 - local6.anInt7222;
				if (local15 > 0) {
					local27 = local6.anInt7216 + (local6.anInt7217 * local15 >> 8);
					local37 = local6.anInt7225 + (local6.anInt7224 * local15 >> 8);
					local47 = local6.anInt7232 + (local6.anInt7218 * local15 >> 8);
					local57 = local6.anInt7214 + (local6.anInt7227 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt7223 == 5) {
				local15 = arg1 - local6.anInt7232;
				if (local15 > 0) {
					local27 = local6.anInt7216 + (local6.anInt7217 * local15 >> 8);
					local37 = local6.anInt7225 + (local6.anInt7224 * local15 >> 8);
					local47 = local6.anInt7222 + (local6.anInt7221 * local15 >> 8);
					local57 = local6.anInt7230 + (local6.anInt7219 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZZIIII)V")
	public static void method4024(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg0 + arg5) / 2;
		@Pc(13) int local13 = arg0;
		@Pc(17) Class19_Sub1 local17 = Static31.aClass19_Sub1Array1[local11];
		Static31.aClass19_Sub1Array1[local11] = Static31.aClass19_Sub1Array1[arg5];
		Static31.aClass19_Sub1Array1[arg5] = local17;
		for (@Pc(29) int local29 = arg0; local29 < arg5; local29++) {
			if (Static208.method2996(arg3, Static31.aClass19_Sub1Array1[local29], arg1, arg4, arg2, local17) <= 0) {
				@Pc(46) Class19_Sub1 local46 = Static31.aClass19_Sub1Array1[local29];
				Static31.aClass19_Sub1Array1[local29] = Static31.aClass19_Sub1Array1[local13];
				Static31.aClass19_Sub1Array1[local13++] = local46;
			}
		}
		Static31.aClass19_Sub1Array1[arg5] = Static31.aClass19_Sub1Array1[local13];
		Static31.aClass19_Sub1Array1[local13] = local17;
		method4024(arg0, arg1, arg2, arg3, arg4, local13 - 1);
		method4024(local13 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)Z")
	public static boolean method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class189 local16 = Static411.aClass142_4.method3148(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local16.method4023(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)Lclient!ap;")
	public static Class15 method4032(@OriginalArg(1) int arg0) {
		@Pc(10) Class15 local10 = (Class15) Static395.aClass126_58.method2822((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static217.aClass178_60.method3838(arg0, 0);
		local10 = new Class15();
		if (local20 != null) {
			local10.method116(new Class7_Sub14(local20), arg0);
		}
		Static395.aClass126_58.method2824((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public static void method4036() {
		for (@Pc(15) Class7_Sub4_Sub12 local15 = (Class7_Sub4_Sub12) Static203.aClass85_20.method2010(); local15 != null; local15 = (Class7_Sub4_Sub12) Static203.aClass85_20.method2000()) {
			@Pc(20) Class26_Sub2_Sub1 local20 = local15.aClass26_Sub2_Sub1_1;
			if (local20.aBoolean24) {
				local15.method5802();
				local20.method459();
			} else if (local20.anInt567 <= Static274.anInt4617) {
				local20.method461(Static436.anInt7296);
				if (local20.aBoolean24) {
					local15.method5802();
				} else {
					Static37.method529(local20, true);
				}
			}
		}
	}
}
