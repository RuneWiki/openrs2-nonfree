import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!dl;")
	public static Class14_Sub3 aClass14_Sub3_1;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[B")
	public static byte[] aByteArray56;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	private static int anInt4187 = -1;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
	public static int[] anIntArray378 = new int[4];

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
	public static int anInt4195 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	public static void method3329() {
		if (aByteBuffer8 != null) {
			return;
		}
		@Pc(6) Class1_Sub11 local6 = new Class1_Sub11(1088);
		@Pc(11) Class1_Sub11 local11 = new Class1_Sub11(5140);
		if (Static277.aBoolean418) {
			local11.method2684(0.0F);
			local11.method2684(1.0F);
			local11.method2684(0.0F);
			local11.method2684(0.5F);
			local11.method2684(1.0F);
			local11.method2684(0.0F);
			local11.method2684(-1.0F);
			local11.method2684(0.0F);
			local11.method2684(0.5F);
			local11.method2684(0.0F);
		} else {
			local11.method2642(0.0F);
			local11.method2642(1.0F);
			local11.method2642(0.0F);
			local11.method2642(0.5F);
			local11.method2642(1.0F);
			local11.method2642(0.0F);
			local11.method2642(-1.0F);
			local11.method2642(0.0F);
			local11.method2642(0.5F);
			local11.method2642(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class68.anIntArray229[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class68.anIntArray226[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class68.anIntArray226[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class68.anIntArray229[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class68.anIntArray229[local134] * local123 / 65535.0F;
				if (Static277.aBoolean418) {
					local11.method2684(local159);
					local11.method2684(local141);
					local11.method2684(local150);
					local11.method2684(local96);
					local11.method2684(local98);
				} else {
					local11.method2642(local159);
					local11.method2642(local141);
					local11.method2642(local150);
					local11.method2642(local96);
					local11.method2642(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static277.aBoolean418) {
					local6.method2660(0);
					local6.method2660(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2660(local134++);
						local6.method2660(local125++);
					}
					local6.method2660(1);
					local6.method2660(1);
				} else {
					local6.method2630(0);
					local6.method2630(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method2630(local134++);
						local6.method2630(local125++);
					}
					local6.method2630(1);
					local6.method2630(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer8 = ByteBuffer.allocateDirect(local11.anInt3264);
		aByteBuffer8.put(local11.aByteArray47, 0, local11.anInt3264);
		aByteBuffer8.flip();
		aByteBuffer9 = ByteBuffer.allocateDirect(local6.anInt3264);
		aByteBuffer9.put(local6.aByteArray47, 0, local6.anInt3264);
		aByteBuffer9.flip();
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
	public static void method3330() {
		method3345();
		if (anInt4195 == -1 || anInt4187 != Static94.anInt2207) {
			anInt4195 = Static37.method779(Static37.anInt938, aByteArray56);
			anInt4187 = Static94.anInt2207;
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()V")
	public static void method3333() {
		if (anInt4195 != -1) {
			Static94.method1748(anInt4195, 0, anInt4187);
		}
		anInt4195 = -1;
		anInt4187 = -1;
		aByteBuffer8 = null;
		aByteBuffer9 = null;
		aClass14_Sub3_1 = null;
		aByteArray56 = null;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "()V")
	public static void method3342() {
		if (aClass14_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class14_Sub3 local10 = aClass14_Sub3_1 = new Class14_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray116;
		@Pc(16) int[] local16 = local10.anIntArray115;
		@Pc(19) int[] local19 = local10.anIntArray121;
		@Pc(22) int[] local22 = local10.anIntArray111;
		@Pc(25) int[] local25 = local10.anIntArray112;
		@Pc(28) int[] local28 = local10.anIntArray113;
		local10.anInt1156 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class68.anIntArray229[local66] >> 1;
			@Pc(78) int local78 = Class68.anIntArray226[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class68.anIntArray226[local89] >> 9;
				local105 = (Class68.anIntArray229[local89] >> 1) * local72 >> 23;
				local115 = (Class68.anIntArray229[local89] >> 1) * local78 >> 23;
				local13[local10.anInt1156] = local115;
				local16[local10.anInt1156] = local95;
				local19[local10.anInt1156] = -local105;
				local10.anInt1156++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt1154] = 0;
				local25[local10.anInt1154] = local89;
				local28[local10.anInt1154] = local80;
				local10.anInt1154++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt1154] = local89;
					local25[local10.anInt1154] = local105;
					local28[local10.anInt1154] = local80;
					local10.anInt1154++;
					local22[local10.anInt1154] = local105;
					local25[local10.anInt1154] = local115;
					local28[local10.anInt1154] = local80;
					local10.anInt1154++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt1154] = local80;
				local25[local10.anInt1154] = local89;
				local28[local10.anInt1154] = 1;
				local10.anInt1154++;
			}
		}
		local10.anInt1157 = local10.anInt1156;
		local10.aByteArray22 = null;
		local10.aShortArray19 = null;
		local10.anIntArray114 = null;
		local10.anIntArray122 = null;
		local10.aByteArray17 = null;
	}

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "()V")
	public static void method3345() {
		if (aByteArray56 != null) {
			return;
		}
		aByteArray56 = new byte[16384];
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
				aByteArray56[local27 + local33] = aByteArray56[local27 + local50] = aByteArray56[local31 + local33] = aByteArray56[local31 + local50] = (byte) local60;
			}
		}
	}
}
