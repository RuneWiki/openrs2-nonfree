import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	public static int anInt5261;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	public static int anInt5264;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	public static int anInt5267;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "[I")
	public static final int[] anIntArray582 = new int[4];

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "[I")
	public static final int[] anIntArray583 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(12) Class3_Sub36 local12 = null;
		for (@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) Static230.aClass138_34.method3051(); local17 != null; local17 = (Class3_Sub36) Static230.aClass138_34.method3050()) {
			if (arg2 == local17.anInt5112 && local17.anInt5104 == arg0 && arg3 == local17.anInt5110 && arg5 == local17.anInt5108) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class3_Sub36();
			local12.anInt5108 = arg5;
			local12.anInt5112 = arg2;
			local12.anInt5104 = arg0;
			local12.anInt5110 = arg3;
			Static373.method5558(local12);
			Static230.aClass138_34.method3053(local12);
		}
		local12.anInt5103 = arg1;
		local12.anInt5106 = 0;
		local12.anInt5101 = -1;
		local12.anInt5109 = arg4;
		local12.anInt5100 = arg6;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
	public static void method4696() {
		Static188.aClass139_40.method3075();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public static void method4698() {
		Static69.aClass3_Sub8_Sub4_1.method2147();
		Static175.anInt3065 = 1;
		Static48.aClass20_16 = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIILclient!np;ILclient!oh;)V")
	public static void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class155 arg4, @OriginalArg(6) Class150 arg5) {
		if (arg1) {
			Static364.aClass110_20.method5094((Static199.anInt3567 - Static364.aClass110_20.method5101()) / 2, (Static207.anInt2251 - Static364.aClass110_20.method5097()) / 2);
			Static69.aClass110_2.method5094((Static199.anInt3567 - Static69.aClass110_2.method5101()) / 2, 18);
		}
		arg5.method5728((Static17.aClass63_1 == Static121.aClass63_2 ? Static170.aClass57_53 : Static380.aClass57_101).method1122(Static66.anInt1307), arg0, -1, Static207.anInt2251 / 2 - 26, Static199.anInt3567 / 2);
		@Pc(56) int local56 = Static207.anInt2251 / 2 - 18;
		arg4.method4855(Static199.anInt3567 / 2 - 152, local56, 304, 34, arg3, 0);
		arg4.method4855(Static199.anInt3567 / 2 - 151, local56 + 1, 302, 32, 0, 0);
		arg4.method4896(Static199.anInt3567 / 2 - 150, local56 + 2, Static212.anInt3744 * 3, 30, arg2, 0);
		arg4.method4896(Static212.anInt3744 * 3 + Static199.anInt3567 / 2 - 150, local56 + 2, 300 - Static212.anInt3744 * 3, 30, 0, 0);
		arg5.method5728(Static187.aString34, arg0, -1, Static207.anInt2251 / 2 + 4, Static199.anInt3567 / 2);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	public static void method4700(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub8 local12 = Static275.method4307(9, arg0);
		local12.method3217();
	}
}
