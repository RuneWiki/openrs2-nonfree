import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[B")
	public static byte[] aByteArray65;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!ch;")
	public static Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt4893 = -1;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
	public static int[] anIntArray452 = new int[4];

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	private static int anInt4901 = -1;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
	public static void method3689() {
		method3693();
		if (anInt4893 == -1 || anInt4901 != Static113.anInt2464) {
			anInt4893 = Static201.method3207(Static201.anInt4375, aByteArray65);
			anInt4901 = Static113.anInt2464;
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
	public static void method3693() {
		if (aByteArray65 != null) {
			return;
		}
		aByteArray65 = new byte[16384];
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
				aByteArray65[local27 + local33] = aByteArray65[local27 + local50] = aByteArray65[local31 + local33] = aByteArray65[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "()V")
	public static void method3698() {
		if (anInt4893 != -1) {
			Static113.method1837(anInt4893, 0, anInt4901);
		}
		anInt4893 = -1;
		anInt4901 = -1;
		aByteBuffer8 = null;
		aByteBuffer9 = null;
		aClass2_Sub3_1 = null;
		aByteArray65 = null;
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "()V")
	public static void method3701() {
		if (aClass2_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class2_Sub3 local10 = aClass2_Sub3_1 = new Class2_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray106;
		@Pc(16) int[] local16 = local10.anIntArray116;
		@Pc(19) int[] local19 = local10.anIntArray115;
		@Pc(22) int[] local22 = local10.anIntArray107;
		@Pc(25) int[] local25 = local10.anIntArray108;
		@Pc(28) int[] local28 = local10.anIntArray112;
		local10.anInt762 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class146.anIntArray461[local66] >> 1;
			@Pc(78) int local78 = Class146.anIntArray463[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class146.anIntArray463[local89] >> 9;
				local105 = (Class146.anIntArray461[local89] >> 1) * local72 >> 23;
				local115 = (Class146.anIntArray461[local89] >> 1) * local78 >> 23;
				local13[local10.anInt762] = local115;
				local16[local10.anInt762] = local95;
				local19[local10.anInt762] = -local105;
				local10.anInt762++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt764] = 0;
				local25[local10.anInt764] = local89;
				local28[local10.anInt764] = local80;
				local10.anInt764++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt764] = local89;
					local25[local10.anInt764] = local105;
					local28[local10.anInt764] = local80;
					local10.anInt764++;
					local22[local10.anInt764] = local105;
					local25[local10.anInt764] = local115;
					local28[local10.anInt764] = local80;
					local10.anInt764++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt764] = local80;
				local25[local10.anInt764] = local89;
				local28[local10.anInt764] = 1;
				local10.anInt764++;
			}
		}
		local10.anInt761 = local10.anInt762;
		local10.aByteArray25 = null;
		local10.aShortArray33 = null;
		local10.anIntArray110 = null;
		local10.anIntArray113 = null;
		local10.aByteArray29 = null;
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "()V")
	public static void method3703() {
		if (aByteBuffer8 != null) {
			return;
		}
		@Pc(6) Class1_Sub14 local6 = new Class1_Sub14(1088);
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(5140);
		if (Static294.aBoolean377) {
			local11.method2192(0.0F);
			local11.method2192(1.0F);
			local11.method2192(0.0F);
			local11.method2192(0.5F);
			local11.method2192(1.0F);
			local11.method2192(0.0F);
			local11.method2192(-1.0F);
			local11.method2192(0.0F);
			local11.method2192(0.5F);
			local11.method2192(0.0F);
		} else {
			local11.method2217(0.0F);
			local11.method2217(1.0F);
			local11.method2217(0.0F);
			local11.method2217(0.5F);
			local11.method2217(1.0F);
			local11.method2217(0.0F);
			local11.method2217(-1.0F);
			local11.method2217(0.0F);
			local11.method2217(0.5F);
			local11.method2217(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class146.anIntArray461[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class146.anIntArray463[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class146.anIntArray463[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class146.anIntArray461[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class146.anIntArray461[local134] * local123 / 65535.0F;
				if (Static294.aBoolean377) {
					local11.method2192(local159);
					local11.method2192(local141);
					local11.method2192(local150);
					local11.method2192(local96);
					local11.method2192(local98);
				} else {
					local11.method2217(local159);
					local11.method2217(local141);
					local11.method2217(local150);
					local11.method2217(local96);
					local11.method2217(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static294.aBoolean377) {
					local6.method2208(0);
					local6.method2208(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2208(local134++);
						local6.method2208(local125++);
					}
					local6.method2208(1);
					local6.method2208(1);
				} else {
					local6.method2205(0);
					local6.method2205(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2205(local134++);
						local6.method2205(local125++);
					}
					local6.method2205(1);
					local6.method2205(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer8 = ByteBuffer.allocateDirect(local11.anInt3000);
		aByteBuffer8.put(local11.aByteArray55, 0, local11.anInt3000);
		aByteBuffer8.flip();
		aByteBuffer9 = ByteBuffer.allocateDirect(local6.anInt3000);
		aByteBuffer9.put(local6.aByteArray55, 0, local6.anInt3000);
		aByteBuffer9.flip();
	}
}
