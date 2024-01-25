import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kh", name = "Oc", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_58 = new Class96("M", "M", "M", "M");

	@OriginalMember(owner = "client!kh", name = "Pc", descriptor = "Lclient!tn;")
	public static Class229 aClass229_6 = null;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method3152(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static321.anInt5589; local16++) {
			if (arg0.equalsIgnoreCase(Static50.aStringArray7[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static156.aStringArray18[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)I")
	public static int method3153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return local26 + (((arg2 & 0xFF00FF) * local31 & 0xFF00FF00 | (arg2 & 0xFF00) * local31 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(I)V")
	public static void method3160() {
		if (Static145.aClass118_4 != null) {
			Static145.aClass118_4.method3927();
		}
		if (Static10.aClass118_7 != null) {
			Static10.aClass118_7.method3927();
		}
	}
}
