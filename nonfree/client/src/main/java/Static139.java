import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
	public static int anInt2304;

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
	public static int anInt2302 = -1;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_25 = new Class181(24, 2);

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIBII)V")
	public static void method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg0 - arg4;
		@Pc(20) int local20 = arg3 - arg2;
		if (local15 == 0) {
			if (local20 != 0) {
				Static124.method8854(arg3, arg4, arg1, arg2);
			}
		} else if (local20 == 0) {
			Static635.method8769(arg4, arg2, arg1, arg0);
		} else {
			@Pc(55) int local55 = (local20 << 12) / local15;
			@Pc(64) int local64 = arg2 - (arg4 * local55 >> 12);
			@Pc(88) int local88;
			@Pc(86) int local86;
			if (arg0 < Static514.anInt8603) {
				local86 = (local55 * Static514.anInt8603 >> 12) + local64;
				local88 = Static514.anInt8603;
			} else if (arg0 > Static487.anInt8320) {
				local86 = (local55 * Static487.anInt8320 >> 12) + local64;
				local88 = Static487.anInt8320;
			} else {
				local88 = arg0;
				local86 = arg3;
			}
			@Pc(119) int local119;
			@Pc(117) int local117;
			if (arg4 < Static514.anInt8603) {
				local117 = (local55 * Static514.anInt8603 >> 12) + local64;
				local119 = Static514.anInt8603;
			} else if (Static487.anInt8320 >= arg4) {
				local119 = arg4;
				local117 = arg2;
			} else {
				local119 = Static487.anInt8320;
				local117 = local64 + (local55 * Static487.anInt8320 >> 12);
			}
			if (local117 < Static304.anInt4824) {
				local119 = (Static304.anInt4824 - local64 << 12) / local55;
				local117 = Static304.anInt4824;
			} else if (Static231.anInt3977 < local117) {
				local119 = (Static231.anInt3977 - local64 << 12) / local55;
				local117 = Static231.anInt3977;
			}
			if (local86 < Static304.anInt4824) {
				local88 = (Static304.anInt4824 - local64 << 12) / local55;
				local86 = Static304.anInt4824;
			} else if (Static231.anInt3977 < local86) {
				local88 = (Static231.anInt3977 - local64 << 12) / local55;
				local86 = Static231.anInt3977;
			}
			Static154.method2234(local117, local88, arg1, local86, local119);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)Z")
	public static boolean method2090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V")
	public static void method2091(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub4_Sub13 local13 = Static506.method2916(arg0, 1);
		local13.method4132();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!kf;)V")
	public static void method2092(@OriginalArg(0) Class14_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class14_Sub1 local7 = null;
			for (@Pc(11) Class14_Sub1 local11 = Static250.aClass14_Sub1Array2[local4]; local11 != null; local11 = local11.aClass14_Sub1_22) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static250.aClass14_Sub1Array2[local4] = local11.aClass14_Sub1_22;
					} else {
						local7.aClass14_Sub1_22 = local11.aClass14_Sub1_22;
					}
					Static367.aBoolean541 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class14_Sub1 local43 = Static151.aClass14_Sub1Array1[local4]; local43 != null; local43 = local43.aClass14_Sub1_22) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static151.aClass14_Sub1Array1[local4] = local43.aClass14_Sub1_22;
					} else {
						local7.aClass14_Sub1_22 = local43.aClass14_Sub1_22;
					}
					Static367.aBoolean541 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class14_Sub1 local75 = Static469.aClass14_Sub1Array5[local4]; local75 != null; local75 = local75.aClass14_Sub1_22) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static469.aClass14_Sub1Array5[local4] = local75.aClass14_Sub1_22;
					} else {
						local7.aClass14_Sub1_22 = local75.aClass14_Sub1_22;
					}
					Static367.aBoolean541 = true;
					return;
				}
				local7 = local75;
			}
		}
	}
}
