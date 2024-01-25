import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_43 = new Class166(8);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I")
	public static int method6939() {
		return Static469.anInt8256 == 1 ? Static320.anInt6116 : Static8.anInt159;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZII)V")
	public static void method6940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static487.aFloat145 > Static487.aFloat144) {
			Static487.aFloat144 = (float) ((double) Static487.aFloat144 + (double) Static487.aFloat144 / 30.0D);
			if (Static487.aFloat144 > Static487.aFloat145) {
				Static487.aFloat144 = Static487.aFloat145;
			}
			Static287.method7460();
			Static487.anInt7451 = (int) Static487.aFloat144 >> 1;
			Static487.aByteArrayArrayArray21 = Static476.method8761(Static487.anInt7451);
		} else if (Static487.aFloat144 > Static487.aFloat145) {
			Static487.aFloat144 = (float) ((double) Static487.aFloat144 - (double) Static487.aFloat144 / 30.0D);
			if (Static487.aFloat145 > Static487.aFloat144) {
				Static487.aFloat144 = Static487.aFloat145;
			}
			Static287.method7460();
			Static487.anInt7451 = (int) Static487.aFloat144 >> 1;
			Static487.aByteArrayArrayArray21 = Static476.method8761(Static487.anInt7451);
		}
		if (Static497.anInt8613 != -1 && Static414.anInt7551 != -1) {
			@Pc(78) int local78 = Static497.anInt8613 - Static526.anInt9146;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(97) int local97 = Static414.anInt7551 - Static78.anInt1658;
			Static526.anInt9146 += local78;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static78.anInt1658 -= -local97;
			if (local78 == 0 && local97 == 0) {
				Static414.anInt7551 = -1;
				Static497.anInt8613 = -1;
			}
			Static287.method7460();
		}
		if (Static344.anInt6482 <= 0) {
			Static16.anInt284 = -1;
			Static316.anInt6069 = -1;
		} else {
			Static243.anInt4836--;
			if (Static243.anInt4836 == 0) {
				Static243.anInt4836 = 100;
				Static344.anInt6482--;
			}
		}
		if (!Static203.aBoolean291 || Static485.aClass8_56 == null) {
			return;
		}
		for (@Pc(169) Class6_Sub31 local169 = (Class6_Sub31) Static485.aClass8_56.method149(); local169 != null; local169 = (Class6_Sub31) Static485.aClass8_56.method155()) {
			@Pc(178) Class105 local178 = Static487.aClass337_4.method8119(local169.aClass6_Sub45_1.anInt9417);
			if (local169.method5767(arg1, arg0)) {
				if (local178.aStringArray29 != null) {
					if (local178.aStringArray29[4] != null) {
						Static542.method7932(local178.aStringArray29[4], local178.anInt3392, false, (long) local169.aClass6_Sub45_1.anInt9417, -1, false, -1, 1010, 0, true, (long) local169.aClass6_Sub45_1.anInt9417, local178.aString34);
					}
					if (local178.aStringArray29[3] != null) {
						Static542.method7932(local178.aStringArray29[3], local178.anInt3392, false, (long) local169.aClass6_Sub45_1.anInt9417, -1, false, -1, 1006, 0, true, (long) local169.aClass6_Sub45_1.anInt9417, local178.aString34);
					}
					if (local178.aStringArray29[2] != null) {
						Static542.method7932(local178.aStringArray29[2], local178.anInt3392, false, (long) local169.aClass6_Sub45_1.anInt9417, -1, false, -1, 1002, 0, true, (long) local169.aClass6_Sub45_1.anInt9417, local178.aString34);
					}
					if (local178.aStringArray29[1] != null) {
						Static542.method7932(local178.aStringArray29[1], local178.anInt3392, false, (long) local169.aClass6_Sub45_1.anInt9417, -1, false, -1, 1007, 0, true, (long) local169.aClass6_Sub45_1.anInt9417, local178.aString34);
					}
					if (local178.aStringArray29[0] != null) {
						Static542.method7932(local178.aStringArray29[0], local178.anInt3392, false, (long) local169.aClass6_Sub45_1.anInt9417, -1, false, -1, 1012, 0, true, (long) local169.aClass6_Sub45_1.anInt9417, local178.aString34);
					}
				}
				if (!local169.aClass6_Sub45_1.aBoolean642) {
					local169.aClass6_Sub45_1.aBoolean642 = true;
					Static244.method4200(Static348.aClass240_9, local169.aClass6_Sub45_1.anInt9417, local178.anInt3392);
				}
				if (local169.aClass6_Sub45_1.aBoolean642) {
					Static244.method4200(Static154.aClass240_5, local169.aClass6_Sub45_1.anInt9417, local178.anInt3392);
				}
			} else if (local169.aClass6_Sub45_1.aBoolean642) {
				local169.aClass6_Sub45_1.aBoolean642 = false;
				Static244.method4200(Static320.aClass240_7, local169.aClass6_Sub45_1.anInt9417, local178.anInt3392);
			}
		}
	}
}
