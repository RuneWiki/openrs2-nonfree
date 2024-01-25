import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method3552() {
		for (@Pc(7) int local7 = 0; local7 < Static41.anInt759; local7++) {
			@Pc(13) int local13 = Static440.anIntArray543[local7];
			@Pc(17) Class16_Sub1_Sub5_Sub2 local17 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local13];
			@Pc(21) int local21 = Static146.aClass4_Sub12_Sub1_3.method2490();
			if ((local21 & 0x40) != 0) {
				local21 += Static146.aClass4_Sub12_Sub1_3.method2490() << 8;
			}
			@Pc(44) int local44;
			if ((local21 & 0x1000) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2523();
				@Pc(47) int[] local47 = new int[local44];
				@Pc(50) int[] local50 = new int[local44];
				@Pc(53) int[] local53 = new int[local44];
				for (@Pc(55) int local55 = 0; local55 < local44; local55++) {
					@Pc(61) int local61 = Static146.aClass4_Sub12_Sub1_3.method2536();
					if (local61 == 65535) {
						local61 = -1;
					}
					local47[local55] = local61;
					local50[local55] = Static146.aClass4_Sub12_Sub1_3.method2520();
					local53[local55] = Static146.aClass4_Sub12_Sub1_3.method2536();
				}
				Static259.method3758(local50, local17, local47, local53);
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass264_1.method5578()) {
					Static425.method5429(local17);
				}
				local17.method4766(Static329.aClass240_1.method5229(Static146.aClass4_Sub12_Sub1_3.method2536()));
				local17.method4754(local17.aClass264_1.anInt7201);
				local17.anInt6080 = local17.aClass264_1.anInt7221 << 3;
				if (local17.aClass264_1.method5578()) {
					Static126.method2264(local17.anIntArray426[0], local17, null, local17.anIntArray427[0], 0, local17.aByte82, null);
				}
			}
			@Pc(162) int local162;
			if ((local21 & 0x2) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2506();
				local162 = Static146.aClass4_Sub12_Sub1_3.method2520();
				local17.method4746(local44, Static24.anInt5323, local162);
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt6089 = Static146.aClass4_Sub12_Sub1_3.method2548();
				local17.anInt6095 = Static146.aClass4_Sub12_Sub1_3.method2538();
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt6043 = Static146.aClass4_Sub12_Sub1_3.method2534();
				local17.anInt6052 = Static146.aClass4_Sub12_Sub1_3.method2534();
				local17.anInt6044 = Static146.aClass4_Sub12_Sub1_3.method2507();
				local17.anInt6074 = Static146.aClass4_Sub12_Sub1_3.method2534();
				local17.anInt6018 = Static146.aClass4_Sub12_Sub1_3.method2536() + Static24.anInt5323;
				local17.anInt6023 = Static146.aClass4_Sub12_Sub1_3.method2548() + Static24.anInt5323;
				local17.lb = Static146.aClass4_Sub12_Sub1_3.method2489();
				local17.anInt6052 += local17.anIntArray427[0];
				local17.anInt6074 += local17.anIntArray427[0];
				local17.anInt6043 += local17.anIntArray426[0];
				local17.anInt6044 += local17.anIntArray426[0];
				local17.anInt6086 = 1;
				local17.anInt6087 = 0;
			}
			@Pc(294) int local294;
			if ((local21 & 0x800) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local162 = Static146.aClass4_Sub12_Sub1_3.method2491();
				if (local44 == 65535) {
					local44 = -1;
				}
				local294 = Static146.aClass4_Sub12_Sub1_3.method2489();
				local17.method4748(local294, local162, true, local44);
			}
			if ((local21 & 0x4) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2538();
				if (local44 == 65535) {
					local44 = -1;
				}
				local162 = Static146.aClass4_Sub12_Sub1_3.method2489();
				Static33.method632(local44, local162, local17);
			}
			if ((local21 & 0x2000) != 0) {
				local17.aByte71 = Static146.aClass4_Sub12_Sub1_3.method2549();
				local17.aByte69 = Static146.aClass4_Sub12_Sub1_3.method2549();
				local17.aByte70 = Static146.aClass4_Sub12_Sub1_3.method2549();
				local17.aByte68 = (byte) Static146.aClass4_Sub12_Sub1_3.method2523();
				local17.anInt6020 = Static24.anInt5323 + Static146.aClass4_Sub12_Sub1_3.method2515();
				local17.anInt6068 = Static24.anInt5323 + Static146.aClass4_Sub12_Sub1_3.method2536();
			}
			if ((local21 & 0x1) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2548();
				if (local44 == 65535) {
					local44 = -1;
				}
				local162 = Static146.aClass4_Sub12_Sub1_3.method2510();
				local294 = Static146.aClass4_Sub12_Sub1_3.method2489();
				local17.method4748(local294, local162, false, local44);
			}
			if ((local21 & 0x200) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2515();
				local17.anInt6051 = Static146.aClass4_Sub12_Sub1_3.method2520();
				local17.anInt6054 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local17.anInt6041 = local44 & 0x7FFF;
				local17.aBoolean559 = (local44 & 0x8000) != 0;
				local17.anInt6035 = local17.anInt6051 + Static24.anInt5323 + local17.anInt6041;
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt6034 = Static146.aClass4_Sub12_Sub1_3.method2548();
				if (local17.anInt6034 == 65535) {
					local17.anInt6034 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local17.aString60 = Static146.aClass4_Sub12_Sub1_3.method2537();
				local17.anInt6077 = 100;
			}
			if ((local21 & 0x20) != 0) {
				local44 = Static146.aClass4_Sub12_Sub1_3.method2506();
				local162 = Static146.aClass4_Sub12_Sub1_3.method2520();
				local17.method4746(local44, Static24.anInt5323, local162);
				local17.anInt6072 = Static24.anInt5323 + 300;
				local17.anInt6026 = Static146.aClass4_Sub12_Sub1_3.method2520();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public static void method3555() {
		for (@Pc(3) int local3 = 0; local3 < Static79.aByteArrayArrayArray2.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static79.aByteArrayArrayArray2[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static79.aByteArrayArrayArray2[0][0].length; local11++) {
					Static79.aByteArrayArrayArray2[local3][local7][local11] = 0;
				}
			}
		}
	}
}
