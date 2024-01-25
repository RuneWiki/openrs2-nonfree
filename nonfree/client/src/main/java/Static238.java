import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jc", name = "Jb", descriptor = "[I")
	public static final int[] anIntArray362 = new int[64];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIILclient!ac;Lclient!ba;)V")
	public static void method3722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) Class24 arg4) {
		if (arg4 != null) {
			arg3.method74(arg4.M(), arg4.ZA(), arg2, arg1, arg4.DA(), arg4.ha(), arg4.LA(), arg0, arg4.K(), arg4.EA());
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BIZBILclient!en;)Lclient!an;")
	public static Class16_Sub1_Sub1 method3727(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class90_Sub1 arg3) {
		if (arg3.aBoolean159 || Static331.method5078(arg0) && Static331.method5078(arg2)) {
			return new Class16_Sub1_Sub1(arg3, 3553, 6406, arg0, arg2, false, arg1, 6406);
		} else if (arg3.aBoolean167) {
			return new Class16_Sub1_Sub1(arg3, 34037, 6406, arg0, arg2, false, arg1, 6406);
		} else {
			return new Class16_Sub1_Sub1(arg3, 6406, arg0, arg2, Static14.method5936(arg0), Static14.method5936(arg2), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLjava/lang/String;IZ)I")
	public static int method3728(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local48 >= '0' && local48 <= '9') {
				local73 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local73 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local73 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local73 >= arg1) {
				throw new NumberFormatException();
			}
			if (local28) {
				local73 = -local73;
			}
			@Pc(119) int local119 = local73 + arg1 * local37;
			if (local119 / arg1 != local37) {
				throw new NumberFormatException();
			}
			local30 = true;
			local37 = local119;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local37;
	}
}
