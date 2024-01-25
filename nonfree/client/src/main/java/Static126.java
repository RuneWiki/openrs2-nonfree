import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "[I")
	public static int[] anIntArray168;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_20 = new Class181(66, -1);

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_3 = new Class186(13, 0, 1, 0);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "([IZ[I)V")
	public static void method1887(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static85.aByteArrayArrayArray17 = null;
			Static426.anIntArray579 = null;
			Static276.anIntArray719 = null;
			return;
		}
		Static426.anIntArray579 = arg1;
		Static276.anIntArray719 = new int[arg1.length];
		Static85.aByteArrayArrayArray17 = new byte[arg1.length][][];
		for (@Pc(35) int local35 = 0; local35 < Static426.anIntArray579.length; local35++) {
			Static85.aByteArrayArrayArray17[local35] = new byte[arg0[local35]][];
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!aha;I[[B)V")
	public static void method1888(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt347; local7++) {
			Static439.method6528();
			for (@Pc(20) int local20 = 0; local20 < Static111.anInt1752 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static279.anInt4567 >> 3; local24++) {
					@Pc(34) int local34 = Static414.anIntArrayArrayArray10[local7][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean31 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(78) int local78 = (local61 / 8 << 8) + (local67 / 8);
							for (@Pc(80) int local80 = 0; local80 < Static594.anIntArray784.length; local80++) {
								if (local78 == Static594.anIntArray784[local80] && arg1[local80] != null) {
									arg0.method403(Static485.aClass126_17, local44, (local67 & 0x7) * 8, arg1[local80], local20 * 8, Static308.aClass182Array1, local24 * 8, (local61 & 0x7) * 8, local55, local7);
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
