import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_103 = new Class154(64);

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
	public static int anInt6678 = 0;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "[Lclient!pe;")
	public static final Class153[] aClass153Array1 = new Class153[4];

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
	public static int anInt6679 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
	public static int method5545(@OriginalArg(1) int arg0) {
		@Pc(22) double local22 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local22;
		if (local22 > local31) {
			local40 = local31;
		}
		if (local38 < local40) {
			local40 = local38;
		}
		@Pc(54) double local54 = local22;
		if (local22 < local31) {
			local54 = local31;
		}
		if (local54 < local38) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local40 + local54);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local54 - local40);
			}
			if (local54 == local22) {
				local68 = (local31 - local38) / (local54 - local40);
			} else if (local54 == local31) {
				local68 = (local38 - local22) / (local54 - local40) + 2.0D;
			} else if (local54 == local38) {
				local68 = (local22 - local31) / (local54 - local40) + 4.0D;
			}
		}
		local68 /= 6.0D;
		@Pc(160) int local160 = (int) (local68 * 256.0D);
		@Pc(165) int local165 = (int) (local70 * 256.0D);
		@Pc(170) int local170 = (int) (local76 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local170 > 243) {
			local165 >>= 0x4;
		} else if (local170 > 217) {
			local165 >>= 0x3;
		} else if (local170 > 192) {
			local165 >>= 0x2;
		} else if (local170 > 179) {
			local165 >>= 0x1;
		}
		return ((local160 >> 2 & 0x3F) << 10) + (local165 >> 5 << 7) + (local170 >> 1);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(ZI)V")
	public static void method5546(@OriginalArg(0) boolean arg0) {
		Static6.aBoolean170 = arg0;
		Static195.aBoolean347 = !Static313.method5257();
	}
}
