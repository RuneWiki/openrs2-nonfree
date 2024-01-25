import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "Z")
	public static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_122 = new Class77(2, -1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZBLclient!qr;)V")
	public static void method4094(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class12_Sub1_Sub2_Sub2 arg1) {
		if (Static379.anInt1192 >= 400 || Static267.aClass12_Sub1_Sub2_Sub2_1 == arg1) {
			return;
		}
		@Pc(147) String local147;
		@Pc(69) int local69;
		if (arg1.anInt5417 == 0) {
			@Pc(25) boolean local25 = true;
			if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5413 != -1 && arg1.anInt5413 != -1) {
				@Pc(48) int local48 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393 <= arg1.anInt5393 ? arg1.anInt5393 : Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393;
				@Pc(59) int local59 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5413 < arg1.anInt5413 ? Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5413 : arg1.anInt5413;
				local69 = local59 + local48 * 10 / 100 + 5;
				@Pc(76) int local76 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393 - arg1.anInt5393;
				if (local76 < 0) {
					local76 = -local76;
				}
				if (local76 > local69) {
					local25 = false;
				}
			}
			@Pc(108) String local108 = Static77.aClass48_1 == Static209.aClass48_2 ? Static255.aClass221_72.method5229(Static189.anInt5185) : Static383.aClass221_237.method5229(Static189.anInt5185);
			if (arg1.anInt5393 >= arg1.anInt5411) {
				local147 = arg1.method4724() + (local25 ? Static318.method4082(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393, arg1.anInt5393) : "<col=ffffff>") + " (" + local108 + arg1.anInt5393 + ")";
			} else {
				local147 = arg1.method4724() + (local25 ? Static318.method4082(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393, arg1.anInt5393) : "<col=ffffff>") + " (" + local108 + arg1.anInt5393 + "+" + (arg1.anInt5411 - arg1.anInt5393) + ")";
			}
		} else {
			local147 = arg1.method4724() + " (" + Static216.aClass221_137.method5229(Static189.anInt5185) + arg1.anInt5417 + ")";
		}
		if (Static68.aBoolean110) {
			if (!arg0 && (Static26.anInt622 & 0x8) != 0) {
				Static163.method2688(false, 0, Static187.aString28 + " -> <col=ffffff>" + local147, 0, 17, (long) arg1.anInt5365, Static363.anInt5936, -1, Static258.aString34, true);
			}
		} else if (arg0) {
			Static163.method2688(true, 0, "", 0, -1, 0L, -1, 0, "<col=cccccc>" + local147, false);
		} else {
			for (@Pc(257) int local257 = 7; local257 >= 0; local257--) {
				if (Static1.aStringArray1[local257] != null) {
					@Pc(265) short local265 = 0;
					if (Static311.aClass48_3 == Static209.aClass48_2 && Static1.aStringArray1[local257].equalsIgnoreCase(Static359.aClass221_228.method5229(Static189.anInt5185))) {
						if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393 < arg1.anInt5393) {
							local265 = 2000;
						}
						if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5385 != 0 && arg1.anInt5385 != 0) {
							if (arg1.anInt5385 == Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5385) {
								local265 = 2000;
							} else {
								local265 = 0;
							}
						}
					} else if (Static27.aBooleanArray16[local257]) {
						local265 = 2000;
					}
					@Pc(328) short local328 = (short) (Static169.aShortArray59[local257] + local265);
					local69 = Static30.anIntArray105[local257] == -1 ? Static356.anInt6263 : Static30.anIntArray105[local257];
					Static163.method2688(false, 0, "<col=ffffff>" + local147, 0, local328, (long) arg1.anInt5365, local69, -1, Static1.aStringArray1[local257], true);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(398) Class2_Sub7 local398 = (Class2_Sub7) Static66.aClass210_43.method5035(); local398 != null; local398 = (Class2_Sub7) Static66.aClass210_43.method5037()) {
			if (local398.anInt541 == 9) {
				local398.aString4 = "<col=ffffff>" + local147;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!lm;III)Lclient!ni;")
	public static Class2_Sub1_Sub11 method4095(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg2 << 8 | arg0.anInt3723;
		@Pc(27) Class2_Sub1_Sub11 local27 = (Class2_Sub1_Sub11) Static282.aClass55_6.method1250((long) local18 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(39) byte[] local39 = Static15.aClass71_2.method1564(Static15.aClass71_2.method1551(local18));
		if (local39 == null) {
			local18 = arg0.anInt3723 | arg1 + 65536 << 8;
			local27 = (Class2_Sub1_Sub11) Static282.aClass55_6.method1250((long) local18 << 16);
			if (local27 != null) {
				return local27;
			}
			local39 = Static15.aClass71_2.method1564(Static15.aClass71_2.method1551(local18));
			if (local39 == null) {
				local18 = arg0.anInt3723 | 0xFFFF00;
				local27 = (Class2_Sub1_Sub11) Static282.aClass55_6.method1250((long) local18 << 16);
				if (local27 != null) {
					return local27;
				}
				local39 = Static15.aClass71_2.method1564(Static15.aClass71_2.method1551(local18));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local27 = Static367.method5544(local39);
					local27.aClass144_9 = arg0;
					Static282.aClass55_6.method1248((long) local18 << 16, local27);
					return local27;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local27 = Static367.method5544(local39);
				local27.aClass144_9 = arg0;
				Static282.aClass55_6.method1248((long) local18 << 16, local27);
				return local27;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local27 = Static367.method5544(local39);
			local27.aClass144_9 = arg0;
			Static282.aClass55_6.method1248((long) local18 << 16, local27);
			return local27;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IIIII)V")
	public static void method4096(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg2 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg0[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg0[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg1;
			arg3 = local49 + 1;
			arg0[arg3] = arg1;
		}
		while (arg3 < local11) {
			arg3++;
			arg0[arg3] = arg1;
		}
	}
}
