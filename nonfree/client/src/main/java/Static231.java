import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!rd;")
	public static Class15_Sub6 aClass15_Sub6_1;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "[B")
	public static byte[] aByteArray49;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public static int anInt4214 = -1;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "[I")
	public static int[] anIntArray357 = new int[4];

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	private static int anInt4221 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
	public static void method3558() {
		if (aByteBuffer12 != null) {
			return;
		}
		@Pc(6) Class1_Sub14 local6 = new Class1_Sub14(1088);
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(5140);
		if (Static156.aBoolean212) {
			local11.method1388(0.0F);
			local11.method1388(1.0F);
			local11.method1388(0.0F);
			local11.method1388(0.5F);
			local11.method1388(1.0F);
			local11.method1388(0.0F);
			local11.method1388(-1.0F);
			local11.method1388(0.0F);
			local11.method1388(0.5F);
			local11.method1388(0.0F);
		} else {
			local11.method1395(0.0F);
			local11.method1395(1.0F);
			local11.method1395(0.0F);
			local11.method1395(0.5F);
			local11.method1395(1.0F);
			local11.method1395(0.0F);
			local11.method1395(-1.0F);
			local11.method1395(0.0F);
			local11.method1395(0.5F);
			local11.method1395(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class135.anIntArray335[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class135.anIntArray338[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class135.anIntArray338[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class135.anIntArray335[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class135.anIntArray335[local134] * local123 / 65535.0F;
				if (Static156.aBoolean212) {
					local11.method1388(local159);
					local11.method1388(local141);
					local11.method1388(local150);
					local11.method1388(local96);
					local11.method1388(local98);
				} else {
					local11.method1395(local159);
					local11.method1395(local141);
					local11.method1395(local150);
					local11.method1395(local96);
					local11.method1395(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static156.aBoolean212) {
					local6.method1338(0);
					local6.method1338(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1338(local134++);
						local6.method1338(local125++);
					}
					local6.method1338(1);
					local6.method1338(1);
				} else {
					local6.method1344(0);
					local6.method1344(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1344(local134++);
						local6.method1344(local125++);
					}
					local6.method1344(1);
					local6.method1344(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer12 = ByteBuffer.allocateDirect(local11.anInt1480);
		aByteBuffer12.put(local11.aByteArray17, 0, local11.anInt1480);
		aByteBuffer12.flip();
		aByteBuffer11 = ByteBuffer.allocateDirect(local6.anInt1480);
		aByteBuffer11.put(local6.aByteArray17, 0, local6.anInt1480);
		aByteBuffer11.flip();
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()V")
	public static void method3565() {
		if (anInt4214 != -1) {
			Static10.method130(anInt4214, 0, anInt4221);
		}
		anInt4214 = -1;
		anInt4221 = -1;
		aByteBuffer12 = null;
		aByteBuffer11 = null;
		aClass15_Sub6_1 = null;
		aByteArray49 = null;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "()V")
	public static void method3568() {
		method3575();
		if (anInt4214 == -1 || anInt4221 != Static10.anInt142) {
			anInt4214 = Static121.method2153(Static121.anInt2520, aByteArray49);
			anInt4221 = Static10.anInt142;
		}
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "()V")
	public static void method3569() {
		if (aClass15_Sub6_1 != null) {
			return;
		}
		@Pc(10) Class15_Sub6 local10 = aClass15_Sub6_1 = new Class15_Sub6(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray383;
		@Pc(16) int[] local16 = local10.anIntArray382;
		@Pc(19) int[] local19 = local10.anIntArray381;
		@Pc(22) int[] local22 = local10.anIntArray377;
		@Pc(25) int[] local25 = local10.anIntArray380;
		@Pc(28) int[] local28 = local10.anIntArray375;
		local10.anInt4386 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class135.anIntArray335[local66] >> 1;
			@Pc(78) int local78 = Class135.anIntArray338[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class135.anIntArray338[local89] >> 9;
				local105 = (Class135.anIntArray335[local89] >> 1) * local72 >> 23;
				local115 = (Class135.anIntArray335[local89] >> 1) * local78 >> 23;
				local13[local10.anInt4386] = local115;
				local16[local10.anInt4386] = local95;
				local19[local10.anInt4386] = -local105;
				local10.anInt4386++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt4382] = 0;
				local25[local10.anInt4382] = local89;
				local28[local10.anInt4382] = local80;
				local10.anInt4382++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt4382] = local89;
					local25[local10.anInt4382] = local105;
					local28[local10.anInt4382] = local80;
					local10.anInt4382++;
					local22[local10.anInt4382] = local105;
					local25[local10.anInt4382] = local115;
					local28[local10.anInt4382] = local80;
					local10.anInt4382++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt4382] = local80;
				local25[local10.anInt4382] = local89;
				local28[local10.anInt4382] = 1;
				local10.anInt4382++;
			}
		}
		local10.anInt4384 = local10.anInt4386;
		local10.aByteArray64 = null;
		local10.aShortArray85 = null;
		local10.anIntArray386 = null;
		local10.anIntArray378 = null;
		local10.aByteArray58 = null;
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "()V")
	public static void method3575() {
		if (aByteArray49 != null) {
			return;
		}
		aByteArray49 = new byte[16384];
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
				aByteArray49[local27 + local33] = aByteArray49[local27 + local50] = aByteArray49[local31 + local33] = aByteArray49[local31 + local50] = (byte) local60;
			}
		}
	}
}
