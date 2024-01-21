import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!ec;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array53;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!fd;")
	public static Class24 aClass24_22;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt1926 = 0;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_949 = method1231(":duelreq:");

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public static int[] anIntArray204 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_950 = method1231(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!je;")
	private static Class40 aClass40_951 = method1231("flash3:");

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "[Lclient!m;")
	public static Class2_Sub1_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub1_Sub3_Sub2Array2 = new Class2_Sub1_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_952 = method1231("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_953 = aClass40_951;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_954 = method1231("M");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_955 = aClass40_951;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_956 = method1231(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!je;")
	public static Class40 method1231(@OriginalArg(1) String arg0) {
		@Pc(12) byte[] local12 = arg0.getBytes();
		@Pc(15) int local15 = local12.length;
		@Pc(17) int local17 = 0;
		@Pc(21) Class40 local21 = new Class40();
		local21.aByteArray18 = new byte[local15];
		while (local17 < local15) {
			@Pc(33) int local33 = local12[local17++] & 0xFF;
			if (local33 <= 45 && local33 >= 40) {
				if (local17 >= local15) {
					break;
				}
				@Pc(53) int local53 = local12[local17++] & 0xFF;
				local21.aByteArray18[local21.anInt1425++] = (byte) (local53 + local33 * 43 - 48 - 1720);
			} else if (local33 != 0) {
				local21.aByteArray18[local21.anInt1425++] = (byte) local33;
			}
		}
		local21.method961();
		return local21.method971();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!fd;ILclient!fd;)V")
	public static void method1233(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static88.aClass24_25 = arg0;
		Static104.aClass24_29 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public static void method1235() {
		aClass40_956 = null;
		aClass2_Sub1_Sub1_Sub3_Sub2Array2 = null;
		anObject4 = null;
		aClass40_955 = null;
		anIntArray204 = null;
		aClass40_949 = null;
		anIntArray205 = null;
		aClass40_950 = null;
		aClass40_953 = null;
		aClass40_952 = null;
		aClass18_2 = null;
		aClass2_Sub1_Sub2_Sub1Array53 = null;
		aClass40_954 = null;
		anIntArray206 = null;
		aClass24_22 = null;
		aClass40_951 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!tf;B)V")
	public static void method1236(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt2654 == 0) {
			local11 = Static111.aClass30_1.method755(arg0.anInt2647, arg0.anInt2642, arg0.anInt2653);
		}
		if (arg0.anInt2654 == 1) {
			local11 = Static111.aClass30_1.method769(arg0.anInt2647, arg0.anInt2642, arg0.anInt2653);
		}
		if (arg0.anInt2654 == 2) {
			local11 = Static111.aClass30_1.method774(arg0.anInt2647, arg0.anInt2642, arg0.anInt2653);
		}
		if (arg0.anInt2654 == 3) {
			local11 = Static111.aClass30_1.method760(arg0.anInt2647, arg0.anInt2642, arg0.anInt2653);
		}
		if (local11 != 0) {
			local7 = local11 >> 14 & 0x7FFF;
			@Pc(82) int local82 = Static111.aClass30_1.method779(arg0.anInt2647, arg0.anInt2642, arg0.anInt2653, local11);
			local5 = local82 & 0x1F;
			local9 = local82 >> 6 & 0x3;
		}
		arg0.anInt2643 = local5;
		arg0.anInt2649 = local9;
		arg0.anInt2644 = local7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!je;III)V")
	public static void method1238(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class2_Sub13 local4 = Static87.method894(arg0, arg2);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray4 != null) {
			@Pc(18) Class2_Sub7 local18 = new Class2_Sub7();
			local18.aClass40_418 = arg1;
			local18.aClass2_Sub13_4 = local4;
			local18.anObjectArray1 = local4.anObjectArray4;
			local18.anInt714 = arg3;
			Static58.method1028(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt1586 > 0) {
			local36 = Static86.method2170(local4);
		}
		if (!local36 || !Static88.method1598(Static116.method1945(local4), arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static57.aClass2_Sub9_Sub1_2.method673(203);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 2) {
			Static57.aClass2_Sub9_Sub1_2.method673(230);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 3) {
			Static57.aClass2_Sub9_Sub1_2.method673(78);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 4) {
			Static57.aClass2_Sub9_Sub1_2.method673(127);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 5) {
			Static57.aClass2_Sub9_Sub1_2.method673(88);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 6) {
			Static57.aClass2_Sub9_Sub1_2.method673(5);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 7) {
			Static57.aClass2_Sub9_Sub1_2.method673(118);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 8) {
			Static57.aClass2_Sub9_Sub1_2.method673(206);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 9) {
			Static57.aClass2_Sub9_Sub1_2.method673(12);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
		if (arg3 == 10) {
			Static57.aClass2_Sub9_Sub1_2.method673(42);
			Static57.aClass2_Sub9_Sub1_2.method620(arg2);
			Static57.aClass2_Sub9_Sub1_2.method657(arg0);
		}
	}
}
