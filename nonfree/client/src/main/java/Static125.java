import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_74 = new Class151("K", "T", "K", "K");

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "[I")
	public static final int[] anIntArray102 = new int[32];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIIII)V")
	public static void method1722(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(29) int local29 = arg1 - 334;
		if (local29 < 0) {
			local29 = 0;
		} else if (local29 > 100) {
			local29 = 100;
		}
		@Pc(53) int local53 = local29 * (Static411.aShort89 - Static154.aShort66) / 100 + Static154.aShort66;
		if (Static195.aShort32 > local53) {
			local53 = Static195.aShort32;
		} else if (local53 > Static108.aShort14) {
			local53 = Static108.aShort14;
		}
		@Pc(75) int local75 = local53 * 512 * arg1 / (arg3 * 334);
		@Pc(105) int local105;
		@Pc(112) int local112;
		@Pc(80) short local80;
		if (local75 < Static168.aShort31) {
			local80 = Static168.aShort31;
			local53 = local80 * arg3 * 334 / (arg1 * 512);
			if (local53 > Static108.aShort14) {
				local53 = Static108.aShort14;
				local105 = local53 * arg1 * 512 / (local80 * 334);
				local112 = (arg3 - local105) / 2;
				if (arg0) {
					Static213.aClass128_22.va();
					Static213.aClass128_22.method3580(arg4, arg2, arg1, -16777216, local112);
					Static213.aClass128_22.method3580(arg4, arg3 + arg2 - local112, arg1, -16777216, local112);
				}
				arg3 -= local112 * 2;
				arg2 += local112;
			}
		} else if (Static112.aShort15 < local75) {
			local80 = Static112.aShort15;
			local53 = local80 * arg3 * 334 / (arg1 * 512);
			if (Static195.aShort32 > local53) {
				local53 = Static195.aShort32;
				local105 = arg3 * 334 * local80 / (local53 * 512);
				local112 = (arg1 - local105) / 2;
				if (arg0) {
					Static213.aClass128_22.va();
					Static213.aClass128_22.method3580(arg4, arg2, local112, -16777216, arg3);
					Static213.aClass128_22.method3580(arg4 + arg1 - local112, arg2, local112, -16777216, arg3);
				}
				arg1 -= local112 * 2;
				arg4 += local112;
			}
		}
		Static248.anInt4064 = arg2;
		Static226.anInt5821 = (short) arg1;
		Static162.anInt2668 = (short) arg3;
		Static430.anInt7184 = arg4;
		Static320.anInt5290 = local53 * arg1 / 334;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method1725(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static80.aBoolean114) {
			try {
				@Pc(23) Class83 local23 = (Class83) Class.forName("Class83_Sub1").getDeclaredConstructor().newInstance();
				local23.method3900(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static80.aBoolean114 = true;
			}
		}
		return arg0;
	}
}
