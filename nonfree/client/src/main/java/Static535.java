import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	public static int anInt6091 = 1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIIZ)Ljava/lang/String;")
	public static String method5172(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(44) int local44 = 2;
		@Pc(48) int local48 = arg0 / 10;
		while (local48 != 0) {
			local48 /= 10;
			local44++;
		}
		@Pc(63) char[] local63 = new char[local44];
		local63[0] = '+';
		for (@Pc(71) int local71 = local44 - 1; local71 > 0; local71--) {
			@Pc(75) int local75 = arg0;
			arg0 /= 10;
			@Pc(86) int local86 = local75 - arg0 * 10;
			if (local86 < 10) {
				local63[local71] = (char) (local86 + 48);
			} else {
				local63[local71] = (char) (local86 + 87);
			}
		}
		return new String(local63);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I[[BLclient!m;)V")
	public static void method5173(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class193_Sub1 arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.anInt4861; local15++) {
			Static11.method182();
			for (@Pc(21) int local21 = 0; local21 < Static301.anInt4912 >> 3; local21++) {
				for (@Pc(25) int local25 = 0; local25 < Static473.anInt7969 >> 3; local25++) {
					@Pc(35) int local35 = Static127.anIntArrayArrayArray9[local15][local21][local25];
					if (local35 != -1) {
						@Pc(45) int local45 = local35 >> 24 & 0x3;
						if (!arg1.aBoolean293 || local45 == 0) {
							@Pc(56) int local56 = local35 >> 1 & 0x3;
							@Pc(62) int local62 = local35 >> 14 & 0x3FF;
							@Pc(68) int local68 = local35 >> 3 & 0x7FF;
							@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
							for (@Pc(80) int local80 = 0; local80 < Static35.anIntArray45.length; local80++) {
								if (local78 == Static35.anIntArray45[local80] && arg0[local80] != null) {
									arg1.method4190(local56, local45, local25 * 8, (local68 & 0x7) * 8, (local62 & 0x7) * 8, local21 * 8, local15, arg0[local80], Static176.aClass121_5, Static296.aClass295Array3);
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
