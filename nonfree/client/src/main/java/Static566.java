import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "Lclient!tf;")
	public static Class322 aClass322_153;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public static int anInt9217 = 0;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
	public static final int anInt9218 = 0;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public static final int anInt9221 = Static565.method7622(1600);

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	public static int anInt9223 = 0;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "[I")
	public static final int[] anIntArray587 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!pj;Z)V")
	public static void method7612(@OriginalArg(0) Class41_Sub5 arg0) {
		arg0.aClass41_Sub2_Sub1_Sub4_1 = null;
		if (Static444.anInt7423 < 20) {
			Static267.aClass178_10.method4166(arg0);
			Static444.anInt7423++;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)I")
	public static int method7615(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
