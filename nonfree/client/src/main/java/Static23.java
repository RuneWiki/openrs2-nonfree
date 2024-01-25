import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!gm;")
	public static final Class95 aClass95_1 = Static406.method5493();

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "[Lclient!wk;")
	public static final Class264[] aClass264Array1 = new Class264[4];

	@OriginalMember(owner = "client!aw", name = "P", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_6 = new Class237(79, -2);

	@OriginalMember(owner = "client!aw", name = "S", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_7 = new Class84("K", "T", "K", "K");

	@OriginalMember(owner = "client!aw", name = "T", descriptor = "[B")
	public static final byte[] aByteArray11 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IBLclient!ir;II)V")
	public static void method426(@OriginalArg(0) int arg0, @OriginalArg(2) Class26_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class164 local17 = arg1.method5533();
		@Pc(27) int local27 = arg1.anInt7144 - arg1.aClass255_7.anInt7406 & 0x3FFF;
		if (arg2 == -1) {
			if (local27 != 0 || arg1.anInt7141 > 25) {
				if (arg3 < 0 && local17.anInt4677 != -1) {
					arg1.anInt7122 = local17.anInt4677;
				} else if (arg3 <= 0 || local17.anInt4672 == -1) {
					arg1.anInt7122 = local17.anInt4679;
				} else {
					arg1.anInt7122 = local17.anInt4672;
				}
				arg1.aBoolean458 = false;
			} else if (!arg1.aBoolean458 || !local17.method3821(arg1.anInt7122)) {
				arg1.anInt7122 = local17.method3817();
				arg1.aBoolean458 = arg1.anInt7122 != -1;
			}
		} else if (arg1.anInt7090 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(291) int local291 = Static400.anIntArray574[arg0] - arg1.aClass255_7.anInt7406 & 0x3FFF;
			if (arg2 == 2 && local17.anInt4695 != -1) {
				if (local291 > 2048 && local291 <= 6144 && local17.anInt4676 != -1) {
					arg1.anInt7122 = local17.anInt4676;
				} else if (local291 >= 10240 && local291 < 14336 && local17.anInt4698 != -1) {
					arg1.anInt7122 = local17.anInt4698;
				} else if (local291 <= 6144 || local291 >= 10240 || local17.anInt4680 == -1) {
					arg1.anInt7122 = local17.anInt4695;
				} else {
					arg1.anInt7122 = local17.anInt4680;
				}
			} else if (arg2 == 0 && local17.anInt4697 != -1) {
				if (local291 > 2048 && local291 <= 6144 && local17.anInt4669 != -1) {
					arg1.anInt7122 = local17.anInt4669;
				} else if (local291 >= 10240 && local291 < 14336 && local17.anInt4666 != -1) {
					arg1.anInt7122 = local17.anInt4666;
				} else if (local291 <= 6144 || local291 >= 10240 || local17.anInt4701 == -1) {
					arg1.anInt7122 = local17.anInt4697;
				} else {
					arg1.anInt7122 = local17.anInt4701;
				}
			} else if (local291 > 2048 && local291 <= 6144 && local17.anInt4664 != -1) {
				arg1.anInt7122 = local17.anInt4664;
			} else if (local291 >= 10240 && local291 < 14336 && local17.anInt4689 != -1) {
				arg1.anInt7122 = local17.anInt4689;
			} else if (local291 <= 6144 || local291 >= 10240 || local17.anInt4684 == -1) {
				arg1.anInt7122 = local17.anInt4679;
			} else {
				arg1.anInt7122 = local17.anInt4684;
			}
			arg1.aBoolean458 = false;
		} else if (local27 == 0 && arg1.anInt7141 <= 25) {
			arg1.aBoolean458 = false;
			if (arg2 == 2 && local17.anInt4695 != -1) {
				arg1.anInt7122 = local17.anInt4695;
			} else if (arg2 == 0 && local17.anInt4697 != -1) {
				arg1.anInt7122 = local17.anInt4697;
			} else {
				arg1.anInt7122 = local17.anInt4679;
			}
		} else {
			if (arg2 == 2 && local17.anInt4695 != -1) {
				if (arg3 < 0 && local17.anInt4687 != -1) {
					arg1.anInt7122 = local17.anInt4687;
				} else if (arg3 <= 0 || local17.anInt4673 == -1) {
					arg1.anInt7122 = local17.anInt4695;
				} else {
					arg1.anInt7122 = local17.anInt4673;
				}
			} else if (arg2 == 0 && local17.anInt4697 != -1) {
				if (arg3 < 0 && local17.anInt4704 != -1) {
					arg1.anInt7122 = local17.anInt4704;
				} else if (arg3 <= 0 || local17.anInt4685 == -1) {
					arg1.anInt7122 = local17.anInt4697;
				} else {
					arg1.anInt7122 = local17.anInt4685;
				}
			} else if (arg3 < 0 && local17.anInt4682 != -1) {
				arg1.anInt7122 = local17.anInt4682;
			} else if (arg3 <= 0 || local17.anInt4688 == -1) {
				arg1.anInt7122 = local17.anInt4679;
			} else {
				arg1.anInt7122 = local17.anInt4688;
			}
			arg1.aBoolean458 = false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIZ[S[Ljava/lang/String;)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) String local24 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local24;
		@Pc(38) short local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		for (@Pc(50) int local50 = arg1; local50 < arg0; local50++) {
			if (local24 == null || arg3[local50] != null && arg3[local50].compareTo(local24) < (local50 & 0x1)) {
				@Pc(75) String local75 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20] = local75;
				@Pc(89) short local89 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local89;
			}
		}
		arg3[arg0] = arg3[local20];
		arg3[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method429(local20 - 1, arg1, arg2, arg3);
		method429(arg0, local20 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IFFIF)F")
	public static float method431(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static85.aFloatArrayArray1[arg2];
		return arg3 * local7[1] + local7[0] * arg1 + local7[2] * arg0;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)Z")
	public static boolean method432() {
		try {
			if (Static144.anInt2452 == 2) {
				if (Static111.aClass1_Sub41_1 == null) {
					Static111.aClass1_Sub41_1 = Static461.method5384(Static32.aClass250_7, Static348.anInt5981, Static37.anInt703);
					if (Static111.aClass1_Sub41_1 == null) {
						return false;
					}
				}
				if (Static178.aClass227_1 == null) {
					Static178.aClass227_1 = new Class227(Static429.aClass250_89, Static54.aClass250_12);
				}
				if (Static327.aClass1_Sub7_Sub3_3.method5015(Static178.aClass227_1, Static111.aClass1_Sub41_1, Static342.aClass250_70)) {
					Static327.aClass1_Sub7_Sub3_3.method5008();
					Static327.aClass1_Sub7_Sub3_3.method4997(Static228.anInt4117);
					Static327.aClass1_Sub7_Sub3_3.method4988(Static296.aBoolean145, Static111.aClass1_Sub41_1);
					Static178.aClass227_1 = null;
					Static111.aClass1_Sub41_1 = null;
					Static144.anInt2452 = 0;
					Static32.aClass250_7 = null;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static327.aClass1_Sub7_Sub3_3.method5007();
			Static144.anInt2452 = 0;
			Static178.aClass227_1 = null;
			Static111.aClass1_Sub41_1 = null;
			Static32.aClass250_7 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIFIFIF[BLclient!av;IFF)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) byte[] arg5, @OriginalArg(10) Class17 arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg0;
			arg6.method3262(arg8 / (float) 128, arg4 * 127.0F, arg3 / (float) 128, arg1 / (float) 16, 0, local12, arg2);
			arg3 *= 2.0F;
			for (local48 = 0; local48 < 16384; local48++) {
				arg5[local18] = (byte) ((float) arg5[local18] + local12[local48]);
				local18++;
			}
			arg4 *= arg7;
			arg1 *= 2.0F;
			arg8 *= 2.0F;
		}
		local18 = arg0;
		for (local48 = 0; local48 < 16384; local48++) {
			arg5[local18] = (byte) (arg5[local18] + 127);
			local18++;
		}
	}
}
