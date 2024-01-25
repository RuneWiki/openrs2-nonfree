import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!rg;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString45 = "white:";

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
	public static volatile int anInt1111 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!pf;ZI)Lclient!wd;")
	public static Class214 method978(@OriginalArg(0) Class44_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class214 local9;
		if (Static208.aClass214_22 == null) {
			local9 = new Class214();
		} else {
			local9 = Static208.aClass214_22;
			Static208.aClass214_22 = Static208.aClass214_22.aClass214_21;
			local9.aClass214_21 = null;
			Static349.anInt6298--;
		}
		local9.anInt6237 = arg1;
		local9.aClass44_Sub4_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)Lclient!eq;")
	public static Class6_Sub2_Sub5 method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg2;
		@Pc(18) Class6_Sub2_Sub5 local18 = (Class6_Sub2_Sub5) Static91.aClass31_8.method634((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static109.aClass53_55.method1014(Static109.aClass53_55.method1029(local9));
		if (local30 == null) {
			local9 = arg0 + 65536 << 8 | arg2;
			local18 = (Class6_Sub2_Sub5) Static91.aClass31_8.method634((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static109.aClass53_55.method1014(Static109.aClass53_55.method1029(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class6_Sub2_Sub5) Static91.aClass31_8.method634((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static109.aClass53_55.method1014(Static109.aClass53_55.method1029(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static20.method301(local30);
					local18.anInt1423 = arg2;
					Static91.aClass31_8.method632((long) local9 << 16, local18);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static20.method301(local30);
				local18.anInt1423 = arg2;
				Static91.aClass31_8.method632((long) local9 << 16, local18);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static20.method301(local30);
			local18.anInt1423 = arg2;
			Static91.aClass31_8.method632((long) local9 << 16, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZZIIIIIILclient!ec;I)V")
	public static void method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6_Sub10 arg9, @OriginalArg(11) int arg10) {
		if (arg6 == 1) {
			arg0 = 1;
		} else if (arg6 == 2) {
			arg4 = 1;
			arg0 = 1;
		} else if (arg6 == 3) {
			arg4 = 1;
		}
		@Pc(61) int local61;
		if (arg1 < 0 || Static153.anInt2883 <= arg1 || arg7 < 0 || arg7 >= Static246.anInt4606) {
			while (true) {
				local61 = arg9.method3972();
				if (local61 == 0) {
					return;
				}
				if (local61 == 1) {
					arg9.method3972();
					return;
				}
				if (local61 <= 49) {
					arg9.method3972();
				}
			}
			return;
		}
		if (!arg2 && !arg3) {
			Static265.aByteArrayArrayArray11[arg8][arg1][arg7] = 0;
		}
		while (true) {
			local61 = arg9.method3972();
			if (local61 == 0) {
				if (arg2) {
					Static5.anIntArrayArrayArray1[0][arg4 + arg1][arg0 + arg7] = Static99.aClass106Array4[0].method5720(arg1 + arg4, arg0 + arg7);
					return;
				} else if (arg8 == 0) {
					Static5.anIntArrayArrayArray1[0][arg1 + arg4][arg7 + arg0] = -Static353.method5801(arg10 + 556238, arg5 + 932731) * 8;
					return;
				} else {
					Static5.anIntArrayArrayArray1[arg8][arg1 + arg4][arg7 + arg0] = Static5.anIntArrayArrayArray1[arg8 - 1][arg4 + arg1][arg0 + arg7] - 240;
					return;
				}
			}
			if (local61 == 1) {
				@Pc(193) int local193 = arg9.method3972();
				if (!arg2) {
					if (local193 == 1) {
						local193 = 0;
					}
					if (arg8 != 0) {
						Static5.anIntArrayArrayArray1[arg8][arg4 + arg1][arg7 + arg0] = Static5.anIntArrayArrayArray1[arg8 - 1][arg4 + arg1][arg7 + arg0] - local193 * 8;
						return;
					}
					Static5.anIntArrayArrayArray1[0][arg4 + arg1][arg7 + arg0] = -local193 * 8;
					return;
				}
				Static5.anIntArrayArrayArray1[0][arg4 + arg1][arg0 + arg7] = local193 * 8 + Static99.aClass106Array4[0].method5720(arg4 + arg1, arg0 + arg7);
				return;
			}
			if (local61 <= 49) {
				if (arg3) {
					arg9.method3972();
				} else {
					Static116.aByteArrayArrayArray7[arg8][arg1][arg7] = arg9.method3992();
					Static5.aByteArrayArrayArray1[arg8][arg1][arg7] = (byte) ((local61 - 2) / 4);
					Static230.aByteArrayArrayArray8[arg8][arg1][arg7] = (byte) (arg6 + local61 - 2 & 0x3);
				}
			} else if (local61 <= 81) {
				if (!arg2 && !arg3) {
					Static265.aByteArrayArrayArray11[arg8][arg1][arg7] = (byte) (local61 - 49);
				}
			} else if (!arg3) {
				Static53.aByteArrayArrayArray4[arg8][arg1][arg7] = (byte) (local61 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BJ)V")
	public static void method981(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static10.anInt187;
		@Pc(9) int local9 = Static277.anInt5293;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (Static304.anInt5743 != local7) {
			local21 = local7 - Static304.anInt5743;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static304.anInt5743 += local29;
		}
		if (!Static317.aBoolean395) {
			Static163.aFloat69 += Static128.aFloat62 * (float) arg0 / 40.0F * 8.0F;
			Static117.aFloat58 += (float) arg0 * Static265.aFloat76 / 40.0F * 8.0F;
		}
		if (Static219.anInt4043 != local9) {
			local21 = local9 - Static219.anInt4043;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static219.anInt4043 += local29;
		}
		Static194.method3614();
	}
}
