import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_42 = new Class98(74, 0);

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "[I")
	public static final int[] anIntArray298 = new int[13];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
	public static boolean method2940(@OriginalArg(1) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local29 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local44 >= '0' && local44 <= '9') {
				local77 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local77 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local77 = local44 - 'W';
			} else {
				return false;
			}
			if (local77 >= 10) {
				return false;
			}
			if (local29) {
				local77 = -local77;
			}
			@Pc(113) int local113 = local77 + local33 * 10;
			if (local33 != local113 / 10) {
				return false;
			}
			local31 = true;
			local33 = local113;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method2943(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static149.method4032(arg1, local11, arg0);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
