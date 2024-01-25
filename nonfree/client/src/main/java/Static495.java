import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	public static int anInt9127;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "[I")
	public static final int[] anIntArray599 = new int[2];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!ua;)Z")
	public static boolean method7668(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method8400(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method8400(1) != 0) {
				method7668(arg0, arg1);
			}
			local28 = arg1.method8400(6);
			local33 = arg1.method8400(6);
			@Pc(45) boolean local45 = arg1.method8400(1) == 1;
			if (local45) {
				Static210.anIntArray244[Static229.anInt5073++] = arg0;
			}
			if (Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class102 local68 = Static259.aClass102Array1[arg0];
			@Pc(76) Class3_Sub1_Sub3_Sub3_Sub2 local76 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[arg0] = new Class3_Sub1_Sub3_Sub3_Sub2();
			local76.anInt6083 = arg0;
			if (Static405.aClass2_Sub11Array1[arg0] != null) {
				local76.method5222(Static405.aClass2_Sub11Array1[arg0]);
			}
			local76.method5213(local68.anInt3413, true);
			local76.anInt6070 = local68.anInt3415;
			local102 = local68.anInt3411;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(125) int local125 = local28 + (local112 << 6) - Static84.anInt2565;
			local76.aBoolean461 = local68.aBoolean257;
			@Pc(138) int local138 = local33 + (local116 << 6) - Static32.anInt723;
			local76.aByteArray82[0] = Static566.aByteArray130[arg0];
			local76.aByte132 = local76.aByte131 = (byte) local106;
			if (Static30.method735(local138, local125)) {
				local76.aByte131++;
			}
			local76.method5219(local138, local125);
			local76.aBoolean459 = false;
			Static259.aClass102Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method8400(2);
			local33 = Static259.aClass102Array1[arg0].anInt3411;
			Static259.aClass102Array1[arg0].anInt3411 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(241) int local241;
			if (local8 != 2) {
				local28 = arg1.method8400(18);
				local33 = local28 >> 16;
				local228 = local28 >> 8 & 0xFF;
				local233 = local28 & 0xFF;
				local241 = Static259.aClass102Array1[arg0].anInt3411;
				local102 = (local241 >> 28) + local33 & 0x3;
				local106 = local228 + (local241 >> 14) & 0xFF;
				local112 = local241 + local233 & 0xFF;
				Static259.aClass102Array1[arg0].anInt3411 = local112 + (local102 << 28) + (local106 << 14);
				return false;
			}
			local28 = arg1.method8400(5);
			local33 = local28 >> 3;
			local228 = local28 & 0x7;
			local233 = Static259.aClass102Array1[arg0].anInt3411;
			local241 = local33 + (local233 >> 28) & 0x3;
			local102 = local233 >> 14 & 0xFF;
			local106 = local233 & 0xFF;
			if (local228 == 0) {
				local102--;
				local106--;
			}
			if (local228 == 1) {
				local106--;
			}
			if (local228 == 2) {
				local106--;
				local102++;
			}
			if (local228 == 3) {
				local102--;
			}
			if (local228 == 4) {
				local102++;
			}
			if (local228 == 5) {
				local102--;
				local106++;
			}
			if (local228 == 6) {
				local106++;
			}
			if (local228 == 7) {
				local102++;
				local106++;
			}
			Static259.aClass102Array1[arg0].anInt3411 = local106 + (local241 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
	public static void method7670(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 13);
		local8.method3088();
		local8.anInt3368 = arg1;
	}
}
