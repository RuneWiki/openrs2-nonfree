import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public static void method6167(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static237.anInt7561 - Static276.anInt5209;
		if (local7 >= 100) {
			Static140.anInt3147 = -1;
			Static380.anInt6749 = -1;
			Static555.anInt9335 = 1;
			return;
		}
		@Pc(20) int local20 = (int) Static330.aFloat102;
		if (local20 < Static31.anInt591 >> 8) {
			local20 = Static31.anInt591 >> 8;
		}
		if (Static21.aBooleanArray5[4] && local20 < Static492.anIntArray655[4] + 128) {
			local20 = Static492.anIntArray655[4] + 128;
		}
		@Pc(61) int local61 = Static164.anInt3575 + (int) Static477.aFloat164 & 0x3FFF;
		Static126.method2698(local61, local20, (local20 >> 3) * 3 + 600 << 2, arg0, Static303.anInt5529, Static195.anInt4188, Static160.method3164(Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934, Static320.anInt5748, Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929) - 200);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static473.anInt7978 = (int) ((float) Static584.anInt9650 + local106 * (float) (Static473.anInt7978 - Static584.anInt9650));
		Static569.anInt4616 = (int) (local106 * (float) (Static569.anInt4616 - Static88.anInt2276) + (float) Static88.anInt2276);
		Static348.anInt6087 = (int) ((float) Static578.anInt9587 + (float) (Static348.anInt6087 - Static578.anInt9587) * local106);
		Static563.anInt9436 = (int) (local106 * (float) (Static563.anInt9436 - Static592.anInt9728) + (float) Static592.anInt9728);
		@Pc(157) int local157 = Static37.anInt738 - Static249.anInt4944;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static37.anInt738 = (int) ((float) Static249.anInt4944 + (float) local157 * local106);
		Static37.anInt738 &= 0x3FFF;
	}
}
