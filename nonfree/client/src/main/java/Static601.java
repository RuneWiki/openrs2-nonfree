import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
	public static int anInt10190;

	@OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
	public static int anInt10196;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(CIB)C")
	public static char method8313(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "(I)V")
	public static void method8314() {
		@Pc(7) int local7 = Static6.anInt462;
		@Pc(9) int[] local9 = Static551.anIntArray503;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class9_Sub4_Sub2_Sub1_Sub2 local19 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt4311 > 0) {
				local19.anInt4311--;
				if (local19.anInt4311 == 0) {
					local19.aString44 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static288.anInt5977; local48++) {
			@Pc(55) long local55 = (long) Static562.anIntArray508[local48];
			@Pc(61) Class6_Sub42 local61 = (Class6_Sub42) Static461.aClass380_35.method8747(local55);
			if (local61 != null) {
				@Pc(66) Class9_Sub4_Sub2_Sub1_Sub1 local66 = local61.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				if (local66.anInt4311 > 0) {
					local66.anInt4311--;
					if (local66.anInt4311 == 0) {
						local66.aString44 = null;
					}
				}
			}
		}
	}
}
