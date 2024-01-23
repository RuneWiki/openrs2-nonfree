import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!pn;")
	public static Class12_Sub7 aClass12_Sub7_1;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "[B")
	public static byte[] aByteArray31;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public static int anInt2671 = -1;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	private static int anInt2672 = -1;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
	public static int[] anIntArray241 = new int[4];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
	public static void method2064() {
		if (aClass12_Sub7_1 != null) {
			return;
		}
		@Pc(10) Class12_Sub7 local10 = aClass12_Sub7_1 = new Class12_Sub7(260, 480, 0);
		@Pc(13) int[] local13 = local10.anIntArray371;
		@Pc(16) int[] local16 = local10.anIntArray369;
		@Pc(19) int[] local19 = local10.anIntArray363;
		@Pc(22) int[] local22 = local10.anIntArray372;
		@Pc(25) int[] local25 = local10.anIntArray365;
		@Pc(28) int[] local28 = local10.anIntArray367;
		local10.anInt4094 = 2;
		local13[0] = 0;
		local16[0] = 128;
		local19[0] = 0;
		local13[1] = 0;
		local16[1] = -128;
		local19[1] = 0;
		for (@Pc(57) int local57 = 0; local57 <= 16; local57++) {
			@Pc(66) int local66 = local57 * 1024 / 16;
			@Pc(72) int local72 = Class131.anIntArray355[local66] >> 1;
			@Pc(78) int local78 = Class131.anIntArray353[local66] >> 1;
			@Pc(80) int local80;
			@Pc(89) int local89;
			@Pc(95) int local95;
			@Pc(105) int local105;
			@Pc(115) int local115;
			for (local80 = 1; local80 < 16; local80++) {
				local89 = local80 * 1024 / 16;
				local95 = Class131.anIntArray353[local89] >> 9;
				local105 = (Class131.anIntArray355[local89] >> 1) * local72 >> 23;
				local115 = (Class131.anIntArray355[local89] >> 1) * local78 >> 23;
				local13[local10.anInt4094] = local115;
				local16[local10.anInt4094] = local95;
				local19[local10.anInt4094] = -local105;
				local10.anInt4094++;
			}
			if (local57 > 0) {
				local80 = local57 * 15 + 2;
				local89 = local80 - 15;
				local22[local10.anInt4096] = 0;
				local25[local10.anInt4096] = local89;
				local28[local10.anInt4096] = local80;
				local10.anInt4096++;
				for (local95 = 1; local95 < 15; local95++) {
					local105 = local89 + 1;
					local115 = local80 + 1;
					local22[local10.anInt4096] = local89;
					local25[local10.anInt4096] = local105;
					local28[local10.anInt4096] = local80;
					local10.anInt4096++;
					local22[local10.anInt4096] = local105;
					local25[local10.anInt4096] = local115;
					local28[local10.anInt4096] = local80;
					local10.anInt4096++;
					local89 = local105;
					local80 = local115;
				}
				local22[local10.anInt4096] = local80;
				local25[local10.anInt4096] = local89;
				local28[local10.anInt4096] = 1;
				local10.anInt4096++;
			}
		}
		local10.anInt4097 = local10.anInt4094;
		local10.aByteArray55 = null;
		local10.aShortArray68 = null;
		local10.anIntArray368 = null;
		local10.anIntArray361 = null;
		local10.aByteArray53 = null;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "()V")
	public static void method2071() {
		aByteBuffer6 = null;
		aByteBuffer5 = null;
		aClass12_Sub7_1 = null;
		aByteArray31 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "()V")
	public static void method2074() {
		if (aByteBuffer6 != null) {
			return;
		}
		@Pc(6) Class4_Sub17 local6 = new Class4_Sub17(1088);
		@Pc(11) Class4_Sub17 local11 = new Class4_Sub17(5140);
		if (Static178.aBoolean232) {
			local11.method1886(0.0F);
			local11.method1886(1.0F);
			local11.method1886(0.0F);
			local11.method1886(0.5F);
			local11.method1886(1.0F);
			local11.method1886(0.0F);
			local11.method1886(-1.0F);
			local11.method1886(0.0F);
			local11.method1886(0.5F);
			local11.method1886(0.0F);
		} else {
			local11.method1895(0.0F);
			local11.method1895(1.0F);
			local11.method1895(0.0F);
			local11.method1895(0.5F);
			local11.method1895(1.0F);
			local11.method1895(0.0F);
			local11.method1895(-1.0F);
			local11.method1895(0.0F);
			local11.method1895(0.5F);
			local11.method1895(0.0F);
		}
		@Pc(96) float local96 = 0.0F;
		@Pc(98) float local98 = 0.05882353F;
		for (@Pc(100) int local100 = 0; local100 <= 16; local100++) {
			@Pc(109) int local109 = local100 * 1024 / 16;
			@Pc(116) float local116 = (float) Class131.anIntArray355[local109] / 65535.0F;
			@Pc(123) float local123 = (float) Class131.anIntArray353[local109] / 65535.0F;
			@Pc(125) int local125;
			@Pc(134) int local134;
			for (local125 = 1; local125 < 16; local125++) {
				local134 = local125 * 1024 / 16;
				@Pc(141) float local141 = (float) Class131.anIntArray353[local134] / 65535.0F;
				@Pc(150) float local150 = (float) Class131.anIntArray355[local134] * local116 / 65535.0F;
				@Pc(159) float local159 = (float) Class131.anIntArray355[local134] * local123 / 65535.0F;
				if (Static178.aBoolean232) {
					local11.method1886(local159);
					local11.method1886(local141);
					local11.method1886(local150);
					local11.method1886(local96);
					local11.method1886(local98);
				} else {
					local11.method1895(local159);
					local11.method1895(local141);
					local11.method1895(local150);
					local11.method1895(local96);
					local11.method1895(local98);
				}
				local98 += 0.05882353F;
			}
			if (local100 > 0) {
				local125 = local100 * 15 + 2;
				local134 = local125 - 15;
				@Pc(232) int local232;
				if (Static178.aBoolean232) {
					local6.method1875(0);
					local6.method1875(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1875(local134++);
						local6.method1875(local125++);
					}
					local6.method1875(1);
					local6.method1875(1);
				} else {
					local6.method1836(0);
					local6.method1836(0);
					for (local232 = 1; local232 < 16; local232++) {
						local6.method1836(local134++);
						local6.method1836(local125++);
					}
					local6.method1836(1);
					local6.method1836(1);
				}
			}
			local96 += 0.05882353F;
			local98 = 0.05882353F;
		}
		aByteBuffer6 = ByteBuffer.allocateDirect(local11.anInt2400);
		aByteBuffer6.put(local11.aByteArray30, 0, local11.anInt2400);
		aByteBuffer6.flip();
		aByteBuffer5 = ByteBuffer.allocateDirect(local6.anInt2400);
		aByteBuffer5.put(local6.aByteArray30, 0, local6.anInt2400);
		aByteBuffer5.flip();
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "()V")
	public static void method2077() {
		if (aByteArray31 != null) {
			return;
		}
		aByteArray31 = new byte[16384];
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
				aByteArray31[local27 + local33] = aByteArray31[local27 + local50] = aByteArray31[local31 + local33] = aByteArray31[local31 + local50] = (byte) local60;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "()V")
	public static void method2080() {
		if (anInt2671 != -1) {
			Static163.method2523(anInt2671, 0, anInt2672);
		}
		anInt2671 = -1;
		anInt2672 = -1;
		aByteBuffer6 = null;
		aByteBuffer5 = null;
		aClass12_Sub7_1 = null;
		aByteArray31 = null;
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "()V")
	public static void method2082() {
		method2077();
		if (anInt2671 == -1 || anInt2672 != Static163.anInt3218) {
			anInt2671 = Static144.method2322(Static144.anInt2936, aByteArray31);
			anInt2672 = Static163.anInt3218;
		}
	}
}
