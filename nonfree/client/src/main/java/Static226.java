import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_88 = new Class266(8, 0, 4, 1);

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "[S")
	public static short[] aShortArray66 = new short[256];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([[BZLclient!th;)V")
	public static void method3854(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class191_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt6970; local7++) {
			Static256.method4185();
			for (@Pc(13) int local13 = 0; local13 < Static193.anInt3853 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static301.anInt5585 >> 3; local17++) {
					@Pc(27) int local27 = Static47.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean513 || local37 == 0) {
							@Pc(48) int local48 = local27 >> 1 & 0x3;
							@Pc(54) int local54 = local27 >> 14 & 0x3FF;
							@Pc(60) int local60 = local27 >> 3 & 0x7FF;
							@Pc(70) int local70 = local60 / 8 + (local54 / 8 << 8);
							for (@Pc(72) int local72 = 0; local72 < Static109.anIntArray203.length; local72++) {
								if (Static109.anIntArray203[local72] == local70 && arg0[local72] != null) {
									arg1.method5586(Static30.aClass30_3, local37, local17 * 8, local48, (local54 & 0x7) * 8, arg0[local72], local13 * 8, Static335.aClass253Array1, (local60 & 0x7) * 8, local7);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ci;BLclient!ci;)I")
	public static int method3855(@OriginalArg(0) Class38 arg0, @OriginalArg(2) Class38 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method1037(Static455.anInt7784)) {
			local5++;
		}
		if (arg1.method1037(Static107.anInt2318)) {
			local5++;
		}
		if (arg1.method1037(Static38.anInt907)) {
			local5++;
		}
		if (arg0.method1037(Static455.anInt7784)) {
			local5++;
		}
		if (arg0.method1037(Static107.anInt2318)) {
			local5++;
		}
		if (arg0.method1037(Static38.anInt907)) {
			local5++;
		}
		return local5;
	}
}
