import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!ud;")
	public static Class13_Sub7 aClass13_Sub7_1;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "[B")
	public static byte[] aByteArray1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[I")
	public static int[] anIntArray4 = new int[4];

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	private static int anInt117 = -1;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	public static int anInt125 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
	public static void method91() {
		if (aByteArray1 != null) {
			return;
		}
		aByteArray1 = new byte[16384];
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
				aByteArray1[local27 + local33] = aByteArray1[local27 + local50] = aByteArray1[local31 + local33] = aByteArray1[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
	public static void method95() {
		if (aByteBuffer1 != null) {
			return;
		}
		@Pc(6) Class4_Sub24 local6 = new Class4_Sub24(1088);
		@Pc(11) Class4_Sub24 local11 = new Class4_Sub24(5140);
		if (Static251.aBoolean314) {
			local11.method3099(0.0F);
			local11.method3099(1.0F);
			local11.method3099(0.0F);
			local11.method3099(0.5F);
			local11.method3099(1.0F);
			local11.method3099(0.0F);
			local11.method3099(-1.0F);
			local11.method3099(0.0F);
			local11.method3099(0.5F);
			local11.method3099(0.0F);
		} else {
			local11.method3087(0.0F);
			local11.method3087(1.0F);
			local11.method3087(0.0F);
			local11.method3087(0.5F);
			local11.method3087(1.0F);
			local11.method3087(0.0F);
			local11.method3087(-1.0F);
			local11.method3087(0.0F);
			local11.method3087(0.5F);
			local11.method3087(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class174.anIntArray444[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class174.anIntArray443[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class174.anIntArray443[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class174.anIntArray444[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class174.anIntArray444[local134] * local123 / 65535.0F;
				if (Static251.aBoolean314) {
					local11.method3099(local159);
					local11.method3099(local141);
					local11.method3099(local150);
					local11.method3099(local96);
					local11.method3099(local98);
				} else {
					local11.method3087(local159);
					local11.method3087(local141);
					local11.method3087(local150);
					local11.method3087(local96);
					local11.method3087(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static251.aBoolean314) {
					local6.method3105(0);
					local6.method3105(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method3105(local134++);
						local6.method3105(local125++);
					}
					local6.method3105(1);
					local6.method3105(1);
				} else {
					local6.method3100(0);
					local6.method3100(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method3100(local134++);
						local6.method3100(local125++);
					}
					local6.method3100(1);
					local6.method3100(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer1 = ByteBuffer.allocateDirect(local11.anInt3822);
		aByteBuffer1.put(local11.aByteArray47, 0, local11.anInt3822);
		aByteBuffer1.flip();
		aByteBuffer2 = ByteBuffer.allocateDirect(local6.anInt3822);
		aByteBuffer2.put(local6.aByteArray47, 0, local6.anInt3822);
		aByteBuffer2.flip();
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
	public static void method100() {
		if (aClass13_Sub7_1 != null) {
			return;
		}
		@Pc(10) Class13_Sub7 local10 = aClass13_Sub7_1 = new Class13_Sub7(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray433;
		@Pc(16) int[] local16 = local10.anIntArray434;
		@Pc(19) int[] local19 = local10.anIntArray430;
		@Pc(22) int[] local22 = local10.anIntArray432;
		@Pc(25) int[] local25 = local10.anIntArray424;
		@Pc(28) int[] local28 = local10.anIntArray426;
		local10.anInt5391 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class174.anIntArray444[local66] >> 1;
			@Pc(78) int local78 = Class174.anIntArray443[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class174.anIntArray443[local89] >> 9;
				local105 = (Class174.anIntArray444[local89] >> 1) * local72 >> 23;
				local115 = (Class174.anIntArray444[local89] >> 1) * local78 >> 23;
				local13[local10.anInt5391] = local115;
				local16[local10.anInt5391] = local95;
				local19[local10.anInt5391] = -local105;
				local10.anInt5391++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt5390] = 0;
				local25[local10.anInt5390] = local89;
				local28[local10.anInt5390] = local80;
				local10.anInt5390++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt5390] = local89;
					local25[local10.anInt5390] = local105;
					local28[local10.anInt5390] = local80;
					local10.anInt5390++;
					local22[local10.anInt5390] = local105;
					local25[local10.anInt5390] = local115;
					local28[local10.anInt5390] = local80;
					local10.anInt5390++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt5390] = local80;
				local25[local10.anInt5390] = local89;
				local28[local10.anInt5390] = 1;
				local10.anInt5390++;
			}
		}
		local10.anInt5389 = local10.anInt5391;
		local10.aByteArray68 = null;
		local10.aShortArray89 = null;
		local10.anIntArray428 = null;
		local10.anIntArray423 = null;
		local10.aByteArray65 = null;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
	public static void method101() {
		if (anInt125 != -1) {
			Static239.method3679(anInt125, 0, anInt117);
		}
		anInt125 = -1;
		anInt117 = -1;
		aByteBuffer1 = null;
		aByteBuffer2 = null;
		aClass13_Sub7_1 = null;
		aByteArray1 = null;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "()V")
	public static void method105() {
		method91();
		if (anInt125 == -1 || anInt117 != Static239.anInt4726) {
			anInt125 = Static206.method3278(Static206.anInt4062, aByteArray1);
			anInt117 = Static239.anInt4726;
		}
	}
}
