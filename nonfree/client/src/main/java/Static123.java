import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Lclient!cd;")
	public static Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!cc;")
	public static Class2_Sub9 aClass2_Sub9_1;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_47 = new Class256("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)V")
	public static void method1787(@OriginalArg(0) long arg0) {
		@Pc(14) int local14 = Static261.anInt5570 + Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117;
		@Pc(19) int local19 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 + Static390.anInt6847;
		if (Static349.anInt6145 - local14 < -500 || Static349.anInt6145 - local14 > 500 || Static177.anInt3430 - local19 < -500 || Static177.anInt3430 - local19 > 500) {
			Static177.anInt3430 = local19;
			Static349.anInt6145 = local14;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local14 != Static349.anInt6145) {
			local62 = local14 - Static349.anInt6145;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local62 < local70) {
				local70 = local62;
			}
			Static349.anInt6145 += local70;
		}
		if (!Static399.aClass167_Sub1_1.aBoolean480) {
			Static203.aFloat130 += Static83.aFloat67 * (float) arg0 / 6.0F;
			Static328.aFloat179 += (float) arg0 * Static317.aFloat171 / 6.0F;
		}
		if (local19 != Static177.anInt3430) {
			local62 = local19 - Static177.anInt3430;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local70 > local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static177.anInt3430 += local70;
		}
		Static309.method4416();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZIFIIII)[[I")
	public static int[][] method1789(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub1_Sub27 local13 = new Class2_Sub1_Sub27();
		local13.anInt5920 = 4;
		local13.anInt5928 = (int) (arg0 * (float) 4096);
		local13.anInt5922 = 3;
		local13.aBoolean520 = false;
		local13.anInt5927 = 8;
		local13.method6034();
		Static447.method3797(64, 256);
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			local13.method4737(local9[local41], local41);
		}
		return local9;
	}
}
