import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!wo;")
	public static Class216 aClass216_19;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array8;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_44 = new Class34("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method1470(@OriginalArg(0) String arg0) {
		@Pc(14) long local14 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local14 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local14 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local14 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local14 += local29 + 27 - 48;
			}
			if (local14 >= 177917621779460413L) {
				break;
			}
		}
		while (local14 % 37L == 0L && local14 != 0L) {
			local14 /= 37L;
		}
		return local14;
	}
}
