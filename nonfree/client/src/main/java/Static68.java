import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!nm;")
	public static Class119 aClass119_21;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "Lclient!nm;")
	public static Class119 aClass119_22;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString53 = "Allocating memory";

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
	public static int anInt1471 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!fh;IIZIIZIII)V")
	public static void method1294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(30) int local30;
		if (arg10 < 0 || arg10 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local30 = arg2.method1853();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg2.method1853();
					break;
				}
				if (local30 <= 49) {
					arg2.method1853();
				}
			}
			return;
		}
		if (!arg7 && !arg4) {
			Static17.aByteArrayArrayArray1[arg8][arg10][arg0] = 0;
		}
		while (true) {
			local30 = arg2.method1853();
			if (local30 == 0) {
				if (arg7) {
					Static280.anIntArrayArrayArray13[0][arg6 + arg10][arg0 + arg3] = Static24.anIntArrayArrayArray3[0][arg6 + arg10][arg3 + arg0];
				} else if (arg8 == 0) {
					Static280.anIntArrayArrayArray13[0][arg6 + arg10][arg0 + arg3] = -Static269.method4146(arg9 + 556238, 932731 - -arg1) * 8;
				} else {
					Static280.anIntArrayArrayArray13[arg8][arg6 + arg10][arg0 + arg3] = Static280.anIntArrayArrayArray13[arg8 - 1][arg10 + arg6][arg3 + arg0] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(128) int local128 = arg2.method1853();
				if (arg7) {
					Static280.anIntArrayArrayArray13[0][arg10 + arg6][arg0 + arg3] = Static24.anIntArrayArrayArray3[0][arg10 + arg6][arg0 + arg3] + local128 * 8;
				} else {
					if (local128 == 1) {
						local128 = 0;
					}
					if (arg8 == 0) {
						Static280.anIntArrayArrayArray13[0][arg6 + arg10][arg0 + arg3] = -local128 * 8;
					} else {
						Static280.anIntArrayArrayArray13[arg8][arg6 + arg10][arg0 + arg3] = Static280.anIntArrayArrayArray13[arg8 - 1][arg6 + arg10][arg3 + arg0] - local128 * 8;
					}
				}
				break;
			}
			if (local30 > 49) {
				if (local30 <= 81) {
					if (!arg7 && !arg4) {
						Static17.aByteArrayArrayArray1[arg8][arg10][arg0] = (byte) (local30 - 49);
					}
				} else if (!arg4) {
					Static204.aByteArrayArrayArray9[arg8][arg10][arg0] = (byte) (local30 - 81);
				}
			} else if (arg4) {
				arg2.method1853();
			} else {
				Static101.aByteArrayArrayArray4[arg8][arg10][arg0] = arg2.method1829();
				Static73.aByteArrayArrayArray3[arg8][arg10][arg0] = (byte) ((local30 - 2) / 4);
				Static259.aByteArrayArrayArray15[arg8][arg10][arg0] = (byte) (arg5 + local30 - 2 & 0x3);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method1295(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class157 local4 = Static209.method3469(arg2, arg3);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray29 != null) {
			@Pc(21) Class1_Sub29 local21 = new Class1_Sub29();
			local21.anInt4526 = arg0;
			local21.anObjectArray2 = local4.anObjectArray29;
			local21.aString161 = arg1;
			local21.aClass157_13 = local4;
			Static5.method104(local21);
		}
		@Pc(39) boolean local39 = true;
		if (local4.anInt4686 > 0) {
			local39 = Static99.method1927(local4);
		}
		if (!local39 || !Static42.method777(local4).method1127(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static116.aClass1_Sub13_Sub1_48.method1887(224);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 2) {
			Static116.aClass1_Sub13_Sub1_48.method1887(76);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 3) {
			Static116.aClass1_Sub13_Sub1_48.method1887(86);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 4) {
			Static116.aClass1_Sub13_Sub1_48.method1887(170);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 5) {
			Static116.aClass1_Sub13_Sub1_48.method1887(246);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 6) {
			Static116.aClass1_Sub13_Sub1_48.method1887(217);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 7) {
			Static116.aClass1_Sub13_Sub1_48.method1887(35);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 8) {
			Static116.aClass1_Sub13_Sub1_48.method1887(47);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 9) {
			Static116.aClass1_Sub13_Sub1_48.method1887(139);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
		if (arg0 == 10) {
			Static116.aClass1_Sub13_Sub1_48.method1887(154);
			Static116.aClass1_Sub13_Sub1_48.method1851(arg2);
			Static116.aClass1_Sub13_Sub1_48.method1835(arg3);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!nm;)I")
	public static int method1296(@OriginalArg(1) Class119 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3250(Static141.anInt2764)) {
			local5++;
		}
		if (arg0.method3250(Static44.anInt1028)) {
			local5++;
		}
		if (arg0.method3250(Static129.anInt2557)) {
			local5++;
		}
		if (arg0.method3250(Static143.anInt2792)) {
			local5++;
		}
		if (arg0.method3250(Static158.anInt3616)) {
			local5++;
		}
		if (arg0.method3250(Static164.anInt3279)) {
			local5++;
		}
		if (arg0.method3250(Static125.anInt2514)) {
			local5++;
		}
		if (arg0.method3250(Static267.anInt4947)) {
			local5++;
		}
		if (arg0.method3250(Static194.anInt3875)) {
			local5++;
		}
		if (arg0.method3250(Static47.anInt1068)) {
			local5++;
		}
		if (arg0.method3250(Static241.anInt4476)) {
			local5++;
		}
		if (arg0.method3250(Static148.anInt3025)) {
			local5++;
		}
		if (arg0.method3250(Static310.anInt5538)) {
			local5++;
		}
		if (arg0.method3250(Static16.anInt334)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public static void method1297(@OriginalArg(1) boolean arg0) {
		Static3.anIntArray12 = new int[104];
		Static166.anIntArray298 = new int[104];
		Static269.anIntArray553 = new int[104];
		Static13.anIntArray25 = new int[104];
		Static187.anInt3579 = 99;
		Static261.anIntArray546 = new int[5];
		Static4.anIntArray15 = new int[104];
		@Pc(37) byte local37;
		if (arg0) {
			local37 = 1;
		} else {
			local37 = 4;
		}
		Static204.aByteArrayArrayArray9 = new byte[local37][104][104];
		Static312.aByteArrayArrayArray21 = new byte[local37][105][105];
		Static73.aByteArrayArrayArray3 = new byte[local37][104][104];
		Static101.aByteArrayArrayArray4 = new byte[local37][104][104];
		Static259.aByteArrayArrayArray15 = new byte[local37][104][104];
		Static4.anIntArrayArrayArray1 = new int[local37][105][105];
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1298(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(arg1);
		@Pc(12) boolean local12 = true;
		@Pc(19) int local19 = -1;
		label58: while (true) {
			@Pc(23) int local23 = local6.method1846();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(41) int local41;
				while (!local35) {
					local41 = local6.method1830();
					if (local41 == 0) {
						continue label58;
					}
					local33 += local41 - 1;
					@Pc(71) int local71 = local33 & 0x3F;
					@Pc(77) int local77 = local6.method1853() >> 2;
					@Pc(83) int local83 = local33 >> 6 & 0x3F;
					@Pc(87) int local87 = arg2 + local71;
					@Pc(91) int local91 = local83 + arg0;
					if (local91 > 0 && local87 > 0 && local91 < 103 && local87 < 103) {
						@Pc(111) Class150 local111 = Static160.method2744(local19);
						if (local77 != 22 || Static41.aBoolean79 || local111.anInt4576 != 0 || local111.anInt4560 == 1 || local111.aBoolean424) {
							local35 = true;
							if (!local111.method3876()) {
								local12 = false;
								Static132.anInt2603++;
							}
						}
					}
				}
				local41 = local6.method1830();
				if (local41 == 0) {
					break;
				}
				local6.method1853();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fh;B)Lclient!jl;")
	public static Class94_Sub1 method1299(@OriginalArg(0) Class1_Sub13 arg0) {
		return new Class94_Sub1(arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1878(), arg0.method1853());
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZII)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static224.anInt4209 == 1) {
			Static273.aClass1_Sub5_Sub6Array13[Static194.anInt3870 / 100].method3195(Static25.anInt4802 - 8, Static228.anInt4273 + -8);
		}
		if (Static224.anInt4209 == 2) {
			Static273.aClass1_Sub5_Sub6Array13[Static194.anInt3870 / 100 + 4].method3195(Static25.anInt4802 - 8, Static228.anInt4273 + -8);
		}
		Static230.method3686();
	}
}
