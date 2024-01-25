import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_15 = new Class188(11, 0, 1, 2);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
	public static void method6326(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static358.anInt6263 - Static292.anInt4770;
		if (local8 >= 100) {
			Static354.anInt6233 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static475.aFloat174;
		if (Static179.anInt3180 >> 8 > local19) {
			local19 = Static179.anInt3180 >> 8;
		}
		if (Static99.aBooleanArray16[4] && Static490.anIntArray635[4] + 128 > local19) {
			local19 = Static490.anIntArray635[4] + 128;
		}
		@Pc(53) int local53 = (int) Static399.aFloat167 + Static74.anInt1216 & 0x3FFF;
		Static185.method2758(arg0, Static141.anInt2539, Static490.method6768(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222, Static282.anInt4677, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218) - 200, (local19 >> 3) * 3 + 600 << 2, Static285.anInt4695, local53, local19);
		@Pc(97) float local97 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static162.anInt2840 = (int) (local97 * (float) (Static162.anInt2840 - Static206.anInt3583) + (float) Static206.anInt3583);
		Static220.anInt3753 = (int) (local97 * (float) (Static220.anInt3753 - Static234.anInt3852) + (float) Static234.anInt3852);
		Static388.anInt6921 = (int) ((float) (Static388.anInt6921 - Static234.anInt3853) * local97 + (float) Static234.anInt3853);
		Static33.anInt568 = (int) (local97 * (float) (Static33.anInt568 - Static189.anInt3160) + (float) Static189.anInt3160);
		@Pc(150) int local150 = Static261.anInt4257 - Static318.anInt5758;
		if (local150 > 8192) {
			local150 -= 16384;
		} else if (local150 < -8192) {
			local150 += 16384;
		}
		Static261.anInt4257 = (int) ((float) local150 * local97 + (float) Static318.anInt5758);
		Static261.anInt4257 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZZ)V")
	public static void method6330(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static566.anInt9481--;
			if (Static566.anInt9481 == 0) {
				Static101.anIntArray262 = null;
			}
		}
		if (arg0) {
			Static431.anInt7551--;
			if (Static431.anInt7551 == 0) {
				Static6.anIntArray272 = null;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method6337(@OriginalArg(0) int arg0) {
		if (Static305.anIntArray471 == null || Static305.anIntArray471.length < arg0) {
			Static305.anIntArray471 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ud;I)I")
	public static int method6342(@OriginalArg(0) Class29_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt8613;
		@Pc(12) Class120 local12 = arg0.method7009();
		if (arg0.aBoolean597) {
			local8 = arg0.anInt8599;
		} else if (local12.anInt2874 == arg0.anInt8535 || arg0.anInt8535 == local12.anInt2905 || local12.anInt2904 == arg0.anInt8535 || local12.anInt2882 == arg0.anInt8535) {
			local8 = arg0.anInt8610;
		} else if (local12.anInt2909 == arg0.anInt8535 || arg0.anInt8535 == local12.anInt2867 || arg0.anInt8535 == local12.anInt2870 || arg0.anInt8535 == local12.anInt2902) {
			local8 = arg0.anInt8611;
		}
		return local8;
	}
}
