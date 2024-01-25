import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!pj;")
	public static Class248 aClass248_43;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("b0870f4d81534cda58944e60c803db50b4e9c81917e62b0a7018f91ee377da86232095ffabe0f6eefc8ea220c9d96270bcb8d58f6e0610ce79c71b3c95d0b7b74b6e0955595b5673b9a3ee0cb8d9240c4f0fb356bdf6760aeba4844534cf4e07eb44377d943396f3518f527f11ec0772c0b9412b0da0fac7c00551a089d7db67bb271c7bd27022bc6b780b938f60eb0ad95a4de757b0ad6f4415ab75eecf08ebd5e89962c1a39d587e3fd8171bc998dd0bb28d0e6fe76260eadb903ddc14144489b1f6e83abf4ba9f2446c9c931f819909bc3136299f893af5a8e29c2e60d528d68458b550442a9407d825d81b26ef06ae5e54860eb7fda0d0f69e0f08f70a5ad02261e5c5f37f10decdbb7824cddd984b72bd56ef120eb44974ef4afc93388a20f37cc346b4095295e12c9c06a80041fa32fad127a8bfd5847138f2f2348fc010035a01f94a695f2ae97b9ec03266fb590c7bd0bdf1e0263f81580295d8e1b6c6dc39c02946c42f28f7b70af084e81c3e0bd70e1503c10aed4b2feecc6c3f0b8bee181fe7875c0e981b0ab5ad8570152f2d7c6b3d536c7883e367f8f1e0bff2838bf5c11d7265b052cf586ac0edcafdb143ff869eff9a536966ca2598dbfc21b5ca788b7f56ea0972c56817479470ef051c5b7471bb5d6f7d56bff88f49ae90d7f1801b9e1d517c483a1c2f82d668f3a3ced3fdda912a2349bc1c32b5943627", 16);

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_72 = new Class98(93, 8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method4298() {
		if (Static246.anIntArray653 != null) {
			return;
		}
		Static246.anIntArray653 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = local59 * (1.0F - local50);
				@Pc(97) float local97 = (1.0F - local50 * local81) * local59;
				@Pc(107) float local107 = (1.0F - local50 * (1.0F - local81)) * local59;
				if (local76 == 0) {
					local61 = local59;
					local63 = local107;
					local65 = local88;
				} else if (local76 == 1) {
					local65 = local88;
					local63 = local59;
					local61 = local97;
				} else if (local76 == 2) {
					local61 = local88;
					local63 = local59;
					local65 = local107;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local88;
					local63 = local97;
				} else if (local76 == 4) {
					local61 = local107;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local65 = local97;
					local61 = local59;
					local63 = local88;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(198) int local198 = (int) (local61 * 256.0F);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = (local198 << 16) + (local203 << 8) + local208 - 16777216;
				Static246.anIntArray653[local21++] = local221;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method4299() {
		Static436.method6188(11);
		Static179.method2985();
		System.gc();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!pj;ZLclient!pj;)V")
	public static void method4300(@OriginalArg(1) Class248 arg0, @OriginalArg(3) Class248 arg1) {
		Static503.aClass248_99 = arg0;
		Static492.aClass248_95 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method4301(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static345.anInt6520 = arg0;
		Static56.aClass60_Sub4Array1 = new Class60_Sub4[Static45.anIntArray34[Static345.anInt6520] + 1];
		Static23.anInt421 = 0;
		Static77.anInt1326 = 0;
	}
}
