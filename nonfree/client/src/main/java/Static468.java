import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public static int anInt7876;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "[Lclient!hu;")
	public static Class44[] aClass44Array15;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!ofa;")
	public static Class117 aClass117_6;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public static final int anInt7879 = 0;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([Lclient!vfa;IB)V")
	public static void method6876(@OriginalArg(0) Class357[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class357 local18 = arg0[local12];
			if (local18 != null && local18.anInt9837 == arg1 && !Static74.method1231(local18)) {
				if (local18.anInt9828 == 0) {
					method6876(arg0, local18.anInt9804);
					if (local18.aClass357Array2 != null) {
						method6876(local18.aClass357Array2, local18.anInt9804);
					}
					@Pc(59) Class5_Sub15 local59 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local18.anInt9804);
					if (local59 != null) {
						Static493.method7267(local59.anInt2409);
					}
				}
				if (local18.anInt9828 == 6 && local18.anInt9806 != -1) {
					@Pc(81) Class200 local81 = Static396.aClass359_2.method8415(local18.anInt9806);
					if (local81 != null) {
						local18.anInt9798 += Static128.anInt2091;
						@Pc(92) int local92 = local18.anInt9800;
						while (local81.anIntArray388[local18.anInt9800] < local18.anInt9798) {
							local18.anInt9798 -= local81.anIntArray388[local18.anInt9800];
							local18.anInt9800++;
							if (local18.anInt9800 >= local81.anIntArray389.length) {
								local18.anInt9800 -= local81.anInt4887;
								if (local18.anInt9800 < 0 || local18.anInt9800 >= local81.anIntArray389.length) {
									local18.anInt9800 = 0;
								}
							}
							local18.anInt9827 = local18.anInt9800 + 1;
							if (local18.anInt9827 >= local81.anIntArray389.length) {
								local18.anInt9827 -= local81.anInt4887;
								if (local18.anInt9827 < 0 || local81.anIntArray389.length <= local18.anInt9827) {
									local18.anInt9827 = -1;
								}
							}
							Static637.method8778(local18);
						}
						if (local92 != local18.anInt9800) {
							Static91.method1412(local81, local18.anInt9800);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!fha;IZ)V")
	public static void method6877(@OriginalArg(0) Class14_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static642.anInt10370 >= 400) {
			return;
		}
		if (arg0 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1) {
			@Pc(67) String local67;
			if (arg0.anInt2722 == 0) {
				@Pc(95) boolean local95 = true;
				if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2719 != -1 && arg0.anInt2719 != -1) {
					@Pc(115) int local115 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2719 >= arg0.anInt2719 ? arg0.anInt2719 : Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2719;
					@Pc(122) int local122 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723 - arg0.anInt2723;
					if (local122 < 0) {
						local122 = -local122;
					}
					if (local122 > local115) {
						local95 = false;
					}
				}
				@Pc(149) String local149 = Static609.aClass235_7 == Static24.aClass235_1 ? Static76.aClass58_31.method1237(Static321.anInt5554) : Static76.aClass58_29.method1237(Static321.anInt5554);
				if (arg0.anInt2743 > arg0.anInt2723) {
					local67 = arg0.method2375() + (local95 ? Static261.method3988(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723, arg0.anInt2723) : "<col=ffffff>") + " (" + local149 + arg0.anInt2723 + "+" + (arg0.anInt2743 - arg0.anInt2723) + ")";
				} else {
					local67 = arg0.method2375() + (local95 ? Static261.method3988(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723, arg0.anInt2723) : "<col=ffffff>") + " (" + local149 + arg0.anInt2723 + ")";
				}
			} else if (arg0.anInt2722 == -1) {
				local67 = arg0.method2375();
			} else {
				local67 = arg0.method2375() + " (" + Static76.aClass58_30.method1237(Static321.anInt5554) + arg0.anInt2722 + ")";
			}
			if (Static202.aBoolean295 && !arg1 && (Static42.anInt714 & 0x8) != 0) {
				Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, 60, false, -1, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> <col=ffffff>" + local67, 0);
			}
			if (arg1) {
				Static227.method3576(false, (long) arg0.anInt2960, 0L, false, 0, -1, true, 0, -1, "<col=cccccc>" + local67, "", 0);
			} else {
				for (@Pc(276) int local276 = 7; local276 >= 0; local276--) {
					if (Static195.aStringArray14[local276] != null) {
						@Pc(284) short local284 = 0;
						if (Static191.aClass235_2 == Static24.aClass235_1 && Static195.aStringArray14[local276].equalsIgnoreCase(Static76.aClass58_24.method1237(Static321.anInt5554))) {
							if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723 < arg0.anInt2723) {
								local284 = 2000;
							}
							if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2720 != 0 && arg0.anInt2720 != 0) {
								if (arg0.anInt2720 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2720) {
									local284 = 2000;
								} else {
									local284 = 0;
								}
							}
						} else if (Static94.aBooleanArray59[local276]) {
							local284 = 2000;
						}
						@Pc(345) short local345 = (short) (Static297.aShortArray61[local276] + local284);
						@Pc(356) int local356 = Static259.anIntArray173[local276] == -1 ? Static308.anInt4884 : Static259.anIntArray173[local276];
						Static227.method3576(true, (long) arg0.anInt2960, (long) arg0.anInt2960, false, 0, local345, false, -1, local356, Static195.aStringArray14[local276], "<col=ffffff>" + local67, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(420) Class5_Sub4_Sub14 local420 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local420 != null; local420 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
					if (local420.anInt5598 == 45) {
						local420.aString89 = "<col=ffffff>" + local67;
						return;
					}
				}
			}
		} else if (Static202.aBoolean295 && (Static42.anInt714 & 0x10) != 0) {
			Static227.method3576(true, (long) arg0.anInt2960, 0L, false, 0, 22, false, -1, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> <col=ffffff>" + Static76.aClass58_38.method1237(Static321.anInt5554), 0);
		}
	}
}
