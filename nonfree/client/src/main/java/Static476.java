import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "Lclient!qv;")
	public static Class280 aClass280_3;

	@OriginalMember(owner = "client!rba", name = "sb", descriptor = "[Lclient!wi;")
	public static Class372[] aClass372Array3;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public static void method7050(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static435.anInt8192 - Static177.anInt3832;
		if (local8 >= 100) {
			Static621.anInt10407 = -1;
			Static460.anInt8416 = -1;
			Static427.anInt8005 = 1;
			return;
		}
		@Pc(27) int local27 = (int) Static64.aFloat44;
		if (Static291.anInt5934 >> 8 > local27) {
			local27 = Static291.anInt5934 >> 8;
		}
		if (Static97.aBooleanArray4[4] && Static18.anIntArray22[4] + 128 > local27) {
			local27 = Static18.anIntArray22[4] + 128;
		}
		@Pc(68) int local68 = Static425.anInt6305 + (int) Static499.aFloat185 & 0x3FFF;
		Static354.method5607(local68, (local27 >> 3) * 3 + 600 << 2, local27, arg0, Static427.anInt8006, Static177.method3098(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301, Static128.anInt3428) - 200, Static572.anInt9826);
		@Pc(113) float local113 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static504.anInt8868 = (int) ((float) Static572.anInt9828 + (float) (Static504.anInt8868 - Static572.anInt9828) * local113);
		Static377.anInt7114 = (int) ((float) Static4.anInt23 + (float) (Static377.anInt7114 - Static4.anInt23) * local113);
		Static637.anInt10650 = (int) ((float) Static214.anInt4979 + local113 * (float) (Static637.anInt10650 - Static214.anInt4979));
		Static443.anInt8245 = (int) ((float) Static639.anInt10676 + (float) (Static443.anInt8245 - Static639.anInt10676) * local113);
		@Pc(164) int local164 = Static25.anInt1035 - Static153.anInt3784;
		if (local164 > 8192) {
			local164 -= 16384;
		} else if (local164 < -8192) {
			local164 += 16384;
		}
		Static25.anInt1035 = (int) (local113 * (float) local164 + (float) Static153.anInt3784);
		Static25.anInt1035 &= 0x3FFF;
	}
}
