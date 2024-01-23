import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	public static int anInt5003;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	public static int anInt5001 = -1;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public static int anInt5002 = 0;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public static int anInt5005 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public static void method4178() {
		if (Static54.aBoolean118) {
			return;
		}
		Static167.aBoolean68 = true;
		if (Static240.aBoolean404) {
			Static8.aFloat4 = (int) Static8.aFloat4 - 17 & 0xFFFFFFF0;
		} else {
			Static241.aFloat81 += (-12.0F - Static241.aFloat81) / 2.0F;
		}
		Static54.aBoolean118 = true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public static void method4179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 0;
		Static103.method1978(arg0, arg3 + arg1, arg1 - arg3, Static40.anIntArrayArray6[arg2]);
		@Pc(30) int local30 = arg3;
		@Pc(33) int local33 = -arg3;
		@Pc(35) int local35 = -1;
		while (local30 > local16) {
			local35 += 2;
			local33 += local35;
			local16++;
			if (local33 >= 0) {
				local30--;
				local33 -= local30 << 1;
				@Pc(60) int[] local60 = Static40.anIntArrayArray6[arg2 + local30];
				@Pc(67) int[] local67 = Static40.anIntArrayArray6[arg2 - local30];
				@Pc(71) int local71 = arg1 - local16;
				@Pc(76) int local76 = arg1 + local16;
				Static103.method1978(arg0, local76, local71, local60);
				Static103.method1978(arg0, local76, local71, local67);
			}
			@Pc(94) int local94 = local30 + arg1;
			@Pc(101) int[] local101 = Static40.anIntArrayArray6[arg2 + local16];
			@Pc(106) int local106 = arg1 - local30;
			@Pc(113) int[] local113 = Static40.anIntArrayArray6[arg2 - local16];
			Static103.method1978(arg0, local94, local106, local101);
			Static103.method1978(arg0, local94, local106, local113);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZII)I")
	public static int method4180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static119.anIntArray174[Static169.method2937(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(22) int local22 = Static119.anInterface5_1.method1482(arg0 & 0xFFFF);
			@Pc(42) int local42;
			@Pc(60) int local60;
			if (local22 != 0) {
				if (arg2 < 0) {
					local42 = 0;
				} else if (arg2 <= 127) {
					local42 = arg2 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local22 == 256) {
					local11 = local42;
				} else {
					local60 = 256 - local22;
					local11 = ((local42 & 0xFF00FF) * local22 + local60 * (local11 & 0xFF00FF) & 0xFF00FF00) + (local22 * (local42 & 0xFF00) + ((local11 & 0xFF00) * local60) & 0xFF0000) >> 8;
				}
			}
			local42 = Static119.anInterface5_1.method1484(arg0 & 0xFFFF);
			if (local42 != 0) {
				local42 += 256;
				@Pc(118) int local118 = (local11 >> 16 & 0xFF) * local42;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local60 = local42 * (local11 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(146) int local146 = (local11 & 0xFF) * local42;
				if (local146 > 65535) {
					local146 = 65535;
				}
				local11 = (local146 >> 8) + ((local118 & 0x2E00FF00) << 8) + (local60 & 0xFF00);
			}
		}
		return local11;
	}
}
