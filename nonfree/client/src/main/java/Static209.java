import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public static int anInt3974;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public static int anInt3978;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt3975 = 0;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString223 = "Opened title screen";

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	public static void method3327(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static156.aBoolean211 && arg0) {
			local13 = 1;
			local11 = Static306.aByteArrayArray17;
		} else {
			local11 = Static175.aByteArrayArray8;
			local13 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
			Static115.method2067();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(45) int local45 = 0; local45 < 13; local45++) {
					@Pc(56) int local56 = Static4.anIntArrayArrayArray1[local21][local38][local45];
					if (local56 != -1) {
						@Pc(67) int local67 = local56 >> 24 & 0x3;
						if (!arg0 || local67 == 0) {
							@Pc(79) int local79 = local56 >> 14 & 0x3FF;
							@Pc(85) int local85 = local56 >> 3 & 0x7FF;
							@Pc(95) int local95 = local85 / 8 + (local79 / 8 << 8);
							@Pc(101) int local101 = local56 >> 1 & 0x3;
							for (@Pc(103) int local103 = 0; local103 < Static224.anIntArray348.length; local103++) {
								if (Static224.anIntArray348[local103] == local95 && local11[local103] != null) {
									Static228.method3536(local101, (local85 & 0x7) * 8, (local79 & 0x7) * 8, local21, local11[local103], local38 * 8, local45 * 8, arg0, local67, Static240.aClass118Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
	public static int method3328() {
		return Static21.anInt387;
	}
}
