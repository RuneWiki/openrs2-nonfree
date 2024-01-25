import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[100];

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public static int anInt7087 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)V")
	public static void method5898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static392.aFloat188 < Static392.aFloat187) {
			Static392.aFloat188 = (float) ((double) Static392.aFloat188 + (double) Static392.aFloat188 / 30.0D);
			if (Static392.aFloat188 > Static392.aFloat187) {
				Static392.aFloat188 = Static392.aFloat187;
			}
			Static575.method7836();
			Static392.anInt8790 = (int) Static392.aFloat188 >> 1;
			Static392.aByteArrayArrayArray20 = Static475.method6604(Static392.anInt8790);
		} else if (Static392.aFloat187 < Static392.aFloat188) {
			Static392.aFloat188 = (float) ((double) Static392.aFloat188 - (double) Static392.aFloat188 / 30.0D);
			if (Static392.aFloat187 > Static392.aFloat188) {
				Static392.aFloat188 = Static392.aFloat187;
			}
			Static575.method7836();
			Static392.anInt8790 = (int) Static392.aFloat188 >> 1;
			Static392.aByteArrayArrayArray20 = Static475.method6604(Static392.anInt8790);
		}
		if (Static439.anInt9627 != -1 && Static70.anInt1454 != -1) {
			@Pc(79) int local79 = Static439.anInt9627 - Static397.anInt6936;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static70.anInt1454 - Static470.anInt7923;
			Static397.anInt6936 -= -local79;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static470.anInt7923 += local96;
			if (local79 == 0 && local96 == 0) {
				Static70.anInt1454 = -1;
				Static439.anInt9627 = -1;
			}
			Static575.method7836();
		}
		if (Static162.anInt3559 > 0) {
			Static391.anInt6853--;
			if (Static391.anInt6853 == 0) {
				Static391.anInt6853 = 100;
				Static162.anInt3559--;
			}
		} else {
			Static119.anInt2755 = -1;
			Static597.anInt9820 = -1;
		}
		if (!Static313.aBoolean426 || Static457.aClass124_51 == null) {
			return;
		}
		for (@Pc(164) Class4_Sub35 local164 = (Class4_Sub35) Static457.aClass124_51.method3267(); local164 != null; local164 = (Class4_Sub35) Static457.aClass124_51.method3273()) {
			@Pc(173) Class86 local173 = Static392.aClass337_4.method7441(local164.aClass4_Sub48_1.anInt8895);
			if (local164.method5442(arg0, arg1)) {
				if (local173.aStringArray6 != null) {
					if (local173.aStringArray6[4] != null) {
						Static100.method7901(0, false, true, local173.aString21, (long) local164.aClass4_Sub48_1.anInt8895, 1011, local173.anInt2697, -1, -1, local173.aStringArray6[4]);
					}
					if (local173.aStringArray6[3] != null) {
						Static100.method7901(0, false, true, local173.aString21, (long) local164.aClass4_Sub48_1.anInt8895, 1007, local173.anInt2697, -1, -1, local173.aStringArray6[3]);
					}
					if (local173.aStringArray6[2] != null) {
						Static100.method7901(0, false, true, local173.aString21, (long) local164.aClass4_Sub48_1.anInt8895, 1009, local173.anInt2697, -1, -1, local173.aStringArray6[2]);
					}
					if (local173.aStringArray6[1] != null) {
						Static100.method7901(0, false, true, local173.aString21, (long) local164.aClass4_Sub48_1.anInt8895, 1008, local173.anInt2697, -1, -1, local173.aStringArray6[1]);
					}
					if (local173.aStringArray6[0] != null) {
						Static100.method7901(0, false, true, local173.aString21, (long) local164.aClass4_Sub48_1.anInt8895, 1002, local173.anInt2697, -1, -1, local173.aStringArray6[0]);
					}
				}
				if (!local164.aClass4_Sub48_1.aBoolean614) {
					local164.aClass4_Sub48_1.aBoolean614 = true;
					Static205.method3630(Static285.aClass182_6, local164.aClass4_Sub48_1.anInt8895, local173.anInt2697);
				}
				if (local164.aClass4_Sub48_1.aBoolean614) {
					Static205.method3630(Static75.aClass182_1, local164.aClass4_Sub48_1.anInt8895, local173.anInt2697);
				}
			} else if (local164.aClass4_Sub48_1.aBoolean614) {
				local164.aClass4_Sub48_1.aBoolean614 = false;
				Static205.method3630(Static236.aClass182_5, local164.aClass4_Sub48_1.anInt8895, local173.anInt2697);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public static void method5899(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		Static140.method2841(arg1, arg3, arg0, arg5, arg2, null, -1, arg4);
	}
}
