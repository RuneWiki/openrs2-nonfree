import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Z")
	public static boolean aBoolean580 = true;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)V")
	public static void method7380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static677.aClass169_12.method3653(Static430.aClass257_24.method5699(Static456.anInt7118));
		@Pc(62) int local62;
		@Pc(28) int local28;
		if (Static228.aBoolean744) {
			for (@Pc(69) Class3_Sub7_Sub5 local69 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local69 != null; local69 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
				if (local69.anInt2315 == 1) {
					local28 = Static499.method6809((Class3_Sub7_Sub10) local69.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67);
				} else {
					local28 = Static402.method5424(local69);
				}
				if (local13 < local28) {
					local13 = local28;
				}
			}
			Static284.anInt4357 = Static239.anInt3802 * 16 + (Static477.aBoolean508 ? 26 : 22);
			local62 = Static239.anInt3802 * 16 + 21;
			local13 += 8;
		} else {
			for (@Pc(20) Class3_Sub7_Sub10 local20 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local20 != null; local20 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
				local28 = Static499.method6809(local20);
				if (local13 < local28) {
					local13 = local28;
				}
			}
			Static284.anInt4357 = Static716.anInt11158 * 16 + (Static477.aBoolean508 ? 26 : 22);
			local13 += 8;
			local62 = Static716.anInt11158 * 16 + 21;
		}
		@Pc(137) int local137 = arg1 - local13 / 2;
		if (Static681.anInt10652 < local137 + local13) {
			local137 = Static681.anInt10652 - local13;
		}
		if (local137 < 0) {
			local137 = 0;
		}
		local28 = arg0;
		if (Static76.anInt1720 < local62 + arg0) {
			local28 = Static76.anInt1720 - local62;
		}
		Static123.anInt2492 = local137;
		if (local28 < 0) {
			local28 = 0;
		}
		Static177.anInt3132 = local28;
		Static530.aBoolean556 = true;
		Static332.anInt5338 = local13;
	}
}
