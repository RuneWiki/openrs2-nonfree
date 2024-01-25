import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "J")
	public static long aLong63 = 0L;

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_91 = new Class123(13, 5);

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(III)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static7.aFloat8 < Static7.aFloat7) {
			Static7.aFloat8 = (float) ((double) Static7.aFloat8 + (double) Static7.aFloat8 / 30.0D);
			if (Static7.aFloat7 < Static7.aFloat8) {
				Static7.aFloat8 = Static7.aFloat7;
			}
			Static306.method4501();
			Static7.anInt1137 = (int) Static7.aFloat8 >> 1;
			Static7.aByteArrayArrayArray2 = Static112.method1964(Static7.anInt1137);
		} else if (Static7.aFloat8 > Static7.aFloat7) {
			Static7.aFloat8 = (float) ((double) Static7.aFloat8 - (double) Static7.aFloat8 / 30.0D);
			if (Static7.aFloat8 < Static7.aFloat7) {
				Static7.aFloat8 = Static7.aFloat7;
			}
			Static306.method4501();
			Static7.anInt1137 = (int) Static7.aFloat8 >> 1;
			Static7.aByteArrayArrayArray2 = Static112.method1964(Static7.anInt1137);
		}
		if (Static358.anInt6379 != -1 && Static96.anInt5951 != -1) {
			@Pc(87) int local87 = Static358.anInt6379 - Static226.anInt5617;
			if (local87 < 2 || local87 > 2) {
				local87 /= 8;
			}
			@Pc(104) int local104 = Static96.anInt5951 - Static242.anInt4490;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static226.anInt5617 += local87;
			if (local87 == 0 && local104 == 0) {
				Static358.anInt6379 = -1;
				Static96.anInt5951 = -1;
			}
			Static242.anInt4490 += local104;
			Static306.method4501();
		}
		if (Static224.anInt4061 > 0) {
			Static373.anInt6709--;
			if (Static373.anInt6709 == 0) {
				Static373.anInt6709 = 100;
				Static224.anInt4061--;
			}
		} else {
			Static224.anInt4054 = -1;
			Static138.anInt4528 = -1;
		}
		if (!Static442.aBoolean492 || Static173.aClass244_15 == null) {
			return;
		}
		for (@Pc(164) Class6_Sub31 local164 = (Class6_Sub31) Static173.aClass244_15.method5976(); local164 != null; local164 = (Class6_Sub31) Static173.aClass244_15.method5964()) {
			@Pc(173) Class260 local173 = Static7.aClass169_6.method3948(local164.aClass6_Sub32_1.anInt5707);
			if (local164.method4766(arg0, arg1)) {
				if (local173.aStringArray48 != null) {
					if (local173.aStringArray48[4] != null) {
						Static114.method4751(true, (long) local164.aClass6_Sub32_1.anInt5707, 1006, local173.aStringArray48[4], local173.anInt7733, -1, local173.aString69, 0, false, -1);
					}
					if (local173.aStringArray48[3] != null) {
						Static114.method4751(true, (long) local164.aClass6_Sub32_1.anInt5707, 1003, local173.aStringArray48[3], local173.anInt7733, -1, local173.aString69, 0, false, -1);
					}
					if (local173.aStringArray48[2] != null) {
						Static114.method4751(true, (long) local164.aClass6_Sub32_1.anInt5707, 1001, local173.aStringArray48[2], local173.anInt7733, -1, local173.aString69, 0, false, -1);
					}
					if (local173.aStringArray48[1] != null) {
						Static114.method4751(true, (long) local164.aClass6_Sub32_1.anInt5707, 1008, local173.aStringArray48[1], local173.anInt7733, -1, local173.aString69, 0, false, -1);
					}
					if (local173.aStringArray48[0] != null) {
						Static114.method4751(true, (long) local164.aClass6_Sub32_1.anInt5707, 1012, local173.aStringArray48[0], local173.anInt7733, -1, local173.aString69, 0, false, -1);
					}
				}
				if (!local164.aClass6_Sub32_1.aBoolean354) {
					local164.aClass6_Sub32_1.aBoolean354 = true;
					Static166.method2753(Static328.aClass198_6, local164.aClass6_Sub32_1.anInt5707, local173.anInt7733);
				}
				if (local164.aClass6_Sub32_1.aBoolean354) {
					Static166.method2753(Static313.aClass198_5, local164.aClass6_Sub32_1.anInt5707, local173.anInt7733);
				}
			} else if (local164.aClass6_Sub32_1.aBoolean354) {
				local164.aClass6_Sub32_1.aBoolean354 = false;
				Static166.method2753(Static448.aClass198_9, local164.aClass6_Sub32_1.anInt5707, local173.anInt7733);
			}
		}
	}
}
