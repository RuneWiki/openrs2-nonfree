import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt4674 = 0;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt4678 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public static int method3987(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
	public static void method3988(@OriginalArg(1) int arg0) {
		Static56.method929();
		Static317.method4687();
		@Pc(12) int local12 = Static353.method5715(arg0).anInt4015;
		if (local12 == 0) {
			return;
		}
		@Pc(27) int local27 = Static38.anIntArray55[arg0];
		if (local12 == 9) {
			Static144.anInt2892 = local27;
		}
		if (local12 == 6) {
			Static260.anInt5192 = local27;
		}
		if (local12 == 5) {
			Static285.anInt5662 = local27;
		}
	}
}
