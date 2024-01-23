import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt3184;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "Lclient!cc;")
	public static Class22 aClass22_14;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public static int anInt3185;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!dh;")
	public static Class33 aClass33_28 = new Class33(5);

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString107 = "flash1:";

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "[I")
	public static int[] anIntArray286 = new int[100];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method2500() {
		anIntArray286 = null;
		aClass22_14 = null;
		aString107 = null;
		aClass33_28 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I")
	public static int method2501(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		@Pc(43) double local43 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		if (local14 < local23) {
			local34 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local34 + local32) / 2.0D;
		if (local32 != local34) {
			if (local71 < 0.5D) {
				local65 = (local34 - local32) / (local32 + local34);
			}
			if (local14 == local34) {
				local43 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local43 = (local30 - local14) / (-local32 + local34) + 2.0D;
			} else if (local30 == local34) {
				local43 = (local14 - local23) / (local34 - local32) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local65 = (local34 - local32) / (2.0D - local32 - local34);
			}
		}
		local43 /= 6.0D;
		@Pc(164) int local164 = (int) (local65 * 256.0D);
		@Pc(169) int local169 = (int) (local43 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		@Pc(188) int local188 = (int) (local71 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local164 >>= 0x4;
		} else if (local188 > 217) {
			local164 >>= 0x3;
		} else if (local188 > 192) {
			local164 >>= 0x2;
		} else if (local188 > 179) {
			local164 >>= 0x1;
		}
		return (local188 >> 1) + (local164 >> 5 << 7) + (local169 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIZZFI)[[I")
	public static int[][] method2502(@OriginalArg(7) float arg0) {
		@Pc(9) Class4_Sub6_Sub2 local9 = new Class4_Sub6_Sub2();
		@Pc(13) int[][] local13 = new int[256][64];
		local9.anInt413 = 3;
		local9.anInt417 = 8;
		local9.anInt411 = (int) (arg0 * 4096.0F);
		local9.aBoolean27 = false;
		local9.anInt408 = 4;
		local9.method4370();
		Static147.method2365(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local9.method354(local47, local13[local47]);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)[Lclient!bi;")
	public static Class4_Sub2_Sub1[] method2503() {
		@Pc(8) Class4_Sub2_Sub1[] local8 = new Class4_Sub2_Sub1[Static84.anInt1699];
		for (@Pc(10) int local10 = 0; local10 < Static84.anInt1699; local10++) {
			@Pc(25) int local25 = Static159.anIntArray285[local10] * Static46.anIntArray120[local10];
			@Pc(29) byte[] local29 = Static274.aByteArrayArray20[local10];
			if (Static296.aBooleanArray13[local10]) {
				@Pc(110) byte[] local110 = Static239.aByteArrayArray18[local10];
				@Pc(113) int[] local113 = new int[local25];
				for (@Pc(115) int local115 = 0; local115 < local25; local115++) {
					local113[local115] = Static6.anIntArray14[local29[local115] & 0xFF] | (local110[local115] & 0xFF) << 24;
				}
				if (Static178.aBoolean216) {
					local8[local10] = new Class4_Sub2_Sub1_Sub2_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local113);
				} else {
					local8[local10] = new Class4_Sub2_Sub1_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local113);
				}
			} else {
				@Pc(36) int[] local36 = new int[local25];
				for (@Pc(38) int local38 = 0; local38 < local25; local38++) {
					local36[local38] = Static6.anIntArray14[local29[local38] & 0xFF];
				}
				if (Static178.aBoolean216) {
					local8[local10] = new Class4_Sub2_Sub1_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local36);
				} else {
					local8[local10] = new Class4_Sub2_Sub1_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local10], Static100.anIntArray223[local10], Static159.anIntArray285[local10], Static46.anIntArray120[local10], local36);
				}
			}
		}
		Static268.method4006();
		return local8;
	}
}
