import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
	public static int anInt4657;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
	public static int anInt4658;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_111 = new Class25(97, 6);

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "[I")
	public static final int[] anIntArray403 = new int[500];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)I")
	public static int method3717(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public static void method3718() {
		@Pc(3) Class97[] local3 = Class20.aClass97Array3;
		synchronized (Class20.aClass97Array3) {
			for (@Pc(7) int local7 = 0; local7 < Class20.aClass97Array3.length; local7++) {
				Class20.aClass97Array3[local7] = new Class97();
				Static224.anIntArray346[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBZIII)V")
	public static void method3719(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = Static120.aShort19 + (Static68.aShort6 - Static120.aShort19) * local21 / 100;
		if (local45 < Static35.aShort1) {
			local45 = Static35.aShort1;
		} else if (local45 > Static392.aShort86) {
			local45 = Static392.aShort86;
		}
		@Pc(75) int local75 = local45 * arg0 * 512 / (arg3 * 334);
		@Pc(116) int local116;
		@Pc(123) int local123;
		@Pc(91) short local91;
		if (Static202.aShort42 > local75) {
			local91 = Static202.aShort42;
			local45 = local91 * 334 * arg3 / (arg0 * 512);
			if (Static392.aShort86 < local45) {
				local45 = Static392.aShort86;
				local116 = arg0 * 512 * local45 / (local91 * 334);
				local123 = (arg3 - local116) / 2;
				if (arg1) {
					Static257.aClass75_8.va();
					Static257.aClass75_8.method5996(arg0, arg2, -16777216, arg4, local123);
					Static257.aClass75_8.method5996(arg0, arg2, -16777216, arg4 + arg3 - local123, local123);
				}
				arg3 -= local123 * 2;
				arg4 += local123;
			}
		} else if (local75 > Static263.aShort70) {
			local91 = Static263.aShort70;
			local45 = arg3 * 334 * local91 / (arg0 * 512);
			if (local45 < Static35.aShort1) {
				local45 = Static35.aShort1;
				local116 = local91 * 334 * arg3 / (local45 * 512);
				local123 = (arg0 - local116) / 2;
				if (arg1) {
					Static257.aClass75_8.va();
					Static257.aClass75_8.method5996(local123, arg2, -16777216, arg4, arg3);
					Static257.aClass75_8.method5996(local123, arg0 + arg2 - local123, -16777216, arg4, arg3);
				}
				arg0 -= local123 * 2;
				arg2 += local123;
			}
		}
		Static284.anInt5115 = arg0 * local45 / 334;
		Static85.anInt1428 = arg4;
		Static189.anInt3336 = (short) arg0;
		Static311.anInt5618 = arg2;
		Static6.anInt109 = (short) arg3;
	}
}
