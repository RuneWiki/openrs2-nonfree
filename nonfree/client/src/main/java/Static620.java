import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt10055 = -1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public static boolean method8539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ee;B)Lclient!qk;")
	public static Class289 method8540(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method8631();
		return new Class289(local7);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Z")
	public static boolean method8542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static69.method1137(arg0, arg1) || Static438.method6522(arg1, arg0);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V")
	public static void method8543(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static235.anInt3998 - Static18.anInt422;
		if (local8 >= 100) {
			Static584.anInt9543 = 1;
			Static609.anInt9978 = -1;
			Static394.anInt6873 = -1;
			return;
		}
		@Pc(21) int local21 = (int) Static371.aFloat65;
		if (Static93.anInt1497 >> 8 > local21) {
			local21 = Static93.anInt1497 >> 8;
		}
		if (Static274.aBooleanArray60[4] && local21 < Static39.anIntArray54[4] + 128) {
			local21 = Static39.anIntArray54[4] + 128;
		}
		@Pc(59) int local59 = (int) Static112.aFloat22 + Static145.anInt6904 & 0x3FFF;
		Static291.method4299(Static319.anInt5539, local21, Static134.anInt2212, arg0, (local21 >> 3) * 3 + 600 << 2, Static600.method8378(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317, Static299.anInt4751) - 200, local59);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static646.anInt10445 = (int) ((float) Static290.anInt4705 + (float) (Static646.anInt10445 - Static290.anInt4705) * local105);
		Static218.anInt3744 = (int) ((float) Static454.anInt7639 + local105 * (float) (Static218.anInt3744 - Static454.anInt7639));
		Static216.anInt3726 = (int) ((float) Static58.anInt927 + local105 * (float) (Static216.anInt3726 - Static58.anInt927));
		Static70.anInt9231 = (int) ((float) Static408.anInt7026 + local105 * (float) (Static70.anInt9231 - Static408.anInt7026));
		@Pc(157) int local157 = Static608.anInt9971 - Static606.anInt9947;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static608.anInt9971 = (int) (local105 * (float) local157 + (float) Static606.anInt9947);
		Static608.anInt9971 &= 0x3FFF;
	}
}
