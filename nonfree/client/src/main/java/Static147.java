import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[Lclient!w;")
	public static final Class209[] aClass209Array2 = new Class209[16];

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public static int anInt78 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method80() {
		if (Static236.aBoolean348) {
			return;
		}
		Static289.aBoolean472 = true;
		Static236.aBoolean348 = true;
		if (Static131.aBoolean194) {
			Static164.aFloat24 = (int) Static164.aFloat24 - 65 & 0xFFFFFF80;
		} else {
			Static192.aFloat34 += (-Static192.aFloat34 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)I")
	public static int method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = arg2 & 0xF;
		@Pc(26) int local26 = local17 < 8 ? arg3 : arg1;
		@Pc(45) int local45 = local17 >= 4 ? (local17 == 12 || local17 == 14 ? arg3 : arg0) : arg1;
		return ((local17 & 0x2) == 0 ? local45 : -local45) + ((local17 & 0x1) == 0 ? local26 : -local26);
	}
}
