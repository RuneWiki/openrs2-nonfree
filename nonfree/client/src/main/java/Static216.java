import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!ed;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1345 = Static186.method3527(":");

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[Lclient!v;")
	public static Class86_Sub1[] aClass86_Sub1Array1 = new Class86_Sub1[256];

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1346 = Static186.method3527("k");

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1347 = Static186.method3527("null");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!hh;)V")
	public static void method3372(@OriginalArg(1) Class50 arg0) {
		Static38.aClass50_302 = arg0;
		if (Static4.aClass87_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(20) Class50 local20 = Static201.aClass50_1314.method1224(Static4.aClass87_1.anApplet1);
			@Pc(26) Class50 local26 = Static14.aClass50_110.method1224(Static4.aClass87_1.anApplet1);
			@Pc(51) Class50 local51 = Static17.method257(new Class50[] { local20, Static52.aClass50_1079, arg0, Static19.aClass50_157, local26 });
			if (arg0.method1249() == 0) {
				local51 = Static17.method257(new Class50[] { local51, Static14.aClass50_112 });
			} else {
				local51 = Static17.method257(new Class50[] { local51, Static212.aClass50_1336, Static126.method2027(Static179.method2941() + 94608000000L), Static33.aClass50_250, Static20.method302(94608000L) });
			}
			Static17.method257(new Class50[] { Static46.aClass50_344, local51, Static32.aClass50_227 }).method1243(Static4.aClass87_1.anApplet1);
		} catch (@Pc(128) Throwable local128) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method3375() {
		Static169.anIntArray370 = null;
		Static101.anIntArray191 = null;
		Static228.anIntArray507 = null;
		Static78.anIntArray127 = null;
		Static191.aByteArrayArray11 = null;
		Static8.anIntArray20 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class46 method3377(@OriginalArg(0) int arg0) {
		@Pc(6) Class46 local6 = (Class46) Static41.aClass84_17.method2579((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32 = Static94.aClass86_85.method3325(Static138.method2292(arg0), Static109.method1730(arg0));
		local6 = new Class46();
		local6.anInt1562 = arg0;
		if (local32 != null) {
			local6.method1127(new Class1_Sub17(local32));
		}
		Static41.aClass84_17.method2582(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILclient!hh;)V")
	public static void method3378(@OriginalArg(1) Class50 arg0) {
		if (Static212.aClass1_Sub9Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method1221();
		if (local14 == 0L) {
			return;
		}
		while (Static212.aClass1_Sub9Array1.length > local10 && Static212.aClass1_Sub9Array1[local10].aLong173 != local14) {
			local10++;
		}
		if (Static212.aClass1_Sub9Array1.length > local10 && Static212.aClass1_Sub9Array1[local10] != null) {
			Static32.aClass1_Sub17_Sub1_1.method2182(227);
			Static32.aClass1_Sub17_Sub1_1.method2171(Static212.aClass1_Sub9Array1[local10].aLong173);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!qh;I)Lclient!qh;")
	public static Class93 method3382(@OriginalArg(0) Class93 arg0) {
		if (arg0.anInt3660 != -1) {
			return Static164.method2725(arg0.anInt3660);
		}
		@Pc(24) int local24 = arg0.anInt3603 >>> 16;
		for (@Pc(29) Class1_Sub13 local29 = (Class1_Sub13) Static157.aClass90_19.method2823(); local29 != null; local29 = (Class1_Sub13) Static157.aClass90_19.method2821()) {
			if (local29.anInt1588 == local24) {
				return Static164.method2725((int) local29.aLong173);
			}
		}
		return null;
	}
}
