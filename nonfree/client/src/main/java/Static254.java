import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
	public static int anInt7147;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
	public static int anInt7144 = 0;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_121 = new Class349(28, 8);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cea;[[BB)V")
	public static void method5833(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1101; local7++) {
			Static574.method7450();
			for (@Pc(13) int local13 = 0; local13 < Static281.anInt4822 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static29.anInt491 >> 3; local17++) {
					@Pc(27) int local27 = Static55.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean61 || local37 == 0) {
							@Pc(48) int local48 = local27 >> 1 & 0x3;
							@Pc(54) int local54 = local27 >> 14 & 0x3FF;
							@Pc(60) int local60 = local27 >> 3 & 0x7FF;
							@Pc(71) int local71 = (local54 / 8 << 8) + (local60 / 8);
							for (@Pc(73) int local73 = 0; local73 < Static301.anIntArray349.length; local73++) {
								if (Static301.anIntArray349[local73] == local71 && arg1[local73] != null) {
									arg0.method1058(local7, arg1[local73], local13 * 8, local17 * 8, Static87.aClass362Array3, (local54 & 0x7) * 8, (local60 & 0x7) * 8, local37, local48, Static417.aClass162_17);
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
