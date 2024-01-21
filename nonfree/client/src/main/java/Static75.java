import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!f;")
	public static Class13 aClass13_15;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!s;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public static int anInt1671 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	public static void method1290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class3_Sub3 local6 = (Class3_Sub3) Static158.aClass72_48.method2401(); local6 != null; local6 = (Class3_Sub3) Static158.aClass72_48.method2407()) {
			if (local6.anInt240 != -1 || local6.anIntArray11 != null) {
				@Pc(17) int local17 = 0;
				if (arg2 > local6.anInt236) {
					local17 = arg2 - local6.anInt236;
				} else if (local6.anInt243 > arg2) {
					local17 = local6.anInt243 - arg2;
				}
				if (arg3 > local6.anInt231) {
					local17 += arg3 - local6.anInt231;
				} else if (arg3 < local6.anInt234) {
					local17 += local6.anInt234 - arg3;
				}
				if (local6.anInt242 < local17 - 64 || Static51.anInt1201 == 0 || local6.anInt238 != arg0) {
					if (local6.aClass3_Sub9_Sub1_2 != null) {
						Static11.aClass3_Sub9_Sub4_1.method2221(local6.aClass3_Sub9_Sub1_2);
						local6.aClass3_Sub9_Sub1_2 = null;
					}
					if (local6.aClass3_Sub9_Sub1_1 != null) {
						Static11.aClass3_Sub9_Sub4_1.method2221(local6.aClass3_Sub9_Sub1_1);
						local6.aClass3_Sub9_Sub1_1 = null;
					}
				} else {
					local17 -= 64;
					if (local17 < 0) {
						local17 = 0;
					}
					@Pc(127) int local127 = (local6.anInt242 - local17) * Static51.anInt1201 / local6.anInt242;
					if (local6.aClass3_Sub9_Sub1_2 != null) {
						local6.aClass3_Sub9_Sub1_2.method724(local127);
					} else if (local6.anInt240 >= 0) {
						@Pc(148) Class66 local148 = Static187.method2241(Static129.aClass13_Sub1_16, local6.anInt240, 0);
						if (local148 != null) {
							@Pc(155) Class3_Sub4_Sub1 local155 = local148.method2240().method203(Static127.aClass44_2);
							@Pc(160) Class3_Sub9_Sub1 local160 = Static183.method740(local155, local127);
							local160.method741(-1);
							Static11.aClass3_Sub9_Sub4_1.method2223(local160);
							local6.aClass3_Sub9_Sub1_2 = local160;
						}
					}
					if (local6.aClass3_Sub9_Sub1_1 != null) {
						local6.aClass3_Sub9_Sub1_1.method724(local127);
						if (!local6.aClass3_Sub9_Sub1_1.method2784()) {
							local6.aClass3_Sub9_Sub1_1 = null;
						}
					} else if (local6.anIntArray11 != null && (local6.anInt244 -= arg1) <= 0) {
						@Pc(194) int local194 = (int) (Math.random() * (double) local6.anIntArray11.length);
						@Pc(202) Class66 local202 = Static187.method2241(Static129.aClass13_Sub1_16, local6.anIntArray11[local194], 0);
						if (local202 != null) {
							@Pc(209) Class3_Sub4_Sub1 local209 = local202.method2240().method203(Static127.aClass44_2);
							@Pc(214) Class3_Sub9_Sub1 local214 = Static183.method740(local209, local127);
							local214.method741(0);
							Static11.aClass3_Sub9_Sub4_1.method2223(local214);
							local6.anInt244 = (int) (Math.random() * (double) (local6.anInt241 - local6.anInt233)) + local6.anInt233;
							local6.aClass3_Sub9_Sub1_1 = local214;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1291() {
		@Pc(7) Class56 local7 = Static4.aClass56_1;
		synchronized (Static4.aClass56_1) {
			Static54.anInt1289 = Static155.anInt3421;
			@Pc(15) int local15;
			if (Static56.anInt1327 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static172.aBooleanArray17[local15] = false;
				}
				Static56.anInt1327 = Static125.anInt2896;
			} else {
				while (Static125.anInt2896 != Static56.anInt1327) {
					local15 = Static136.anIntArray321[Static125.anInt2896];
					Static125.anInt2896 = Static125.anInt2896 + 1 & 0x7F;
					if (local15 < 0) {
						Static172.aBooleanArray17[~local15] = false;
					} else {
						Static172.aBooleanArray17[local15] = true;
					}
				}
			}
			Static155.anInt3421 = Static29.anInt765;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method1292() {
		aClass69_1 = null;
		aClass13_15 = null;
	}
}
