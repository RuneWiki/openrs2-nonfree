import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!wu;")
	public static Class380 aClass380_117;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!wm;")
	public static Class376 aClass376_3;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIZ)I")
	public static int method7263(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub8 local12 = Static384.method5147(arg0, false);
		if (local12 == null) {
			return Static517.aClass11_1.method189(arg0).anInt735;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray123.length; local24++) {
			if (local12.anIntArray123[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static517.aClass11_1.method189(arg0).anInt735 - local12.anIntArray123.length;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method7265(@OriginalArg(0) int arg0) {
		Static61.anInt1164 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I")
	public static int method7266() {
		if (Static444.aClass261_9 == null) {
			if (!Static627.aBoolean736 && Static601.aClass2_Sub2_Sub11_4 != null) {
				return Static601.aClass2_Sub2_Sub11_4.anInt4368;
			}
			@Pc(25) int local25 = Static507.aClass335_1.method7811();
			@Pc(29) int local29 = Static507.aClass335_1.method7821();
			@Pc(63) int local63;
			@Pc(65) int local65;
			@Pc(77) int local77;
			@Pc(142) Class2_Sub2_Sub11 local142;
			if (Static187.aBoolean234) {
				@Pc(137) Class304 local137;
				if (local25 > Static46.anInt975 && Static408.anInt6345 + Static46.anInt975 > local25) {
					local63 = -1;
					for (local65 = 0; local65 < Static121.anInt2166; local65++) {
						if (Static500.aBoolean612) {
							local77 = local65 * 16 + Static139.anInt2567 + 33;
							if (local77 - 13 < local29 && local29 <= local77 + 3) {
								local63 = local65;
							}
						} else {
							local77 = Static139.anInt2567 + local65 * 16 + 31;
							if (local77 - 13 < local29 && local77 + 3 >= local29) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local77 = 0;
						local137 = new Class304(Static453.aClass75_10);
						for (@Pc(246) Class2_Sub2_Sub12 local246 = (Class2_Sub2_Sub12) local137.method6885(); local246 != null; local246 = (Class2_Sub2_Sub12) local137.method6886()) {
							if (local63 == local77++) {
								if (local246.anInt4924 == 1) {
									return ((Class2_Sub2_Sub11) local246.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67).anInt4368;
								}
								return -1;
							}
						}
					}
				} else if (Static446.aClass2_Sub2_Sub12_2 != null && local25 > Static621.anInt9974 && Static351.anInt5494 + Static621.anInt9974 > local25) {
					local63 = -1;
					for (local65 = 0; local65 < Static446.aClass2_Sub2_Sub12_2.anInt4924; local65++) {
						if (Static500.aBoolean612) {
							local77 = Static346.anInt5444 + local65 * 16 + 33;
							if (local77 - 13 < local29 && local77 + 3 >= local29) {
								local63 = local65;
							}
						} else {
							local77 = Static346.anInt5444 + local65 * 16 + 31;
							if (local29 > local77 - 13 && local29 <= local77 + 3) {
								local63 = local65;
							}
						}
					}
					if (local63 != -1) {
						local77 = 0;
						local137 = new Class304(Static446.aClass2_Sub2_Sub12_2.aClass75_9);
						for (local142 = (Class2_Sub2_Sub11) local137.method6885(); local142 != null; local142 = (Class2_Sub2_Sub11) local137.method6886()) {
							if (local63 == local77++) {
								return local142.anInt4368;
							}
						}
					}
				}
			} else if (local25 > Static46.anInt975 && local25 < Static408.anInt6345 + Static46.anInt975) {
				local63 = -1;
				for (local65 = 0; local65 < Static474.anInt7600; local65++) {
					if (Static500.aBoolean612) {
						local77 = (Static474.anInt7600 - local65 - 1) * 16 + Static139.anInt2567 + 33;
						if (local29 > local77 - 13 && local77 + 3 >= local29) {
							local63 = local65;
						}
					} else {
						local77 = Static139.anInt2567 + (-local65 + -1 + Static474.anInt7600) * 16 + 31;
						if (local29 > local77 - 13 && local29 <= local77 + 3) {
							local63 = local65;
						}
					}
				}
				if (local63 != -1) {
					local77 = 0;
					@Pc(380) Class140 local380 = new Class140(Static115.aClass109_11);
					for (local142 = (Class2_Sub2_Sub11) local380.method2965(); local142 != null; local142 = (Class2_Sub2_Sub11) local380.method2964()) {
						if (local63 == local77++) {
							return local142.anInt4368;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
	public static void method7267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static128.method1807(arg0, arg3, arg1, arg2);
		} else if (Static379.anInt5914 <= arg2 - arg3 && Static624.anInt10032 >= arg2 + arg3 && arg0 - arg4 >= Static257.anInt4068 && arg4 + arg0 <= Static67.anInt1214) {
			Static217.method2982(arg4, arg2, arg1, arg3, arg0);
		} else {
			Static640.method8598(arg3, arg1, arg4, arg2, arg0);
		}
	}
}
