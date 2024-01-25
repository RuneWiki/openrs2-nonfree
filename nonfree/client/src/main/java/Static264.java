import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public static int anInt4609;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public static int anInt4610;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
	public static void method4081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static238.aClass136_7.method3125(Static190.aClass32_48.method701(Static107.anInt2498));
		@Pc(29) int local29;
		for (@Pc(23) Class2_Sub26 local23 = (Class2_Sub26) Static195.aClass30_28.method694(); local23 != null; local23 = (Class2_Sub26) Static195.aClass30_28.method682()) {
			local29 = Static239.method3868(local23);
			if (local13 < local29) {
				local13 = local29;
			}
		}
		local13 += 8;
		local29 = Static285.anInt4946 * 16 + 21;
		@Pc(61) int local61 = arg0 - local13 / 2;
		if (local13 + local61 > Static253.anInt4467) {
			local61 = Static253.anInt4467 - local13;
		}
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(83) int local83 = arg1;
		if (Static362.anInt6102 < arg1 + local29) {
			local83 = Static362.anInt6102 - local29;
		}
		if (local83 < 0) {
			local83 = 0;
		}
		Static236.anInt2045 = local61;
		Static255.anInt4503 = local83;
		Static320.anInt5473 = (Static284.aBoolean372 ? 26 : 22) + Static285.anInt4946 * 16;
		Static108.anInt5290 = local13;
		Static269.aBoolean349 = true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)S")
	public static short method4082(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 > 64 ? local15 * (127 - local19) >> 7 : local19 * local15 >> 7;
		@Pc(42) int local42 = local19 + local38;
		@Pc(51) int local51;
		if (local42 == 0) {
			local51 = local38 << 1;
		} else {
			local51 = (local38 << 8) / local42;
		}
		return (short) (local42 | local51 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method4083(@OriginalArg(0) int arg0) {
		Static119.anInt2585 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static12.anInt312; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static341.anInt5833; local6++) {
				if (Static64.aClass251ArrayArrayArray1[arg0][local3][local6] == null) {
					Static64.aClass251ArrayArrayArray1[arg0][local3][local6] = new Class251(arg0, local3, local6);
				}
			}
		}
	}
}
