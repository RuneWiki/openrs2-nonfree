import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!oh", name = "Yc", descriptor = "Lclient!qda;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!oh", name = "Zc", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_10 = new Class137("", 14);

	@OriginalMember(owner = "client!oh", name = "qd", descriptor = "Lclient!dba;")
	public static final Class63 aClass63_18 = new Class63();

	@OriginalMember(owner = "client!oh", name = "sd", descriptor = "Z")
	public static boolean aBoolean502 = false;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "(I)V")
	public static void method5651(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static89.anInt1889 == 2) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[0]);
				Static174.aClass136Array1[1].method3395(Static12.aClass187Array2[1]);
			} else if (Static89.anInt1889 == 3) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[0]);
				Static174.aClass136Array1[1].method3395(Static12.aClass187Array2[1]);
				Static174.aClass136Array1[2].method3395(Static12.aClass187Array2[2]);
			} else {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[0]);
				Static174.aClass136Array1[1].method3395(Static12.aClass187Array2[1]);
				Static174.aClass136Array1[2].method3395(Static12.aClass187Array2[2]);
				Static174.aClass136Array1[3].method3395(Static12.aClass187Array2[3]);
			}
		} else if (arg0 == 1) {
			if (Static89.anInt1889 == 2) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[2]);
			} else if (Static89.anInt1889 == 3) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[3]);
				Static174.aClass136Array1[1].method3395(Static12.aClass187Array2[4]);
			} else {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[4]);
				Static174.aClass136Array1[1].method3395(Static12.aClass187Array2[5]);
				Static174.aClass136Array1[2].method3395(Static12.aClass187Array2[6]);
			}
		} else if (arg0 == 2) {
			if (Static89.anInt1889 == 2) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[3]);
				return;
			}
			if (Static89.anInt1889 == 3) {
				Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[5]);
				return;
			}
			Static174.aClass136Array1[0].method3395(Static12.aClass187Array2[7]);
		}
	}

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "(I)V")
	public static void method5654() {
		Static247.aClass6_26.method94();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
	public static boolean method5657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static352.method5160(arg1, arg0) | (arg1 & 0x60000) != 0 || Static365.method5322(arg1, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!wn;Z)V")
	public static void method5658(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static571.anInt9281 >= 400) {
			return;
		}
		if (arg0 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2) {
			@Pc(183) String local183;
			@Pc(102) int local102;
			if (arg0.anInt9572 == 0) {
				@Pc(57) boolean local57 = true;
				if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9539 != -1 && arg0.anInt9539 != -1) {
					@Pc(81) int local81 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571 > arg0.anInt9571 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571 : arg0.anInt9571;
					@Pc(92) int local92 = arg0.anInt9539 > Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9539 ? Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9539 : arg0.anInt9539;
					local102 = local92 + local81 * 10 / 100 + 5;
					@Pc(109) int local109 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571 - arg0.anInt9571;
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local109 > local102) {
						local57 = false;
					}
				}
				@Pc(136) String local136 = Static121.aClass274_1 == Static473.aClass274_4 ? Static544.aClass343_34.method7222(Static256.anInt4535) : Static544.aClass343_32.method7222(Static256.anInt4535);
				if (arg0.anInt9542 > arg0.anInt9571) {
					local183 = arg0.method7884() + (local57 ? Static14.method210(arg0.anInt9571, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571) : "<col=ffffff>") + " (" + local136 + arg0.anInt9571 + "+" + (arg0.anInt9542 - arg0.anInt9571) + ")";
				} else {
					local183 = arg0.method7884() + (local57 ? Static14.method210(arg0.anInt9571, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571) : "<col=ffffff>") + " (" + local136 + arg0.anInt9571 + ")";
				}
			} else if (arg0.anInt9572 == -1) {
				local183 = arg0.method7884();
			} else {
				local183 = arg0.method7884() + " (" + Static544.aClass343_33.method7222(Static256.anInt4535) + arg0.anInt9572 + ")";
			}
			if (Static369.aBoolean463 && !arg1 && (Static215.anInt3875 & 0x8) != 0) {
				Static137.method2680(-1, 0, Static585.aString93 + " -> <col=ffffff>" + local183, (long) arg0.anInt9472, true, 23, Static16.aString4, false, Static288.anInt4931, 0);
			}
			if (arg1) {
				Static137.method2680(0, 0, "", 0L, false, -1, "<col=cccccc>" + local183, true, -1, 0);
			} else {
				for (@Pc(297) int local297 = 7; local297 >= 0; local297--) {
					if (Static478.aStringArray32[local297] != null) {
						@Pc(305) short local305 = 0;
						if (Static121.aClass274_1 == Static176.aClass274_2 && Static478.aStringArray32[local297].equalsIgnoreCase(Static544.aClass343_27.method7222(Static256.anInt4535))) {
							if (arg0.anInt9571 > Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571) {
								local305 = 2000;
							}
							if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9574 != 0 && arg0.anInt9574 != 0) {
								if (arg0.anInt9574 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9574) {
									local305 = 2000;
								} else {
									local305 = 0;
								}
							}
						} else if (Static32.aBooleanArray1[local297]) {
							local305 = 2000;
						}
						@Pc(366) short local366 = (short) (Static391.aShortArray100[local297] + local305);
						local102 = Static413.anIntArray439[local297] == -1 ? Static559.anInt9109 : Static413.anIntArray439[local297];
						Static137.method2680(-1, 0, "<col=ffffff>" + local183, (long) arg0.anInt9472, true, local366, Static478.aStringArray32[local297], false, local102, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(442) Class3_Sub43 local442 = (Class3_Sub43) Static133.aClass112_20.method3088(); local442 != null; local442 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
					if (local442.anInt7753 == 19) {
						local442.aString74 = "<col=ffffff>" + local183;
						return;
					}
				}
			}
		} else if (Static369.aBoolean463 && (Static215.anInt3875 & 0x10) != 0) {
			Static137.method2680(-1, 0, Static585.aString93 + " -> <col=ffffff>" + Static544.aClass343_41.method7222(Static256.anInt4535), 0L, true, 25, Static16.aString4, false, Static288.anInt4931, 0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)Z")
	public static boolean method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
