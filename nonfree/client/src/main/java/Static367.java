import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "[S")
	private static final short[] aShortArray94 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "[S")
	private static final short[] aShortArray95 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "[S")
	private static final short[] aShortArray93 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "[[S")
	public static final short[][] aShortArrayArray19 = new short[][] { aShortArray94, aShortArray95, aShortArray93 };

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!aba;")
	public static Class4_Sub1_Sub1 method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(15) Class299 local15 = local7.aClass299_2; local15 != null; local15 = local15.aClass299_3) {
			@Pc(19) Class4_Sub1_Sub1 local19 = local15.aClass4_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local19.getClass()) && local19.aShort104 == arg1 && local19.aShort105 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!ip;IZ)V")
	public static void method5342(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static651.anInt10662 >= 400) {
			return;
		}
		if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 != arg0) {
			@Pc(109) String local109;
			if (arg0.anInt4530 == 0) {
				@Pc(120) boolean local120 = true;
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4532 != -1 && arg0.anInt4532 != -1) {
					@Pc(146) int local146 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4532 >= arg0.anInt4532 ? arg0.anInt4532 : Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4532;
					@Pc(152) int local152 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565 - arg0.anInt4565;
					if (local152 < 0) {
						local152 = -local152;
					}
					if (local152 > local146) {
						local120 = false;
					}
				}
				@Pc(183) String local183 = Static536.aClass290_6 == Static532.aClass290_5 ? Static184.aClass131_31.method3168(Static375.anInt7800) : Static184.aClass131_29.method3168(Static375.anInt7800);
				if (arg0.anInt4547 <= arg0.anInt4565) {
					local109 = arg0.method4084() + (local120 ? Static594.method8180(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565, arg0.anInt4565) : "<col=ffffff>") + " (" + local183 + arg0.anInt4565 + ")";
				} else {
					local109 = arg0.method4084() + (local120 ? Static594.method8180(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565, arg0.anInt4565) : "<col=ffffff>") + " (" + local183 + arg0.anInt4565 + "+" + (arg0.anInt4547 - arg0.anInt4565) + ")";
				}
			} else if (arg0.anInt4530 == -1) {
				local109 = arg0.method4084();
			} else {
				local109 = arg0.method4084() + " (" + Static184.aClass131_30.method3168(Static375.anInt7800) + arg0.anInt4530 + ")";
			}
			if (Static421.aBoolean472 && !arg1 && (Static326.anInt4132 & 0x8) != 0) {
				Static467.method6573(0, 13, -1, Static462.anInt7482, Static47.aString9 + " -> <col=ffffff>" + local109, Static570.aString102, (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, false, true);
			}
			if (arg1) {
				Static467.method6573(0, -1, 0, -1, "", "<col=cccccc>" + local109, 0L, (long) arg0.anInt6843, 0, false, true, false);
			} else {
				for (@Pc(328) int local328 = 7; local328 >= 0; local328--) {
					if (Static147.aStringArray11[local328] != null) {
						@Pc(338) short local338 = 0;
						if (Static536.aClass290_6 == Static82.aClass290_1 && Static147.aStringArray11[local328].equalsIgnoreCase(Static184.aClass131_24.method3168(Static375.anInt7800))) {
							if (Static470.aBoolean515 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565 < arg0.anInt4565) {
								local338 = 2000;
							}
							if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4548 == 0 || arg0.anInt4548 == 0) {
								if (arg0.aBoolean304) {
									local338 = 2000;
								}
							} else if (arg0.anInt4548 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4548) {
								local338 = 2000;
							} else {
								local338 = 0;
							}
						} else if (Static178.aBooleanArray10[local328]) {
							local338 = 2000;
						}
						@Pc(416) short local416 = (short) (Static672.aShortArray186[local328] + local338);
						@Pc(429) int local429 = Static636.anIntArray589[local328] == -1 ? Static61.anInt1040 : Static636.anIntArray589[local328];
						Static467.method6573(0, local416, -1, local429, "<col=ffffff>" + local109, Static147.aStringArray11[local328], (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, false, true);
					}
				}
			}
			if (!arg1) {
				for (@Pc(503) Class5_Sub1_Sub13 local503 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local503 != null; local503 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
					if (local503.anInt6068 == 10) {
						local503.aString73 = "<col=ffffff>" + local109;
						return;
					}
				}
			}
		} else if (Static421.aBoolean472 && (Static326.anInt4132 & 0x10) != 0) {
			Static467.method6573(0, 5, -1, Static462.anInt7482, Static47.aString9 + " -> <col=ffffff>" + Static184.aClass131_38.method3168(Static375.anInt7800), Static570.aString102, 0L, (long) arg0.anInt6843, 0, false, false, true);
		}
	}
}
