import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!vo;I)Ljava/lang/String;")
	public static String method8242(@OriginalArg(0) int arg0, @OriginalArg(1) Class381 arg1) {
		if (!Static78.method1061(arg1).method5210(arg0) && arg1.anObjectArray28 == null) {
			return null;
		} else if (arg1.aStringArray42 == null || arg0 >= arg1.aStringArray42.length || arg1.aStringArray42[arg0] == null || arg1.aStringArray42[arg0].trim().length() == 0) {
			return Static628.aBoolean728 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray42[arg0];
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method8243(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(22) String local22 = arg0[arg2];
			return local22 == null ? "null" : local22.toString();
		} else {
			@Pc(36) int local36 = arg2 + arg1;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = arg2; local40 < local36; local40++) {
				@Pc(46) String local46 = arg0[local40];
				if (local46 == null) {
					local38 += 4;
				} else {
					local38 += local46.length();
				}
			}
			@Pc(67) StringBuffer local67 = new StringBuffer(local38);
			for (@Pc(77) int local77 = arg2; local77 < local36; local77++) {
				@Pc(85) String local85 = arg0[local77];
				if (local85 == null) {
					local67.append("null");
				} else {
					local67.append(local85);
				}
			}
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZIII)Z")
	public static boolean method8244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static272.aByteArrayArrayArray2[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static272.aByteArrayArrayArray2[arg3][arg1][arg0] & 0x10) == 0) {
			return Static544.method7718(arg1, arg0, arg3) == arg2;
		} else {
			return false;
		}
	}
}
