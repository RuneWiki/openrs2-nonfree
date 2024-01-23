import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!ml;")
	public static Class53_Sub3 aClass53_Sub3_1;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[B")
	public static byte[] aByteArray29;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
	public static int[] anIntArray256 = new int[4];

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	private static int anInt2857 = -1;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	public static int anInt2868 = -1;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()V")
	public static void method2302() {
		if (aByteArray29 != null) {
			return;
		}
		aByteArray29 = new byte[16384];
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
				aByteArray29[local27 + local33] = aByteArray29[local27 + local50] = aByteArray29[local31 + local33] = aByteArray29[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()V")
	public static void method2303() {
		if (aClass53_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class53_Sub3 local10 = aClass53_Sub3_1 = new Class53_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray329;
		@Pc(16) int[] local16 = local10.anIntArray324;
		@Pc(19) int[] local19 = local10.anIntArray326;
		@Pc(22) int[] local22 = local10.anIntArray331;
		@Pc(25) int[] local25 = local10.anIntArray330;
		@Pc(28) int[] local28 = local10.anIntArray332;
		local10.anInt3356 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class111.anIntArray299[local66] >> 1;
			@Pc(78) int local78 = Class111.anIntArray298[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class111.anIntArray298[local89] >> 9;
				local105 = (Class111.anIntArray299[local89] >> 1) * local72 >> 23;
				local115 = (Class111.anIntArray299[local89] >> 1) * local78 >> 23;
				local13[local10.anInt3356] = local115;
				local16[local10.anInt3356] = local95;
				local19[local10.anInt3356] = -local105;
				local10.anInt3356++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt3353] = 0;
				local25[local10.anInt3353] = local89;
				local28[local10.anInt3353] = local80;
				local10.anInt3353++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt3353] = local89;
					local25[local10.anInt3353] = local105;
					local28[local10.anInt3353] = local80;
					local10.anInt3353++;
					local22[local10.anInt3353] = local105;
					local25[local10.anInt3353] = local115;
					local28[local10.anInt3353] = local80;
					local10.anInt3353++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt3353] = local80;
				local25[local10.anInt3353] = local89;
				local28[local10.anInt3353] = 1;
				local10.anInt3353++;
			}
		}
		local10.anInt3355 = local10.anInt3356;
		local10.aByteArray35 = null;
		local10.aShortArray51 = null;
		local10.anIntArray325 = null;
		local10.anIntArray323 = null;
		local10.aByteArray37 = null;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()V")
	public static void method2304() {
		if (aByteBuffer9 != null) {
			return;
		}
		@Pc(6) Class4_Sub10 local6 = new Class4_Sub10(1088);
		@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(5140);
		if (Static94.aBoolean126) {
			local11.method4641(0.0F);
			local11.method4641(1.0F);
			local11.method4641(0.0F);
			local11.method4641(0.5F);
			local11.method4641(1.0F);
			local11.method4641(0.0F);
			local11.method4641(-1.0F);
			local11.method4641(0.0F);
			local11.method4641(0.5F);
			local11.method4641(0.0F);
		} else {
			local11.method4669(0.0F);
			local11.method4669(1.0F);
			local11.method4669(0.0F);
			local11.method4669(0.5F);
			local11.method4669(1.0F);
			local11.method4669(0.0F);
			local11.method4669(-1.0F);
			local11.method4669(0.0F);
			local11.method4669(0.5F);
			local11.method4669(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class111.anIntArray299[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class111.anIntArray298[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class111.anIntArray298[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class111.anIntArray299[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class111.anIntArray299[local134] * local123 / 65535.0F;
				if (Static94.aBoolean126) {
					local11.method4641(local159);
					local11.method4641(local141);
					local11.method4641(local150);
					local11.method4641(local96);
					local11.method4641(local98);
				} else {
					local11.method4669(local159);
					local11.method4669(local141);
					local11.method4669(local150);
					local11.method4669(local96);
					local11.method4669(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static94.aBoolean126) {
					local6.method4668(0);
					local6.method4668(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method4668(local134++);
						local6.method4668(local125++);
					}
					local6.method4668(1);
					local6.method4668(1);
				} else {
					local6.method4640(0);
					local6.method4640(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method4640(local134++);
						local6.method4640(local125++);
					}
					local6.method4640(1);
					local6.method4640(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer9 = ByteBuffer.allocateDirect(local11.anInt5713);
		aByteBuffer9.put(local11.aByteArray71, 0, local11.anInt5713);
		aByteBuffer9.flip();
		aByteBuffer10 = ByteBuffer.allocateDirect(local6.anInt5713);
		aByteBuffer10.put(local6.aByteArray71, 0, local6.anInt5713);
		aByteBuffer10.flip();
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "()V")
	public static void method2310() {
		if (anInt2868 != -1) {
			Static173.method2733(anInt2868, 0, anInt2857);
		}
		anInt2868 = -1;
		anInt2857 = -1;
		aByteBuffer9 = null;
		aByteBuffer10 = null;
		aClass53_Sub3_1 = null;
		aByteArray29 = null;
	}

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "()V")
	public static void method2312() {
		method2302();
		if (anInt2868 == -1 || anInt2857 != Static173.anInt3332) {
			anInt2868 = Static267.method4210(Static267.anInt5143, aByteArray29);
			anInt2857 = Static173.anInt3332;
		}
	}
}
