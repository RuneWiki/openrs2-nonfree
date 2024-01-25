import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!up;")
	public static final Class362 aClass362_171 = new Class362();

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!uf;")
	public static Class357 aClass357_180 = null;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)V")
	public static void method9819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static349.method6046(arg5);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg5 - arg0;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg5;
		@Pc(29) int local29 = -arg5;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (Static427.anInt7845 <= arg4 && arg4 <= Static631.anInt10922) {
			@Pc(48) int[] local48 = Static186.anIntArrayArray12[arg4];
			local57 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - arg5);
			local65 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg5 + arg1);
			local73 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local17);
			local81 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local17 + arg1);
			Static567.method8614(local57, local73, local48, arg2);
			Static567.method8614(local73, local81, local48, arg3);
			Static567.method8614(local81, local65, local48, arg2);
		}
		while (local12 < local26) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				Static149.anIntArray156[local31] = local12;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(200) int local200;
			@Pc(208) int local208;
			@Pc(215) int[] local215;
			@Pc(147) int local147;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local147 = arg4 - local26;
				local57 = arg4 + local26;
				if (local57 >= Static427.anInt7845 && local147 <= Static631.anInt10922) {
					if (local26 < local17) {
						local65 = Static149.anIntArray156[local26];
						local73 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local12);
						local81 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local12);
						local200 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local65 + arg1);
						local208 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local65);
						if (local57 <= Static631.anInt10922) {
							local215 = Static186.anIntArrayArray12[local57];
							Static567.method8614(local81, local208, local215, arg2);
							Static567.method8614(local208, local200, local215, arg3);
							Static567.method8614(local200, local73, local215, arg2);
						}
						if (local147 >= Static427.anInt7845) {
							local215 = Static186.anIntArrayArray12[local147];
							Static567.method8614(local81, local208, local215, arg2);
							Static567.method8614(local208, local200, local215, arg3);
							Static567.method8614(local200, local73, local215, arg2);
						}
					} else {
						local65 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local12);
						local73 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local12);
						if (local57 <= Static631.anInt10922) {
							Static567.method8614(local73, local65, Static186.anIntArrayArray12[local57], arg2);
						}
						if (Static427.anInt7845 <= local147) {
							Static567.method8614(local73, local65, Static186.anIntArrayArray12[local147], arg2);
						}
					}
				}
			}
			local147 = arg4 - local12;
			local57 = arg4 + local12;
			if (Static427.anInt7845 <= local57 && Static631.anInt10922 >= local147) {
				local65 = arg1 + local26;
				local73 = arg1 - local26;
				if (local65 >= Static457.anInt8209 && Static407.anInt7583 >= local73) {
					local65 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local65);
					local73 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local73);
					if (local17 > local12) {
						local81 = local31 < local12 ? Static149.anIntArray156[local12] : local31;
						local200 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local81 + arg1);
						local208 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local81);
						if (Static631.anInt10922 >= local57) {
							local215 = Static186.anIntArrayArray12[local57];
							Static567.method8614(local73, local208, local215, arg2);
							Static567.method8614(local208, local200, local215, arg3);
							Static567.method8614(local200, local65, local215, arg2);
						}
						if (local147 >= Static427.anInt7845) {
							local215 = Static186.anIntArrayArray12[local147];
							Static567.method8614(local73, local208, local215, arg2);
							Static567.method8614(local208, local200, local215, arg3);
							Static567.method8614(local200, local65, local215, arg2);
						}
					} else {
						if (Static631.anInt10922 >= local57) {
							Static567.method8614(local73, local65, Static186.anIntArrayArray12[local57], arg2);
						}
						if (Static427.anInt7845 <= local147) {
							Static567.method8614(local73, local65, Static186.anIntArrayArray12[local147], arg2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)Z")
	public static boolean method9821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(B)V")
	public static void method9822() {
		if (Static607.aClass101_15 == null) {
			return;
		}
		if (Static450.aBoolean606) {
			Static157.method3191();
		}
		Static212.aClass217_1.method5978();
		Static34.method585();
		Static218.method4047();
		Static232.method9279();
		Static439.method7151();
		Static287.method4777();
		if (Static32.aClass251_1 != null) {
			Static32.aClass251_1.method6721();
		}
		Static383.method6463();
		Static58.method1113();
		Static312.method5103();
		Static24.method451();
		Static428.method7019(false);
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class15_Sub3_Sub3_Sub1_Sub1 local47 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local41];
			if (local47 != null) {
				for (@Pc(51) int local51 = 0; local51 < local47.aClass14Array3.length; local51++) {
					local47.aClass14Array3[local51] = null;
				}
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static487.anInt8726; local72++) {
			@Pc(79) Class15_Sub3_Sub3_Sub1_Sub2 local79 = Static275.aClass2_Sub6Array1[local72].aClass15_Sub3_Sub3_Sub1_Sub2_1;
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass14Array3.length; local83++) {
					local79.aClass14Array3[local83] = null;
				}
			}
		}
		Static435.aClass76_13 = null;
		Static92.aClass76_16 = null;
		Static607.aClass101_15.method8148();
		Static607.aClass101_15 = null;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public static void method9824() {
		Static387.aClass22_33.method468(50);
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Lclient!o;")
	public static Class69 method9826() {
		try {
			return (Class69) Class.forName("Class69_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class69_Sub1();
		}
	}
}
