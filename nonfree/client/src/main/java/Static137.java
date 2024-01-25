import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	public static int anInt2914;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	public static final int anInt2909 = 4;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!nq;[[BB)V")
	public static void method2577(@OriginalArg(0) Class202_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt6804; local7++) {
			Static186.method3607();
			for (@Pc(13) int local13 = 0; local13 < Static228.anInt4746 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static44.anInt1275 >> 3; local17++) {
					@Pc(27) int local27 = Static154.anIntArrayArrayArray3[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean511 || local37 == 0) {
							@Pc(48) int local48 = local27 >> 1 & 0x3;
							@Pc(54) int local54 = local27 >> 14 & 0x3FF;
							@Pc(60) int local60 = local27 >> 3 & 0x7FF;
							@Pc(70) int local70 = local60 / 8 + (local54 / 8 << 8);
							for (@Pc(72) int local72 = 0; local72 < Static341.anIntArray470.length; local72++) {
								if (local70 == Static341.anIntArray470[local72] && arg1[local72] != null) {
									arg0.method5738((local60 & 0x7) * 8, local37, (local54 & 0x7) * 8, local48, Static323.aClass9_8, arg1[local72], Static55.aClass194Array1, local13 * 8, local17 * 8, local7);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
	public static int method2578(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BBI)[B")
	public static byte[] method2579(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9;
		if (arg2 <= 0) {
			local9 = arg1;
		} else {
			local9 = new byte[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				local9[local16] = arg1[local16 + arg2];
			}
		}
		@Pc(34) Class313 local34 = new Class313();
		local34.method7550();
		local34.method7546((long) (arg0 * 8), local9);
		@Pc(55) byte[] local55 = new byte[64];
		local34.method7545(local55);
		return local55;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIII)I")
	public static int method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(22) int local22 = 128 - arg1;
		@Pc(36) int local36 = arg1 * (arg0 & 0x7F) + (arg2 & 0x7F) * local22 >> 7;
		@Pc(50) int local50 = (arg0 & 0x380) * arg1 + local22 * (arg2 & 0x380) >> 7;
		@Pc(64) int local64 = arg1 * (arg0 & 0xFC00) + local22 * (arg2 & 0xFC00) >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local36 & 0x7F;
	}
}
