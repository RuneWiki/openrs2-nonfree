import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
	public static int anInt3375;

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!oc", name = "ob", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_887 = Static231.method3737("mapfunction");

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "[I")
	public static int[] anIntArray293 = new int[500];

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_890 = Static231.method3737("flash2:");

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_888 = aClass107_890;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
	public static int anInt3367 = 0;

	@OriginalMember(owner = "client!oc", name = "jb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_889 = aClass107_890;

	@OriginalMember(owner = "client!oc", name = "nb", descriptor = "[I")
	public static int[] anIntArray295 = new int[128];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = arg2 - arg1;
		@Pc(22) int local22 = arg1 + arg4;
		@Pc(27) int local27 = arg0 - arg1;
		@Pc(31) int local31 = arg1 + arg5;
		for (@Pc(33) int local33 = arg5; local33 < local31; local33++) {
			Static162.method2605(Static231.anIntArrayArray44[local33], arg4, arg3, arg0);
		}
		for (@Pc(53) int local53 = arg2; local53 > local18; local53--) {
			Static162.method2605(Static231.anIntArrayArray44[local53], arg4, arg3, arg0);
		}
		for (@Pc(73) int local73 = local31; local73 <= local18; local73++) {
			@Pc(79) int[] local79 = Static231.anIntArrayArray44[local73];
			Static162.method2605(local79, arg4, arg3, local22);
			Static162.method2605(local79, local27, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(JB)Lclient!sc;")
	public static Class107 method2502(@OriginalArg(0) long arg0) {
		return Static60.method1160(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(III)V")
	public static void method2503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static231.aBoolean446 = true;
		Static199.anInt4325 = arg0;
		Static3.anInt3933 = arg1;
		Static191.anInt4240 = arg2;
		Static192.anInt4246 = -1;
		Static59.anInt1434 = -1;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(III)Z")
	public static boolean method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static177.anInt3843; local1++) {
			@Pc(6) Class126 local6 = Static99.aClass126Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4980 == 1) {
				local15 = local6.anInt4975 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4969 + (local6.anInt4973 * local15 >> 8);
					local37 = local6.anInt4976 + (local6.anInt4974 * local15 >> 8);
					local47 = local6.anInt4968 + (local6.anInt4961 * local15 >> 8);
					local57 = local6.anInt4977 + (local6.anInt4964 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4980 == 2) {
				local15 = arg0 - local6.anInt4975;
				if (local15 > 0) {
					local27 = local6.anInt4969 + (local6.anInt4973 * local15 >> 8);
					local37 = local6.anInt4976 + (local6.anInt4974 * local15 >> 8);
					local47 = local6.anInt4968 + (local6.anInt4961 * local15 >> 8);
					local57 = local6.anInt4977 + (local6.anInt4964 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4980 == 3) {
				local15 = local6.anInt4969 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4975 + (local6.anInt4981 * local15 >> 8);
					local37 = local6.anInt4984 + (local6.anInt4970 * local15 >> 8);
					local47 = local6.anInt4968 + (local6.anInt4961 * local15 >> 8);
					local57 = local6.anInt4977 + (local6.anInt4964 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4980 == 4) {
				local15 = arg2 - local6.anInt4969;
				if (local15 > 0) {
					local27 = local6.anInt4975 + (local6.anInt4981 * local15 >> 8);
					local37 = local6.anInt4984 + (local6.anInt4970 * local15 >> 8);
					local47 = local6.anInt4968 + (local6.anInt4961 * local15 >> 8);
					local57 = local6.anInt4977 + (local6.anInt4964 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4980 == 5) {
				local15 = arg1 - local6.anInt4968;
				if (local15 > 0) {
					local27 = local6.anInt4975 + (local6.anInt4981 * local15 >> 8);
					local37 = local6.anInt4984 + (local6.anInt4970 * local15 >> 8);
					local47 = local6.anInt4969 + (local6.anInt4973 * local15 >> 8);
					local57 = local6.anInt4976 + (local6.anInt4974 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(IB)Z")
	public static boolean method2505(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
