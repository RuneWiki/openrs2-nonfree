import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eba", name = "y", descriptor = "Lclient!pu;")
	public static Class270 aClass270_23;

	@OriginalMember(owner = "client!eba", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!eba", name = "E", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
	public static int anInt2084 = 503;

	@OriginalMember(owner = "client!eba", name = "F", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!r;IIIIIIII)V")
	public static void method1713(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface19 local11 = (Interface19) Static82.method1473(arg2, arg4, arg3);
		@Pc(20) Class95 local20;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(38) int local38;
		if (local11 != null) {
			local20 = Static518.aClass96_4.method1925(local11.method7640());
			local28 = local11.method7637() & 0x3;
			local32 = local11.method7638();
			if (local20.anInt2421 == -1) {
				local38 = arg6;
				if (local20.anInt2399 > 0) {
					local38 = arg7;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg0.method6948(4, arg1, arg5, local38);
					} else if (local28 == 1) {
						arg0.method6894(arg5, local38, arg1, 4);
					} else if (local28 == 2) {
						arg0.method6948(4, arg1 + 3, arg5, local38);
					} else if (local28 == 3) {
						arg0.method6894(arg5 + 3, local38, arg1, 4);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg0.method6929(1, arg5, arg1, local38, 1);
					} else if (local28 == 1) {
						arg0.method6929(1, arg5, arg1 + 3, local38, 1);
					} else if (local28 == 2) {
						arg0.method6929(1, arg5 + 3, arg1 + 3, local38, 1);
					} else if (local28 == 3) {
						arg0.method6929(1, arg5 + 3, arg1, local38, 1);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg0.method6894(arg5, local38, arg1, 4);
					} else if (local28 == 1) {
						arg0.method6948(4, arg1 + 3, arg5, local38);
					} else if (local28 == 2) {
						arg0.method6894(arg5 + 3, local38, arg1, 4);
					} else if (local28 == 3) {
						arg0.method6948(4, arg1, arg5, local38);
					}
				}
			} else {
				Static129.method2018(arg0, arg1, arg5, local20, local28);
			}
		}
		local11 = (Interface19) Static14.method147(arg2, arg4, arg3, rda.class);
		if (local11 != null) {
			local20 = Static518.aClass96_4.method1925(local11.method7640());
			local28 = local11.method7637() & 0x3;
			local32 = local11.method7638();
			if (local20.anInt2421 != -1) {
				Static129.method2018(arg0, arg1, arg5, local20, local28);
			} else if (local32 == 9) {
				local38 = -1118482;
				if (local20.anInt2399 > 0) {
					local38 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg0.method6933(arg1, arg5, local38, arg5 + 3, arg1 + 3);
				} else {
					arg0.method6933(arg1, arg5 + 3, local38, arg5, arg1 + 3);
				}
			}
		}
		local11 = (Interface19) Static308.method4292(arg2, arg4, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static518.aClass96_4.method1925(local11.method7640());
		local28 = local11.method7637() & 0x3;
		if (local20.anInt2421 != -1) {
			Static129.method2018(arg0, arg1, arg5, local20, local28);
		}
	}

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "(B)I")
	public static int method1714() {
		return Static165.anInt2959;
	}
}
