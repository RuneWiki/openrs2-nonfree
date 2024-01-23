import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
	public static int anInt4512;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt4510 = 0;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
	public static int anInt4514 = -1;

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString147 = "M";

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method3621() {
		aString147 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V")
	public static void method3622(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static5.method126(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!lb;Lclient!dm;)Lclient!gj;")
	public static Class4_Sub14 method3623(@OriginalArg(1) Class97 arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(23) long local23 = ((long) arg1.anInt1074 << 32) + ((long) arg1.anInt1072 << 56) + (long) ((arg1.anInt1069 - -1 << 16) - -arg1.anInt1068);
		@Pc(41) Class4_Sub14 local41 = (Class4_Sub14) arg0.method2360(local23);
		if (local41 == null) {
			local41 = new Class4_Sub14(arg1.anInt1069, (float) arg1.anInt1068, true, false, arg1.anInt1074);
			arg0.method2364(local41, local23);
		}
		return local41;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(JIZ)V")
	public static void method3624(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static297.anInt5497 >= 100) {
			Static271.method4062(Static286.aString191, 0, "");
			return;
		}
		@Pc(25) String local25 = Static211.method3379(arg0);
		@Pc(27) int local27;
		for (local27 = 0; local27 < Static297.anInt5497; local27++) {
			if (arg0 == Static126.aLongArray6[local27]) {
				Static271.method4062(local25 + Static41.aString20, 0, "");
				return;
			}
		}
		for (local27 = 0; local27 < Static231.anInt4525; local27++) {
			if (Static153.aLongArray7[local27] == arg0) {
				Static271.method4062(Static95.aString60 + local25 + Static167.aString108, 0, "");
				return;
			}
		}
		if (local25.equals(Static239.aClass12_Sub3_Sub2_2.aString132)) {
			Static271.method4062(Static275.aString185, 0, "");
			return;
		}
		Static126.aLongArray6[Static297.anInt5497] = arg0;
		Static112.aStringArray18[Static297.anInt5497] = Static151.method2420(arg0);
		Static272.aBooleanArray25[Static297.anInt5497++] = arg1;
		Static233.anInt4542 = Static177.anInt3485;
		Static142.aClass4_Sub17_Sub1_3.method1905(135);
		Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Lclient!wl;")
	public static Class4_Sub2_Sub21 method3625() {
		@Pc(15) Class4_Sub2_Sub21 local15 = (Class4_Sub2_Sub21) Static115.aClass177_5.method4278();
		if (local15 != null) {
			local15.method4391();
			local15.method4396();
			return local15;
		}
		do {
			local15 = (Class4_Sub2_Sub21) Static75.aClass177_3.method4278();
			if (local15 == null) {
				return null;
			}
			if (local15.method4364() > Static133.method2163()) {
				return null;
			}
			local15.method4391();
			local15.method4396();
		} while ((local15.aLong201 & Long.MIN_VALUE) == 0L);
		return local15;
	}
}
