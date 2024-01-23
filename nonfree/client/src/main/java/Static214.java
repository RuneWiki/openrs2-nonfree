import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!cg;")
	public static Class22 aClass22_98;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[Lclient!ql;")
	public static Class64_Sub1[] aClass64_Sub1Array3 = new Class64_Sub1[0];

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "[I")
	public static int[] anIntArray446 = new int[25];

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4431(@OriginalArg(0) boolean arg0) {
		@Pc(5) boolean local5 = Static281.method4369();
		if (local5 == arg0) {
			return true;
		}
		if (!arg0) {
			Static281.method4361();
		} else if (!Static281.method4364() || !Static281.method4367() || !Static281.method4373()) {
			arg0 = false;
		}
		Static74.aBoolean87 = arg0;
		Static204.method3268(Static95.aClass184_3);
		if (arg0 == local5) {
			return false;
		} else {
			((Class95_Sub1) Static283.anInterface1_1).method2450();
			return true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V")
	public static void method4432(@OriginalArg(0) int arg0) {
		if (Static48.method951(arg0)) {
			Static228.method3586(Static217.aClass97ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
	public static void method4434() {
		Static49.aClass163_15 = new Class163(32);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!mj;B)V")
	public static void method4435(@OriginalArg(0) Class4_Sub6 arg0) {
		if (arg0.aClass4_Sub5_5 != null) {
			arg0.aClass4_Sub5_5.anInt4734 = 0;
		}
		arg0.aBoolean298 = false;
		for (@Pc(25) Class4_Sub6 local25 = arg0.method3727(); local25 != null; local25 = arg0.method3725()) {
			method4435(local25);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!wc;)V")
	public static void method4436(@OriginalArg(1) Class13_Sub5 arg0) {
		@Pc(5) int local5 = arg0.anInt5285 - Static50.anInt1118;
		@Pc(17) int local17 = arg0.anInt5332 * 128 + arg0.method4219() * 64;
		@Pc(37) int local37 = arg0.anInt5257 * 128 + arg0.method4219() * 64;
		arg0.anInt5322 = 0;
		arg0.anInt5294 += (local37 - arg0.anInt5294) / local5;
		arg0.anInt5334 += (local17 - arg0.anInt5334) / local5;
		if (arg0.anInt5284 == 0) {
			arg0.anInt5266 = 1024;
		}
		if (arg0.anInt5284 == 1) {
			arg0.anInt5266 = 1536;
		}
		if (arg0.anInt5284 == 2) {
			arg0.anInt5266 = 0;
		}
		if (arg0.anInt5284 == 3) {
			arg0.anInt5266 = 512;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4437() {
		@Pc(32) String local32;
		if (Static116.anInt5523 == 1 && Static286.anInt5602 < 2) {
			local32 = Static118.aString86 + Static169.aString120 + Static137.aString92 + " ->";
		} else if (Static145.aBoolean386 && Static286.anInt5602 < 2) {
			local32 = Static201.aString139 + Static169.aString120 + Static160.aString115 + " ->";
		} else if (Static168.aBoolean217 && Static113.aBooleanArray18[81] && Static286.anInt5602 > 2) {
			local32 = Static149.method2347(Static286.anInt5602 - 2);
		} else {
			local32 = Static149.method2347(Static286.anInt5602 - 1);
		}
		if (Static286.anInt5602 > 2) {
			local32 = local32 + "<col=ffffff> / " + (Static286.anInt5602 - 2) + Static35.aString10;
		}
		return local32;
	}
}
