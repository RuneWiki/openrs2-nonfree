import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt5818;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!jl;")
	public static Class89 aClass89_47 = new Class89(32);

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	public static int anInt5816 = 0;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public static int anInt5817 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!qm;)Lclient!a;")
	public static Class1_Sub1 method4433(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.method2199();
		@Pc(19) int local19 = arg0.method2199();
		@Pc(23) Class1_Sub1 local23 = Static1.method4719(local19);
		local23.anInt6242 = arg0.method2199();
		@Pc(32) int local32 = arg0.method2199();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(41) int local41 = arg0.method2199();
			local23.method4712(arg0, local41);
		}
		local23.method4720();
		return local23;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public static void method4434() {
		Static286.anInt5741 = 0;
		@Pc(12) int local12 = (Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7) + Static159.anInt3527;
		@Pc(23) int local23 = Static217.anInt4673 + (Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static286.anInt5741 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static286.anInt5741 = 1;
		}
		if (Static286.anInt5741 == 1 && local12 >= 3139 && local12 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static286.anInt5741 = 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!wf;III)V")
	public static void method4435(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static248.method3834();
		if (Static294.aBoolean367) {
			Static156.method2546(arg0, arg2, arg0 + arg1.anInt6088, arg2 - -arg1.anInt6128);
		} else {
			Static231.method3634(arg0, arg2, arg1.anInt6088 + arg0, arg1.anInt6128 + arg2);
		}
		if (Static221.anInt4695 != 2 && Static221.anInt4695 != 5 && Static146.aClass1_Sub3_Sub13_14 != null) {
			@Pc(77) int local77;
			@Pc(82) int local82;
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (Static106.anInt2378 == 4) {
				local73 = Static109.anInt2425;
				local75 = 256;
				local77 = Static23.anInt641;
				local82 = (int) Static62.aFloat16 & 0x7FF;
			} else {
				local73 = Static56.aClass2_Sub4_Sub2_1.anInt2846;
				local77 = Static56.aClass2_Sub4_Sub2_1.anInt2794;
				local82 = (int) Static62.aFloat16 + Static220.anInt4691 & 0x7FF;
				local75 = Static253.anInt5117 + 256;
			}
			@Pc(110) int local110 = 464 - local77 / 32;
			@Pc(118) int local118 = local73 / 32 + 48;
			if (Static294.aBoolean367) {
				((Class1_Sub3_Sub13_Sub1) Static146.aClass1_Sub3_Sub13_14).method2669(arg0, arg2, arg1.anInt6088, arg1.anInt6128, local118, local110, local82, local75, (Class1_Sub3_Sub13_Sub1) arg1.method4674(false));
			} else {
				((Class1_Sub3_Sub13_Sub2) Static146.aClass1_Sub3_Sub13_14).method4216(arg0, arg2, arg1.anInt6088, arg1.anInt6128, local118, local110, local82, local75, arg1.anIntArray557, arg1.anIntArray554);
			}
			@Pc(193) int local193;
			@Pc(203) int local203;
			@Pc(228) int local228;
			@Pc(239) int local239;
			if (Static309.aClass174_3 != null) {
				for (@Pc(163) int local163 = 0; local163 < Static309.aClass174_3.anInt5618; local163++) {
					if (Static309.aClass174_3.aClass1_Sub3_Sub11Array1[local163] != null && Static309.aClass174_3.anIntArray509[local163] >> 28 == Static185.anInt4085) {
						local193 = (Static309.aClass174_3.anIntArray509[local163] >> 14 & 0x3FFF) - Static159.anInt3527;
						local203 = (Static309.aClass174_3.anIntArray509[local163] & 0x3FFF) - Static217.anInt4673;
						if (local193 >= 0 && local193 < 104 && local203 >= 0 && local203 < 104) {
							local228 = local193 * 4 + 2 - local73 / 32;
							local239 = local203 * 4 + 2 - local77 / 32;
							Static283.method4309(local228, Static309.aClass174_3.aClass1_Sub3_Sub11Array1[local163].anInt3104, local239, arg0, arg1, arg2);
						}
					}
				}
			}
			for (local193 = 0; local193 < Static263.anInt5300; local193++) {
				local228 = Static187.anIntArray360[local193] * 4 + 2 - local77 / 32;
				local203 = Static124.anIntArray274[local193] * 4 + 2 - local73 / 32;
				@Pc(299) Class92 local299 = Static166.method2725(Static205.anIntArray396[local193]);
				if (local299.anIntArray300 != null) {
					local299 = local299.method2323();
					if (local299 == null || local299.anInt3213 == -1) {
						continue;
					}
				}
				Static283.method4309(local203, local299.anInt3213, local228, arg0, arg1, arg2);
			}
			@Pc(373) int local373;
			for (local193 = 0; local193 < 104; local193++) {
				for (local203 = 0; local203 < 104; local203++) {
					@Pc(348) Class26 local348 = Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local193][local203];
					if (local348 != null) {
						local239 = local193 * 4 + 2 - local73 / 32;
						local373 = local203 * 4 + 2 - local77 / 32;
						Static204.method3254(arg1, arg2, local239, local373, arg0, Static10.aClass1_Sub3_Sub13Array1[0]);
					}
				}
			}
			for (local193 = 0; local193 < Static147.anInt3287; local193++) {
				@Pc(404) Class2_Sub4_Sub1 local404 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local193]];
				if (local404 != null && local404.method2100()) {
					@Pc(414) Class145 local414 = local404.aClass145_1;
					if (local414 != null && local414.anIntArray455 != null) {
						local414 = local414.method3711();
					}
					if (local414 != null && local414.aBoolean304 && local414.aBoolean300) {
						local373 = local404.anInt2794 / 32 - local77 / 32;
						local239 = local404.anInt2846 / 32 - local73 / 32;
						if (local414.anInt4923 == -1) {
							Static204.method3254(arg1, arg2, local239, local373, arg0, Static10.aClass1_Sub3_Sub13Array1[1]);
						} else {
							Static283.method4309(local239, local414.anInt4923, local373, arg0, arg1, arg2);
						}
					}
				}
			}
			@Pc(524) int local524;
			for (local193 = 0; local193 < Static16.anInt461; local193++) {
				@Pc(493) Class2_Sub4_Sub2 local493 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local193]];
				if (local493 != null && local493.method2100()) {
					local228 = local493.anInt2846 / 32 - local73 / 32;
					local239 = local493.anInt2794 / 32 - local77 / 32;
					@Pc(522) boolean local522 = false;
					for (local524 = 0; local524 < Static223.anInt4775; local524++) {
						if (local493.aString182.equals(Static280.aStringArray43[local524]) && Static114.anIntArray259[local524] != 0) {
							local522 = true;
							break;
						}
					}
					@Pc(550) boolean local550 = false;
					for (@Pc(552) int local552 = 0; local552 < Static69.anInt1441; local552++) {
						if (local493.aString182.equals(Static304.aClass132Array1[local552].aString324)) {
							local550 = true;
							break;
						}
					}
					@Pc(577) boolean local577 = false;
					if (Static56.aClass2_Sub4_Sub2_1.anInt2857 != 0 && local493.anInt2857 != 0 && local493.anInt2857 == Static56.aClass2_Sub4_Sub2_1.anInt2857) {
						local577 = true;
					}
					if (local522) {
						Static204.method3254(arg1, arg2, local228, local239, arg0, Static10.aClass1_Sub3_Sub13Array1[3]);
					} else if (local550) {
						Static204.method3254(arg1, arg2, local228, local239, arg0, Static10.aClass1_Sub3_Sub13Array1[5]);
					} else if (local577) {
						Static204.method3254(arg1, arg2, local228, local239, arg0, Static10.aClass1_Sub3_Sub13Array1[4]);
					} else {
						Static204.method3254(arg1, arg2, local228, local239, arg0, Static10.aClass1_Sub3_Sub13Array1[2]);
					}
				}
			}
			@Pc(656) Class64[] local656 = Static170.aClass64Array1;
			for (local203 = 0; local203 < local656.length; local203++) {
				@Pc(670) Class64 local670 = local656[local203];
				if (local670 != null && local670.anInt2092 != 0 && Static133.anInt3061 % 20 < 10) {
					if (local670.anInt2092 == 1 && local670.anInt2090 >= 0 && local670.anInt2090 < Static105.aClass2_Sub4_Sub1Array1.length) {
						@Pc(701) Class2_Sub4_Sub1 local701 = Static105.aClass2_Sub4_Sub1Array1[local670.anInt2090];
						if (local701 != null) {
							local373 = local701.anInt2846 / 32 - local73 / 32;
							local524 = local701.anInt2794 / 32 - local77 / 32;
							Static57.method4769(local670.anInt2094, local373, local524, arg0, arg1, arg2, 360000);
						}
					}
					if (local670.anInt2092 == 2) {
						local373 = (local670.anInt2095 - Static217.anInt4673) * 4 + 2 - local77 / 32;
						local239 = (local670.anInt2097 - Static159.anInt3527) * 4 + 2 - local73 / 32;
						local524 = local670.anInt2093 * 4;
						local524 *= local524;
						Static57.method4769(local670.anInt2094, local239, local373, arg0, arg1, arg2, local524);
					}
					if (local670.anInt2092 == 10 && local670.anInt2090 >= 0 && Static155.aClass2_Sub4_Sub2Array1.length > local670.anInt2090) {
						@Pc(814) Class2_Sub4_Sub2 local814 = Static155.aClass2_Sub4_Sub2Array1[local670.anInt2090];
						if (local814 != null) {
							local373 = local814.anInt2846 / 32 - local73 / 32;
							local524 = local814.anInt2794 / 32 - local77 / 32;
							Static57.method4769(local670.anInt2094, local373, local524, arg0, arg1, arg2, 360000);
						}
					}
				}
			}
			if (Static106.anInt2378 != 4) {
				if (Static280.anInt5624 != 0) {
					local193 = Static280.anInt5624 * 4 + Static56.aClass2_Sub4_Sub2_1.method2088() * 2 + 2 - local73 / 32 - 2;
					local203 = Static259.anInt5240 * 4 + Static56.aClass2_Sub4_Sub2_1.method2088() * 2 + 2 - local77 / 32 - 2;
					Static204.method3254(arg1, arg2, local193, local203, arg0, Static172.aClass1_Sub3_Sub13Array8[Static240.aBoolean314 ? 1 : 0]);
				}
				if (Static294.aBoolean367) {
					Static156.method2537(arg1.anInt6088 / 2 + arg0 - 1, arg2 + arg1.anInt6128 / 2 + -1, 3, 3, 16777215);
				} else {
					Static231.method3630(arg1.anInt6088 / 2 + arg0 - 1, arg2 + arg1.anInt6128 / 2 - 1, 3, 3, 16777215);
				}
			}
		} else if (Static294.aBoolean367) {
			@Pc(57) Class1_Sub3_Sub13 local57 = arg1.method4674(false);
			if (local57 != null) {
				local57.method4204(arg0, arg2);
			}
		} else {
			Static231.method3640(arg0, arg2, arg1.anIntArray557, arg1.anIntArray554);
		}
		Static55.aBooleanArray15[arg3] = true;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
	public static void method4436(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub3_Sub22 local16 = Static271.method4108(2, arg0);
		local16.method4464();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
	public static int method4437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub7 local10 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray164.length) {
			return local10.anIntArray164[arg1];
		} else {
			return -1;
		}
	}
}
