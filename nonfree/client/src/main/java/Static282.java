import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!qj", name = "W", descriptor = "Lclient!b;")
	public static Class20 aClass20_65;

	@OriginalMember(owner = "client!qj", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "[I")
	public static final int[] anIntArray545 = new int[1000];

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "Lclient!us;")
	public static final Class234 aClass234_99 = new Class234(91, 2);

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!qj", name = "Y", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!qj", name = "Z", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	public static void method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static366.aClass190_7.method4358(Static14.aClass57_6.method1122(Static66.anInt1307));
		@Pc(30) int local30;
		for (@Pc(24) Class3_Sub4 local24 = (Class3_Sub4) Static47.aClass138_7.method3051(); local24 != null; local24 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			local30 = Static133.method2093(local24);
			if (local17 < local30) {
				local17 = local30;
			}
		}
		local17 += 8;
		local30 = Static105.anInt2076 * 16 + 21;
		@Pc(65) int local65 = arg0 - local17 / 2;
		if (Static199.anInt3567 < local65 + local17) {
			local65 = Static199.anInt3567 - local17;
		}
		if (local65 < 0) {
			local65 = 0;
		}
		@Pc(89) int local89 = arg1;
		if (arg1 + local30 > Static207.anInt2251) {
			local89 = Static207.anInt2251 - local30;
		}
		if (local89 < 0) {
			local89 = 0;
		}
		Static96.anInt1932 = local65;
		Static287.aBoolean397 = true;
		Static321.anInt3403 = local89;
		Static392.anInt6472 = local17;
		Static139.anInt2635 = Static105.anInt2076 * 16 + (Static349.aBoolean449 ? 26 : 22);
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	public static void method4478() {
		Static278.aClass155_6.method4915(Static136.anInt2618, Static164.aClass154_Sub1_1.aBoolean459 ? Static108.anInt2131 + 256 : -1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III[Lclient!dt;ZZ)V")
	public static void method4479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62[] arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) Class62 local14 = arg3[local8];
			if (local14 != null && arg0 == local14.anInt1506) {
				Static26.method322(arg1, arg2, local14, arg4);
				Static295.method4557(arg2, local14, arg1);
				if (local14.anInt1562 - local14.anInt1546 < local14.anInt1574) {
					local14.anInt1574 = local14.anInt1562 - local14.anInt1546;
				}
				if (local14.anInt1574 < 0) {
					local14.anInt1574 = 0;
				}
				if (local14.anInt1504 > local14.anInt1537 - local14.anInt1551) {
					local14.anInt1504 = local14.anInt1537 - local14.anInt1551;
				}
				if (local14.anInt1504 < 0) {
					local14.anInt1504 = 0;
				}
				if (local14.anInt1575 == 0) {
					Static54.method993(arg4, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZFIIIII)[I")
	public static int[] method4480(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub1_Sub1 local10 = new Class3_Sub1_Sub1();
		local10.anInt69 = 8;
		local10.anInt56 = 4;
		local10.anInt66 = 35;
		local10.aBoolean6 = true;
		local10.anInt59 = (int) (arg0 * 4096.0F);
		local10.anInt54 = 8;
		local10.method5552();
		Static223.method3716(2048, 1);
		local10.method58(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
	public static void method4482() {
		for (@Pc(7) int local7 = 0; local7 < Static280.aClass102ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static280.aClass102ArrayArray1[local7].length; local11++) {
				Static280.aClass102ArrayArray1[local7][local11] = Static150.aClass102_5;
			}
		}
	}
}
