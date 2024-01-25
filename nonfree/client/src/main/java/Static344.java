import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "Lclient!f;")
	public static Class76 aClass76_15;

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
	public static int anInt6088;

	@OriginalMember(owner = "client!rn", name = "S", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array15;

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_153 = new Class81(51, -1);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
	public static boolean method4848(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static237.aBoolean384) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static450.aClass41ArrayArray2[local13] == null || Static450.aClass41ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class41 local35 = Static450.aClass41ArrayArray2[local13][local17];
		@Pc(46) Class2_Sub26 local46;
		if (arg0 == -1 && local35.anInt1642 == 0) {
			for (local46 = (Class2_Sub26) Static288.aClass265_41.method6005(); local46 != null; local46 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
				if (local46.anInt4529 == 46 || local46.anInt4529 == 1007 || local46.anInt4529 == 3 || local46.anInt4529 == 12 || local46.anInt4529 == 58) {
					for (@Pc(128) Class41 local128 = Static160.method2564(local46.anInt4535); local128 != null; local128 = Static6.method150(local128)) {
						if (local35.anInt1613 == local128.anInt1613) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class2_Sub26) Static288.aClass265_41.method6005(); local46 != null; local46 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
				if (local46.anInt4533 == arg0 && local35.anInt1613 == local46.anInt4535 && (local46.anInt4529 == 46 || local46.anInt4529 == 1007 || local46.anInt4529 == 3 || local46.anInt4529 == 12 || local46.anInt4529 == 58)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)I")
	public static int method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static362.anIntArray428[arg1 & 0x3] : 256;
	}
}
