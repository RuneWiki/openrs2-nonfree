import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!vf;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static int anInt1907;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!c;")
	public static Class10 aClass10_21;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!od;")
	private static Class60 aClass60_790 = Static41.method597("Sorry invited players only)3");

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!od;")
	private static Class60 aClass60_794 = Static41.method597("Malformed login packet)3");

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_791 = aClass60_794;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
	public static int[] anIntArray220 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	public static int anInt1908 = 0;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
	public static int[] anIntArray221 = new int[4000];

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_792 = aClass60_790;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_793 = Static41.method597("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!cb;")
	public static Class12 aClass12_15 = new Class12(50);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array14 = new Class60[500];

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_795 = Static41.method597("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_796 = aClass60_795;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!rd;IIZI)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub6_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static62.anInt1585 + Static79.anInt1896 & 0x7FF;
		@Pc(20) int local20 = arg3 * arg3 + arg4 * arg4;
		if (local20 > 6400) {
			return;
		}
		@Pc(30) int local30 = Class4_Sub3_Sub6_Sub4.anIntArray301[local12];
		@Pc(38) int local38 = local30 * 256 / (Static116.anInt2717 + 256);
		@Pc(46) int local46 = Class4_Sub3_Sub6_Sub4.anIntArray304[local12];
		@Pc(54) int local54 = local46 * 256 / (Static116.anInt2717 + 256);
		@Pc(65) int local65 = arg4 * local38 + arg3 * local54 >> 16;
		@Pc(76) int local76 = local54 * arg4 - local38 * arg3 >> 16;
		if (local20 > 2500) {
			arg1.method1628(Static5.aClass4_Sub3_Sub6_Sub2_2, local65 + arg2 + 94 + 4 - arg1.anInt2313 / 2, arg0 + 79 + -local76 + -(arg1.anInt2317 / 2));
		} else {
			arg1.method1632(arg2 + local65 + 98 - arg1.anInt2313 / 2, -(arg1.anInt2317 / 2) + -4 + -local76 + arg0 + 83);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
	public static int method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(16) int local16 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local16;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static14.aClass45_1.method982();
		@Pc(12) Class4_Sub23 local12 = null;
		while (local10 != null) {
			if (arg4 == local10.anInt2922 && local10.anInt2916 == arg2 && arg1 == local10.anInt2925 && arg0 == local10.anInt2919) {
				local12 = local10;
				break;
			}
			local10 = (Class4_Sub23) Static14.aClass45_1.method986();
		}
		if (local12 == null) {
			local12 = new Class4_Sub23();
			local12.anInt2916 = arg2;
			local12.anInt2925 = arg1;
			local12.anInt2922 = arg4;
			local12.anInt2919 = arg0;
			Static115.method1869(local12);
			Static14.aClass45_1.method988(local12);
		}
		local12.anInt2920 = arg6;
		local12.anInt2927 = arg8;
		local12.anInt2921 = arg7;
		local12.anInt2915 = arg5;
		local12.anInt2923 = arg3;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1282() {
		aClass60_794 = null;
		aClass10_21 = null;
		aClass60_791 = null;
		anIntArray222 = null;
		aClass60Array14 = null;
		aClass60_792 = null;
		aClass60_795 = null;
		aClass60_790 = null;
		aClass60_796 = null;
		aClass3_1 = null;
		aClass12_15 = null;
		anIntArray220 = null;
		anIntArray221 = null;
		aClass60_793 = null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static14.aClass4_Sub9_Sub1_1.method826(134);
		Static14.aClass4_Sub9_Sub1_1.method781(arg1);
		Static14.aClass4_Sub9_Sub1_1.method786(arg0);
	}
}
