import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Lclient!qj;")
	public static Class165 aClass165_20;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public static int anInt1103 = 0;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
	public static int anInt1107 = 104;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIB)V")
	public static void method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub1_Sub2 local14 = Static42.method1000(5, arg0);
		local14.method168();
		local14.anInt85 = arg1;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
	public static void method1104(@OriginalArg(1) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (arg0) {
			local11 = 1;
			local13 = Static343.aByteArrayArray17;
		} else {
			local13 = Static28.aByteArrayArray2;
			local11 = 4;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static278.method4804();
			for (@Pc(28) int local28 = 0; local28 < anInt1107 >> 3; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static337.anInt6402 >> 3; local32++) {
					@Pc(36) boolean local36 = false;
					@Pc(44) int local44 = Static21.anIntArrayArrayArray1[local21][local28][local32];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg0 || local54 == 0) {
							@Pc(64) int local64 = local44 >> 1 & 0x3;
							@Pc(70) int local70 = local44 >> 14 & 0x3FF;
							@Pc(76) int local76 = local44 >> 3 & 0x7FF;
							@Pc(86) int local86 = local76 / 8 + (local70 / 8 << 8);
							for (@Pc(88) int local88 = 0; local88 < Static80.anIntArray184.length; local88++) {
								if (Static80.anIntArray184[local88] == local86 && local13[local88] != null) {
									@Pc(119) int[] local119 = Static292.method5014(Static34.aClass2_6, local32 * 8, local21, Static24.aClass91Array1, local64, local76, local54, local28 * 8, arg0, local13[local88], local70);
									if (local7 == null && local119 != null) {
										local7 = local119;
									}
									local36 = true;
									break;
								}
							}
						}
					}
					if (!local36) {
						Static43.method2804(local28 * 8, 8, 8, local32 * 8, local21);
					}
				}
			}
		}
		if (local7 == null) {
			Static92.aClass32_1 = null;
		} else {
			Static92.aClass32_1 = Static305.method5153(local7[1], local7[2], local7[3], local7[0]);
			Static311.anInt5991 = local7[4];
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBZI)Ljava/lang/String;")
	public static String method1105(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(53) char[] local53 = new char[local34];
		local53[0] = '+';
		for (@Pc(61) int local61 = local34 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 < 10) {
				local53[local61] = (char) (local76 + 48);
			} else {
				local53[local61] = (char) (local76 + 87);
			}
		}
		return new String(local53);
	}
}
