import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_4 = new Class269("", 16);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)I")
	public static int method3179() {
		return Static453.method6461(false);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BC)Z")
	public static boolean method3180(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static367.method5475(arg0)) {
			return true;
		} else {
			@Pc(24) char[] local24 = Static254.aCharArray4;
			for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
				@Pc(32) char local32 = local24[local26];
				if (arg0 == local32) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static135.aCharArray3;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(56) char local56 = local48[local50];
				if (local56 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
