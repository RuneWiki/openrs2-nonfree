import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_114 = new Class211(47, 5);

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
	public static final int[] anIntArray539 = new int[50];

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_153 = new Class48(50, -1);

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V")
	public static void method3900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static360.aClass94_7 == Static313.aClass94_8) {
			if (Static155.method2334(arg0, 1, 1, arg1, 0, -2, 0, false)) {
				return;
			}
			Static155.method2334(arg0, 1, 1, arg1, 0, -3, 0, false);
		} else if (Static155.method2334(arg0, 1, 1, arg1, 0, -3, 0, false)) {
			return;
		} else {
			Static155.method2334(arg0, 1, 1, arg1, 0, -2, 0, false);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)[Lclient!v;")
	public static Class234[] method3902() {
		if (Static158.aClass234Array3 == null) {
			@Pc(15) Class234[] local15 = Static132.method1937(Static341.aClass162_5);
			@Pc(19) Class234[] local19 = new Class234[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(76) int local76;
			@Pc(82) Class234 local82;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class234 local29 = local15[local23];
				if ((local29.anInt5875 <= 0 || local29.anInt5875 >= 24) && local29.anInt5871 >= 800 && local29.anInt5874 >= 600 && (Static294.anInt5063 >= 96 || Static25.anInt394 != 0 || local29.anInt5871 <= 1024 && local29.anInt5874 <= 768)) {
					for (local76 = 0; local76 < local21; local76++) {
						local82 = local19[local76];
						if (local29.anInt5871 == local82.anInt5871 && local29.anInt5874 == local82.anInt5874) {
							if (local82.anInt5875 < local29.anInt5875) {
								local19[local76] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static158.aClass234Array3 = new Class234[local21];
			Static404.method4338(local19, 0, Static158.aClass234Array3, 0, local21);
			@Pc(138) int[] local138 = new int[Static158.aClass234Array3.length];
			for (local76 = 0; local76 < Static158.aClass234Array3.length; local76++) {
				local82 = Static158.aClass234Array3[local76];
				local138[local76] = local82.anInt5874 * local82.anInt5871;
			}
			Static150.method2268(local138, Static158.aClass234Array3);
		}
		return Static158.aClass234Array3;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)I")
	public static int method3903() {
		if (Static47.aFrame1 == null) {
			return Static76.aBoolean522 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
