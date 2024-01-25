import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_20 = new Class124();

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!bg;I[[B)V")
	public static void method2009(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt566; local11++) {
			Static491.method7177();
			for (@Pc(17) int local17 = 0; local17 < Static124.anInt2150 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static64.anInt1015 >> 3; local21++) {
					@Pc(31) int local31 = Static301.anIntArrayArrayArray5[local11][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						if (!arg0.aBoolean26 || local41 == 0) {
							@Pc(55) int local55 = local31 >> 1 & 0x3;
							@Pc(61) int local61 = local31 >> 14 & 0x3FF;
							@Pc(67) int local67 = local31 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static249.anIntArray245.length; local79++) {
								if (local77 == Static249.anIntArray245[local79] && arg1[local79] != null) {
									arg0.method537(arg1[local79], local55, local21 * 8, local41, (local61 & 0x7) * 8, (local67 & 0x7) * 8, local11, Static137.aClass234Array1, local17 * 8, Static563.aClass143_13);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)I")
	public static int method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public static void method2014(@OriginalArg(0) int arg0) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(4, (long) arg0);
		local13.method2440();
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
	public static void method2015(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(6, (long) arg0);
		local9.method2440();
	}
}
