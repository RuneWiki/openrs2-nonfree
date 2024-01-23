import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Lclient!tk;")
	public static Class22_Sub7 aClass22_Sub7_1;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[B")
	public static byte[] aByteArray36;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private static int anInt3424 = -1;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public static int anInt3427 = -1;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
	public static int[] anIntArray275 = new int[4];

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	public static void method2763() {
		if (aByteBuffer10 != null) {
			return;
		}
		@Pc(6) Class1_Sub14 local6 = new Class1_Sub14(1088);
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(5140);
		if (Static291.aBoolean413) {
			local11.method2604(0.0F);
			local11.method2604(1.0F);
			local11.method2604(0.0F);
			local11.method2604(0.5F);
			local11.method2604(1.0F);
			local11.method2604(0.0F);
			local11.method2604(-1.0F);
			local11.method2604(0.0F);
			local11.method2604(0.5F);
			local11.method2604(0.0F);
		} else {
			local11.method2594(0.0F);
			local11.method2594(1.0F);
			local11.method2594(0.0F);
			local11.method2594(0.5F);
			local11.method2594(1.0F);
			local11.method2594(0.0F);
			local11.method2594(-1.0F);
			local11.method2594(0.0F);
			local11.method2594(0.5F);
			local11.method2594(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class17.anIntArray22[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class17.anIntArray24[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class17.anIntArray24[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class17.anIntArray22[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class17.anIntArray22[local134] * local123 / 65535.0F;
				if (Static291.aBoolean413) {
					local11.method2604(local159);
					local11.method2604(local141);
					local11.method2604(local150);
					local11.method2604(local96);
					local11.method2604(local98);
				} else {
					local11.method2594(local159);
					local11.method2594(local141);
					local11.method2594(local150);
					local11.method2594(local96);
					local11.method2594(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static291.aBoolean413) {
					local6.method2637(0);
					local6.method2637(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2637(local134++);
						local6.method2637(local125++);
					}
					local6.method2637(1);
					local6.method2637(1);
				} else {
					local6.method2589(0);
					local6.method2589(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2589(local134++);
						local6.method2589(local125++);
					}
					local6.method2589(1);
					local6.method2589(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer10 = ByteBuffer.allocateDirect(local11.anInt3290);
		aByteBuffer10.put(local11.aByteArray34, 0, local11.anInt3290);
		aByteBuffer10.flip();
		aByteBuffer11 = ByteBuffer.allocateDirect(local6.anInt3290);
		aByteBuffer11.put(local6.aByteArray34, 0, local6.anInt3290);
		aByteBuffer11.flip();
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
	public static void method2772() {
		if (aClass22_Sub7_1 != null) {
			return;
		}
		@Pc(10) Class22_Sub7 local10 = aClass22_Sub7_1 = new Class22_Sub7(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray483;
		@Pc(16) int[] local16 = local10.anIntArray486;
		@Pc(19) int[] local19 = local10.anIntArray475;
		@Pc(22) int[] local22 = local10.anIntArray478;
		@Pc(25) int[] local25 = local10.anIntArray482;
		@Pc(28) int[] local28 = local10.anIntArray480;
		local10.anInt5254 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class17.anIntArray22[local66] >> 1;
			@Pc(78) int local78 = Class17.anIntArray24[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class17.anIntArray24[local89] >> 9;
				local105 = (Class17.anIntArray22[local89] >> 1) * local72 >> 23;
				local115 = (Class17.anIntArray22[local89] >> 1) * local78 >> 23;
				local13[local10.anInt5254] = local115;
				local16[local10.anInt5254] = local95;
				local19[local10.anInt5254] = -local105;
				local10.anInt5254++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt5257] = 0;
				local25[local10.anInt5257] = local89;
				local28[local10.anInt5257] = local80;
				local10.anInt5257++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt5257] = local89;
					local25[local10.anInt5257] = local105;
					local28[local10.anInt5257] = local80;
					local10.anInt5257++;
					local22[local10.anInt5257] = local105;
					local25[local10.anInt5257] = local115;
					local28[local10.anInt5257] = local80;
					local10.anInt5257++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt5257] = local80;
				local25[local10.anInt5257] = local89;
				local28[local10.anInt5257] = 1;
				local10.anInt5257++;
			}
		}
		local10.anInt5258 = local10.anInt5254;
		local10.aByteArray62 = null;
		local10.aShortArray82 = null;
		local10.anIntArray484 = null;
		local10.anIntArray485 = null;
		local10.aByteArray59 = null;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()V")
	public static void method2775() {
		if (aByteArray36 != null) {
			return;
		}
		aByteArray36 = new byte[16384];
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
				aByteArray36[local27 + local33] = aByteArray36[local27 + local50] = aByteArray36[local31 + local33] = aByteArray36[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()V")
	public static void method2776() {
		method2775();
		if (anInt3427 == -1 || anInt3424 != Static74.anInt1419) {
			anInt3427 = Static160.method2698(Static160.anInt3376, aByteArray36);
			anInt3424 = Static74.anInt1419;
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()V")
	public static void method2779() {
		if (anInt3427 != -1) {
			Static74.method1189(anInt3427, 0, anInt3424);
		}
		anInt3427 = -1;
		anInt3424 = -1;
		aByteBuffer10 = null;
		aByteBuffer11 = null;
		aClass22_Sub7_1 = null;
		aByteArray36 = null;
	}
}
