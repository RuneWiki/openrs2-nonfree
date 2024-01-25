import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)V")
	public static void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static491.aFloat158 < Static491.aFloat159) {
			Static491.aFloat158 = (float) ((double) Static491.aFloat158 + (double) Static491.aFloat158 / 30.0D);
			if (Static491.aFloat158 > Static491.aFloat159) {
				Static491.aFloat158 = Static491.aFloat159;
			}
			Static226.method4129();
			Static491.anInt7780 = (int) Static491.aFloat158 >> 1;
			Static491.aByteArrayArrayArray16 = Static381.method6036(Static491.anInt7780);
		} else if (Static491.aFloat159 < Static491.aFloat158) {
			Static491.aFloat158 = (float) ((double) Static491.aFloat158 - (double) Static491.aFloat158 / 30.0D);
			if (Static491.aFloat159 > Static491.aFloat158) {
				Static491.aFloat158 = Static491.aFloat159;
			}
			Static226.method4129();
			Static491.anInt7780 = (int) Static491.aFloat158 >> 1;
			Static491.aByteArrayArrayArray16 = Static381.method6036(Static491.anInt7780);
		}
		if (Static181.anInt3980 != -1 && Static315.anInt6316 != -1) {
			@Pc(78) int local78 = Static181.anInt3980 - Static468.anInt8336;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static315.anInt6316 - Static457.anInt8209;
			Static468.anInt8336 -= -local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			if (local78 == 0 && local95 == 0) {
				Static181.anInt3980 = -1;
				Static315.anInt6316 = -1;
			}
			Static457.anInt8209 += local95;
			Static226.method4129();
		}
		if (Static591.anInt9999 <= 0) {
			Static246.anInt5375 = -1;
			Static451.anInt9272 = -1;
		} else {
			Static502.anInt7199--;
			if (Static502.anInt7199 == 0) {
				Static502.anInt7199 = 100;
				Static591.anInt9999--;
			}
		}
		if (!Static446.aBoolean647 || Static15.aClass163_8 == null) {
			return;
		}
		for (@Pc(168) Class6_Sub30 local168 = (Class6_Sub30) Static15.aClass163_8.method4966(); local168 != null; local168 = (Class6_Sub30) Static15.aClass163_8.method4965()) {
			@Pc(179) Class36 local179 = Static491.aClass345_4.method8044(local168.aClass6_Sub48_1.anInt9722);
			if (local168.method4844(arg1, arg0)) {
				if (local179.aStringArray4 != null) {
					if (local179.aStringArray4[4] != null) {
						Static513.method7357(true, (long) local168.aClass6_Sub48_1.anInt9722, -1, local179.anInt1754, local179.aString8, false, 0, 1004, (long) local168.aClass6_Sub48_1.anInt9722, -1, false, local179.aStringArray4[4]);
					}
					if (local179.aStringArray4[3] != null) {
						Static513.method7357(true, (long) local168.aClass6_Sub48_1.anInt9722, -1, local179.anInt1754, local179.aString8, false, 0, 1010, (long) local168.aClass6_Sub48_1.anInt9722, -1, false, local179.aStringArray4[3]);
					}
					if (local179.aStringArray4[2] != null) {
						Static513.method7357(true, (long) local168.aClass6_Sub48_1.anInt9722, -1, local179.anInt1754, local179.aString8, false, 0, 1001, (long) local168.aClass6_Sub48_1.anInt9722, -1, false, local179.aStringArray4[2]);
					}
					if (local179.aStringArray4[1] != null) {
						Static513.method7357(true, (long) local168.aClass6_Sub48_1.anInt9722, -1, local179.anInt1754, local179.aString8, false, 0, 1003, (long) local168.aClass6_Sub48_1.anInt9722, -1, false, local179.aStringArray4[1]);
					}
					if (local179.aStringArray4[0] != null) {
						Static513.method7357(true, (long) local168.aClass6_Sub48_1.anInt9722, -1, local179.anInt1754, local179.aString8, false, 0, 1011, (long) local168.aClass6_Sub48_1.anInt9722, -1, false, local179.aStringArray4[0]);
					}
				}
				if (!local168.aClass6_Sub48_1.aBoolean773) {
					local168.aClass6_Sub48_1.aBoolean773 = true;
					Static435.method6677(Static163.aClass122_8, local168.aClass6_Sub48_1.anInt9722, local179.anInt1754);
				}
				if (local168.aClass6_Sub48_1.aBoolean773) {
					Static435.method6677(Static569.aClass122_12, local168.aClass6_Sub48_1.anInt9722, local179.anInt1754);
				}
			} else if (local168.aClass6_Sub48_1.aBoolean773) {
				local168.aClass6_Sub48_1.aBoolean773 = false;
				Static435.method6677(Static410.aClass122_9, local168.aClass6_Sub48_1.anInt9722, local179.anInt1754);
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)Z")
	public static boolean method4382(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
