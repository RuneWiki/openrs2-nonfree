import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!vi;")
	public static Class36_Sub7 aClass36_Sub7_1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "[B")
	public static byte[] aByteArray27;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
	public static int anInt3142 = -1;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
	public static int[] anIntArray248 = new int[4];

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
	private static int anInt3150 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public static void method2468() {
		if (aClass36_Sub7_1 != null) {
			return;
		}
		@Pc(10) Class36_Sub7 local10 = aClass36_Sub7_1 = new Class36_Sub7(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray486;
		@Pc(16) int[] local16 = local10.anIntArray483;
		@Pc(19) int[] local19 = local10.anIntArray482;
		@Pc(22) int[] local22 = local10.anIntArray479;
		@Pc(25) int[] local25 = local10.anIntArray488;
		@Pc(28) int[] local28 = local10.anIntArray477;
		local10.anInt5548 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class68.anIntArray137[local66] >> 1;
			@Pc(78) int local78 = Class68.anIntArray139[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class68.anIntArray139[local89] >> 9;
				local105 = (Class68.anIntArray137[local89] >> 1) * local72 >> 23;
				local115 = (Class68.anIntArray137[local89] >> 1) * local78 >> 23;
				local13[local10.anInt5548] = local115;
				local16[local10.anInt5548] = local95;
				local19[local10.anInt5548] = -local105;
				local10.anInt5548++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt5547] = 0;
				local25[local10.anInt5547] = local89;
				local28[local10.anInt5547] = local80;
				local10.anInt5547++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt5547] = local89;
					local25[local10.anInt5547] = local105;
					local28[local10.anInt5547] = local80;
					local10.anInt5547++;
					local22[local10.anInt5547] = local105;
					local25[local10.anInt5547] = local115;
					local28[local10.anInt5547] = local80;
					local10.anInt5547++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt5547] = local80;
				local25[local10.anInt5547] = local89;
				local28[local10.anInt5547] = 1;
				local10.anInt5547++;
			}
		}
		local10.anInt5545 = local10.anInt5548;
		local10.aByteArray72 = null;
		local10.aShortArray78 = null;
		local10.anIntArray487 = null;
		local10.anIntArray481 = null;
		local10.aByteArray69 = null;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
	public static void method2478() {
		if (anInt3142 != -1) {
			Static166.method2639(anInt3142, 0, anInt3150);
		}
		anInt3142 = -1;
		anInt3150 = -1;
		aByteBuffer7 = null;
		aByteBuffer8 = null;
		aClass36_Sub7_1 = null;
		aByteArray27 = null;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()V")
	public static void method2479() {
		if (aByteArray27 != null) {
			return;
		}
		aByteArray27 = new byte[16384];
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
				aByteArray27[local27 + local33] = aByteArray27[local27 + local50] = aByteArray27[local31 + local33] = aByteArray27[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "()V")
	public static void method2480() {
		method2479();
		if (anInt3142 == -1 || anInt3150 != Static166.anInt3350) {
			anInt3142 = Static287.method4252(Static287.anInt5646, aByteArray27);
			anInt3150 = Static166.anInt3350;
		}
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "()V")
	public static void method2483() {
		if (aByteBuffer7 != null) {
			return;
		}
		@Pc(6) Class8_Sub2 local6 = new Class8_Sub2(1088);
		@Pc(11) Class8_Sub2 local11 = new Class8_Sub2(5140);
		if (Static116.aBoolean189) {
			local11.method2383(0.0F);
			local11.method2383(1.0F);
			local11.method2383(0.0F);
			local11.method2383(0.5F);
			local11.method2383(1.0F);
			local11.method2383(0.0F);
			local11.method2383(-1.0F);
			local11.method2383(0.0F);
			local11.method2383(0.5F);
			local11.method2383(0.0F);
		} else {
			local11.method2324(0.0F);
			local11.method2324(1.0F);
			local11.method2324(0.0F);
			local11.method2324(0.5F);
			local11.method2324(1.0F);
			local11.method2324(0.0F);
			local11.method2324(-1.0F);
			local11.method2324(0.0F);
			local11.method2324(0.5F);
			local11.method2324(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class68.anIntArray137[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class68.anIntArray139[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class68.anIntArray139[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class68.anIntArray137[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class68.anIntArray137[local134] * local123 / 65535.0F;
				if (Static116.aBoolean189) {
					local11.method2383(local159);
					local11.method2383(local141);
					local11.method2383(local150);
					local11.method2383(local96);
					local11.method2383(local98);
				} else {
					local11.method2324(local159);
					local11.method2324(local141);
					local11.method2324(local150);
					local11.method2324(local96);
					local11.method2324(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static116.aBoolean189) {
					local6.method2333(0);
					local6.method2333(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2333(local134++);
						local6.method2333(local125++);
					}
					local6.method2333(1);
					local6.method2333(1);
				} else {
					local6.method2361(0);
					local6.method2361(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2361(local134++);
						local6.method2361(local125++);
					}
					local6.method2361(1);
					local6.method2361(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer7 = ByteBuffer.allocateDirect(local11.anInt2955);
		aByteBuffer7.put(local11.aByteArray24, 0, local11.anInt2955);
		aByteBuffer7.flip();
		aByteBuffer8 = ByteBuffer.allocateDirect(local6.anInt2955);
		aByteBuffer8.put(local6.aByteArray24, 0, local6.anInt2955);
		aByteBuffer8.flip();
	}
}
