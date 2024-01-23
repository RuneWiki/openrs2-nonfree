import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!il", name = "X", descriptor = "[Lclient!fj;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!il", name = "bb", descriptor = "Lclient!kb;")
	public static Class83 aClass83_81;

	@OriginalMember(owner = "client!il", name = "Y", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!il", name = "ab", descriptor = "Z")
	public static boolean aBoolean141 = true;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V")
	public static void method1957() {
		if (Static219.anInt4901 != -1) {
			Static202.method3586(-1, Static219.anInt4901, -1);
			Static219.anInt4901 = -1;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIILclient!c;I)V")
	public static void method1958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static239.aClass25_Sub1_Sub1_2 == arg2 || Static111.anInt2398 >= 400) {
			return;
		}
		@Pc(36) String local36;
		if (arg2.anInt739 == 0) {
			@Pc(40) boolean local40 = true;
			if (Static239.aClass25_Sub1_Sub1_2.anInt716 != -1 && arg2.anInt716 != -1) {
				@Pc(64) int local64 = Static239.aClass25_Sub1_Sub1_2.anInt715 > arg2.anInt715 ? Static239.aClass25_Sub1_Sub1_2.anInt715 : arg2.anInt715;
				@Pc(79) int local79 = arg2.anInt716 <= Static239.aClass25_Sub1_Sub1_2.anInt716 ? arg2.anInt716 : Static239.aClass25_Sub1_Sub1_2.anInt716;
				@Pc(90) int local90 = local79 + local64 * 10 / 100 + 5;
				@Pc(97) int local97 = Static239.aClass25_Sub1_Sub1_2.anInt715 - arg2.anInt715;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local90 < local97) {
					local40 = false;
				}
			}
			@Pc(119) String local119 = Static230.anInt5101 == 1 ? Static234.aString163 : Static226.aString155;
			if (arg2.anInt715 >= arg2.anInt722) {
				local36 = arg2.method498() + (local40 ? Static53.method1079(arg2.anInt715, Static239.aClass25_Sub1_Sub1_2.anInt715) : "<col=ffffff>") + " (" + local119 + arg2.anInt715 + ")";
			} else {
				local36 = arg2.method498() + (local40 ? Static53.method1079(arg2.anInt715, Static239.aClass25_Sub1_Sub1_2.anInt715) : "<col=ffffff>") + " (" + local119 + arg2.anInt715 + "+" + (arg2.anInt722 - arg2.anInt715) + ")";
			}
		} else {
			local36 = arg2.method498() + " (" + Static180.aString118 + arg2.anInt739 + ")";
		}
		@Pc(206) int local206;
		if (Static272.anInt5854 == 1) {
			Static106.method1718(Static180.anInt4069, (short) 34, arg3, arg0, Static95.aString70 + " -> <col=ffffff>" + local36, Static5.aString3, (long) arg1);
		} else if (!Static16.aBoolean22) {
			for (local206 = 7; local206 >= 0; local206--) {
				if (Static122.aStringArray13[local206] != null) {
					@Pc(215) short local215 = 0;
					if (Static230.anInt5101 == 0 && Static122.aStringArray13[local206].equalsIgnoreCase(Static167.aString111)) {
						if (arg2.anInt715 > Static239.aClass25_Sub1_Sub1_2.anInt715) {
							local215 = 2000;
						}
						if (Static239.aClass25_Sub1_Sub1_2.anInt713 != 0 && arg2.anInt713 != 0) {
							if (Static239.aClass25_Sub1_Sub1_2.anInt713 == arg2.anInt713) {
								local215 = 2000;
							} else {
								local215 = 0;
							}
						}
					} else if (Static148.aBooleanArray15[local206]) {
						local215 = 2000;
					}
					@Pc(274) short local274 = Static258.aShortArray88[local206];
					@Pc(279) short local279 = (short) (local274 + local215);
					Static106.method1718(Static204.anIntArray465[local206], local279, arg3, arg0, "<col=ffffff>" + local36, Static122.aStringArray13[local206], (long) arg1);
				}
			}
		} else if ((Static177.anInt3986 & 0x8) != 0) {
			Static106.method1718(Static266.anInt5785, (short) 18, arg3, arg0, Static128.aString80 + " -> <col=ffffff>" + local36, Static280.aString193, (long) arg1);
		}
		for (local206 = 0; local206 < Static111.anInt2398; local206++) {
			if (Static213.aShortArray71[local206] == 29) {
				Static24.aStringArray3[local206] = "<col=ffffff>" + local36;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method1959(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static193.method3424(arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(CI)Z")
	public static boolean method1960(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method1961(@OriginalArg(0) Class83 arg0) {
		Static8.aClass83_134 = arg0;
	}
}
