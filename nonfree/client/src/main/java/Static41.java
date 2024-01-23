import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!da", name = "z", descriptor = "Lclient!tl;")
	public static Class155 aClass155_9 = new Class155(5);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I")
	public static int method915(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[B)V")
	public static void method916(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub16 local16 = new Class1_Sub16(arg0);
		local16.anInt3328 = arg0.length - 2;
		Static153.anInt3542 = local16.method2652();
		Static82.aBooleanArray9 = new boolean[Static153.anInt3542];
		Static166.anIntArray343 = new int[Static153.anInt3542];
		Static81.anIntArray204 = new int[Static153.anInt3542];
		Static121.anIntArray257 = new int[Static153.anInt3542];
		Static298.anIntArray623 = new int[Static153.anInt3542];
		Static200.aByteArrayArray83 = new byte[Static153.anInt3542][];
		Static10.aByteArrayArray5 = new byte[Static153.anInt3542][];
		local16.anInt3328 = arg0.length - Static153.anInt3542 * 8 - 7;
		Static298.anInt6232 = local16.method2652();
		Static158.anInt3659 = local16.method2652();
		@Pc(74) int local74 = (local16.method2655() & 0xFF) + 1;
		@Pc(76) int local76;
		for (local76 = 0; local76 < Static153.anInt3542; local76++) {
			Static298.anIntArray623[local76] = local16.method2652();
		}
		for (local76 = 0; local76 < Static153.anInt3542; local76++) {
			Static121.anIntArray257[local76] = local16.method2652();
		}
		for (local76 = 0; local76 < Static153.anInt3542; local76++) {
			Static166.anIntArray343[local76] = local16.method2652();
		}
		for (local76 = 0; local76 < Static153.anInt3542; local76++) {
			Static81.anIntArray204[local76] = local16.method2652();
		}
		local16.anInt3328 = arg0.length - Static153.anInt3542 * 8 - (local74 + -1) * 3 - 7;
		Static167.anIntArray346 = new int[local74];
		for (local76 = 1; local76 < local74; local76++) {
			Static167.anIntArray346[local76] = local16.method2634();
			if (Static167.anIntArray346[local76] == 0) {
				Static167.anIntArray346[local76] = 1;
			}
		}
		local16.anInt3328 = 0;
		for (local76 = 0; local76 < Static153.anInt3542; local76++) {
			@Pc(200) int local200 = Static166.anIntArray343[local76];
			@Pc(202) boolean local202 = false;
			@Pc(206) int local206 = Static81.anIntArray204[local76];
			@Pc(210) int local210 = local206 * local200;
			@Pc(213) byte[] local213 = new byte[local210];
			@Pc(216) byte[] local216 = new byte[local210];
			Static200.aByteArrayArray83[local76] = local216;
			Static10.aByteArrayArray5[local76] = local213;
			@Pc(228) int local228 = local16.method2655();
			@Pc(237) int local237;
			if ((local228 & 0x1) == 0) {
				for (local237 = 0; local237 < local210; local237++) {
					local216[local237] = local16.method2633();
				}
				if ((local228 & 0x2) != 0) {
					for (local237 = 0; local237 < local210; local237++) {
						@Pc(352) byte local352 = local213[local237] = local16.method2633();
						local202 |= local352 != -1;
					}
				}
			} else {
				local237 = 0;
				label88: while (true) {
					@Pc(242) int local242;
					if (local200 <= local237) {
						if ((local228 & 0x2) == 0) {
							break;
						}
						local237 = 0;
						while (true) {
							if (local237 >= local200) {
								break label88;
							}
							for (local242 = 0; local242 < local206; local242++) {
								@Pc(300) byte local300 = local213[local237 + local242 * local200] = local16.method2633();
								local202 |= local300 != -1;
							}
							local237++;
						}
					}
					for (local242 = 0; local242 < local206; local242++) {
						local216[local200 * local242 + local237] = local16.method2633();
					}
					local237++;
				}
			}
			Static82.aBooleanArray9[local76] = local202;
		}
	}
}
