import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_13;

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 aClass8_Sub1_Sub3_Sub2_6;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!ic;")
	private static Class34 aClass34_840 = Static56.method816("You have only just left another world)3");

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_841 = Static56.method816("Benutzername: ");

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Lclient!ic;")
	public static Class34 aClass34_842 = Static56.method816("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "[J")
	public static long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_843 = aClass34_840;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_844 = Static56.method816("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Z")
	public static boolean method1117() {
		try {
			if (Static106.anInt2456 == 2) {
				if (Static9.aClass8_Sub12_1 == null) {
					Static9.aClass8_Sub12_1 = Static137.method1011(Static69.aClass14_18, Static60.anInt1574, Static125.anInt3000);
					if (Static9.aClass8_Sub12_1 == null) {
						return false;
					}
				}
				if (Static112.aClass19_1 == null) {
					Static112.aClass19_1 = new Class19(Static23.aClass14_6, Static17.aClass14_4);
				}
				if (Static47.aClass8_Sub11_Sub1_1.method900(Static83.aClass14_21, Static112.aClass19_1, Static9.aClass8_Sub12_1)) {
					Static47.aClass8_Sub11_Sub1_1.method892();
					Static47.aClass8_Sub11_Sub1_1.method867(Static108.anInt2488);
					Static47.aClass8_Sub11_Sub1_1.method871(Static92.aBoolean85, Static9.aClass8_Sub12_1);
					Static69.aClass14_18 = null;
					Static9.aClass8_Sub12_1 = null;
					Static112.aClass19_1 = null;
					Static106.anInt2456 = 0;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static47.aClass8_Sub11_Sub1_1.method898();
			Static69.aClass14_18 = null;
			Static112.aClass19_1 = null;
			Static106.anInt2456 = 0;
			Static9.aClass8_Sub12_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIZII)I")
	public static int method1118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg5;
			arg5 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg0;
		} else {
			return 7 + 1 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1119() {
		anIntArray233 = null;
		aClass14_Sub1_13 = null;
		aClass34_843 = null;
		aClass34_840 = null;
		aClass34_842 = null;
		aClass8_Sub1_Sub3_Sub2_6 = null;
		aLongArray3 = null;
		aBigInteger1 = null;
		aClass34_841 = null;
		aClass34_844 = null;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method1120() {
		if (!Static90.aBoolean14) {
			Static50.anIntArray166[0] = 1006;
			Static61.aClass34Array11[0] = Static62.aClass34_759;
			Static6.aClass34Array3[0] = Static36.aClass34_504;
			Static96.anInt552 = 1;
		}
		if (Static107.anInt2463 != -1) {
			Static46.method685(Static107.anInt2463);
		}
		for (@Pc(30) int local30 = 0; local30 < Static133.anInt3069; local30++) {
			if (Static23.aBooleanArray2[local30]) {
				Static24.aBooleanArray11[local30] = true;
			}
			Static47.aBooleanArray8[local30] = Static23.aBooleanArray2[local30];
			Static23.aBooleanArray2[local30] = false;
		}
		Static82.anInt1978 = Static21.anInt655;
		Static21.anInt639 = -1;
		Static51.aClass8_Sub24_5 = null;
		Static30.anInt844 = -1;
		if (Static107.anInt2463 != -1) {
			Static133.anInt3069 = 0;
			Static33.method550(0, 0, -1, 0, 0, 765, Static107.anInt2463, 503);
		}
		Static110.method1727();
		Static4.method30();
		if (Static90.aBoolean14) {
			Static60.method934();
		} else if (Static30.anInt844 != -1) {
			Static116.method1639(Static21.anInt639, Static30.anInt844);
		}
		if (Static82.anInt1973 == 3) {
			for (@Pc(103) int local103 = 0; local103 < Static133.anInt3069; local103++) {
				if (Static47.aBooleanArray8[local103]) {
					Static110.method1735(Static125.anIntArray395[local103], Static38.anIntArray131[local103], Static2.anIntArray3[local103], Static6.anIntArray12[local103], 16711935, 128);
				} else if (Static24.aBooleanArray11[local103]) {
					Static110.method1735(Static125.anIntArray395[local103], Static38.anIntArray131[local103], Static2.anIntArray3[local103], Static6.anIntArray12[local103], 16711680, 128);
				}
			}
		}
		Static5.method37(Static42.anInt1024, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059, Static69.anInt1683);
		Static69.anInt1683 = 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBIIILclient!md;Z)V")
	public static void method1121(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class14_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(6) long local6 = (long) (arg2 + (arg0 << 16));
		@Pc(12) Class8_Sub1_Sub8 local12 = (Class8_Sub1_Sub8) Static80.aClass7_13.method45(local6);
		if (local12 != null) {
			return;
		}
		local12 = (Class8_Sub1_Sub8) Static20.aClass7_1.method45(local6);
		if (local12 != null) {
			return;
		}
		local12 = (Class8_Sub1_Sub8) Static58.aClass7_10.method45(local6);
		if (local12 == null) {
			if (!arg5) {
				local12 = (Class8_Sub1_Sub8) Static31.aClass7_2.method45(local6);
				if (local12 != null) {
					return;
				}
			}
			local12 = new Class8_Sub1_Sub8();
			local12.aClass14_Sub1_5 = arg4;
			local12.aByte2 = arg1;
			local12.anInt895 = arg3;
			if (arg5) {
				Static80.aClass7_13.method48(local12, local6);
				Static42.anInt1029++;
			} else {
				Static78.aClass60_2.method1356(local12);
				Static58.aClass7_10.method48(local12, local6);
				Static74.anInt1786++;
			}
		} else if (arg5) {
			local12.method1952();
			Static80.aClass7_13.method48(local12, local6);
			Static42.anInt1029++;
			Static74.anInt1786--;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V")
	public static void method1122(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static106.aClass8_Sub20_Sub1_3.method1907(38);
			Static106.aClass8_Sub20_Sub1_3.method1879(arg0);
		}
	}
}
