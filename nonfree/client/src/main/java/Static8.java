import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "[B")
	public static byte[] aByteArray2;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!tc;")
	public static Class15_Sub7 aClass15_Sub7_1;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt127 = -1;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	private static int anInt137 = -1;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "[I")
	public static int[] anIntArray19 = new int[4];

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "()V")
	public static void method124() {
		method135();
		if (anInt127 == -1 || anInt137 != Static124.anInt2871) {
			anInt127 = Static298.method4555(Static298.anInt5777, aByteArray2);
			anInt137 = Static124.anInt2871;
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
	public static void method125() {
		if (aByteBuffer1 != null) {
			return;
		}
		@Pc(6) Class2_Sub16 local6 = new Class2_Sub16(1088);
		@Pc(11) Class2_Sub16 local11 = new Class2_Sub16(5140);
		if (Static116.aBoolean180) {
			local11.method2147(0.0F);
			local11.method2147(1.0F);
			local11.method2147(0.0F);
			local11.method2147(0.5F);
			local11.method2147(1.0F);
			local11.method2147(0.0F);
			local11.method2147(-1.0F);
			local11.method2147(0.0F);
			local11.method2147(0.5F);
			local11.method2147(0.0F);
		} else {
			local11.method2142(0.0F);
			local11.method2142(1.0F);
			local11.method2142(0.0F);
			local11.method2142(0.5F);
			local11.method2142(1.0F);
			local11.method2142(0.0F);
			local11.method2142(-1.0F);
			local11.method2142(0.0F);
			local11.method2142(0.5F);
			local11.method2142(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class1.anIntArray4[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class1.anIntArray3[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class1.anIntArray3[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class1.anIntArray4[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class1.anIntArray4[local134] * local123 / 65535.0F;
				if (Static116.aBoolean180) {
					local11.method2147(local159);
					local11.method2147(local141);
					local11.method2147(local150);
					local11.method2147(local96);
					local11.method2147(local98);
				} else {
					local11.method2142(local159);
					local11.method2142(local141);
					local11.method2142(local150);
					local11.method2142(local96);
					local11.method2142(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static116.aBoolean180) {
					local6.method2143(0);
					local6.method2143(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2143(local134++);
						local6.method2143(local125++);
					}
					local6.method2143(1);
					local6.method2143(1);
				} else {
					local6.method2149(0);
					local6.method2149(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2149(local134++);
						local6.method2149(local125++);
					}
					local6.method2149(1);
					local6.method2149(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer1 = ByteBuffer.allocateDirect(local11.anInt2789);
		aByteBuffer1.put(local11.aByteArray17, 0, local11.anInt2789);
		aByteBuffer1.flip();
		aByteBuffer2 = ByteBuffer.allocateDirect(local6.anInt2789);
		aByteBuffer2.put(local6.aByteArray17, 0, local6.anInt2789);
		aByteBuffer2.flip();
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "()V")
	public static void method129() {
		if (anInt127 != -1) {
			Static124.method2212(anInt127, 0, anInt137);
		}
		anInt127 = -1;
		anInt137 = -1;
		aByteBuffer1 = null;
		aByteBuffer2 = null;
		aClass15_Sub7_1 = null;
		aByteArray2 = null;
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "()V")
	public static void method133() {
		if (aClass15_Sub7_1 != null) {
			return;
		}
		@Pc(10) Class15_Sub7 local10 = aClass15_Sub7_1 = new Class15_Sub7(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray504;
		@Pc(16) int[] local16 = local10.anIntArray500;
		@Pc(19) int[] local19 = local10.anIntArray501;
		@Pc(22) int[] local22 = local10.anIntArray507;
		@Pc(25) int[] local25 = local10.anIntArray505;
		@Pc(28) int[] local28 = local10.anIntArray503;
		local10.anInt5221 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class1.anIntArray4[local66] >> 1;
			@Pc(78) int local78 = Class1.anIntArray3[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class1.anIntArray3[local89] >> 9;
				local105 = (Class1.anIntArray4[local89] >> 1) * local72 >> 23;
				local115 = (Class1.anIntArray4[local89] >> 1) * local78 >> 23;
				local13[local10.anInt5221] = local115;
				local16[local10.anInt5221] = local95;
				local19[local10.anInt5221] = -local105;
				local10.anInt5221++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt5225] = 0;
				local25[local10.anInt5225] = local89;
				local28[local10.anInt5225] = local80;
				local10.anInt5225++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt5225] = local89;
					local25[local10.anInt5225] = local105;
					local28[local10.anInt5225] = local80;
					local10.anInt5225++;
					local22[local10.anInt5225] = local105;
					local25[local10.anInt5225] = local115;
					local28[local10.anInt5225] = local80;
					local10.anInt5225++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt5225] = local80;
				local25[local10.anInt5225] = local89;
				local28[local10.anInt5225] = 1;
				local10.anInt5225++;
			}
		}
		local10.anInt5223 = local10.anInt5221;
		local10.aByteArray57 = null;
		local10.aShortArray81 = null;
		local10.anIntArray509 = null;
		local10.anIntArray508 = null;
		local10.aByteArray62 = null;
	}

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "()V")
	public static void method135() {
		if (aByteArray2 != null) {
			return;
		}
		aByteArray2 = new byte[16384];
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
				aByteArray2[local27 + local33] = aByteArray2[local27 + local50] = aByteArray2[local31 + local33] = aByteArray2[local31 + local50] = (byte) local60;
			}
		}
	}
}
