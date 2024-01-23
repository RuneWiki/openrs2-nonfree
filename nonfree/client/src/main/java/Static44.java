import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "x", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	public static int anInt1141 = 0;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "[I")
	public static int[] anIntArray93 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!co", name = "z", descriptor = "I")
	public static int anInt1147 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BZ)V")
	public static void method841(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static116.aBoolean184 && arg0) {
			local11 = 1;
			local13 = Static223.aByteArrayArray14;
		} else {
			local11 = 4;
			local13 = Static195.aByteArrayArray20;
		}
		for (@Pc(26) int local26 = 0; local26 < local11; local26++) {
			Static220.method3662();
			for (@Pc(33) int local33 = 0; local33 < 13; local33++) {
				for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
					@Pc(51) int local51 = Static50.anIntArrayArrayArray3[local26][local33][local40];
					if (local51 != -1) {
						@Pc(62) int local62 = local51 >> 24 & 0x3;
						if (!arg0 || local62 == 0) {
							@Pc(75) int local75 = local51 >> 1 & 0x3;
							@Pc(81) int local81 = local51 >> 14 & 0x3FF;
							@Pc(87) int local87 = local51 >> 3 & 0x7FF;
							@Pc(97) int local97 = (local81 / 8 << 8) + local87 / 8;
							for (@Pc(99) int local99 = 0; local99 < Static253.anIntArray485.length; local99++) {
								if (Static253.anIntArray485[local99] == local97 && local13[local99] != null) {
									Static223.method3679(local62, (local81 & 0x7) * 8, local75, arg0, local13[local99], local26, (local87 & 0x7) * 8, Static89.aClass154Array1, local33 * 8, local40 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method842(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < Static56.anInt1437; local17++) {
			if (arg0.equalsIgnoreCase(Static20.aStringArray2[local17])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static115.aStringArray46[local17])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public static void method845(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub8_Sub10 local14 = Static92.method1633(8, arg0);
		local14.method2043();
	}
}
