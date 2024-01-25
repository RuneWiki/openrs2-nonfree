import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_139 = new Class217(81, 6);

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	public static final int anInt6529 = -1;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
	public static final int[] anIntArray634 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
	public static int anInt6537 = 0;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V")
	public static void method5128(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static400.anInt6752 - Static241.anInt4382;
		if (local8 >= 100) {
			Static157.anInt3176 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static16.aFloat6;
		if (local17 < Static190.anInt3828 >> 8) {
			local17 = Static190.anInt3828 >> 8;
		}
		if (Static65.aBooleanArray1[4] && Static443.anIntArray727[4] + 128 > local17) {
			local17 = Static443.anIntArray727[4] + 128;
		}
		@Pc(54) int local54 = Static168.anInt3341 + (int) Static149.aFloat53 & 0x3FFF;
		Static176.method2941(Static326.method4459(Static96.anInt1983, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094) - 50, arg0, local54, Static399.anInt6746, Static440.anInt7366, (local17 >> 3) * 3 + 600 << 0, local17);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static50.anInt906 = (int) ((float) (Static50.anInt906 - Static52.anInt928) * local98 + (float) Static52.anInt928);
		Static8.anInt121 = (int) ((float) (Static8.anInt121 - Static242.anInt5730) * local98 + (float) Static242.anInt5730);
		Static80.anInt1679 = (int) ((float) (Static80.anInt1679 - Static323.anInt5556) * local98 + (float) Static323.anInt5556);
		Static127.anInt2604 = (int) (local98 * (float) (Static127.anInt2604 - Static39.anInt632) + (float) Static39.anInt632);
		@Pc(148) int local148 = Static362.anInt6155 - Static11.anInt215;
		if (local148 > 8192) {
			local148 -= 16384;
		} else if (local148 < -8192) {
			local148 += 16384;
		}
		Static362.anInt6155 = (int) ((float) Static11.anInt215 + (float) local148 * local98);
		Static362.anInt6155 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!za;Lclient!gh;I)V")
	public static void method5130(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class89 arg1) {
		@Pc(36) boolean local36 = Static313.aClass272_2.method6072(arg1.aBoolean199 ? Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 : null, arg1.anInt2719, arg1.anInt2714, arg1.anInt2670, arg0, arg1.anInt2743 | 0xFF000000, arg1.anInt2739) == null;
		if (local36) {
			Static310.aClass163_37.method3613(new Class10_Sub39(arg1.anInt2670, arg1.anInt2719, arg1.anInt2714, arg1.anInt2743 | 0xFF000000, arg1.anInt2739, arg1.aBoolean199));
			Static135.method5400(arg1);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z")
	public static boolean method5132(@OriginalArg(1) int arg0) {
		if (arg0 == 60 || arg0 == 13 || arg0 == 17 || arg0 == 4 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1003;
		}
	}
}
