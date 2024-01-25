import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public static int anInt9246;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_38 = new Class305(16);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
	public static boolean method7757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static218.aBoolean366) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static336.aClass93ArrayArray2[local13] == null || Static336.aClass93ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class93 local40 = Static336.aClass93ArrayArray2[local13][local17];
		@Pc(55) Class6_Sub42 local55;
		if (arg1 == -1 && local40.anInt2823 == 0) {
			for (local55 = (Class6_Sub42) Static207.aClass211_29.method5183(); local55 != null; local55 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
				if (local55.anInt8285 == 20 || local55.anInt8285 == 1002 || local55.anInt8285 == 50 || local55.anInt8285 == 2 || local55.anInt8285 == 19) {
					for (@Pc(143) Class93 local143 = Static223.method4011(local55.anInt8284); local143 != null; local143 = Static145.method2679(local143)) {
						if (local143.anInt2790 == local40.anInt2790) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class6_Sub42) Static207.aClass211_29.method5183(); local55 != null; local55 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
				if (arg1 == local55.anInt8288 && local55.anInt8284 == local40.anInt2790 && (local55.anInt8285 == 20 || local55.anInt8285 == 1002 || local55.anInt8285 == 50 || local55.anInt8285 == 2 || local55.anInt8285 == 19)) {
					return true;
				}
			}
		}
		return false;
	}
}
