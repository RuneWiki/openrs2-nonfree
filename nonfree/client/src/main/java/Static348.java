import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	public static int anInt5871;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "Lclient!la;")
	public static final Class136 aClass136_162 = new Class136(16, 5);

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(CII)I")
	public static int method4870(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}
}
