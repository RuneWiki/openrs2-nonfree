import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!on", name = "A", descriptor = "I")
	public static volatile int anInt4436 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
	public static void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static296.aBoolean335) {
			Static288.method4714(arg1, arg2, arg1 + arg3, arg0 + arg2);
			Static288.method4713(arg1, arg2, arg3, arg0, 0);
		} else {
			Static203.method3590(arg1, arg2, arg1 + arg3, arg2 - -arg0);
			Static203.method3592(arg1, arg2, arg3, arg0, 0);
		}
		if (Static191.anInt4244 < 100) {
			return;
		}
		if (Static146.aClass1_Sub2_Sub14_2 == null || Static146.aClass1_Sub2_Sub14_2.anInt3438 != arg3 || Static146.aClass1_Sub2_Sub14_2.anInt3430 != arg0) {
			@Pc(62) Class1_Sub2_Sub14_Sub1 local62 = new Class1_Sub2_Sub14_Sub1(arg3, arg0);
			Static203.method3591(local62.anIntArray294, arg3, arg0);
			Static3.method72(Static178.anInt4022, 0, Static173.anInt3932, arg3, arg0, 0, 0, 0);
			if (Static296.aBoolean335) {
				Static146.aClass1_Sub2_Sub14_2 = new Class1_Sub2_Sub14_Sub2(local62);
			} else {
				Static146.aClass1_Sub2_Sub14_2 = local62;
			}
			if (Static296.aBoolean335) {
				Static203.anIntArray460 = null;
			} else {
				Static1.aClass5_1.method1716();
			}
		}
		Static146.aClass1_Sub2_Sub14_2.method2732(arg1, arg2);
		@Pc(111) int local111 = Static268.anInt5802 * arg3 / Static178.anInt4022 + arg1;
		@Pc(119) int local119 = arg0 * Static242.anInt5304 / Static173.anInt3932 + arg2;
		@Pc(125) int local125 = Static205.anInt4561 * arg3 / Static178.anInt4022;
		@Pc(127) int local127 = 16711680;
		@Pc(133) int local133 = arg0 * Static33.anInt856 / Static173.anInt3932;
		if (Static230.anInt5101 == 1) {
			local127 = 16777215;
		}
		if (Static296.aBoolean335) {
			Static288.method4716(local111, local119, local125, local133, local127, 128);
			Static288.method4709(local111, local119, local125, local133, local127);
		} else {
			Static203.method3603(local111, local119, local125, local133, local127, 128);
			Static203.method3598(local111, local119, local125, local133, local127);
		}
		if (Static180.anInt4067 <= 0) {
			return;
		}
		@Pc(187) int local187;
		if (Static94.anInt6155 <= 10) {
			local187 = Static94.anInt6155 * 25;
		} else {
			local187 = 500 - Static94.anInt6155 * 25;
		}
		for (@Pc(201) Class1_Sub33 local201 = (Class1_Sub33) Static265.aClass131_25.method3791(); local201 != null; local201 = (Class1_Sub33) Static265.aClass131_25.method3792()) {
			if (Static169.anInt3863 == local201.anInt6050) {
				@Pc(218) int local218 = arg1 + local201.anInt6044 * arg3 / Static178.anInt4022;
				@Pc(227) int local227 = arg2 + arg0 * local201.anInt6043 / Static173.anInt3932;
				if (Static296.aBoolean335) {
					Static288.method4716(local218 - 2, local227 + -2, 4, 4, 16776960, local187);
				} else {
					Static203.method3603(local218 - 2, local227 + -2, 4, 4, 16776960, local187);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!h;III)V")
	public static void method3517(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub14 local12;
		if (arg2 < Static212.anInt4717) {
			local12 = Static132.aClass1_Sub14ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass162_1 != null && local12.aClass162_1.aClass25_7.method4766()) {
				arg0.method4770(local12.aClass162_1.aClass25_7, 128, 0, 0, true);
			}
		}
		if (arg3 < Static212.anInt4717) {
			local12 = Static132.aClass1_Sub14ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass162_1 != null && local12.aClass162_1.aClass25_7.method4766()) {
				arg0.method4770(local12.aClass162_1.aClass25_7, 0, 0, 128, true);
			}
		}
		if (arg2 < Static212.anInt4717 && arg3 < Static293.anInt6189) {
			local12 = Static132.aClass1_Sub14ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass162_1 != null && local12.aClass162_1.aClass25_7.method4766()) {
				arg0.method4770(local12.aClass162_1.aClass25_7, 128, 0, 128, true);
			}
		}
		if (arg2 < Static212.anInt4717 && arg3 > 0) {
			local12 = Static132.aClass1_Sub14ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass162_1 != null && local12.aClass162_1.aClass25_7.method4766()) {
				arg0.method4770(local12.aClass162_1.aClass25_7, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!kb;I)I")
	public static int method3518(@OriginalArg(0) Class83 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0.method2302(Static14.anInt388)) {
			local9++;
		}
		if (arg0.method2302(Static202.anInt4502)) {
			local9++;
		}
		if (arg0.method2302(Static86.anInt2029)) {
			local9++;
		}
		if (arg0.method2302(Static61.anInt1560)) {
			local9++;
		}
		if (arg0.method2302(Static14.anInt391)) {
			local9++;
		}
		if (arg0.method2302(Static161.anInt3717)) {
			local9++;
		}
		if (arg0.method2302(Static3.anInt106)) {
			local9++;
		}
		if (arg0.method2302(Static52.anInt1406)) {
			local9++;
		}
		if (arg0.method2302(Static92.anInt2147)) {
			local9++;
		}
		if (arg0.method2302(Static224.anInt4944)) {
			local9++;
		}
		if (arg0.method2302(Static246.anInt5374)) {
			local9++;
		}
		if (arg0.method2302(Static152.anInt3528)) {
			local9++;
		}
		if (arg0.method2302(Static229.anInt5078)) {
			local9++;
		}
		if (arg0.method2302(Static229.anInt5088)) {
			local9++;
		}
		if (arg0.method2302(Static52.anInt1407)) {
			local9++;
		}
		return local9;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZI)I")
	public static int method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 5 << 7) + (arg1 >> 2 << 10);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V")
	public static void method3520(@OriginalArg(1) int arg0) {
		Static92.anIntArray217 = new int[arg0];
		Static277.anIntArray596 = new int[arg0];
		Static73.anIntArray186 = new int[arg0];
		Static94.anIntArray609 = new int[arg0];
		Static22.anIntArray48 = new int[arg0];
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Lclient!hg;")
	public static Class72 method3521() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
	public static void method3522() {
		Static286.method4697();
		Static53.method1072();
		Static49.method1038();
		Static132.method2272();
		Static110.method1785();
		Static133.method2290();
		Static94.method4769();
		Static68.method1297();
		Static36.method805();
		Static223.method939();
		Static171.method3144();
		Static84.method1481();
		Static192.method3416();
		Static253.method4312();
		Static188.method3367();
		Static32.method669();
		Static142.method2526();
		Static146.method2770();
		Static10.method220();
		Static97.method4691();
		Static231.aClass155_41.method4364(5);
		Static37.aClass155_7.method4364(5);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZILclient!im;IIIIIIIZB)V")
	public static void method3523(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(40) int local40;
		if (arg9 < 0 || arg9 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local40 = arg2.method2655();
				if (local40 == 0) {
					break;
				}
				if (local40 == 1) {
					arg2.method2655();
					break;
				}
				if (local40 <= 49) {
					arg2.method2655();
				}
			}
			return;
		}
		if (!arg0 && !arg10) {
			Static126.aByteArrayArrayArray24[arg7][arg9][arg6] = 0;
		}
		while (true) {
			local40 = arg2.method2655();
			if (local40 == 0) {
				if (arg0) {
					Static287.anIntArrayArrayArray18[0][arg9 + arg1][arg6 + arg4] = Static113.anIntArrayArrayArray10[0][arg9 + arg1][arg6 + arg4];
				} else if (arg7 == 0) {
					Static287.anIntArrayArrayArray18[0][arg9 + arg1][arg6 + arg4] = -Static141.method2520(arg3 + 932731, arg8 + 556238) * 8;
				} else {
					Static287.anIntArrayArrayArray18[arg7][arg9 + arg1][arg6 + arg4] = Static287.anIntArrayArrayArray18[arg7 - 1][arg1 + arg9][arg6 + arg4] - 240;
				}
				break;
			}
			if (local40 == 1) {
				@Pc(142) int local142 = arg2.method2655();
				if (arg0) {
					Static287.anIntArrayArrayArray18[0][arg9 + arg1][arg6 + arg4] = Static113.anIntArrayArrayArray10[0][arg9 + arg1][arg6 + arg4] + local142 * 8;
				} else {
					if (local142 == 1) {
						local142 = 0;
					}
					if (arg7 == 0) {
						Static287.anIntArrayArrayArray18[0][arg1 + arg9][arg6 + arg4] = -local142 * 8;
					} else {
						Static287.anIntArrayArrayArray18[arg7][arg9 + arg1][arg6 + arg4] = Static287.anIntArrayArrayArray18[arg7 - 1][arg9 + arg1][arg6 + arg4] - local142 * 8;
					}
				}
				break;
			}
			if (local40 > 49) {
				if (local40 <= 81) {
					if (!arg0 && !arg10) {
						Static126.aByteArrayArrayArray24[arg7][arg9][arg6] = (byte) (local40 - 49);
					}
				} else if (!arg10) {
					Static27.aByteArrayArrayArray5[arg7][arg9][arg6] = (byte) (local40 - 81);
				}
			} else if (arg10) {
				arg2.method2655();
			} else {
				Static241.aByteArrayArrayArray46[arg7][arg9][arg6] = arg2.method2633();
				Static117.aByteArrayArrayArray20[arg7][arg9][arg6] = (byte) ((local40 - 2) / 4);
				Static88.aByteArrayArrayArray13[arg7][arg9][arg6] = (byte) (local40 + arg5 - 2 & 0x3);
			}
		}
	}
}
