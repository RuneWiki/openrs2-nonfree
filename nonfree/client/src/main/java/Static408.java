import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_58 = new Class83(32);

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static int anInt7134 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Lclient!mm;")
	public static Class162 method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static294.aClass162ArrayArrayArray2[0][arg1][arg2] != null && Static294.aClass162ArrayArrayArray2[0][arg1][arg2].aClass162_1 != null;
			if (local28 && arg0 >= Static227.anInt4511 - 1) {
				return null;
			}
			Static242.method4029(arg0, arg1, arg2);
		}
		return Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rg;I)Z")
	public static boolean method5691(@OriginalArg(0) Class217 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean460) {
			return false;
		} else if (!arg0.method5087(Static425.anInterface2_2)) {
			return false;
		} else if (Static153.aClass96_20.method2797((long) arg0.anInt6172) == null) {
			return Static138.aClass96_16.method2797((long) arg0.anInt6182) == null;
		} else {
			return false;
		}
	}
}
