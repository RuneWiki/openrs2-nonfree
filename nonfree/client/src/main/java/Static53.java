import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static int[] anIntArray64;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method919() {
		@Pc(7) Class63 local7 = null;
		try {
			local7 = Static464.method6538("2");
			@Pc(20) Class2_Sub15 local20 = new Class2_Sub15(Static235.anInt4371 * 6 + 3);
			local20.method4333(1);
			local20.method4350(Static235.anInt4371);
			for (@Pc(30) int local30 = 0; local30 < Static470.anIntArray532.length; local30++) {
				if (Static254.aBooleanArray23[local30]) {
					local20.method4350(local30);
					local20.method4288(Static470.anIntArray532[local30]);
				}
			}
			local7.method1176(0, local20.anInt5241, local20.aByteArray62);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method1174();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static207.aLong106 = Static548.method7437();
		Static105.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILclient!qi;)V")
	public static void method920(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub1_Sub1_Sub1_Sub2 arg1) {
		if (Static347.anInt6255 >= 400) {
			return;
		}
		if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 != arg1) {
			@Pc(86) String local86;
			@Pc(147) int local147;
			if (arg1.anInt7447 == 0) {
				@Pc(97) boolean local97 = true;
				if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7435 != -1 && arg1.anInt7435 != -1) {
					@Pc(122) int local122 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430 <= arg1.anInt7430 ? arg1.anInt7430 : Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430;
					@Pc(137) int local137 = arg1.anInt7435 > Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7435 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7435 : arg1.anInt7435;
					local147 = local137 + local122 * 10 / 100 + 5;
					@Pc(154) int local154 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430 - arg1.anInt7430;
					if (local154 < 0) {
						local154 = -local154;
					}
					if (local147 < local154) {
						local97 = false;
					}
				}
				@Pc(181) String local181 = Static404.aClass284_3 == Static328.aClass284_2 ? Static290.aClass198_32.method4365(Static52.anInt1264) : Static290.aClass198_30.method4365(Static52.anInt1264);
				if (arg1.anInt7461 > arg1.anInt7430) {
					local86 = arg1.method6174() + (local97 ? Static71.method1164(arg1.anInt7430, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430) : "<col=ffffff>") + " (" + local181 + arg1.anInt7430 + "+" + (arg1.anInt7461 - arg1.anInt7430) + ")";
				} else {
					local86 = arg1.method6174() + (local97 ? Static71.method1164(arg1.anInt7430, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430) : "<col=ffffff>") + " (" + local181 + arg1.anInt7430 + ")";
				}
			} else if (arg1.anInt7447 == -1) {
				local86 = arg1.method6174();
			} else {
				local86 = arg1.method6174() + " (" + Static290.aClass198_31.method4365(Static52.anInt1264) + arg1.anInt7447 + ")";
			}
			if (Static25.aBoolean32 && !arg0 && (Static242.anInt4524 & 0x8) != 0) {
				Static304.method4554(0, false, 0, -1, true, Static540.anInt8826, (long) arg1.lb, Static12.aString4 + " -> <col=ffffff>" + local86, 4, Static271.aString38);
			}
			if (arg0) {
				Static304.method4554(0, true, 0, 0, false, -1, 0L, "", -1, "<col=cccccc>" + local86);
			} else {
				for (@Pc(303) int local303 = 7; local303 >= 0; local303--) {
					if (Static461.aStringArray145[local303] != null) {
						@Pc(311) short local311 = 0;
						if (Static328.aClass284_2 == Static574.aClass284_4 && Static461.aStringArray145[local303].equalsIgnoreCase(Static290.aClass198_25.method4365(Static52.anInt1264))) {
							if (arg1.anInt7430 > Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430) {
								local311 = 2000;
							}
							if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7458 != 0 && arg1.anInt7458 != 0) {
								if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7458 == arg1.anInt7458) {
									local311 = 2000;
								} else {
									local311 = 0;
								}
							}
						} else if (Static421.aBooleanArray30[local303]) {
							local311 = 2000;
						}
						@Pc(366) short local366 = (short) (Static341.aShortArray97[local303] + local311);
						local147 = Static282.anIntArray344[local303] == -1 ? Static261.anInt8058 : Static282.anIntArray344[local303];
						Static304.method4554(0, false, 0, -1, true, local147, (long) arg1.lb, "<col=ffffff>" + local86, local366, Static461.aStringArray145[local303]);
					}
				}
			}
			if (!arg0) {
				for (@Pc(437) Class2_Sub5 local437 = (Class2_Sub5) Static375.aClass8_38.method210(); local437 != null; local437 = (Class2_Sub5) Static375.aClass8_38.method218()) {
					if (local437.anInt902 == 10) {
						local437.aString7 = "<col=ffffff>" + local86;
						return;
					}
				}
			}
		} else if (Static25.aBoolean32 && (Static242.anInt4524 & 0x10) != 0) {
			Static304.method4554(0, false, 0, -1, true, Static540.anInt8826, 0L, Static12.aString4 + " -> <col=ffffff>" + Static290.aClass198_39.method4365(Static52.anInt1264), 2, Static271.aString38);
		}
	}
}
