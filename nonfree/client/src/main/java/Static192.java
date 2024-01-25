import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
	public static int anInt4149;

	@OriginalMember(owner = "client!hea", name = "t", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
	public static int method3362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static516.anIntArrayArray92 == null ? 0 : Static516.anIntArrayArray92[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(III)V")
	public static void method3364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static157.aFloat71 < Static157.aFloat72) {
			Static157.aFloat71 = (float) ((double) Static157.aFloat71 + (double) Static157.aFloat71 / 30.0D);
			if (Static157.aFloat72 < Static157.aFloat71) {
				Static157.aFloat71 = Static157.aFloat72;
			}
			Static277.method4203();
			Static157.anInt2659 = (int) Static157.aFloat71 >> 1;
			Static157.aByteArrayArrayArray3 = Static535.method7337(Static157.anInt2659);
		} else if (Static157.aFloat72 < Static157.aFloat71) {
			Static157.aFloat71 = (float) ((double) Static157.aFloat71 - (double) Static157.aFloat71 / 30.0D);
			if (Static157.aFloat71 < Static157.aFloat72) {
				Static157.aFloat71 = Static157.aFloat72;
			}
			Static277.method4203();
			Static157.anInt2659 = (int) Static157.aFloat71 >> 1;
			Static157.aByteArrayArrayArray3 = Static535.method7337(Static157.anInt2659);
		}
		if (Static466.anInt8098 != -1 && Static82.anInt9708 != -1) {
			@Pc(85) int local85 = Static466.anInt8098 - Static79.anInt2117;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(100) int local100 = Static82.anInt9708 - Static461.anInt8061;
			Static79.anInt2117 += local85;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static461.anInt8061 += local100;
			if (local85 == 0 && local100 == 0) {
				Static82.anInt9708 = -1;
				Static466.anInt8098 = -1;
			}
			Static277.method4203();
		}
		if (Static438.anInt4270 <= 0) {
			Static372.anInt6490 = -1;
			Static158.anInt3573 = -1;
		} else {
			Static21.anInt211--;
			if (Static21.anInt211 == 0) {
				Static21.anInt211 = 100;
				Static438.anInt4270--;
			}
		}
		if (!Static418.aBoolean521 || Static448.aClass244_72 == null) {
			return;
		}
		for (@Pc(166) Class3_Sub21 local166 = (Class3_Sub21) Static448.aClass244_72.method5572(); local166 != null; local166 = (Class3_Sub21) Static448.aClass244_72.method5576()) {
			@Pc(175) Class338 local175 = Static157.aClass189_2.method4642(local166.aClass3_Sub33_1.anInt5496);
			if (local166.method3020(arg0, arg1)) {
				if (local175.aStringArray47 != null) {
					if (local175.aStringArray47[4] != null) {
						Static367.method5215(0, -1, local175.aStringArray47[4], local175.aString256, true, 1004, false, (long) local166.aClass3_Sub33_1.anInt5496, local175.anInt9749, -1);
					}
					if (local175.aStringArray47[3] != null) {
						Static367.method5215(0, -1, local175.aStringArray47[3], local175.aString256, true, 1001, false, (long) local166.aClass3_Sub33_1.anInt5496, local175.anInt9749, -1);
					}
					if (local175.aStringArray47[2] != null) {
						Static367.method5215(0, -1, local175.aStringArray47[2], local175.aString256, true, 1011, false, (long) local166.aClass3_Sub33_1.anInt5496, local175.anInt9749, -1);
					}
					if (local175.aStringArray47[1] != null) {
						Static367.method5215(0, -1, local175.aStringArray47[1], local175.aString256, true, 1008, false, (long) local166.aClass3_Sub33_1.anInt5496, local175.anInt9749, -1);
					}
					if (local175.aStringArray47[0] != null) {
						Static367.method5215(0, -1, local175.aStringArray47[0], local175.aString256, true, 1003, false, (long) local166.aClass3_Sub33_1.anInt5496, local175.anInt9749, -1);
					}
				}
				if (!local166.aClass3_Sub33_1.aBoolean376) {
					local166.aClass3_Sub33_1.aBoolean376 = true;
					Static583.method7931(Static173.aClass161_2, local166.aClass3_Sub33_1.anInt5496, local175.anInt9749);
				}
				if (local166.aClass3_Sub33_1.aBoolean376) {
					Static583.method7931(Static1.aClass161_1, local166.aClass3_Sub33_1.anInt5496, local175.anInt9749);
				}
			} else if (local166.aClass3_Sub33_1.aBoolean376) {
				local166.aClass3_Sub33_1.aBoolean376 = false;
				Static583.method7931(Static410.aClass161_8, local166.aClass3_Sub33_1.anInt5496, local175.anInt9749);
			}
		}
	}
}
