import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!ln;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method698(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static296.anInt6002; local11++) {
			if (arg0.equalsIgnoreCase(Static287.aStringArray53[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ol;IIIII)V")
	public static void method699(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6003 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static99.anIntArrayArrayArray2[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class2_Sub36_Sub1 local33 = Static288.aClass2_Sub36_Sub1Array7[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt6003; local35++) {
							if (arg0.aClass2_Sub36_Sub1Array6[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass2_Sub36_Sub1Array6[arg0.anInt6003++] = local33;
						if (arg0.anInt6003 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt6003; local7 < 4; local7++) {
			arg0.aClass2_Sub36_Sub1Array6[local7] = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZB)V")
	public static void method700(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static226.aByteArrayArray12;
			local11 = 1;
		} else {
			local9 = Static229.aByteArrayArray7;
			local11 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			Static166.method3083();
			for (@Pc(33) int local33 = 0; local33 < Static95.anInt6381 >> 3; local33++) {
				for (@Pc(37) int local37 = 0; local37 < Static237.anInt4532 >> 3; local37++) {
					@Pc(47) int local47 = Static136.anIntArrayArrayArray5[local27][local33][local37];
					if (local47 != -1) {
						@Pc(57) int local57 = local47 >> 24 & 0x3;
						if (!arg0 || local57 == 0) {
							@Pc(67) int local67 = local47 >> 1 & 0x3;
							@Pc(73) int local73 = local47 >> 14 & 0x3FF;
							@Pc(79) int local79 = local47 >> 3 & 0x7FF;
							@Pc(89) int local89 = local79 / 8 + (local73 / 8 << 8);
							for (@Pc(91) int local91 = 0; local91 < Static201.anIntArray310.length; local91++) {
								if (local89 == Static201.anIntArray310[local91] && local9[local91] != null) {
									Static166.method3084(Static169.aClass151Array1, local57, Static147.aClass4_2, local9[local91], arg0, (local79 & 0x7) * 8, local67, local33 * 8, (local73 & 0x7) * 8, local27, local37 * 8);
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
