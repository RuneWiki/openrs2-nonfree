import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "Lclient!bu;")
	public static Class32 aClass32_30;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_33 = new Class217(71, 3);

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)Lclient!sp;")
	public static Class231 method1364() {
		try {
			return (Class231) Class.forName("Class231_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method1366(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub4_Sub12 local14 = Static393.method5080(arg0, 4);
		local14.method3244();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IJ)V")
	public static void method1367(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static382.anInt1874;
		@Pc(14) int local14 = Static422.anInt6891;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (local7 != Static35.anInt1000) {
			local26 = local7 - Static35.anInt1000;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local26 < local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local26 > local34) {
				local34 = local26;
			}
			Static35.anInt1000 += local34;
		}
		if (!Static374.aClass20_Sub1_1.aBoolean186) {
			Static252.aFloat47 += (float) arg0 * Static352.aFloat67 / 40.0F * 8.0F;
			Static180.aFloat27 += (float) arg0 * Static300.aFloat57 / 40.0F * 8.0F;
		}
		if (local14 != Static215.anInt4111) {
			local26 = local14 - Static215.anInt4111;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local34 > local26) {
				local34 = local26;
			}
			Static215.anInt4111 += local34;
		}
		Static264.method3840();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
	public static void method1368() {
		Static37.method731(Static362.anInt6122);
	}
}
