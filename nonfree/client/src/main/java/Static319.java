import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
	public static int anInt5969;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_1 = new Class117(14, 1);

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_2 = new Class117(15, 4);

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_3 = new Class117(16, -2);

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_4 = new Class117(17, 0);

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_5 = new Class117(18, -2);

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_6 = new Class117(19, -2);

	@OriginalMember(owner = "client!nda", name = "m", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_7 = new Class117(20, 6);

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_8 = new Class117(21, 9);

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_9 = new Class117(22, -2);

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_10 = new Class117(23, 4);

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_11 = new Class117(24, -1);

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_12 = new Class117(25, -2);

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_13 = new Class117(26, 0);

	@OriginalMember(owner = "client!nda", name = "t", descriptor = "Lclient!hh;")
	public static final Class117 aClass117_14 = new Class117(27, 0);

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
	public static int anInt5968 = 0;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5091(@OriginalArg(1) Class39 arg0) {
		if (Static452.aBoolean600) {
			Static184.method3039(arg0);
		} else {
			Static421.method6557(arg0);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ID)V")
	public static void method5092(@OriginalArg(1) double arg0) {
		if (arg0 == Static42.aDouble1) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static112.anIntArray234[local11] = local23 <= 255 ? local23 : 255;
		}
		Static42.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class132[] local3 = Static286.aClass132Array1;
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			@Pc(17) Class132 local17 = local3[local11];
			if (local17 != null && local17.anInt3729 == 2) {
				Static487.method7225(arg2 >> 1, arg1 >> 1, local17.anInt3724, local17.anInt3728, local17.anInt3725 * 2, local17.anInt3726);
				if (Static429.anIntArray610[0] > -1 && Static115.anInt2326 % 20 < 10) {
					Static282.aClass35Array27[local17.anInt3727].method7351(Static429.anIntArray610[0] + arg3 - 12, arg0 + -28 + Static429.anIntArray610[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)I")
	public static int method5095(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZIZZI)I")
	public static int method5096(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class2_Sub16 local10 = Static218.method3456(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray128.length; local18++) {
			if (local10.anIntArray128[local18] >= 0 && local10.anIntArray128[local18] < Static464.aClass115_1.anInt3310) {
				@Pc(46) Class300 local46 = Static464.aClass115_1.method2970(local10.anIntArray128[local18]);
				@Pc(56) int local56 = local46.method7473(arg2, Static66.aClass247_1.method6470(arg2).anInt2133);
				if (arg0) {
					local16 += local10.anIntArray129[local18] * local56;
				} else {
					local16 += local56;
				}
			}
		}
		return local16;
	}
}
