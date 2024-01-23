import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!ok;")
	public static Class1_Sub12_Sub3 aClass1_Sub12_Sub3_4;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1149 = Static186.method3527("<col=00ff80>");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray376 = new int[2];

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
	public static int[] anIntArray377 = new int[] { 0, 0, 0, 0, 10, 0, 0, 7, 6, 0, -2, 2, 2, 0, 0, 0, 0, -2, 4, 0, 5, 0, 5, 6, 0, 0, 0, -1, 0, 1, 0, -1, 0, 0, 0, -2, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 3, 6, 0, 4, 0, 0, 20, 0, 0, 0, 0, 0, 3, -1, 0, 0, 8, 0, 0, 3, -1, 0, 4, 7, -1, 0, 14, 0, 0, 4, 0, 12, 0, 0, 0, 0, -1, 0, 10, 0, 5, 0, 0, 2, 15, 0, 0, -1, 0, -1, 0, -1, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 8, 0, 3, -2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 3, 7, 0, 0, 0, 6, 4, -1, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, -2, 0, 0, -2, 6, 0, 0, 6, 4, 0, 0, 6, 5, 0, 0, 8, 7, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, 1, 0, 2, 1, 0, 0, 0, -1, 6, -2, 0, 0, 0, 0, 0, 8, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 2, 24, 0, 0, 0, 6, -1, 9, 0, 0, 0, 2, 5, 0, -2, 3, 1, -1, 8, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0 };

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1150 = Static186.method3527("(U");

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public static int anInt3511 = 127;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class95 local3 = new Class95();
		local3.anInt3700 = arg1 / 128;
		local3.anInt3716 = arg2 / 128;
		local3.anInt3712 = arg3 / 128;
		local3.anInt3709 = arg4 / 128;
		local3.anInt3715 = arg0;
		local3.anInt3698 = arg1;
		local3.anInt3713 = arg2;
		local3.anInt3711 = arg3;
		local3.anInt3707 = arg4;
		local3.anInt3714 = arg5;
		local3.anInt3705 = arg6;
		Static233.aClass95Array2[Static212.anInt4196++] = local3;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ii;IIIII)V")
	public static void method2828(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt1906 == -1 && arg0.anIntArray170 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3 > arg0.anInt1897) {
			local15 = arg3 - arg0.anInt1897;
		} else if (arg0.anInt1901 > arg3) {
			local15 = arg0.anInt1901 - arg3;
		}
		if (arg4 > arg0.anInt1903) {
			local15 += arg4 - arg0.anInt1903;
		} else if (arg4 < arg0.anInt1908) {
			local15 += arg0.anInt1908 - arg4;
		}
		if (arg0.anInt1899 == 0 || arg0.anInt1899 < local15 - 64 || Static146.anInt3076 == 0 || arg1 != arg0.anInt1905) {
			if (arg0.aClass1_Sub12_Sub4_2 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(arg0.aClass1_Sub12_Sub4_2);
				arg0.aClass1_Sub12_Sub4_2 = null;
			}
			if (arg0.aClass1_Sub12_Sub4_1 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(arg0.aClass1_Sub12_Sub4_1);
				arg0.aClass1_Sub12_Sub4_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(147) int local147 = (arg0.anInt1899 - local15) * Static146.anInt3076 / arg0.anInt1899;
		if (arg0.aClass1_Sub12_Sub4_2 != null) {
			arg0.aClass1_Sub12_Sub4_2.method3063(local147);
		} else if (arg0.anInt1906 >= 0) {
			@Pc(162) Class71 local162 = Static240.method2006(Static38.aClass86_Sub1_6, arg0.anInt1906, 0);
			if (local162 != null) {
				@Pc(169) Class1_Sub15_Sub1 local169 = local162.method2008().method2791(Static225.aClass8_1);
				@Pc(174) Class1_Sub12_Sub4 local174 = Static245.method3066(local169, local147);
				local174.method3041(-1);
				Static226.aClass1_Sub12_Sub1_2.method895(local174);
				arg0.aClass1_Sub12_Sub4_2 = local174;
			}
		}
		if (arg0.aClass1_Sub12_Sub4_1 != null) {
			arg0.aClass1_Sub12_Sub4_1.method3063(local147);
			if (arg0.aClass1_Sub12_Sub4_1.method3529()) {
				return;
			}
			arg0.aClass1_Sub12_Sub4_1 = null;
		} else if (arg0.anIntArray170 != null && (arg0.anInt1895 -= arg2) <= 0) {
			@Pc(214) int local214 = (int) ((double) arg0.anIntArray170.length * Math.random());
			@Pc(222) Class71 local222 = Static240.method2006(Static38.aClass86_Sub1_6, arg0.anIntArray170[local214], 0);
			if (local222 != null) {
				@Pc(229) Class1_Sub15_Sub1 local229 = local222.method2008().method2791(Static225.aClass8_1);
				@Pc(234) Class1_Sub12_Sub4 local234 = Static245.method3066(local229, local147);
				local234.method3041(0);
				Static226.aClass1_Sub12_Sub1_2.method895(local234);
				arg0.aClass1_Sub12_Sub4_1 = local234;
				arg0.anInt1895 = arg0.anInt1898 + (int) (Math.random() * (double) (arg0.anInt1892 - arg0.anInt1898));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method2829() {
		Static73.aClass84_27.method2585();
	}
}
