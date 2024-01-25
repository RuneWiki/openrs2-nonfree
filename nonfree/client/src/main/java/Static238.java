import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "Lclient!cb;")
	public static Class50 aClass50_62;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "Lclient!ip;")
	public static Class170 aClass170_22;

	@OriginalMember(owner = "client!iaa", name = "v", descriptor = "Lclient!le;")
	public static Class5_Sub33 aClass5_Sub33_1 = null;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	public static void method3421(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static421.anInt7434 - Static207.anInt3300;
		if (local8 >= 100) {
			Static133.anInt2254 = 1;
			Static67.anInt1033 = -1;
			Static297.anInt571 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static329.aFloat117;
		if (Static609.anInt9838 >> 8 > local21) {
			local21 = Static609.anInt9838 >> 8;
		}
		if (Static322.aBooleanArray13[4] && local21 < Static559.anIntArray503[4] + 128) {
			local21 = Static559.anIntArray503[4] + 128;
		}
		@Pc(58) int local58 = (int) Static495.aFloat161 + Static312.anInt5536 & 0x3FFF;
		Static612.method8233(local58, (local21 >> 3) * 3 + 600 << 2, Static602.anInt9872, arg0, Static171.anInt2825, local21, Static161.method1246(Static458.anInt7955, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366) - 200);
		@Pc(111) float local111 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static546.anInt8938 = (int) (local111 * (float) (Static546.anInt8938 - Static570.anInt9348) + (float) Static570.anInt9348);
		Static570.anInt9347 = (int) (local111 * (float) (Static570.anInt9347 - Static54.anInt8559) + (float) Static54.anInt8559);
		Static498.anInt8495 = (int) ((float) (Static498.anInt8495 - Static67.anInt1034) * local111 + (float) Static67.anInt1034);
		Static105.anInt1868 = (int) ((float) Static570.anInt9346 + local111 * (float) (Static105.anInt1868 - Static570.anInt9346));
		@Pc(163) int local163 = Static493.anInt8442 - Static327.anInt5968;
		if (local163 > 8192) {
			local163 -= 16384;
		} else if (local163 < -8192) {
			local163 += 16384;
		}
		Static493.anInt8442 = (int) (local111 * (float) local163 + (float) Static327.anInt5968);
		Static493.anInt8442 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(II)Lclient!wq;")
	public static Class394 method3422(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static227.aClass394ArrayArray2[local15] == null || Static227.aClass394ArrayArray2[local15][local19] == null) {
			@Pc(33) boolean local33 = Static175.method2576(local15);
			if (!local33) {
				return null;
			}
		}
		return Static227.aClass394ArrayArray2[local15][local19];
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	public static void method3423() {
		if (Static346.anInt6205 > 1) {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub1_1, 4);
		} else {
			Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub1_1, 2);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZILclient!ts;)V")
	public static void method3424(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class41_Sub1_Sub1_Sub3_Sub2 arg1) {
		if (Static223.anInt3566 >= 400) {
			return;
		}
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 != arg1) {
			@Pc(90) String local90;
			if (arg1.anInt9554 == 0) {
				@Pc(103) boolean local103 = true;
				if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9553 != -1 && arg1.anInt9553 != -1) {
					@Pc(127) int local127 = arg1.anInt9553 > Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9553 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9553 : arg1.anInt9553;
					@Pc(134) int local134 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558 - arg1.anInt9558;
					if (local134 < 0) {
						local134 = -local134;
					}
					if (local134 > local127) {
						local103 = false;
					}
				}
				@Pc(157) String local157 = Static591.aClass174_7 == Static478.aClass174_6 ? Static49.aClass42_30.method730(Static259.anInt4113) : Static49.aClass42_28.method730(Static259.anInt4113);
				if (arg1.anInt9558 < arg1.anInt9546) {
					local90 = arg1.method7935() + (local103 ? Static578.method7878(arg1.anInt9558, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558) : "<col=ffffff>") + " (" + local157 + arg1.anInt9558 + "+" + (arg1.anInt9546 - arg1.anInt9558) + ")";
				} else {
					local90 = arg1.method7935() + (local103 ? Static578.method7878(arg1.anInt9558, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558) : "<col=ffffff>") + " (" + local157 + arg1.anInt9558 + ")";
				}
			} else if (arg1.anInt9554 == -1) {
				local90 = arg1.method7935();
			} else {
				local90 = arg1.method7935() + " (" + Static49.aClass42_29.method730(Static259.anInt4113) + arg1.anInt9554 + ")";
			}
			if (Static386.aBoolean482 && !arg0 && (Static2.anInt22 & 0x8) != 0) {
				Static244.method3492(45, Static116.aString18 + " -> <col=ffffff>" + local90, true, -1, Static11.aString1, Static476.anInt8267, (long) arg1.anInt9469, false, false, 0, 0, (long) arg1.anInt9469);
			}
			if (arg0) {
				Static244.method3492(-1, "", false, 0, "<col=cccccc>" + local90, -1, (long) arg1.anInt9469, true, false, 0, 0, 0L);
			} else {
				for (@Pc(281) int local281 = 7; local281 >= 0; local281--) {
					if (Static430.aStringArray35[local281] != null) {
						@Pc(289) short local289 = 0;
						if (Static591.aClass174_7 == Static137.aClass174_1 && Static430.aStringArray35[local281].equalsIgnoreCase(Static49.aClass42_23.method730(Static259.anInt4113))) {
							if (Static277.aBoolean287 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558 < arg1.anInt9558) {
								local289 = 2000;
							}
							if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9540 == 0 || arg1.anInt9540 == 0) {
								if (arg1.aBoolean697) {
									local289 = 2000;
								}
							} else if (arg1.anInt9540 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9540) {
								local289 = 2000;
							} else {
								local289 = 0;
							}
						} else if (Static549.aBooleanArray22[local281]) {
							local289 = 2000;
						}
						@Pc(356) short local356 = (short) (Static133.aShortArray14[local281] + local289);
						@Pc(367) int local367 = Static72.anIntArray500[local281] == -1 ? Static478.anInt8275 : Static72.anIntArray500[local281];
						Static244.method3492(local356, "<col=ffffff>" + local90, true, -1, Static430.aStringArray35[local281], local367, (long) arg1.anInt9469, false, false, 0, 0, (long) arg1.anInt9469);
					}
				}
			}
			if (!arg0) {
				for (@Pc(431) Class5_Sub2_Sub13 local431 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2572(); local431 != null; local431 = (Class5_Sub2_Sub13) Static153.aClass124_24.method2569()) {
					if (local431.anInt6711 == 18) {
						local431.aString67 = "<col=ffffff>" + local90;
						return;
					}
				}
			}
		} else if (Static386.aBoolean482 && (Static2.anInt22 & 0x10) != 0) {
			Static244.method3492(13, Static116.aString18 + " -> <col=ffffff>" + Static49.aClass42_37.method730(Static259.anInt4113), true, -1, Static11.aString1, Static476.anInt8267, (long) arg1.anInt9469, false, false, 0, 0, 0L);
		}
	}
}
