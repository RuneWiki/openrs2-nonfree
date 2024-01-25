import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lclient!aca;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ar;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt2048 = -1;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class285 method1701(@OriginalArg(0) int arg0) {
		@Pc(8) Class285[] local8 = Static288.method4082();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class285 local21 = local8[local10];
			if (local21.anInt6995 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method1702() {
		if (Static132.aString32.toLowerCase().indexOf("microsoft") != -1) {
			Static211.anIntArray257[188] = 71;
			Static211.anIntArray257[219] = 42;
			Static211.anIntArray257[221] = 43;
			Static211.anIntArray257[190] = 72;
			Static211.anIntArray257[186] = 57;
			Static211.anIntArray257[192] = 58;
			Static211.anIntArray257[220] = 74;
			Static211.anIntArray257[223] = 28;
			Static211.anIntArray257[191] = 73;
			Static211.anIntArray257[222] = 59;
			Static211.anIntArray257[189] = 26;
			Static211.anIntArray257[187] = 27;
			return;
		}
		Static211.anIntArray257[44] = 71;
		Static211.anIntArray257[93] = 43;
		Static211.anIntArray257[46] = 72;
		Static211.anIntArray257[59] = 57;
		Static211.anIntArray257[92] = 74;
		Static211.anIntArray257[45] = 26;
		Static211.anIntArray257[91] = 42;
		Static211.anIntArray257[47] = 73;
		Static211.anIntArray257[61] = 27;
		if (Static132.aMethod1 == null) {
			Static211.anIntArray257[192] = 58;
			Static211.anIntArray257[222] = 59;
		} else {
			Static211.anIntArray257[192] = 28;
			Static211.anIntArray257[520] = 59;
			Static211.anIntArray257[222] = 58;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1704(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub2_Sub18 local10 = Static508.method6607(arg1, 2);
		local10.method6227();
		local10.aString118 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!mq;B)V")
	public static void method1705(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg1) {
		if (Static484.anInt7715 >= 400) {
			return;
		}
		if (arg1 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30) {
			@Pc(176) String local176;
			@Pc(108) int local108;
			if (arg1.anInt5829 == 0) {
				@Pc(62) boolean local62 = true;
				if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5825 != -1 && arg1.anInt5825 != -1) {
					@Pc(87) int local87 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822 <= arg1.anInt5822 ? arg1.anInt5822 : Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822;
					@Pc(98) int local98 = arg1.anInt5825 > Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5825 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5825 : arg1.anInt5825;
					local108 = local98 + local87 * 10 / 100 + 5;
					@Pc(114) int local114 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822 - arg1.anInt5822;
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local114 > local108) {
						local62 = false;
					}
				}
				@Pc(141) String local141 = Static18.aClass308_7 == Static283.aClass308_10 ? Static229.aClass159_32.method2776(Static261.anInt4297) : Static229.aClass159_30.method2776(Static261.anInt4297);
				if (arg1.anInt5800 <= arg1.anInt5822) {
					local176 = arg1.method4906() + (local62 ? Static149.method2056(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822, arg1.anInt5822) : "<col=ffffff>") + " (" + local141 + arg1.anInt5822 + ")";
				} else {
					local176 = arg1.method4906() + (local62 ? Static149.method2056(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822, arg1.anInt5822) : "<col=ffffff>") + " (" + local141 + arg1.anInt5822 + "+" + (arg1.anInt5800 - arg1.anInt5822) + ")";
				}
			} else if (arg1.anInt5829 == -1) {
				local176 = arg1.method4906();
			} else {
				local176 = arg1.method4906() + " (" + Static229.aClass159_31.method2776(Static261.anInt4297) + arg1.anInt5829 + ")";
			}
			if (Static355.aBoolean473 && !arg0 && (Static277.anInt4787 & 0x8) != 0) {
				Static438.method5750(Static434.aString105, 0, 59, (long) arg1.anInt8406, 0, Static196.aString39 + " -> <col=ffffff>" + local176, false, -1, Static251.anInt4193, true);
			}
			if (arg0) {
				Static438.method5750("<col=cccccc>" + local176, 0, -1, 0L, 0, "", true, 0, -1, false);
			} else {
				for (@Pc(312) int local312 = 7; local312 >= 0; local312--) {
					if (Static14.aStringArray4[local312] != null) {
						@Pc(320) short local320 = 0;
						if (Static18.aClass308_7 == Static278.aClass308_6 && Static14.aStringArray4[local312].equalsIgnoreCase(Static229.aClass159_25.method2776(Static261.anInt4297))) {
							if (arg1.anInt5822 > Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822) {
								local320 = 2000;
							}
							if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5806 != 0 && arg1.anInt5806 != 0) {
								if (arg1.anInt5806 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5806) {
									local320 = 2000;
								} else {
									local320 = 0;
								}
							}
						} else if (Static262.aBooleanArray18[local312]) {
							local320 = 2000;
						}
						@Pc(378) short local378 = (short) (Static279.aShortArray93[local312] + local320);
						local108 = Static594.anIntArray618[local312] == -1 ? Static183.anInt2722 : Static594.anIntArray618[local312];
						Static438.method5750(Static14.aStringArray4[local312], 0, local378, (long) arg1.anInt8406, 0, "<col=ffffff>" + local176, false, -1, local108, true);
					}
				}
			}
			if (!arg0) {
				for (@Pc(428) Class2_Sub27 local428 = (Class2_Sub27) Static411.aClass70_43.method1264(); local428 != null; local428 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
					if (local428.anInt4323 == 10) {
						local428.aString53 = "<col=ffffff>" + local176;
						return;
					}
				}
			}
		} else if (Static355.aBoolean473 && (Static277.anInt4787 & 0x10) != 0) {
			Static438.method5750(Static434.aString105, 0, 22, 0L, 0, Static196.aString39 + " -> <col=ffffff>" + Static229.aClass159_39.method2776(Static261.anInt4297), false, -1, Static251.anInt4193, true);
		}
	}
}
