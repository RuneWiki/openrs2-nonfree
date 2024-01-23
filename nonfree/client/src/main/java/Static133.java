import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString82 = "Walk here";

	@OriginalMember(owner = "client!k", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15 = new String[100];

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public static int anInt3019 = 0;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Z")
	public static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!td;ILclient!td;ZIZI)I")
	public static int method2289(@OriginalArg(0) Class140_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class140_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(12) int local12 = Static209.method3682(arg0, arg2, arg5, arg4);
		if (local12 != 0) {
			return arg5 ? -local12 : local12;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static209.method3682(arg0, arg2, arg3, arg1);
			return arg3 ? -local39 : local39;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method2290() {
		Static75.aClass155_11.method4364(5);
		Static9.aClass155_2.method4364(5);
		Static18.aClass155_6.method4364(5);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public static void method2291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(12) Class1_Sub24 local12 = new Class1_Sub24();
		local12.anInt4230 = arg9;
		local12.anInt4227 = arg2;
		local12.anInt4232 = arg3;
		local12.anInt4233 = arg5;
		local12.anInt4238 = arg0;
		local12.anInt4239 = arg4;
		local12.anInt4236 = arg8;
		local12.anInt4229 = arg10;
		local12.anInt4226 = arg7;
		local12.anInt4234 = arg6;
		local12.anInt4235 = arg1;
		local12.anInt4228 = arg11;
		Static135.aClass131_8.method3799(local12);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public static void method2292() {
		@Pc(3) int local3 = Static204.anInt4548;
		@Pc(14) int local14 = Static35.anInt922;
		@Pc(16) int local16 = Static82.anInt1976;
		@Pc(20) int local20 = Static66.anInt3695;
		if (Static296.aBoolean335) {
			Static288.method4713(local3, local14, local16, local20, 6116423);
			Static288.method4713(local3 + 1, local14 + 1, local16 - 2, 16, 0);
			Static288.method4709(local3 + 1, local14 + 18, local16 - 2, local20 + -19, 0);
		} else {
			Static203.method3592(local3, local14, local16, local20, 6116423);
			Static203.method3592(local3 + 1, local14 - -1, local16 - 2, 16, 0);
			Static203.method3598(local3 + 1, local14 + 18, local16 - 2, local20 - 19, 0);
		}
		Static156.aClass1_Sub2_Sub16_3.method3981(Static141.aString94, local3 + 3, local14 + 14, 6116423, -1);
		@Pc(101) int local101 = Static84.anInt1989;
		@Pc(103) int local103 = Static212.anInt4711;
		for (@Pc(105) int local105 = 0; local105 < Static111.anInt2398; local105++) {
			@Pc(125) int local125 = (Static111.anInt2398 - local105 - 1) * 15 + local14 + 31;
			@Pc(127) int local127 = 16777215;
			if (local101 > local3 && local16 + local3 > local101 && local125 - 13 < local103 && local125 + 3 > local103) {
				local127 = 16776960;
			}
			Static156.aClass1_Sub2_Sub16_3.method3981(Static254.method4242(local105), local3 + 3, local125, local127, 0);
		}
		Static180.method3276(Static204.anInt4548, Static35.anInt922, Static66.anInt3695, Static82.anInt1976);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I")
	public static int method2293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub28 local10 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray499.length) {
			return local10.anIntArray499[arg1];
		} else {
			return 0;
		}
	}
}
