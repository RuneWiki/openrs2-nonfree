import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt5743;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ja;B)V")
	public static void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1) {
		Static267.method4531(arg1);
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (arg0 > 1) {
			for (local14 = 0; local14 < Static153.anInt2883; local14++) {
				for (local18 = 0; local18 < Static246.anInt4606; local18++) {
					if ((Static265.aByteArrayArrayArray11[1][local14][local18] & 0x2) == 2) {
						Static181.method3457(local14, local18);
					}
				}
			}
		}
		for (local14 = 0; local14 < arg0; local14++) {
			for (local18 = 0; local18 <= Static246.anInt4606; local18++) {
				for (@Pc(62) int local62 = 0; local62 <= Static153.anInt2883; local62++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(106) int local106;
					@Pc(133) int local133;
					@Pc(225) int local225;
					@Pc(233) int local233;
					@Pc(253) int local253;
					@Pc(257) int local257;
					if ((Static238.aByteArrayArrayArray13[local14][local62][local18] & 0x1) != 0) {
						local79 = local18;
						local81 = local18;
						local83 = local14;
						while (local81 < Static246.anInt4606 && (Static238.aByteArrayArrayArray13[local14][local62][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						local106 = local14;
						while (local79 > 0 && (Static238.aByteArrayArrayArray13[local14][local62][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						label164: while (local83 > 0) {
							for (local133 = local79; local133 <= local81; local133++) {
								if ((Static238.aByteArrayArrayArray13[local83 - 1][local62][local133] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local106 < 3) {
							for (local133 = local79; local133 <= local81; local133++) {
								if ((Static238.aByteArrayArrayArray13[local106 + 1][local62][local133] & 0x1) == 0) {
									break label153;
								}
							}
							local106++;
						}
						local133 = (local106 + 1 - local83) * (local81 + 1 - local79);
						if (local133 >= 2) {
							local225 = Static5.anIntArrayArrayArray1[local106][local62][local79] - 240;
							local233 = Static5.anIntArrayArrayArray1[local83][local62][local79];
							Static135.method5227(1, local62 * 128, local62 * 128, local79 * 128, local81 * 128 + 128, local225, local233);
							for (local253 = local83; local253 <= local106; local253++) {
								for (local257 = local79; local257 <= local81; local257++) {
									Static238.aByteArrayArrayArray13[local253][local62][local257] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static238.aByteArrayArrayArray13[local14][local62][local18] & 0x2) != 0) {
						local79 = local62;
						local81 = local62;
						local83 = local14;
						while (local79 > 0 && (Static238.aByteArrayArrayArray13[local14][local79 - 1][local18] & 0x2) != 0) {
							local79--;
						}
						local106 = local14;
						while (Static153.anInt2883 > local81 && (Static238.aByteArrayArrayArray13[local14][local81 + 1][local18] & 0x2) != 0) {
							local81++;
						}
						label218: while (local83 > 0) {
							for (local133 = local79; local133 <= local81; local133++) {
								if ((Static238.aByteArrayArrayArray13[local83 - 1][local133][local18] & 0x2) == 0) {
									break label218;
								}
							}
							local83--;
						}
						label207: while (local106 < 3) {
							for (local133 = local79; local133 <= local81; local133++) {
								if ((Static238.aByteArrayArrayArray13[local106 + 1][local133][local18] & 0x2) == 0) {
									break label207;
								}
							}
							local106++;
						}
						local133 = (local106 + 1 - local83) * (local81 + 1 - local79);
						if (local133 >= 2) {
							local225 = Static5.anIntArrayArrayArray1[local106][local79][local18] - 240;
							local233 = Static5.anIntArrayArrayArray1[local83][local79][local18];
							Static135.method5227(2, local79 * 128, local81 * 128 + 128, local18 * 128, local18 * 128, local225, local233);
							for (local253 = local83; local253 <= local106; local253++) {
								for (local257 = local79; local257 <= local81; local257++) {
									Static238.aByteArrayArrayArray13[local253][local257][local18] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static238.aByteArrayArrayArray13[local14][local62][local18] & 0x4) != 0) {
						local79 = local62;
						local81 = local62;
						local83 = local18;
						local106 = local18;
						while (local83 > 0 && (Static238.aByteArrayArrayArray13[local14][local62][local83 - 1] & 0x4) != 0) {
							local83--;
						}
						while (Static246.anInt4606 > local106 && (Static238.aByteArrayArrayArray13[local14][local62][local106 + 1] & 0x4) != 0) {
							local106++;
						}
						label272: while (local79 > 0) {
							for (local133 = local83; local133 <= local106; local133++) {
								if ((Static238.aByteArrayArrayArray13[local14][local79 - 1][local133] & 0x4) == 0) {
									break label272;
								}
							}
							local79--;
						}
						label261: while (Static153.anInt2883 > local81) {
							for (local133 = local83; local133 <= local106; local133++) {
								if ((Static238.aByteArrayArrayArray13[local14][local81 + 1][local133] & 0x4) == 0) {
									break label261;
								}
							}
							local81++;
						}
						if ((local106 + 1 - local83) * (local81 + 1 - local79) >= 4) {
							local133 = Static5.anIntArrayArrayArray1[local14][local79][local83];
							Static135.method5227(4, local79 * 128, local81 * 128 + 128, local83 * 128, local106 * 128 + 128, local133, local133);
							for (@Pc(674) int local674 = local79; local674 <= local81; local674++) {
								for (local225 = local83; local225 <= local106; local225++) {
									Static238.aByteArrayArrayArray13[local14][local674][local225] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method5214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
