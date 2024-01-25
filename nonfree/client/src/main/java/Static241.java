import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIIII)V")
	public static void method4616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static178.anInt4220 != 1) {
			return;
		}
		@Pc(20) int local20 = arg3 / Static246.anInt5504;
		@Pc(24) int local24 = arg2 / Static246.anInt5504;
		@Pc(28) int local28 = arg1 / Static584.anInt9762;
		@Pc(32) int local32 = arg0 / Static584.anInt9762;
		if (Static87.anInt2288 <= local20 || local24 < 0 || Static158.anInt3847 <= local28 || local32 < 0) {
			return;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		if (local32 >= Static158.anInt3847) {
			local32 = Static158.anInt3847 - 1;
		}
		if (Static87.anInt2288 <= local24) {
			local24 = Static87.anInt2288 - 1;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		for (@Pc(74) int local74 = local28; local74 <= local32; local74++) {
			@Pc(85) int local85 = Static133.method3090(Static158.anInt3847, Static164.anInt8855 + local74) * Static87.anInt2288;
			for (@Pc(87) int local87 = local20; local87 <= local24; local87++) {
				@Pc(99) int local99 = local85 + Static133.method3090(Static87.anInt2288, Static43.anInt770 + local87);
				Static295.anIntArray349[local99] = Static451.anInt8203;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public static void method4617(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 5);
		local8.method8628();
	}
}
