import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!up", name = "J", descriptor = "Lclient!pj;")
	public static Class248 aClass248_103;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "F")
	public static float aFloat185 = 1024.0F;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
	public static void method7254(@OriginalArg(1) byte arg0) {
		if (Static289.aByteArrayArrayArray7 == null) {
			Static289.aByteArrayArrayArray7 = new byte[4][Static18.anInt5706][Static80.anInt1367];
		}
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			for (@Pc(26) int local26 = 0; local26 < Static18.anInt5706; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static80.anInt1367; local30++) {
					Static289.aByteArrayArrayArray7[local22][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZIIII)I")
	public static int method7257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg2 : arg1;
		@Pc(38) int local38 = local12 < 4 ? arg2 : local12 == 12 || local12 == 14 ? arg1 : arg0;
		return ((local12 & 0x2) == 0 ? local38 : -local38) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(B)I")
	public static int method7258() {
		return 16;
	}
}
