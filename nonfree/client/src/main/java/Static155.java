import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString30 = null;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public static int anInt2774 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V")
	public static void method2528(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(21) int local21 = (arg2 + arg1) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) long local27 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local27;
		@Pc(41) Object local41 = arg3[local21];
		arg3[local21] = arg3[arg2];
		arg3[arg2] = local41;
		@Pc(61) int local61 = ~local27 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg2; local63++) {
			if ((long) (local63 & local61) + local27 > arg0[local63]) {
				@Pc(80) long local80 = arg0[local63];
				arg0[local63] = arg0[local23];
				arg0[local23] = local80;
				@Pc(94) Object local94 = arg3[local63];
				arg3[local63] = arg3[local23];
				arg3[local23++] = local94;
			}
		}
		arg0[arg2] = arg0[local23];
		arg0[local23] = local27;
		arg3[arg2] = arg3[local23];
		arg3[local23] = local41;
		method2528(arg0, arg1, local23 - 1, arg3);
		method2528(arg0, local23 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ha;Ljava/lang/String;)I")
	public static int method2530(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) String arg1) {
		@Pc(14) int local14 = arg0.anInt3487;
		@Pc(18) byte[] local18 = Static289.method4310(arg1);
		arg0.method3133(local18.length);
		arg0.anInt3487 += Static345.aClass183_1.method4216(arg0.aByteArray51, 0, local18, arg0.anInt3487, local18.length);
		return arg0.anInt3487 - local14;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method2531(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub1_Sub12 local13 = Static449.method5975(arg0, 1);
		local13.method3048();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uj;ZB)V")
	public static void method2532(@OriginalArg(0) Class3_Sub3_Sub6_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static228.anInt3878 >= 400) {
			return;
		}
		@Pc(12) Class17 local12 = arg0.aClass17_1;
		if (local12.anIntArray26 != null) {
			local12 = local12.method288(Static71.aClass126_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean19) {
			return;
		}
		@Pc(37) String local37 = local12.aString2;
		if (local12.anInt341 != 0) {
			@Pc(56) String local56 = Static193.aClass44_3 == Static323.aClass44_4 ? Static170.aClass231_28.method5138(Static382.anInt6289) : Static371.aClass231_100.method5138(Static382.anInt6289);
			local37 = local37 + Static302.method4394(local12.anInt341, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504) + " (" + local56 + local12.anInt341 + ")";
		}
		if (!Static274.aBoolean336) {
			if (!arg1) {
				@Pc(142) String[] local142 = local12.aStringArray1;
				if (Static60.aBoolean107) {
					local142 = Static336.method4770(local142);
				}
				@Pc(152) int local152;
				if (local142 != null) {
					for (local152 = 4; local152 >= 0; local152--) {
						if (local142[local152] != null && (Static323.aClass44_4 != Static307.aClass44_2 || !local142[local152].equalsIgnoreCase(Static188.aClass231_52.method5138(Static382.anInt6289)))) {
							@Pc(172) byte local172 = 0;
							if (local152 == 0) {
								local172 = 30;
							}
							@Pc(181) int local181 = Static414.anInt6928;
							if (local152 == 1) {
								local172 = 44;
							}
							if (local152 == 2) {
								local172 = 10;
							}
							if (local152 == 3) {
								local172 = 22;
							}
							if (local12.anInt360 == local152) {
								local181 = local12.anInt327;
							}
							if (local152 == 4) {
								local172 = 45;
							}
							if (local12.anInt350 == local152) {
								local181 = local12.anInt352;
							}
							Static361.method5112("<col=ffff00>" + local37, local172, 0, 0, local181, true, local142[local152], -1, (long) arg0.anInt6731, false);
						}
					}
				}
				if (Static307.aClass44_2 == Static323.aClass44_4 && local142 != null) {
					for (local152 = 4; local152 >= 0; local152--) {
						if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static188.aClass231_52.method5138(Static382.anInt6289))) {
							@Pc(275) short local275 = 0;
							if (local12.anInt341 > Static134.aClass3_Sub3_Sub6_Sub1_1.anInt5504) {
								local275 = 2000;
							}
							@Pc(288) short local288 = 0;
							if (local152 == 0) {
								local288 = 30;
							}
							if (local152 == 1) {
								local288 = 44;
							}
							if (local152 == 2) {
								local288 = 10;
							}
							if (local152 == 3) {
								local288 = 22;
							}
							if (local152 == 4) {
								local288 = 45;
							}
							if (local288 != 0) {
								local288 += local275;
							}
							Static361.method5112("<col=ffff00>" + local37, local288, 0, 0, local12.anInt361, true, local142[local152], -1, (long) arg0.anInt6731, false);
						}
					}
				}
			}
			Static361.method5112("<col=ffff00>" + local37, 1011, 0, 0, Static134.anInt2365, true, Static85.aClass231_26.method5138(Static382.anInt6289), -1, (long) arg0.anInt6731, arg1);
		} else if (!arg1) {
			@Pc(94) Class255 local94 = Static415.anInt6945 == -1 ? null : Static414.aClass258_2.method5882(Static415.anInt6945);
			if ((Static172.anInt3044 & 0x2) != 0) {
				if (local94 == null || local12.method291(Static415.anInt6945, local94.anInt7133) != local94.anInt7133) {
					Static361.method5112(Static263.aString38 + " -> <col=ffff00>" + local37, 5, 0, 0, Static60.anInt1241, true, Static26.aString21, -1, (long) arg0.anInt6731, false);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method2533() {
		for (@Pc(3) int local3 = 0; local3 < Static147.anInt7038; local3++) {
			@Pc(9) int local9 = Static345.anIntArray507[local3];
			@Pc(13) Class3_Sub3_Sub6_Sub2 local13 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local9];
			if (local13 != null) {
				Static168.method2732(local13, local13.aClass17_1.anInt344);
			}
		}
	}
}
