import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static int anInt8594 = -1;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	public static int anInt8598 = 0;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "F")
	public static float aFloat180 = 0.0F;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public static void method7404() {
		if (!Static511.aBoolean603) {
			return;
		}
		while (true) {
			while (Static502.anInt8698 < Static187.aClass51_Sub1Array1.length) {
				@Pc(21) Class51_Sub1 local21 = Static187.aClass51_Sub1Array1[Static502.anInt8698];
				if (local21 != null && local21.anInt1513 == -1) {
					if (Static197.aClass6_Sub17_8 == null) {
						Static197.aClass6_Sub17_8 = Static115.aClass380_1.method8969(local21.aString15);
					}
					@Pc(45) int local45 = Static197.aClass6_Sub17_8.anInt2807;
					if (local45 == -1) {
						return;
					}
					Static197.aClass6_Sub17_8 = null;
					Static502.anInt8698++;
					local21.anInt1513 = local45;
				} else {
					Static502.anInt8698++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)Z")
	public static boolean method7405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ns;I)V")
	public static void method7406(@OriginalArg(0) Class20_Sub2_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
			@Pc(13) Class20_Sub2_Sub2_Sub1_Sub2 local13 = (Class20_Sub2_Sub2_Sub1_Sub2) arg0;
			if (local13.aClass247_1 != null) {
				Static304.method5160(local13, local13.aByte131 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131);
				return;
			}
		} else if (arg0 instanceof Class20_Sub2_Sub2_Sub1_Sub1) {
			@Pc(34) Class20_Sub2_Sub2_Sub1_Sub1 local34 = (Class20_Sub2_Sub2_Sub1_Sub1) arg0;
			Static125.method9041(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != local34.aByte131, local34);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public static void method7407() {
		@Pc(5) Class166 local5 = Static3.aClass166_1;
		synchronized (Static3.aClass166_1) {
			Static3.aClass166_1.method4802();
		}
		local5 = Static553.aClass166_54;
		synchronized (Static553.aClass166_54) {
			Static553.aClass166_54.method4802();
		}
	}
}
