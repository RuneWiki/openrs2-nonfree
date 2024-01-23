import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	public static int anInt310 = 0;

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
	public static int anInt321 = -1;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Lclient!ae;")
	public static Class5 method272() {
		try {
			return (Class5) Class.forName("Class5_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)Lclient!g;")
	public static Class56 method273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class56 local3 = Static38.method715(arg0);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass56Array1 == null || arg1 >= local3.aClass56Array1.length) {
			return null;
		} else {
			return local3.aClass56Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B[I[III)V")
	public static void method274(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) int local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) int local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg2; local50++) {
			if (local24 + (local50 & 0x1) > arg0[local50]) {
				@Pc(70) int local70 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20] = local70;
				@Pc(84) int local84 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20++] = local84;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method274(arg0, arg1, local20 - 1, arg3);
		method274(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!ek;Lclient!ek;Z)V")
	public static void method275(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static192.aClass42_59 = arg1;
		Static138.aBoolean215 = true;
		Static26.aClass42_70 = arg0;
	}
}
