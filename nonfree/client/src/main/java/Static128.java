import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!am;")
	public static Class11 aClass11_56;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
	public static final int[] anIntArray267 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
	public static boolean aBoolean242 = true;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg0 < 0 || Static92.anInt2048 - 1 <= arg1 || Static290.anInt5893 - 1 <= arg0) {
			return;
		}
		if (Static18.aClass57ArrayArrayArray1 == null) {
			return;
		}
		@Pc(47) Interface5 local47;
		if (arg4 != 0) {
			if (arg4 == 1) {
				local47 = (Interface5) Static186.method4780(arg5, arg1, arg0);
				if (local47 != null) {
					if (local47 instanceof Class2_Sub1_Sub1) {
						((Class2_Sub1_Sub1) local47).aClass97_1.method2528(arg6);
						return;
					}
					@Pc(63) int local63 = local47.method4729();
					if (arg3 != 4 && arg3 != 5) {
						if (arg3 != 6) {
							if (arg3 == 7) {
								Static32.method3141(arg4, (arg2 + 2 & 0x3) + 4, arg1, arg5, arg6, arg0, 4, local63);
							} else if (arg3 == 8) {
								Static32.method3141(arg4, arg2 + 4, arg1, arg5, arg6, arg0, 4, local63);
								Static32.method3141(arg4, (arg2 + 2 & 0x3) + 4, arg1, arg5, arg6, arg0, 4, local63);
								return;
							}
							return;
						}
						Static32.method3141(arg4, arg2 + 4, arg1, arg5, arg6, arg0, 4, local63);
						return;
					}
					Static32.method3141(arg4, arg2, arg1, arg5, arg6, arg0, 4, local63);
					return;
				}
				return;
			}
			if (arg4 != 2) {
				if (arg4 == 3) {
					local47 = (Interface5) Static5.method210(arg5, arg1, arg0);
					if (local47 != null) {
						if (local47 instanceof Class2_Sub5_Sub2) {
							((Class2_Sub5_Sub2) local47).aClass97_4.method2528(arg6);
							return;
						}
						Static32.method3141(arg4, arg2, arg1, arg5, arg6, arg0, arg3, local47.method4729());
						return;
					}
				}
				return;
			}
			local47 = (Interface5) Static166.method3153(arg5, arg1, arg0, io.class);
			if (local47 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local47 instanceof Class2_Sub2_Sub3) {
					((Class2_Sub2_Sub3) local47).aClass97_2.method2528(arg6);
					return;
				}
				Static32.method3141(arg4, arg2, arg1, arg5, arg6, arg0, arg3, local47.method4729());
				return;
			}
			return;
		}
		local47 = (Interface5) Static122.method2458(arg5, arg1, arg0);
		@Pc(249) Interface5 local249 = (Interface5) Static67.method1254(arg5, arg1, arg0);
		if (local47 != null && arg3 != 2) {
			if (local47 instanceof Class2_Sub4_Sub2) {
				((Class2_Sub4_Sub2) local47).aClass97_3.method2528(arg6);
			} else {
				Static32.method3141(arg4, arg2, arg1, arg5, arg6, arg0, arg3, local47.method4729());
			}
		}
		if (local249 == null) {
			return;
		}
		if (local249 instanceof Class2_Sub4_Sub2) {
			((Class2_Sub4_Sub2) local249).aClass97_3.method2528(arg6);
			return;
		}
		Static32.method3141(arg4, arg2, arg1, arg5, arg6, arg0, arg3, local249.method4729());
		return;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method2578() {
		Static275.aClass154_84.method4220(5);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	public static void method2579() {
		if (Static260.aString193.length() != 0) {
			Static107.method5698("--> " + Static260.aString193);
			Static126.method2525(Static260.aString193, false);
			Static137.anInt3096 = 0;
			Static260.aString193 = "";
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)Lclient!qq;")
	public static Class172 method2580(@OriginalArg(1) int arg0) {
		@Pc(10) Class172 local10 = (Class172) Static101.aClass154_48.method4222((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass11_56.method288(arg0, 1);
		local10 = new Class172();
		if (local20 != null) {
			local10.method4646(new Class4_Sub7(local20), arg0);
		}
		Static101.aClass154_48.method4221((long) arg0, local10);
		return local10;
	}
}
