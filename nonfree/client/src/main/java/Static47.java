import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!h", name = "Xc", descriptor = "[S")
	public static short[] aShortArray27;

	@OriginalMember(owner = "client!h", name = "dd", descriptor = "I")
	public static int anInt1274;

	@OriginalMember(owner = "client!h", name = "ed", descriptor = "Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 aClass8_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!h", name = "kd", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!h", name = "ld", descriptor = "Lclient!id;")
	public static Class8_Sub11_Sub1 aClass8_Sub11_Sub1_1;

	@OriginalMember(owner = "client!h", name = "Hc", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!h", name = "Jc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_635 = Static56.method816("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!h", name = "Kc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_636 = Static56.method816(")1");

	@OriginalMember(owner = "client!h", name = "Nc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_637 = Static56.method816("(Z");

	@OriginalMember(owner = "client!h", name = "Sc", descriptor = "I")
	public static int anInt1268 = 0;

	@OriginalMember(owner = "client!h", name = "Tc", descriptor = "Lclient!ic;")
	public static Class34 aClass34_639 = Static56.method816("lila:");

	@OriginalMember(owner = "client!h", name = "Vc", descriptor = "Lclient!ic;")
	private static Class34 aClass34_640 = Static56.method816(" has logged in)3");

	@OriginalMember(owner = "client!h", name = "ad", descriptor = "Lclient!ic;")
	public static Class34 aClass34_641 = aClass34_640;

	@OriginalMember(owner = "client!h", name = "bd", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!h", name = "id", descriptor = "I")
	public static int anInt1277 = 255;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!ic;")
	public static Class34 method729(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static44.method669(new Class34[] { Static111.aClass34_1392, Static44.method672(arg0), Static76.aClass34_839 });
		} else if (arg0 < 10000000) {
			return Static44.method669(new Class34[] { Static22.aClass34_1201, Static44.method672(arg0 / 1000), Static82.aClass34_891, Static76.aClass34_839 });
		} else {
			return Static44.method669(new Class34[] { Static44.aClass34_567, Static44.method672(arg0 / 1000000), Static92.aClass34_1020, Static76.aClass34_839 });
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method730() {
		aClass8_Sub1_Sub3_Sub2_2 = null;
		aShortArray27 = null;
		aClass8_Sub11_Sub1_1 = null;
		aBooleanArray8 = null;
		aClass34_635 = null;
		aShortArrayArray4 = null;
		aClass34_640 = null;
		aClass34_637 = null;
		aClass34_639 = null;
		aClass34_641 = null;
		aClass34_636 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)I")
	public static int method731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		return Static62.aClass8_Sub1_Sub8_1 != null && Static62.aClass8_Sub1_Sub8_1.aLong102 == local6 ? Static48.aClass8_Sub20_36.anInt2853 * 99 / (Static48.aClass8_Sub20_36.aByteArray44.length - Static62.aClass8_Sub1_Sub8_1.aByte2) + 1 : 0;
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
	public static int method732() {
		@Pc(7) int local7 = 3;
		if (Static24.anInt1900 < 310) {
			@Pc(14) int local14 = Static48.anInt2951 >> 7;
			@Pc(19) int local19 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7;
			@Pc(24) int local24 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7;
			@Pc(28) int local28 = Static13.anInt345 >> 7;
			if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][local14][local28] & 0x4) != 0) {
				local7 = Static42.anInt1024;
			}
			@Pc(55) int local55;
			if (local14 >= local19) {
				local55 = local14 - local19;
			} else {
				local55 = local19 - local14;
			}
			@Pc(69) int local69;
			if (local24 > local28) {
				local69 = local24 - local28;
			} else {
				local69 = local28 - local24;
			}
			@Pc(91) int local91;
			@Pc(85) int local85;
			if (local69 < local55) {
				local85 = 32768;
				local91 = local69 * 65536 / local55;
				while (local19 != local14) {
					if (local14 < local19) {
						local14++;
					} else if (local19 < local14) {
						local14--;
					}
					if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][local14][local28] & 0x4) != 0) {
						local7 = Static42.anInt1024;
					}
					local85 += local91;
					if (local85 >= 65536) {
						if (local28 < local24) {
							local28++;
						} else if (local28 > local24) {
							local28--;
						}
						local85 -= 65536;
						if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][local14][local28] & 0x4) != 0) {
							local7 = Static42.anInt1024;
						}
					}
				}
			} else {
				local91 = local55 * 65536 / local69;
				local85 = 32768;
				while (local28 != local24) {
					local85 += local91;
					if (local24 > local28) {
						local28++;
					} else if (local28 > local24) {
						local28--;
					}
					if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][local14][local28] & 0x4) != 0) {
						local7 = Static42.anInt1024;
					}
					if (local85 >= 65536) {
						local85 -= 65536;
						if (local14 < local19) {
							local14++;
						} else if (local14 > local19) {
							local14--;
						}
						if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][local14][local28] & 0x4) != 0) {
							local7 = Static42.anInt1024;
						}
					}
				}
			}
		}
		if ((Static105.aByteArrayArrayArray5[Static42.anInt1024][Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 >> 7][Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 >> 7] & 0x4) != 0) {
			local7 = Static42.anInt1024;
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Lclient!dc;")
	public static Class8_Sub1_Sub6 method733(@OriginalArg(0) int arg0) {
		@Pc(10) Class8_Sub1_Sub6 local10 = (Class8_Sub1_Sub6) Static126.aClass48_46.method1100((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static112.aClass14_27.method1156(arg0, 12);
		local10 = new Class8_Sub1_Sub6();
		if (local20 != null) {
			local10.method419(new Class8_Sub20(local20));
		}
		local10.method417();
		Static126.aClass48_46.method1097(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
	public static void method734(@OriginalArg(0) boolean arg0) {
		if (Static90.aClass25_2 == null) {
			return;
		}
		try {
			@Pc(19) Class8_Sub20 local19 = new Class8_Sub20(4);
			local19.method1883(arg0 ? 2 : 3);
			local19.method1887(0);
			Static90.aClass25_2.method586(4, local19.aByteArray44);
		} catch (@Pc(40) IOException local40) {
			try {
				Static90.aClass25_2.method588();
			} catch (@Pc(45) Exception local45) {
			}
			Static67.anInt1665++;
			Static90.aClass25_2 = null;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I")
	public static int method735(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
