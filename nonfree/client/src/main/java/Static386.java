import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!lt;")
	public static Class158 aClass158_83;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "[I")
	public static final int[] anIntArray556 = new int[14];

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_51 = new Class220(64);

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	public static final int anInt6359 = 0;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	public static void method5314() {
		if (!Static370.aBoolean410) {
			return;
		}
		while (true) {
			while (Static311.anInt5063 < Static148.aClass184_Sub1Array1.length) {
				@Pc(22) Class184_Sub1 local22 = Static148.aClass184_Sub1Array1[Static311.anInt5063];
				if (local22 != null && local22.anInt4777 == -1) {
					if (Static141.aClass6_Sub22_1 == null) {
						Static141.aClass6_Sub22_1 = Static274.aClass172_1.method3956(local22.aString40);
					}
					@Pc(46) int local46 = Static141.aClass6_Sub22_1.anInt4140;
					if (local46 == -1) {
						return;
					}
					local22.anInt4777 = local46;
					Static141.aClass6_Sub22_1 = null;
					Static311.anInt5063++;
				} else {
					Static311.anInt5063++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public static void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static81.anInt1574 <= arg3 && Static99.anInt1808 >= arg3) {
			@Pc(20) int local20 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg0);
			@Pc(26) int local26 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg1);
			Static342.method4812(arg2, local20, local26, arg3);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)I")
	public static int method5319(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
