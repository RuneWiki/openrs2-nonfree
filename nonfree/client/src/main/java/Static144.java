import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Lclient!gd;")
	public static Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[B")
	public static byte[] aByteArray51;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "[I")
	public static int[] anIntArray334 = new int[4];

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	public static int anInt2669 = -1;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private static int anInt2673 = -1;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
	public static void method2253() {
		if (aClass6_Sub3_1 != null) {
			return;
		}
		@Pc(10) Class6_Sub3 local10 = aClass6_Sub3_1 = new Class6_Sub3(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray216;
		@Pc(16) int[] local16 = local10.anIntArray209;
		@Pc(19) int[] local19 = local10.anIntArray217;
		@Pc(22) int[] local22 = local10.anIntArray211;
		@Pc(25) int[] local25 = local10.anIntArray213;
		@Pc(28) int[] local28 = local10.anIntArray215;
		local10.anInt1644 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class135.anIntArray472[local66] >> 1;
			@Pc(78) int local78 = Class135.anIntArray474[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class135.anIntArray474[local89] >> 9;
				local105 = (Class135.anIntArray472[local89] >> 1) * local72 >> 23;
				local115 = (Class135.anIntArray472[local89] >> 1) * local78 >> 23;
				local13[local10.anInt1644] = local115;
				local16[local10.anInt1644] = local95;
				local19[local10.anInt1644] = -local105;
				local10.anInt1644++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt1640] = 0;
				local25[local10.anInt1640] = local89;
				local28[local10.anInt1640] = local80;
				local10.anInt1640++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt1640] = local89;
					local25[local10.anInt1640] = local105;
					local28[local10.anInt1640] = local80;
					local10.anInt1640++;
					local22[local10.anInt1640] = local105;
					local25[local10.anInt1640] = local115;
					local28[local10.anInt1640] = local80;
					local10.anInt1640++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt1640] = local80;
				local25[local10.anInt1640] = local89;
				local28[local10.anInt1640] = 1;
				local10.anInt1640++;
			}
		}
		local10.anInt1642 = local10.anInt1644;
		local10.aByteArray27 = null;
		local10.aShortArray32 = null;
		local10.anIntArray210 = null;
		local10.anIntArray219 = null;
		local10.aByteArray28 = null;
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "()V")
	public static void method2260() {
		if (aByteBuffer8 != null) {
			return;
		}
		@Pc(6) Class1_Sub18 local6 = new Class1_Sub18(1088);
		@Pc(11) Class1_Sub18 local11 = new Class1_Sub18(5140);
		if (Static240.aBoolean379) {
			local11.method3066(0.0F);
			local11.method3066(1.0F);
			local11.method3066(0.0F);
			local11.method3066(0.5F);
			local11.method3066(1.0F);
			local11.method3066(0.0F);
			local11.method3066(-1.0F);
			local11.method3066(0.0F);
			local11.method3066(0.5F);
			local11.method3066(0.0F);
		} else {
			local11.method3088(0.0F);
			local11.method3088(1.0F);
			local11.method3088(0.0F);
			local11.method3088(0.5F);
			local11.method3088(1.0F);
			local11.method3088(0.0F);
			local11.method3088(-1.0F);
			local11.method3088(0.0F);
			local11.method3088(0.5F);
			local11.method3088(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class135.anIntArray472[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class135.anIntArray474[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class135.anIntArray474[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class135.anIntArray472[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class135.anIntArray472[local134] * local123 / 65535.0F;
				if (Static240.aBoolean379) {
					local11.method3066(local159);
					local11.method3066(local141);
					local11.method3066(local150);
					local11.method3066(local96);
					local11.method3066(local98);
				} else {
					local11.method3088(local159);
					local11.method3088(local141);
					local11.method3088(local150);
					local11.method3088(local96);
					local11.method3088(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static240.aBoolean379) {
					local6.method3123(0);
					local6.method3123(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method3123(local134++);
						local6.method3123(local125++);
					}
					local6.method3123(1);
					local6.method3123(1);
				} else {
					local6.method3114(0);
					local6.method3114(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method3114(local134++);
						local6.method3114(local125++);
					}
					local6.method3114(1);
					local6.method3114(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer8 = ByteBuffer.allocateDirect(local11.anInt3911);
		aByteBuffer8.put(local11.aByteArray71, 0, local11.anInt3911);
		aByteBuffer8.flip();
		aByteBuffer9 = ByteBuffer.allocateDirect(local6.anInt3911);
		aByteBuffer9.put(local6.aByteArray71, 0, local6.anInt3911);
		aByteBuffer9.flip();
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "()V")
	public static void method2264() {
		method2272();
		if (anInt2669 == -1 || anInt2673 != Static154.anInt2852) {
			anInt2669 = Static231.method3698(Static231.anInt4848, aByteArray51);
			anInt2673 = Static154.anInt2852;
		}
	}

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "()V")
	public static void method2269() {
		if (anInt2669 != -1) {
			Static154.method2373(anInt2669, 0, anInt2673);
		}
		anInt2669 = -1;
		anInt2673 = -1;
		aByteBuffer8 = null;
		aByteBuffer9 = null;
		aClass6_Sub3_1 = null;
		aByteArray51 = null;
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "()V")
	public static void method2272() {
		if (aByteArray51 != null) {
			return;
		}
		aByteArray51 = new byte[16384];
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
				aByteArray51[local27 + local33] = aByteArray51[local27 + local50] = aByteArray51[local31 + local33] = aByteArray51[local31 + local50] = (byte) local60;
			}
		}
	}
}
