import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1423 = Static161.method2452("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1424 = Static161.method2452(" loggt sich ein)3");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method2880() {
		@Pc(3) int local3 = Static218.anInt4221;
		@Pc(9) int local9 = Static8.anInt207;
		@Pc(11) int local11 = Static198.anInt3862;
		@Pc(13) int local13 = Static130.anInt2714;
		Static42.method824(local3, local9, local13, local11, 6116423);
		Static42.method824(local3 + 1, local9 + 1, local13 - 2, 16, 0);
		Static42.method817(local3 + 1, local9 + 18, local13 - 2, local11 + -19, 0);
		Static30.aClass5_Sub2_Sub8_1.method1334(Static118.aClass20_1208, local3 + 3, local9 + 14, 6116423, -1);
		@Pc(60) int local60 = Static70.anInt1549;
		@Pc(62) int local62 = Static207.anInt4069;
		for (@Pc(64) int local64 = 0; local64 < Static85.anInt1879; local64++) {
			@Pc(80) int local80 = local9 + (Static85.anInt1879 - local64 - 1) * 15 + 31;
			@Pc(82) int local82 = 16777215;
			if (local3 < local60 && local60 < local13 + local3 && local80 - 13 < local62 && local80 + 3 > local62) {
				local82 = 16776960;
			}
			Static30.aClass5_Sub2_Sub8_1.method1334(Static169.method2576(local64), local3 + 3, local80, local82, 0);
		}
		Static10.method208(Static218.anInt4221, Static130.anInt2714, Static198.anInt3862, Static8.anInt207);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!dc;ZLclient!dc;Lclient!wa;)[Lclient!ji;")
	public static Class5_Sub2_Sub10[] method2882(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class23 arg2) {
		@Pc(13) int local13 = arg2.method734(arg0);
		@Pc(19) int local19 = arg2.method737(arg1, local13);
		return method2884(local13, arg2, local19);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!mf;)Lclient!dc;")
	public static Class20 method2883(@OriginalArg(1) Class69 arg0) {
		if (Static145.method2238(Static94.method1538(arg0)) == 0) {
			return null;
		} else if (arg0.aClass20_915 == null || arg0.aClass20_915.method580().method582() == 0) {
			return Static148.aBoolean130 ? Static207.aClass20_1507 : null;
		} else {
			return arg0.aClass20_915;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!wa;II)[Lclient!ji;")
	public static Class5_Sub2_Sub10[] method2884(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2) {
		return Static167.method2532(arg1, arg0, arg2) ? Static49.method880() : null;
	}
}
