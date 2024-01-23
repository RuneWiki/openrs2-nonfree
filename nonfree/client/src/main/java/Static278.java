import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!le;")
	public static Class25_Sub3 aClass25_Sub3_1;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "[B")
	public static byte[] aByteArray74;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	private static int anInt5951 = -1;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt5953 = -1;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
	public static int[] anIntArray597 = new int[4];

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()V")
	public static void method4615() {
		method4619();
		if (anInt5953 == -1 || anInt5951 != Static237.anInt5216) {
			anInt5953 = Static297.method4849(Static297.anInt6225, aByteArray74);
			anInt5951 = Static237.anInt5216;
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
	public static void method4616() {
		if (aClass25_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class25_Sub3 local10 = aClass25_Sub3_1 = new Class25_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray308;
		@Pc(16) int[] local16 = local10.anIntArray307;
		@Pc(19) int[] local19 = local10.anIntArray314;
		@Pc(22) int[] local22 = local10.anIntArray316;
		@Pc(25) int[] local25 = local10.anIntArray313;
		@Pc(28) int[] local28 = local10.anIntArray312;
		local10.anInt3517 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class91.anIntArray319[local66] >> 1;
			@Pc(78) int local78 = Class91.anIntArray320[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class91.anIntArray320[local89] >> 9;
				local105 = (Class91.anIntArray319[local89] >> 1) * local72 >> 23;
				local115 = (Class91.anIntArray319[local89] >> 1) * local78 >> 23;
				local13[local10.anInt3517] = local115;
				local16[local10.anInt3517] = local95;
				local19[local10.anInt3517] = -local105;
				local10.anInt3517++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt3521] = 0;
				local25[local10.anInt3521] = local89;
				local28[local10.anInt3521] = local80;
				local10.anInt3521++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt3521] = local89;
					local25[local10.anInt3521] = local105;
					local28[local10.anInt3521] = local80;
					local10.anInt3521++;
					local22[local10.anInt3521] = local105;
					local25[local10.anInt3521] = local115;
					local28[local10.anInt3521] = local80;
					local10.anInt3521++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt3521] = local80;
				local25[local10.anInt3521] = local89;
				local28[local10.anInt3521] = 1;
				local10.anInt3521++;
			}
		}
		local10.anInt3520 = local10.anInt3517;
		local10.aByteArray45 = null;
		local10.aShortArray58 = null;
		local10.anIntArray315 = null;
		local10.anIntArray317 = null;
		local10.aByteArray42 = null;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
	public static void method4619() {
		if (aByteArray74 != null) {
			return;
		}
		aByteArray74 = new byte[16384];
		for (@Pc(6) int local6 = 0; local6 < 64; local6++) {
			@Pc(13) int local13 = 64 - local6;
			@Pc(17) int local17 = local13 * local13;
			@Pc(23) int local23 = 128 - local6 - 1;
			@Pc(27) int local27 = local6 * 128;
			@Pc(31) int local31 = local23 * 128;
			for (@Pc(33) int local33 = 0; local33 < 64; local33++) {
				@Pc(40) int local40 = 64 - local33;
				@Pc(44) int local44 = local40 * local40;
				@Pc(50) int local50 = 128 - local33 - 1;
				@Pc(60) int local60 = 256 - (local44 + local17 << 8) / 4096;
				local60 = local60 * 16 * 192 / 1536;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				aByteArray74[local27 + local33] = aByteArray74[local27 + local50] = aByteArray74[local31 + local33] = aByteArray74[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "()V")
	public static void method4627() {
		if (aByteBuffer12 != null) {
			return;
		}
		@Pc(6) Class1_Sub16 local6 = new Class1_Sub16(1088);
		@Pc(11) Class1_Sub16 local11 = new Class1_Sub16(5140);
		if (Static296.aBoolean344) {
			local11.method2601(0.0F);
			local11.method2601(1.0F);
			local11.method2601(0.0F);
			local11.method2601(0.5F);
			local11.method2601(1.0F);
			local11.method2601(0.0F);
			local11.method2601(-1.0F);
			local11.method2601(0.0F);
			local11.method2601(0.5F);
			local11.method2601(0.0F);
		} else {
			local11.method2629(0.0F);
			local11.method2629(1.0F);
			local11.method2629(0.0F);
			local11.method2629(0.5F);
			local11.method2629(1.0F);
			local11.method2629(0.0F);
			local11.method2629(-1.0F);
			local11.method2629(0.0F);
			local11.method2629(0.5F);
			local11.method2629(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class91.anIntArray319[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class91.anIntArray320[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class91.anIntArray320[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class91.anIntArray319[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class91.anIntArray319[local134] * local123 / 65535.0F;
				if (Static296.aBoolean344) {
					local11.method2601(local159);
					local11.method2601(local141);
					local11.method2601(local150);
					local11.method2601(local96);
					local11.method2601(local98);
				} else {
					local11.method2629(local159);
					local11.method2629(local141);
					local11.method2629(local150);
					local11.method2629(local96);
					local11.method2629(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static296.aBoolean344) {
					local6.method2624(0);
					local6.method2624(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2624(local134++);
						local6.method2624(local125++);
					}
					local6.method2624(1);
					local6.method2624(1);
				} else {
					local6.method2609(0);
					local6.method2609(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2609(local134++);
						local6.method2609(local125++);
					}
					local6.method2609(1);
					local6.method2609(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer12 = ByteBuffer.allocateDirect(local11.anInt3328);
		aByteBuffer12.put(local11.aByteArray39, 0, local11.anInt3328);
		aByteBuffer12.flip();
		aByteBuffer11 = ByteBuffer.allocateDirect(local6.anInt3328);
		aByteBuffer11.put(local6.aByteArray39, 0, local6.anInt3328);
		aByteBuffer11.flip();
	}

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "()V")
	public static void method4630() {
		if (anInt5953 != -1) {
			Static237.method4089(anInt5953, 0, anInt5951);
		}
		anInt5953 = -1;
		anInt5951 = -1;
		aByteBuffer12 = null;
		aByteBuffer11 = null;
		aClass25_Sub3_1 = null;
		aByteArray74 = null;
	}
}
