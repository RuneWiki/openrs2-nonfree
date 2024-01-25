import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fo", name = "A", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_4 = new Class144("", 17);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ld;BZ)V")
	public static void method1815(@OriginalArg(0) Class12_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static379.anInt1192 >= 400) {
			return;
		}
		@Pc(20) Class240 local20 = arg0.aClass240_1;
		if (local20.anIntArray781 != null) {
			local20 = local20.method5567(Static248.aClass125_1);
			if (local20 == null) {
				return;
			}
		}
		if (!local20.aBoolean481) {
			return;
		}
		@Pc(38) String local38 = local20.aString60;
		if (local20.anInt6499 != 0) {
			@Pc(57) String local57 = Static77.aClass48_1 == Static209.aClass48_2 ? Static255.aClass221_72.method5229(Static189.anInt5185) : Static383.aClass221_237.method5229(Static189.anInt5185);
			local38 = local38 + Static318.method4082(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393, local20.anInt6499) + " (" + local57 + local20.anInt6499 + ")";
		}
		if (!Static68.aBoolean110) {
			if (!arg1) {
				@Pc(87) String[] local87 = local20.aStringArray43;
				if (Static276.aBoolean350) {
					local87 = Static31.method733(local87);
				}
				@Pc(97) int local97;
				if (local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && (Static311.aClass48_3 != Static209.aClass48_2 || !local87[local97].equalsIgnoreCase(Static359.aClass221_228.method5229(Static189.anInt5185)))) {
							@Pc(117) byte local117 = 0;
							@Pc(119) int local119 = Static356.anInt6263;
							if (local97 == 0) {
								local117 = 5;
							}
							if (local97 == 1) {
								local117 = 3;
							}
							if (local97 == 2) {
								local117 = 18;
							}
							if (local97 == 3) {
								local117 = 44;
							}
							if (local20.anInt6477 == local97) {
								local119 = local20.anInt6492;
							}
							if (local97 == 4) {
								local117 = 48;
							}
							if (local20.anInt6475 == local97) {
								local119 = local20.anInt6460;
							}
							Static163.method2688(false, 0, "<col=ffff00>" + local38, 0, local117, (long) arg0.anInt5365, local119, -1, local87[local97], true);
						}
					}
				}
				if (Static311.aClass48_3 == Static209.aClass48_2 && local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && local87[local97].equalsIgnoreCase(Static359.aClass221_228.method5229(Static189.anInt5185))) {
							@Pc(214) short local214 = 0;
							if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393 < local20.anInt6499) {
								local214 = 2000;
							}
							@Pc(227) short local227 = 0;
							if (local97 == 0) {
								local227 = 5;
							}
							if (local97 == 1) {
								local227 = 3;
							}
							if (local97 == 2) {
								local227 = 18;
							}
							if (local97 == 3) {
								local227 = 44;
							}
							if (local97 == 4) {
								local227 = 48;
							}
							if (local227 != 0) {
								local227 += local214;
							}
							Static163.method2688(false, 0, "<col=ffff00>" + local38, 0, local227, (long) arg0.anInt5365, local20.anInt6465, -1, local87[local97], true);
						}
					}
				}
			}
			Static163.method2688(arg1, 0, "<col=ffff00>" + local38, 0, 1010, (long) arg0.anInt5365, Static359.anInt6307, -1, Static155.aClass221_105.method5229(Static189.anInt5185), true);
		} else if (!arg1) {
			@Pc(331) Class61 local331 = Static50.anInt1031 == -1 ? null : Static82.aClass184_1.method4403(Static50.anInt1031);
			if ((Static26.anInt622 & 0x2) != 0) {
				if (local331 == null || local20.method5569(local331.anInt1488, Static50.anInt1031) != local331.anInt1488) {
					Static163.method2688(false, 0, Static187.aString28 + " -> <col=ffff00>" + local38, 0, 57, (long) arg0.anInt5365, Static363.anInt5936, -1, Static258.aString34, true);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILclient!ms;I)I")
	public static int method1816(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1) {
		if (!Static41.method878(arg1).method5119(arg0) && arg1.anObjectArray34 == null) {
			return -1;
		} else if (arg1.anIntArray514 == null || arg0 >= arg1.anIntArray514.length) {
			return -1;
		} else {
			return arg1.anIntArray514[arg0];
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg3, 10);
		local8.method410();
		local8.anInt343 = arg2;
		local8.anInt341 = arg1;
		local8.anInt348 = arg0;
	}
}
