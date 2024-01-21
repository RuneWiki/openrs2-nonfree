import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!uf;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1 = Static134.method2017("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!v;")
	private static Class76 aClass76_3 = Static134.method2017("Existing User");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_2 = aClass76_3;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt4 = 0;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!v;")
	private static Class76 aClass76_6 = Static134.method2017("Sorry invited players only)3");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_4 = aClass76_6;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_5 = Static134.method2017("titlebutton");

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	public static int[] anIntArray2 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)I")
	public static int method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg4;
			arg4 = arg3;
			arg3 = local19;
		}
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return 1 + 7 - arg3 - arg5;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZI)Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg2 << 40) + (long) arg4 + ((long) arg0 << 16) + ((long) arg1 << 38);
		@Pc(33) Class4_Sub4_Sub5_Sub2 local33;
		if (!arg3) {
			local33 = (Class4_Sub4_Sub5_Sub2) Static60.aClass72_17.method1781(local23);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(41) Class4_Sub4_Sub7 local41 = Static61.method1040(arg4);
		if (arg0 > 1 && local41.anIntArray157 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg0 >= local41.anIntArray160[local51] && local41.anIntArray160[local51] != 0) {
					local49 = local41.anIntArray157[local51];
				}
			}
			if (local49 != -1) {
				local41 = Static61.method1040(local49);
			}
		}
		@Pc(95) Class4_Sub4_Sub3_Sub7 local95 = local41.method851(1);
		if (local95 == null) {
			return null;
		}
		@Pc(101) Class4_Sub4_Sub5_Sub2 local101 = null;
		if (local41.anInt1262 != -1) {
			local101 = method2(10, 1, 0, true, local41.anInt1276);
			if (local101 == null) {
				return null;
			}
		}
		@Pc(120) int local120 = Static46.anInt2602;
		@Pc(122) int local122 = Static46.anInt2601;
		@Pc(125) int[] local125 = new int[4];
		@Pc(127) int[] local127 = Static46.anIntArray387;
		Static46.method1820(local125);
		local33 = new Class4_Sub4_Sub5_Sub2(36, 32);
		Static46.method1830(local33.anIntArray166, 36, 32);
		Static46.method1815();
		Static37.method718();
		Static37.method717(16, 16);
		@Pc(148) int local148 = local41.anInt1266;
		if (arg3) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg1 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		Static37.aBoolean63 = false;
		@Pc(180) int local180 = Class4_Sub4_Sub5_Sub1.anIntArray119[local41.anInt1253] * local148 >> 16;
		@Pc(189) int local189 = Class4_Sub4_Sub5_Sub1.anIntArray118[local41.anInt1253] * local148 >> 16;
		local95.method1767();
		local95.method1772(local41.anInt1248, local41.anInt1247, local41.anInt1253, local41.anInt1249, local41.anInt1257 + local189 + local95.anInt2514 / 2, local41.anInt1257 + local180);
		if (arg1 >= 1) {
			local33.method916(1);
		}
		if (arg1 >= 2) {
			local33.method916(16777215);
		}
		if (arg2 != 0) {
			local33.method911(arg2);
		}
		Static46.method1830(local33.anIntArray166, 36, 32);
		if (local41.anInt1262 != -1) {
			local101.method903(0, 0);
		}
		if (!arg3 && (local41.anInt1270 == 1 || arg0 != 1) && arg0 != -1) {
			Static56.aClass4_Sub4_Sub5_Sub3_Sub1_3.method1334(Static41.method783(arg0), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static60.aClass72_17.method1783(local33, local23);
		}
		Static46.method1830(local127, local120, local122);
		Static46.method1821(local125);
		Static37.method718();
		Static37.aBoolean63 = true;
		return local33;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILclient!la;)Z")
	public static boolean method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class17 arg2) {
		@Pc(16) byte[] local16 = arg2.method290(arg0, arg1);
		if (local16 == null) {
			return false;
		} else {
			Static94.method1511(local16);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method4() {
		anIntArray2 = null;
		aClass76_1 = null;
		Class1.anIntArray1 = null;
		aClass76_5 = null;
		aClass76_3 = null;
		aClass76_4 = null;
		aShortArrayArray1 = null;
		aClass76_2 = null;
		aClass75_1 = null;
		aClass76_6 = null;
		aCanvas1 = null;
	}
}
