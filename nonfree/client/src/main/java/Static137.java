import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 aClass1_Sub5_Sub6_Sub1_1;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "J")
	public static long aLong96 = 0L;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)V")
	public static void method2364(@OriginalArg(0) boolean arg0) {
		@Pc(15) byte local15;
		@Pc(17) byte[][] local17;
		if (Static71.aBoolean165 && arg0) {
			local15 = 1;
			local17 = Static295.aByteArrayArray21;
		} else {
			local15 = 4;
			local17 = Static120.aByteArrayArray8;
		}
		@Pc(25) int[] local25 = null;
		for (@Pc(27) int local27 = 0; local27 < local15; local27++) {
			Static246.method3875();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(50) boolean local50 = false;
					@Pc(58) int local58 = Static291.anIntArrayArrayArray14[local27][local38][local43];
					if (local58 != -1) {
						@Pc(69) int local69 = local58 >> 24 & 0x3;
						if (!arg0 || local69 == 0) {
							@Pc(82) int local82 = local58 >> 3 & 0x7FF;
							@Pc(88) int local88 = local58 >> 1 & 0x3;
							@Pc(94) int local94 = local58 >> 14 & 0x3FF;
							@Pc(105) int local105 = (local94 / 8 << 8) + (local82 / 8);
							for (@Pc(107) int local107 = 0; local107 < Static135.anIntArray209.length; local107++) {
								if (local105 == Static135.anIntArray209[local107] && local17[local107] != null) {
									local50 = true;
									@Pc(143) int[] local143 = Static118.method2133(local82, local69, local94, local43 * 8, Static122.aClass60Array1, local17[local107], local38 * 8, local88, local27, arg0);
									if (local25 == null && local143 != null) {
										local25 = local143;
									}
									break;
								}
							}
						}
					}
					if (!local50) {
						Static64.method1132(local38 * 8, 8, 8, local43 * 8, local27);
					}
				}
			}
		}
		if (local25 == null) {
			Static57.anInt1224 = -1;
			return;
		}
		Static57.anInt1224 = local25[0];
		Static296.anInt828 = local25[3];
		Static44.anInt1030 = local25[4];
		Static310.anInt5533 = local25[2];
		Static277.anInt5091 = local25[1];
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method2365(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub18 local10 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local10 != null) {
			local10.method4573();
		}
	}
}
