import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "Z")
	public static boolean aBoolean30;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "Lclient!nq;")
	public static Class144 aClass144_7;

	@OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
	public static int anInt491;

	@OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
	public static int anInt493;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V")
	public static void method388(@OriginalArg(1) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(19) byte[][] local19;
		if (arg0) {
			local17 = 1;
			local19 = Static114.aByteArrayArray18;
		} else {
			local19 = Static311.aByteArrayArray6;
			local17 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			Static168.method2723();
			for (@Pc(33) int local33 = 0; local33 < Static24.anInt454 >> 3; local33++) {
				for (@Pc(37) int local37 = 0; local37 < Static240.anInt4832 >> 3; local37++) {
					@Pc(47) int local47 = Static230.anIntArrayArrayArray12[local27][local33][local37];
					if (local47 != -1) {
						@Pc(57) int local57 = local47 >> 24 & 0x3;
						if (!arg0 || local57 == 0) {
							@Pc(67) int local67 = local47 >> 1 & 0x3;
							@Pc(73) int local73 = local47 >> 14 & 0x3FF;
							@Pc(79) int local79 = local47 >> 3 & 0x7FF;
							@Pc(90) int local90 = (local73 / 8 << 8) + (local79 / 8);
							for (@Pc(92) int local92 = 0; local92 < Static157.anIntArray201.length; local92++) {
								if (local90 == Static157.anIntArray201[local92] && local19[local92] != null) {
									Static270.method4633(Static107.aClass129_4, local19[local92], local57, Static211.aClass92Array1, local27, arg0, (local73 & 0x7) * 8, local33 * 8, (local79 & 0x7) * 8, local67, local37 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
