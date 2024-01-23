import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!lj", name = "S", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lj", name = "U", descriptor = "Z")
	public static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_863 = Static186.method3527("(Z");

	@OriginalMember(owner = "client!lj", name = "fb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_865 = Static186.method3527("Use");

	@OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_864 = aClass50_865;

	@OriginalMember(owner = "client!lj", name = "gb", descriptor = "Lclient!oj;")
	public static Class84 aClass84_23 = new Class84(100);

	@OriginalMember(owner = "client!lj", name = "hb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_866 = Static186.method3527("unzap");

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)Lclient!hh;")
	public static Class50 method2000(@OriginalArg(1) int arg0) {
		return Static17.method257(new Class50[] { Static160.method2684(arg0 >> 24 & 0xFF), Static129.aClass50_892, Static160.method2684(arg0 >> 16 & 0xFF), Static129.aClass50_892, Static160.method2684(arg0 >> 8 & 0xFF), Static129.aClass50_892, Static160.method2684(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!pa;ILclient!pa;)I")
	public static int method2002(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3322(Static69.anInt1314)) {
			local5++;
		}
		if (arg1.method3322(Static58.anInt1159)) {
			local5++;
		}
		if (arg1.method3322(Static12.anInt235)) {
			local5++;
		}
		if (arg0.method3322(Static69.anInt1314)) {
			local5++;
		}
		if (arg0.method3322(Static58.anInt1159)) {
			local5++;
		}
		if (arg0.method3322(Static12.anInt235)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILclient!oh;Lclient!qh;ILclient!oh;I)V")
	public static void method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub10 arg2, @OriginalArg(4) Class93 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub1_Sub10 arg5, @OriginalArg(7) int arg6) {
		Static151.anInt3153 = arg0;
		Static80.anInt1585 = arg1;
		Static143.aClass93_85 = arg3;
		Static19.anInt398 = arg6;
		Static104.anInt2081 = arg4;
		if (Static140.aClass73_1 != null) {
			return;
		}
		Static164.aBoolean142 = true;
		if (Static200.aClass1_Sub1_Sub8Array8 == null) {
			Static200.aClass1_Sub1_Sub8Array8 = Static231.method3484(Static141.aClass86_Sub1_33, Static35.anInt744);
		}
		if (Static212.aClass78Array8 == null) {
			Static212.aClass78Array8 = Static117.method1864(Static141.aClass86_Sub1_33, Static23.anInt466);
		}
		if (Static82.aClass78Array2 == null) {
			Static82.aClass78Array2 = Static117.method1864(Static141.aClass86_Sub1_33, Static206.anInt4118);
		}
		if (Static155.aClass78Array5 == null) {
			Static155.aClass78Array5 = Static117.method1864(Static141.aClass86_Sub1_33, Static147.anInt3083);
		}
		@Pc(64) int local64 = Static80.anInt1585 / 5;
		@Pc(70) int local70 = Static80.anInt1585 / 5 * 4;
		Static29.method401(Static104.anInt2081, Static151.anInt3153, Static80.anInt1585, Static19.anInt398, 0, 168);
		Static29.method410(Static104.anInt2081, Static151.anInt3153, local64, 23, 12425273, 9135624);
		Static29.method410(local64 + Static104.anInt2081, Static151.anInt3153, local70, 23, 5197647, 2697513);
		arg5.method1826(Static186.aClass50_1430, Static104.anInt2081 + local64 / 2, Static151.anInt3153 + 15, 0, -1);
		if (Static155.aClass78Array5 != null) {
			Static155.aClass78Array5[1].method3017(local64 + Static104.anInt2081 + 2, Static151.anInt3153 + 1);
			arg2.method1834(Static165.aClass50_901, Static104.anInt2081 + local64 + 12, Static151.anInt3153 + 10, 16777215, -1);
			Static155.aClass78Array5[0].method3017(Static104.anInt2081 + local64 + 2, Static151.anInt3153 - -12);
			arg2.method1834(Static187.aClass50_1245, Static104.anInt2081 + local64 + 12, Static151.anInt3153 - -21, 16777215, -1);
		}
		@Pc(333) int local333;
		@Pc(415) int local415;
		if (Static82.aClass78Array2 != null) {
			@Pc(168) int local168 = local64 + Static104.anInt2081 + 140;
			if (Static221.anIntArray497[0] == 0 && Static175.anIntArray396[0] == 0) {
				Static82.aClass78Array2[2].method3017(local168, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[0].method3017(local168, Static151.anInt3153 + 4);
			}
			if (Static221.anIntArray497[0] == 0 && Static175.anIntArray396[0] == 1) {
				Static82.aClass78Array2[3].method3017(local168 + 15, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[1].method3017(local168 + 15, Static151.anInt3153 + 4);
			}
			arg5.method1834(Static128.aClass50_889, local168 + 32, Static151.anInt3153 - -17, 16777215, -1);
			@Pc(248) int local248 = Static104.anInt2081 + local64 + 250;
			if (Static221.anIntArray497[0] == 1 && Static175.anIntArray396[0] == 0) {
				Static82.aClass78Array2[2].method3017(local248, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[0].method3017(local248, Static151.anInt3153 + 4);
			}
			if (Static221.anIntArray497[0] == 1 && Static175.anIntArray396[0] == 1) {
				Static82.aClass78Array2[3].method3017(local248 + 15, Static151.anInt3153 - -4);
			} else {
				Static82.aClass78Array2[1].method3017(local248 + 15, Static151.anInt3153 + 4);
			}
			arg5.method1834(Static64.aClass50_468, local248 + 32, Static151.anInt3153 + 17, 16777215, -1);
			local333 = local64 + Static104.anInt2081 + 360;
			if (Static221.anIntArray497[0] == 2 && Static175.anIntArray396[0] == 0) {
				Static82.aClass78Array2[2].method3017(local333, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[0].method3017(local333, Static151.anInt3153 + 4);
			}
			if (Static221.anIntArray497[0] == 2 && Static175.anIntArray396[0] == 1) {
				Static82.aClass78Array2[3].method3017(local333 + 15, Static151.anInt3153 - -4);
			} else {
				Static82.aClass78Array2[1].method3017(local333 + 15, Static151.anInt3153 + 4);
			}
			arg5.method1834(Static166.aClass50_1112, local333 + 32, Static151.anInt3153 - -17, 16777215, -1);
			local415 = Static104.anInt2081 + local64 + 470;
			if (Static221.anIntArray497[0] == 3 && Static175.anIntArray396[0] == 0) {
				Static82.aClass78Array2[2].method3017(local415, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[0].method3017(local415, Static151.anInt3153 + 4);
			}
			if (Static221.anIntArray497[0] == 3 && Static175.anIntArray396[0] == 1) {
				Static82.aClass78Array2[3].method3017(local415 + 15, Static151.anInt3153 + 4);
			} else {
				Static82.aClass78Array2[1].method3017(local415 + 15, Static151.anInt3153 + 4);
			}
			arg5.method1834(Static194.aClass50_1268, local415 + 32, Static151.anInt3153 + 17, 16777215, -1);
		}
		Static29.method423(Static80.anInt1585 - 10 - 58, Static151.anInt3153 + 4, 58, 16, 0);
		Static107.anInt2133 = -1;
		if (Static200.aClass1_Sub1_Sub8Array8 == null) {
			return;
		}
		local333 = Static80.anInt1585 / 89;
		local415 = (Static19.anInt398 - 23) / 20;
		@Pc(540) int local540;
		@Pc(526) int local526;
		do {
			local526 = local333;
			if (Static97.anInt1980 <= local415 * (local333 - 1)) {
				local333--;
			}
			local540 = local415;
			if ((local415 - 1) * local333 >= Static97.anInt1980) {
				local415--;
			}
			if (Static97.anInt1980 <= (local415 - 1) * local333) {
				local415--;
			}
		} while (local415 != local540 || local333 != local526);
		local540 = (Static80.anInt1585 - local333 * 88) / (local333 + 1);
		local526 = (Static19.anInt398 - local415 * 19 - 23) / (local415 - -1);
		if (local526 > 5) {
			local526 = 5;
		}
		@Pc(607) int local607 = 0;
		if (local540 > 5) {
			local540 = 5;
		}
		@Pc(631) int local631 = (Static19.anInt398 - (local415 - 1) * local526 - local415 * 19 - 23) / 2;
		@Pc(635) int local635 = local631 + 23;
		@Pc(651) int local651 = (Static80.anInt1585 - local540 * (local333 - 1) - local333 * 88) / 2;
		@Pc(653) int local653 = local651;
		for (@Pc(655) int local655 = 0; local655 < Static97.anInt1980; local655++) {
			@Pc(661) Class106 local661 = Static53.aClass106Array1[local655];
			@Pc(666) Class50 local666 = Static160.method2684(local661.anInt3932);
			@Pc(668) boolean local668 = true;
			if (local661.anInt3932 == -1) {
				local666 = Static101.aClass50_666;
				local668 = false;
			} else if (local661.anInt3932 > 1980) {
				local668 = false;
				local666 = Static43.aClass50_328;
			}
			if (Static117.anInt2301 >= local653 && local635 <= Static110.anInt2205 && local653 + 88 > Static117.anInt2301 && Static110.anInt2205 < local635 + 19 && local668) {
				Static107.anInt2133 = local655;
				Static200.aClass1_Sub1_Sub8Array8[local661.aBoolean184 ? 1 : 0].method2423(Static104.anInt2081 + local653, Static151.anInt3153 + local635);
			} else {
				Static200.aClass1_Sub1_Sub8Array8[local661.aBoolean184 ? 1 : 0].method2417(Static104.anInt2081 + local653, local635 + Static151.anInt3153);
			}
			if (Static212.aClass78Array8 != null) {
				Static212.aClass78Array8[(local661.aBoolean184 ? Static212.aClass78Array8.length / 2 : 0) + local661.anInt3929].method3017(Static104.anInt2081 + local653 + 29, Static151.anInt3153 + local635);
			}
			arg5.method1826(Static160.method2684(local661.anInt3934), Static104.anInt2081 + local653 + 15, local635 + (Static151.anInt3153 - -9) + 5, 0, -1);
			arg2.method1826(local666, Static104.anInt2081 + local653 + 60, 5 + 9 + local635 + Static151.anInt3153, 268435455, -1);
			local635 += local526 + 19;
			@Pc(825) int local825 = ~local415;
			local607++;
			if (local825 >= ~local607) {
				local653 += local540 + 88;
				local607 = 0;
				local635 = local631 + 23;
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)I")
	public static int method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(47) int local47 = Static138.method2298(arg1 - 1, arg0 + -1) + Static138.method2298(arg1 - 1, arg0 + 1) + Static138.method2298(arg1 + 1, arg0 - 1) + Static138.method2298(arg1 - -1, arg0 + 1);
		@Pc(77) int local77 = Static138.method2298(arg1, arg0 - 1) + Static138.method2298(arg1, arg0 + 1) + Static138.method2298(arg1 - 1, arg0) + Static138.method2298(arg1 + 1, arg0);
		@Pc(82) int local82 = Static138.method2298(arg1, arg0);
		return local77 / 8 + local47 / 16 + local82 / 4;
	}
}
