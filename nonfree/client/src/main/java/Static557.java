import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vga", name = "B", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_21 = new Class276(19, 4);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZILclient!pca;)V")
	public static void method1632(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub2 arg1) {
		if (Static309.anInt6170 >= 400) {
			return;
		}
		@Pc(12) Class169 local12 = arg1.aClass169_1;
		if (local12.anIntArray306 != null) {
			local12 = local12.method4177(Static588.aClass322_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean416) {
			return;
		}
		@Pc(34) String local34 = local12.aString54;
		if (local12.anInt4976 != 0) {
			@Pc(53) String local53 = Static329.aClass335_3 == Static581.aClass335_4 ? Static139.aClass101_29.method2841(Static126.anInt2904) : Static139.aClass101_27.method2841(Static126.anInt2904);
			local34 = local34 + Static399.method6435(local12.anInt4976, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212) + " (" + local53 + local12.anInt4976 + ")";
		}
		if (Static594.aBoolean851 && !arg0) {
			@Pc(90) Class240 local90 = Static115.anInt2652 == -1 ? null : Static299.aClass17_2.method758(Static115.anInt2652);
			if ((Static564.anInt10012 & 0x2) != 0 && (local90 == null || local12.method4181(local90.anInt7291, Static115.anInt2652) != local90.anInt7291)) {
				Static200.method3365(0, Static569.aString131 + " -> <col=ffff00>" + local34, (long) arg1.anInt7603, Static590.aString133, 22, -1, false, Static120.anInt2749, 0, true);
			}
		}
		if (!arg0) {
			@Pc(139) String[] local139 = local12.aStringArray19;
			if (Static516.aBoolean288) {
				local139 = Static299.method5004(local139);
			}
			@Pc(149) int local149;
			if (local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && (local12.aByte47 == 0 || !local139[local149].equalsIgnoreCase(Static139.aClass101_22.method2841(Static126.anInt2904)))) {
						@Pc(168) byte local168 = 0;
						@Pc(170) int local170 = Static64.anInt1638;
						if (local149 == 0) {
							local168 = 45;
						}
						if (local149 == 1) {
							local168 = 25;
						}
						if (local149 == 2) {
							local168 = 10;
						}
						if (local149 == 3) {
							local168 = 8;
						}
						if (local12.anInt4964 == local149) {
							local170 = local12.lb;
						}
						if (local149 == 4) {
							local168 = 13;
						}
						if (local12.anInt4968 == local149) {
							local170 = local12.anInt4974;
						}
						Static200.method3365(0, "<col=ffff00>" + local34, (long) arg1.anInt7603, local139[local149], local168, -1, false, local139[local149].equalsIgnoreCase(Static139.aClass101_22.method2841(Static126.anInt2904)) ? local12.anInt4996 : local170, 0, true);
					}
				}
			}
			if (local12.aByte47 == 1 && local139 != null) {
				for (local149 = 4; local149 >= 0; local149--) {
					if (local139[local149] != null && local139[local149].equalsIgnoreCase(Static139.aClass101_22.method2841(Static126.anInt2904))) {
						@Pc(280) short local280 = 0;
						if (local12.anInt4976 > Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212) {
							local280 = 2000;
						}
						@Pc(293) short local293 = 0;
						if (local149 == 0) {
							local293 = 45;
						}
						if (local149 == 1) {
							local293 = 25;
						}
						if (local149 == 2) {
							local293 = 10;
						}
						if (local149 == 3) {
							local293 = 8;
						}
						if (local149 == 4) {
							local293 = 13;
						}
						if (local293 != 0) {
							local293 += local280;
						}
						Static200.method3365(0, "<col=ffff00>" + local34, (long) arg1.anInt7603, local139[local149], local293, -1, false, local12.anInt4996, 0, true);
					}
				}
			}
		}
		Static200.method3365(0, "<col=ffff00>" + local34, (long) arg1.anInt7603, Static139.aClass101_21.method2841(Static126.anInt2904), 1001, -1, arg0, Static330.anInt6858, 0, true);
	}

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "(B)[Lclient!oca;")
	public static Class237[] method1636() {
		return new Class237[] { Static553.aClass237_13, Static222.aClass237_3, Static443.aClass237_9 };
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!ufa;IBIII)Ljava/awt/Frame;")
	public static Frame method1638(@OriginalArg(0) Class326 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method7797()) {
			return null;
		}
		@Pc(20) Class13[] local20 = Static39.method1145(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt487 == arg1 && local20[local28].anInt485 == arg2 && (!local26 || local20[local28].anInt484 > arg3)) {
				local26 = true;
				arg3 = local20[local28].anInt484;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(100) Class66 local100 = arg0.method7798(arg3, arg2, arg1);
		while (local100.anInt2308 == 0) {
			Static1.method125(10L);
		}
		@Pc(114) Frame local114 = (Frame) local100.anObject4;
		if (local114 == null) {
			return null;
		} else if (local100.anInt2308 == 2) {
			Static281.method4845(local114, arg0);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Z")
	public static boolean method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static200.anInt3899; local1++) {
			@Pc(6) Class38 local6 = Static133.aClass38Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1222 == 1) {
				local15 = local6.anInt1220 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1213 + (local6.anInt1221 * local15 >> 8);
					local37 = local6.anInt1224 + (local6.anInt1212 * local15 >> 8);
					local47 = local6.anInt1219 + (local6.anInt1209 * local15 >> 8);
					local57 = local6.anInt1215 + (local6.anInt1210 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1222 == 2) {
				local15 = arg0 - local6.anInt1220;
				if (local15 > 0) {
					local27 = local6.anInt1213 + (local6.anInt1221 * local15 >> 8);
					local37 = local6.anInt1224 + (local6.anInt1212 * local15 >> 8);
					local47 = local6.anInt1219 + (local6.anInt1209 * local15 >> 8);
					local57 = local6.anInt1215 + (local6.anInt1210 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1222 == 3) {
				local15 = local6.anInt1213 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1220 + (local6.anInt1226 * local15 >> 8);
					local37 = local6.anInt1225 + (local6.anInt1217 * local15 >> 8);
					local47 = local6.anInt1219 + (local6.anInt1209 * local15 >> 8);
					local57 = local6.anInt1215 + (local6.anInt1210 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1222 == 4) {
				local15 = arg2 - local6.anInt1213;
				if (local15 > 0) {
					local27 = local6.anInt1220 + (local6.anInt1226 * local15 >> 8);
					local37 = local6.anInt1225 + (local6.anInt1217 * local15 >> 8);
					local47 = local6.anInt1219 + (local6.anInt1209 * local15 >> 8);
					local57 = local6.anInt1215 + (local6.anInt1210 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1222 == 5) {
				local15 = arg1 - local6.anInt1219;
				if (local15 > 0) {
					local27 = local6.anInt1220 + (local6.anInt1226 * local15 >> 8);
					local37 = local6.anInt1225 + (local6.anInt1217 * local15 >> 8);
					local47 = local6.anInt1213 + (local6.anInt1221 * local15 >> 8);
					local57 = local6.anInt1224 + (local6.anInt1212 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
