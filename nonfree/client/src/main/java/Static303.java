import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer14;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer15;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!nb;")
	public static Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "[B")
	public static byte[] aByteArray185;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	private static int anInt5462 = -1;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "[I")
	public static int[] anIntArray600 = new int[4];

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt5474 = -1;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	public static void method4532() {
		if (aClass11_Sub5_1 != null) {
			return;
		}
		@Pc(10) Class11_Sub5 local10 = aClass11_Sub5_1 = new Class11_Sub5(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray365;
		@Pc(16) int[] local16 = local10.anIntArray370;
		@Pc(19) int[] local19 = local10.anIntArray364;
		@Pc(22) int[] local22 = local10.anIntArray363;
		@Pc(25) int[] local25 = local10.anIntArray366;
		@Pc(28) int[] local28 = local10.anIntArray362;
		local10.anInt3474 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class87.anIntArray173[local66] >> 1;
			@Pc(78) int local78 = Class87.anIntArray177[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class87.anIntArray177[local89] >> 9;
				local105 = (Class87.anIntArray173[local89] >> 1) * local72 >> 23;
				local115 = (Class87.anIntArray173[local89] >> 1) * local78 >> 23;
				local13[local10.anInt3474] = local115;
				local16[local10.anInt3474] = local95;
				local19[local10.anInt3474] = -local105;
				local10.anInt3474++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt3475] = 0;
				local25[local10.anInt3475] = local89;
				local28[local10.anInt3475] = local80;
				local10.anInt3475++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt3475] = local89;
					local25[local10.anInt3475] = local105;
					local28[local10.anInt3475] = local80;
					local10.anInt3475++;
					local22[local10.anInt3475] = local105;
					local25[local10.anInt3475] = local115;
					local28[local10.anInt3475] = local80;
					local10.anInt3475++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt3475] = local80;
				local25[local10.anInt3475] = local89;
				local28[local10.anInt3475] = 1;
				local10.anInt3475++;
			}
		}
		local10.anInt3473 = local10.anInt3474;
		local10.aByteArray118 = null;
		local10.aShortArray64 = null;
		local10.anIntArray361 = null;
		local10.anIntArray368 = null;
		local10.aByteArray117 = null;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	public static void method4535() {
		if (aByteArray185 != null) {
			return;
		}
		aByteArray185 = new byte[16384];
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
				aByteArray185[local27 + local33] = aByteArray185[local27 + local50] = aByteArray185[local31 + local33] = aByteArray185[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	public static void method4536() {
		if (anInt5474 != -1) {
			Static162.method2800(anInt5474, 0, anInt5462);
		}
		anInt5474 = -1;
		anInt5462 = -1;
		aByteBuffer14 = null;
		aByteBuffer15 = null;
		aClass11_Sub5_1 = null;
		aByteArray185 = null;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "()V")
	public static void method4545() {
		if (aByteBuffer14 != null) {
			return;
		}
		@Pc(6) Class1_Sub13 local6 = new Class1_Sub13(1088);
		@Pc(11) Class1_Sub13 local11 = new Class1_Sub13(5140);
		if (Static71.aBoolean168) {
			local11.method1881(0.0F);
			local11.method1881(1.0F);
			local11.method1881(0.0F);
			local11.method1881(0.5F);
			local11.method1881(1.0F);
			local11.method1881(0.0F);
			local11.method1881(-1.0F);
			local11.method1881(0.0F);
			local11.method1881(0.5F);
			local11.method1881(0.0F);
		} else {
			local11.method1848(0.0F);
			local11.method1848(1.0F);
			local11.method1848(0.0F);
			local11.method1848(0.5F);
			local11.method1848(1.0F);
			local11.method1848(0.0F);
			local11.method1848(-1.0F);
			local11.method1848(0.0F);
			local11.method1848(0.5F);
			local11.method1848(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class87.anIntArray173[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class87.anIntArray177[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class87.anIntArray177[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class87.anIntArray173[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class87.anIntArray173[local134] * local123 / 65535.0F;
				if (Static71.aBoolean168) {
					local11.method1881(local159);
					local11.method1881(local141);
					local11.method1881(local150);
					local11.method1881(local96);
					local11.method1881(local98);
				} else {
					local11.method1848(local159);
					local11.method1848(local141);
					local11.method1848(local150);
					local11.method1848(local96);
					local11.method1848(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static71.aBoolean168) {
					local6.method1835(0);
					local6.method1835(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1835(local134++);
						local6.method1835(local125++);
					}
					local6.method1835(1);
					local6.method1835(1);
				} else {
					local6.method1823(0);
					local6.method1823(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1823(local134++);
						local6.method1823(local125++);
					}
					local6.method1823(1);
					local6.method1823(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer14 = ByteBuffer.allocateDirect(local11.anInt2018);
		aByteBuffer14.put(local11.aByteArray63, 0, local11.anInt2018);
		aByteBuffer14.flip();
		aByteBuffer15 = ByteBuffer.allocateDirect(local6.anInt2018);
		aByteBuffer15.put(local6.aByteArray63, 0, local6.anInt2018);
		aByteBuffer15.flip();
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "()V")
	public static void method4546() {
		method4535();
		if (anInt5474 == -1 || anInt5462 != Static162.anInt3245) {
			anInt5474 = Static157.method2693(Static157.anInt3136, aByteArray185);
			anInt5462 = Static162.anInt3245;
		}
	}
}
