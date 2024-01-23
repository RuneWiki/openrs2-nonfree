import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	public static int anInt4487;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
	public static int[] anIntArray515;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString144 = "yellow:";

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V")
	public static void method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static91.anInt1713 < 100) {
			Static27.method455();
		}
		if (Static240.aBoolean369) {
			Static50.method867(arg1, arg0, arg1 + arg3, arg2 + arg0);
		} else {
			Static213.method3369(arg1, arg0, arg1 + arg3, arg2 + arg0);
		}
		@Pc(43) int local43;
		@Pc(57) int local57;
		if (Static91.anInt1713 < 100) {
			local43 = arg1 + arg3 / 2;
			local57 = arg0 + arg2 / 2 - 18 - 20;
			if (Static240.aBoolean369) {
				Static50.method866(arg1, arg0, arg3, arg2, 0);
				Static50.method868(local43 - 152, local57, 304, 34, 9179409);
				Static50.method868(local43 - 151, local57 + 1, 302, 32, 0);
				Static50.method866(local43 - 150, local57 + 2, Static91.anInt1713 * 3, 30, 9179409);
				Static50.method866(local43 + Static91.anInt1713 * 3 - 150, local57 + 2, 300 - Static91.anInt1713 * 3, 30, 0);
			} else {
				Static213.method3362(arg1, arg0, arg3, arg2, 0);
				Static213.method3370(local43 - 152, local57, 304, 34, 9179409);
				Static213.method3370(local43 - 151, local57 - -1, 302, 32, 0);
				Static213.method3362(local43 - 150, local57 + 2, Static91.anInt1713 * 3, 30, 9179409);
				Static213.method3362(Static91.anInt1713 * 3 + local43 - 150, local57 + 2, 300 - Static91.anInt1713 * 3, 30, 0);
			}
			Static10.aClass1_Sub2_Sub12_1.method4382(Static45.aString26, local43, local57 + 20, 16777215, -1);
			return;
		}
		Static216.anInt4441 = Static36.anInt4790 - (int) ((float) arg3 / Static243.aFloat145);
		Static204.anInt4015 = (int) ((float) (arg2 * 2) / Static243.aFloat145);
		Static108.anInt2036 = (int) ((float) (arg3 * 2) / Static243.aFloat145);
		@Pc(215) int local215 = Static36.anInt4790 - (int) ((float) arg3 / Static243.aFloat145);
		Static199.anInt3856 = Static33.anInt717 - (int) ((float) arg2 / Static243.aFloat145);
		local43 = Static33.anInt717 - (int) ((float) arg2 / Static243.aFloat145);
		@Pc(239) int local239 = Static33.anInt717 + (int) ((float) arg2 / Static243.aFloat145);
		local57 = Static36.anInt4790 + (int) ((float) arg3 / Static243.aFloat145);
		if (Static240.aBoolean369) {
			if (Static84.aClass1_Sub2_Sub2_Sub1_3 == null || arg3 != Static84.aClass1_Sub2_Sub2_Sub1_3.anInt5119 || arg2 != Static84.aClass1_Sub2_Sub2_Sub1_3.anInt5112) {
				Static84.aClass1_Sub2_Sub2_Sub1_3 = null;
				Static84.aClass1_Sub2_Sub2_Sub1_3 = new Class1_Sub2_Sub2_Sub1(arg3, arg2);
			}
			Static213.method3381(Static84.aClass1_Sub2_Sub2_Sub1_3.anIntArray598, arg3, arg2);
			Static16.method312(0, local215, local43, 0, local57, arg3, arg2, local239);
			Static104.method2548(0, 0, Static77.aBoolean118, local43, arg3, local239, local57, local215, arg2);
			Static118.method1857(arg3, local239, local57, 0, arg2, local43, local215, 0);
			Static84.aClass1_Sub2_Sub2_Sub1_3.method3937();
			Static50.method873(Static84.aClass1_Sub2_Sub2_Sub1_3.anIntArray598, arg1, arg0, arg3, arg2);
			Static213.anIntArray495 = null;
		} else {
			Static16.method312(arg0, local215, local43, arg1, local57, arg3 + arg1, arg0 - -arg2, local239);
			Static104.method2548(arg0, arg1, Static77.aBoolean118, local43, arg3 + arg1, local239, local57, local215, arg2 + arg0);
			Static118.method1857(arg3 + arg1, local239, local57, arg1, arg0 + arg2, local43, local215, arg0);
		}
		if (Static35.anInt735 > 0) {
			Static254.anInt5884--;
			if (Static254.anInt5884 == 0) {
				Static35.anInt735--;
				Static254.anInt5884 = 20;
			}
		}
		if (!Static63.aBoolean101) {
			return;
		}
		@Pc(397) int local397 = arg0 + arg2 - 8;
		@Pc(404) int local404 = arg1 + arg3 - 5;
		Static84.aClass1_Sub2_Sub12_2.method4399("Fps:" + Static249.anInt5049, local404, local397, 16776960, -1);
		@Pc(420) Runtime local420 = Runtime.getRuntime();
		@Pc(429) int local429 = (int) ((local420.totalMemory() - local420.freeMemory()) / 1024L);
		@Pc(431) int local431 = 16776960;
		@Pc(432) int local432 = local397 - 15;
		if (local429 > 65536) {
			local431 = 16711680;
		}
		Static84.aClass1_Sub2_Sub12_2.method4399("Mem:" + local429 + "k", local404, local432, local431, -1);
		local397 = local432 - 15;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)I")
	public static int method3487(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3490(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3491(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}
}
