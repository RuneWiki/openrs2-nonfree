import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[Lclient!cl;")
	public static Class42[] aClass42Array2;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZZI)Ljava/lang/String;")
	public static String method2280(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(39) int local39 = arg0 / 10; local39 != 0; local39 /= 10) {
			local35++;
		}
		@Pc(51) char[] local51 = new char[local35];
		local51[0] = '+';
		for (@Pc(59) int local59 = local35 - 1; local59 > 0; local59--) {
			@Pc(63) int local63 = arg0;
			arg0 /= 10;
			@Pc(74) int local74 = local63 - arg0 * 10;
			if (local74 >= 10) {
				local51[local59] = (char) (local74 + 87);
			} else {
				local51[local59] = (char) (local74 + 48);
			}
		}
		return new String(local51);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)I")
	public static int method2282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static12.method105(arg0 - 1, arg1 + -1) + Static12.method105(arg0 + 1, arg1 - 1) + Static12.method105(arg0 + -1, arg1 - -1) + Static12.method105(arg0 + 1, arg1 + 1);
		@Pc(73) int local73 = Static12.method105(arg0 - 1, arg1) + Static12.method105(arg0 + 1, arg1) + Static12.method105(arg0, arg1 - 1) + Static12.method105(arg0, arg1 + 1);
		@Pc(78) int local78 = Static12.method105(arg0, arg1);
		return local43 / 16 + local73 / 8 + local78 / 4;
	}
}
