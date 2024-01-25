import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!ha;")
	public static Class12 aClass12_6;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_49 = new Class186(42, 3);

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_50 = new Class186(47, 3);

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_10 = new Class16(1);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)I")
	public static int method3120(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return local21 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method3121(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static72.aBoolean151) {
			try {
				@Pc(18) Class68 local18 = (Class68) Class.forName("Class68_Sub1").getDeclaredConstructor().newInstance();
				local18.method2199(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static72.aBoolean151 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)I")
	public static int method3122() {
		if (Static478.aFrame1 == null) {
			return Static52.aBoolean113 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLclient!ica;Z)V")
	public static void method3124(@OriginalArg(1) Class47_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static267.anInt5167 >= 400) {
			return;
		}
		@Pc(19) Class238 local19 = arg0.aClass238_1;
		if (local19.anIntArray511 != null) {
			local19 = local19.method5866(Static343.aClass286_1);
			if (local19 == null) {
				return;
			}
		}
		if (!local19.aBoolean452) {
			return;
		}
		@Pc(37) String local37 = local19.aString62;
		if (local19.anInt6756 != 0) {
			@Pc(56) String local56 = Static538.aClass37_4 == Static452.aClass37_3 ? Static79.aClass114_45.method3330(Static315.anInt5993) : Static229.aClass114_95.method3330(Static315.anInt5993);
			local37 = local37 + Static224.method3954(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120, local19.anInt6756) + " (" + local56 + local19.anInt6756 + ")";
		}
		if (!Static382.aBoolean440) {
			if (!arg1) {
				@Pc(86) String[] local86 = local19.aStringArray37;
				if (Static13.aBoolean54) {
					local86 = Static292.method4921(local86);
				}
				@Pc(96) int local96;
				if (local86 != null) {
					for (local96 = 4; local96 >= 0; local96--) {
						if (local86[local96] != null && (local19.aByte84 == 0 || !local86[local96].equalsIgnoreCase(Static52.aClass114_25.method3330(Static315.anInt5993)))) {
							@Pc(118) byte local118 = 0;
							if (local96 == 0) {
								local118 = 45;
							}
							@Pc(127) int local127 = Static272.anInt5298;
							if (local96 == 1) {
								local118 = 46;
							}
							if (local96 == 2) {
								local118 = 47;
							}
							if (local96 == 3) {
								local118 = 11;
							}
							if (local19.anInt6784 == local96) {
								local127 = local19.anInt6779;
							}
							if (local96 == 4) {
								local118 = 3;
							}
							if (local96 == local19.anInt6769) {
								local127 = local19.anInt6785;
							}
							Static179.method3455(0, local86[local96].equalsIgnoreCase(Static52.aClass114_25.method3330(Static315.anInt5993)) ? local19.anInt6794 : local127, (long) arg0.anInt5045, true, local118, local86[local96], false, -1, 0, "<col=ffff00>" + local37);
						}
					}
				}
				if (local19.aByte84 == 1 && local86 != null) {
					for (local96 = 4; local96 >= 0; local96--) {
						if (local86[local96] != null && local86[local96].equalsIgnoreCase(Static52.aClass114_25.method3330(Static315.anInt5993))) {
							@Pc(243) short local243 = 0;
							if (local19.anInt6756 > Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120) {
								local243 = 2000;
							}
							@Pc(252) short local252 = 0;
							if (local96 == 0) {
								local252 = 45;
							}
							if (local96 == 1) {
								local252 = 46;
							}
							if (local96 == 2) {
								local252 = 47;
							}
							if (local96 == 3) {
								local252 = 11;
							}
							if (local96 == 4) {
								local252 = 3;
							}
							if (local252 != 0) {
								local252 += local243;
							}
							Static179.method3455(0, local19.anInt6794, (long) arg0.anInt5045, true, local252, local86[local96], false, -1, 0, "<col=ffff00>" + local37);
						}
					}
				}
			}
			Static179.method3455(0, Static169.anInt3695, (long) arg0.anInt5045, true, 1006, Static225.aClass114_92.method3330(Static315.anInt5993), arg1, -1, 0, "<col=ffff00>" + local37);
		} else if (!arg1) {
			@Pc(363) Class134 local363 = Static113.anInt2794 == -1 ? null : Static162.aClass98_11.method3006(Static113.anInt2794);
			if ((Static276.anInt5433 & 0x2) != 0) {
				if (local363 == null || local19.method5870(local363.anInt4335, Static113.anInt2794) != local363.anInt4335) {
					Static179.method3455(0, Static444.anInt7508, (long) arg0.anInt5045, true, 30, Static433.aString72, false, -1, 0, Static469.aString69 + " -> <col=ffff00>" + local37);
				}
				return;
			}
		}
	}
}
