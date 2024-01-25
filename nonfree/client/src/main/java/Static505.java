import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_134 = new Class397(88, 0);

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
	public static final int anInt8052 = 1;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method6886(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(48) int local48 = 2;
			for (@Pc(52) int local52 = arg1 / 10; local52 != 0; local52 /= 10) {
				local48++;
			}
			@Pc(69) char[] local69 = new char[local48];
			local69[0] = '+';
			for (@Pc(77) int local77 = local48 - 1; local77 > 0; local77--) {
				@Pc(83) int local83 = arg1;
				arg1 /= 10;
				@Pc(94) int local94 = local83 - arg1 * 10;
				if (local94 >= 10) {
					local69[local77] = (char) (local94 + 87);
				} else {
					local69[local77] = (char) (local94 + 48);
				}
			}
			return new String(local69);
		} else {
			return Integer.toString(arg1, 10);
		}
	}
}
