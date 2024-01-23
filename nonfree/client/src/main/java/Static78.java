import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "Lclient!kb;")
	public static Class83 aClass83_47;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
	public static int anInt1884;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
	public static int anInt1887;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	public static int anInt1880 = -1;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
	public static volatile int anInt1882 = 0;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "[I")
	public static int[] anIntArray197 = new int[200];

	@OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
	public static int anInt1888 = 0;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(B)Ljava/lang/String;")
	public static String method1413() {
		@Pc(13) String local13 = "www";
		if (Static105.anInt6119 != 0) {
			local13 = "www-wtqa";
		}
		@Pc(20) String local20 = "";
		if (Static24.aString15 != null) {
			local20 = "/p=" + Static24.aString15;
		}
		return "http://" + local13 + ".runescape.com/l=" + Static244.anInt5333 + "/a=" + Static178.anInt4015 + local20 + "/";
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Lclient!eh;")
	public static Class1_Sub2_Sub6 method1414() {
		@Pc(13) Class1_Sub2_Sub6 local13 = (Class1_Sub2_Sub6) Static80.aClass104_6.method3152();
		if (local13 != null) {
			local13.method4742();
			local13.method4661();
			return local13;
		}
		do {
			local13 = (Class1_Sub2_Sub6) Static18.aClass104_1.method3152();
			if (local13 == null) {
				return null;
			}
			if (local13.method1194() > Static294.method4792()) {
				return null;
			}
			local13.method4742();
			local13.method4661();
		} while ((local13.aLong198 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public static void method1415() {
		@Pc(6) Class1_Sub5 local6;
		for (local6 = (Class1_Sub5) Static130.aClass131_6.method3791(); local6 != null; local6 = (Class1_Sub5) Static130.aClass131_6.method3792()) {
			if (local6.aBoolean73) {
				local6.method926();
			}
		}
		for (local6 = (Class1_Sub5) Static234.aClass131_16.method3791(); local6 != null; local6 = (Class1_Sub5) Static234.aClass131_16.method3792()) {
			if (local6.aBoolean73) {
				local6.method926();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!db;II)V")
	public static void method1416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt1230 == -1 && arg2.anIntArray116 == null) {
			return;
		}
		@Pc(21) int local21 = Static210.anInt4682 * arg2.anInt1229 >> 8;
		@Pc(23) int local23 = 0;
		if (arg3 > arg2.anInt1232) {
			local23 = arg3 - arg2.anInt1232;
		} else if (arg2.anInt1224 > arg3) {
			local23 = arg2.anInt1224 - arg3;
		}
		if (arg4 > arg2.anInt1227) {
			local23 += arg4 - arg2.anInt1227;
		} else if (arg4 < arg2.anInt1223) {
			local23 += arg2.anInt1223 - arg4;
		}
		if (arg2.anInt1234 == 0 || arg2.anInt1234 < local23 - 64 || Static210.anInt4682 == 0 || arg2.anInt1231 != arg1) {
			if (arg2.aClass1_Sub3_Sub4_2 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(arg2.aClass1_Sub3_Sub4_2);
				arg2.aClass1_Sub3_Sub4_2 = null;
			}
			if (arg2.aClass1_Sub3_Sub4_1 != null) {
				Static245.aClass1_Sub3_Sub1_2.method520(arg2.aClass1_Sub3_Sub4_1);
				arg2.aClass1_Sub3_Sub4_1 = null;
			}
			return;
		}
		local23 -= 64;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(144) int local144 = (arg2.anInt1234 - local23) * local21 / arg2.anInt1234;
		if (arg2.aClass1_Sub3_Sub4_2 != null) {
			arg2.aClass1_Sub3_Sub4_2.method2548(local144);
		} else if (arg2.anInt1230 >= 0) {
			@Pc(167) Class118 local167 = Static307.method3527(Static80.aClass83_49, arg2.anInt1230, 0);
			if (local167 != null) {
				@Pc(175) Class1_Sub4_Sub1 local175 = local167.method3526().method3838(Static161.aClass135_1);
				@Pc(180) Class1_Sub3_Sub4 local180 = Static304.method2549(local175, local144);
				local180.method2583(-1);
				Static245.aClass1_Sub3_Sub1_2.method522(local180);
				arg2.aClass1_Sub3_Sub4_2 = local180;
			}
		}
		if (arg2.aClass1_Sub3_Sub4_1 != null) {
			arg2.aClass1_Sub3_Sub4_1.method2548(local144);
			if (!arg2.aClass1_Sub3_Sub4_1.method4743()) {
				arg2.aClass1_Sub3_Sub4_1 = null;
			}
		} else if (arg2.anIntArray116 != null && (arg2.anInt1226 -= arg0) <= 0) {
			@Pc(230) int local230 = (int) ((double) arg2.anIntArray116.length * Math.random());
			@Pc(238) Class118 local238 = Static307.method3527(Static80.aClass83_49, arg2.anIntArray116[local230], 0);
			if (local238 != null) {
				@Pc(246) Class1_Sub4_Sub1 local246 = local238.method3526().method3838(Static161.aClass135_1);
				@Pc(251) Class1_Sub3_Sub4 local251 = Static304.method2549(local246, local144);
				local251.method2583(0);
				Static245.aClass1_Sub3_Sub1_2.method522(local251);
				arg2.aClass1_Sub3_Sub4_1 = local251;
				arg2.anInt1226 = (int) ((double) (arg2.anInt1225 - arg2.anInt1235) * Math.random()) + arg2.anInt1235;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([J[IZ)V")
	public static void method1417(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static122.method2092(arg1, arg0.length - 1, arg0, 0);
	}
}
