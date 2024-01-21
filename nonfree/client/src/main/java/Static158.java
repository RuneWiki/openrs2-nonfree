import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!bc;")
	public static Class5 aClass5_4;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public static int anInt3508;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2049 = Static107.method1838("(U0a )2 in: ");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2050 = Static107.method1838("_");

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2051 = Static107.method1838(" weitere Optionen");

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt3499 = 0;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2052 = Static107.method1838("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!td", name = "l", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2053 = Static107.method1838("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!td", name = "m", descriptor = "[I")
	public static int[] anIntArray325 = new int[2000];

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public static int anInt3505 = 0;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2054 = aClass28_2053;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lclient!gg;")
	public static Class28 method2411(@OriginalArg(1) int arg0) {
		return Static142.method2254(false, arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method2413() {
		aClass28_2049 = null;
		aClass28_2054 = null;
		aClass28_2053 = null;
		aClass5_4 = null;
		aClass28_2052 = null;
		anIntArray325 = null;
		aClass28_2050 = null;
		aClass28_2051 = null;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)Z")
	public static boolean method2414(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!gg;III)V")
	public static void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class24 local4 = Static12.method360(arg3, arg0);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray5 != null) {
			@Pc(18) Class2_Sub21 local18 = new Class2_Sub21();
			local18.anObjectArray29 = local4.anObjectArray5;
			local18.aClass24_9 = local4;
			local18.anInt2857 = arg2;
			local18.aClass28_1673 = arg1;
			Static118.method2854(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt1388 > 0) {
			local36 = Static154.method2376(local4);
		}
		if (!local36 || !Static64.method1173(arg2 - 1, Static10.method323(local4))) {
			return;
		}
		if (arg2 == 1) {
			Static128.aClass2_Sub2_Sub1_2.method1711(217);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 2) {
			Static128.aClass2_Sub2_Sub1_2.method1711(53);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 3) {
			Static128.aClass2_Sub2_Sub1_2.method1711(21);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 4) {
			Static128.aClass2_Sub2_Sub1_2.method1711(25);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 5) {
			Static128.aClass2_Sub2_Sub1_2.method1711(37);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 6) {
			Static128.aClass2_Sub2_Sub1_2.method1711(97);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 7) {
			Static128.aClass2_Sub2_Sub1_2.method1711(140);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 8) {
			Static128.aClass2_Sub2_Sub1_2.method1711(54);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 9) {
			Static128.aClass2_Sub2_Sub1_2.method1711(101);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
		if (arg2 == 10) {
			Static128.aClass2_Sub2_Sub1_2.method1711(96);
			Static128.aClass2_Sub2_Sub1_2.method1710(arg0);
			Static128.aClass2_Sub2_Sub1_2.method1696(arg3);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public static int method2416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub11 local17 = (Class2_Sub11) Static101.aClass35_6.method1354((long) arg1);
		if (local17 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray202.length; local31++) {
				if (arg0 == local17.anIntArray203[local31]) {
					local29 += local17.anIntArray202[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	public static void method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg2 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg3 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg5;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (local21 != 0) {
			local36 = Class2_Sub4_Sub3_Sub1.anIntArray58[local21];
			local40 = Class2_Sub4_Sub3_Sub1.anIntArray60[local21];
			local50 = local40 * 0 - arg5 * local36 >> 16;
			local27 = arg5 * local40 + local36 * 0 >> 16;
			local25 = local50;
		}
		if (local10 != 0) {
			local36 = Class2_Sub4_Sub3_Sub1.anIntArray58[local10];
			local40 = Class2_Sub4_Sub3_Sub1.anIntArray60[local10];
			local50 = local36 * local27 + local40 * 0 >> 16;
			local27 = local27 * local40 - local36 * 0 >> 16;
			local23 = local50;
		}
		Static36.anInt977 = arg0 - local23;
		Static112.anInt2716 = arg3;
		Static33.anInt943 = arg2;
		Static40.anInt1057 = arg4 - local25;
		Static21.anInt726 = arg1 - local27;
	}
}
