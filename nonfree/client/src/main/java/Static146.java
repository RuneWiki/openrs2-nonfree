import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public static int anInt2894;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!jh;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt2896;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
	public static final int[] anIntArray287 = new int[14];

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)V")
	public static void method2666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg1, 6);
		local8.method850();
		local8.anInt996 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public static void method2668() {
		if (Static210.aString30.toLowerCase().indexOf("microsoft") != -1) {
			Static161.anIntArray331[192] = 58;
			Static161.anIntArray331[186] = 57;
			Static161.anIntArray331[187] = 27;
			Static161.anIntArray331[222] = 59;
			Static161.anIntArray331[191] = 73;
			Static161.anIntArray331[220] = 74;
			Static161.anIntArray331[219] = 42;
			Static161.anIntArray331[188] = 71;
			Static161.anIntArray331[221] = 43;
			Static161.anIntArray331[223] = 28;
			Static161.anIntArray331[190] = 72;
			Static161.anIntArray331[189] = 26;
			return;
		}
		Static161.anIntArray331[46] = 72;
		Static161.anIntArray331[91] = 42;
		Static161.anIntArray331[44] = 71;
		Static161.anIntArray331[45] = 26;
		Static161.anIntArray331[47] = 73;
		if (Static210.aMethod2 == null) {
			Static161.anIntArray331[222] = 59;
			Static161.anIntArray331[192] = 58;
		} else {
			Static161.anIntArray331[192] = 28;
			Static161.anIntArray331[520] = 59;
			Static161.anIntArray331[222] = 58;
		}
		Static161.anIntArray331[59] = 57;
		Static161.anIntArray331[61] = 27;
		Static161.anIntArray331[93] = 43;
		Static161.anIntArray331[92] = 74;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method2669(@OriginalArg(0) int arg0) {
		Static34.anInt643 = arg0;
		@Pc(7) Class109 local7 = Static77.aClass109_20;
		synchronized (Static77.aClass109_20) {
			Static77.aClass109_20.method2858();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!lb;III[Z)V")
	public static void method2670(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static8.aClass51Array1 == Static219.aClass51Array3) {
			return;
		}
		@Pc(9) int local9 = Static56.aClass51Array2[arg1].method1844(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class51 local22 = Static56.aClass51Array2[local11];
				if (local22 != null) {
					local22.method1861(arg0, arg2, local9 - local22.method1844(arg2, arg3), arg3);
				}
			}
		}
	}
}
