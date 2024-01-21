import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt1421;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public static int anInt1424;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt1425;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_460 = Static49.method1293("<img=1>");

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	public static int[] anIntArray133 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!rf;")
	public static Class70 aClass70_461 = Static49.method1293("Fallen lassen");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[Lclient!fa;")
	public static Class1_Sub9[] aClass1_Sub9Array1 = new Class1_Sub9[2048];

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public static int anInt1427 = 10;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!be;Lclient!ue;IB)V")
	public static void method1037(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class76_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class4 local9 = Static89.aClass4_9;
		synchronized (Static89.aClass4_9) {
			for (@Pc(16) Class1_Sub13 local16 = (Class1_Sub13) Static89.aClass4_9.method174(); local16 != null; local16 = (Class1_Sub13) Static89.aClass4_9.method181()) {
				if (local16.aLong147 == (long) arg2 && local16.aClass9_1 == arg0 && local16.anInt2284 == 0) {
					local7 = local16.aByteArray33;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(74) byte[] local74 = arg0.method377(arg2);
			arg1.method3336(arg0, local74, arg2, true);
		} else {
			arg1.method3336(arg0, local7, arg2, true);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!rh;IILclient!ig;IB)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = arg3 * arg3 + arg2 * arg2;
		@Pc(29) int local29 = Math.min(arg4.anInt2340 / 2, arg4.anInt2369 / 2);
		if (local29 * local29 >= local19 || local19 >= 90000) {
			Static57.method1408(arg0, arg4, arg3, arg2, arg1, arg5);
			return;
		}
		@Pc(45) int local45 = Static50.anInt1667 + Static71.anInt2223 & 0x7FF;
		local29 -= 10;
		@Pc(50) int local50 = Class1_Sub1_Sub1_Sub1.anIntArray8[local45];
		@Pc(54) int local54 = Class1_Sub1_Sub1_Sub1.anIntArray11[local45];
		@Pc(62) int local62 = local54 * 256 / (Static25.anInt692 + 256);
		@Pc(70) int local70 = local50 * 256 / (Static25.anInt692 + 256);
		@Pc(81) int local81 = arg3 * local62 + arg2 * local70 >> 16;
		@Pc(92) int local92 = arg3 * local70 - local62 * arg2 >> 16;
		@Pc(98) double local98 = Math.atan2((double) local81, (double) local92);
		@Pc(105) int local105 = (int) ((double) local29 * Math.sin(local98));
		@Pc(112) int local112 = (int) ((double) local29 * Math.cos(local98));
		Static172.aClass1_Sub1_Sub1_Sub4_9.method3019(arg4.anInt2340 / 2 + arg5 + local105 - 10, arg0 - (-(arg4.anInt2369 / 2) - -local112) + -10, local98);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZI)V")
	public static void method1039(@OriginalArg(0) boolean arg0) {
		Static9.aBoolean13 = arg0;
		Static166.anInt4307 = 22050;
		Static136.anInt3563 = 2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method1040() {
		aShortArrayArray2 = null;
		aClass70_460 = null;
		aClass1_Sub1_Sub1_Sub4_5 = null;
		anIntArray133 = null;
		aClass70_461 = null;
		aClass1_Sub9Array1 = null;
	}
}
