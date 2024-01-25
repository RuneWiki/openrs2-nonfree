import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
	public static int anInt2747;

	@OriginalMember(owner = "client!efa", name = "K", descriptor = "Lclient!tf;")
	public static Class322 aClass322_43;

	@OriginalMember(owner = "client!efa", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg4 && arg8 == arg1 && arg0 == arg3 && arg2 == arg5) {
			Static9.method3876(arg6, arg0, arg7, arg5, arg8);
			return;
		}
		@Pc(45) int local45 = arg7;
		@Pc(47) int local47 = arg8;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg4 * 3;
		@Pc(63) int local63 = arg1 * 3;
		@Pc(67) int local67 = arg3 * 3;
		@Pc(71) int local71 = arg2 * 3;
		@Pc(79) int local79 = arg0 + local59 - local67 - arg7;
		@Pc(89) int local89 = local63 + arg5 - local71 - arg8;
		@Pc(98) int local98 = local51 + local67 - local59 - local59;
		@Pc(107) int local107 = local55 + local71 - local63 - local63;
		@Pc(111) int local111 = local59 - local51;
		@Pc(116) int local116 = local63 - local55;
		for (@Pc(118) int local118 = 128; local118 <= 4096; local118 += 128) {
			@Pc(126) int local126 = local118 * local118 >> 12;
			@Pc(132) int local132 = local118 * local126 >> 12;
			@Pc(136) int local136 = local79 * local132;
			@Pc(140) int local140 = local89 * local132;
			@Pc(144) int local144 = local98 * local126;
			@Pc(148) int local148 = local107 * local126;
			@Pc(152) int local152 = local111 * local118;
			@Pc(156) int local156 = local118 * local116;
			@Pc(167) int local167 = (local152 + local136 + local144 >> 12) + arg7;
			@Pc(178) int local178 = (local148 + local140 + local156 >> 12) + arg8;
			Static9.method3876(arg6, local167, local45, local178, local47);
			local47 = local178;
			local45 = local167;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V")
	public static void method2463(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static506.anInt8251 - Static537.anInt8622;
		if (local8 >= 100) {
			Static379.anInt6482 = 1;
			Static391.anInt6856 = -1;
			Static18.anInt314 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static126.aFloat84;
		if (Static504.anInt8194 >> 8 > local21) {
			local21 = Static504.anInt8194 >> 8;
		}
		if (Static350.aBooleanArray20[4] && local21 < Static99.anIntArray93[4] + 128) {
			local21 = Static99.anIntArray93[4] + 128;
		}
		@Pc(63) int local63 = (int) Static43.aFloat20 + Static36.anInt654 & 0x3FFF;
		Static214.method3434(Static475.method6537(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442, Static117.anInt2694, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444) - 200, Static205.anInt3767, Static18.anInt315, local21, (local21 >> 3) * 3 + 600 << 2, local63, arg0);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static461.anInt7704 = (int) ((float) Static73.anInt1695 + (float) (Static461.anInt7704 - Static73.anInt1695) * local107);
		Static494.anInt8029 = (int) ((float) Static207.anInt3795 + local107 * (float) (Static494.anInt8029 - Static207.anInt3795));
		Static226.anInt3984 = (int) (local107 * (float) (Static226.anInt3984 - Static220.anInt3921) + (float) Static220.anInt3921);
		Static350.anInt6080 = (int) (local107 * (float) (Static350.anInt6080 - Static6.anInt137) + (float) Static6.anInt137);
		@Pc(158) int local158 = Static333.anInt5565 - anInt2747;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static333.anInt5565 = (int) ((float) anInt2747 + (float) local158 * local107);
		Static333.anInt5565 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BILjava/io/File;)[B")
	public static byte[] method2464(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static390.method5746(arg1, arg0, local11);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)V")
	public static void method2465() {
		if (Static32.anInt602 == 9) {
			Static25.method439(5);
		} else if (Static32.anInt602 == 5 || Static32.anInt602 == 6) {
			Static25.method439(3);
		} else if (Static32.anInt602 == 12) {
			Static25.method439(3);
		}
	}
}
