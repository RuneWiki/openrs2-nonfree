import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Lclient!ph;")
	public static Class138 aClass138_85;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub12_Sub2 aClass1_Sub1_Sub12_Sub2_2;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString191 = "Examine";

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt5677 = 0;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
	public static int anInt5678 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Lclient!qf;")
	public static Class146 method4492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class146 local5 = Static259.method3908(arg1);
		if (arg0 == -1) {
			return local5;
		} else if (local5 == null || local5.aClass146Array2 == null || arg0 >= local5.aClass146Array2.length) {
			return null;
		} else {
			return local5.aClass146Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public static void method4493() {
		if (Static154.aClass176_1 != null) {
			@Pc(5) Class176 local5 = Static154.aClass176_1;
			synchronized (Static154.aClass176_1) {
				Static154.aClass176_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lclient!fj;")
	public static Class54 method4497(@OriginalArg(1) int arg0) {
		@Pc(10) Class54 local10 = (Class54) Static223.aClass169_123.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static233.aClass138_61.method3346(1, arg0);
		local10 = new Class54();
		if (local21 != null) {
			local10.method1199(arg0, new Class1_Sub14(local21));
		}
		Static223.aClass169_123.method4016(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZILclient!sb;IIZIIIIII)V")
	public static void method4498(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(30) int local30;
		if (arg7 < 0 || arg7 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local30 = arg2.method2595();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg2.method2595();
					break;
				}
				if (local30 <= 49) {
					arg2.method2595();
				}
			}
			return;
		}
		if (!arg5 && !arg0) {
			Static94.aByteArrayArrayArray9[arg3][arg7][arg1] = 0;
		}
		while (true) {
			local30 = arg2.method2595();
			if (local30 == 0) {
				if (arg5) {
					Static208.anIntArrayArrayArray11[0][arg7 + arg6][arg8 + arg1] = Static89.anIntArrayArrayArray6[0][arg7 + arg6][arg8 + arg1];
				} else if (arg3 == 0) {
					Static208.anIntArrayArrayArray11[0][arg6 + arg7][arg8 + arg1] = -Static185.method3039(arg10 + 932731, arg9 + 556238) * 8;
				} else {
					Static208.anIntArrayArrayArray11[arg3][arg7 + arg6][arg8 + arg1] = Static208.anIntArrayArrayArray11[arg3 - 1][arg6 + arg7][arg8 + arg1] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(129) int local129 = arg2.method2595();
				if (arg5) {
					Static208.anIntArrayArrayArray11[0][arg7 + arg6][arg8 + arg1] = local129 * 8 + Static89.anIntArrayArrayArray6[0][arg6 + arg7][arg1 + arg8];
				} else {
					if (local129 == 1) {
						local129 = 0;
					}
					if (arg3 == 0) {
						Static208.anIntArrayArrayArray11[0][arg7 + arg6][arg8 + arg1] = -local129 * 8;
					} else {
						Static208.anIntArrayArrayArray11[arg3][arg6 + arg7][arg8 + arg1] = Static208.anIntArrayArrayArray11[arg3 - 1][arg7 + arg6][arg8 + arg1] - local129 * 8;
					}
				}
				break;
			}
			if (local30 <= 49) {
				if (arg0) {
					arg2.method2595();
				} else {
					Static59.aByteArrayArrayArray8[arg3][arg7][arg1] = arg2.method2598();
					Static265.aByteArrayArrayArray19[arg3][arg7][arg1] = (byte) ((local30 - 2) / 4);
					Static208.aByteArrayArrayArray18[arg3][arg7][arg1] = (byte) (local30 + arg4 - 2 & 0x3);
				}
			} else if (local30 <= 81) {
				if (!arg5 && !arg0) {
					Static94.aByteArrayArrayArray9[arg3][arg7][arg1] = (byte) (local30 - 49);
				}
			} else if (!arg0) {
				Static245.aByteArrayArrayArray11[arg3][arg7][arg1] = (byte) (local30 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	public static void method4499() {
		if (Static190.anInt3885 == 2) {
			if (Static64.anInt3058 == Static107.anInt2125 && Static60.anInt1202 == Static268.anInt5935) {
				Static190.anInt3885 = 0;
				if (Static49.aBoolean74 && Static88.aBooleanArray16[81] && Static316.anInt5941 > 2) {
					Static44.method779(Static316.anInt5941 - 2);
				} else {
					Static44.method779(Static316.anInt5941 - 1);
				}
			}
		} else if (Static84.anInt1530 == Static64.anInt3058 && Static46.anInt894 == Static268.anInt5935) {
			Static190.anInt3885 = 0;
			if (Static49.aBoolean74 && Static88.aBooleanArray16[81] && Static316.anInt5941 > 2) {
				Static44.method779(Static316.anInt5941 - 2);
			} else {
				Static44.method779(Static316.anInt5941 - 1);
			}
		} else {
			Static190.anInt3885 = 2;
			Static60.anInt1202 = Static46.anInt894;
			Static107.anInt2125 = Static84.anInt1530;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIILclient!h;IZJ)Z")
	public static boolean method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class22 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static208.anIntArrayArrayArray11 == Static61.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static6.anInt118 || local17 >= Static178.anInt3591) {
					return false;
				}
				@Pc(42) Class1_Sub17 local42 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][local10][local17];
				if (local42 != null && local42.anInt3452 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class60 local58 = new Class60();
		local58.aLong64 = arg11;
		local58.anInt1521 = arg0;
		local58.anInt1536 = arg5;
		local58.anInt1528 = arg6;
		local58.anInt1535 = arg7;
		local58.aClass22_1 = arg8;
		local58.anInt1534 = arg9;
		local58.anInt1529 = arg1;
		local58.anInt1522 = arg2;
		local58.anInt1523 = arg1 + arg3 - 1;
		local58.anInt1537 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static122.aClass1_Sub17ArrayArrayArray3[local141][local17][local108] == null) {
						Static122.aClass1_Sub17ArrayArrayArray3[local141][local17][local108] = new Class1_Sub17(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub17 local174 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][local17][local108];
				local174.aClass60Array3[local174.anInt3452] = local58;
				local174.anIntArray276[local174.anInt3452] = local115;
				local174.anInt3454 |= local115;
				local174.anInt3452++;
				if (local6 && anIntArrayArray47[local17][local108] != 0) {
					local8 = anIntArrayArray47[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (anIntArrayArray47[local17][local108] == 0) {
						anIntArrayArray47[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static203.aClass60Array4[Static128.anInt2548++] = local58;
		}
		return true;
	}
}
