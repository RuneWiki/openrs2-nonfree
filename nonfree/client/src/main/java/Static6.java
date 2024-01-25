import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public static int anInt253;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public static int anInt255;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_5 = new Class123(65, -2);

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
	public static final int[] anIntArray10 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIIII)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(50) int local50 = local21 * (Static23.aShort2 - Static91.aShort32) / 100 + Static91.aShort32;
		if (local50 < Static284.aShort65) {
			local50 = Static284.aShort65;
		} else if (local50 > Static5.aShort1) {
			local50 = Static5.aShort1;
		}
		@Pc(76) int local76 = arg4 * local50 * 512 / (arg3 * 334);
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(85) short local85;
		if (Static283.aShort104 > local76) {
			local85 = Static283.aShort104;
			local50 = local85 * 334 * arg3 / (arg4 * 512);
			if (local50 > Static5.aShort1) {
				local50 = Static5.aShort1;
				local110 = local50 * 512 * arg4 / (local85 * 334);
				local116 = (arg3 - local110) / 2;
				if (arg1) {
					Static126.aClass66_5.method5070();
					Static126.aClass66_5.method5035(local116, arg2, -16777216, arg0, arg4);
					Static126.aClass66_5.method5035(local116, arg2, -16777216, arg0 + arg3 - local116, arg4);
				}
				arg3 -= local116 * 2;
				arg0 += local116;
			}
		} else if (local76 > Static270.aShort64) {
			local85 = Static270.aShort64;
			local50 = local85 * arg3 * 334 / (arg4 * 512);
			if (Static284.aShort65 > local50) {
				local50 = Static284.aShort65;
				local110 = arg3 * local85 * 334 / (local50 * 512);
				local116 = (arg4 - local110) / 2;
				if (arg1) {
					Static126.aClass66_5.method5070();
					Static126.aClass66_5.method5035(arg3, arg2, -16777216, arg0, local116);
					Static126.aClass66_5.method5035(arg3, arg2 + arg4 - local116, -16777216, arg0, local116);
				}
				arg2 += local116;
				arg4 -= local116 * 2;
			}
		}
		Static331.anInt5767 = (short) arg3;
		Static335.anInt5839 = arg0;
		Static115.anInt2442 = (short) arg4;
		Static177.anInt7405 = local50 * arg4 / 334;
		Static423.anInt7585 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)[Lclient!ak;")
	public static Class10[] method205() {
		return new Class10[] { Static400.aClass10_20, Static441.aClass10_26, Static345.aClass10_17, Static168.aClass10_11, Static294.aClass10_15, Static248.aClass10_25, Static320.aClass10_16, Static133.aClass10_19, Static167.aClass10_22, Static214.aClass10_13, Static419.aClass10_24, Static409.aClass10_23, Static84.aClass10_5, Static195.aClass10_21 };
	}
}
