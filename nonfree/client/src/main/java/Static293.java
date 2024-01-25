import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int anInt5930;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public static int anInt5927 = 3;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public static int anInt5929 = -1;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Close";

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method4983() {
		if (Static42.aFloat25 > Static42.aFloat26) {
			Static42.aFloat26 = (float) ((double) Static42.aFloat26 + (double) Static42.aFloat26 / 30.0D);
			if (Static42.aFloat26 > Static42.aFloat25) {
				Static42.aFloat26 = Static42.aFloat25;
			}
			Static18.method358();
			Static42.anInt2432 = (int) Static42.aFloat26 >> 1;
			Static42.aByteArrayArrayArray3 = Static316.method4686(Static42.anInt2432);
		} else if (Static42.aFloat26 > Static42.aFloat25) {
			Static42.aFloat26 = (float) ((double) Static42.aFloat26 - (double) Static42.aFloat26 / 30.0D);
			if (Static42.aFloat25 > Static42.aFloat26) {
				Static42.aFloat26 = Static42.aFloat25;
			}
			Static18.method358();
			Static42.anInt2432 = (int) Static42.aFloat26 >> 1;
			Static42.aByteArrayArrayArray3 = Static316.method4686(Static42.anInt2432);
		}
		if (Static352.anInt6599 != -1 && Static157.anInt3513 != -1) {
			@Pc(78) int local78 = Static352.anInt6599 - Static307.anInt3771;
			if (local78 < 2 || local78 > 2) {
				local78 >>= 0x4;
			}
			@Pc(95) int local95 = Static157.anInt3513 - Static35.anInt732;
			if (local95 < 2 || local95 > 2) {
				local95 >>= 0x4;
			}
			Static307.anInt3771 += local78;
			Static35.anInt732 += local95;
			if (local78 == 0 && local95 == 0) {
				Static352.anInt6599 = -1;
				Static157.anInt3513 = -1;
			}
			Static18.method358();
		}
		if (Static153.anInt3426 > 0) {
			Static290.anInt5894--;
			if (Static290.anInt5894 == 0) {
				Static290.anInt5894 = 100;
				Static153.anInt3426--;
			}
		} else {
			Static214.anInt4451 = -1;
			Static213.anInt4432 = -1;
		}
		if (!Static109.aBoolean207 || Static104.aClass130_159 == null) {
			return;
		}
		for (@Pc(157) Class4_Sub25 local157 = (Class4_Sub25) Static104.aClass130_159.method3499(); local157 != null; local157 = (Class4_Sub25) Static104.aClass130_159.method3512()) {
			@Pc(165) Class139 local165 = Static20.method377(local157.aClass4_Sub20_1.anInt3082);
			if (Static109.anInt2407 == 0 && local157.method2987(Static184.anInt4055, Static38.anInt830)) {
				if (local165.aStringArray35 != null) {
					if (local165.aStringArray35[4] != null) {
						Static285.method4888(local165.anInt4370, local165.aString156, (long) local157.aClass4_Sub20_1.anInt3082, -1, local165.aStringArray35[4], 0, 1005);
					}
					if (local165.aStringArray35[3] != null) {
						Static285.method4888(local165.anInt4370, local165.aString156, (long) local157.aClass4_Sub20_1.anInt3082, -1, local165.aStringArray35[3], 0, 1008);
					}
					if (local165.aStringArray35[2] != null) {
						Static285.method4888(local165.anInt4370, local165.aString156, (long) local157.aClass4_Sub20_1.anInt3082, -1, local165.aStringArray35[2], 0, 1004);
					}
					if (local165.aStringArray35[1] != null) {
						Static285.method4888(local165.anInt4370, local165.aString156, (long) local157.aClass4_Sub20_1.anInt3082, -1, local165.aStringArray35[1], 0, 1012);
					}
					if (local165.aStringArray35[0] != null) {
						Static285.method4888(local165.anInt4370, local165.aString156, (long) local157.aClass4_Sub20_1.anInt3082, -1, local165.aStringArray35[0], 0, 1009);
					}
				}
				if (!local157.aClass4_Sub20_1.aBoolean260) {
					local157.aClass4_Sub20_1.aBoolean260 = true;
					Static97.method1755(15, local157.aClass4_Sub20_1.anInt3082, local165.anInt4370);
				}
				if (local157.aClass4_Sub20_1.aBoolean260) {
					Static97.method1755(17, local157.aClass4_Sub20_1.anInt3082, local165.anInt4370);
				}
			} else if (local157.aClass4_Sub20_1.aBoolean260) {
				local157.aClass4_Sub20_1.aBoolean260 = false;
				Static97.method1755(16, local157.aClass4_Sub20_1.anInt3082, local165.anInt4370);
			}
		}
	}
}
