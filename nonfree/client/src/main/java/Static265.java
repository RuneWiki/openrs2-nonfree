import java.io.IOException;
import java.net.Socket;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static final int[] anIntArray314 = new int[4096];

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_22 = new Class63(1, 2, 2, 0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static561.method7329(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static238.anIntArrayArray36[arg0];
		@Pc(45) int local45 = arg4 - local15;
		Static437.method5735(arg4 - arg2, local40, local45, arg1);
		@Pc(58) int local58 = local15 + arg4;
		Static437.method5735(local45, local40, local58, arg5);
		Static437.method5735(local58, local40, arg4 + arg2, arg1);
		while (local10 < local24) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static535.anIntArray576[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(136) int[] local136;
			@Pc(143) int[] local143;
			@Pc(147) int local147;
			@Pc(152) int local152;
			@Pc(157) int local157;
			@Pc(161) int local161;
			@Pc(166) int local166;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local136 = Static238.anIntArrayArray36[arg0 + local24];
					local143 = Static238.anIntArrayArray36[arg0 - local24];
					local147 = Static535.anIntArray576[local24];
					local152 = arg4 + local10;
					local157 = arg4 - local10;
					local161 = local147 + arg4;
					local166 = arg4 - local147;
					Static437.method5735(local157, local136, local166, arg1);
					Static437.method5735(local166, local136, local161, arg5);
					Static437.method5735(local161, local136, local152, arg1);
					Static437.method5735(local157, local143, local166, arg1);
					Static437.method5735(local166, local143, local161, arg5);
					Static437.method5735(local161, local143, local152, arg1);
				} else {
					local136 = Static238.anIntArrayArray36[local24 + arg0];
					local143 = Static238.anIntArrayArray36[arg0 - local24];
					local147 = arg4 + local10;
					local152 = arg4 - local10;
					Static437.method5735(local152, local136, local147, arg1);
					Static437.method5735(local152, local143, local147, arg1);
				}
			}
			local136 = Static238.anIntArrayArray36[local10 + arg0];
			local143 = Static238.anIntArrayArray36[arg0 - local10];
			local147 = local24 + arg4;
			local152 = arg4 - local24;
			if (local10 >= local15) {
				Static437.method5735(local152, local136, local147, arg1);
				Static437.method5735(local152, local143, local147, arg1);
			} else {
				local157 = local29 < local10 ? Static535.anIntArray576[local10] : local29;
				local161 = local157 + arg4;
				local166 = arg4 - local157;
				Static437.method5735(local152, local136, local166, arg1);
				Static437.method5735(local166, local136, local161, arg5);
				Static437.method5735(local161, local136, local147, arg1);
				Static437.method5735(local152, local143, local166, arg1);
				Static437.method5735(local166, local143, local161, arg5);
				Static437.method5735(local161, local143, local147, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Z")
	public static boolean method3687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static525.method6782(arg1, arg0) | (arg0 & 0x2000) != 0 | Static245.method3480(arg0, arg1)) & Static125.method1730(arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method3688() {
		if (Static130.anInt2132 == 0) {
			return;
		}
		try {
			if (++Static561.anInt9175 > 2000) {
				if (Static529.aClass124_2 != null) {
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
				}
				if (Static565.anInt9250 >= 2) {
					Static372.anInt6216 = -5;
					Static130.anInt2132 = 0;
					return;
				}
				Static323.aClass292_3.method5908();
				Static565.anInt9250++;
				Static130.anInt2132 = 1;
				Static561.anInt9175 = 0;
			}
			if (Static130.anInt2132 == 1) {
				Static56.aClass5_2 = Static323.aClass292_3.method5912(Static169.aClass99_2);
				Static130.anInt2132 = 2;
			}
			if (Static130.anInt2132 == 2) {
				if (Static56.aClass5_2.anInt151 == 2) {
					throw new IOException();
				}
				if (Static56.aClass5_2.anInt151 != 1) {
					return;
				}
				Static529.aClass124_2 = Static421.method5638((Socket) Static56.aClass5_2.anObject1);
				Static56.aClass5_2 = null;
				Static509.method6612();
				Static130.anInt2132 = 4;
			}
			@Pc(116) int local116;
			if (Static130.anInt2132 == 4) {
				if (!Static529.aClass124_2.method2253(1)) {
					return;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				local116 = Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF;
				if (local116 != 21) {
					Static130.anInt2132 = 0;
					Static372.anInt6216 = local116;
					Static529.aClass124_2.method2256();
					Static529.aClass124_2 = null;
					return;
				}
				Static130.anInt2132 = 5;
			}
			if (Static130.anInt2132 == 5) {
				if (!Static529.aClass124_2.method2253(1)) {
					return;
				}
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, 1);
				Static164.aStringArray15 = new String[Static361.aClass2_Sub7_Sub2_1.aByteArray52[0] & 0xFF];
				Static130.anInt2132 = 6;
			}
			if (Static130.anInt2132 == 6 && Static529.aClass124_2.method2253(Static164.aStringArray15.length * 8)) {
				Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
				Static529.aClass124_2.method2250(0, Static361.aClass2_Sub7_Sub2_1.aByteArray52, Static164.aStringArray15.length * 8);
				for (local116 = 0; local116 < Static164.aStringArray15.length; local116++) {
					Static164.aStringArray15[local116] = Static100.method1511(Static361.aClass2_Sub7_Sub2_1.method4514());
				}
				Static130.anInt2132 = 0;
				Static372.anInt6216 = 21;
				Static529.aClass124_2.method2256();
				Static529.aClass124_2 = null;
			}
		} catch (@Pc(216) IOException local216) {
			if (Static529.aClass124_2 != null) {
				Static529.aClass124_2.method2256();
				Static529.aClass124_2 = null;
			}
			if (Static565.anInt9250 < 2) {
				Static323.aClass292_3.method5908();
				Static130.anInt2132 = 1;
				Static561.anInt9175 = 0;
				Static565.anInt9250++;
			} else {
				Static130.anInt2132 = 0;
				Static372.anInt6216 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
	public static int method3689(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
