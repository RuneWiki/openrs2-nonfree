import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	public static void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(100) Class84 local100 = Static348.aClass84ArrayArrayArray5[arg0][arg2][arg3];
			if (local100 != null) {
				if (arg1 == 1) {
					local100.aShort45 = 0;
				} else if (arg1 == 2) {
					local100.aShort46 = 0;
				}
			}
			Static229.method3716();
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static397.anInt6835; local23++) {
			@Pc(29) Class62 local29 = Static526.aClass62Array3[local23];
			if (arg1 == local29.aByte40 && local29.aShort40 == arg2 && local29.aShort38 == arg3 || local29.aShort41 == arg2 && arg3 == local29.aShort38) {
				if (local23 != Static397.anInt6835) {
					Static650.method2268(Static526.aClass62Array3, local23 + 1, Static526.aClass62Array3, local23, Static526.aClass62Array3.length - local23 - 1);
				}
				Static397.anInt6835--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	public static int method7573(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}
}
