import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
	public static final int[] anIntArray231 = new int[2048];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
	public static void method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg1 >= Static303.anInt9951 && arg1 + arg2 <= Static408.anInt6951 && arg3 - arg1 >= Static255.anInt4818 && arg1 + arg3 <= Static658.anInt10079) {
			Static396.method5702(arg2, arg0, arg3, arg1);
		} else {
			Static679.method8752(arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method2936(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static490.anInt8296 = 1;
		Static558.anInt8991 = -1;
		Static164.method2758(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
	public static int method2937() {
		return Static663.method8649(false);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)V")
	public static void method2938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static574.aFloat182 > Static574.aFloat183) {
			Static574.aFloat183 = (float) ((double) Static574.aFloat183 + (double) Static574.aFloat183 / 30.0D);
			if (Static574.aFloat182 < Static574.aFloat183) {
				Static574.aFloat183 = Static574.aFloat182;
			}
			Static109.method2090();
			Static574.anInt8353 = (int) Static574.aFloat183 >> 1;
			Static574.aByteArrayArrayArray17 = Static274.method4352(Static574.anInt8353);
		} else if (Static574.aFloat183 > Static574.aFloat182) {
			Static574.aFloat183 = (float) ((double) Static574.aFloat183 - (double) Static574.aFloat183 / 30.0D);
			if (Static574.aFloat183 < Static574.aFloat182) {
				Static574.aFloat183 = Static574.aFloat182;
			}
			Static109.method2090();
			Static574.anInt8353 = (int) Static574.aFloat183 >> 1;
			Static574.aByteArrayArrayArray17 = Static274.method4352(Static574.anInt8353);
		}
		if (Static577.anInt9150 != -1 && Static296.anInt8194 != -1) {
			@Pc(78) int local78 = Static577.anInt9150 - Static176.anInt3320;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(97) int local97 = Static296.anInt8194 - Static462.anInt7931;
			Static176.anInt3320 -= -local78;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static462.anInt7931 -= -local97;
			if (local78 == 0 && local97 == 0) {
				Static577.anInt9150 = -1;
				Static296.anInt8194 = -1;
			}
			Static109.method2090();
		}
		if (Static403.anInt6887 > 0) {
			Static666.anInt10253--;
			if (Static666.anInt10253 == 0) {
				Static666.anInt10253 = 100;
				Static403.anInt6887--;
			}
		} else {
			Static30.anInt914 = -1;
			Static476.anInt8110 = -1;
		}
		if (!Static28.aBoolean84 || Static553.aClass193_57 == null) {
			return;
		}
		for (@Pc(158) Class3_Sub45 local158 = (Class3_Sub45) Static553.aClass193_57.method4457(); local158 != null; local158 = (Class3_Sub45) Static553.aClass193_57.method4459()) {
			@Pc(167) Class145 local167 = Static574.aClass321_3.method7485(local158.aClass3_Sub8_1.anInt1242);
			if (local158.method7038(arg0, arg1)) {
				if (local167.aStringArray27 != null) {
					if (local167.aStringArray27[4] != null) {
						Static225.method3514(true, false, -1, -1, 0, (long) local158.aClass3_Sub8_1.anInt1242, local167.aString45, 1008, local167.aStringArray27[4], (long) local158.aClass3_Sub8_1.anInt1242, false, local167.anInt3628);
					}
					if (local167.aStringArray27[3] != null) {
						Static225.method3514(true, false, -1, -1, 0, (long) local158.aClass3_Sub8_1.anInt1242, local167.aString45, 1006, local167.aStringArray27[3], (long) local158.aClass3_Sub8_1.anInt1242, false, local167.anInt3628);
					}
					if (local167.aStringArray27[2] != null) {
						Static225.method3514(true, false, -1, -1, 0, (long) local158.aClass3_Sub8_1.anInt1242, local167.aString45, 1003, local167.aStringArray27[2], (long) local158.aClass3_Sub8_1.anInt1242, false, local167.anInt3628);
					}
					if (local167.aStringArray27[1] != null) {
						Static225.method3514(true, false, -1, -1, 0, (long) local158.aClass3_Sub8_1.anInt1242, local167.aString45, 1012, local167.aStringArray27[1], (long) local158.aClass3_Sub8_1.anInt1242, false, local167.anInt3628);
					}
					if (local167.aStringArray27[0] != null) {
						Static225.method3514(true, false, -1, -1, 0, (long) local158.aClass3_Sub8_1.anInt1242, local167.aString45, 1011, local167.aStringArray27[0], (long) local158.aClass3_Sub8_1.anInt1242, false, local167.anInt3628);
					}
				}
				if (!local158.aClass3_Sub8_1.aBoolean108) {
					local158.aClass3_Sub8_1.aBoolean108 = true;
					Static543.method7514(Static285.aClass239_8, local158.aClass3_Sub8_1.anInt1242, local167.anInt3628);
				}
				if (local158.aClass3_Sub8_1.aBoolean108) {
					Static543.method7514(Static660.aClass239_13, local158.aClass3_Sub8_1.anInt1242, local167.anInt3628);
				}
			} else if (local158.aClass3_Sub8_1.aBoolean108) {
				local158.aClass3_Sub8_1.aBoolean108 = false;
				Static543.method7514(Static273.aClass239_7, local158.aClass3_Sub8_1.anInt1242, local167.anInt3628);
			}
		}
	}
}
