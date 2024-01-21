import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_1 = new Class1();

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!rd;")
	private static Class63 aClass63_412 = Static80.method1463("Connection timed out)3");

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt649 = 0;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_415 = Static80.method1463(" more options");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_413 = aClass63_415;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public static int anInt652 = 78;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_414 = Static80.method1463("scape main");

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_416 = aClass63_412;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_417 = null;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!aa;")
	public static Class2 aClass2_4 = new Class2(4096);

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_418 = Static80.method1463("backbase1");

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_419 = Static80.method1463("null");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_420 = Static80.method1463("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!rd;")
	private static Class63 aClass63_421 = Static80.method1463("Password: ");

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_422 = aClass63_421;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BJ)V")
	public static void method505(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	public static void method506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class6_Sub3_Sub17 local4 = Static72.method1384(arg1, arg0);
		if (local4 != null && local4.anObjectArray6 != null) {
			Static99.method1836(local4.anObjectArray6, local4, 0, 0, null, 0);
		}
		Static89.anInt2478 = arg0;
		Static72.anInt2049 = arg2;
		Static42.aBoolean63 = true;
		Static42.anInt1321 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lclient!od;")
	public static Class58 method507() {
		try {
			return (Class58) Class.forName("Class58_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!wa;)[I")
	public static int[] method508(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		@Pc(10) int local10 = arg0.anInt3233 >> 16;
		if (!Static36.method866(local10)) {
			return null;
		}
		@Pc(24) int local24 = arg0.anInt3287;
		@Pc(27) int local27 = arg0.anInt3221;
		@Pc(30) int local30 = arg0.anInt3274;
		while (local30 != -1) {
			@Pc(40) Class6_Sub3_Sub17 local40 = Static68.aClass6_Sub3_Sub17ArrayArray1[local10][local30 & 0xFFFF];
			local27 += local40.anInt3221 - local40.anInt3291;
			local30 = local40.anInt3274;
			local24 += local40.anInt3287 - local40.anInt3243;
		}
		return new int[] { local24, local27 };
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!dc;)V")
	public static void method509(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3_Sub1_Sub2 arg1) {
		if (Static73.anInt2064 < arg1.anInt2331) {
			Static98.method1797(arg1);
		} else if (Static73.anInt2064 <= arg1.anInt2332) {
			Static102.method1857(arg1);
		} else {
			Static59.method1163(arg1);
		}
		if (arg1.anInt2319 < 128 || arg1.anInt2347 < 128 || arg1.anInt2319 >= 13184 || arg1.anInt2347 >= 13184) {
			arg1.anInt2347 = arg1.anInt2296 * 64 + arg1.anIntArray271[0] * 128;
			arg1.anInt2334 = -1;
			arg1.anInt2332 = 0;
			arg1.anInt2319 = arg1.anInt2296 * 64 + arg1.anIntArray273[0] * 128;
			arg1.anInt2307 = -1;
			arg1.anInt2331 = 0;
			arg1.method1543();
		}
		if (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1 == arg1 && (arg1.anInt2319 < 1536 || arg1.anInt2347 < 1536 || arg1.anInt2319 >= 11776 || arg1.anInt2347 >= 11776)) {
			arg1.anInt2332 = 0;
			arg1.anInt2319 = arg1.anInt2296 * 64 + arg1.anIntArray273[0] * 128;
			arg1.anInt2331 = 0;
			arg1.anInt2334 = -1;
			arg1.anInt2347 = arg1.anInt2296 * 64 + arg1.anIntArray271[0] * 128;
			arg1.anInt2307 = -1;
			arg1.method1543();
		}
		Static60.method1177(arg1);
		Static116.method2108(arg1);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method510() {
		aClass63_412 = null;
		aClass63_421 = null;
		aClass63_418 = null;
		aClass63_413 = null;
		aClass63_414 = null;
		aClass63_419 = null;
		aClass63_417 = null;
		aClass1_1 = null;
		aClass63_416 = null;
		aClass63_415 = null;
		aClass63_420 = null;
		aClass2_4 = null;
		aClass63_422 = null;
	}
}
