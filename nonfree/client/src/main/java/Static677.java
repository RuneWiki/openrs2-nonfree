import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public static int anInt10869;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
	public static final int anInt10863 = 328;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!eg;")
	public static final Class97 aClass97_6 = new Class97(64);

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!jha;IZ)V")
	public static void method9031(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static483.anInt8099 >= 400) {
			return;
		}
		if (arg0 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1) {
			@Pc(90) String local90;
			if (arg0.anInt5533 == 0) {
				@Pc(101) boolean local101 = true;
				if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5564 != -1 && arg0.anInt5564 != -1) {
					@Pc(125) int local125 = arg0.anInt5564 > Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5564 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5564 : arg0.anInt5564;
					@Pc(132) int local132 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549 - arg0.anInt5549;
					if (local132 < 0) {
						local132 = -local132;
					}
					if (local125 < local132) {
						local101 = false;
					}
				}
				@Pc(159) String local159 = Static409.aClass98_3 == Static218.aClass98_2 ? Static64.aClass52_30.method907(Static544.anInt8937) : Static64.aClass52_28.method907(Static544.anInt8937);
				if (arg0.anInt5549 < arg0.anInt5528) {
					local90 = arg0.method4607() + (local101 ? Static78.method1012(arg0.anInt5549, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549) : "<col=ffffff>") + " (" + local159 + arg0.anInt5549 + "+" + (arg0.anInt5528 - arg0.anInt5549) + ")";
				} else {
					local90 = arg0.method4607() + (local101 ? Static78.method1012(arg0.anInt5549, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549) : "<col=ffffff>") + " (" + local159 + arg0.anInt5549 + ")";
				}
			} else if (arg0.anInt5533 == -1) {
				local90 = arg0.method4607();
			} else {
				local90 = arg0.method4607() + " (" + Static64.aClass52_29.method907(Static544.anInt8937) + arg0.anInt5533 + ")";
			}
			if (Static55.aBoolean60 && !arg1 && (Static24.anInt7340 & 0x8) != 0) {
				Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, false, (long) arg0.anInt5512, 0, 12, (long) arg0.anInt5512, 0, Static199.aString28 + " -> <col=ffffff>" + local90, true);
			}
			if (arg1) {
				Static282.method4539("<col=cccccc>" + local90, true, 0, -1, false, 0L, 0, -1, (long) arg0.anInt5512, 0, "", false);
			} else {
				for (@Pc(277) int local277 = 7; local277 >= 0; local277--) {
					if (Static459.aStringArray46[local277] != null) {
						@Pc(285) short local285 = 0;
						if (Static218.aClass98_2 == Static599.aClass98_6 && Static459.aStringArray46[local277].equalsIgnoreCase(Static64.aClass52_23.method907(Static544.anInt8937))) {
							if (Static360.aBoolean579 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5549 < arg0.anInt5549) {
								local285 = 2000;
							}
							if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5535 == 0 || arg0.anInt5535 == 0) {
								if (arg0.aBoolean476) {
									local285 = 2000;
								}
							} else if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt5535 == arg0.anInt5535) {
								local285 = 2000;
							} else {
								local285 = 0;
							}
						} else if (Static147.aBooleanArray12[local277]) {
							local285 = 2000;
						}
						@Pc(349) short local349 = (short) (local285 + Static91.aShortArray28[local277]);
						@Pc(360) int local360 = Static361.anIntArray374[local277] == -1 ? Static300.anInt10361 : Static361.anIntArray374[local277];
						Static282.method4539(Static459.aStringArray46[local277], false, -1, local360, false, (long) arg0.anInt5512, 0, local349, (long) arg0.anInt5512, 0, "<col=ffffff>" + local90, true);
					}
				}
			}
			if (!arg1) {
				for (@Pc(424) Class5_Sub3_Sub20 local424 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local424 != null; local424 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
					if (local424.anInt10178 == 16) {
						local424.aString102 = "<col=ffffff>" + local90;
						return;
					}
				}
			}
		} else if (Static55.aBoolean60 && (Static24.anInt7340 & 0x10) != 0) {
			Static282.method4539(Static421.aString59, false, -1, Static233.anInt4241, false, 0L, 0, 49, (long) arg0.anInt5512, 0, Static199.aString28 + " -> <col=ffffff>" + Static64.aClass52_37.method907(Static544.anInt8937), true);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Lclient!tha;")
	public static Class214 method9032() {
		try {
			return (Class214) Class.forName("Class214_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZII)I")
	public static int method9033(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub43 local8 = Static10.method153(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < local8.anIntArray405.length; local21++) {
				if (local8.anIntArray406[local21] == arg1) {
					local19 += local8.anIntArray405[local21];
				}
			}
			return local19;
		}
	}
}
