import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
	public static int anInt8374 = 1;

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_208 = new Class160(85, 2);

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "[I")
	public static int[] anIntArray425 = new int[1];

	@OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
	public static int anInt8375 = 0;

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(II)V")
	public static void method7309(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static530.anInt9105 - Static193.anInt9748;
		if (local8 >= 100) {
			Static124.anInt2024 = -1;
			Static507.anInt8817 = -1;
			Static304.anInt5410 = 1;
			return;
		}
		@Pc(24) int local24 = (int) Static680.aFloat210;
		if (Static609.anInt10035 >> 8 > local24) {
			local24 = Static609.anInt10035 >> 8;
		}
		if (Static552.aBooleanArray22[4] && Static308.anIntArray304[4] + 128 > local24) {
			local24 = Static308.anIntArray304[4] + 128;
		}
		@Pc(68) int local68 = (int) Static139.aFloat16 + Static185.anInt3051 & 0x3FFF;
		Static411.method6196((local24 >> 3) * 3 + 600 << 2, Static173.anInt2835, Static660.anInt6758, Static388.method5919(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184, Static391.anInt6811) - 200, local24, local68, arg0);
		@Pc(113) float local113 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static153.anInt2372 = (int) ((float) Static487.anInt8435 + local113 * (float) (Static153.anInt2372 - Static487.anInt8435));
		Static70.anInt1085 = (int) ((float) (Static70.anInt1085 - Static345.anInt5863) * local113 + (float) Static345.anInt5863);
		Static126.anInt9524 = (int) ((float) Static170.anInt2635 + (float) (Static126.anInt9524 - Static170.anInt2635) * local113);
		Static229.anInt4393 = (int) ((float) Static142.anInt2273 + local113 * (float) (Static229.anInt4393 - Static142.anInt2273));
		@Pc(164) int local164 = Static669.anInt10940 - Static297.anInt5326;
		if (local164 > 8192) {
			local164 -= 16384;
		} else if (local164 < -8192) {
			local164 += 16384;
		}
		Static669.anInt10940 = (int) ((float) local164 * local113 + (float) Static297.anInt5326);
		Static669.anInt10940 &= 0x3FFF;
	}
}
