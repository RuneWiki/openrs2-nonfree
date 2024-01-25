import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
	public static int anInt4814 = 999999;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "(I)V")
	public static void method4086() {
		if (Static375.anInt9162 == 3) {
			Static436.method6188(4);
		} else if (Static375.anInt9162 == 7) {
			Static436.method6188(8);
		} else if (Static375.anInt9162 == 10) {
			Static436.method6188(11);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(FIFF)I")
	public static int method4087(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local12 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
