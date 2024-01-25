import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jka", name = "u", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_86 = new Class322(6, -1);

	@OriginalMember(owner = "client!jka", name = "w", descriptor = "Z")
	public static final boolean aBoolean393 = false;

	@OriginalMember(owner = "client!jka", name = "C", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_87 = new Class322(99, 7);

	@OriginalMember(owner = "client!jka", name = "O", descriptor = "I")
	public static int anInt5174 = 0;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZIIIZZ)V")
	public static void method4727(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) Class204_Sub1 local16 = Static59.aClass204_Sub1Array1[local10];
		Static59.aClass204_Sub1Array1[local10] = Static59.aClass204_Sub1Array1[arg3];
		Static59.aClass204_Sub1Array1[arg3] = local16;
		for (@Pc(28) int local28 = arg2; local28 < arg3; local28++) {
			if (Static141.method7649(arg5, local16, Static59.aClass204_Sub1Array1[local28], arg0, arg4, arg1) <= 0) {
				@Pc(47) Class204_Sub1 local47 = Static59.aClass204_Sub1Array1[local28];
				Static59.aClass204_Sub1Array1[local28] = Static59.aClass204_Sub1Array1[local12];
				Static59.aClass204_Sub1Array1[local12++] = local47;
			}
		}
		Static59.aClass204_Sub1Array1[arg3] = Static59.aClass204_Sub1Array1[local12];
		Static59.aClass204_Sub1Array1[local12] = local16;
		method4727(arg0, arg1, arg2, local12 - 1, arg4, arg5);
		method4727(arg0, arg1, local12 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ZLclient!em;Z)V")
	public static void method4729(@OriginalArg(1) Class60_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static539.anInt8776 >= 400) {
			return;
		}
		if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 != arg0) {
			@Pc(88) String local88;
			if (arg0.anInt2866 == 0) {
				@Pc(118) boolean local118 = true;
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2846 != -1 && arg0.anInt2846 != -1) {
					@Pc(143) int local143 = arg0.anInt2846 <= Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2846 ? arg0.anInt2846 : Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2846;
					@Pc(150) int local150 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869 - arg0.anInt2869;
					if (local150 < 0) {
						local150 = -local150;
					}
					if (local143 < local150) {
						local118 = false;
					}
				}
				@Pc(181) String local181 = Static129.aClass121_1 == Static567.aClass121_9 ? Static50.aClass43_29.method596(Static601.anInt9518) : Static50.aClass43_27.method596(Static601.anInt9518);
				if (arg0.anInt2870 <= arg0.anInt2869) {
					local88 = arg0.method2701() + (local118 ? Static54.method651(arg0.anInt2869, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869) : "<col=ffffff>") + " (" + local181 + arg0.anInt2869 + ")";
				} else {
					local88 = arg0.method2701() + (local118 ? Static54.method651(arg0.anInt2869, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869) : "<col=ffffff>") + " (" + local181 + arg0.anInt2869 + "+" + (arg0.anInt2870 - arg0.anInt2869) + ")";
				}
			} else if (arg0.anInt2866 == -1) {
				local88 = arg0.method2701();
			} else {
				local88 = arg0.method2701() + " (" + Static50.aClass43_28.method596(Static601.anInt9518) + arg0.anInt2866 + ")";
			}
			if (Static162.aBoolean266 && !arg1 && (Static109.anInt2151 & 0x8) != 0) {
				Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> <col=ffffff>" + local88, 0, (long) arg0.anInt4845, true, Static185.aString41, -1, false, 0, false, 48, (long) arg0.anInt4845);
			}
			if (arg1) {
				Static541.method8078(-1, "", 0, (long) arg0.anInt4845, false, "<col=cccccc>" + local88, 0, false, 0, true, -1, 0L);
			} else {
				for (@Pc(322) int local322 = 7; local322 >= 0; local322--) {
					if (Static130.aStringArray10[local322] != null) {
						@Pc(332) short local332 = 0;
						if (Static129.aClass121_1 == Static517.aClass121_8 && Static130.aStringArray10[local322].equalsIgnoreCase(Static50.aClass43_23.method596(Static601.anInt9518))) {
							if (Static187.aBoolean315 && arg0.anInt2869 > Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869) {
								local332 = 2000;
							}
							if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2867 == 0 || arg0.anInt2867 == 0) {
								if (arg0.aBoolean227) {
									local332 = 2000;
								}
							} else if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2867 == arg0.anInt2867) {
								local332 = 2000;
							} else {
								local332 = 0;
							}
						} else if (Static581.aBooleanArray28[local322]) {
							local332 = 2000;
						}
						@Pc(413) short local413 = (short) (Static522.aShortArray123[local322] + local332);
						@Pc(425) int local425 = Static128.anIntArray131[local322] == -1 ? Static295.anInt5252 : Static128.anIntArray131[local322];
						Static541.method8078(local425, "<col=ffffff>" + local88, 0, (long) arg0.anInt4845, true, Static130.aStringArray10[local322], -1, false, 0, false, local413, (long) arg0.anInt4845);
					}
				}
			}
			if (!arg1) {
				for (@Pc(499) Class6_Sub2_Sub11 local499 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local499 != null; local499 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
					if (local499.anInt5173 == 17) {
						local499.aString56 = "<col=ffffff>" + local88;
						return;
					}
				}
			}
		} else if (Static162.aBoolean266 && (Static109.anInt2151 & 0x10) != 0) {
			Static541.method8078(Static607.anInt9573, Static6.aString5 + " -> <col=ffffff>" + Static50.aClass43_36.method596(Static601.anInt9518), 0, (long) arg0.anInt4845, true, Static185.aString41, -1, false, 0, false, 21, 0L);
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Z)V")
	public static void method4730() {
		@Pc(9) int local9;
		if (Static15.aClass230Array1 != null) {
			for (local9 = 0; local9 < Static318.anInt5491; local9++) {
				Static15.aClass230Array1[local9] = null;
			}
			Static15.aClass230Array1 = null;
		}
		if (Static91.aClass230Array2 != null) {
			for (local9 = 0; local9 < Static496.anInt8367; local9++) {
				Static91.aClass230Array2[local9] = null;
			}
			Static91.aClass230Array2 = null;
		}
		if (Static329.aClass230Array4 != null) {
			for (local9 = 0; local9 < Static373.anInt6284; local9++) {
				Static329.aClass230Array4[local9] = null;
			}
			Static329.aClass230Array4 = null;
		}
		Static52.anIntArrayArrayArray11 = null;
		Static487.anInt10362 = -1;
		Static3.anInt17 = -1;
		Static251.anIntArray252 = null;
		Static322.aClass230Array3 = null;
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILclient!rs;)V")
	public static void method4731(@OriginalArg(1) Class60_Sub9 arg0) {
		arg0.aClass60_Sub1_21 = null;
		@Pc(12) int local12 = arg0.aClass60_Sub10Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass60_Sub10Array1[local14].aBoolean765 = false;
		}
		@Pc(30) Class385[] local30 = Class140.aClass385Array1;
		synchronized (Class140.aClass385Array1) {
			if (local12 < Class140.aClass385Array1.length && Static683.anIntArray697[local12] < 200) {
				Class140.aClass385Array1[local12].method8779(arg0);
				@Pc(67) int local67 = Static683.anIntArray697[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static4.method25(arg1, arg0) | (arg1 & 0x70000) != 0 || Static114.method2148(arg0, arg1);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIIB)V")
	public static void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		if (arg1 <= arg2) {
			for (local15 = arg1; local15 < arg2; local15++) {
				Static36.anIntArrayArray4[local15][arg3] = arg0;
			}
		} else {
			for (local15 = arg2; local15 < arg1; local15++) {
				Static36.anIntArrayArray4[local15][arg3] = arg0;
			}
		}
	}
}
