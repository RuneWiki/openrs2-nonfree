import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_123 = new Class268(17, -1);

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_124 = new Class268(84, 2);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg1 < 0 || arg6 >= Static442.anInt7975 - 1 || Static284.anInt7916 - 1 <= arg1) {
			return;
		}
		if (Static272.aClass97ArrayArrayArray3 == null) {
			return;
		}
		@Pc(39) Interface12 local39;
		if (arg3 == 0) {
			local39 = (Interface12) Static245.method5549(arg0, arg6, arg1);
			@Pc(45) Interface12 local45 = (Interface12) Static646.method6138(arg0, arg6, arg1);
			if (local39 != null && arg5 != 2) {
				if (local39 instanceof Class20_Sub2_Sub1_Sub1) {
					((Class20_Sub2_Sub1_Sub1) local39).aClass269_1.method7018(arg4);
				} else {
					Static116.method1912(arg0, arg4, arg1, arg2, arg3, arg5, local39.method9026(), arg6);
				}
			}
			if (local45 != null) {
				if (!(local45 instanceof Class20_Sub2_Sub1_Sub1)) {
					Static116.method1912(arg0, arg4, arg1, arg2, arg3, arg5, local45.method9026(), arg6);
					return;
				}
				((Class20_Sub2_Sub1_Sub1) local45).aClass269_1.method7018(arg4);
				return;
			}
			return;
		}
		if (arg3 == 1) {
			local39 = (Interface12) Static578.method5708(arg0, arg6, arg1);
			if (local39 != null) {
				if (!(local39 instanceof Class20_Sub2_Sub3_Sub1)) {
					@Pc(116) int local116 = local39.method9026();
					if (arg5 != 4 && arg5 != 5) {
						if (arg5 != 6) {
							if (arg5 == 7) {
								Static116.method1912(arg0, arg4, arg1, (arg2 + 2 & 0x3) + 4, arg3, 4, local116, arg6);
							} else if (arg5 == 8) {
								Static116.method1912(arg0, arg4, arg1, arg2 + 4, arg3, 4, local116, arg6);
								Static116.method1912(arg0, arg4, arg1, (arg2 + 2 & 0x3) + 4, arg3, 4, local116, arg6);
								return;
							}
							return;
						}
						Static116.method1912(arg0, arg4, arg1, arg2 + 4, arg3, 4, local116, arg6);
						return;
					}
					Static116.method1912(arg0, arg4, arg1, arg2, arg3, 4, local116, arg6);
					return;
				}
				((Class20_Sub2_Sub3_Sub1) local39).aClass269_2.method7018(arg4);
				return;
			}
			return;
		}
		if (arg3 != 2) {
			if (arg3 == 3) {
				local39 = (Interface12) Static158.method2999(arg0, arg6, arg1);
				if (local39 != null) {
					if (!(local39 instanceof Class20_Sub2_Sub5_Sub1)) {
						Static116.method1912(arg0, arg4, arg1, arg2, arg3, arg5, local39.method9026(), arg6);
						return;
					}
					((Class20_Sub2_Sub5_Sub1) local39).aClass269_3.method7018(arg4);
					return;
				}
			}
			return;
		}
		local39 = (Interface12) Static366.method5797(arg0, arg6, arg1, jn.class);
		if (local39 == null) {
			return;
		}
		if (arg5 == 11) {
			arg5 = 10;
		}
		if (!(local39 instanceof Class20_Sub2_Sub2_Sub5)) {
			Static116.method1912(arg0, arg4, arg1, arg2, arg3, arg5, local39.method9026(), arg6);
			return;
		}
		((Class20_Sub2_Sub2_Sub5) local39).aClass269_4.method7018(arg4);
		return;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIIII)V")
	public static void method5938(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static350.method5633();
		Static97.aLong47 = 0L;
		@Pc(10) int local10 = Static323.method5374();
		if (arg2 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static162.aClass100_7.method8848()) {
			arg0 = true;
		}
		Static186.method3363(arg3, local10, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public static void method5939() {
		if (Static343.anIntArray404 != null && Static407.anIntArray406 != null) {
			return;
		}
		Static407.anIntArray406 = new int[256];
		Static343.anIntArray404 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static343.anIntArray404[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static407.anIntArray406[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
