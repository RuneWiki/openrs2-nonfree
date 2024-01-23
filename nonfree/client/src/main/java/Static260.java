import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!ok;")
	public static Class116 aClass116_17;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "S")
	public static short aShort39 = 256;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4429(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int local14 = arg1.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(24) int local24 = local8;
		@Pc(29) int local29 = local14 - local11;
		if (local29 != 0) {
			@Pc(34) int local34 = 0;
			while (true) {
				local34 = arg2.indexOf(arg0, local34);
				if (local34 < 0) {
					break;
				}
				local34 += local11;
				local24 += local29;
			}
		}
		@Pc(57) StringBuffer local57 = new StringBuffer(local24);
		@Pc(59) int local59 = 0;
		while (true) {
			@Pc(64) int local64 = arg2.indexOf(arg0, local59);
			if (local64 < 0) {
				local57.append(arg2.substring(local59));
				return local57.toString();
			}
			local57.append(arg2.substring(local59, local64));
			local57.append(arg1);
			local59 = local11 + local64;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!sh;IIIIZI)Lclient!ug;")
	public static Class1_Sub2_Sub14 method4431(@OriginalArg(0) Class147 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = (arg3 << 19) + (arg2 << 17) + arg1 + (arg4 ? 65536 : 0);
		@Pc(37) long local37 = (long) local22 * 3849834839L + (long) arg5 * 3147483667L;
		@Pc(43) Class1_Sub2_Sub14 local43 = (Class1_Sub2_Sub14) Static18.aClass155_6.method4358(local37);
		if (local43 != null) {
			return local43;
		}
		Static151.aBoolean177 = false;
		local43 = Static212.method3737(arg5, false, arg2, false, arg1, arg4, arg0, arg3);
		if (local43 != null && !Static151.aBoolean177) {
			Static18.aClass155_6.method4360(local37, local43);
		}
		return local43;
	}
}
