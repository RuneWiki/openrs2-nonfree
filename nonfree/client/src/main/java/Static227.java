import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	public static int anInt4114 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lclient!tj;")
	public static Class239_Sub1 method3224(@OriginalArg(1) int arg0) {
		return Static47.aBoolean98 && Static376.anInt6063 <= arg0 && arg0 <= Static137.anInt2141 ? Static105.aClass239_Sub1Array2[arg0 - Static376.anInt6063] : null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3225(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static316.anInt5221; local11++) {
			if (arg0.equalsIgnoreCase(Static273.aStringArray35[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static332.aStringArray44[local11])) {
				return true;
			}
		}
		return false;
	}
}
