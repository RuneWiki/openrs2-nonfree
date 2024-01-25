import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	public static int anInt2899;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Lclient!nk;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Lclient!o;")
	public static final Class169 aClass169_146 = new Class169("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_72 = new Class211(49, -2);

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
	public static final int[] anIntArray345 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method2376() {
		@Pc(7) int local7 = Static331.anInt5548;
		@Pc(9) int[] local9 = Static345.anIntArray681;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class25_Sub1_Sub1_Sub1 local19 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local9[local11]];
			if (local19 != null && local19.anInt2327 > 0) {
				local19.anInt2327--;
				if (local19.anInt2327 == 0) {
					local19.aString23 = null;
				}
			}
		}
		for (@Pc(45) int local45 = 0; local45 < Static309.anInt5243; local45++) {
			@Pc(51) int local51 = Static131.anIntArray302[local45];
			@Pc(55) Class25_Sub1_Sub1_Sub2 local55 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local51];
			if (local55 != null && local55.anInt2327 > 0) {
				local55.anInt2327--;
				if (local55.anInt2327 == 0) {
					local55.aString23 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method2378() {
		Static333.aClass77_3.method1362();
		Static301.aClass170_7.method3686();
		Static286.aClass170_6.method3686();
	}
}
