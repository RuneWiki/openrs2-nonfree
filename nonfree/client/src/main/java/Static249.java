import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Lclient!l;")
	public static Class17 aClass17_36;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_17 = new Class214(1, 4);

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	public static int anInt4713 = -1;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	public static void method3797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static88.aFloat67 < Static88.aFloat68) {
			Static88.aFloat67 = (float) ((double) Static88.aFloat67 + (double) Static88.aFloat67 / 30.0D);
			if (Static88.aFloat67 > Static88.aFloat68) {
				Static88.aFloat67 = Static88.aFloat68;
			}
			Static282.method4106();
			Static88.anInt4511 = (int) Static88.aFloat67 >> 1;
			Static88.aByteArrayArrayArray10 = Static320.method4499(Static88.anInt4511);
		} else if (Static88.aFloat68 < Static88.aFloat67) {
			Static88.aFloat67 = (float) ((double) Static88.aFloat67 - (double) Static88.aFloat67 / 30.0D);
			if (Static88.aFloat68 > Static88.aFloat67) {
				Static88.aFloat67 = Static88.aFloat68;
			}
			Static282.method4106();
			Static88.anInt4511 = (int) Static88.aFloat67 >> 1;
			Static88.aByteArrayArrayArray10 = Static320.method4499(Static88.anInt4511);
		}
		if (Static60.anInt1343 != -1 && Static314.anInt5538 != -1) {
			@Pc(80) int local80 = Static60.anInt1343 - Static133.anInt2851;
			if (local80 < 2 || local80 > 2) {
				local80 /= 8;
			}
			@Pc(97) int local97 = Static314.anInt5538 - Static129.anInt2786;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static133.anInt2851 += local80;
			if (local80 == 0 && local97 == 0) {
				Static60.anInt1343 = -1;
				Static314.anInt5538 = -1;
			}
			Static129.anInt2786 += local97;
			Static282.method4106();
		}
		if (Static338.anInt6358 > 0) {
			Static377.anInt6398--;
			if (Static377.anInt6398 == 0) {
				Static377.anInt6398 = 100;
				Static338.anInt6358--;
			}
		} else {
			Static170.anInt3362 = -1;
			Static441.anInt300 = -1;
		}
		if (!Static266.aBoolean372 || Static113.aClass14_20 == null) {
			return;
		}
		for (@Pc(165) Class2_Sub33 local165 = (Class2_Sub33) Static113.aClass14_20.method309(); local165 != null; local165 = (Class2_Sub33) Static113.aClass14_20.method311()) {
			@Pc(174) Class48 local174 = Static88.aClass215_3.method4741(local165.aClass2_Sub18_1.anInt3142);
			if (local165.method4322(arg1, arg0)) {
				if (local174.aStringArray5 != null) {
					if (local174.aStringArray5[4] != null) {
						Static172.method2802(1001, -1, true, (long) local165.aClass2_Sub18_1.anInt3142, local174.aStringArray5[4], local174.anInt1195, local174.aString8, -1, false, 0);
					}
					if (local174.aStringArray5[3] != null) {
						Static172.method2802(1009, -1, true, (long) local165.aClass2_Sub18_1.anInt3142, local174.aStringArray5[3], local174.anInt1195, local174.aString8, -1, false, 0);
					}
					if (local174.aStringArray5[2] != null) {
						Static172.method2802(1004, -1, true, (long) local165.aClass2_Sub18_1.anInt3142, local174.aStringArray5[2], local174.anInt1195, local174.aString8, -1, false, 0);
					}
					if (local174.aStringArray5[1] != null) {
						Static172.method2802(1008, -1, true, (long) local165.aClass2_Sub18_1.anInt3142, local174.aStringArray5[1], local174.anInt1195, local174.aString8, -1, false, 0);
					}
					if (local174.aStringArray5[0] != null) {
						Static172.method2802(1010, -1, true, (long) local165.aClass2_Sub18_1.anInt3142, local174.aStringArray5[0], local174.anInt1195, local174.aString8, -1, false, 0);
					}
				}
				if (!local165.aClass2_Sub18_1.aBoolean243) {
					local165.aClass2_Sub18_1.aBoolean243 = true;
					Static168.method2734(Static97.aClass182_34, local165.aClass2_Sub18_1.anInt3142, local174.anInt1195);
				}
				if (local165.aClass2_Sub18_1.aBoolean243) {
					Static168.method2734(Static359.aClass182_111, local165.aClass2_Sub18_1.anInt3142, local174.anInt1195);
				}
			} else if (local165.aClass2_Sub18_1.aBoolean243) {
				local165.aClass2_Sub18_1.aBoolean243 = false;
				Static168.method2734(Static103.aClass182_37, local165.aClass2_Sub18_1.anInt3142, local174.anInt1195);
			}
		}
	}
}
