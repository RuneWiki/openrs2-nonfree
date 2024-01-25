import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[Lclient!nl;")
	public static Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_6;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZ)I")
	public static int method1474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class2_Sub43 local8 = Static95.method1915(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray671.length) {
			return local8.anIntArray671[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!sa;[[BI)V")
	public static void method1476(@OriginalArg(0) Class309_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt8255; local11++) {
			Static113.method2018();
			for (@Pc(17) int local17 = 0; local17 < Static456.anInt7428 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static5.anInt112 >> 3; local21++) {
					@Pc(31) int local31 = Static584.anIntArrayArrayArray18[local11][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean603 || local41 == 0) {
							@Pc(55) int local55 = local31 >> 1 & 0x3;
							@Pc(61) int local61 = local31 >> 14 & 0x3FF;
							@Pc(67) int local67 = local31 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static635.anIntArray728.length; local79++) {
								if (local77 == Static635.anIntArray728[local79] && arg1[local79] != null) {
									arg0.method7108(Static141.aClass13_27, local55, local41, local21 * 8, local17 * 8, local11, Static520.aClass175Array1, (local61 & 0x7) * 8, (local67 & 0x7) * 8, arg1[local79]);
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
