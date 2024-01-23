import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt1791;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!af;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "F")
	public static float aFloat20 = 0.0F;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt1790 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method1359(@OriginalArg(0) Class132 arg0) {
		Static24.aClass132_8 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
	public static void method1360(@OriginalArg(1) int arg0) {
		@Pc(19) Class8_Sub23 local19 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local19 != null) {
			for (@Pc(25) int local25 = 0; local25 < local19.anIntArray270.length; local25++) {
				local19.anIntArray270[local25] = -1;
				local19.anIntArray268[local25] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lclient!tk;")
	public static Class159 method1361(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static210.aClass159ArrayArray6[local7] == null || Static210.aClass159ArrayArray6[local7][local11] == null) {
			@Pc(35) boolean local35 = Static92.method1483(local7);
			if (!local35) {
				return null;
			}
		}
		return Static210.aClass159ArrayArray6[local7][local11];
	}
}
