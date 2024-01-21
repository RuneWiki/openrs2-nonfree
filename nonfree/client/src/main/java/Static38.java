import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
	public static int anInt1337;

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
	public static int anInt1331 = 0;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "Lclient!rf;")
	private static Class70 aClass70_431 = Static49.method1293(" has logged in)3");

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "Lclient!rf;")
	public static Class70 aClass70_427 = aClass70_431;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
	public static int anInt1333 = 0;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "Lclient!rf;")
	private static Class70 aClass70_430 = Static49.method1293("Please reload this page)3");

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_428 = aClass70_430;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_429 = Static49.method1293("m");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!ig;B)V")
	public static void method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		if (Static110.aClass39_30 != null || Static32.aBoolean47 || (arg2 == null || Static35.method1515(arg2) == null)) {
			return;
		}
		Static110.aClass39_30 = arg2;
		Static119.aClass39_35 = Static35.method1515(arg2);
		Static26.aBoolean29 = false;
		Static184.anInt4566 = 0;
		Static147.anInt3873 = arg0;
		Static123.anInt3348 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V")
	public static void method976() {
		if (Static85.aClass43_22 != null) {
			Static85.aClass43_22.method2042();
			Static85.aClass43_22 = null;
		}
		Static106.method2215();
		Static6.method237();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static96.aClass59Array1[local22].method2471();
		}
		System.gc();
		Static8.method246();
		Static96.anInt2801 = -1;
		Static100.aBoolean115 = false;
		Static141.method2761();
		Static77.method1751(10);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V")
	public static void method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass54_1 = null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!rf;Lclient!rf;Lclient!u;IZII)V")
	public static void method978(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(4) int local4 = arg2.method3309(arg0);
		@Pc(19) int local19 = arg2.method3312(arg1, local4);
		Static36.method922(local19, arg2, 255, local4);
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)I")
	public static int method979() {
		@Pc(8) int local8 = 3;
		if (Static42.anInt1424 < 310) {
			@Pc(21) int local21 = Static79.anInt2448 >> 7;
			@Pc(26) int local26 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7;
			@Pc(30) int local30 = Static83.anInt4536 >> 7;
			@Pc(35) int local35 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7;
			if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][local21][local30] & 0x4) != 0) {
				local8 = Static56.anInt1784;
			}
			@Pc(59) int local59;
			if (local21 >= local26) {
				local59 = local21 - local26;
			} else {
				local59 = local26 - local21;
			}
			@Pc(78) int local78;
			if (local30 >= local35) {
				local78 = local30 - local35;
			} else {
				local78 = local35 - local30;
			}
			@Pc(94) int local94;
			@Pc(96) int local96;
			if (local78 >= local59) {
				local94 = local59 * 65536 / local78;
				local96 = 32768;
				while (local30 != local35) {
					local96 += local94;
					if (local35 > local30) {
						local30++;
					} else if (local35 < local30) {
						local30--;
					}
					if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][local21][local30] & 0x4) != 0) {
						local8 = Static56.anInt1784;
					}
					if (local96 >= 65536) {
						local96 -= 65536;
						if (local21 < local26) {
							local21++;
						} else if (local26 < local21) {
							local21--;
						}
						if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][local21][local30] & 0x4) != 0) {
							local8 = Static56.anInt1784;
						}
					}
				}
			} else {
				local94 = local78 * 65536 / local59;
				local96 = 32768;
				while (local21 != local26) {
					if (local26 > local21) {
						local21++;
					} else if (local21 > local26) {
						local21--;
					}
					if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][local21][local30] & 0x4) != 0) {
						local8 = Static56.anInt1784;
					}
					local96 += local94;
					if (local96 >= 65536) {
						local96 -= 65536;
						if (local35 > local30) {
							local30++;
						} else if (local35 < local30) {
							local30--;
						}
						if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][local21][local30] & 0x4) != 0) {
							local8 = Static56.anInt1784;
						}
					}
				}
			}
		}
		if ((Static20.aByteArrayArrayArray1[Static56.anInt1784][Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 >> 7][Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 >> 7] & 0x4) != 0) {
			local8 = Static56.anInt1784;
		}
		return local8;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
	public static void method980() {
		anIntArray124 = null;
		aByteArrayArray2 = null;
		aClass70_431 = null;
		aClass70_429 = null;
		aClass70_427 = null;
		aClass70_430 = null;
		aClass70_428 = null;
	}
}
