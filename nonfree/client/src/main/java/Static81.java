import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
	public static int anInt1871;

	@OriginalMember(owner = "client!fj", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[200];

	@OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
	public static int anInt1874 = -1;

	@OriginalMember(owner = "client!fj", name = "ab", descriptor = "Lclient!cc;")
	public static Class26 aClass26_16 = new Class26(16);

	@OriginalMember(owner = "client!fj", name = "eb", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!wf;III)V")
	public static void method1427(@OriginalArg(0) Class189 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5916 == 1) {
			Static84.method1497(0L, 0, arg0.anInt5918, "", arg0.aString356, (short) 57, -1);
		}
		@Pc(35) String local35;
		if (arg0.anInt5916 == 2 && !Static135.aBoolean177) {
			local35 = Static51.method780(arg0);
			if (local35 != null) {
				Static84.method1497(0L, -1, arg0.anInt5918, "<col=00ff00>" + arg0.aString360, local35, (short) 34, -1);
			}
		}
		if (arg0.anInt5916 == 3) {
			Static84.method1497(0L, 0, arg0.anInt5918, "", Static5.aString8, (short) 7, -1);
		}
		if (arg0.anInt5916 == 4) {
			Static84.method1497(0L, 0, arg0.anInt5918, "", arg0.aString356, (short) 18, -1);
		}
		if (arg0.anInt5916 == 5) {
			Static84.method1497(0L, 0, arg0.anInt5918, "", arg0.aString356, (short) 11, -1);
		}
		if (arg0.anInt5916 == 6 && Static252.aClass189_14 == null) {
			Static84.method1497(0L, -1, arg0.anInt5918, "", arg0.aString356, (short) 3, -1);
		}
		@Pc(162) int local162;
		@Pc(160) int local160;
		if (arg0.anInt5915 == 2) {
			local160 = 0;
			for (local162 = 0; local162 < arg0.anInt5954; local162++) {
				for (@Pc(172) int local172 = 0; local172 < arg0.anInt5931; local172++) {
					@Pc(187) int local187 = local172 * (arg0.anInt5947 + 32);
					@Pc(195) int local195 = local162 * (arg0.anInt5968 + 32);
					if (local160 < 20) {
						local195 += arg0.anIntArray663[local160];
						local187 += arg0.anIntArray664[local160];
					}
					if (arg2 >= local187 && arg1 >= local195 && local187 + 32 > arg2 && arg1 < local195 + 32) {
						Static152.anInt2989 = local160;
						Static246.aClass189_13 = arg0;
						if (arg0.anIntArray660[local160] > 0) {
							@Pc(257) Class4_Sub21 local257 = Static41.method687(arg0);
							@Pc(266) Class165 local266 = Static287.method4398(arg0.anIntArray660[local160] - 1);
							if (Static69.anInt1334 == 1 && local257.method3295()) {
								if (Static223.anInt4303 != arg0.anInt5918 || Static22.anInt314 != local160) {
									Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, Static313.aString372 + " -> <col=ff9040>" + local266.aString315, Static194.aString321, (short) 15, -1);
								}
							} else if (Static135.aBoolean177 && local257.method3295()) {
								@Pc(290) Class4_Sub3_Sub12 local290 = Static218.anInt4225 == -1 ? null : Static114.method1816(Static218.anInt4225);
								if ((Static187.anInt3560 & 0x10) != 0 && (local290 == null || local266.method4170(Static218.anInt4225, local290.anInt2546) != local290.anInt2546)) {
									Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, Static69.aString81 + " -> <col=ff9040>" + local266.aString315, Static155.aString140, (short) 50, Static237.anInt4467);
								}
							} else {
								@Pc(340) String[] local340 = local266.aStringArray32;
								if (Static185.aBoolean254) {
									local340 = Static278.method4337(local340);
								}
								@Pc(353) int local353;
								@Pc(373) byte local373;
								if (local257.method3295()) {
									for (local353 = 4; local353 >= 3; local353--) {
										if (local340 != null && local340[local353] != null) {
											if (local353 == 3) {
												local373 = 10;
											} else {
												local373 = 51;
											}
											Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, "<col=ff9040>" + local266.aString315, local340[local353], local373, -1);
										}
									}
								}
								if (local257.method3288()) {
									Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, "<col=ff9040>" + local266.aString315, Static194.aString321, (short) 9, Static82.anInt1937);
								}
								if (local257.method3295() && local340 != null) {
									for (local353 = 2; local353 >= 0; local353--) {
										if (local340[local353] != null) {
											local373 = 0;
											if (local353 == 0) {
												local373 = 58;
											}
											if (local353 == 1) {
												local373 = 35;
											}
											if (local353 == 2) {
												local373 = 17;
											}
											Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, "<col=ff9040>" + local266.aString315, local340[local353], local373, -1);
										}
									}
								}
								local340 = arg0.aStringArray44;
								if (Static185.aBoolean254) {
									local340 = Static278.method4337(local340);
								}
								if (local340 != null) {
									for (local353 = 4; local353 >= 0; local353--) {
										if (local340[local353] != null) {
											local373 = 0;
											if (local353 == 0) {
												local373 = 30;
											}
											if (local353 == 1) {
												local373 = 20;
											}
											if (local353 == 2) {
												local373 = 13;
											}
											if (local353 == 3) {
												local373 = 2;
											}
											if (local353 == 4) {
												local373 = 49;
											}
											Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, "<col=ff9040>" + local266.aString315, local340[local353], local373, -1);
										}
									}
								}
								Static84.method1497((long) local266.anInt5067, local160, arg0.anInt5918, "<col=ff9040>" + local266.aString315, Static13.aString22, (short) 1001, Static110.anInt2232);
							}
						}
					}
					local160++;
				}
			}
		}
		if (!arg0.aBoolean417) {
			return;
		}
		if (!Static135.aBoolean177) {
			for (local160 = 9; local160 >= 5; local160--) {
				@Pc(712) String local712 = Static161.method2610(local160, arg0);
				if (local712 != null) {
					Static84.method1497((long) (local160 + 1), arg0.anInt5972, arg0.anInt5918, arg0.aString359, local712, (short) 1009, Static253.method4022(arg0, local160));
				}
			}
			local35 = Static51.method780(arg0);
			if (local35 != null) {
				Static84.method1497(0L, arg0.anInt5972, arg0.anInt5918, arg0.aString359, local35, (short) 34, -1);
			}
			for (local162 = 4; local162 >= 0; local162--) {
				@Pc(774) String local774 = Static161.method2610(local162, arg0);
				if (local774 != null) {
					Static84.method1497((long) (local162 + 1), arg0.anInt5972, arg0.anInt5918, arg0.aString359, local774, (short) 23, Static253.method4022(arg0, local162));
				}
			}
			if (Static41.method687(arg0).method3287()) {
				if (arg0.aString361 == null) {
					Static84.method1497(0L, arg0.anInt5972, arg0.anInt5918, "", Static169.aString201, (short) 3, -1);
				} else {
					Static84.method1497(0L, arg0.anInt5972, arg0.anInt5918, "", arg0.aString361, (short) 3, -1);
				}
			}
		} else if (Static41.method687(arg0).method3293() && (Static187.anInt3560 & 0x20) != 0) {
			Static84.method1497(0L, arg0.anInt5972, arg0.anInt5918, Static69.aString81 + " -> " + arg0.aString359, Static155.aString140, (short) 1, Static237.anInt4467);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!qc;)V")
	public static void method1428(@OriginalArg(1) int arg0, @OriginalArg(2) Class53_Sub1 arg1) {
		if (Static50.anInt954 < arg1.anInt4034) {
			Static271.method4271(arg1);
		} else if (arg1.anInt3966 < Static50.anInt954) {
			Static257.method4061(arg1);
		} else {
			Static171.method2718(arg1);
		}
		if (arg1.anInt3974 < 128 || arg1.anInt4002 < 128 || arg1.anInt3974 >= 13184 || arg1.anInt4002 >= 13184) {
			arg1.anInt3966 = 0;
			arg1.anInt4034 = 0;
			arg1.anInt3961 = -1;
			arg1.anInt4007 = -1;
			arg1.anInt3974 = arg1.anIntArray422[0] * 128 + arg1.method3324() * 64;
			arg1.anInt4002 = arg1.anIntArray426[0] * 128 + arg1.method3324() * 64;
			arg1.method3320();
		}
		if (Static154.aClass53_Sub1_Sub1_2 == arg1 && (arg1.anInt3974 < 1536 || arg1.anInt4002 < 1536 || arg1.anInt3974 >= 11776 || arg1.anInt4002 >= 11776)) {
			arg1.anInt3961 = -1;
			arg1.anInt3966 = 0;
			arg1.anInt4034 = 0;
			arg1.anInt4007 = -1;
			arg1.anInt3974 = arg1.anIntArray422[0] * 128 + arg1.method3324() * 64;
			arg1.anInt4002 = arg1.anIntArray426[0] * 128 + arg1.method3324() * 64;
			arg1.method3320();
		}
		Static272.method4284(arg1);
		Static55.method939(arg1);
	}
}
