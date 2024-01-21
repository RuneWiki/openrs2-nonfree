import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "J")
	public static long aLong56;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_24;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "I")
	public static int anInt1673;

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_569 = Static161.method2971("Nehmen");

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_570 = Static161.method2971(")2");

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "Lclient!ld;")
	public static Class47 aClass47_11 = new Class47(128);

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "I")
	public static int anInt1674 = -1;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_571 = Static161.method2971("blinken1:");

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "[I")
	public static int[] anIntArray178 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_572 = Static161.method2971("cyan:");

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_573 = aClass13_572;

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_574 = Static161.method2971("Fallen lassen");

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "[I")
	public static int[] anIntArray179 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_575 = aClass13_572;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public static void method1264() {
		anIntArray179 = null;
		aClass47_11 = null;
		aClass13_574 = null;
		aClass13_575 = null;
		anIntArrayArrayArray2 = null;
		aClass13_573 = null;
		aClass13_572 = null;
		aClass13_570 = null;
		aClass13_569 = null;
		aClass13_571 = null;
		aClass4_Sub1_24 = null;
		anIntArray178 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIIZBLclient!o;)V")
	public static void method1267(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class4_Sub1 arg5) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg0);
		@Pc(16) Class1_Sub2_Sub12 local16 = (Class1_Sub2_Sub12) Static29.aClass45_5.method1988(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static4.aClass45_1.method1988(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static101.aClass45_10.method1988(local10);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class1_Sub2_Sub12) Static8.aClass45_2.method1988(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub2_Sub12();
			local16.aClass4_Sub1_39 = arg5;
			local16.anInt2971 = arg2;
			local16.aByte6 = arg1;
			if (arg4) {
				Static29.aClass45_5.method1981(local16, local10);
				Static118.anInt3129++;
			} else {
				Static70.aClass79_1.method2672(local16);
				Static101.aClass45_10.method1981(local16, local10);
				Static94.anInt2744++;
			}
		} else if (arg4) {
			local16.method2789();
			Static29.aClass45_5.method1981(local16, local10);
			Static118.anInt3129++;
			Static94.anInt2744--;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
	public static void method1268(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static168.method2878(Static132.aClass13_1120, Static114.aClass13_1027, Static101.aClass13_926);
		} else if (arg0 == -2) {
			Static168.method2878(Static41.aClass13_462, Static101.aClass13_896, Static101.aClass13_901);
		} else if (arg0 == -1) {
			Static168.method2878(Static132.aClass13_1122, Static26.aClass13_317, Static101.aClass13_914);
		} else if (arg0 == 3) {
			Static168.method2878(Static153.aClass13_1254, Static101.aClass13_917, Static101.aClass13_925);
		} else if (arg0 == 4) {
			Static168.method2878(Static65.aClass13_658, Static65.aClass13_660, Static101.aClass13_902);
		} else if (arg0 == 5) {
			Static168.method2878(Static151.aClass13_1439, Static20.aClass13_283, Static101.aClass13_911);
		} else if (arg0 == 6) {
			Static168.method2878(Static42.aClass13_485, Static180.aClass13_1406, Static101.aClass13_930);
		} else if (arg0 == 7) {
			Static168.method2878(Static67.aClass13_672, Static98.aClass13_1291, Static101.aClass13_918);
		} else if (arg0 == 8) {
			Static168.method2878(Static49.aClass13_545, Static115.aClass13_1028, Static101.aClass13_933);
		} else if (arg0 == 9) {
			Static168.method2878(Static96.aClass13_886, Static157.aClass13_1279, Static101.aClass13_907);
		} else if (arg0 == 10) {
			Static168.method2878(Static156.aClass13_1263, Static115.aClass13_1032, Static101.aClass13_916);
		} else if (arg0 == 11) {
			Static168.method2878(Static169.aClass13_1366, Static65.aClass13_656, Static101.aClass13_906);
		} else if (arg0 == 12) {
			Static168.method2878(Static8.aClass13_143, Static179.aClass13_1396, Static101.aClass13_913);
		} else if (arg0 == 13) {
			Static168.method2878(Static132.aClass13_1121, Static88.aClass13_828, Static101.aClass13_899);
		} else if (arg0 == 14) {
			Static168.method2878(Static150.aClass13_1247, Static64.aClass13_653, Static101.aClass13_900);
		} else if (arg0 == 16) {
			Static168.method2878(Static164.aClass13_1332, Static140.aClass13_1190, Static101.aClass13_920);
		} else if (arg0 == 17) {
			Static168.method2878(Static38.aClass13_423, Static49.aClass13_539, Static101.aClass13_908);
		} else if (arg0 == 18) {
			Static168.method2878(Static10.aClass13_170, Static45.aClass13_515, Static101.aClass13_897);
		} else if (arg0 == 19) {
			Static168.method2878(Static141.aClass13_1201, Static6.aClass13_131, Static67.aClass13_674);
		} else if (arg0 == 20) {
			Static168.method2878(Static132.aClass13_1116, Static73.aClass13_714, Static101.aClass13_922);
		} else if (arg0 == 22) {
			Static168.method2878(Static15.aClass13_248, Static28.aClass13_330, Static101.aClass13_910);
		} else if (arg0 == 23) {
			Static168.method2878(Static150.aClass13_1249, Static96.aClass13_884, Static101.aClass13_927);
		} else if (arg0 == 24) {
			Static168.method2878(Static87.aClass13_822, Static68.aClass13_675, Static101.aClass13_915);
		} else if (arg0 == 25) {
			Static168.method2878(Static132.aClass13_1119, Static35.aClass13_413, Static101.aClass13_932);
		} else if (arg0 == 26) {
			Static168.method2878(Static2.aClass13_25, Static160.aClass13_1301, Static101.aClass13_904);
		} else if (arg0 == 27) {
			Static168.method2878(Static93.aClass13_870, Static101.aClass13_928, Static101.aClass13_919);
		} else {
			Static168.method2878(Static132.aClass13_1115, Static44.aClass13_505, Static101.aClass13_909);
		}
		Static53.method1293(10);
	}
}
