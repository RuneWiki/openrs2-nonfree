import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!e", name = "E", descriptor = "Lclient!sc;")
	private static Class107 aClass107_314 = Static231.method3737("Loaded interfaces");

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_313 = aClass107_314;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!sc;")
	public static Class107 aClass107_315 = Static231.method3737("hitmarks");

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_317 = Static231.method3737("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!sc;")
	public static Class107 aClass107_316 = aClass107_317;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int anInt1057 = 100;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "I")
	public static int anInt1062 = 50;

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	public static int anInt1068 = -1;

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
	public static int anInt1069 = 0;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method924() {
		Static58.aClass61_20.method1689();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZ)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static205.method3251(arg0, arg2, arg3 + arg0, arg1 + arg2);
		Static205.method3250(arg0, arg2, arg3, arg1, 0);
		if (Static107.anInt2345 < 100) {
			return;
		}
		if (Static213.aClass1_Sub2_Sub2_93 == null || Static213.aClass1_Sub2_Sub2_93.anInt209 != arg3 || Static213.aClass1_Sub2_Sub2_93.anInt208 != arg1) {
			@Pc(50) Class1_Sub2_Sub2_Sub1 local50 = new Class1_Sub2_Sub2_Sub1(arg3, arg1);
			Static205.method3242(local50.anIntArray13, arg3, arg1);
			Static110.method1917(0, 0, Static152.anInt3375, arg1, 0, arg3, Static170.anInt3706, 0);
			Static213.aClass1_Sub2_Sub2_93 = local50;
			Static42.aClass23_1.method2204();
		}
		Static213.aClass1_Sub2_Sub2_93.method195(arg0, arg2);
		@Pc(86) int local86 = arg3 * Static23.anInt441 / Static170.anInt3706 + arg0;
		@Pc(95) int local95 = arg2 + Static125.anInt2702 * arg1 / Static152.anInt3375;
		@Pc(101) int local101 = Static153.anInt3387 * arg1 / Static152.anInt3375;
		@Pc(107) int local107 = Static92.anInt1983 * arg3 / Static170.anInt3706;
		Static205.method3258(local86, local95, local107, local101, 16711680, 128);
		Static205.method3249(local86, local95, local107, local101, 16711680);
		if (Static92.anInt1986 <= 0 || Static92.anInt1986 % 10 >= 5) {
			return;
		}
		for (@Pc(134) Class1_Sub25 local134 = (Class1_Sub25) Static199.aClass120_20.method3564(); local134 != null; local134 = (Class1_Sub25) Static199.aClass120_20.method3561()) {
			if (Static34.anInt720 == local134.anInt3763) {
				@Pc(154) int local154 = arg0 + arg3 * local134.anInt3754 / Static170.anInt3706;
				@Pc(163) int local163 = local134.anInt3755 * arg1 / Static152.anInt3375 + arg2;
				Static205.method3250(local154 - 2, local163 + -2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public static int method926(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public static void method927() {
		while (true) {
			@Pc(13) Class120 local13 = Static192.aClass120_19;
			@Pc(20) Class1_Sub3 local20;
			synchronized (Static192.aClass120_19) {
				local20 = (Class1_Sub3) Static212.aClass120_21.method3566();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass28_Sub1_12.method854(local20.aClass73_1, (int) local20.aLong177, false, local20.aByteArray1);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BB)I")
	public static int method929(@OriginalArg(0) byte arg0) {
		if (arg0 >= 65 && arg0 <= 90) {
			return arg0 - 65;
		} else if (arg0 >= 97 && arg0 <= 122) {
			return arg0 + 26 - 97;
		} else if (arg0 >= 48 && arg0 <= 57) {
			return arg0 + 52 - 48;
		} else if (arg0 == 43) {
			return 62;
		} else if (arg0 == 42) {
			return 62;
		} else if (arg0 == 47) {
			return 63;
		} else if (arg0 == 45) {
			return 63;
		} else {
			return -1;
		}
	}
}
