import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
	public static int anInt4139;

	@OriginalMember(owner = "client!vh", name = "kb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray45;

	@OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lclient!ig;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!vh", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1450 = Static170.method3101("swe");

	@OriginalMember(owner = "client!vh", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1451 = Static170.method3101("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!vh", name = "ib", descriptor = "Lclient!hd;")
	public static Class3_Sub8 aClass3_Sub8_4 = new Class3_Sub8(8);

	@OriginalMember(owner = "client!vh", name = "jb", descriptor = "Z")
	public static volatile boolean aBoolean192 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!lc;IIIII)V")
	public static void method3133(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static7.anInt228) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static90.anInt2564) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static87.anInt2536 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class3_Sub20 local62 = Static149.aClass3_Sub20ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static35.anIntArrayArrayArray17[local17][local23][local32] + Static35.anIntArrayArrayArray17[local17][local23 + 1][local32] + Static35.anIntArrayArrayArray17[local17][local23][local32 + 1] + Static35.anIntArrayArrayArray17[local17][local23 + 1][local32 + 1]) / 4 - (Static35.anIntArrayArrayArray17[arg1][arg2][arg3] + Static35.anIntArrayArrayArray17[arg1][arg2 + 1][arg3] + Static35.anIntArrayArrayArray17[arg1][arg2][arg3 + 1] + Static35.anIntArrayArrayArray17[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class25 local151 = local62.aClass25_1;
									if (local151 != null) {
										@Pc(161) Class3_Sub2_Sub1_Sub4 local161;
										if (local151.aClass3_Sub2_Sub1_1 instanceof Class3_Sub2_Sub1_Sub4) {
											local161 = (Class3_Sub2_Sub1_Sub4) local151.aClass3_Sub2_Sub1_1;
											Static89.method2030(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass3_Sub2_Sub1_2 instanceof Class3_Sub2_Sub1_Sub4) {
											local161 = (Class3_Sub2_Sub1_Sub4) local151.aClass3_Sub2_Sub1_2;
											Static89.method2030(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt3336; local225++) {
										@Pc(231) Class32 local231 = local62.aClass32Array3[local225];
										if (local231 != null && local231.aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub4) {
											@Pc(241) Class3_Sub2_Sub1_Sub4 local241 = (Class3_Sub2_Sub1_Sub4) local231.aClass3_Sub2_Sub1_3;
											@Pc(249) int local249 = local231.anInt1439 + 1 - local231.anInt1450;
											@Pc(257) int local257 = local231.anInt1447 + 1 - local231.anInt1449;
											Static89.method2030(arg0, local241, (local231.anInt1450 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt1449 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
	public static void method3134() {
		if (Static130.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static58.anIntArray331[220] = 74;
			Static58.anIntArray331[219] = 42;
			Static58.anIntArray331[187] = 27;
			Static58.anIntArray331[221] = 43;
			Static58.anIntArray331[192] = 58;
			Static58.anIntArray331[191] = 73;
			Static58.anIntArray331[190] = 72;
			Static58.anIntArray331[223] = 28;
			Static58.anIntArray331[222] = 59;
			Static58.anIntArray331[189] = 26;
			Static58.anIntArray331[186] = 57;
			Static58.anIntArray331[188] = 71;
			return;
		}
		Static58.anIntArray331[61] = 27;
		Static58.anIntArray331[45] = 26;
		Static58.anIntArray331[46] = 72;
		if (Static130.aMethod1 == null) {
			Static58.anIntArray331[222] = 59;
			Static58.anIntArray331[192] = 58;
		} else {
			Static58.anIntArray331[222] = 58;
			Static58.anIntArray331[520] = 59;
			Static58.anIntArray331[192] = 28;
		}
		Static58.anIntArray331[92] = 74;
		Static58.anIntArray331[47] = 73;
		Static58.anIntArray331[91] = 42;
		Static58.anIntArray331[44] = 71;
		Static58.anIntArray331[93] = 43;
		Static58.anIntArray331[59] = 57;
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
	public static void method3135() {
		aClass3_Sub8_4 = null;
		aClass38_4 = null;
		Class3_Sub1_Sub37.aLongArray10 = null;
		aClass28_1450 = null;
		aClass28_1451 = null;
		aByteArrayArrayArray45 = null;
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	public static void method3136() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = -1; local5 < Static112.anInt2872; local5++) {
			if (local5 == -1) {
				local12 = 2047;
			} else {
				local12 = Static126.anIntArray557[local5];
			}
			@Pc(21) Class3_Sub2_Sub1_Sub2_Sub1 local21 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local12];
			if (local21 != null && local21.anInt1829 > 0) {
				local21.anInt1829--;
				if (local21.anInt1829 == 0) {
					local21.aClass28_554 = null;
				}
			}
		}
		for (local12 = 0; local12 < Static69.anInt2115; local12++) {
			@Pc(56) int local56 = Static117.anIntArray523[local12];
			@Pc(60) Class3_Sub2_Sub1_Sub2_Sub2 local60 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local56];
			if (local60 != null && local60.anInt1829 > 0) {
				local60.anInt1829--;
				if (local60.anInt1829 == 0) {
					local60.aClass28_554 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(Z)V")
	public static void method3137() {
		for (@Pc(5) int local5 = 0; local5 < Static81.anInt2370; local5++) {
			@Pc(10) int local10 = Static171.anIntArray684[local5];
			@Pc(14) Class3_Sub2_Sub1_Sub2_Sub2 local14 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local10];
			@Pc(18) int local18 = Static18.aClass3_Sub8_Sub1_1.method1545();
			@Pc(26) int local26;
			@Pc(35) int local35;
			if ((local18 & 0x1) != 0) {
				local26 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local26 == 65535) {
					local26 = -1;
				}
				local35 = Static18.aClass3_Sub8_Sub1_1.method1545();
				if (local26 == local14.anInt1833 && local26 != -1) {
					@Pc(90) int local90 = Static21.method594(local26).anInt549;
					if (local90 == 1) {
						local14.anInt1837 = 0;
						local14.anInt1813 = 0;
						local14.anInt1799 = 0;
						local14.anInt1832 = local35;
					}
					if (local90 == 2) {
						local14.anInt1837 = 0;
					}
				} else if (local26 == -1 || local14.anInt1833 == -1 || Static21.method594(local26).anInt535 >= Static21.method594(local14.anInt1833).anInt535) {
					local14.anInt1799 = 0;
					local14.anInt1833 = local26;
					local14.anInt1808 = local14.anInt1783;
					local14.anInt1837 = 0;
					local14.anInt1813 = 0;
					local14.anInt1832 = local35;
				}
			}
			if ((local18 & 0x80) != 0) {
				local26 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local35 = Static18.aClass3_Sub8_Sub1_1.method1525();
				local14.method1432(local35, Static14.anInt481, local26);
			}
			if ((local18 & 0x2) != 0) {
				local14.aClass3_Sub2_Sub7_1 = Static170.method3103(Static18.aClass3_Sub8_Sub1_1.method1510());
				local14.anInt1816 = local14.aClass3_Sub2_Sub7_1.anInt1311;
				local14.anInt1823 = local14.aClass3_Sub2_Sub7_1.anInt1324;
				local14.anInt1791 = local14.aClass3_Sub2_Sub7_1.anInt1335;
				local14.anInt1786 = local14.aClass3_Sub2_Sub7_1.anInt1333;
				local14.anInt1835 = local14.aClass3_Sub2_Sub7_1.anInt1310;
				local14.anInt1787 = local14.aClass3_Sub2_Sub7_1.anInt1338;
				local14.anInt1839 = local14.aClass3_Sub2_Sub7_1.anInt1309;
				local14.anInt1821 = local14.aClass3_Sub2_Sub7_1.anInt1329;
				local14.anInt1831 = local14.aClass3_Sub2_Sub7_1.anInt1332;
			}
			if ((local18 & 0x20) != 0) {
				local14.aClass28_554 = Static18.aClass3_Sub8_Sub1_1.method1516();
				local14.anInt1829 = 100;
			}
			if ((local18 & 0x10) != 0) {
				local14.anInt1790 = Static18.aClass3_Sub8_Sub1_1.method1549();
				local26 = Static18.aClass3_Sub8_Sub1_1.method1540();
				local14.anInt1824 = local26 >> 16;
				local14.anInt1801 = (local26 & 0xFFFF) + Static14.anInt481;
				local14.anInt1838 = 0;
				if (local14.anInt1790 == 65535) {
					local14.anInt1790 = -1;
				}
				local14.anInt1828 = 0;
				if (local14.anInt1801 > Static14.anInt481) {
					local14.anInt1838 = -1;
				}
			}
			if ((local18 & 0x40) != 0) {
				local14.anInt1811 = Static18.aClass3_Sub8_Sub1_1.method1549();
				local14.anInt1826 = Static18.aClass3_Sub8_Sub1_1.method1549();
			}
			if ((local18 & 0x8) != 0) {
				local14.anInt1796 = Static18.aClass3_Sub8_Sub1_1.method1510();
				if (local14.anInt1796 == 65535) {
					local14.anInt1796 = -1;
				}
			}
			if ((local18 & 0x4) != 0) {
				local26 = Static18.aClass3_Sub8_Sub1_1.method1545();
				local35 = Static18.aClass3_Sub8_Sub1_1.method1535();
				local14.method1432(local35, Static14.anInt481, local26);
				local14.anInt1807 = Static14.anInt481 + 300;
				local14.anInt1803 = Static18.aClass3_Sub8_Sub1_1.method1545();
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)J")
	public static long method3138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3336; local13++) {
			@Pc(19) Class32 local19 = local7.aClass32Array3[local13];
			if ((local19.aLong49 >> 29 & 0x3L) == 2L && local19.anInt1450 == arg1 && local19.anInt1449 == arg2) {
				return local19.aLong49;
			}
		}
		return 0L;
	}
}
