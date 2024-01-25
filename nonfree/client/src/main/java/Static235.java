import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_4 = new Class4();

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
	public static int anInt4324 = 0;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "[I")
	public static final int[] anIntArray223 = new int[8];

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "[Lclient!ks;")
	public static final Class197[] aClass197Array1 = new Class197[14];

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method3460(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static300.anInt9562 = 0;
		Static443.anInt7826 = 0;
		Static239.anInt4403++;
		for (@Pc(15) int local15 = 0; local15 < Static420.anIntArray440[local5]; local15++) {
			if (!Static46.method763(Static319.aClass11_Sub1ArrayArray3[local5][local15], arg0, arg1, arg2, arg3)) {
				Static337.method5008(Static319.aClass11_Sub1ArrayArray3[local5][local15]);
				if (Static319.aClass11_Sub1ArrayArray3[local5][local15].anInt8899 != -1) {
					Static458.aClass11_Sub1Array141[Static300.anInt9562++] = Static319.aClass11_Sub1ArrayArray3[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static512.anIntArray540[local5]; local61++) {
			if (!Static46.method763(Static267.aClass11_Sub1ArrayArray2[local5][local61], arg0, arg1, arg2, arg3)) {
				Static337.method5008(Static267.aClass11_Sub1ArrayArray2[local5][local61]);
				if (Static267.aClass11_Sub1ArrayArray2[local5][local61].anInt8899 != -1) {
					Static21.aClass11_Sub1Array11[Static443.anInt7826++] = Static267.aClass11_Sub1ArrayArray2[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static275.anIntArray276[local5]; local107++) {
			if (!Static46.method763(Static176.aClass11_Sub1ArrayArray1[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static176.aClass11_Sub1ArrayArray1[local5][local107].method7217()) {
					Static337.method5008(Static176.aClass11_Sub1ArrayArray1[local5][local107]);
					if (Static176.aClass11_Sub1ArrayArray1[local5][local107].anInt8899 != -1) {
						Static21.aClass11_Sub1Array11[Static443.anInt7826++] = Static176.aClass11_Sub1ArrayArray1[local5][local107];
					}
				} else {
					Static337.method5008(Static176.aClass11_Sub1ArrayArray1[local5][local107]);
					if (Static176.aClass11_Sub1ArrayArray1[local5][local107].anInt8899 != -1) {
						Static458.aClass11_Sub1Array141[Static300.anInt9562++] = Static176.aClass11_Sub1ArrayArray1[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static435.anInt7764; local190++) {
				if (!Static46.method763(Static299.aClass11_Sub1_Sub1Array1[local190], arg0, arg1, arg2, arg3)) {
					Static337.method5008(Static299.aClass11_Sub1_Sub1Array1[local190]);
					if (Static299.aClass11_Sub1_Sub1Array1[local190].anInt8899 != -1) {
						if (Static299.aClass11_Sub1_Sub1Array1[local190].method7217()) {
							Static21.aClass11_Sub1Array11[Static443.anInt7826++] = Static299.aClass11_Sub1_Sub1Array1[local190];
						} else {
							Static458.aClass11_Sub1Array141[Static300.anInt9562++] = Static299.aClass11_Sub1_Sub1Array1[local190];
						}
					}
				}
			}
		}
		if (Static300.anInt9562 > 0) {
			Static573.method7725(Static458.aClass11_Sub1Array141, 0, Static300.anInt9562 - 1);
			for (local190 = 0; local190 < Static300.anInt9562; local190++) {
				Static28.method557(Static458.aClass11_Sub1Array141[local190]);
			}
		}
		if (Static478.aBoolean368) {
			Static458.aClass78_153.method6825(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static584.anInt9623; local190 < Static119.anInt2474; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static496.aBooleanArrayArray7.length;
				if (Static189.anInt3742 + Static496.aBooleanArrayArray7.length > Static327.anInt5993) {
					local278 -= Static189.anInt3742 + Static496.aBooleanArrayArray7.length - Static327.anInt5993;
				}
				local298 = Static496.aBooleanArrayArray7[0].length;
				if (Static179.anInt3330 + Static496.aBooleanArrayArray7[0].length > Static191.anInt3757) {
					local298 -= Static179.anInt3330 + Static496.aBooleanArrayArray7[0].length - Static191.anInt3757;
				}
				local319 = Static321.aBooleanArrayArray5;
				if (Static364.aBoolean618) {
					if (Static336.aBoolean470) {
						local319 = Static288.aBooleanArrayArrayArray4[local190];
					}
					for (local329 = Static277.anInt5051; local329 < local278; local329++) {
						local336 = local329 + Static189.anInt3742 - Static277.anInt5051;
						for (local338 = Static79.anInt1537; local338 < local298; local338++) {
							if (Static496.aBooleanArrayArray7[local329][local338] && !Static120.method2175(local338 + Static179.anInt3330 - Static79.anInt1537, local190, local336)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static336.aBoolean470) {
					Static310.aClass129Array5[local190].method6478(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static59.anInt1129; local329++) {
						Static198.aClass187Array1[local329].method3887(new Class11_Sub7(local190 + 1));
					}
				} else if (Static107.aBoolean119) {
					Static310.aClass129Array5[local190].method6479(Static115.anInt1985, Static326.anInt4975, Static548.anInt9156, Static321.aBooleanArrayArray5, true, Static154.anInt2926);
				} else {
					Static310.aClass129Array5[local190].method6478(Static115.anInt1985, Static326.anInt4975, Static548.anInt9156, Static321.aBooleanArrayArray5, true);
				}
			} else {
				local278 = Static496.aBooleanArrayArray7.length;
				if (Static189.anInt3742 + Static496.aBooleanArrayArray7.length > Static327.anInt5993) {
					local278 -= Static189.anInt3742 + Static496.aBooleanArrayArray7.length - Static327.anInt5993;
				}
				local298 = Static496.aBooleanArrayArray7[0].length;
				if (Static179.anInt3330 + Static496.aBooleanArrayArray7[0].length > Static191.anInt3757) {
					local298 -= Static179.anInt3330 + Static496.aBooleanArrayArray7[0].length - Static191.anInt3757;
				}
				local319 = Static321.aBooleanArrayArray5;
				if (Static364.aBoolean618) {
					if (Static336.aBoolean470) {
						local319 = Static288.aBooleanArrayArrayArray4[local190];
					}
					for (local329 = Static277.anInt5051; local329 < local278; local329++) {
						local336 = local329 + Static189.anInt3742 - Static277.anInt5051;
						for (local338 = Static79.anInt1537; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static496.aBooleanArrayArray7[local329][local338]) {
								@Pc(357) int local357 = local338 + Static179.anInt3330 - Static79.anInt1537;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static568.aClass360ArrayArrayArray22[local359][local336][local357] != null && Static568.aClass360ArrayArrayArray22[local359][local336][local357].aByte129 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static120.method2175(local357, local190, local336)) {
											local319[local329][local338] = true;
											break;
										}
										local319[local329][local338] = false;
										break;
									}
								}
							}
						}
					}
				}
				if (Static336.aBoolean470) {
					Static310.aClass129Array5[local190].method6478(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static59.anInt1129; local329++) {
						Static198.aClass187Array1[local329].method3887(new Class11_Sub7(local190 + 1));
					}
				} else if (Static107.aBoolean119) {
					Static310.aClass129Array5[local190].method6479(Static115.anInt1985, Static326.anInt4975, Static548.anInt9156, Static321.aBooleanArrayArray5, false, Static154.anInt2926);
				} else {
					Static310.aClass129Array5[local190].method6478(Static115.anInt1985, Static326.anInt4975, Static548.anInt9156, Static321.aBooleanArrayArray5, false);
				}
			}
		}
		if (Static443.anInt7826 > 0) {
			Static410.method5854(Static21.aClass11_Sub1Array11, 0, Static443.anInt7826 - 1);
			for (local278 = 0; local278 < Static443.anInt7826; local278++) {
				Static28.method557(Static21.aClass11_Sub1Array11[local278]);
			}
		}
	}
}
