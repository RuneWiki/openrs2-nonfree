import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Lclient!qe;")
	public static Class78 aClass78_611 = Static199.method3560("<)4col>");

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!qe;")
	private static Class78 aClass78_612 = Static199.method3560("Drop");

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "S")
	public static short aShort20 = 256;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
	public static int anInt3257 = 0;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_613 = aClass78_612;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZILclient!oe;)Lclient!fe;")
	public static Class2_Sub3_Sub8_Sub1 method2555(@OriginalArg(1) int arg0, @OriginalArg(2) Class72 arg1) {
		return Static71.method1150(arg0, arg1) ? Static17.method260() : null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
	public static void method2556() {
		@Pc(7) byte[][] local7 = Static7.aByteArrayArray2;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static41.method565();
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
					@Pc(25) boolean local25 = false;
					@Pc(33) int local33 = Static128.anIntArrayArrayArray6[local11][local17][local21];
					if (local33 != -1) {
						@Pc(43) int local43 = local33 >> 24 & 0x3;
						@Pc(56) int local56 = local33 >> 1 & 0x3;
						@Pc(62) int local62 = local33 >> 14 & 0x3FF;
						@Pc(68) int local68 = local33 >> 3 & 0x7FF;
						@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
						for (@Pc(80) int local80 = 0; local80 < Static171.anIntArray653.length; local80++) {
							if (Static171.anIntArray653[local80] == local78 && local7[local80] != null) {
								local25 = true;
								Static121.method3982(local11, local21 * 8, local7[local80], Static202.aClass90Array1, local43, local17 * 8, (local68 & 0x7) * 8, local56, (local62 & 0x7) * 8);
								break;
							}
						}
					}
					if (!local25) {
						Static149.method1480(local11, local21 * 8, 8, 8, local17 * 8);
					}
				}
			}
		}
	}
}
