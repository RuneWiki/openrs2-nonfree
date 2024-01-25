import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!nga;")
	public static Class234 aClass234_3;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "[Lclient!pc;")
	public static Class257[] aClass257Array1;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_64 = new Class362(42, 4);

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_40 = new Class173(83, 0);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)I")
	public static int method2549(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(53) double local53 = local14;
		if (local23 > local14) {
			local53 = local23;
		}
		if (local30 > local53) {
			local53 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local53) / 2.0D;
		if (local32 != local53) {
			if (local75 < 0.5D) {
				local69 = (local53 - local32) / (local32 + local53);
			}
			if (local14 == local53) {
				local67 = (local23 - local30) / (-local32 + local53);
			} else if (local53 == local23) {
				local67 = (local30 - local14) / (local53 - local32) + 2.0D;
			} else if (local30 == local53) {
				local67 = (local14 - local23) / (-local32 + local53) + 4.0D;
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local32) / ((2.0D - local53) - local32);
			}
		}
		local67 /= 6.0D;
		@Pc(164) int local164 = (int) (local67 * 256.0D);
		@Pc(169) int local169 = (int) (local69 * 256.0D);
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		@Pc(190) int local190 = (int) (local75 * 256.0D);
		if (local190 < 0) {
			local190 = 0;
		} else if (local190 > 255) {
			local190 = 255;
		}
		if (local190 > 243) {
			local169 >>= 0x4;
		} else if (local190 > 217) {
			local169 >>= 0x3;
		} else if (local190 > 192) {
			local169 >>= 0x2;
		} else if (local190 > 179) {
			local169 >>= 0x1;
		}
		return (local190 >> 1) + ((local164 & 0xFF) >> 2 << 10) + (local169 >> 5 << 7);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZBI)I")
	public static int method2550(@OriginalArg(2) int arg0) {
		@Pc(14) Class4_Sub18 local14 = Static72.method6564(false, arg0);
		if (local14 == null) {
			return Static327.aClass161_1.method3717(arg0).anInt2215;
		}
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < local14.anIntArray144.length; local33++) {
			if (local14.anIntArray144[local33] == -1) {
				local31++;
			}
		}
		return local31 + Static327.aClass161_1.method3717(arg0).anInt2215 - local14.anIntArray144.length;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([[BBLclient!js;)V")
	public static void method2551(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class179_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(21) int local21 = 0; local21 < arg1.anInt4634; local21++) {
			Static390.method6204();
			for (@Pc(27) int local27 = 0; local27 < Static428.anInt8046 >> 3; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static119.anInt2717 >> 3; local31++) {
					@Pc(41) int local41 = Static160.anIntArrayArrayArray4[local21][local27][local31];
					if (local41 != -1) {
						@Pc(50) int local50 = local41 >> 24 & 0x3;
						if (!arg1.aBoolean331 || local50 == 0) {
							@Pc(64) int local64 = local41 >> 1 & 0x3;
							@Pc(70) int local70 = local41 >> 14 & 0x3FF;
							@Pc(76) int local76 = local41 >> 3 & 0x7FF;
							@Pc(86) int local86 = local76 / 8 + (local70 / 8 << 8);
							for (@Pc(88) int local88 = 0; local88 < Static75.anIntArray18.length; local88++) {
								if (Static75.anIntArray18[local88] == local86 && arg0[local88] != null) {
									@Pc(110) Class4_Sub11 local110 = new Class4_Sub11(arg0[local88]);
									arg1.method4060(local27 * 8, local64, local70, Static86.aClass111Array1, local110, local50, local21, local76, local31 * 8);
									arg1.method4069(local50, local27 * 8, local110, Static440.aClass44_12, local12[0] == -1 ? local12 : null, local76, local21, local70, local31 * 8, local64);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static529.aClass215_1 = Static419.aClass28_1.method457(local12[0], Static594.aClass170_1, local12[3], local12[2], local12[1]);
			Static177.anInt9180 = local12[4];
		}
	}
}
