import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
	public static final int[] anIntArray277 = new int[8];

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public static void method4613(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static101.anInt2262 - Static561.anInt9389;
		if (local8 >= 100) {
			Static331.anInt6175 = -1;
			Static530.anInt9071 = -1;
			Static305.anInt5422 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static620.aFloat209;
		if (Static40.anInt1256 >> 8 > local23) {
			local23 = Static40.anInt1256 >> 8;
		}
		if (Static424.aBooleanArray19[4] && Static636.anIntArray660[4] + 128 > local23) {
			local23 = Static636.anIntArray660[4] + 128;
		}
		@Pc(64) int local64 = Static424.anInt7664 + (int) Static401.aFloat165 & 0x3FFF;
		Static439.method6844(Static528.anInt9022, local64, (local23 >> 3) * 3 + 600 << 2, Static192.method3263(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916, Static549.anInt9262) - 200, arg0, local23, Static410.anInt7502);
		@Pc(109) float local109 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static20.anInt824 = (int) ((float) (Static20.anInt824 - Static387.anInt7216) * local109 + (float) Static387.anInt7216);
		Static557.anInt9304 = (int) ((float) (Static557.anInt9304 - Static201.anInt3961) * local109 + (float) Static201.anInt3961);
		Static393.anInt7268 = (int) (local109 * (float) (Static393.anInt7268 - Static531.anInt7436) + (float) Static531.anInt7436);
		Static611.anInt9892 = (int) ((float) (Static611.anInt9892 - Static29.anInt1007) * local109 + (float) Static29.anInt1007);
		@Pc(169) int local169 = Static185.anInt5215 - Static194.anInt3777;
		if (local169 > 8192) {
			local169 -= 16384;
		} else if (local169 < -8192) {
			local169 += 16384;
		}
		Static185.anInt5215 = (int) ((float) Static194.anInt3777 + local109 * (float) local169);
		Static185.anInt5215 &= 0x3FFF;
	}
}
