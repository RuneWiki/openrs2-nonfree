import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!pha", name = "c", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_46 = new Class262();

	@OriginalMember(owner = "client!pha", name = "g", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!pha", name = "h", descriptor = "F")
	public static float aFloat185 = 0.0F;

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(B)Lclient!qe;")
	public static Class14_Sub46 method6583() {
		if (Static498.aClass262_60 == null || Static263.aClass118_1 == null) {
			return null;
		}
		Static263.aClass118_1.method2830(Static498.aClass262_60);
		@Pc(23) Class14_Sub46 local23 = (Class14_Sub46) Static263.aClass118_1.method2831();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class42 local33 = Static498.aClass116_4.method2783(local23.anInt8309);
			return local33 != null && local33.aBoolean106 && local33.method1109(Static498.anInterface20_2) ? local23 : Static330.method5180();
		}
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V")
	public static void method6584() {
		if (Static430.anInt7691 == 7) {
			Static128.method2105(false);
		} else {
			Static524.aClass97_3 = Static258.aClass97_2;
			Static258.aClass97_2 = null;
			Static67.method1345(13);
		}
	}
}
