import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!mda", name = "t", descriptor = "Lclient!an;")
	public static Class16 aClass16_74;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	public static void method4831() {
		if (Static152.aClass69_1 != null) {
			Static152.aClass69_1.method6836();
		}
		if (Static349.aClass69_2 != null) {
			Static349.aClass69_2.method6836();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZZ)V")
	public static void method4832(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static394.aClass12_Sub8_Sub2_2.method5236(Static331.anInt6307) >= 15) {
				@Pc(14) int local14 = Static394.aClass12_Sub8_Sub2_2.method5238(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class12_Sub41 local28 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local14);
					@Pc(34) Class30_Sub1_Sub1_Sub2 local34;
					if (local28 == null) {
						local34 = new Class30_Sub1_Sub1_Sub2();
						local34.anInt4197 = local14;
						local28 = new Class12_Sub41(local34);
						Static29.aClass68_7.method1916(local28, (long) local14);
						local21 = true;
						Static352.aClass12_Sub41Array1[Static328.anInt6238++] = local28;
					}
					local34 = local28.aClass30_Sub1_Sub1_Sub2_2;
					Static11.anIntArray16[Static451.anInt4553++] = local14;
					local34.anInt4151 = Static409.anInt7683;
					if (local34.aClass130_1 != null && local34.aClass130_1.method3563()) {
						Static183.method3613(local34);
					}
					@Pc(88) int local88 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
					if (local88 == 1) {
						Static188.anIntArray320[Static34.anInt757++] = local14;
					}
					@Pc(108) int local108;
					if (arg0) {
						local108 = Static394.aClass12_Sub8_Sub2_2.method5238(8);
						if (local108 > 127) {
							local108 -= 256;
						}
					} else {
						local108 = Static394.aClass12_Sub8_Sub2_2.method5238(5);
						if (local108 > 15) {
							local108 -= 32;
						}
					}
					@Pc(132) int local132;
					if (arg0) {
						local132 = Static394.aClass12_Sub8_Sub2_2.method5238(8);
						if (local132 > 127) {
							local132 -= 256;
						}
					} else {
						local132 = Static394.aClass12_Sub8_Sub2_2.method5238(5);
						if (local132 > 15) {
							local132 -= 32;
						}
					}
					@Pc(160) int local160 = Static394.aClass12_Sub8_Sub2_2.method5238(3) + 4 << 11 & 0x3BE5;
					local34.method3609(Static161.aClass110_3.method3018(Static394.aClass12_Sub8_Sub2_2.method5238(14)));
					@Pc(175) int local175 = Static394.aClass12_Sub8_Sub2_2.method5238(2);
					@Pc(180) int local180 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
					local34.method3599(local34.aClass130_1.anInt4113);
					local34.anInt4199 = local34.aClass130_1.anInt4085 << 3;
					if (local21) {
						local34.method3594(true, local160);
					}
					local34.method3604(local180 == 1, local132 + Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0], local108 + Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0], local175, local34.method3591());
					if (local34.aClass130_1.method3563()) {
						Static402.method6312(null, local34.anIntArray316[0], 0, local34, local34.aByte99, local34.anIntArray317[0], null);
					}
					continue;
				}
			}
			Static394.aClass12_Sub8_Sub2_2.method5240();
			return;
		}
	}

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "(I)V")
	public static void method4833() {
		if (Static184.anInt4228 == 1 || Static184.anInt4228 == 3 || Static58.anInt1424 != Static184.anInt4228 && (Static184.anInt4228 == 0 || Static58.anInt1424 == 0)) {
			Static328.anInt6238 = 0;
			Static451.anInt4553 = 0;
			Static29.aClass68_7.method1922();
		}
		Static58.anInt1424 = Static184.anInt4228;
	}
}
