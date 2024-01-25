import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static int anInt8245;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!qn;")
	public static Class291 aClass291_6;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!rda;")
	public static final Class299 aClass299_3 = new Class299("RC", 1);

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	public static int anInt8251 = 0;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_173 = new Class180(51, 6);

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static int anInt8255 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method7229() {
		if (!Static461.aBoolean564) {
			return;
		}
		while (true) {
			while (Static436.anInt6915 < Static665.aClass98_Sub1Array3.length) {
				@Pc(26) Class98_Sub1 local26 = Static665.aClass98_Sub1Array3[Static436.anInt6915];
				if (local26 != null && local26.anInt5513 == -1) {
					if (Static630.aClass3_Sub26_2 == null) {
						Static630.aClass3_Sub26_2 = Static352.aClass42_1.method1154(local26.aString56);
					}
					@Pc(49) int local49 = Static630.aClass3_Sub26_2.anInt3727;
					if (local49 == -1) {
						return;
					}
					Static436.anInt6915++;
					Static630.aClass3_Sub26_2 = null;
					local26.anInt5513 = local49;
				} else {
					Static436.anInt6915++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
	public static void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static7.anInt93 <= arg1 && arg4 <= Static115.anInt2377 && Static374.anInt5986 <= arg2 && Static84.anInt1667 >= arg3) {
			Static89.method1666(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static310.method4733(arg3, arg2, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I")
	public static int method7236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static677.anInt10890 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg0 - Static317.anInt5409;
		@Pc(29) int local29 = arg2 - Static317.anInt5403;
		for (@Pc(34) Class3_Sub18 local34 = (Class3_Sub18) Static317.aClass338_136.method8177(); local34 != null; local34 = (Class3_Sub18) Static317.aClass338_136.method8168()) {
			if (local34.anInt2277 == arg1) {
				@Pc(47) int local47 = local34.anInt2283;
				@Pc(50) int local50 = local34.anInt2278;
				@Pc(62) int local62 = local47 + Static317.anInt5409 << 14 | local50 + Static317.anInt5403;
				@Pc(80) int local80 = (local24 - local47) * (local24 - local47) + (local29 - local50) * (-local50 + local29);
				if (local17 < 0 || local80 < local19) {
					local19 = local80;
					local17 = local62;
				}
			}
		}
		return local17;
	}
}
