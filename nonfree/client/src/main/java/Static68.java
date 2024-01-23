import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public static int anInt4743;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public static int anInt4744 = 0;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString153 = "red:";

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString154 = "flash3:";

	@OriginalMember(owner = "client!em", name = "m", descriptor = "I")
	public static int anInt4753 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3617(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static22.method3916(arg0);
		if (local7 != -1) {
			@Pc(43) int[] local43 = Static188.aClass1_Sub2_Sub13_2.method2813(Static166.aClass50_2.anIntArray169[local7] >> 14 & 0x3FFF, Static166.aClass50_2.anIntArray169[local7] >> 28 & 0x3, Static166.aClass50_2.anIntArray169[local7] & 0x3FFF);
			Static222.method3551(local43[2], local43[1]);
		}
	}
}
