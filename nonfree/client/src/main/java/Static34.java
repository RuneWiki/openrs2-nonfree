import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "q", descriptor = "Lclient!uia;")
	public static Class354 aClass354_1;

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "Lclient!ag;")
	public static Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "Lclient!jn;")
	public static Class179 aClass179_39;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "Lclient!vja;")
	public static final Class374 aClass374_1 = new Class374();

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "[I")
	public static final int[] anIntArray50 = new int[14];

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZILjava/lang/String;I)I")
	public static int method851(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(68) int local68;
			if (local39 >= '0' && local39 <= '9') {
				local68 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local68 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local68 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local68) {
				throw new NumberFormatException();
			}
			if (local24) {
				local68 = -local68;
			}
			@Pc(119) int local119 = local28 * arg1 + local68;
			if (local28 != local119 / arg1) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local119;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
