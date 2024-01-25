import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public static int anInt8348;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_234 = new Class202("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16];

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "[B")
	public static final byte[] aByteArray108 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
	public static void method6989(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static70.aClass2_Sub29_Sub2_1.method5245(Static472.anInt8247) >= 15) {
				@Pc(24) int local24 = Static70.aClass2_Sub29_Sub2_1.method5248(15);
				if (local24 != 32767) {
					@Pc(31) boolean local31 = false;
					@Pc(38) Class2_Sub11 local38 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local24);
					@Pc(44) Class1_Sub1_Sub2_Sub2 local44;
					if (local38 == null) {
						local44 = new Class1_Sub1_Sub2_Sub2();
						local44.anInt5076 = local24;
						local38 = new Class2_Sub11(local44);
						Static71.aClass127_13.method3213(local38, (long) local24);
						local31 = true;
						Static539.aClass2_Sub11Array1[Static61.anInt1174++] = local38;
					}
					local44 = local38.aClass1_Sub1_Sub2_Sub2_1;
					Static24.anIntArray39[Static520.anInt1936++] = local24;
					local44.anInt5049 = Static115.anInt2326;
					if (local44.aClass12_1 != null && local44.aClass12_1.method457()) {
						Static501.method7364(local44);
					}
					@Pc(102) int local102;
					if (arg0) {
						local102 = Static70.aClass2_Sub29_Sub2_1.method5248(8);
						if (local102 > 127) {
							local102 -= 256;
						}
					} else {
						local102 = Static70.aClass2_Sub29_Sub2_1.method5248(5);
						if (local102 > 15) {
							local102 -= 32;
						}
					}
					local44.method4401(Static21.aClass255_2.method6583(Static70.aClass2_Sub29_Sub2_1.method5248(14)));
					@Pc(138) int local138;
					if (arg0) {
						local138 = Static70.aClass2_Sub29_Sub2_1.method5248(8);
						if (local138 > 127) {
							local138 -= 256;
						}
					} else {
						local138 = Static70.aClass2_Sub29_Sub2_1.method5248(5);
						if (local138 > 15) {
							local138 -= 32;
						}
					}
					@Pc(160) int local160 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
					if (local160 == 1) {
						Static430.anIntArray604[Static36.anInt644++] = local24;
					}
					@Pc(182) int local182 = Static70.aClass2_Sub29_Sub2_1.method5248(3) + 4 << 11 & 0x3F22;
					@Pc(187) int local187 = Static70.aClass2_Sub29_Sub2_1.method5248(2);
					@Pc(192) int local192 = Static70.aClass2_Sub29_Sub2_1.method5248(1);
					local44.method4388(local44.aClass12_1.anInt313);
					local44.anInt5082 = local44.aClass12_1.anInt327 << 3;
					if (local31) {
						local44.method4383(local182, true);
					}
					local44.method4400(local187, local138 + Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0], local102 + Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0], local44.method4394(), local192 == 1);
					if (local44.aClass12_1.method457()) {
						Static141.method7492(local44.anIntArray449[0], null, 0, null, local44.aByte90, local44.anIntArray450[0], local44);
					}
					continue;
				}
			}
			Static70.aClass2_Sub29_Sub2_1.method5241();
			return;
		}
	}
}
