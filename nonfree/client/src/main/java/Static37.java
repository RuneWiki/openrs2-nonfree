import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
	public static int anInt9263 = -1;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "([BB)[B")
	public static byte[] method8166(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(18) byte[] local18 = new byte[local6];
		Static728.method274(arg0, 0, local18, 0, local6);
		return local18;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(Z)V")
	public static void method8168() {
		@Pc(15) int local15 = Static495.aByteArrayArray17.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (Static495.aByteArrayArray17[local17] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static706.anInt10812; local29++) {
					if (Static89.anIntArray119[local29] == Static148.anIntArray187[local17]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static89.anIntArray119[Static706.anInt10812] = Static148.anIntArray187[local17];
					local27 = Static706.anInt10812++;
				}
				@Pc(80) Class2_Sub20 local80 = new Class2_Sub20(Static495.aByteArrayArray17[local17]);
				@Pc(82) int local82 = 0;
				while (local80.anInt9723 < Static495.aByteArrayArray17[local17].length && local82 < 511 && Static217.anInt3445 < 1023) {
					@Pc(103) int local103 = local82++ << 6 | local27;
					@Pc(107) int local107 = local80.method8575();
					@Pc(111) int local111 = local107 >> 14;
					@Pc(117) int local117 = local107 >> 7 & 0x3F;
					@Pc(121) int local121 = local107 & 0x3F;
					@Pc(134) int local134 = local117 + (Static148.anIntArray187[local17] >> 8) * 64 - Static243.anInt3820;
					@Pc(147) int local147 = local121 + (Static148.anIntArray187[local17] & 0xFF) * 64 - Static224.anInt11062;
					@Pc(154) Class261 local154 = Static192.aClass41_1.method754(local80.method8575(), 2);
					@Pc(161) Class2_Sub49 local161 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local103, 0);
					if (local161 == null && (local154.aByte87 & 0x1) > 0 && local111 == Static597.anInt9295 && local134 >= 0 && local154.anInt7010 + local134 < Static426.anInt6942 && local147 >= 0 && local154.anInt7010 + local147 < Static280.anInt6752) {
						@Pc(213) Class4_Sub2_Sub1_Sub2_Sub2 local213 = new Class4_Sub2_Sub1_Sub2_Sub2();
						local213.anInt2320 = local103;
						@Pc(221) Class2_Sub49 local221 = new Class2_Sub49(local213);
						Static467.aClass218_37.method5099(local221, (long) local103);
						Static459.aClass2_Sub49Array1[Static676.anInt10488++] = local221;
						Static266.anIntArray305[Static217.anInt3445++] = local103;
						local213.anInt2360 = Static528.anInt8386;
						local213.method2068(local154);
						local213.method2057(local213.aClass261_1.anInt7010);
						local213.anInt2357 = local213.aClass261_1.anInt7015 << 3;
						local213.method2054(true, (local213.aClass261_1.aByte86 + 4 & 0x6B400007) << 11);
						local213.method2071(local111, local134, local147, true, local213.method2046());
					}
				}
			}
		}
	}
}
