import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString111 = "";

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_150 = new Class123(7, -1);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
	public static boolean method3689(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
	public static String method3697(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg0.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local24++;
				local13 += local17;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local13);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local48.append(arg1);
			local50 = local55 + 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[IZLclient!rr;I[I)Lclient!ue;")
	public static Class53_Sub3 method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class31_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg2.method7080(Static331.aClass204_13, Static199.aClass245_11)) {
			@Pc(73) int[] local73 = new int[arg3 * arg0];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = arg0 * local23 + arg4[local23];
				for (local35 = 0; local35 < arg1[local23]; local35++) {
					local73[local33++] = -16777216;
				}
			}
			return new Class53_Sub3(arg2, arg0, arg3, local73);
		}
		@Pc(21) byte[] local21 = new byte[arg0 * arg3];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = local23 * arg0 + arg4[local23];
			for (local35 = 0; local35 < arg1[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class53_Sub3(arg2, arg0, arg3, local21);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZI)V")
	public static void method3699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) Class333 local25 = Static189.aClass333ArrayArrayArray1[arg2][arg3][arg0];
		if (local25 != null) {
			if (arg1 == 1) {
				local25.aShort118 = 0;
			} else if (arg1 == 2) {
				local25.aShort116 = 0;
			}
		}
		Static70.method1705();
	}
}
