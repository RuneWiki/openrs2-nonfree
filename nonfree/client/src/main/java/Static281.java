import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!nu", name = "w", descriptor = "Lclient!gs;")
	public static Class98 aClass98_3;

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
	public static int anInt6554;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_88 = new Class27(80, 8);

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
	public static int anInt6556 = 0;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
	public static void method5145() {
		Static203.aClass10_Sub8_Sub2_1.method2532();
		@Pc(13) int local13 = Static203.aClass10_Sub8_Sub2_1.method2525(8);
		@Pc(18) int local18;
		if (local13 < Static219.anInt4155) {
			for (local18 = local13; local18 < Static219.anInt4155; local18++) {
				Static409.anIntArray664[Static239.anInt4238++] = Static57.anIntArray91[local18];
			}
		}
		if (local13 > Static219.anInt4155) {
			throw new RuntimeException("gnpov1");
		}
		Static219.anInt4155 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static57.anIntArray91[local18];
			@Pc(64) Class24_Sub3_Sub2_Sub1 local64 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) local56)).aClass24_Sub3_Sub2_Sub1_2;
			@Pc(69) int local69 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
			if (local69 == 0) {
				Static57.anIntArray91[Static219.anInt4155++] = local56;
				local64.anInt6234 = Static400.anInt6752;
			} else {
				@Pc(92) int local92 = Static203.aClass10_Sub8_Sub2_1.method2525(2);
				if (local92 == 0) {
					Static57.anIntArray91[Static219.anInt4155++] = local56;
					local64.anInt6234 = Static400.anInt6752;
					Static64.anIntArray97[Static216.anInt4132++] = local56;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local92 == 1) {
						Static57.anIntArray91[Static219.anInt4155++] = local56;
						local64.anInt6234 = Static400.anInt6752;
						local136 = Static203.aClass10_Sub8_Sub2_1.method2525(3);
						local64.method2896(local136, 1);
						local146 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
						if (local146 == 1) {
							Static64.anIntArray97[Static216.anInt4132++] = local56;
						}
					} else if (local92 == 2) {
						Static57.anIntArray91[Static219.anInt4155++] = local56;
						local64.anInt6234 = Static400.anInt6752;
						if (Static203.aClass10_Sub8_Sub2_1.method2525(1) == 1) {
							local136 = Static203.aClass10_Sub8_Sub2_1.method2525(3);
							local64.method2896(local136, 2);
							local146 = Static203.aClass10_Sub8_Sub2_1.method2525(3);
							local64.method2896(local146, 2);
						} else {
							local136 = Static203.aClass10_Sub8_Sub2_1.method2525(3);
							local64.method2896(local136, 0);
						}
						local136 = Static203.aClass10_Sub8_Sub2_1.method2525(1);
						if (local136 == 1) {
							Static64.anIntArray97[Static216.anInt4132++] = local56;
						}
					} else if (local92 == 3) {
						Static409.anIntArray664[Static239.anInt4238++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZLclient!sf;)V")
	public static void method5147(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class24_Sub3_Sub2_Sub2 arg1) {
		if (Static207.anInt4055 >= 400) {
			return;
		}
		if (Static263.aClass24_Sub3_Sub2_Sub2_4 != arg1) {
			@Pc(83) String local83;
			@Pc(129) int local129;
			if (arg1.anInt6326 == 0) {
				@Pc(87) boolean local87 = true;
				if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6305 != -1 && arg1.anInt6305 != -1) {
					@Pc(107) int local107 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314 > arg1.anInt6314 ? Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314 : arg1.anInt6314;
					@Pc(118) int local118 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6305 >= arg1.anInt6305 ? arg1.anInt6305 : Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6305;
					local129 = local107 * 10 / 100 + local118 + 5;
					@Pc(136) int local136 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314 - arg1.anInt6314;
					if (local136 < 0) {
						local136 = -local136;
					}
					if (local136 > local129) {
						local87 = false;
					}
				}
				@Pc(164) String local164 = Static424.aClass147_4 == Static102.aClass147_3 ? Static278.aClass182_212.method4155(Static191.anInt3842) : Static445.aClass182_256.method4155(Static191.anInt3842);
				if (arg1.anInt6314 < arg1.anInt6309) {
					local83 = arg1.method4933() + (local87 ? Static81.method1537(arg1.anInt6314, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314) : "<col=ffffff>") + " (" + local164 + arg1.anInt6314 + "+" + (arg1.anInt6309 - arg1.anInt6314) + ")";
				} else {
					local83 = arg1.method4933() + (local87 ? Static81.method1537(arg1.anInt6314, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314) : "<col=ffffff>") + " (" + local164 + arg1.anInt6314 + ")";
				}
			} else {
				local83 = arg1.method4933() + " (" + Static460.aClass182_262.method4155(Static191.anInt3842) + arg1.anInt6326 + ")";
			}
			if (Static401.aBoolean489) {
				if (!arg0 && (Static46.anInt880 & 0x8) != 0) {
					Static260.method3744(Static312.aString52, 25, (long) arg1.anInt6228, 0, false, Static24.anInt394, Static70.aString10 + " -> <col=ffffff>" + local83, true, -1, 0);
				}
			} else if (arg0) {
				Static260.method3744("<col=cccccc>" + local83, -1, 0L, 0, true, -1, "", false, 0, 0);
			} else {
				for (@Pc(247) int local247 = 7; local247 >= 0; local247--) {
					if (Static456.aStringArray58[local247] != null) {
						@Pc(255) short local255 = 0;
						if (Static102.aClass147_3 == Static53.aClass147_2 && Static456.aStringArray58[local247].equalsIgnoreCase(Static440.aClass182_253.method4155(Static191.anInt3842))) {
							if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314 < arg1.anInt6314) {
								local255 = 2000;
							}
							if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6327 != 0 && arg1.anInt6327 != 0) {
								if (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6327 == arg1.anInt6327) {
									local255 = 2000;
								} else {
									local255 = 0;
								}
							}
						} else if (Static215.aBooleanArray12[local247]) {
							local255 = 2000;
						}
						@Pc(317) short local317 = (short) (local255 + Static54.aShortArray10[local247]);
						local129 = Static268.anIntArray479[local247] == -1 ? Static244.anInt4706 : Static268.anIntArray479[local247];
						Static260.method3744(Static456.aStringArray58[local247], local317, (long) arg1.anInt6228, 0, false, local129, "<col=ffffff>" + local83, true, -1, 0);
					}
				}
			}
			if (!arg0) {
				for (@Pc(425) Class10_Sub45 local425 = (Class10_Sub45) Static70.aClass163_13.method3620(); local425 != null; local425 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
					if (local425.anInt7505 == 5) {
						local425.aString72 = "<col=ffffff>" + local83;
						return;
					}
				}
			}
		} else if (Static401.aBoolean489 && (Static46.anInt880 & 0x10) != 0) {
			Static260.method3744(Static312.aString52, 18, 0L, 0, false, Static24.anInt394, Static70.aString10 + " -> <col=ffffff>" + Static71.aClass182_49.method4155(Static191.anInt3842), true, -1, 0);
		}
	}
}
