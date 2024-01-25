import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "[Lclient!tu;")
	public static Class337[] aClass337Array3;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Z")
	public static boolean aBoolean356;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "Lclient!la;")
	public static Class208 aClass208_60;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "[I")
	public static final int[] anIntArray255 = new int[3];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method3878() {
		Static678.anInt10816 = 0;
		@Pc(12) int local12 = Static622.anInt10188 + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9);
		@Pc(20) int local20 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9) + Static668.anInt10683;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static678.anInt10816 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static678.anInt10816 = 1;
		}
		if (Static678.anInt10816 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static678.anInt10816 = 0;
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public static void method3879() {
		Static60.aClass57_1.xa(((float) Static637.aClass5_Sub20_31.aClass24_Sub9_1.method2798() * 0.1F + 0.7F) * Static656.aFloat207);
		Static60.aClass57_1.ZA(Static420.anInt7261, Static5.aFloat183, Static18.aFloat5, (float) (Static61.anInt970 << 2), (float) (Static594.anInt10010 << 2), (float) (Static662.anInt10638 << 2));
		Static60.aClass57_1.method7702(Static246.aClass29_3);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V")
	public static void method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static629.anInt9766 / (float) Static629.anInt9767;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(47) int local47 = arg2 - (arg0 - local13) / 2;
		@Pc(56) int local56 = arg1 - (arg3 - local11) / 2;
		Static652.anInt10539 = -1;
		Static622.anInt10186 = Static629.anInt9767 * local56 / local11;
		Static448.anInt7716 = Static629.anInt9766 - local47 * Static629.anInt9766 / local13;
		Static436.anInt7489 = -1;
		Static122.method1709();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BII)I")
	public static int method3884(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return local24 + (arg0 & 0xFF80);
	}
}
