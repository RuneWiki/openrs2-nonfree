import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!hd;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZZLjava/lang/String;)Z")
	public static boolean method4414(@OriginalArg(3) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(32) int local32 = arg0.length();
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 0; local36 < local32; local36++) {
			@Pc(47) char local47 = arg0.charAt(local36);
			if (local36 == 0) {
				if (local47 == '-') {
					local27 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local47 >= '0' && local47 <= '9') {
				local87 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local87 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local87 = local47 - 'W';
			} else {
				return false;
			}
			if (local87 >= 10) {
				return false;
			}
			if (local27) {
				local87 = -local87;
			}
			@Pc(119) int local119 = local87 + local34 * 10;
			if (local34 != local119 / 10) {
				return false;
			}
			local34 = local119;
			local29 = true;
		}
		return local29;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method4417(@OriginalArg(0) int arg0) {
		Static48.anInt1122 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static158.anInt3404; local3++) {
			for (@Pc(8) int local8 = 0; local8 < Static209.anInt4179; local8++) {
				if (Static74.aClass1_Sub26ArrayArrayArray1[arg0][local3][local8] == null) {
					Static74.aClass1_Sub26ArrayArrayArray1[arg0][local3][local8] = new Class1_Sub26(arg0, local3, local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method4419(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static79.method1378(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIILclient!dn;IJIIII)Z")
	public static boolean method4420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static163.method2819(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
