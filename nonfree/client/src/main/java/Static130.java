import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "[Lclient!us;")
	public static Class323[] aClass323Array1;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_36 = new Class160(60, 5);

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "Lclient!saa;")
	public static final Class287 aClass287_1 = new Class287("LOCAL", 4);

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
	public static int anInt2246 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
	public static int method1957(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIZI)V")
	public static void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (Static480.aClass6_Sub37_Sub1_1.anInt6047 != 0 && arg2 != 0 && Static231.anInt3927 < 50 && arg3 != -1) {
			Static103.aClass172Array7[Static231.anInt3927++] = new Class172((byte) 2, arg3, arg2, arg4, arg0, arg1);
		}
	}
}
