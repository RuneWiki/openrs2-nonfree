import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!da", name = "b", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_233 = Static151.method2243("Unable to connect)3");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!mb;")
	public static Class62 aClass62_230 = aClass62_233;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_231 = Static151.method2243("(U");

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_232 = Static151.method2243("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!mb;")
	public static Class62 aClass62_234 = aClass62_233;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_235 = Static151.method2243("Clientscript error in: ");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ii;BIII)V")
	public static void method535(@OriginalArg(0) Class47 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt182 >= 3) {
			Static212.method3099(arg3, arg1, arg0.anIntArray171, arg0.anIntArray168);
		} else {
			((Class2_Sub1_Sub2_Sub1) Static194.aClass2_Sub1_Sub2_4).method287(arg3, arg1, arg0.anInt1910, arg0.anInt1858, Static194.aClass2_Sub1_Sub2_4.anInt403 / 2, Static194.aClass2_Sub1_Sub2_4.anInt401 / 2, Static203.anInt4219, arg0.anIntArray171, arg0.anIntArray168);
		}
		Static32.aBooleanArray3[arg2] = true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILclient!mf;IJZ)Z")
	public static boolean method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static112.method1716(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIILclient!og;)V")
	public static void method537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub2_Sub2 arg2) {
		if (arg2.anInt3062 == arg1 && arg1 != -1) {
			@Pc(85) Class2_Sub1_Sub25 local85 = Static90.method27(arg1);
			@Pc(88) int local88 = local85.anInt4373;
			if (local88 == 1) {
				arg2.anInt3055 = 0;
				arg2.anInt3066 = 0;
				arg2.anInt3075 = arg0;
				arg2.anInt3044 = 0;
				Static153.method2281(arg2.anInt3066, local85, arg2.anInt3046, arg2 == Static186.aClass7_Sub2_Sub2_1, arg2.anInt3085);
			}
			if (local88 == 2) {
				arg2.anInt3044 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3062 == -1 || Static90.method27(arg1).anInt4372 >= Static90.method27(arg2.anInt3062).anInt4372) {
			arg2.anInt3075 = arg0;
			arg2.anInt3044 = 0;
			arg2.anInt3062 = arg1;
			arg2.anInt3055 = 0;
			arg2.anInt3066 = 0;
			arg2.anInt3086 = arg2.anInt3064;
			if (arg2.anInt3062 != -1) {
				Static153.method2281(arg2.anInt3066, Static90.method27(arg2.anInt3062), arg2.anInt3046, Static186.aClass7_Sub2_Sub2_1 == arg2, arg2.anInt3085);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!kd;)Lclient!di;")
	public static Class2_Sub4 method539(@OriginalArg(1) Class2_Sub11 arg0) {
		arg0.method1534();
		@Pc(9) int local9 = arg0.method1534();
		@Pc(13) Class2_Sub4 local13 = Static41.method3189(local9);
		local13.anInt4442 = arg0.method1534();
		@Pc(26) int local26 = arg0.method1534();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(43) int local43 = arg0.method1534();
			local13.method3120(local43, arg0);
		}
		local13.method3133();
		return local13;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)I")
	public static int method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg0;
		return ((arg2 & 0xFF00) * arg0 + (arg1 & 0xFF00) * local8 & 0xFF0000) + (local8 * (arg1 & 0xFF00FF) + ((arg2 & 0xFF00FF) * arg0) & 0xFF00FF00) >> 8;
	}
}
