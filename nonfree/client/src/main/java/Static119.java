import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
	public static int anInt2560 = 0;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString129 = "green:";

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILclient!mn;III)V")
	public static void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class115 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static7.aBoolean22) {
			Static232.anInt4786 = 32;
		} else {
			Static232.anInt4786 = 0;
		}
		Static7.aBoolean22 = false;
		@Pc(129) int local129;
		if (Static279.anInt5824 != 0) {
			if (arg0 >= arg2 && arg2 + 16 > arg0 && arg5 >= arg3 && arg5 < arg3 + 16) {
				arg4.anInt3514 -= 4;
				Static298.method4263(arg4);
			} else if (arg2 <= arg0 && arg0 < arg2 + 16 && arg1 + arg3 - 16 <= arg5 && arg5 < arg3 + arg1) {
				arg4.anInt3514 += 4;
				Static298.method4263(arg4);
			} else if (arg0 >= arg2 - Static232.anInt4786 && arg0 < arg2 + Static232.anInt4786 + 16 && arg5 >= arg3 + 16 && arg5 < arg1 + arg3 - 16) {
				local129 = (arg1 - 32) * arg1 / arg6;
				if (local129 < 8) {
					local129 = 8;
				}
				@Pc(148) int local148 = arg5 - local129 / 2 - arg3 - 16;
				@Pc(155) int local155 = arg1 - local129 - 32;
				arg4.anInt3514 = local148 * (arg6 - arg1) / local155;
				Static298.method4263(arg4);
				Static7.aBoolean22 = true;
			}
		}
		if (Static205.anInt4276 == 0) {
			return;
		}
		local129 = arg4.anInt3555;
		if (arg0 >= arg2 - local129 && arg3 <= arg5 && arg2 + 16 > arg0 && arg5 <= arg3 + arg1) {
			arg4.anInt3514 += Static205.anInt4276 * 45;
			Static298.method4263(arg4);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!wm;BI)V")
	public static void method2201(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (Static40.aClass135_3 == null) {
			return;
		}
		try {
			Static40.aClass135_3.method3372(0L);
			Static40.aClass135_3.method3374(arg1, arg0.aByteArray72, 24);
		} catch (@Pc(15) Exception local15) {
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!j;ZB)V")
	public static void method2202(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.anInt2424;
		@Pc(19) int local19 = (int) arg0.aLong315;
		arg0.method4926();
		if (arg1) {
			Static299.method2237(local8);
		}
		Static145.method2554(local8);
		@Pc(35) Class115 local35 = Static90.method1692(local19);
		if (local35 != null) {
			Static298.method4263(local35);
		}
		@Pc(42) int local42 = Static216.anInt4481;
		@Pc(44) int local44;
		for (local44 = 0; local44 < local42; local44++) {
			if (Static293.method4856(Static289.aShortArray93[local44])) {
				Static195.method3284(local44);
			}
		}
		if (Static216.anInt4481 == 1) {
			Static299.aBoolean203 = false;
			Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
		} else {
			Static121.method2215(Static63.anInt1431, Static221.anInt4607, Static243.anInt3779, Static297.anInt6219);
			local44 = Static153.aClass2_Sub3_Sub5_1.method3325(Static169.aString178);
			for (@Pc(91) int local91 = 0; local91 < Static216.anInt4481; local91++) {
				@Pc(104) int local104 = Static153.aClass2_Sub3_Sub5_1.method3325(Static196.method3333(local91));
				if (local104 > local44) {
					local44 = local104;
				}
			}
			Static297.anInt6219 = local44 + 8;
			Static63.anInt1431 = Static216.anInt4481 * 15 + (Static201.aBoolean347 ? 26 : 22);
		}
		if (Static17.anInt427 != -1) {
			Static11.method254(1, Static17.anInt427);
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Lclient!mf;")
	public static Class2_Sub3_Sub16 method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub3_Sub16 local15 = (Class2_Sub3_Sub16) Static56.aClass79_8.method2002((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class2_Sub3_Sub16(arg1, arg0);
			Static56.aClass79_8.method1994(local15.aLong315, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V")
	public static void method2205() {
		@Pc(9) int local9 = Static153.aClass2_Sub3_Sub5_1.method3325(Static169.aString178);
		@Pc(11) int local11;
		@Pc(24) int local24;
		for (local11 = 0; local11 < Static216.anInt4481; local11++) {
			local24 = Static153.aClass2_Sub3_Sub5_1.method3325(Static196.method3333(local11));
			if (local24 > local9) {
				local9 = local24;
			}
		}
		local9 += 8;
		local11 = Static216.anInt4481 * 15 + 21;
		@Pc(45) int local45 = Static68.anInt1506;
		if (local11 + local45 > Static20.anInt1235) {
			local45 = Static20.anInt1235 - local11;
		}
		local24 = Static9.anInt275 - local9 / 2;
		if (Static257.anInt5343 < local9 + local24) {
			local24 = Static257.anInt5343 - local9;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		if (local45 < 0) {
			local45 = 0;
		}
		if (Static155.anInt6185 == 1) {
			if (Static9.anInt275 == Static104.anInt2262 && Static68.anInt1506 == Static118.anInt2534) {
				Static63.anInt1431 = (Static201.aBoolean347 ? 26 : 22) + Static216.anInt4481 * 15;
				Static297.anInt6219 = local9;
				Static243.anInt3779 = local45;
				Static221.anInt4607 = local24;
				Static299.aBoolean203 = true;
				Static155.anInt6185 = 0;
			}
		} else if (Static199.anInt4139 == Static9.anInt275 && Static68.anInt1506 == Static122.anInt2587) {
			Static243.anInt3779 = local45;
			Static221.anInt4607 = local24;
			Static155.anInt6185 = 0;
			Static297.anInt6219 = local9;
			Static63.anInt1431 = (Static201.aBoolean347 ? 26 : 22) + Static216.anInt4481 * 15;
			Static299.aBoolean203 = true;
		} else {
			Static155.anInt6185 = 1;
			Static104.anInt2262 = Static199.anInt4139;
			Static118.anInt2534 = Static122.anInt2587;
		}
	}
}
