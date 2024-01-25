import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
	public static int anInt9456;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "[I")
	public static int[] anIntArray688;

	@OriginalMember(owner = "client!tfa", name = "h", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lclient!jm;")
	public static Class199_Sub1 aClass199_Sub1_1;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_183 = new Class225(116, -1);

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "Lclient!fea;")
	public static Class2_Sub25 aClass2_Sub25_2 = null;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	public static void method8337(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static528.anInt8386 - Static657.anInt10298;
		if (local8 >= 100) {
			Static60.anInt1040 = 1;
			Static253.anInt3964 = -1;
			Static45.anInt602 = -1;
			return;
		}
		@Pc(24) int local24 = (int) Static356.aFloat90;
		if (local24 < Static303.anInt4644 >> 8) {
			local24 = Static303.anInt4644 >> 8;
		}
		if (Static144.aBooleanArray12[4] && Static431.anIntArray506[4] + 128 > local24) {
			local24 = Static431.anIntArray506[4] + 128;
		}
		@Pc(63) int local63 = Static405.anInt6686 + (int) Static213.aFloat46 & 0x3FFF;
		Static575.method7989(Static324.method4554(Static684.anInt10516, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228) - 200, local63, Static506.anInt8028, arg0, Static682.anInt11014, (local24 >> 3) * 3 + 600 << 2, local24);
		@Pc(114) float local114 = -((float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F) + (float) 1;
		Static411.anInt6731 = (int) ((float) (Static411.anInt6731 - Static679.anInt10496) * local114 + (float) Static679.anInt10496);
		Static583.anInt2354 = (int) ((float) Static455.anInt7437 + local114 * (float) (Static583.anInt2354 - Static455.anInt7437));
		Static430.anInt7002 = (int) ((float) Static24.anInt300 + local114 * (float) (Static430.anInt7002 - Static24.anInt300));
		Static218.anInt3475 = (int) ((float) Static78.anInt1360 + (float) (Static218.anInt3475 - Static78.anInt1360) * local114);
		@Pc(167) int local167 = anInt9456 - Static524.anInt8314;
		if (local167 > 8192) {
			local167 -= 16384;
		} else if (local167 < -8192) {
			local167 += 16384;
		}
		anInt9456 = (int) ((float) local167 * local114 + (float) Static524.anInt8314);
		anInt9456 &= 0x3FFF;
	}
}
