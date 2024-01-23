import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer11;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[B")
	public static byte[] aByteArray35;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "Lclient!tf;")
	public static Class36_Sub6 aClass36_Sub6_1;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	private static int anInt4004 = -1;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "[I")
	public static int[] anIntArray326 = new int[4];

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
	public static int anInt4007 = -1;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
	public static void method3218() {
		if (aClass36_Sub6_1 != null) {
			return;
		}
		@Pc(10) Class36_Sub6 local10 = aClass36_Sub6_1 = new Class36_Sub6(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray454;
		@Pc(16) int[] local16 = local10.anIntArray450;
		@Pc(19) int[] local19 = local10.anIntArray455;
		@Pc(22) int[] local22 = local10.anIntArray452;
		@Pc(25) int[] local25 = local10.anIntArray461;
		@Pc(28) int[] local28 = local10.anIntArray459;
		local10.anInt5036 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class66.anIntArray148[local66] >> 1;
			@Pc(78) int local78 = Class66.anIntArray153[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class66.anIntArray153[local89] >> 9;
				local105 = (Class66.anIntArray148[local89] >> 1) * local72 >> 23;
				local115 = (Class66.anIntArray148[local89] >> 1) * local78 >> 23;
				local13[local10.anInt5036] = local115;
				local16[local10.anInt5036] = local95;
				local19[local10.anInt5036] = -local105;
				local10.anInt5036++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt5033] = 0;
				local25[local10.anInt5033] = local89;
				local28[local10.anInt5033] = local80;
				local10.anInt5033++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt5033] = local89;
					local25[local10.anInt5033] = local105;
					local28[local10.anInt5033] = local80;
					local10.anInt5033++;
					local22[local10.anInt5033] = local105;
					local25[local10.anInt5033] = local115;
					local28[local10.anInt5033] = local80;
					local10.anInt5033++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt5033] = local80;
				local25[local10.anInt5033] = local89;
				local28[local10.anInt5033] = 1;
				local10.anInt5033++;
			}
		}
		local10.anInt5037 = local10.anInt5036;
		local10.aByteArray65 = null;
		local10.aShortArray72 = null;
		local10.anIntArray458 = null;
		local10.anIntArray457 = null;
		local10.aByteArray64 = null;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()V")
	public static void method3219() {
		if (aByteBuffer12 != null) {
			return;
		}
		@Pc(6) Class2_Sub26 local6 = new Class2_Sub26(1088);
		@Pc(11) Class2_Sub26 local11 = new Class2_Sub26(5140);
		if (Static60.aBoolean114) {
			local11.method4266(0.0F);
			local11.method4266(1.0F);
			local11.method4266(0.0F);
			local11.method4266(0.5F);
			local11.method4266(1.0F);
			local11.method4266(0.0F);
			local11.method4266(-1.0F);
			local11.method4266(0.0F);
			local11.method4266(0.5F);
			local11.method4266(0.0F);
		} else {
			local11.method4244(0.0F);
			local11.method4244(1.0F);
			local11.method4244(0.0F);
			local11.method4244(0.5F);
			local11.method4244(1.0F);
			local11.method4244(0.0F);
			local11.method4244(-1.0F);
			local11.method4244(0.0F);
			local11.method4244(0.5F);
			local11.method4244(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class66.anIntArray148[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class66.anIntArray153[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class66.anIntArray153[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class66.anIntArray148[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class66.anIntArray148[local134] * local123 / 65535.0F;
				if (Static60.aBoolean114) {
					local11.method4266(local159);
					local11.method4266(local141);
					local11.method4266(local150);
					local11.method4266(local96);
					local11.method4266(local98);
				} else {
					local11.method4244(local159);
					local11.method4244(local141);
					local11.method4244(local150);
					local11.method4244(local96);
					local11.method4244(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static60.aBoolean114) {
					local6.method4231(0);
					local6.method4231(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method4231(local134++);
						local6.method4231(local125++);
					}
					local6.method4231(1);
					local6.method4231(1);
				} else {
					local6.method4230(0);
					local6.method4230(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method4230(local134++);
						local6.method4230(local125++);
					}
					local6.method4230(1);
					local6.method4230(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer12 = ByteBuffer.allocateDirect(local11.anInt5328);
		aByteBuffer12.put(local11.aByteArray72, 0, local11.anInt5328);
		aByteBuffer12.flip();
		aByteBuffer11 = ByteBuffer.allocateDirect(local6.anInt5328);
		aByteBuffer11.put(local6.aByteArray72, 0, local6.anInt5328);
		aByteBuffer11.flip();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
	public static void method3224() {
		if (aByteArray35 != null) {
			return;
		}
		aByteArray35 = new byte[16384];
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
				aByteArray35[local27 + local33] = aByteArray35[local27 + local50] = aByteArray35[local31 + local33] = aByteArray35[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "()V")
	public static void method3227() {
		method3224();
		if (anInt4007 == -1 || anInt4004 != Static256.anInt5185) {
			anInt4007 = Static48.method982(Static48.anInt1127, aByteArray35);
			anInt4004 = Static256.anInt5185;
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "()V")
	public static void method3232() {
		if (anInt4007 != -1) {
			Static256.method4129(anInt4007, 0, anInt4004);
		}
		anInt4007 = -1;
		anInt4004 = -1;
		aByteBuffer12 = null;
		aByteBuffer11 = null;
		aClass36_Sub6_1 = null;
		aByteArray35 = null;
	}
}
