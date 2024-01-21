import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array5;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
	public static int anInt2924 = 0;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public static int anInt2925 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1720 = Static107.method1838("rect_debug=");

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1721 = Static107.method1838(" seconds)3");

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
	public static int[] anIntArray269 = new int[50];

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1722 = aClass28_1721;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!eh;)V")
	public static void method2013(@OriginalArg(1) Class2_Sub4_Sub1_Sub1 arg0) {
		if (arg0.anInt1632 == Static156.anInt3491 || arg0.anInt1653 == -1 || arg0.anInt1641 != 0 || arg0.anInt1616 + 1 > Static49.method926(arg0.anInt1653).anIntArray36[arg0.anInt1597]) {
			@Pc(41) int local41 = arg0.anInt1632 - arg0.anInt1620;
			@Pc(47) int local47 = Static156.anInt3491 - arg0.anInt1620;
			@Pc(58) int local58 = arg0.anInt1598 * 128 + arg0.anInt1618 * 64;
			@Pc(68) int local68 = arg0.anInt1618 * 64 + arg0.anInt1642 * 128;
			@Pc(78) int local78 = arg0.anInt1647 * 128 + arg0.anInt1618 * 64;
			arg0.anInt1633 = ((local41 - local47) * local68 + local47 * local78) / local41;
			@Pc(103) int local103 = arg0.anInt1618 * 64 + arg0.anInt1605 * 128;
			arg0.anInt1635 = (local58 * (local41 - local47) + local47 * local103) / local41;
		}
		if (arg0.anInt1652 == 0) {
			arg0.anInt1623 = 1024;
		}
		if (arg0.anInt1652 == 1) {
			arg0.anInt1623 = 1536;
		}
		arg0.anInt1638 = 0;
		if (arg0.anInt1652 == 2) {
			arg0.anInt1623 = 0;
		}
		if (arg0.anInt1652 == 3) {
			arg0.anInt1623 = 512;
		}
		arg0.anInt1603 = arg0.anInt1623;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method2014() {
		Static157.aClass14_176.method596();
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method2015() {
		aClass28_1720 = null;
		aClass2_Sub4_Sub3_Sub3Array5 = null;
		anIntArray269 = null;
		aClass28_1721 = null;
		aClass28_1722 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
	public static boolean method2017(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIILclient!jc;)Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 method2018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class40 arg2) {
		return Static108.method1851(arg2, arg1, arg0) ? Static67.method1223() : null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ka;IIIII)V")
	public static void method2019(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static152.anInt3423) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static178.anInt3959) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static13.anInt587 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub14 local62 = Static133.aClass2_Sub14ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static90.anIntArrayArrayArray7[local17][local23][local32] + Static90.anIntArrayArrayArray7[local17][local23 + 1][local32] + Static90.anIntArrayArrayArray7[local17][local23][local32 + 1] + Static90.anIntArrayArrayArray7[local17][local23 + 1][local32 + 1]) / 4 - (Static90.anIntArrayArrayArray7[arg1][arg2][arg3] + Static90.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static90.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static90.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class52 local151 = local62.aClass52_1;
									if (local151 != null) {
										@Pc(161) Class2_Sub4_Sub1_Sub5 local161;
										if (local151.aClass2_Sub4_Sub1_6 instanceof Class2_Sub4_Sub1_Sub5) {
											local161 = (Class2_Sub4_Sub1_Sub5) local151.aClass2_Sub4_Sub1_6;
											Static86.method1543(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass2_Sub4_Sub1_5 instanceof Class2_Sub4_Sub1_Sub5) {
											local161 = (Class2_Sub4_Sub1_Sub5) local151.aClass2_Sub4_Sub1_5;
											Static86.method1543(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt2269; local225++) {
										@Pc(231) Class43 local231 = local62.aClass43Array56[local225];
										if (local231 != null && local231.aClass2_Sub4_Sub1_2 instanceof Class2_Sub4_Sub1_Sub5) {
											@Pc(241) Class2_Sub4_Sub1_Sub5 local241 = (Class2_Sub4_Sub1_Sub5) local231.aClass2_Sub4_Sub1_2;
											@Pc(249) int local249 = local231.anInt2321 + 1 - local231.anInt2326;
											@Pc(257) int local257 = local231.anInt2319 + 1 - local231.anInt2322;
											Static86.method1543(arg0, local241, (local231.anInt2326 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt2322 - arg3) * 128 + (local257 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!gg;Lclient!jc;IILclient!gg;ZI)V")
	public static void method2020(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(4) Class28 arg2) {
		@Pc(15) int local15 = arg1.method1777(arg2);
		@Pc(21) int local21 = arg1.method1774(arg0, local15);
		Static96.method1719(local15, local21, 255, arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	public static void method2022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static128.aClass2_Sub2_Sub1_2.method1711(73);
		Static128.aClass2_Sub2_Sub1_2.method1687(arg0);
		Static128.aClass2_Sub2_Sub1_2.method1658(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Object;ILclient!qe;)V")
	public static void method2023(@OriginalArg(0) Object arg0, @OriginalArg(2) Class66 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static176.method2744(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
