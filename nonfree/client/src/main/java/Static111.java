import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
	public static int anInt2450;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Lclient!gg;")
	public static Class4_Sub2_Sub9 method1918() {
		return Static23.aClass4_Sub2_Sub9_1;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
	public static void method1919() {
		aClass4_Sub2_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)I")
	public static int method1920(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method1921(@OriginalArg(0) Class98 arg0) {
		Static68.aClass59_Sub2Array2 = Static103.method1673(Static183.anInt3584, arg0);
		Static89.anIntArray195 = new int[256];
		@Pc(15) int local15;
		for (local15 = 0; local15 < 3; local15++) {
			@Pc(27) float local27 = (float) (Static122.anIntArray240[local15] >> 16 & 0xFF);
			@Pc(37) int local37 = Static122.anIntArray240[local15 + 1] >> 16 & 0xFF;
			@Pc(47) int local47 = Static122.anIntArray240[local15 + 1] >> 8 & 0xFF;
			@Pc(54) float local54 = ((float) local37 - local27) / 64.0F;
			@Pc(63) float local63 = (float) (Static122.anIntArray240[local15] >> 8 & 0xFF);
			@Pc(71) float local71 = ((float) local47 - local63) / 64.0F;
			@Pc(78) float local78 = (float) (Static122.anIntArray240[local15] & 0xFF);
			@Pc(86) int local86 = Static122.anIntArray240[local15 + 1] & 0xFF;
			@Pc(93) float local93 = ((float) local86 - local78) / 64.0F;
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				Static89.anIntArray195[local15 * 64 + local95] = (int) local27 << 16 | (int) local63 << 8 | (int) local78;
				local63 += local71;
				local27 += local54;
				local78 += local93;
			}
		}
		for (local15 = 192; local15 < 255; local15++) {
			Static89.anIntArray195[local15] = Static122.anIntArray240[3];
		}
		Static94.anIntArray210 = new int[32768];
		Static274.anIntArray453 = new int[32768];
		Static158.method2493(null);
		Static187.anIntArray314 = new int[32768];
		Static165.anIntArray292 = new int[32768];
		Static168.aClass4_Sub2_Sub1_Sub1_3 = new Class4_Sub2_Sub1_Sub1(128, 254);
	}
}
