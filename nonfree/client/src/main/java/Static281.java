import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_80 = new Class15("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_172 = new Class56(110, -2);

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString41 = null;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!rp;")
	public static Class223 method3694(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static292.aFloat74 == 3.0D) {
				return Static344.aClass223_8;
			}
			if ((double) Static292.aFloat74 == 4.0D) {
				return Static136.aClass223_5;
			}
			if ((double) Static292.aFloat74 == 6.0D) {
				return Static66.aClass223_4;
			}
			if ((double) Static292.aFloat74 >= 8.0D) {
				return Static439.aClass223_10;
			}
		} else if (arg0 == 1) {
			if ((double) Static292.aFloat74 == 3.0D) {
				return Static66.aClass223_4;
			}
			if ((double) Static292.aFloat74 == 4.0D) {
				return Static439.aClass223_10;
			}
			if ((double) Static292.aFloat74 == 6.0D) {
				return Static4.aClass223_1;
			}
			if ((double) Static292.aFloat74 >= 8.0D) {
				return Static282.aClass223_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static292.aFloat74 == 3.0D) {
				return Static4.aClass223_1;
			}
			if ((double) Static292.aFloat74 == 4.0D) {
				return Static282.aClass223_6;
			}
			if ((double) Static292.aFloat74 == 6.0D) {
				return Static109.aClass223_9;
			}
			if ((double) Static292.aFloat74 >= 8.0D) {
				return Static314.aClass223_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V")
	public static void method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class145 local3 = new Class145();
		local3.anInt3591 = arg1 >> Static145.anInt2581;
		local3.anInt3596 = arg2 >> Static145.anInt2581;
		local3.anInt3595 = arg3 >> Static145.anInt2581;
		local3.anInt3597 = arg4 >> Static145.anInt2581;
		local3.anInt3585 = arg0;
		local3.anInt3587 = arg1;
		local3.anInt3598 = arg2;
		local3.anInt3593 = arg3;
		local3.anInt3590 = arg4;
		local3.anInt3588 = arg5;
		local3.anInt3584 = arg6;
		Static190.aClass145Array1[Static349.anInt5769++] = local3;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!rd;Z)V")
	public static void method3697(@OriginalArg(1) Class8_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static351.anInt5841 >= 400) {
			return;
		}
		if (Static401.aClass8_Sub3_Sub1_Sub1_2 != arg0) {
			@Pc(72) String local72;
			@Pc(122) int local122;
			if (arg0.anInt5651 == 0) {
				@Pc(76) boolean local76 = true;
				if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5659 != -1 && arg0.anInt5659 != -1) {
					@Pc(97) int local97 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682 > arg0.anInt5682 ? Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682 : arg0.anInt5682;
					@Pc(112) int local112 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5659 < arg0.anInt5659 ? Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5659 : arg0.anInt5659;
					local122 = local97 * 10 / 100 + local112 + 5;
					@Pc(129) int local129 = Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682 - arg0.anInt5682;
					if (local129 < 0) {
						local129 = -local129;
					}
					if (local122 < local129) {
						local76 = false;
					}
				}
				@Pc(155) String local155 = Static231.aClass6_7 == Static15.aClass6_1 ? Static12.aClass15_6.method180(Static429.anInt6999) : Static88.aClass15_31.method180(Static429.anInt6999);
				if (arg0.anInt5682 < arg0.anInt5646) {
					local72 = arg0.method4551() + (local76 ? Static89.method1409(arg0.anInt5682, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682) : "<col=ffffff>") + " (" + local155 + arg0.anInt5682 + "+" + (arg0.anInt5646 - arg0.anInt5682) + ")";
				} else {
					local72 = arg0.method4551() + (local76 ? Static89.method1409(arg0.anInt5682, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682) : "<col=ffffff>") + " (" + local155 + arg0.anInt5682 + ")";
				}
			} else {
				local72 = arg0.method4551() + " (" + Static346.aClass15_104.method180(Static429.anInt6999) + arg0.anInt5651 + ")";
			}
			if (Static70.aBoolean94) {
				if (!arg1 && (Static115.anInt2115 & 0x8) != 0) {
					Static391.method5158((long) arg0.anInt7391, -1, 0, 0, Static111.anInt2085, Static368.aString66 + " -> <col=ffffff>" + local72, 5, false, Static304.aString54, true);
				}
			} else if (arg1) {
				Static391.method5158(0L, 0, 0, 0, -1, "", -1, true, "<col=cccccc>" + local72, false);
			} else {
				for (@Pc(295) int local295 = 7; local295 >= 0; local295--) {
					if (Static87.aStringArray11[local295] != null) {
						@Pc(303) short local303 = 0;
						if (Static43.aClass6_6 == Static231.aClass6_7 && Static87.aStringArray11[local295].equalsIgnoreCase(Static246.aClass15_67.method180(Static429.anInt6999))) {
							if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682 < arg0.anInt5682) {
								local303 = 2000;
							}
							if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5665 != 0 && arg0.anInt5665 != 0) {
								if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5665 == arg0.anInt5665) {
									local303 = 2000;
								} else {
									local303 = 0;
								}
							}
						} else if (Static383.aBooleanArray29[local295]) {
							local303 = 2000;
						}
						@Pc(357) short local357 = (short) (Static208.aShortArray114[local295] + local303);
						local122 = Static43.anIntArray271[local295] == -1 ? Static211.anInt3677 : Static43.anIntArray271[local295];
						Static391.method5158((long) arg0.anInt7391, -1, 0, 0, local122, "<col=ffffff>" + local72, local357, false, Static87.aStringArray11[local295], true);
					}
				}
			}
			if (!arg1) {
				for (@Pc(413) Class4_Sub30 local413 = (Class4_Sub30) Static41.aClass244_2.method5263(); local413 != null; local413 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
					if (local413.anInt4615 == 15) {
						local413.aString39 = "<col=ffffff>" + local72;
						return;
					}
				}
			}
		} else if (Static70.aBoolean94 && (Static115.anInt2115 & 0x10) != 0) {
			Static391.method5158(0L, -1, 0, 0, Static111.anInt2085, Static368.aString66 + " -> <col=ffffff>" + Static408.aClass15_124.method180(Static429.anInt6999), 30, false, Static304.aString54, true);
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)I")
	public static int method3698(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
