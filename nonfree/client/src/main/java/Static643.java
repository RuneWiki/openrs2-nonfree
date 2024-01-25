import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!wu", name = "K", descriptor = "D")
	public static double aDouble54;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "Z")
	public static boolean aBoolean747 = true;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZLclient!kc;)V")
	public static void method8607(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class13_Sub1_Sub1_Sub1_Sub2 arg1) {
		if (Static474.anInt7600 >= 400) {
			return;
		}
		if (arg1 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1) {
			@Pc(66) String local66;
			@Pc(139) int local139;
			if (arg1.anInt4654 == 0) {
				@Pc(94) boolean local94 = true;
				if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4679 != -1 && arg1.anInt4679 != -1) {
					@Pc(118) int local118 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650 > arg1.anInt4650 ? Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650 : arg1.anInt4650;
					@Pc(129) int local129 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4679 >= arg1.anInt4679 ? arg1.anInt4679 : Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4679;
					local139 = local129 + local118 * 10 / 100 + 5;
					@Pc(146) int local146 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650 - arg1.anInt4650;
					if (local146 < 0) {
						local146 = -local146;
					}
					if (local139 < local146) {
						local94 = false;
					}
				}
				@Pc(172) String local172 = Static25.aClass375_2 == Static189.aClass375_5 ? Static434.aClass271_30.method5972(Static483.anInt7694) : Static434.aClass271_28.method5972(Static483.anInt7694);
				if (arg1.anInt4650 >= arg1.anInt4670) {
					local66 = arg1.method3977() + (local94 ? Static631.method8044(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650, arg1.anInt4650) : "<col=ffffff>") + " (" + local172 + arg1.anInt4650 + ")";
				} else {
					local66 = arg1.method3977() + (local94 ? Static631.method8044(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650, arg1.anInt4650) : "<col=ffffff>") + " (" + local172 + arg1.anInt4650 + "+" + (arg1.anInt4670 - arg1.anInt4650) + ")";
				}
			} else if (arg1.anInt4654 == -1) {
				local66 = arg1.method3977();
			} else {
				local66 = arg1.method3977() + " (" + Static434.aClass271_29.method5972(Static483.anInt7694) + arg1.anInt4654 + ")";
			}
			if (Static8.aBoolean11 && !arg0 && (Static241.anInt3917 & 0x8) != 0) {
				Static564.method7726(false, 0, -1, Static83.anInt1494, false, 0, (long) arg1.anInt4582, Static577.aString105, (long) arg1.anInt4582, 17, true, Static90.aString16 + " -> <col=ffffff>" + local66);
			}
			if (arg0) {
				Static564.method7726(false, 0, 0, -1, true, 0, (long) arg1.anInt4582, "<col=cccccc>" + local66, 0L, -1, false, "");
			} else {
				for (@Pc(299) int local299 = 7; local299 >= 0; local299--) {
					if (Static634.aStringArray47[local299] != null) {
						@Pc(307) short local307 = 0;
						if (Static189.aClass375_5 == Static605.aClass375_7 && Static634.aStringArray47[local299].equalsIgnoreCase(Static434.aClass271_23.method5972(Static483.anInt7694))) {
							if (arg1.anInt4650 > Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650) {
								local307 = 2000;
							}
							if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4665 != 0 && arg1.anInt4665 != 0) {
								if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4665 == arg1.anInt4665) {
									local307 = 2000;
								} else {
									local307 = 0;
								}
							}
						} else if (Static50.aBooleanArray22[local299]) {
							local307 = 2000;
						}
						@Pc(361) short local361 = (short) (Static387.aShortArray88[local299] + local307);
						local139 = Static614.anIntArray679[local299] == -1 ? Static141.anInt2605 : Static614.anIntArray679[local299];
						Static564.method7726(false, 0, -1, local139, false, 0, (long) arg1.anInt4582, Static634.aStringArray47[local299], (long) arg1.anInt4582, local361, true, "<col=ffffff>" + local66);
					}
				}
			}
			if (!arg0) {
				for (@Pc(436) Class2_Sub2_Sub11 local436 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local436 != null; local436 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
					if (local436.anInt4369 == 12) {
						local436.aString45 = "<col=ffffff>" + local66;
						return;
					}
				}
			}
		} else if (Static8.aBoolean11 && (Static241.anInt3917 & 0x10) != 0) {
			Static564.method7726(false, 0, -1, Static83.anInt1494, false, 0, (long) arg1.anInt4582, Static577.aString105, 0L, 49, true, Static90.aString16 + " -> <col=ffffff>" + Static434.aClass271_37.method5972(Static483.anInt7694));
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)V")
	public static void method8623(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 17);
		local8.method669();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	public static void method8627(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static28.aClass53ArrayArrayArray1 = Static253.aClass53ArrayArrayArray2;
			Static314.aClass76Array2 = Static313.aClass76Array1;
		} else {
			Static28.aClass53ArrayArrayArray1 = Static316.aClass53ArrayArrayArray3;
			Static314.aClass76Array2 = Static462.aClass76Array3;
		}
		Static10.anInt139 = Static28.aClass53ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([BII[BBIIII)V")
	public static void method8640(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg3[local31] += arg0[arg1++];
				@Pc(43) int local43 = arg6++;
				arg3[local43] += arg0[arg1++];
				@Pc(55) int local55 = arg6++;
				arg3[local55] += arg0[arg1++];
				@Pc(67) int local67 = arg6++;
				arg3[local67] += arg0[arg1++];
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local31 = arg6++;
				arg3[local31] += arg0[arg1++];
			}
			arg1 += arg7;
			arg6 += arg4;
		}
	}
}
