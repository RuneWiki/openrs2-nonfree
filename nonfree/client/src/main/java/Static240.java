import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt3965;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_86 = new Class151(76, 4);

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method3543() {
		while (true) {
			if (Static159.aClass4_Sub11_Sub1_1.method989(Static583.anInt8992) >= 15) {
				@Pc(16) int local16 = Static159.aClass4_Sub11_Sub1_1.method988(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class4_Sub45 local28 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local16);
					@Pc(34) Class3_Sub1_Sub2_Sub2_Sub2 local34;
					if (local28 == null) {
						local34 = new Class3_Sub1_Sub2_Sub2_Sub2();
						local34.anInt9961 = local16;
						local28 = new Class4_Sub45(local34);
						Static597.aClass66_41.method1985(local28, (long) local16);
						Static238.aClass4_Sub45Array1[Static15.anInt1571++] = local28;
						local21 = true;
					}
					local34 = local28.aClass3_Sub1_Sub2_Sub2_Sub2_2;
					Static526.anIntArray558[Static105.anInt2131++] = local16;
					local34.anInt9983 = Static101.anInt2078;
					if (local34.aClass345_1 != null && local34.aClass345_1.method7531()) {
						Static529.method2538(local34);
					}
					@Pc(88) int local88 = Static159.aClass4_Sub11_Sub1_1.method988(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(99) int local99 = Static159.aClass4_Sub11_Sub1_1.method988(1);
					@Pc(104) int local104 = Static159.aClass4_Sub11_Sub1_1.method988(5);
					local34.method8537(Static255.aClass380_1.method8596(Static159.aClass4_Sub11_Sub1_1.method988(14)));
					if (local104 > 15) {
						local104 -= 32;
					}
					@Pc(131) int local131 = Static159.aClass4_Sub11_Sub1_1.method988(3) + 4 << 11 & 0x3A75;
					@Pc(136) int local136 = Static159.aClass4_Sub11_Sub1_1.method988(2);
					@Pc(141) int local141 = Static159.aClass4_Sub11_Sub1_1.method988(1);
					if (local141 == 1) {
						Static259.anIntArray307[Static277.anInt4479++] = local16;
					}
					local34.method8515(local34.aClass345_1.anInt8812);
					local34.anInt9976 = local34.aClass345_1.anInt8799 << 3;
					if (local21) {
						local34.method8526(local131, true);
					}
					local34.method8534(local104 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray694[0], local136, local88 + Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anIntArray693[0], local34.method8514(), local99 == 1);
					if (local34.aClass345_1.method7531()) {
						Static245.method6857(local34, (Class3_Sub1_Sub2_Sub2_Sub1) null, local34.aByte141, local34.anIntArray694[0], (Class342) null, 0, local34.anIntArray693[0]);
					}
					continue;
				}
			}
			Static159.aClass4_Sub11_Sub1_1.method992();
			return;
		}
	}
}
