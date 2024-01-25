import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "Lclient!sm;")
	public static Class323 aClass323_1;

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "[I")
	public static int[] anIntArray770;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZI)V")
	public static void method7931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static317.aFloat113 > Static317.aFloat114) {
			Static317.aFloat114 = (float) ((double) Static317.aFloat114 + (double) Static317.aFloat114 / 30.0D);
			if (Static317.aFloat114 > Static317.aFloat113) {
				Static317.aFloat114 = Static317.aFloat113;
			}
			Static496.method7118();
			Static317.anInt5399 = (int) Static317.aFloat114 >> 1;
			Static317.aByteArrayArrayArray20 = Static366.method5374(Static317.anInt5399);
		} else if (Static317.aFloat113 < Static317.aFloat114) {
			Static317.aFloat114 = (float) ((double) Static317.aFloat114 - (double) Static317.aFloat114 / 30.0D);
			if (Static317.aFloat113 > Static317.aFloat114) {
				Static317.aFloat114 = Static317.aFloat113;
			}
			Static496.method7118();
			Static317.anInt5399 = (int) Static317.aFloat114 >> 1;
			Static317.aByteArrayArrayArray20 = Static366.method5374(Static317.anInt5399);
		}
		if (Static590.anInt9485 != -1 && Static88.anInt1725 != -1) {
			@Pc(78) int local78 = Static590.anInt9485 - Static361.anInt5827;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static88.anInt1725 - Static90.anInt10121;
			Static361.anInt5827 += local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			Static90.anInt10121 -= -local95;
			if (local78 == 0 && local95 == 0) {
				Static590.anInt9485 = -1;
				Static88.anInt1725 = -1;
			}
			Static496.method7118();
		}
		if (Static122.anInt2525 <= 0) {
			Static30.anInt575 = -1;
			Static246.anInt4481 = -1;
		} else {
			Static43.anInt1024--;
			if (Static43.anInt1024 == 0) {
				Static122.anInt2525--;
				Static43.anInt1024 = 100;
			}
		}
		if (!Static265.aBoolean350 || Static93.aClass338_238 == null) {
			return;
		}
		for (@Pc(172) Class3_Sub28 local172 = (Class3_Sub28) Static93.aClass338_238.method8177(); local172 != null; local172 = (Class3_Sub28) Static93.aClass338_238.method8168()) {
			@Pc(181) Class308 local181 = Static317.aClass27_3.method693(local172.aClass3_Sub18_1.anInt2277);
			if (local172.method3547(arg1, arg0)) {
				if (local181.aStringArray24 != null) {
					if (local181.aStringArray24[4] != null) {
						Static303.method4660(false, local181.aStringArray24[4], false, -1, local181.aString104, true, local181.anInt8782, 1007, (long) local172.aClass3_Sub18_1.anInt2277, 0, -1, (long) local172.aClass3_Sub18_1.anInt2277);
					}
					if (local181.aStringArray24[3] != null) {
						Static303.method4660(false, local181.aStringArray24[3], false, -1, local181.aString104, true, local181.anInt8782, 1006, (long) local172.aClass3_Sub18_1.anInt2277, 0, -1, (long) local172.aClass3_Sub18_1.anInt2277);
					}
					if (local181.aStringArray24[2] != null) {
						Static303.method4660(false, local181.aStringArray24[2], false, -1, local181.aString104, true, local181.anInt8782, 1011, (long) local172.aClass3_Sub18_1.anInt2277, 0, -1, (long) local172.aClass3_Sub18_1.anInt2277);
					}
					if (local181.aStringArray24[1] != null) {
						Static303.method4660(false, local181.aStringArray24[1], false, -1, local181.aString104, true, local181.anInt8782, 1002, (long) local172.aClass3_Sub18_1.anInt2277, 0, -1, (long) local172.aClass3_Sub18_1.anInt2277);
					}
					if (local181.aStringArray24[0] != null) {
						Static303.method4660(false, local181.aStringArray24[0], false, -1, local181.aString104, true, local181.anInt8782, 1010, (long) local172.aClass3_Sub18_1.anInt2277, 0, -1, (long) local172.aClass3_Sub18_1.anInt2277);
					}
				}
				if (!local172.aClass3_Sub18_1.aBoolean187) {
					local172.aClass3_Sub18_1.aBoolean187 = true;
					Static565.method8018(Static600.aClass223_15, local172.aClass3_Sub18_1.anInt2277, local181.anInt8782);
				}
				if (local172.aClass3_Sub18_1.aBoolean187) {
					Static565.method8018(Static282.aClass223_9, local172.aClass3_Sub18_1.anInt2277, local181.anInt8782);
				}
			} else if (local172.aClass3_Sub18_1.aBoolean187) {
				local172.aClass3_Sub18_1.aBoolean187 = false;
				Static565.method8018(Static446.aClass223_11, local172.aClass3_Sub18_1.anInt2277, local181.anInt8782);
			}
		}
	}
}
