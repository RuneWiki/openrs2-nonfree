import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "[I")
	public static final int[] anIntArray446 = new int[14];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
	public static void method4712(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static224.aByteArrayArray18;
			local9 = 1;
		} else {
			local9 = 4;
			local11 = Static115.aByteArrayArray13;
		}
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static319.method5250();
			for (@Pc(25) int local25 = 0; local25 < Static350.anInt6637 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static105.anInt2647 >> 3; local29++) {
					@Pc(39) int local39 = Static345.anIntArrayArrayArray41[local19][local25][local29];
					if (local39 != -1) {
						@Pc(48) int local48 = local39 >> 24 & 0x3;
						if (!arg0 || local48 == 0) {
							@Pc(61) int local61 = local39 >> 1 & 0x3;
							@Pc(67) int local67 = local39 >> 14 & 0x3FF;
							@Pc(73) int local73 = local39 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static155.anIntArray297.length; local85++) {
								if (local83 == Static155.anIntArray297[local85] && local11[local85] != null) {
									Static139.method2925(local48, local29 * 8, (local67 & 0x7) * 8, Static16.aClass170Array1, local19, local25 * 8, local11[local85], Static274.aClass47_9, (local73 & 0x7) * 8, arg0, local61);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4715(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, local14 + arg1.length())) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(local14 + arg0.length());
		}
		return arg2;
	}
}
